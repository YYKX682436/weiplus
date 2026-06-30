package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo f172634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f172636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172637g;

    public k1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i17, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f172637g = taskBarView;
        this.f172634d = localUsageInfo;
        this.f172635e = i17;
        this.f172636f = appBrandStatObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172637g;
        taskBarView.G2 = 13;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f172634d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "launchAppBrand appId:%s, appPath: %s", localUsageInfo.f76362e, localUsageInfo.f76366i);
        taskBarView.getClass();
        ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).Ai();
        com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo appBrandLocationInfo = com.tencent.mm.plugin.appbrand.appusage.j0.f76479m.f76346i;
        boolean z17 = appBrandLocationInfo != null && appBrandLocationInfo.a();
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "sendLocationToAppBrandProcess isLocationIn10Minutes:%b", java.lang.Boolean.valueOf(z17));
            com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent saveLocationForAppBrandReportEvent = new com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent();
            java.lang.String str = localUsageInfo.f76362e;
            am.ns nsVar = saveLocationForAppBrandReportEvent.f54724g;
            nsVar.f7451a = str;
            nsVar.f7452b = localUsageInfo.f76361d;
            nsVar.f7453c = this.f172635e;
            nsVar.f7454d = appBrandLocationInfo.f76347d;
            nsVar.f7455e = appBrandLocationInfo.f76348e;
            nsVar.f7456f = appBrandLocationInfo.f76349f;
            nsVar.f7457g = appBrandLocationInfo.f76350g;
            nsVar.f7458h = appBrandLocationInfo.f76351h;
            nsVar.f7459i = appBrandLocationInfo.f76352i;
            nsVar.f7460j = java.lang.System.currentTimeMillis() - appBrandLocationInfo.f76353m;
            saveLocationForAppBrandReportEvent.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "sendLocationToAppBrandProcess location is invalid");
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(taskBarView.getContext(), localUsageInfo.f76361d, localUsageInfo.f76362e, localUsageInfo.f76363f, -1, localUsageInfo.f76366i, this.f172636f);
    }
}
