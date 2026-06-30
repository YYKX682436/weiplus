package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class h1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfd8OmK f215840a;

    public h1() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfd8OmK zIDL_esFfd8OmK = new com.tencent.wechat.aff.affroam.ZIDL_esFfd8OmK();
        this.f215840a = zIDL_esFfd8OmK;
        this.zidlCreateName = "affroam.RoamBackupper@Create";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfd8OmK.ZIDL_esFfd8OmC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(java.util.ArrayList arrayList, boolean z17, com.tencent.wechat.aff.affroam.d1 d1Var) {
        this.f215840a.ZIDL_GV(this.nativeHandler, d1Var, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), z17);
    }

    public void b(long j17, long j18, com.tencent.wechat.aff.affroam.f1 f1Var) {
        this.f215840a.ZIDL_FV(this.nativeHandler, f1Var, j17, j18);
    }

    public long c(java.lang.String str) {
        return this.f215840a.ZIDL_O(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public int d(long j17) {
        return this.f215840a.ZIDL_B(this.nativeHandler, j17);
    }

    public void e(java.lang.String str, long j17, long j18, java.lang.String str2, com.tencent.wechat.aff.affroam.g1 g1Var) {
        this.f215840a.ZIDL_KV(this.nativeHandler, g1Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17, j18, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public com.tencent.wechat.aff.affroam.m0 f(com.tencent.wechat.aff.affroam.o oVar) {
        return (com.tencent.wechat.aff.affroam.m0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.m0.f215901r, this.f215840a.ZIDL_D(this.nativeHandler, oVar.toByteArrayOrNull()));
    }

    public com.tencent.wechat.aff.affroam.m0 g(com.tencent.wechat.aff.affroam.j0 j0Var) {
        return (com.tencent.wechat.aff.affroam.m0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.m0.f215901r, this.f215840a.ZIDL_E(this.nativeHandler, j0Var.toByteArrayOrNull()));
    }

    public void h(com.tencent.wechat.aff.affroam.e eVar) {
        this.f215840a.ZIDL_H(this.nativeHandler, eVar.toByteArrayOrNull());
    }

    public void i() {
        this.f215840a.ZIDL_I(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.affroam.e1 e1Var = new com.tencent.wechat.aff.affroam.e1(this, this.nativeHandler);
        e1Var.f215822c = this.nativeHandler;
        e1Var.f215820a = this.zidlIdentity;
        e1Var.f215821b = this.zidlSvrIdentity;
    }
}
