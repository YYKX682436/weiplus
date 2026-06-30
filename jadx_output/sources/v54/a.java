package v54;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v54.b f433364e;

    public a(v54.b bVar, java.lang.String str) {
        this.f433364e = bVar;
        this.f433363d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
        v54.b bVar = this.f433364e;
        android.widget.TextView textView = (android.widget.TextView) bVar.f433365a.get();
        if (textView != null) {
            java.lang.String str = this.f433363d;
            if (!android.text.TextUtils.isEmpty(str)) {
                textView.setText(bVar.f433366b + str);
            }
        } else {
            com.tencent.mars.xlog.Log.w("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, backTxtViewRef get null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
    }
}
