package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f182422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q f182425g;

    public p(com.tencent.mm.plugin.webview.luggage.jsapi.q qVar, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2) {
        this.f182425g = qVar;
        this.f182422d = linkedList;
        this.f182423e = str;
        this.f182424f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.jsapi.q qVar = this.f182425g;
        com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.x6(((com.tencent.mm.plugin.webview.luggage.e0) qVar.f182438a.f406596a).f406610d);
        com.tencent.mm.plugin.webview.luggage.jsapi.o oVar = new com.tencent.mm.plugin.webview.luggage.jsapi.o(this);
        sd.b bVar = qVar.f182438a;
        java.util.LinkedList linkedList = this.f182422d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "scopeInfoList is empty!");
            bVar.c("fail", null);
        } else {
            if (x6Var.a(linkedList, this.f182423e, this.f182424f, null, oVar)) {
                return;
            }
            bVar.c("fail", null);
        }
    }
}
