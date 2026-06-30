package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes16.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f184550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f184551i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f184553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184554o;

    public o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5) {
        this.f184546d = str;
        this.f184547e = str2;
        this.f184548f = str3;
        this.f184549g = i17;
        this.f184550h = i18;
        this.f184551i = i19;
        this.f184552m = str4;
        this.f184553n = j17;
        this.f184554o = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.FeatureActionReportStruct featureActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FeatureActionReportStruct();
        featureActionReportStruct.f56354d = featureActionReportStruct.b("SessionId", this.f184546d, true);
        featureActionReportStruct.f56355e = featureActionReportStruct.b("SearchId", this.f184547e, true);
        featureActionReportStruct.f56356f = featureActionReportStruct.b("RequestId", this.f184548f, true);
        featureActionReportStruct.f56357g = this.f184549g;
        featureActionReportStruct.f56358h = this.f184550h;
        featureActionReportStruct.f56359i = this.f184551i;
        featureActionReportStruct.f56360j = java.lang.System.currentTimeMillis();
        featureActionReportStruct.f56361k = featureActionReportStruct.b("FeatureInfo", this.f184552m, true);
        featureActionReportStruct.f56364n = this.f184553n;
        featureActionReportStruct.f56365o = featureActionReportStruct.b("ParentSearchId", this.f184554o, true);
        featureActionReportStruct.k();
        su4.k3.m(featureActionReportStruct);
    }
}
