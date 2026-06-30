package com.tencent.wechat.aff.affroam;

/* loaded from: classes16.dex */
public class q1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.q1 f215966b = new com.tencent.wechat.aff.affroam.q1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.ZIDL_esFfE4Hv2K f215967a;

    public q1() {
        com.tencent.wechat.aff.affroam.ZIDL_esFfE4Hv2K zIDL_esFfE4Hv2K = new com.tencent.wechat.aff.affroam.ZIDL_esFfE4Hv2K();
        this.f215967a = zIDL_esFfE4Hv2K;
        this.zidlCreateName = "affroam.RoamMediaFormatter@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_esFfE4Hv2K.ZIDL_esFfE4Hv2C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public java.lang.String a(long j17, java.lang.String str) {
        return new java.lang.String(this.f215967a.ZIDL_I(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String b(long j17, java.lang.String str) {
        return new java.lang.String(this.f215967a.ZIDL_H(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String c(long j17, int i17) {
        return new java.lang.String(this.f215967a.ZIDL_G(this.nativeHandler, j17, i17), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String d(long j17, int i17) {
        return new java.lang.String(this.f215967a.ZIDL_F(this.nativeHandler, j17, i17), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String e(long j17) {
        return new java.lang.String(this.f215967a.ZIDL_C(this.nativeHandler, j17), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String f(long j17) {
        return new java.lang.String(this.f215967a.ZIDL_D(this.nativeHandler, j17), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String g(long j17) {
        return new java.lang.String(this.f215967a.ZIDL_E(this.nativeHandler, j17), java.nio.charset.StandardCharsets.UTF_8);
    }
}
