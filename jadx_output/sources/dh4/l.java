package dh4;

@j95.b
/* loaded from: classes11.dex */
public class l extends i95.w implements fa0.r {

    /* renamed from: d, reason: collision with root package name */
    public dh4.f0 f232541d;

    /* renamed from: f, reason: collision with root package name */
    public dh4.t f232543f;

    /* renamed from: g, reason: collision with root package name */
    public dh4.v f232544g;

    /* renamed from: e, reason: collision with root package name */
    public final dh4.p f232542e = new dh4.p();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f232545h = new dh4.k(this);

    public static dh4.p Ai() {
        return wi().f232542e;
    }

    public static dh4.v Bi() {
        if (wi().f232544g == null) {
            wi().f232544g = new dh4.v();
        }
        return wi().f232544g;
    }

    public static dh4.f0 Di() {
        if (wi().f232541d == null) {
            com.tencent.mm.network.s0 s0Var = wi().f232545h;
            gm0.j1.i();
            gm0.j1.n().a(s0Var);
            wi().f232541d = new dh4.f0();
        }
        return wi().f232541d;
    }

    public static dh4.t Ni() {
        if (wi().f232543f == null) {
            wi().f232543f = new dh4.t();
        }
        return wi().f232543f;
    }

    public static dh4.l wi() {
        return (dh4.l) i95.n0.c(dh4.l.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        dh4.t tVar = (dh4.t) p21.l.a();
        synchronized (tVar) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = tVar.f232583b.f20917d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (bh4.a aVar : (bh4.a[]) tVar.f232583b.f20917d.toArray(new bh4.a[0])) {
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(aVar.f20915e)) {
                        java.util.Iterator it = aVar.f20915e.iterator();
                        boolean z17 = true;
                        while (it.hasNext()) {
                            r45.nk6 nk6Var = (r45.nk6) it.next();
                            java.util.Objects.toString(nk6Var);
                            if (nk6Var.f381474e.equals(c01.z1.r())) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomInfoListMgr", "reset list info and remove self location info");
                                z17 = false;
                            }
                        }
                        if (z17) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            bh4.b bVar = new bh4.b();
            bVar.f20917d = linkedList;
            tVar.e(bVar);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.network.s0 s0Var = this.f232545h;
        gm0.j1.i();
        gm0.j1.n().d(s0Var);
        dh4.f0 f0Var = this.f232541d;
        if (f0Var != null) {
            f0Var.i();
            this.f232541d = null;
        }
    }
}
