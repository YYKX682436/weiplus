package dd4;

/* loaded from: classes4.dex */
public final class c0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f228976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f228977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228978d;

    public c0(android.content.Context context, dd4.e0 e0Var, long j17, java.lang.String str) {
        this.f228975a = context;
        this.f228976b = e0Var;
        this.f228977c = j17;
        this.f228978d = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        android.content.Context context = this.f228975a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7b, q75.c.c(destPath)), 1).show();
        q75.c.f(destPath, this.f228975a);
        dd4.e0 e0Var = this.f228976b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        e0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        ((ku5.t0) ku5.t0.f312615d).h(new dd4.b0(e0Var), "SnsVideoExportReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        android.content.Context context = this.f228975a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7a), 1).show();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.FlexibleShareHelper", "%d save downloaded video finish %d %s", valueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f228977c), this.f228978d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
    }
}
