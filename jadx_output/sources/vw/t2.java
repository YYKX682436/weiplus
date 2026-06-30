package vw;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes7.dex */
public final class t2 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.brandservice.MagicDynamicCardFeatureService$preCleanFileEvent$1 f440733d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.brandservice.MagicDynamicCardFeatureService$preCleanFileEvent$1] */
    public t2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f440733d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(a0Var) { // from class: com.tencent.mm.feature.brandservice.MagicDynamicCardFeatureService$preCleanFileEvent$1
            {
                this.__eventId = 1489935310;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.p0 p0Var = event.f53999g;
                boolean z17 = (p0Var.f7589a & 1) != 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicDynamicCardFeatureService", "hy: received clean event, flag is " + p0Var.f7589a + ", is system " + z17);
                if (z17) {
                    yw.w1.f466487a.b("cleanSystemFiles");
                }
                return false;
            }
        };
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mm.plugin.magicbrush.s7 s7Var = (com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
        s7Var.bj("MagicAdBrandService", vw.q2.f440721a);
        s7Var.bj("MagicBrandService", vw.r2.f440725a);
        s7Var.bj("MagicFinderCard", vw.s2.f440731a);
    }
}
