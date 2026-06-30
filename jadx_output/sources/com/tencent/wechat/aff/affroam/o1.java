package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class o1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8K f215938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8KE f215939b;

    public o1() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8K zIDL_esFfH6f8K = new com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8K();
        this.f215938a = zIDL_esFfH6f8K;
        com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8KE zIDL_esFfH6f8KE = new com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8KE();
        this.f215939b = zIDL_esFfH6f8KE;
        this.zidlCreateName = "affroam.RoamDeviceManager@Create";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfH6f8K.ZIDL_esFfH6f8C(this, zIDL_esFfH6f8KE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(com.tencent.wechat.aff.affroam.j1 j1Var) {
        this.f215938a.ZIDL_DV(this.nativeHandler, j1Var);
    }

    public void b(com.tencent.wechat.aff.affroam.m1 m1Var) {
        this.f215938a.ZIDL_EV(this.nativeHandler, m1Var);
    }

    public void c(com.tencent.wechat.aff.affroam.n1 n1Var) {
        this.f215938a.ZIDL_HV(this.nativeHandler, n1Var);
    }

    public int d(java.lang.String str) {
        return this.f215938a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void e(java.lang.String str, com.tencent.wechat.aff.affroam.k1 k1Var) {
        this.f215939b.f215732a.put(str, k1Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.affroam.l1 l1Var = new com.tencent.wechat.aff.affroam.l1(this, this.nativeHandler);
        l1Var.f215897c = this.nativeHandler;
        l1Var.f215895a = this.zidlIdentity;
        l1Var.f215896b = this.zidlSvrIdentity;
    }
}
