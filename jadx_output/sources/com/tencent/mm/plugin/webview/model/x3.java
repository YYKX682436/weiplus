package com.tencent.mm.plugin.webview.model;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/webview/model/WebViewEventReporter$Companion$IPCWebViewEventData;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/webview/model/WebViewEventReporter$Companion$IPCWebViewEventData;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class x3<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.x3 f183186d = new com.tencent.mm.plugin.webview.model.x3();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.model.WebViewEventReporter$Companion$IPCWebViewEventData webViewEventReporter$Companion$IPCWebViewEventData = (com.tencent.mm.plugin.webview.model.WebViewEventReporter$Companion$IPCWebViewEventData) obj;
        if (webViewEventReporter$Companion$IPCWebViewEventData != null) {
            com.tencent.mm.autogen.events.WebViewKeyActionEvent webViewKeyActionEvent = new com.tencent.mm.autogen.events.WebViewKeyActionEvent();
            int i17 = webViewEventReporter$Companion$IPCWebViewEventData.f182731d;
            am.n20 n20Var = webViewKeyActionEvent.f54986g;
            n20Var.f7394a = i17;
            n20Var.f7395b = webViewEventReporter$Companion$IPCWebViewEventData.f182732e;
            webViewKeyActionEvent.e();
        }
    }
}
