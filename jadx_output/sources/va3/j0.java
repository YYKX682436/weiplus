package va3;

@j95.b
/* loaded from: classes12.dex */
public class j0 extends i95.w implements fa0.s {

    /* renamed from: d, reason: collision with root package name */
    public va3.s f434315d;

    /* renamed from: e, reason: collision with root package name */
    public va3.v0 f434316e = null;

    /* renamed from: f, reason: collision with root package name */
    public va3.z0 f434317f = null;

    /* renamed from: g, reason: collision with root package name */
    public va3.f0 f434318g = null;

    /* renamed from: h, reason: collision with root package name */
    public va3.i0 f434319h = null;

    /* renamed from: i, reason: collision with root package name */
    public va3.g0 f434320i = null;

    public static va3.s Ai() {
        gm0.j1.b().c();
        if (wi().f434315d == null) {
            wi().f434315d = new va3.s();
        }
        return wi().f434315d;
    }

    public static va3.f0 Bi() {
        if (wi().f434318g == null) {
            wi().f434318g = new va3.f0();
        }
        return wi().f434318g;
    }

    public static va3.g0 Di() {
        gm0.j1.b().c();
        if (wi().f434320i == null) {
            wi().f434320i = new va3.g0();
        }
        return wi().f434320i;
    }

    public static va3.i0 Ni() {
        gm0.j1.b().c();
        if (wi().f434319h == null) {
            wi().f434319h = new va3.i0();
        }
        return wi().f434319h;
    }

    public static va3.v0 Ri() {
        if (wi().f434316e == null) {
            wi().f434316e = new va3.v0();
        }
        return wi().f434316e;
    }

    public static va3.z0 Ui() {
        if (wi().f434317f == null) {
            wi().f434317f = new va3.z0();
        }
        return wi().f434317f;
    }

    public static va3.j0 wi() {
        return (va3.j0) i95.n0.c(va3.j0.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        va3.z0 z0Var = (va3.z0) q21.d.a();
        synchronized (z0Var) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = z0Var.f434397b.f425975d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (ua3.a aVar : (ua3.a[]) z0Var.f434397b.f425975d.toArray(new ua3.a[0])) {
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(aVar.f425970e)) {
                        java.util.Iterator it = aVar.f425970e.iterator();
                        boolean z17 = true;
                        while (it.hasNext()) {
                            if (((java.lang.String) it.next()).equals(c01.z1.r())) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TrackRoomListMgr", "reset list info and remove self location info");
                                z17 = false;
                            }
                        }
                        if (z17) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            ua3.b bVar = new ua3.b();
            bVar.f425975d = linkedList;
            bVar.f425976e = z0Var.f434397b.f425976e;
            z0Var.d(bVar);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        va3.v0 v0Var = this.f434316e;
        if (v0Var != null) {
            v0Var.f434367y = null;
            v0Var.h();
            this.f434316e.b(1);
        }
        va3.f0 f0Var = this.f434318g;
        if (f0Var != null) {
            f0Var.b();
            f0Var.f434280c.clear();
        }
        va3.i0 i0Var = this.f434319h;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "stop static map server");
            gm0.j1.d().q(me1.b.CTRL_INDEX, i0Var);
        }
        va3.g0 g0Var = this.f434320i;
        if (g0Var != null) {
            Ni().c(g0Var);
        }
    }
}
