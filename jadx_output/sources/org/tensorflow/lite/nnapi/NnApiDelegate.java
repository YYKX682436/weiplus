package org.tensorflow.lite.nnapi;

/* loaded from: classes11.dex */
public class NnApiDelegate implements org.tensorflow.lite.b, java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f347880d;

    private static native long createDelegate(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, boolean z17, boolean z18, boolean z19);

    private static native void deleteDelegate(long j17);

    private static native int getNnapiErrno(long j17);

    @Override // org.tensorflow.lite.b
    public long a() {
        return this.f347880d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j17 = this.f347880d;
        if (j17 != 0) {
            deleteDelegate(j17);
            this.f347880d = 0L;
        }
    }
}
