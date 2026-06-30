package dd4;

/* loaded from: classes4.dex */
public final class d0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f228988c;

    public d0(java.lang.String str, android.content.Context context, dd4.e0 e0Var) {
        this.f228986a = str;
        this.f228987b = context;
        this.f228988c = e0Var;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        java.lang.String str = this.f228986a;
        if (!booleanValue || android.text.TextUtils.isEmpty(str)) {
            android.content.Context context = this.f228987b;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7a), 1).show();
            com.tencent.mars.xlog.Log.w("MicroMsg.FlexibleShareHelper", hashCode() + " save downloaded video fail, granted = " + booleanValue + ", fullPath = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context2 = this.f228987b;
            java.lang.String str2 = this.f228986a;
            ((yb0.g) b0Var).Bi(context2, str2, new dd4.c0(context2, this.f228988c, elapsedRealtime, str2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
    }
}
