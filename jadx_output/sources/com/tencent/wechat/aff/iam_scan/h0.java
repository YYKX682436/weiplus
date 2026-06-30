package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class h0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.h0 f217048b = new com.tencent.wechat.aff.iam_scan.h0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_hY0gdKVCK f217049a;

    public h0() {
        com.tencent.wechat.aff.iam_scan.ZIDL_hY0gdKVCK zIDL_hY0gdKVCK = new com.tencent.wechat.aff.iam_scan.ZIDL_hY0gdKVCK();
        this.f217049a = zIDL_hY0gdKVCK;
        this.zidlCreateName = "scan.ScanDecodeQueue@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_hY0gdKVCK.ZIDL_hY0gdKVCC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.nio.ByteBuffer byteBuffer, com.tencent.wechat.aff.iam_scan.x xVar, com.tencent.wechat.aff.iam_scan.e0 e0Var) {
        this.f217049a.ZIDL_HV(this.nativeHandler, e0Var, byteBuffer, xVar.toByteArrayOrNull());
    }

    public com.tencent.wechat.aff.iam_scan.x0 b() {
        return (com.tencent.wechat.aff.iam_scan.x0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.x0.f217163v, this.f217049a.ZIDL_K(this.nativeHandler));
    }

    public void c(long j17, com.tencent.wechat.aff.iam_scan.b1 b1Var, com.tencent.wechat.aff.iam_scan.f0 f0Var) {
        this.f217049a.ZIDL_BV(this.nativeHandler, f0Var, j17, b1Var.toByteArrayOrNull());
    }

    public void d(java.lang.String str, int i17) {
        this.f217049a.ZIDL_I(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    public void e(long j17) {
        this.f217049a.ZIDL_C(this.nativeHandler, j17);
    }

    public void f() {
        this.f217049a.ZIDL_L(this.nativeHandler);
    }

    public void g(boolean z17, int i17) {
        this.f217049a.ZIDL_J(this.nativeHandler, z17, i17);
    }

    public void h(int i17) {
        this.f217049a.ZIDL_M(this.nativeHandler, i17);
    }

    public void i(com.tencent.wechat.aff.iam_scan.d1 d1Var, com.tencent.wechat.aff.iam_scan.c0 c0Var) {
        this.f217049a.ZIDL_D(this.nativeHandler, d1Var.toByteArrayOrNull(), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(c0Var));
    }

    public void j(com.tencent.wechat.aff.iam_scan.d1 d1Var, com.tencent.wechat.aff.iam_scan.g0 g0Var) {
        this.f217049a.ZIDL_FV(this.nativeHandler, g0Var, d1Var.toByteArrayOrNull());
    }
}
