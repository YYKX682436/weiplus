package m32;

/* loaded from: classes13.dex */
public class u extends com.tencent.mm.sdk.event.n {
    public u() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = (com.tencent.mm.autogen.events.LogoutEvent) iEvent;
        if (!(logoutEvent instanceof com.tencent.mm.autogen.events.LogoutEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("RtosLogoutEvent", "Logout Event callback. reason:%d ", java.lang.Integer.valueOf(logoutEvent.f54484g.f6836a));
        int i18 = logoutEvent.f54484g.f6836a;
        if (i18 != 0 && i18 != 1 && i18 != 3) {
            return false;
        }
        my3.q qVar = (my3.q) ((fy3.e) i95.n0.c(fy3.e.class));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332822e) && !com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332821d) && ((i17 = qVar.f332824g.f313617d) == 1 || i17 == 10)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "logout");
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.v.class);
            qVar.oj();
        }
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).Vi();
        return false;
    }
}
