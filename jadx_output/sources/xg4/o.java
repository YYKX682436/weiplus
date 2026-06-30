package xg4;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg4.p f454452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg4.p pVar) {
        super(0);
        this.f454452d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final xg4.p pVar = this.f454452d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewUIDestroyEvent>(a0Var) { // from class: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardService$webViewUIDestroyEventEventListener$2$1
            {
                this.__eventId = -1681666147;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent) {
                hq0.e0 e0Var;
                com.tencent.mm.autogen.events.WebViewUIDestroyEvent event = webViewUIDestroyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardService", "webview destroy!");
                for (java.util.Map.Entry entry : xg4.p.this.f283001p.entrySet()) {
                    if (entry != null && (e0Var = (hq0.e0) entry.getValue()) != null) {
                        e0Var.j();
                    }
                }
                return false;
            }
        };
    }
}
