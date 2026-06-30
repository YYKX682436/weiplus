package fq3;

@j95.b
/* loaded from: classes12.dex */
public class n extends jm0.o implements gq3.e {
    public sq3.b A;
    public pq3.j B;
    public final xg3.h0 C = new fq3.j(this);
    public final l75.z0 D = new fq3.k(this);
    public final l75.z0 E = new fq3.l(this);

    /* renamed from: m, reason: collision with root package name */
    public long f265528m;

    /* renamed from: n, reason: collision with root package name */
    public kq3.h f265529n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.priority.model.c2c.img.e f265530o;

    /* renamed from: p, reason: collision with root package name */
    public nq3.f f265531p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.priority.model.c2c.img.f f265532q;

    /* renamed from: r, reason: collision with root package name */
    public nq3.g f265533r;

    /* renamed from: s, reason: collision with root package name */
    public mq3.d f265534s;

    /* renamed from: t, reason: collision with root package name */
    public mq3.c f265535t;

    /* renamed from: u, reason: collision with root package name */
    public kq3.l f265536u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.priority.model.c2c.img.d f265537v;

    /* renamed from: w, reason: collision with root package name */
    public nq3.e f265538w;

    /* renamed from: x, reason: collision with root package name */
    public mq3.b f265539x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.priority.model.c2c.img.c f265540y;

    /* renamed from: z, reason: collision with root package name */
    public nq3.d f265541z;

    public static void Zi(fq3.n nVar, xg3.l0 l0Var) {
        nVar.getClass();
        boolean equals = l0Var.f454411b.equals("insert");
        java.util.ArrayList arrayList = l0Var.f454412c;
        int i17 = 0;
        if (!equals) {
            java.lang.String str = l0Var.f454411b;
            if (!str.equals("update")) {
                if (str.equals("delete")) {
                    while (i17 < arrayList.size()) {
                        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList.get(i17);
                        if (f9Var.A0() == 0) {
                            nVar.aj().V6(f9Var);
                        }
                        i17++;
                    }
                    return;
                }
                return;
            }
            while (i17 < arrayList.size()) {
                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) arrayList.get(i17);
                if (f9Var2.A0() == 0) {
                    if (f9Var2.k2()) {
                        nVar.aj().U6(f9Var2);
                    }
                    if (f9Var2.getType() == 268445456) {
                        nVar.aj().V6(f9Var2);
                    }
                }
                i17++;
            }
            return;
        }
        while (i17 < arrayList.size()) {
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) arrayList.get(i17);
            if (f9Var3.A0() == 0) {
                nVar.aj().U6(f9Var3);
            }
            int A0 = f9Var3.A0();
            oq3.i iVar = oq3.k.f347394a;
            if (A0 == 0 && f9Var3.J2()) {
                if (iVar.c(1, f9Var3.Q0()) == 0) {
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).getClass();
                    if (gm0.j1.a()) {
                        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar2.requireAccountInitialized();
                        if (nVar2.f265536u != null) {
                            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar3.requireAccountInitialized();
                            nVar3.f265536u.a(new tq3.b(f9Var3));
                        }
                    }
                }
            } else if (f9Var3.A0() == 0 && f9Var3.k2() && iVar.c(4, f9Var3.Q0()) == 0) {
                fq3.w wVar = (fq3.w) ((bx1.t) i95.n0.c(bx1.t.class));
                wVar.getClass();
                if (gm0.j1.a()) {
                    fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar4.requireAccountInitialized();
                    if (nVar4.f265536u != null) {
                        fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar5.requireAccountInitialized();
                        nVar5.f265536u.a(new fq3.s(wVar, f9Var3));
                    }
                }
            }
            nVar.requireAccountInitialized();
            if (nVar.f265539x != null) {
                if (f9Var3.A0() == 1) {
                    nVar.requireAccountInitialized();
                    mq3.b bVar = nVar.f265539x;
                    java.lang.String Q0 = f9Var3.Q0();
                    bVar.getClass();
                    fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar6.requireAccountInitialized();
                    nVar6.f265536u.a(new mq3.a(bVar, Q0, 1));
                } else {
                    nVar.requireAccountInitialized();
                    mq3.b bVar2 = nVar.f265539x;
                    java.lang.String Q02 = f9Var3.Q0();
                    bVar2.getClass();
                    fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar7.requireAccountInitialized();
                    nVar7.f265536u.a(new mq3.a(bVar2, Q02, 3));
                }
            }
            i17++;
        }
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(oq3.g.class);
        set.add(sq3.f.class);
        set.add(oq3.c.class);
    }

    @Override // jm0.o
    public void Ri(android.content.Context context) {
        new fq3.m(this, null).run();
        q25.b.b(new kq3.g(), "//priority");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.D);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.E);
    }

    @Override // jm0.o
    public void Vi() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.D);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.E);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.C);
        pq3.j jVar = this.B;
        if (jVar != null) {
            jVar.f357644i.dead();
        }
        com.tencent.mm.plugin.priority.model.c2c.img.c cVar = this.f265540y;
        if (cVar != null) {
            cVar.f153173d = 0L;
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(cVar);
            cVar.f153181o.dead();
            this.f265540y = null;
        }
        com.tencent.mm.plugin.priority.model.c2c.img.d dVar = this.f265537v;
        if (dVar != null) {
            dVar.getClass();
            this.f265537v = null;
        }
        kq3.l lVar = this.f265536u;
        if (lVar != null) {
            ((java.util.LinkedList) lVar.f311278a).clear();
            lVar.f311279b.removeCallbacksAndMessages(null);
            lVar.f311279b.quit();
            lVar.f311279b = null;
            this.f265536u = null;
        }
        com.tencent.mm.plugin.priority.model.c2c.img.e eVar = this.f265530o;
        if (eVar != null) {
            eVar.f153183b.close();
            eVar.f153184c.close();
            eVar.f153186e.close();
            eVar.f153187f.close();
            eVar.f153188g.close();
            eVar.f153189h.close();
            eVar.f153185d.close();
            this.f265530o = null;
        }
        com.tencent.mm.plugin.priority.model.c2c.img.f fVar = this.f265532q;
        if (fVar != null) {
            fVar.f320457b.close();
            fVar.f320458c.close();
            fVar.f320459d.close();
        }
        kq3.h hVar = this.f265529n;
        if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = hVar.f311273a;
            objArr[0] = sQLiteDatabase;
            objArr[1] = java.lang.Boolean.valueOf(sQLiteDatabase != null ? sQLiteDatabase.isOpen() : false);
            com.tencent.mars.xlog.Log.w("MicroMsg.Priority.PriorityDB", "close db:%s isOpen:%b ", objArr);
            com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = hVar.f311273a;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Priority.PriorityDB", "close in trans :%b ", java.lang.Boolean.valueOf(hVar.f311273a.inTransaction()));
                while (hVar.f311273a.inTransaction()) {
                    hVar.f311273a.endTransaction();
                }
                hVar.f311274b.close();
                hVar.f311275c.close();
                hVar.f311276d.close();
                hVar.f311273a.close();
                hVar.f311273a = null;
            }
            this.f265529n = null;
        }
    }

    public oq3.c aj() {
        if (!jm0.g.class.isAssignableFrom(oq3.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(oq3.c.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (oq3.c) ((jm0.g) a17);
    }

    public oq3.g bj() {
        if (!jm0.g.class.isAssignableFrom(oq3.g.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(oq3.g.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (oq3.g) ((jm0.g) a17);
    }

    public sq3.f cj() {
        if (!jm0.g.class.isAssignableFrom(sq3.f.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(sq3.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sq3.f) ((jm0.g) a17);
    }
}
