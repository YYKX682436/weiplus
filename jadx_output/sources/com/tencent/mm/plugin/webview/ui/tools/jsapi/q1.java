package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185352g;

    public q1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, java.lang.String str, nw4.y2 y2Var) {
        this.f185352g = c1Var;
        this.f185349d = i17;
        this.f185350e = str;
        this.f185351f = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
        int i17 = this.f185349d;
        am.le leVar = gameCommOperationEvent.f54358g;
        leVar.f7243a = i17;
        leVar.f7244b = this.f185350e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185352g;
        leVar.f7245c = c1Var.f184975d;
        gameCommOperationEvent.e();
        am.me meVar = gameCommOperationEvent.f54359h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "gameCommInfo:%s", meVar.f7341a);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(meVar.f7341a);
        nw4.y2 y2Var = this.f185351f;
        if (K0) {
            c1Var.i5(y2Var, "getGameCommInfo:fail", null);
            return;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject(meVar.f7341a);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            c1Var.i5(y2Var, "getGameCommInfo:ok", hashMap);
        } catch (org.json.JSONException unused) {
            c1Var.i5(y2Var, "getGameCommInfo:fail", null);
        }
    }
}
