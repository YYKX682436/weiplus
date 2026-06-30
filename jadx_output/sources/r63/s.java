package r63;

/* loaded from: classes14.dex */
public final class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent event = (com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.j()) {
            r63.n nVar = r63.n.f393042a;
            if (r63.n.f393052k == null) {
                r63.n.f393052k = java.lang.Boolean.valueOf(j62.e.g().l("clicfg_global_page_lifecycle_open_config", true, true, true));
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "isOpenLifecycleMonitor: " + r63.n.f393052k);
            }
            java.lang.Boolean bool = r63.n.f393052k;
            if (bool != null ? bool.booleanValue() : false) {
                vp1.i iVar = vp1.i.f438889a;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.i.f438897i;
                if (!copyOnWriteArrayList.contains(nVar)) {
                    copyOnWriteArrayList.add(nVar);
                }
                r63.p pVar = r63.n.f393043b;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(pVar);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Application");
                ((android.app.Application) context).registerActivityLifecycleCallbacks(new r63.o(pVar));
                r63.l lVar = r63.l.f393022a;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(r63.l.f393041t, intentFilter);
            }
        }
        return false;
    }
}
