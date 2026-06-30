package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class e5 implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185076d;

    public e5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f185076d = c1Var;
        this.f185073a = str;
        this.f185074b = str2;
        this.f185075c = y2Var;
    }

    @Override // j35.d
    public void a(boolean z17) {
        nw4.y2 y2Var = this.f185075c;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185076d;
        if (!z17) {
            c1Var.i5(y2Var, "install_download_task:fail", null);
            return;
        }
        java.lang.String b17 = com.tencent.mm.plugin.webview.model.s3.f183104a.b(this.f185073a, this.f185074b);
        if (b17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            l44.z.b(4001010, b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        c1Var.i5(y2Var, "install_download_task:ok", null);
    }
}
