package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f143583a;

    /* renamed from: b, reason: collision with root package name */
    public ft.p4 f143584b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f143585c;

    public g3() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f143585c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiLaunchMiniProgram$LiteAppLifeCycleListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                if (liteAppLifeCycleEvent.f54468g.f7817a != 3) {
                    return false;
                }
                dead();
                com.tencent.mm.plugin.lite.jsapi.comms.g3 g3Var = com.tencent.mm.plugin.lite.jsapi.comms.g3.this;
                com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchMiniProgram", "remove app data callback. appId: %s", g3Var.f143583a);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(g3Var.f143583a, g3Var.f143584b);
                return false;
            }
        };
    }
}
