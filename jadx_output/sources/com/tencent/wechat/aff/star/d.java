package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
public class d extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.star.d f217506b = new com.tencent.wechat.aff.star.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.star.ZIDL_xmiCPWJ3K f217507a;

    public d() {
        com.tencent.wechat.aff.star.ZIDL_xmiCPWJ3K zIDL_xmiCPWJ3K = new com.tencent.wechat.aff.star.ZIDL_xmiCPWJ3K();
        this.f217507a = zIDL_xmiCPWJ3K;
        this.zidlCreateName = "star.AffStarDataManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_star", "aff_biz");
        zIDL_xmiCPWJ3K.ZIDL_xmiCPWJ3C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str, int i17, com.tencent.wechat.aff.star.a aVar) {
        this.f217507a.ZIDL_DV(this.nativeHandler, aVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    public void b(long j17, com.tencent.wechat.aff.star.b bVar) {
        this.f217507a.ZIDL_FV(this.nativeHandler, bVar, j17);
    }

    public bw5.a40 c(java.lang.String str, int i17) {
        return (bw5.a40) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.a40.f25007h, this.f217507a.ZIDL_E(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17));
    }

    public boolean d() {
        return this.f217507a.ZIDL_G(this.nativeHandler);
    }

    public boolean e(java.lang.String str) {
        return this.f217507a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void f(bw5.a40 a40Var, com.tencent.wechat.aff.star.c cVar) {
        this.f217507a.ZIDL_BV(this.nativeHandler, cVar, a40Var.toByteArrayOrNull());
    }
}
