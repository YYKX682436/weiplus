package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class h1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoK f217749a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoKE f217750b;

    public h1(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoK zIDL_XqmGHCCoK = new com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoK();
        this.f217749a = zIDL_XqmGHCCoK;
        com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoKE zIDL_XqmGHCCoKE = new com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoKE();
        this.f217750b = zIDL_XqmGHCCoKE;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_XqmGHCCoK.ZIDL_XqmGHCCoC(this, zIDL_XqmGHCCoKE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(com.tencent.wechat.iam.biz.c1 c1Var) {
        this.f217749a.ZIDL_NV(this.nativeHandler, c1Var);
    }

    public void b(com.tencent.wechat.mm.biz.m4 m4Var, com.tencent.wechat.iam.biz.d1 d1Var) {
        this.f217749a.ZIDL_CV(this.nativeHandler, d1Var, m4Var.f218354d);
    }

    public void c(com.tencent.wechat.mm.biz.m4 m4Var, com.tencent.wechat.iam.biz.e1 e1Var) {
        this.f217749a.ZIDL_QV(this.nativeHandler, e1Var, m4Var.f218354d);
    }

    public void d(com.tencent.wechat.iam.biz.f1 f1Var) {
        this.f217749a.ZIDL_SV(this.nativeHandler, f1Var);
    }

    public void e() {
        this.f217749a.ZIDL_M(this.nativeHandler);
    }

    public void f(com.tencent.wechat.mm.biz.m4 m4Var, boolean z17) {
        this.f217749a.ZIDL_R(this.nativeHandler, m4Var.f218354d, z17);
    }

    public void g(java.lang.String str, com.tencent.wechat.iam.biz.b1 b1Var) {
        this.f217750b.f217724a.put(str, b1Var);
    }

    public void h(java.lang.String str, com.tencent.wechat.iam.biz.g1 g1Var) {
        this.f217750b.f217725b.put(str, g1Var);
    }

    public void i(java.lang.String str) {
        this.f217750b.f217724a.remove(str);
    }

    public void j(java.lang.String str) {
        this.f217750b.f217725b.remove(str);
    }

    public void k(int i17) {
        this.f217749a.ZIDL_L(this.nativeHandler, i17);
    }

    public void l(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        this.f217749a.ZIDL_J(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17);
    }

    public void m(java.lang.String str, boolean z17) {
        this.f217749a.ZIDL_K(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17);
    }

    public void n(boolean z17) {
        this.f217749a.ZIDL_I(this.nativeHandler, z17);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.biz.a1 a1Var = new com.tencent.wechat.iam.biz.a1(this, this.nativeHandler);
        a1Var.f217741c = this.nativeHandler;
        a1Var.f217739a = this.zidlIdentity;
        a1Var.f217740b = this.zidlSvrIdentity;
    }
}
