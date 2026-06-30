package com.tencent.wechat.aff.data_report;

/* loaded from: classes15.dex */
public class h extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.aff.data_report.h f216606c = new com.tencent.wechat.aff.data_report.h();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcK f216607a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcKE f216608b;

    public h() {
        com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcK zIDL_MK0DaVBcK = new com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcK();
        this.f216607a = zIDL_MK0DaVBcK;
        com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcKE zIDL_MK0DaVBcKE = new com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcKE();
        this.f216608b = zIDL_MK0DaVBcKE;
        this.zidlCreateName = "data_report.DataReportCgiManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_data_report", "aff_biz");
        zIDL_MK0DaVBcK.ZIDL_MK0DaVBcC(this, zIDL_MK0DaVBcKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public bw5.f3 a(int i17) {
        return (bw5.f3) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.f3.f27129i, this.f216607a.ZIDL_H(this.nativeHandler, i17));
    }

    public boolean b(java.lang.String str) {
        return this.f216607a.ZIDL_F(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void c(bw5.r4 r4Var, com.tencent.wechat.aff.data_report.c cVar) {
        this.f216607a.ZIDL_BV(this.nativeHandler, cVar, r4Var.toByteArrayOrNull());
    }

    public void d(bw5.q4 q4Var, com.tencent.wechat.aff.data_report.d dVar) {
        this.f216607a.ZIDL_AV(this.nativeHandler, dVar, q4Var.toByteArrayOrNull());
    }

    public void e(int i17, int i18, com.tencent.wechat.aff.data_report.e eVar) {
        this.f216607a.ZIDL_CV(this.nativeHandler, eVar, i17, i18);
    }

    public void f(boolean z17, com.tencent.wechat.aff.data_report.f fVar) {
        this.f216607a.ZIDL_DV(this.nativeHandler, fVar, z17);
    }

    public void g(java.lang.String str, com.tencent.wechat.aff.data_report.a aVar) {
        this.f216608b.f216604a.put(str, aVar);
    }

    public void h(java.lang.String str, com.tencent.wechat.aff.data_report.b bVar) {
        this.f216608b.f216605b.put(str, bVar);
    }

    public void i(java.lang.String str) {
        this.f216608b.f216604a.remove(str);
    }

    public void j(long j17, com.tencent.wechat.aff.data_report.g gVar) {
        this.f216607a.ZIDL_EV(this.nativeHandler, gVar, j17);
    }
}
