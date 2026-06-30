package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class l0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.l0 f217758c = new com.tencent.wechat.iam.biz.l0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_idvlmtlKK f217759a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_idvlmtlKKE f217760b;

    public l0() {
        com.tencent.wechat.iam.biz.ZIDL_idvlmtlKK zIDL_idvlmtlKK = new com.tencent.wechat.iam.biz.ZIDL_idvlmtlKK();
        this.f217759a = zIDL_idvlmtlKK;
        com.tencent.wechat.iam.biz.ZIDL_idvlmtlKKE zIDL_idvlmtlKKE = new com.tencent.wechat.iam.biz.ZIDL_idvlmtlKKE();
        this.f217760b = zIDL_idvlmtlKKE;
        this.zidlCreateName = "biz.IamBizInteractiveNativeToCppManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_idvlmtlKK.ZIDL_idvlmtlKC(this, zIDL_idvlmtlKKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str, int i17, com.tencent.wechat.iam.biz.x xVar) {
        this.f217759a.ZIDL_MV(this.nativeHandler, xVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    public void b(java.util.Optional optional, int i17, java.util.Optional optional2, com.tencent.wechat.iam.biz.y yVar) {
        this.f217759a.ZIDL_FV(this.nativeHandler, yVar, com.tencent.wechat.zidl2.ZidlUtil.bytesJavaToJniOptional(optional), i17, com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJavaToJniOptional(optional2));
    }

    public void c(java.lang.String str, int i17, java.lang.String str2, com.tencent.wechat.iam.biz.z zVar) {
        this.f217759a.ZIDL_AV(this.nativeHandler, zVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void d(java.util.Optional optional, java.util.Optional optional2, com.tencent.wechat.iam.biz.a0 a0Var) {
        this.f217759a.ZIDL_EV(this.nativeHandler, a0Var, com.tencent.wechat.zidl2.ZidlUtil.bytesJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJavaToJniOptional(optional2));
    }

    public void e(boolean z17, boolean z18, com.tencent.wechat.iam.biz.b0 b0Var) {
        this.f217759a.ZIDL_HV(this.nativeHandler, b0Var, z17, z18);
    }

    public void f(com.tencent.wechat.iam.biz.j0 j0Var) {
        this.f217759a.ZIDL_PV(this.nativeHandler, j0Var);
    }

    public void g(com.tencent.wechat.iam.biz.k0 k0Var) {
        this.f217759a.ZIDL_OV(this.nativeHandler, k0Var);
    }

    public void h(java.lang.String str, com.tencent.wechat.iam.biz.c0 c0Var) {
        this.f217759a.ZIDL_LV(this.nativeHandler, c0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void i(java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.wechat.iam.biz.h0 h0Var) {
        this.f217759a.ZIDL_NV(this.nativeHandler, h0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void j(java.lang.String str, com.tencent.wechat.iam.biz.d0 d0Var) {
        this.f217760b.f217732d.put(str, d0Var);
    }

    public void k(java.lang.String str, com.tencent.wechat.iam.biz.e0 e0Var) {
        this.f217760b.f217729a.put(str, e0Var);
    }

    public void l(java.lang.String str, com.tencent.wechat.iam.biz.f0 f0Var) {
        this.f217760b.f217731c.put(str, f0Var);
    }

    public void m(java.lang.String str, com.tencent.wechat.iam.biz.g0 g0Var) {
        this.f217760b.f217730b.put(str, g0Var);
    }

    public void n(com.tencent.wechat.iam.biz.i0 i0Var) {
        this.f217759a.ZIDL_JV(this.nativeHandler, i0Var);
    }

    public void o(java.lang.String str) {
        this.f217760b.f217732d.remove(str);
    }
}
