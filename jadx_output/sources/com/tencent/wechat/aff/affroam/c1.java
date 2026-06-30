package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class c1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.c1 f215806b = new com.tencent.wechat.aff.affroam.c1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfJ9_ZpK f215807a;

    public c1() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfJ9_ZpK zIDL_esFfJ9_ZpK = new com.tencent.wechat.aff.affroam.ZIDL_esFfJ9_ZpK();
        this.f215807a = zIDL_esFfJ9_ZpK;
        this.zidlCreateName = "affroam.RoamBackupPackageManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfJ9_ZpK.ZIDL_esFfJ9_ZpC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.util.ArrayList arrayList, com.tencent.wechat.aff.affroam.y0 y0Var) {
        this.f215807a.ZIDL_AV(this.nativeHandler, y0Var, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public void b(java.util.ArrayList arrayList, com.tencent.wechat.aff.affroam.z0 z0Var) {
        this.f215807a.ZIDL_HV(this.nativeHandler, z0Var, com.tencent.wechat.zidl2.ZidlUtil.longListToArray(arrayList));
    }

    public void c(boolean z17, com.tencent.wechat.aff.affroam.a1 a1Var) {
        this.f215807a.ZIDL_DV(this.nativeHandler, a1Var, z17);
    }

    public com.tencent.wechat.aff.affroam.g d(long j17) {
        return (com.tencent.wechat.aff.affroam.g) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.g.f215828p, this.f215807a.ZIDL_E(this.nativeHandler, j17));
    }

    public void e(java.util.ArrayList arrayList, com.tencent.wechat.aff.affroam.b1 b1Var) {
        this.f215807a.ZIDL_FV(this.nativeHandler, b1Var, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }
}
