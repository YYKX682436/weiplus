package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
class NativeRunnable implements java.lang.Runnable {
    private boolean mHasRun;
    private final long mNativePeer;

    private NativeRunnable(long j17) {
        this.mNativePeer = j17;
    }

    public static com.tencent.skyline.jni.NativeRunnable Create(long j17) {
        return new com.tencent.skyline.jni.NativeRunnable(j17);
    }

    private native void releaseNative(long j17);

    private native void runNative(long j17);

    public void finalize() {
        super.finalize();
        if (this.mHasRun) {
            return;
        }
        releaseNative(this.mNativePeer);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.mHasRun) {
            return;
        }
        runNative(this.mNativePeer);
        releaseNative(this.mNativePeer);
        this.mHasRun = true;
    }
}
