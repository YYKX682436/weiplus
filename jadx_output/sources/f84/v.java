package f84;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int f260217a;

    /* renamed from: b, reason: collision with root package name */
    public int f260218b;

    @za4.k1
    private f84.y brandPreludeInfo;

    /* renamed from: c, reason: collision with root package name */
    public int f260219c;

    @za4.l1
    private java.util.List<f84.b0> topicInfoList;

    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f84.v c(java.util.Map r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.v.c(java.util.Map, java.lang.String):f84.v");
    }

    public final f84.y a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandPreludeInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        f84.y yVar = this.brandPreludeInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandPreludeInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        return yVar;
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicInfoList", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        java.util.List<f84.b0> list = this.topicInfoList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicInfoList", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        return list;
    }

    public final void d(f84.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBrandPreludeInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        this.brandPreludeInfo = yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBrandPreludeInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
    }

    public final void e(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopicInfoList", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        this.topicInfoList = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopicInfoList", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
    }
}
