package k54;

/* loaded from: classes7.dex */
public final /* synthetic */ class r implements com.tencent.mm.plugin.webview.ui.tools.widget.h7, kotlin.jvm.internal.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304448a;

    public r(yz5.l function) {
        kotlin.jvm.internal.o.g(function, "function");
        this.f304448a = function;
    }

    @Override // kotlin.jvm.internal.j
    public final jz5.b b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFunctionDelegate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFunctionDelegate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        return this.f304448a;
    }

    public final boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        boolean z17 = false;
        if ((obj instanceof com.tencent.mm.plugin.webview.ui.tools.widget.h7) && (obj instanceof kotlin.jvm.internal.j)) {
            z17 = kotlin.jvm.internal.o.b(b(), ((kotlin.jvm.internal.j) obj).b());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        return z17;
    }

    public final int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        int hashCode = b().hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$sam$com_tencent_mm_plugin_webview_ui_tools_widget_WebViewChromeClientCreator$0");
        return hashCode;
    }
}
