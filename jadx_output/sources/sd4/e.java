package sd4;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f406694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406695g;

    public e(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        this.f406692d = str;
        this.f406693e = str2;
        this.f406694f = j17;
        this.f406695g = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
        com.tencent.mm.autogen.mmdata.rpt.MethodAnalyseReportStruct methodAnalyseReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MethodAnalyseReportStruct();
        int i18 = 1;
        methodAnalyseReportStruct.f59212d = methodAnalyseReportStruct.b("MethodName", this.f406692d + '#' + this.f406693e, true);
        methodAnalyseReportStruct.f59213e = (int) this.f406694f;
        methodAnalyseReportStruct.f59216h = methodAnalyseReportStruct.b("MethodTrace", this.f406695g, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_ASM_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_asm_enable, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                i17 = fj6;
                methodAnalyseReportStruct.f59217i = i17;
                methodAnalyseReportStruct.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
            }
            i18 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        i17 = i18;
        methodAnalyseReportStruct.f59217i = i17;
        methodAnalyseReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
    }
}
