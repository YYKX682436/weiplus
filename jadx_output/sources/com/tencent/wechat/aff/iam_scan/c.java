package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class c extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.c f216974b = new com.tencent.wechat.aff.iam_scan.c();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_l42KL3gzK f216975a;

    public c() {
        com.tencent.wechat.aff.iam_scan.ZIDL_l42KL3gzK zIDL_l42KL3gzK = new com.tencent.wechat.aff.iam_scan.ZIDL_l42KL3gzK();
        this.f216975a = zIDL_l42KL3gzK;
        this.zidlCreateName = "scan.AffQBarExtraManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_l42KL3gzK.ZIDL_l42KL3gzC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public com.tencent.wechat.aff.iam_scan.u a(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.wechat.aff.iam_scan.u) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.u.f217135g, this.f216975a.ZIDL_H(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i19, byteBuffer));
    }

    public com.tencent.wechat.aff.iam_scan.u b(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, boolean z17, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, java.nio.ByteBuffer byteBuffer4, java.nio.ByteBuffer byteBuffer5, java.nio.ByteBuffer byteBuffer6, com.tencent.wechat.aff.iam_scan.f fVar, java.nio.ByteBuffer byteBuffer7) {
        return (com.tencent.wechat.aff.iam_scan.u) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.u.f217135g, this.f216975a.ZIDL_I(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i19, i27, z17, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, fVar.toByteArrayOrNull(), byteBuffer7));
    }

    public int c(int i17, int i18, int i19, boolean z17) {
        return this.f216975a.ZIDL_A(this.nativeHandler, i17, i18, i19, z17);
    }

    public int d(java.nio.ByteBuffer byteBuffer) {
        return this.f216975a.ZIDL_C(this.nativeHandler, byteBuffer);
    }

    public int e() {
        return this.f216975a.ZIDL_B(this.nativeHandler);
    }

    public int[] f(java.nio.ByteBuffer byteBuffer, com.tencent.wechat.aff.iam_scan.t tVar) {
        return this.f216975a.ZIDL_G(this.nativeHandler, byteBuffer, tVar.toByteArrayOrNull());
    }

    public int g(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18, int i19, int i27, int i28, int i29) {
        return this.f216975a.ZIDL_E(this.nativeHandler, byteBuffer, byteBuffer2, i17, i18, i19, i27, i28, i29);
    }

    public int h(int[] iArr, int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        return this.f216975a.ZIDL_D(this.nativeHandler, iArr, i17, i18, byteBuffer);
    }

    public int i(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18) {
        return this.f216975a.ZIDL_F(this.nativeHandler, byteBuffer, byteBuffer2, i17, i18);
    }
}
