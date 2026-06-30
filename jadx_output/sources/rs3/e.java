package rs3;

/* loaded from: classes5.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs3.h f399335d;

    public e(rs3.h hVar) {
        this.f399335d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_READERAPP_REPORT_TIMESTAMP_LONG, 0L)).longValue() >= 604800000) {
            gm0.j1.i();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0;
            rs3.h hVar = this.f399335d;
            if (z17) {
                rs3.h.wi(hVar);
            } else {
                gm0.j1.d().a(138, hVar.f399338d);
            }
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() == c01.z1.E() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((ku5.t0) ku5.t0.f312615d).k(new rs3.f(false), 5000L);
        }
    }
}
