package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class g0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.g0 f218063b = new com.tencent.wechat.mm.biz.g0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.mm.biz.ZIDL_sfAZC2EoHK f218064a;

    public g0() {
        com.tencent.wechat.mm.biz.ZIDL_sfAZC2EoHK zIDL_sfAZC2EoHK = new com.tencent.wechat.mm.biz.ZIDL_sfAZC2EoHK();
        this.f218064a = zIDL_sfAZC2EoHK;
        this.zidlCreateName = "biz.AffBizNativeToCppManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_sfAZC2EoHK.ZIDL_sfAZC2EoHC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void A() {
        this.f218064a.ZIDL_AC(this.nativeHandler);
    }

    public void B(java.lang.String str, java.lang.String str2, com.tencent.wechat.mm.biz.h hVar) {
        this.f218064a.ZIDL_YBV(this.nativeHandler, hVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void C(java.lang.String str, com.tencent.wechat.mm.biz.x xVar) {
        this.f218064a.ZIDL_UV(this.nativeHandler, xVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void D(com.tencent.wechat.mm.biz.y yVar) {
        this.f218064a.ZIDL_AV(this.nativeHandler, yVar);
    }

    public void E(int i17, java.lang.String str, com.tencent.wechat.mm.biz.z zVar) {
        this.f218064a.ZIDL_VBV(this.nativeHandler, zVar, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void F(com.tencent.wechat.mm.biz.a0 a0Var) {
        this.f218064a.ZIDL_DV(this.nativeHandler, a0Var);
    }

    public void G() {
        this.f218064a.ZIDL_RB(this.nativeHandler);
    }

    public void H(int i17, com.tencent.wechat.mm.biz.b0 b0Var) {
        this.f218064a.ZIDL_WBV(this.nativeHandler, b0Var, i17);
    }

    public void I() {
        this.f218064a.ZIDL_DC(this.nativeHandler);
    }

    public void J(int i17, dw5.q qVar, com.tencent.wechat.mm.biz.i iVar) {
        this.f218064a.ZIDL_XBV(this.nativeHandler, iVar, i17, qVar.toByteArrayOrNull());
    }

    public void K(int i17, com.tencent.wechat.mm.biz.c0 c0Var) {
        this.f218064a.ZIDL_ZV(this.nativeHandler, c0Var, i17);
    }

    public void L(int i17, com.tencent.wechat.mm.biz.d0 d0Var) {
        this.f218064a.ZIDL_XV(this.nativeHandler, d0Var, i17);
    }

    public void M(boolean z17, com.tencent.wechat.mm.biz.e0 e0Var) {
        this.f218064a.ZIDL_OV(this.nativeHandler, e0Var, z17);
    }

    public void N(int i17, com.tencent.wechat.mm.biz.f0 f0Var) {
        this.f218064a.ZIDL_YV(this.nativeHandler, f0Var, i17);
    }

    public void a(java.lang.String str, com.tencent.wechat.mm.biz.j jVar) {
        this.f218064a.ZIDL_BV(this.nativeHandler, jVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void b(java.lang.String str, long j17, com.tencent.wechat.mm.biz.k kVar) {
        this.f218064a.ZIDL_WV(this.nativeHandler, kVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void c(java.lang.String str, com.tencent.wechat.mm.biz.l lVar) {
        this.f218064a.ZIDL_SV(this.nativeHandler, lVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void d(com.tencent.wechat.mm.biz.m mVar) {
        this.f218064a.ZIDL_CV(this.nativeHandler, mVar);
    }

    public dw5.c e() {
        return (dw5.c) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(dw5.c.f244314g, this.f218064a.ZIDL_KB(this.nativeHandler));
    }

    public java.lang.String f() {
        return new java.lang.String(this.f218064a.ZIDL_DB(this.nativeHandler), java.nio.charset.StandardCharsets.UTF_8);
    }

    public com.tencent.wechat.mm.biz.n3 g() {
        return (com.tencent.wechat.mm.biz.n3) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.n3.f218375i, this.f218064a.ZIDL_UB(this.nativeHandler));
    }

    public long h() {
        return this.f218064a.ZIDL_EC(this.nativeHandler);
    }

    public com.tencent.wechat.mm.biz.f1 i() {
        return (com.tencent.wechat.mm.biz.f1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.f1.N, this.f218064a.ZIDL_LB(this.nativeHandler));
    }

    public com.tencent.wechat.mm.biz.f1 j(long j17) {
        return (com.tencent.wechat.mm.biz.f1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.f1.N, this.f218064a.ZIDL_PB(this.nativeHandler, j17));
    }

    public boolean k() {
        return this.f218064a.ZIDL_OB(this.nativeHandler);
    }

    public dw5.h l() {
        return (dw5.h) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(dw5.h.f244360i, this.f218064a.ZIDL_CC(this.nativeHandler));
    }

    public com.tencent.wechat.mm.biz.g1 m(int i17) {
        return (com.tencent.wechat.mm.biz.g1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.g1.f218065i, this.f218064a.ZIDL_E(this.nativeHandler, i17));
    }

    public int n() {
        return this.f218064a.ZIDL_EB(this.nativeHandler);
    }

    public void o(int i17) {
        this.f218064a.ZIDL_BB(this.nativeHandler, i17);
    }

    public void p(java.lang.String str, java.lang.String str2, int i17, dw5.a aVar, com.tencent.wechat.mm.biz.n nVar) {
        this.f218064a.ZIDL_FV(this.nativeHandler, nVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, aVar.toByteArrayOrNull());
    }

    public void q(com.tencent.wechat.mm.biz.f1 f1Var, com.tencent.wechat.mm.biz.o oVar) {
        this.f218064a.ZIDL_PV(this.nativeHandler, oVar, f1Var.toByteArrayOrNull());
    }

    public void r(com.tencent.wechat.mm.biz.p pVar) {
        this.f218064a.ZIDL_IV(this.nativeHandler, pVar);
    }

    public void s(com.tencent.wechat.mm.biz.q qVar) {
        this.f218064a.ZIDL_HV(this.nativeHandler, qVar);
    }

    public void t(int i17, long j17, com.tencent.wechat.mm.biz.r rVar) {
        this.f218064a.ZIDL_MV(this.nativeHandler, rVar, i17, j17);
    }

    public void u(com.tencent.wechat.mm.biz.s sVar) {
        this.f218064a.ZIDL_NV(this.nativeHandler, sVar);
    }

    public void v(dw5.f fVar, com.tencent.wechat.mm.biz.t tVar) {
        this.f218064a.ZIDL_KV(this.nativeHandler, tVar, fVar.f244356d);
    }

    public void w(dw5.f fVar, com.tencent.wechat.mm.biz.u uVar) {
        this.f218064a.ZIDL_JV(this.nativeHandler, uVar, fVar.f244356d);
    }

    public void x(byte[] bArr, com.tencent.wechat.mm.biz.g gVar) {
        this.f218064a.ZIDL_ZBV(this.nativeHandler, gVar, bArr);
    }

    public void y(boolean z17, com.tencent.wechat.mm.biz.v vVar) {
        this.f218064a.ZIDL_TBV(this.nativeHandler, vVar, z17);
    }

    public void z(com.tencent.wechat.mm.biz.w wVar) {
        this.f218064a.ZIDL_LV(this.nativeHandler, wVar);
    }
}
