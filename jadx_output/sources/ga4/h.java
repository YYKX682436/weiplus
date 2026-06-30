package ga4;

/* loaded from: classes10.dex */
public final class h implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ga4.h f269923d = new ga4.h();

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$onStorageChange$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKeywordMatcher", "receive SnsKeyWordsStorage change, reload data.");
        ga4.m.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$onStorageChange$1");
    }
}
