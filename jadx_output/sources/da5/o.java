package da5;

/* loaded from: classes12.dex */
public final class o extends com.tencent.mm.sdk.event.n implements ea5.i {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent event = (com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffLoginListener", "call udr login");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UDRAffLoginListener", "call udr login fail. account not ready.");
            return false;
        }
        da5.r.f227817a.c();
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffLoginListener", "call udr dealAccountIn");
        com.tencent.wechat.aff.udr.t tVar = new com.tencent.wechat.aff.udr.t();
        tVar.f217573d = j62.e.g().i("clicfg_udr_version_change_period", 0, true, true);
        tVar.f217574e[1] = true;
        com.tencent.wechat.aff.udr.a aVar = com.tencent.wechat.aff.udr.a.f217529b;
        java.lang.String j17 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j17, "getUinString(...)");
        aVar.e(java.lang.Long.parseLong(j17), tVar);
        ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.udr.e1.f196480e;
        if (concurrentHashMap != null) {
            for (java.util.Map.Entry entry : kz5.c1.s(concurrentHashMap).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ea5.l lVar = (ea5.l) entry.getValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffLoginListener", "registerCppProject projectId:" + str + ", value.Period:" + lVar.addToPeriod());
                com.tencent.wechat.aff.udr.a.f217529b.o(str, lVar.addToPeriod(), lVar.getParameter(), new com.tencent.wechat.aff.udr.g(lVar));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffLoginListener", "call udr login end");
        ((ku5.t0) ku5.t0.f312615d).h(da5.n.f227813d, "UDRCleanAll");
        return true;
    }
}
