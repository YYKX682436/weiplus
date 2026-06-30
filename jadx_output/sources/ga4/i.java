package ga4;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str) {
        super(0);
        this.f269924d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.r2 r2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        java.lang.String str = this.f269924d;
        if (str != null) {
            ga4.m mVar = ga4.m.f269928a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            ga4.c cVar = new ga4.c(str, new java.util.ArrayList());
            q26.l lVar = new q26.l((q26.m) r26.t.c(ga4.m.f269935h, str, 0, 2, null));
            while (lVar.hasNext()) {
                r26.q qVar = (r26.q) ((r26.m) lVar.next());
                java.util.Collection collection = qVar.f368911c;
                if (collection != null && ((kz5.b) collection).d() > 1) {
                    r26.k e17 = ((r26.p) qVar.f368911c).e(1);
                    if (r26.i0.q(e17 != null ? e17.f368900a : null, qVar.c(), false, 2, null)) {
                        java.util.Objects.toString(qVar.b());
                        qVar.c();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                cVar.f269907b.add(new ga4.a(qVar.b().f246209d, qVar.b().f246210e, qVar.c()));
                java.util.Objects.toString(qVar.b());
                qVar.c();
            }
            synchronized (ga4.m.f269930c) {
                try {
                    r2Var = ga4.m.f269929b;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    throw th6;
                }
            }
            android.os.SystemClock.elapsedRealtime();
            r2Var.size();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        return f0Var;
    }
}
