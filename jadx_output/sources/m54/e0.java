package m54;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.e0 f324264a = new m54.e0();

    public final void a(com.tencent.mm.ui.widget.MMWebView webView, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWebViewInputKeyboard", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        kotlin.jvm.internal.o.g(webView, "webView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportSettingWebViewInput", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        int u07 = ca4.m0.u0(e42.c0.clicfg_sns_ad_vangogh_webview_keyboard, 0);
        com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "setting webview input method value is " + u07);
        boolean z17 = u07 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportSettingWebViewInput", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        if (z17) {
            java.lang.Object obj = map != null ? map.get("settingWebViewKeyboard") : null;
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            webView.setInputOutOfKeyboardEnable(bool != null ? bool.booleanValue() : false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWebViewInputKeyboard", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
    }
}
