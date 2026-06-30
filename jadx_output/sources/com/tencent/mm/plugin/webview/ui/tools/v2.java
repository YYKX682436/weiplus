package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class v2 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI f186958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(int i17, int i18, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI, java.lang.String str) {
        super(i17, i18);
        this.f186958d = sDKOAuthWechatUI;
        this.f186959e = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$addJumpLink$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        int i17 = com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI.f183740n;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI = this.f186958d;
        sDKOAuthWechatUI.getClass();
        java.lang.String str = this.f186959e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthWechatUI", "jumpToWebView url is null");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            j45.l.j(sDKOAuthWechatUI, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$addJumpLink$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
