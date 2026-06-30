package k54;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f304416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304417e;

    public d(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str) {
        this.f304416d = callback;
        this.f304417e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$2");
        ot5.g.c("SnsAd.WebViewChromeClient", "onGeolocationPermissionsShowPrompt cancel");
        try {
            this.f304416d.invoke(this.f304417e, false, false);
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "GeolocationPermissions.Callback has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$2");
    }
}
