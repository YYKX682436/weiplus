package com.tencent.wechat.aff.data_report;

/* loaded from: classes15.dex */
public class j extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.data_report.j f216614b = new com.tencent.wechat.aff.data_report.j();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.data_report.ZIDL_s80O_egZK f216615a;

    public j() {
        com.tencent.wechat.aff.data_report.ZIDL_s80O_egZK zIDL_s80O_egZK = new com.tencent.wechat.aff.data_report.ZIDL_s80O_egZK();
        this.f216615a = zIDL_s80O_egZK;
        this.zidlCreateName = "global_finder_report.FinderDataReportManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_data_report", "aff_biz");
        zIDL_s80O_egZK.ZIDL_s80O_egZC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.data_report.k kVar, com.tencent.wechat.aff.data_report.k kVar2, boolean z17) {
        this.f216615a.ZIDL_C(this.nativeHandler, kVar.toByteArrayOrNull(), kVar2.toByteArrayOrNull(), z17);
    }

    public void b(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_F(this.nativeHandler, kVar.toByteArrayOrNull());
    }

    public void c(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_G(this.nativeHandler, kVar.toByteArrayOrNull());
    }

    public void d(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_D(this.nativeHandler, kVar.toByteArrayOrNull());
    }

    public void e(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_E(this.nativeHandler, kVar.toByteArrayOrNull());
    }

    public void f(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_B(this.nativeHandler, kVar.toByteArrayOrNull());
    }

    public void g(com.tencent.wechat.aff.data_report.k kVar) {
        this.f216615a.ZIDL_A(this.nativeHandler, kVar.toByteArrayOrNull());
    }
}
