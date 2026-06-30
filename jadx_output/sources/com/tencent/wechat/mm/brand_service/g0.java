package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class g0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.g0 f218913c = new com.tencent.wechat.mm.brand_service.g0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwK f218914a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwKE f218915b;

    public g0() {
        com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwK zIDL_q1bTCHfwK = new com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwK();
        this.f218914a = zIDL_q1bTCHfwK;
        com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwKE zIDL_q1bTCHfwKE = new com.tencent.wechat.mm.brand_service.ZIDL_q1bTCHfwKE();
        this.f218915b = zIDL_q1bTCHfwKE;
        this.zidlCreateName = "brand_service.BrandServiceNotiManagerBridge@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_brand_service", "aff_biz");
        zIDL_q1bTCHfwK.ZIDL_q1bTCHfwC(this, zIDL_q1bTCHfwKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public boolean a(long j17) {
        return this.f218914a.ZIDL_M(this.nativeHandler, j17);
    }

    public com.tencent.wechat.mm.brand_service.j b(long j17) {
        return (com.tencent.wechat.mm.brand_service.j) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.j.K, this.f218914a.ZIDL_E(this.nativeHandler, j17));
    }

    public com.tencent.wechat.mm.brand_service.k c(long j17, int i17) {
        return (com.tencent.wechat.mm.brand_service.k) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.k.f218997h, this.f218914a.ZIDL_B(this.nativeHandler, j17, i17));
    }

    public long d() {
        return this.f218914a.ZIDL_F(this.nativeHandler);
    }

    public long e() {
        return this.f218914a.ZIDL_G(this.nativeHandler);
    }

    public void f(com.tencent.wechat.mm.brand_service.j jVar, com.tencent.wechat.mm.brand_service.c0 c0Var) {
        this.f218914a.ZIDL_AV(this.nativeHandler, c0Var, jVar.toByteArrayOrNull());
    }

    public void g(long j17, com.tencent.wechat.mm.brand_service.f0 f0Var) {
        this.f218914a.ZIDL_IV(this.nativeHandler, f0Var, j17);
    }

    public void h(java.lang.String str, com.tencent.wechat.mm.brand_service.a0 a0Var) {
        this.f218915b.f218847d.put(str, a0Var);
    }

    public void i(java.lang.String str, com.tencent.wechat.mm.brand_service.b0 b0Var) {
        this.f218915b.f218846c.put(str, b0Var);
    }

    public void j(java.lang.String str, com.tencent.wechat.mm.brand_service.d0 d0Var) {
        this.f218915b.f218845b.put(str, d0Var);
    }

    public void k(java.lang.String str, com.tencent.wechat.mm.brand_service.e0 e0Var) {
        this.f218915b.f218844a.put(str, e0Var);
    }
}
