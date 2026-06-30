package v54;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f433365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433366b;

    public b(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f433365a = weakReference;
        this.f433366b = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        java.lang.String optString;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        com.tencent.mars.xlog.Log.i("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, ret=" + obj);
        if (obj instanceof java.lang.String) {
            try {
                optString = new org.json.JSONObject((java.lang.String) obj).optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.sdk.platformtools.u3.h(new v54.a(this, optString));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        }
        optString = "";
        com.tencent.mm.sdk.platformtools.u3.h(new v54.a(this, optString));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }
}
