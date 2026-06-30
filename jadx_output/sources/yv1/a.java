package yv1;

/* loaded from: classes12.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.l lVar = event.f53972g;
        if ((lVar.f7202a & 8) == 0 || lVar.f7203b) {
            return false;
        }
        ft.w3 w3Var = (ft.w3) i95.n0.c(ft.w3.class);
        w3Var.getClass();
        ((com.tencent.mm.plugin.appbrand.j0) w3Var).wi("ACTION_CLEAN_APPBRAND_COMMON_SPACE", false);
        ((com.tencent.mm.plugin.appbrand.j0) w3Var).wi("ACTION_CLEAN_ALL_APPBRAND_SPACE", false);
        return true;
    }
}
