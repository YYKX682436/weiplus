package ga4;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f269913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f269917h;

    public e(long j17, int i17, java.lang.String str, int i18, kotlin.jvm.internal.f0 f0Var) {
        this.f269913d = j17;
        this.f269914e = i17;
        this.f269915f = str;
        this.f269916g = i18;
        this.f269917h = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        long j17 = this.f269913d;
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = Fj != null ? Fj.W0(j17) : null;
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
            return;
        }
        int i17 = W0.isAd() ? 2 : com.tencent.mm.storage.z3.m4(W0.getUserName()) ? 3 : 1;
        com.tencent.mm.autogen.mmdata.rpt.SnsFinderKeyWordsReportStruct snsFinderKeyWordsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFinderKeyWordsReportStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        snsFinderKeyWordsReportStruct.f60573d = snsFinderKeyWordsReportStruct.b("SessionID", v52.c.g().d(), true);
        snsFinderKeyWordsReportStruct.f60574e = snsFinderKeyWordsReportStruct.b("FeedID", java.lang.String.valueOf(j17), true);
        snsFinderKeyWordsReportStruct.f60575f = snsFinderKeyWordsReportStruct.b("FeedUin", W0.getUserName(), true);
        snsFinderKeyWordsReportStruct.f60576g = snsFinderKeyWordsReportStruct.b("CreatedCommentID", java.lang.String.valueOf(this.f269914e), true);
        snsFinderKeyWordsReportStruct.f60577h = snsFinderKeyWordsReportStruct.b("HotWord", this.f269915f, true);
        snsFinderKeyWordsReportStruct.f60578i = 1;
        snsFinderKeyWordsReportStruct.f60579j = this.f269916g;
        snsFinderKeyWordsReportStruct.f60580k = 2L;
        snsFinderKeyWordsReportStruct.f60581l = i17;
        snsFinderKeyWordsReportStruct.f60582m = this.f269917h.f310116d;
        snsFinderKeyWordsReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
    }
}
