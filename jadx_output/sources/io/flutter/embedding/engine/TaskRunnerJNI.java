package io.flutter.embedding.engine;

/* loaded from: classes7.dex */
public class TaskRunnerJNI {
    private static final java.lang.String TAG = "TaskRunnerJNI";
    private long jniAddress = 0;

    public TaskRunnerJNI() {
        init();
    }

    private native void nativeDestroy(long j17);

    private native long nativeGetTaskRunnerAddress(long j17);

    private native long nativeInit();

    private native void nativePost(long j17, java.lang.Runnable runnable);

    private native void nativePostDelay(long j17, java.lang.Runnable runnable, long j18);

    private native void nativeRunNowOrPost(long j17, java.lang.Runnable runnable);

    private native boolean nativeRunOnCurrentThread(long j17);

    public static void run(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void destroy() {
        nativeDestroy(this.jniAddress);
        this.jniAddress = 0L;
    }

    public long getAddress() {
        return this.jniAddress;
    }

    public long getTaskRunnerAddress() {
        long j17 = this.jniAddress;
        if (j17 == 0) {
            return 0L;
        }
        return nativeGetTaskRunnerAddress(j17);
    }

    public void init() {
        this.jniAddress = nativeInit();
    }

    public void post(java.lang.Runnable runnable) {
        nativePost(this.jniAddress, runnable);
    }

    public void postDelay(java.lang.Runnable runnable, long j17) {
        nativePostDelay(this.jniAddress, runnable, j17);
    }

    public void runNowOrPost(java.lang.Runnable runnable) {
        nativeRunNowOrPost(this.jniAddress, runnable);
    }

    public boolean runOnCurrentThread() {
        return nativeRunOnCurrentThread(this.jniAddress);
    }
}
