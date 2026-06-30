package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.g1 f139614g;

    public d1(com.tencent.mm.plugin.game.luggage.jsapi.g1 g1Var, java.lang.String str, int i17, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139614g = g1Var;
        this.f139611d = str;
        this.f139612e = i17;
        this.f139613f = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.jsapi.g1 g1Var = this.f139614g;
        java.lang.String str = this.f139611d;
        int i17 = this.f139612e;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139613f;
        org.json.JSONObject f17 = g1Var.f(str);
        if (i17 != 0) {
            if (i17 == 1) {
                q5Var.a(null, f17);
                return;
            }
        } else if (f17 != null) {
            q5Var.a(null, f17);
            return;
        }
        com.tencent.mm.plugin.game.luggage.jsapi.e1 e1Var = new com.tencent.mm.plugin.game.luggage.jsapi.e1(g1Var, str, q5Var);
        g1Var.f139645e = e1Var;
        com.tencent.mm.plugin.wepkg.event.h.f188332a.add(new java.lang.ref.WeakReference(e1Var));
        ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.game.luggage.jsapi.f1(g1Var, q5Var), 60000L, "MicroMsg.JsApiGetWepkgFileList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
        am.t20 t20Var = wepkgNotifyEvent.f54992g;
        t20Var.f7969a = 8;
        t20Var.f7975g = 0;
        t20Var.f7976h = arrayList;
        wepkgNotifyEvent.e();
    }
}
