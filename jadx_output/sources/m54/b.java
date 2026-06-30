package m54;

/* loaded from: classes4.dex */
public final class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f324245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f324246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324247d;

    public b(yz5.l lVar, android.os.Bundle bundle, android.content.Context context, java.lang.String str) {
        this.f324244a = lVar;
        this.f324245b = bundle;
        this.f324246c = context;
        this.f324247d = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
        com.tencent.mars.xlog.Log.i("SnsAd.LandPageLauncher", "start lite app failed!!!");
        android.os.Bundle bundle = this.f324245b;
        android.content.Context context = this.f324246c;
        java.lang.String str = this.f324247d;
        try {
            m54.j0.f324287a.b(bundle);
            m54.c0.f324250a.b(context, str, bundle);
            yz5.l lVar = this.f324244a;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("launchDynamicPageReally_fail", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
        com.tencent.mars.xlog.Log.i("SnsAd.LandPageLauncher", "start lite app success");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 1);
        yz5.l lVar = this.f324244a;
        if (lVar != null) {
            try {
                lVar.invoke(java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("launchDynamicPageReally", th6);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
    }
}
