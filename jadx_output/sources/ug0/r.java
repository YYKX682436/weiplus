package ug0;

/* loaded from: classes8.dex */
public final class r implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ug0.s f427476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f427477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427478c;

    public r(ug0.s sVar, int i17, java.lang.String str) {
        this.f427476a = sVar;
        this.f427477b = i17;
        this.f427478c = str;
    }

    @Override // q80.f0
    public void fail() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchLiteAppFSC", "startWebSearchLiteApp, callback failed", null);
    }

    @Override // q80.f0
    public void success() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppFSC", "startWebSearchLiteApp, callback successfully", null);
        final ug0.s sVar = this.f427476a;
        j75.f Ai = sVar.f300267d.Ai();
        final int i18 = this.f427477b;
        if (Ai != null) {
            Ai.B3(new tg0.n2(androidx.lifecycle.m.ON_CREATE, i18));
        }
        final java.lang.String appId = this.f427478c;
        kotlin.jvm.internal.o.f(appId, "$appId");
        com.tencent.mm.sdk.event.IListener iListener = sVar.f427479f;
        if (iListener != null) {
            iListener.dead();
        }
        sVar.f427479f = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.feature.websearch.fsc.WebSearchLiteAppFSC$startLiteAppCloseListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.f227168s);
                java.lang.String str = riVar.f7819c;
                java.lang.String str2 = appId;
                if (str2.equals(str)) {
                    j75.f Ai2 = sVar.f300267d.Ai();
                    if (Ai2 != null) {
                        Ai2.B3(new tg0.n2(androidx.lifecycle.m.ON_DESTROY, i18));
                    }
                    java.lang.String concat = "liteAppCloseListener, LiteApp closed, stop listening, appId: ".concat(str2);
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppFSC", concat, null);
                    dead();
                    return false;
                }
                java.lang.String str3 = "liteAppCloseListener, appId not matched, started: " + str2 + ", closing: " + riVar.f7819c;
                int i27 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchLiteAppFSC", str3, null);
                return false;
            }
        };
        sVar.f427479f = iListener2;
        iListener2.alive();
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).oj(d85.f0.f227168s);
    }
}
