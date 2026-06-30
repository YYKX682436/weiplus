package m32;

/* loaded from: classes13.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent = (com.tencent.mm.autogen.events.AppActiveEvent) iEvent;
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("RtosOnForegroundListener", "account not ready");
            return false;
        }
        fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(appActiveEvent.f53977g.f7684a);
        my3.q qVar = (my3.q) eVar;
        qVar.getClass();
        boolean booleanValue = valueOf.booleanValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332822e) || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332821d)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onForegroundChange isForeground:%b errorcode:%d", java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(qVar.f332824g.f313617d));
        int i17 = qVar.f332824g.f313617d;
        if (i17 != 1 && i17 != 10) {
            return false;
        }
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCBoolean(booleanValue), iy3.m.class);
        return false;
    }
}
