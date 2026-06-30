package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class a5 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185944d;

    public a5(nw4.k kVar) {
        this.f185944d = kVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186305e) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("event", i18 != -1 ? i18 != 0 ? com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED : "canceled" : ya.b.SUCCESS);
            if (intent != null) {
                hashMap.put("sendChatType", new jz5.u(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d, i18, intent)));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts resultCode:" + i18 + " event:" + hashMap.get("event") + " sendChatType:" + hashMap.get("sendChatType"));
            nw4.g gVar = this.f185944d.f340863d;
            kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
        }
    }
}
