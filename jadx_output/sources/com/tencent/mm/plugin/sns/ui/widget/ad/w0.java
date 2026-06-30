package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f171065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f171066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f171067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f171068i;

    public w0(com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout adRoundedCornerFrameLayout, int i17, int i18, int i19, int i27, int i28, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f171063d = i17;
        this.f171064e = i18;
        this.f171065f = i19;
        this.f171066g = i27;
        this.f171067h = i28;
        this.f171068i = snsInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f171068i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
        try {
            com.tencent.mm.autogen.mmdata.rpt.SnsAdClickCoordinateInfoReportStruct snsAdClickCoordinateInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsAdClickCoordinateInfoReportStruct();
            snsAdClickCoordinateInfoReportStruct.f60435d = this.f171063d;
            snsAdClickCoordinateInfoReportStruct.f60436e = this.f171064e;
            snsAdClickCoordinateInfoReportStruct.f60437f = this.f171065f;
            snsAdClickCoordinateInfoReportStruct.f60438g = this.f171066g;
            snsAdClickCoordinateInfoReportStruct.f60439h = this.f171067h;
            snsAdClickCoordinateInfoReportStruct.f60440i = snsAdClickCoordinateInfoReportStruct.b("SnsId", ca4.z0.t0(snsInfo.field_snsId), true);
            snsAdClickCoordinateInfoReportStruct.f60441j = snsAdClickCoordinateInfoReportStruct.b("Uxinfo", snsInfo.getUxinfo(), true);
            snsAdClickCoordinateInfoReportStruct.f60442k = snsAdClickCoordinateInfoReportStruct.b("Extra1", "", true);
            snsAdClickCoordinateInfoReportStruct.f60443l = snsAdClickCoordinateInfoReportStruct.b("Extra2", "", true);
            snsAdClickCoordinateInfoReportStruct.k();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdRoundedCornerFrameLayout", "reportClickCoordinate, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
    }
}
