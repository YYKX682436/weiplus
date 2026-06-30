package ta4;

/* loaded from: classes4.dex */
public final class j1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc4.p f416788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f416789b;

    public j1(xc4.p pVar, java.util.Map map) {
        this.f416788a = pVar;
        this.f416789b = map;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter$setShareBtnReporter$1");
        ta4.k1 k1Var = ta4.k1.f416795a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$genCommonParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        xc4.p pVar = this.f416788a;
        java.util.Map a17 = k1Var.a(pVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$genCommonParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        a17.putAll(this.f416789b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$putPoiShareParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        k1Var.b(pVar, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$putPoiShareParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter$setShareBtnReporter$1");
        return a17;
    }
}
