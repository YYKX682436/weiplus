package org.tensorflow.lite.flex;

/* loaded from: classes11.dex */
public class FlexDelegate implements org.tensorflow.lite.b, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public long f347879d = nativeCreateDelegate();

    private static native long nativeCreateDelegate();

    private static native void nativeDeleteDelegate(long j17);

    private static native long nativeInitTensorFlow();

    @Override // org.tensorflow.lite.b
    public long a() {
        return this.f347879d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j17 = this.f347879d;
        if (j17 != 0) {
            nativeDeleteDelegate(j17);
            this.f347879d = 0L;
        }
    }
}
