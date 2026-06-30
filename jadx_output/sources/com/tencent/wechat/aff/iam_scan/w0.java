package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class w0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.w0 f217149b = new com.tencent.wechat.aff.iam_scan.w0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_RhOmjyIdK f217150a;

    public w0() {
        com.tencent.wechat.aff.iam_scan.ZIDL_RhOmjyIdK zIDL_RhOmjyIdK = new com.tencent.wechat.aff.iam_scan.ZIDL_RhOmjyIdK();
        this.f217150a = zIDL_RhOmjyIdK;
        this.zidlCreateName = "scan.ScanKeyActionReportManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_RhOmjyIdK.ZIDL_RhOmjyIdC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str, int i17, com.tencent.wechat.aff.iam_scan.v0 v0Var) {
        this.f217150a.ZIDL_AV(this.nativeHandler, v0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }
}
