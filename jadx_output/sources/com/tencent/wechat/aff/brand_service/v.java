package com.tencent.wechat.aff.brand_service;

/* loaded from: classes11.dex */
public class v extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.aff.brand_service.v f216049c = new com.tencent.wechat.aff.brand_service.v();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjK f216050a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjKE f216051b;

    public v() {
        com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjK zIDL_eRuvB8TjK = new com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjK();
        this.f216050a = zIDL_eRuvB8TjK;
        com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjKE zIDL_eRuvB8TjKE = new com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjKE();
        this.f216051b = zIDL_eRuvB8TjKE;
        this.zidlCreateName = "brand_service.BrandServiceManagerBridge@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_brand_service", "aff_biz");
        zIDL_eRuvB8TjK.ZIDL_eRuvB8TjC(this, zIDL_eRuvB8TjKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f216050a.ZIDL_Y(this.nativeHandler);
    }

    public void b(com.tencent.wechat.aff.brand_service.b bVar) {
        this.f216050a.ZIDL_EV(this.nativeHandler, bVar);
    }

    public void c(java.lang.String str, long j17, com.tencent.wechat.aff.brand_service.c cVar) {
        this.f216050a.ZIDL_PV(this.nativeHandler, cVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void d(java.lang.String str, com.tencent.wechat.aff.brand_service.d dVar) {
        this.f216050a.ZIDL_OV(this.nativeHandler, dVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void e(com.tencent.wechat.aff.brand_service.e eVar) {
        this.f216050a.ZIDL_PBV(this.nativeHandler, eVar);
    }

    public void f(long j17, int i17, com.tencent.wechat.aff.brand_service.f fVar) {
        this.f216050a.ZIDL_CV(this.nativeHandler, fVar, j17, i17);
    }

    public void g(java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.mm.brand_service.f fVar, com.tencent.wechat.aff.brand_service.g gVar) {
        this.f216050a.ZIDL_FV(this.nativeHandler, gVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, fVar.toByteArrayOrNull());
    }

    public void h(com.tencent.wechat.mm.brand_service.j jVar, com.tencent.wechat.aff.brand_service.h hVar) {
        this.f216050a.ZIDL_MV(this.nativeHandler, hVar, jVar.toByteArrayOrNull());
    }

    public boolean i() {
        return this.f216050a.ZIDL_B(this.nativeHandler);
    }

    public void j(long j17, com.tencent.wechat.aff.brand_service.i iVar) {
        this.f216050a.ZIDL_RBV(this.nativeHandler, iVar, j17);
    }

    public void k(com.tencent.wechat.aff.brand_service.j jVar) {
        this.f216050a.ZIDL_IV(this.nativeHandler, jVar);
    }

    public void l(int i17, long j17, com.tencent.wechat.aff.brand_service.k kVar) {
        this.f216050a.ZIDL_JV(this.nativeHandler, kVar, i17, j17);
    }

    public void m(com.tencent.wechat.aff.brand_service.l lVar) {
        this.f216050a.ZIDL_KV(this.nativeHandler, lVar);
    }

    public void n(com.tencent.wechat.aff.brand_service.m mVar) {
        this.f216050a.ZIDL_UBV(this.nativeHandler, mVar);
    }

    public void o() {
        this.f216050a.ZIDL_KB(this.nativeHandler);
    }

    public void p(java.lang.String str, java.lang.String str2, com.tencent.wechat.aff.brand_service.n nVar) {
        this.f216050a.ZIDL_GBV(this.nativeHandler, nVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void q(long j17, com.tencent.wechat.aff.brand_service.o oVar) {
        this.f216050a.ZIDL_QBV(this.nativeHandler, oVar, j17);
    }

    public void r(com.tencent.wechat.aff.brand_service.q qVar) {
        this.f216050a.ZIDL_TV(this.nativeHandler, qVar);
    }

    public void s(int i17, int i18, java.util.ArrayList arrayList, com.tencent.wechat.mm.brand_service.l1 l1Var, com.tencent.wechat.aff.brand_service.r rVar) {
        this.f216050a.ZIDL_UV(this.nativeHandler, rVar, i17, i18, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), l1Var.toByteArrayOrNull());
    }

    public void t() {
        this.f216050a.ZIDL_MB(this.nativeHandler);
    }

    public void u(boolean z17, com.tencent.wechat.aff.brand_service.s sVar) {
        this.f216050a.ZIDL_LV(this.nativeHandler, sVar, z17);
    }

    public void v(java.lang.String str, com.tencent.wechat.aff.brand_service.p pVar) {
        this.f216051b.f216036a.put(str, pVar);
    }

    public void w(com.tencent.wechat.mm.brand_service.f fVar, com.tencent.wechat.aff.brand_service.t tVar) {
        this.f216050a.ZIDL_GV(this.nativeHandler, tVar, fVar.toByteArrayOrNull());
    }

    public void x(long j17, long j18, com.tencent.wechat.aff.brand_service.u uVar) {
        this.f216050a.ZIDL_DV(this.nativeHandler, uVar, j17, j18);
    }
}
