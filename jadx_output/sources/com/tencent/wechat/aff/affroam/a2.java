package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class a2 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzK f215781a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzKE f215782b;

    public a2() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzK zIDL_esFfkZCzK = new com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzK();
        this.f215781a = zIDL_esFfkZCzK;
        com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzKE zIDL_esFfkZCzKE = new com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzKE();
        this.f215782b = zIDL_esFfkZCzKE;
        this.zidlCreateName = "affroam.RoamTask@Create";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfkZCzK.ZIDL_esFfkZCzC(this, zIDL_esFfkZCzKE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public com.tencent.wechat.aff.affroam.m0 a() {
        return (com.tencent.wechat.aff.affroam.m0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.m0.f215901r, this.f215781a.ZIDL_H(this.nativeHandler));
    }

    public float b() {
        return this.f215781a.ZIDL_I(this.nativeHandler);
    }

    public com.tencent.wechat.aff.affroam.p0 c() {
        return (com.tencent.wechat.aff.affroam.p0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.p0.f215945m, this.f215781a.ZIDL_R(this.nativeHandler));
    }

    public int d(com.tencent.wechat.aff.affroam.m0 m0Var) {
        return this.f215781a.ZIDL_B(this.nativeHandler, m0Var.toByteArrayOrNull());
    }

    public void e(com.tencent.wechat.aff.affroam.v1 v1Var) {
        this.f215781a.ZIDL_FV(this.nativeHandler, v1Var);
    }

    public void f(com.tencent.wechat.aff.affroam.w1 w1Var) {
        this.f215781a.ZIDL_DV(this.nativeHandler, w1Var);
    }

    public void g(com.tencent.wechat.aff.affroam.y1 y1Var) {
        this.f215781a.ZIDL_GV(this.nativeHandler, y1Var);
    }

    public void h(java.lang.String str, com.tencent.wechat.aff.affroam.r1 r1Var) {
        this.f215782b.f215751d.put(str, r1Var);
    }

    public void i(java.lang.String str, com.tencent.wechat.aff.affroam.t1 t1Var) {
        this.f215782b.f215754g.put(str, t1Var);
    }

    public void j(java.lang.String str, com.tencent.wechat.aff.affroam.u1 u1Var) {
        this.f215782b.f215748a.put(str, u1Var);
    }

    public void k(java.lang.String str, com.tencent.wechat.aff.affroam.x1 x1Var) {
        this.f215782b.f215749b.put(str, x1Var);
    }

    public void l(java.lang.String str, com.tencent.wechat.aff.affroam.z1 z1Var) {
        this.f215782b.f215753f.put(str, z1Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.affroam.s1 s1Var = new com.tencent.wechat.aff.affroam.s1(this, this.nativeHandler);
        s1Var.f215984c = this.nativeHandler;
        s1Var.f215982a = this.zidlIdentity;
        s1Var.f215983b = this.zidlSvrIdentity;
    }
}
