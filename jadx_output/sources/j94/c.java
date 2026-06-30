package j94;

/* loaded from: classes4.dex */
public final class c implements k44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f298545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f298546b;

    public c(android.content.Context context, android.content.Intent intent) {
        this.f298545a = context;
        this.f298546b = intent;
    }

    @Override // k44.a
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper$showHalfScreenAppMarket$1");
        try {
            com.tencent.mars.xlog.Log.i("WsFoldJumpAppMarketHelper", "showHalfScreenAppMarket, user confirmed, launch market intent");
            j94.d dVar = j94.d.f298547a;
            android.content.Context context = this.f298545a;
            android.content.Intent intent = this.f298546b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
            dVar.b(context, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
            a44.m.a(5, 13);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("WsFoldJumpAppMarketHelper", "showHalfScreenAppMarket, launch market intent exp=%s", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper$showHalfScreenAppMarket$1");
    }
}
