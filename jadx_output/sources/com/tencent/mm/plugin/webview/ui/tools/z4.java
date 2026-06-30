package com.tencent.mm.plugin.webview.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "rawUrl", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class z4<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {
    static {
        new com.tencent.mm.plugin.webview.ui.tools.z4();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.a5 a5Var = com.tencent.mm.plugin.webview.ui.tools.a5.f183894a;
        java.lang.String value = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        kotlin.jvm.internal.o.f(value, "value");
        java.lang.Object obj2 = com.tencent.mm.plugin.webview.ui.tools.a5.f183895b.get(value);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = obj2 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) obj2 : null;
        if (webViewUI != null) {
            webViewUI.finish();
        }
    }
}
