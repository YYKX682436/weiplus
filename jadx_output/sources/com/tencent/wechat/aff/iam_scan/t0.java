package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class t0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.t0 f217133b = new com.tencent.wechat.aff.iam_scan.t0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_eeBnG6HUzK f217134a;

    public t0() {
        com.tencent.wechat.aff.iam_scan.ZIDL_eeBnG6HUzK zIDL_eeBnG6HUzK = new com.tencent.wechat.aff.iam_scan.ZIDL_eeBnG6HUzK();
        this.f217134a = zIDL_eeBnG6HUzK;
        this.zidlCreateName = "scan.ScanGoodsQueue@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_eeBnG6HUzK.ZIDL_eeBnG6HUzC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(int i17, com.tencent.wechat.aff.iam_scan.p0 p0Var) {
        this.f217134a.ZIDL_GV(this.nativeHandler, p0Var, i17);
    }

    public void b(com.tencent.wechat.aff.iam_scan.h hVar, com.tencent.wechat.aff.iam_scan.q0 q0Var) {
        this.f217134a.ZIDL_AV(this.nativeHandler, q0Var, hVar.toByteArrayOrNull());
    }

    public void c(java.nio.ByteBuffer byteBuffer, int i17, int i18, com.tencent.wechat.aff.iam_scan.p pVar, com.tencent.wechat.aff.iam_scan.r0 r0Var) {
        this.f217134a.ZIDL_FV(this.nativeHandler, r0Var, byteBuffer, i17, i18, pVar.toByteArrayOrNull());
    }

    public void d() {
        this.f217134a.ZIDL_B(this.nativeHandler);
    }

    public void e(java.nio.ByteBuffer byteBuffer, com.tencent.wechat.aff.iam_scan.m mVar, int i17, com.tencent.wechat.aff.iam_scan.s0 s0Var) {
        this.f217134a.ZIDL_IV(this.nativeHandler, s0Var, byteBuffer, mVar.toByteArrayOrNull(), i17);
    }

    public void f(com.tencent.wechat.aff.iam_scan.q qVar, com.tencent.wechat.aff.iam_scan.m0 m0Var) {
        this.f217134a.ZIDL_C(this.nativeHandler, qVar.toByteArrayOrNull(), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(m0Var));
    }

    public void g(com.tencent.wechat.aff.iam_scan.n nVar) {
        this.f217134a.ZIDL_H(this.nativeHandler, nVar.toByteArrayOrNull());
    }
}
