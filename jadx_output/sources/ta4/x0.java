package ta4;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: j, reason: collision with root package name */
    public static final ta4.w0 f416851j = new ta4.w0(null);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.LinkedList f416852k = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public int f416856d;

    /* renamed from: e, reason: collision with root package name */
    public int f416857e;

    /* renamed from: f, reason: collision with root package name */
    public int f416858f;

    /* renamed from: h, reason: collision with root package name */
    public int f416860h;

    /* renamed from: i, reason: collision with root package name */
    public int f416861i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f416853a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f416854b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f416855c = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f416859g = "";

    public static final /* synthetic */ java.util.LinkedList a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        java.util.LinkedList linkedList = f416852k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        return linkedList;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.tencent.mm.autogen.mmdata.rpt.WC_MOMENTS_INPUT_ARER_LOGStruct wC_MOMENTS_INPUT_ARER_LOGStruct = new com.tencent.mm.autogen.mmdata.rpt.WC_MOMENTS_INPUT_ARER_LOGStruct();
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62202d = this.f416856d;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62208j = this.f416858f;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62207i = this.f416857e;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62210l = this.f416860h;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62209k = wC_MOMENTS_INPUT_ARER_LOGStruct.b("contextScreenHeightRatio", this.f416859g, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62205g = wC_MOMENTS_INPUT_ARER_LOGStruct.b("commentID", this.f416855c, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62204f = wC_MOMENTS_INPUT_ARER_LOGStruct.b("feedID", this.f416854b, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62203e = wC_MOMENTS_INPUT_ARER_LOGStruct.b("sessionID", this.f416853a, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f62206h = this.f416861i;
        wC_MOMENTS_INPUT_ARER_LOGStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        a().remove(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    public final void c(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f416856d = i17;
        this.f416861i = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        a().offerFirst(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    public final void d(android.text.Layout layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        if (layout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            return;
        }
        int height = layout.getHeight();
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        int length = layout.getText().length();
        int lineCount = layout.getLineCount();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f416857e = length;
        this.f416858f = lineCount;
        this.f416859g = java.lang.String.valueOf(height / i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }
}
