package com.tencent.qqmusicplayerprocess.audio.playermanager;

/* loaded from: classes15.dex */
public class EKeyDecryptor {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f215255c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f215256a;

    /* renamed from: b, reason: collision with root package name */
    public long f215257b;

    public EKeyDecryptor(java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.f215256a = obj;
        this.f215257b = 0L;
        synchronized (obj) {
            long createInstWidthEKey = createInstWidthEKey(str);
            this.f215257b = createInstWidthEKey;
            int i17 = (createInstWidthEKey > 0L ? 1 : (createInstWidthEKey == 0L ? 0 : -1));
        }
    }

    private native long createInstWidthEKey(java.lang.String str);

    private native void destroyInst(long j17);

    private native void streamDecrypt(long j17, long j18, byte[] bArr, int i17);

    private native void streamEncrypt(long j17, long j18, byte[] bArr, int i17);

    public void a() {
        synchronized (this.f215256a) {
            long j17 = this.f215257b;
            if (j17 != 0) {
                destroyInst(j17);
                this.f215257b = 0L;
            }
        }
    }

    public boolean b(long j17, byte[] bArr, int i17) {
        synchronized (this.f215256a) {
            long j18 = this.f215257b;
            if (j18 == 0) {
                return false;
            }
            streamDecrypt(j18, j17, bArr, i17);
            return true;
        }
    }
}
