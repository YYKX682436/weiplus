package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
public class c0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.c0 f219335b = new com.tencent.wechat.mm.finder_box.c0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.mm.finder_box.ZIDL_jdzPdFvpK f219336a;

    public c0() {
        com.tencent.wechat.mm.finder_box.ZIDL_jdzPdFvpK zIDL_jdzPdFvpK = new com.tencent.wechat.mm.finder_box.ZIDL_jdzPdFvpK();
        this.f219336a = zIDL_jdzPdFvpK;
        this.zidlCreateName = "finder_box.BoxAffBizNativeToCppManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_finder_box", "aff_biz");
        zIDL_jdzPdFvpK.ZIDL_jdzPdFvpC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void A() {
        this.f219336a.ZIDL_EC(this.nativeHandler);
    }

    public void B(int i17, cw5.g gVar, com.tencent.wechat.mm.finder_box.h hVar) {
        this.f219336a.ZIDL_YBV(this.nativeHandler, hVar, i17, gVar.toByteArrayOrNull());
    }

    public void C(boolean z17, com.tencent.wechat.mm.finder_box.z zVar) {
        this.f219336a.ZIDL_PV(this.nativeHandler, zVar, z17);
    }

    public void D(int i17, com.tencent.wechat.mm.finder_box.a0 a0Var) {
        this.f219336a.ZIDL_ZV(this.nativeHandler, a0Var, i17);
    }

    public void E(byte[] bArr, com.tencent.wechat.mm.finder_box.b0 b0Var) {
        this.f219336a.ZIDL_GV(this.nativeHandler, b0Var, bArr);
    }

    public void a(java.lang.String str, com.tencent.wechat.mm.finder_box.i iVar) {
        this.f219336a.ZIDL_BV(this.nativeHandler, iVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void b(java.lang.String str, long j17, com.tencent.wechat.mm.finder_box.j jVar) {
        this.f219336a.ZIDL_XV(this.nativeHandler, jVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void c(java.lang.String str, com.tencent.wechat.mm.finder_box.k kVar) {
        this.f219336a.ZIDL_TV(this.nativeHandler, kVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void d(com.tencent.wechat.mm.finder_box.l lVar) {
        this.f219336a.ZIDL_CV(this.nativeHandler, lVar);
    }

    public cw5.c e() {
        return (cw5.c) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(cw5.c.f224331g, this.f219336a.ZIDL_LB(this.nativeHandler));
    }

    public com.tencent.wechat.mm.finder_box.p2 f() {
        return (com.tencent.wechat.mm.finder_box.p2) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.p2.f219731i, this.f219336a.ZIDL_VB(this.nativeHandler));
    }

    public com.tencent.wechat.mm.finder_box.x0 g() {
        return (com.tencent.wechat.mm.finder_box.x0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.x0.N, this.f219336a.ZIDL_MB(this.nativeHandler));
    }

    public com.tencent.wechat.mm.finder_box.x0 h(long j17) {
        return (com.tencent.wechat.mm.finder_box.x0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.x0.N, this.f219336a.ZIDL_QB(this.nativeHandler, j17));
    }

    public cw5.e i() {
        return (cw5.e) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(cw5.e.f224347i, this.f219336a.ZIDL_DC(this.nativeHandler));
    }

    public com.tencent.wechat.mm.finder_box.y0 j(int i17) {
        return (com.tencent.wechat.mm.finder_box.y0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.y0.f219976i, this.f219336a.ZIDL_E(this.nativeHandler, i17));
    }

    public int k() {
        return this.f219336a.ZIDL_FB(this.nativeHandler);
    }

    public boolean l() {
        return this.f219336a.ZIDL_H(this.nativeHandler);
    }

    public void m(java.lang.String str, java.lang.String str2, int i17, cw5.a aVar, com.tencent.wechat.mm.finder_box.m mVar) {
        this.f219336a.ZIDL_FV(this.nativeHandler, mVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, aVar.toByteArrayOrNull());
    }

    public void n(com.tencent.wechat.mm.finder_box.x0 x0Var, com.tencent.wechat.mm.finder_box.n nVar) {
        this.f219336a.ZIDL_QV(this.nativeHandler, nVar, x0Var.toByteArrayOrNull());
    }

    public void o(com.tencent.wechat.mm.finder_box.o oVar) {
        this.f219336a.ZIDL_JV(this.nativeHandler, oVar);
    }

    public void p(com.tencent.wechat.mm.finder_box.p pVar) {
        this.f219336a.ZIDL_IV(this.nativeHandler, pVar);
    }

    public void q(int i17, long j17, com.tencent.wechat.mm.finder_box.q qVar) {
        this.f219336a.ZIDL_NV(this.nativeHandler, qVar, i17, j17);
    }

    public void r(com.tencent.wechat.mm.finder_box.r rVar) {
        this.f219336a.ZIDL_OV(this.nativeHandler, rVar);
    }

    public void s(cw5.d dVar, com.tencent.wechat.mm.finder_box.s sVar) {
        this.f219336a.ZIDL_LV(this.nativeHandler, sVar, dVar.f224346d);
    }

    public void t(cw5.d dVar, com.tencent.wechat.mm.finder_box.t tVar) {
        this.f219336a.ZIDL_KV(this.nativeHandler, tVar, dVar.f224346d);
    }

    public void u(byte[] bArr, com.tencent.wechat.mm.finder_box.g gVar) {
        this.f219336a.ZIDL_ACV(this.nativeHandler, gVar, bArr);
    }

    public void v(boolean z17, com.tencent.wechat.mm.finder_box.u uVar) {
        this.f219336a.ZIDL_UBV(this.nativeHandler, uVar, z17);
    }

    public void w(com.tencent.wechat.mm.finder_box.v vVar) {
        this.f219336a.ZIDL_MV(this.nativeHandler, vVar);
    }

    public void x(java.lang.String str, com.tencent.wechat.mm.finder_box.w wVar) {
        this.f219336a.ZIDL_VV(this.nativeHandler, wVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void y(com.tencent.wechat.mm.finder_box.x xVar) {
        this.f219336a.ZIDL_AV(this.nativeHandler, xVar);
    }

    public void z(com.tencent.wechat.mm.finder_box.y yVar) {
        this.f219336a.ZIDL_DV(this.nativeHandler, yVar);
    }
}
