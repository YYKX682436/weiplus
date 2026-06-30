package dk2;

/* loaded from: classes3.dex */
public final class rd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.rd f234036d = new dk2.rd();

    public rd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heartBeatGuard it.isLiveStarted():");
            sb6.append(((mm2.c1) e1Var.business(mm2.c1.class)).a8());
            sb6.append(" heartbeatGuardEnable:");
            sb6.append(dk2.x7.f234334a > 0);
            sb6.append(" liveId:");
            r45.nw1 nw1Var = e1Var.f328988r;
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
            sb6.append(" HEART_BEAT_GUARD_INTERVAL:");
            sb6.append(dk2.x7.f234334a);
            com.tencent.mars.xlog.Log.i("FinderLiveGuard", sb6.toString());
            if (dk2.x7.f234334a > 0) {
                if (((mm2.c1) e1Var.business(mm2.c1.class)).a8()) {
                    r45.nw1 nw1Var2 = e1Var.f328988r;
                    dk2.xc xcVar = new dk2.xc(nw1Var2 != null ? nw1Var2.getLong(0) : 0L);
                    wu5.c cVar = dk2.x7.f234335b;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    long j17 = dk2.x7.f234334a;
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    dk2.x7.f234335b = t0Var.z(xcVar, j17, false);
                } else {
                    wu5.c cVar2 = dk2.x7.f234335b;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
