package k54;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final k54.s f304449a = new k54.s();

    public final java.lang.String a(java.lang.String str, m54.l lVar) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeUpUrlWithParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        java.lang.String a17 = a54.h.a(lVar);
        if (!(a17.length() > 0) || r26.n0.D(str, "&uxinfo=", false, 2, null) || (str2 = ca4.z0.b(str, a17)) == null) {
            str2 = str;
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeUpUrlWithParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        return str;
    }

    public final void b(com.tencent.mm.ui.widget.MMWebView mMWebView, boolean z17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        if (mMWebView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mars.xlog.Log.i("SnsAd.WebView", "setInputOutOfKeyboardEnable, settingWebViewKeyboard is " + z17);
            mMWebView.setInputOutOfKeyboardEnable(z17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.WebView", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
    }
}
