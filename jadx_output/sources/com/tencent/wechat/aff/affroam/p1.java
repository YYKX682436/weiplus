package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class p1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.p1 f215952b = new com.tencent.wechat.aff.affroam.p1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfzitsK f215953a;

    public p1() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfzitsK zIDL_esFfzitsK = new com.tencent.wechat.aff.affroam.ZIDL_esFfzitsK();
        this.f215953a = zIDL_esFfzitsK;
        com.tencent.wechat.aff.affroam.ZIDL_esFfzitsKE zIDL_esFfzitsKE = new com.tencent.wechat.aff.affroam.ZIDL_esFfzitsKE();
        this.zidlCreateName = "affroam.RoamManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfzitsK.ZIDL_esFfzitsC(this, zIDL_esFfzitsKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(boolean z17) {
        this.f215953a.ZIDL_H(this.nativeHandler, z17);
    }

    public void b(boolean z17) {
        this.f215953a.ZIDL_G(this.nativeHandler, z17);
    }

    public java.util.ArrayList c() {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.m0.f215901r, this.f215953a.ZIDL_N(this.nativeHandler));
    }

    public boolean d(long j17, java.util.ArrayList arrayList) {
        return this.f215953a.ZIDL_V(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    public com.tencent.wechat.aff.affroam.n e(long j17) {
        return (com.tencent.wechat.aff.affroam.n) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.n.f215913f, this.f215953a.ZIDL_P(this.nativeHandler, j17));
    }

    public com.tencent.wechat.aff.affroam.t f() {
        return (com.tencent.wechat.aff.affroam.t) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.t.f215985e, this.f215953a.ZIDL_U(this.nativeHandler));
    }

    public com.tencent.wechat.aff.affroam.i0 g(long j17) {
        return (com.tencent.wechat.aff.affroam.i0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.i0.f215842y, this.f215953a.ZIDL_O(this.nativeHandler, j17));
    }

    public com.tencent.wechat.aff.affroam.l0 h(long j17) {
        return (com.tencent.wechat.aff.affroam.l0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.l0.f215886o, this.f215953a.ZIDL_Q(this.nativeHandler, j17));
    }

    public int i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        return this.f215953a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17);
    }

    public void j(com.tencent.wechat.aff.affroam.c0 c0Var) {
        this.f215953a.ZIDL_E(this.nativeHandler, c0Var.toByteArrayOrNull());
    }

    public void k() {
        this.f215953a.ZIDL_D(this.nativeHandler);
    }

    public void l(long j17, long j18) {
        this.f215953a.ZIDL_S(this.nativeHandler, j17, j18);
    }

    public void m(long j17, long j18) {
        this.f215953a.ZIDL_R(this.nativeHandler, j17, j18);
    }

    public void n(com.tencent.wechat.aff.affroam.k0 k0Var) {
        this.f215953a.ZIDL_X(this.nativeHandler, k0Var.f215883d);
    }
}
