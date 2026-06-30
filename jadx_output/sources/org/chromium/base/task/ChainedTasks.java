package org.chromium.base.task;

/* loaded from: classes13.dex */
public class ChainedTasks {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private volatile boolean mCanceled;
    private boolean mFinalized;
    private final java.util.LinkedList<android.util.Pair<java.lang.Integer, java.lang.Runnable>> mTasks = new java.util.LinkedList<>();
    private int mIterationIdForTesting = org.chromium.base.task.PostTask.sTestIterationForTesting;
    private final java.lang.Runnable mRunAndPost = new java.lang.Runnable() { // from class: org.chromium.base.task.ChainedTasks.1
        @Override // java.lang.Runnable
        public void run() {
            if (org.chromium.base.task.ChainedTasks.this.mIterationIdForTesting != org.chromium.base.task.PostTask.sTestIterationForTesting) {
                org.chromium.base.task.ChainedTasks.this.cancel();
            }
            if (org.chromium.base.task.ChainedTasks.this.mCanceled) {
                return;
            }
            android.util.Pair pair = (android.util.Pair) org.chromium.base.task.ChainedTasks.this.mTasks.pop();
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("ChainedTask.run: ".concat(((java.lang.Runnable) pair.second).getClass().getName()));
            try {
                ((java.lang.Runnable) pair.second).run();
                if (scoped != null) {
                    scoped.close();
                }
                if (org.chromium.base.task.ChainedTasks.this.mTasks.isEmpty()) {
                    return;
                }
                org.chromium.base.task.PostTask.postTask(((java.lang.Integer) ((android.util.Pair) org.chromium.base.task.ChainedTasks.this.mTasks.peek()).first).intValue(), this);
            } catch (java.lang.Throwable th6) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        java.util.Iterator<android.util.Pair<java.lang.Integer, java.lang.Runnable>> it = this.mTasks.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next().second).run();
            if (this.mCanceled) {
                return;
            }
        }
    }

    public void add(int i17, java.lang.Runnable runnable) {
        synchronized (this.mTasks) {
            this.mTasks.add(new android.util.Pair<>(java.lang.Integer.valueOf(i17), runnable));
        }
    }

    public void cancel() {
        synchronized (this.mTasks) {
            this.mFinalized = true;
            this.mCanceled = true;
        }
    }

    public void start(boolean z17) {
        synchronized (this.mTasks) {
            this.mFinalized = true;
        }
        if (this.mTasks.isEmpty()) {
            return;
        }
        if (z17) {
            org.chromium.base.task.PostTask.runOrPostTask(((java.lang.Integer) this.mTasks.peek().first).intValue(), new java.lang.Runnable() { // from class: org.chromium.base.task.ChainedTasks$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.base.task.ChainedTasks.this.lambda$start$0();
                }
            });
        } else {
            org.chromium.base.task.PostTask.postTask(((java.lang.Integer) this.mTasks.peek().first).intValue(), this.mRunAndPost);
        }
    }
}
