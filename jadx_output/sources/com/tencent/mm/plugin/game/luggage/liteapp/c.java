package com.tencent.mm.plugin.game.luggage.liteapp;

/* loaded from: classes8.dex */
public class c implements sd.a {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f139812d;

    /* renamed from: e, reason: collision with root package name */
    public sd.l0 f139813e;

    public c(android.content.Context context, java.lang.Class cls, nw4.e eVar) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.liteapp.LiteLuggageService$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.plugin.game.luggage.liteapp.c cVar = com.tencent.mm.plugin.game.luggage.liteapp.c.this;
                cVar.f139813e.a();
                cVar.f139812d = null;
                cVar.f139813e = null;
                dead();
                return false;
            }
        };
        this.f139812d = context;
        this.f139813e = new com.tencent.mm.plugin.game.luggage.liteapp.b(context, cls, eVar);
        iListener.alive();
    }

    @Override // sd.a
    public android.content.Context getContext() {
        return this.f139812d;
    }

    @Override // sd.a
    public sd.l0 getRuntime() {
        return this.f139813e;
    }
}
