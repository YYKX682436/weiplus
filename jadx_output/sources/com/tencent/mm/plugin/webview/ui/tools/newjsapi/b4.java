package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class b4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185970e;

    public b4(java.lang.String str, nw4.k kVar) {
        this.f185969d = str;
        this.f185970e = kVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186305e) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("event", i18 != -1 ? i18 != 0 ? com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED : "canceled" : ya.b.SUCCESS);
            if (intent != null) {
                hashMap.put("sendChatType", new jz5.u(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d, i18, intent)));
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                if (stringArrayListExtra != null && stringArrayListExtra.size() != 0) {
                    java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        kotlin.jvm.internal.o.d(next);
                        boolean B = r26.n0.B(next, "@chatroom", false);
                        java.lang.String str = this.f185969d;
                        if (B) {
                            jx3.f.INSTANCE.d(28358, 2, next, str);
                        } else {
                            jx3.f.INSTANCE.d(28358, 1, next, str);
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "createHalfBottomMenu for sns resultCode:" + i18 + " event:" + hashMap.get("event"));
            nw4.g gVar = this.f185970e.f340863d;
            kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
        }
    }
}
