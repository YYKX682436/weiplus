package com.tencent.mm.plugin.hp.model;

/* loaded from: classes11.dex */
public class TinkerBootsActivateListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public static long f142402d;

    public TinkerBootsActivateListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = -1435144905;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
        if (!activateEvent.f53964g.f6412a && gm0.j1.a()) {
            if (f142402d == 0) {
                f142402d = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, 0L)).longValue();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - f142402d >= 21600000) {
                try {
                    if (fy5.a.d() != null) {
                        fy5.a.d().a(false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerBootsActivateListener", "callback post task and fetchPatchUpdate false");
                        f142402d = currentTimeMillis;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.TinkerBootsActivateListener", th6, "failure.", new java.lang.Object[0]);
                }
            }
        }
        return false;
    }
}
