package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class c4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f186003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186004f;

    public c4(java.lang.String str, c01.l2 l2Var, nw4.k kVar) {
        this.f186002d = str;
        this.f186003e = l2Var;
        this.f186004f = kVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186305e) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("event", i18 != -1 ? i18 != 0 ? com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED : "canceled" : ya.b.SUCCESS);
            java.lang.String str = this.f186002d;
            if (str != null) {
                ta4.w wVar = ta4.v.f416846a;
                if (wVar.f416847a != -1) {
                    jx3.f.INSTANCE.d(28358, 3, java.lang.Integer.valueOf(wVar.f416847a), java.net.URLEncoder.encode(str));
                }
                wVar.f416847a = -1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts resultCode:" + i18 + " event:" + this.f186003e.b("event"));
            nw4.g gVar = this.f186004f.f340863d;
            kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
        }
    }
}
