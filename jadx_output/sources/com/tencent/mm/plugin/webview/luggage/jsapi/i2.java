package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f182340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j2 f182343h;

    public i2(com.tencent.mm.plugin.webview.luggage.jsapi.j2 j2Var, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3) {
        this.f182343h = j2Var;
        this.f182339d = str;
        this.f182340e = linkedList;
        this.f182341f = str2;
        this.f182342g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.jsapi.j2 j2Var = this.f182343h;
        com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.x6(((com.tencent.mm.plugin.webview.luggage.e0) j2Var.f182354a.f406596a).f406610d);
        com.tencent.mm.plugin.webview.luggage.jsapi.h2 h2Var = new com.tencent.mm.plugin.webview.luggage.jsapi.h2(this);
        sd.b bVar = j2Var.f182354a;
        java.util.LinkedList linkedList = this.f182340e;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "scopeInfoList is empty!");
            bVar.c("fail", null);
        } else {
            if (x6Var.a(linkedList, this.f182341f, this.f182342g, null, h2Var)) {
                return;
            }
            bVar.c("fail", null);
        }
    }
}
