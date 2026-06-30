package k54;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f304414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304415e;

    public c(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str) {
        this.f304414d = callback;
        this.f304415e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$1");
        ot5.g.c("SnsAd.WebViewChromeClient", "onGeolocationPermissionsShowPrompt ok");
        try {
            this.f304414d.invoke(this.f304415e, true, true);
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "GeolocationPermissions.Callback has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$1");
    }
}
