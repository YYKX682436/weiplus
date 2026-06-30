package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class v0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.v0 f177287b = new com.tencent.mm.plugin.voipmp.platform.v0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voipmp.platform.ZIDL_r9_sVJknK f177288a;

    public v0() {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_r9_sVJknK zIDL_r9_sVJknK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_r9_sVJknK();
        this.f177288a = zIDL_r9_sVJknK;
        this.zidlCreateName = "voipmp.VoipmpCoreSdkService@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_r9_sVJknK.ZIDL_r9_sVJknC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public int A(java.nio.ByteBuffer byteBuffer, int i17) {
        return this.f177288a.ZIDL_PC(this.nativeHandler, byteBuffer, i17);
    }

    public int B(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27) {
        return this.f177288a.ZIDL_SC(this.nativeHandler, byteBuffer, i17, i18, i19, i27);
    }

    public int C(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, int i28) {
        return this.f177288a.ZIDL_TC(this.nativeHandler, byteBuffer, i17, i18, i19, i27, i28);
    }

    public int D(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        return this.f177288a.ZIDL_MC(this.nativeHandler, i17, byteBuffer, i18);
    }

    public void E(int i17, com.tencent.mm.plugin.voipmp.platform.t0 t0Var) {
        this.f177288a.ZIDL_DEV(this.nativeHandler, t0Var, i17);
    }

    public void F() {
        this.f177288a.ZIDL_E(this.nativeHandler);
    }

    public void G(long j17, er4.w wVar, boolean z17, com.tencent.mm.plugin.voipmp.platform.u0 u0Var) {
        this.f177288a.ZIDL_GCV(this.nativeHandler, u0Var, j17, wVar.toByteArrayOrNull(), z17);
    }

    public void H(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.voipmp.platform.f fVar) {
        this.f177288a.ZIDL_D(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), fVar.f177252d);
    }

    public void a(com.tencent.mm.plugin.voipmp.platform.v vVar, java.lang.String str, com.tencent.mm.plugin.voipmp.platform.y yVar) {
        this.f177288a.ZIDL_BV(this.nativeHandler, yVar, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(vVar), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void b(com.tencent.mm.plugin.voipmp.platform.x0 x0Var, java.lang.String str, com.tencent.mm.plugin.voipmp.platform.z zVar) {
        this.f177288a.ZIDL_AV(this.nativeHandler, zVar, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(x0Var), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void c(int i17, long j17, com.tencent.mm.plugin.voipmp.platform.a0 a0Var) {
        this.f177288a.ZIDL_EBV(this.nativeHandler, a0Var, i17, j17);
    }

    public void d(boolean z17, boolean z18, com.tencent.mm.plugin.voipmp.platform.b0 b0Var) {
        this.f177288a.ZIDL_IBV(this.nativeHandler, b0Var, z17, z18);
    }

    public void e(java.util.ArrayList arrayList, com.tencent.mm.plugin.voipmp.platform.c0 c0Var) {
        this.f177288a.ZIDL_LBV(this.nativeHandler, c0Var, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    public void f(boolean z17, com.tencent.mm.plugin.voipmp.platform.d0 d0Var) {
        this.f177288a.ZIDL_HBV(this.nativeHandler, d0Var, z17);
    }

    public void g(java.lang.String str, java.util.ArrayList arrayList, boolean z17, java.lang.String str2, long j17, boolean z18, com.tencent.mm.plugin.voipmp.platform.e0 e0Var) {
        this.f177288a.ZIDL_BCV(this.nativeHandler, e0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), z17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17, z18);
    }

    public int h(java.nio.ByteBuffer byteBuffer, int i17) {
        return this.f177288a.ZIDL_QC(this.nativeHandler, byteBuffer, i17);
    }

    public void i() {
        this.f177288a.ZIDL_LC(this.nativeHandler);
    }

    public void j(er4.x xVar, com.tencent.mm.plugin.voipmp.platform.f0 f0Var) {
        this.f177288a.ZIDL_NV(this.nativeHandler, f0Var, xVar.toByteArrayOrNull());
    }

    public void k() {
        this.f177288a.ZIDL_C(this.nativeHandler);
    }

    public boolean l() {
        return this.f177288a.ZIDL_TD(this.nativeHandler);
    }

    public boolean m() {
        return this.f177288a.ZIDL_UD(this.nativeHandler);
    }

    public void n(java.lang.String str, com.tencent.mm.plugin.voipmp.platform.g0 g0Var) {
        this.f177288a.ZIDL_BDV(this.nativeHandler, g0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void o(com.tencent.mm.plugin.voipmp.platform.h0 h0Var) {
        this.f177288a.ZIDL_UBV(this.nativeHandler, h0Var);
    }

    public void p(com.tencent.mm.plugin.voipmp.platform.i0 i0Var) {
        this.f177288a.ZIDL_TBV(this.nativeHandler, i0Var);
    }

    public void q(boolean z17, boolean z18, com.tencent.mm.plugin.voipmp.platform.j0 j0Var) {
        this.f177288a.ZIDL_QBV(this.nativeHandler, j0Var, z17, z18);
    }

    public void r(er4.c cVar, com.tencent.mm.plugin.voipmp.platform.k0 k0Var) {
        this.f177288a.ZIDL_WBV(this.nativeHandler, k0Var, cVar.toByteArrayOrNull());
    }

    public void s(er4.c cVar, com.tencent.mm.plugin.voipmp.platform.l0 l0Var) {
        this.f177288a.ZIDL_XBV(this.nativeHandler, l0Var, cVar.toByteArrayOrNull());
    }

    public void t(er4.c cVar, com.tencent.mm.plugin.voipmp.platform.m0 m0Var) {
        this.f177288a.ZIDL_VBV(this.nativeHandler, m0Var, cVar.toByteArrayOrNull());
    }

    public void u(er4.y yVar, byte[] bArr, com.tencent.mm.plugin.voipmp.platform.n0 n0Var) {
        this.f177288a.ZIDL_OCV(this.nativeHandler, n0Var, yVar.f256211d, bArr);
    }

    public void v(com.tencent.mm.plugin.voipmp.platform.o0 o0Var) {
        this.f177288a.ZIDL_ICV(this.nativeHandler, o0Var);
    }

    public void w(boolean z17, com.tencent.mm.plugin.voipmp.platform.p0 p0Var) {
        this.f177288a.ZIDL_OBV(this.nativeHandler, p0Var, z17);
    }

    public void x(boolean z17, com.tencent.mm.plugin.voipmp.platform.q0 q0Var) {
        this.f177288a.ZIDL_JCV(this.nativeHandler, q0Var, z17);
    }

    public void y(er4.v vVar, com.tencent.mm.plugin.voipmp.platform.r0 r0Var) {
        this.f177288a.ZIDL_HCV(this.nativeHandler, r0Var, vVar.f256185d);
    }

    public void z(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, er4.b bVar, com.tencent.mm.plugin.voipmp.platform.s0 s0Var) {
        this.f177288a.ZIDL_CCV(this.nativeHandler, s0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17, str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), bVar.f256058d);
    }
}
