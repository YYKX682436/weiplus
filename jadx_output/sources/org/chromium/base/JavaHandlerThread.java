package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class JavaHandlerThread {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final android.os.HandlerThread mThread;
    private java.lang.Throwable mUnhandledException;

    /* loaded from: classes13.dex */
    public interface Natives {
        void initializeThread(long j17, long j18);

        void onLooperStopped(long j17);
    }

    public JavaHandlerThread(java.lang.String str, int i17) {
        this.mThread = new android.os.HandlerThread(str, i17);
    }

    private static org.chromium.base.JavaHandlerThread create(java.lang.String str, int i17) {
        return new org.chromium.base.JavaHandlerThread(str, i17);
    }

    private java.lang.Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }

    private boolean hasStarted() {
        return this.mThread.getState() != java.lang.Thread.State.NEW;
    }

    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    private void joinThread() {
        boolean z17 = false;
        while (!z17) {
            try {
                this.mThread.join();
                z17 = true;
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: org.chromium.base.JavaHandlerThread.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
                org.chromium.base.JavaHandlerThread.this.mUnhandledException = th6;
            }
        });
    }

    private void quitThreadSafely(final long j17) {
        new android.os.Handler(this.mThread.getLooper()).post(new java.lang.Runnable() { // from class: org.chromium.base.JavaHandlerThread.2
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.base.JavaHandlerThread.this.mThread.quit();
                org.chromium.base.JavaHandlerThreadJni.get().onLooperStopped(j17);
            }
        });
        this.mThread.getLooper().quitSafely();
    }

    private void startAndInitialize(final long j17, final long j18) {
        maybeStart();
        new android.os.Handler(this.mThread.getLooper()).post(new java.lang.Runnable() { // from class: org.chromium.base.JavaHandlerThread.1
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.base.JavaHandlerThreadJni.get().initializeThread(j17, j18);
            }
        });
    }

    public android.os.Looper getLooper() {
        return this.mThread.getLooper();
    }

    public void maybeStart() {
        if (hasStarted()) {
            return;
        }
        this.mThread.start();
    }
}
