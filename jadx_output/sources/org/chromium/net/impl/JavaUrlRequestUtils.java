package org.chromium.net.impl;

/* loaded from: classes6.dex */
public final class JavaUrlRequestUtils {

    /* loaded from: classes6.dex */
    public interface CheckedRunnable {
        void run();
    }

    /* loaded from: classes16.dex */
    public static final class DirectPreventingExecutor implements java.util.concurrent.Executor {
        private final java.util.concurrent.Executor mDelegate;

        /* loaded from: classes16.dex */
        public static final class InlineCheckingRunnable implements java.lang.Runnable {
            private java.lang.Thread mCallingThread;
            private final java.lang.Runnable mCommand;
            private org.chromium.net.InlineExecutionProhibitedException mExecutedInline;

            @Override // java.lang.Runnable
            public void run() {
                if (java.lang.Thread.currentThread() == this.mCallingThread) {
                    this.mExecutedInline = new org.chromium.net.InlineExecutionProhibitedException();
                } else {
                    this.mCommand.run();
                }
            }

            private InlineCheckingRunnable(java.lang.Runnable runnable, java.lang.Thread thread) {
                this.mCommand = runnable;
                this.mCallingThread = thread;
            }
        }

        public DirectPreventingExecutor(java.util.concurrent.Executor executor) {
            this.mDelegate = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            org.chromium.net.impl.JavaUrlRequestUtils.DirectPreventingExecutor.InlineCheckingRunnable inlineCheckingRunnable = new org.chromium.net.impl.JavaUrlRequestUtils.DirectPreventingExecutor.InlineCheckingRunnable(runnable, java.lang.Thread.currentThread());
            this.mDelegate.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.mExecutedInline != null) {
                throw inlineCheckingRunnable.mExecutedInline;
            }
            inlineCheckingRunnable.mCallingThread = null;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface State {
        public static final int AWAITING_FOLLOW_REDIRECT = 3;
        public static final int AWAITING_READ = 4;
        public static final int CANCELLED = 8;
        public static final int COMPLETE = 7;
        public static final int ERROR = 6;
        public static final int NOT_STARTED = 0;
        public static final int READING = 5;
        public static final int REDIRECT_RECEIVED = 2;
        public static final int STARTED = 1;
    }
}
