package com.tencent.wechat.aff.brand_service;

/* loaded from: classes11.dex */
public class a extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.brand_service.a f216045b = new com.tencent.wechat.aff.brand_service.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.brand_service.ZIDL_BN8fvwIZK f216046a;

    public a() {
        com.tencent.wechat.aff.brand_service.ZIDL_BN8fvwIZK zIDL_BN8fvwIZK = new com.tencent.wechat.aff.brand_service.ZIDL_BN8fvwIZK();
        this.f216046a = zIDL_BN8fvwIZK;
        this.zidlCreateName = "brand_service.BrandEcsReportMgr@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_brand_service", "aff_biz");
        zIDL_BN8fvwIZK.ZIDL_BN8fvwIZC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f216046a.ZIDL_E(this.nativeHandler);
    }

    public java.lang.String b() {
        return new java.lang.String(this.f216046a.ZIDL_F(this.nativeHandler), java.nio.charset.StandardCharsets.UTF_8);
    }

    public void c(com.tencent.wechat.mm.brand_service.n1 n1Var, int i17) {
        this.f216046a.ZIDL_B(this.nativeHandler, n1Var.f219094d, i17);
    }

    public void d(com.tencent.wechat.mm.brand_service.n1 n1Var, int i17, java.lang.String str) {
        this.f216046a.ZIDL_C(this.nativeHandler, n1Var.f219094d, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void e(com.tencent.wechat.mm.brand_service.n1 n1Var, int i17, java.lang.String str, com.tencent.wechat.mm.brand_service.o1 o1Var) {
        this.f216046a.ZIDL_D(this.nativeHandler, n1Var.f219094d, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), o1Var.f219119d);
    }

    public void f(com.tencent.wechat.mm.brand_service.y yVar) {
        this.f216046a.ZIDL_A(this.nativeHandler, yVar.toByteArrayOrNull());
    }

    public void g(java.lang.String str) {
        this.f216046a.ZIDL_G(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
