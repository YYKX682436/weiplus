package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class s1 extends o13.b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137664e;

    /* renamed from: f, reason: collision with root package name */
    public w13.g f137665f;

    /* renamed from: g, reason: collision with root package name */
    public final int f137666g = 131094;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f137667h = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: i, reason: collision with root package name */
    public final long f137668i = 5000;

    /* renamed from: m, reason: collision with root package name */
    public final int f137669m = 3;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f137670n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final l75.z0 f137671o = new com.tencent.mm.plugin.fts.logic.p1(this);

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f137672p = new com.tencent.mm.plugin.fts.logic.q1(this);

    /* renamed from: q, reason: collision with root package name */
    public final l75.z0 f137673q = new com.tencent.mm.plugin.fts.logic.o1(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137674r = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.fts.logic.r1(this), false);

    public static final void j(com.tencent.mm.plugin.fts.logic.s1 s1Var, com.tencent.mm.storage.z3 z3Var) {
        long j17;
        w13.g gVar;
        w13.g gVar2;
        o13.v fj6;
        s1Var.getClass();
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        if (zVar == null || (fj6 = ((com.tencent.mm.plugin.fts.d0) zVar).fj()) == null) {
            j17 = 0;
        } else {
            java.lang.String d17 = z3Var.d1();
            if (d17 == null) {
                d17 = "";
            }
            j17 = ((com.tencent.mm.plugin.fts.p) fj6).b(d17);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.P0())) {
            return;
        }
        w13.g gVar3 = s1Var.f137665f;
        if (gVar3 != null) {
            gVar3.m0(new int[]{131090}, z3Var.d1());
        }
        w13.g gVar4 = s1Var.f137665f;
        if (gVar4 != null) {
            gVar4.u(131090, 1, 0L, z3Var.d1(), j17, z3Var.P0());
        }
        java.lang.String i17 = o13.n.i(z3Var.P0(), false);
        java.lang.String i18 = o13.n.i(z3Var.P0(), true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i17) && (gVar2 = s1Var.f137665f) != null) {
            gVar2.u(131090, 2, 0L, z3Var.d1(), j17, i17);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i18) || (gVar = s1Var.f137665f) == null) {
            return;
        }
        gVar.u(131090, 3, 0L, z3Var.d1(), j17, i18);
    }

    public static final void k(com.tencent.mm.plugin.fts.logic.s1 s1Var, dm.u8 u8Var, int i17) {
        long j17;
        w13.g gVar;
        w13.g gVar2;
        w13.g gVar3;
        w13.g gVar4;
        o13.v fj6;
        s1Var.getClass();
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        if (zVar == null || (fj6 = ((com.tencent.mm.plugin.fts.d0) zVar).fj()) == null) {
            j17 = 0;
        } else {
            java.lang.String str = u8Var.field_username;
            if (str == null) {
                str = "";
            }
            j17 = ((com.tencent.mm.plugin.fts.p) fj6).b(str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(u8Var.field_nickname)) {
            return;
        }
        w13.g gVar5 = s1Var.f137665f;
        if (gVar5 != null) {
            gVar5.m0(new int[]{131089}, u8Var.field_username);
        }
        w13.g gVar6 = s1Var.f137665f;
        if (gVar6 != null) {
            gVar6.u(131089, 1, 0L, u8Var.field_username, j17, u8Var.field_nickname);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u8Var.field_nicknamePyQuanPin) && (gVar4 = s1Var.f137665f) != null) {
            gVar4.u(131089, 2, 0L, u8Var.field_username, j17, u8Var.field_nicknamePyQuanPin);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u8Var.field_nicknamePyQuanPin) && (gVar3 = s1Var.f137665f) != null) {
            gVar3.u(131089, 3, 0L, u8Var.field_username, j17, u8Var.field_nicknamePyInit);
        }
        java.lang.String fj7 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(u8Var.field_openImAppId, u8Var.field_openImDescWordingId);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(fj7);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = s1Var.f137670n;
        if (K0) {
            if (i17 <= 0) {
                concurrentHashMap.remove(u8Var.field_username);
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTS5SearchKefuContactLogic", "get desc fail, %s, %s, %s", u8Var.field_nickname, u8Var.field_openImAppId, u8Var.field_openImDescWordingId);
                return;
            } else {
                java.lang.String field_username = u8Var.field_username;
                kotlin.jvm.internal.o.f(field_username, "field_username");
                concurrentHashMap.put(field_username, java.lang.Integer.valueOf(i17 - 1));
                return;
            }
        }
        w13.g gVar7 = s1Var.f137665f;
        if (gVar7 != null) {
            gVar7.u(131089, 58, 0L, u8Var.field_username, j17, fj7);
        }
        java.lang.String i18 = o13.n.i(fj7, false);
        java.lang.String i19 = o13.n.i(fj7, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i18) && (gVar2 = s1Var.f137665f) != null) {
            gVar2.u(131089, 59, 0L, u8Var.field_username, j17, i18);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i19) && (gVar = s1Var.f137665f) != null) {
            gVar.u(131089, 60, 0L, u8Var.field_username, j17, i19);
        }
        concurrentHashMap.remove(u8Var.field_username);
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        o13.y yVar = this.f137664e;
        if (uVar == null || yVar == null) {
            kotlin.jvm.internal.o.f(null, "search(...)");
            throw null;
        }
        int i17 = uVar.f351140b;
        if (i17 == 112) {
            com.tencent.mm.plugin.fts.logic.k1 k1Var = new com.tencent.mm.plugin.fts.logic.k1(this, uVar);
            ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, k1Var);
            return k1Var;
        }
        if (i17 == 113) {
            com.tencent.mm.plugin.fts.logic.k1 k1Var2 = new com.tencent.mm.plugin.fts.logic.k1(this, uVar);
            ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, k1Var2);
            return k1Var2;
        }
        if (i17 == 769) {
            com.tencent.mm.plugin.fts.logic.l1 l1Var = new com.tencent.mm.plugin.fts.logic.l1(this, uVar);
            ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, l1Var);
            return l1Var;
        }
        if (i17 != 771) {
            kotlin.jvm.internal.o.d(null);
            throw null;
        }
        com.tencent.mm.plugin.fts.logic.j1 j1Var = new com.tencent.mm.plugin.fts.logic.j1(this, uVar);
        ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, j1Var);
        return j1Var;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchKefuContactLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "Create Success!");
        this.f137664e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        ((o13.z) i95.n0.c(o13.z.class)).getClass();
        o13.u cj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(6);
        this.f137665f = cj6 instanceof w13.g ? (w13.g) cj6 : null;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.f137671o);
        ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Di().add(this.f137672p);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f137673q);
        o13.y yVar = this.f137664e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.fts.t) yVar).b(this.f137666g, new com.tencent.mm.plugin.fts.logic.g1(this));
        }
        gm0.j1.d().a(453, this);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.f137671o);
        j41.c0 c0Var = (j41.c0) i95.n0.c(j41.c0.class);
        ((i41.l) c0Var).Di().remove(this.f137672p);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f137673q);
        gm0.j1.d().q(453, this);
        this.f137665f = null;
        this.f137664e = null;
        this.f137667h.clear();
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ab0.u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "NetSceneGetOpenIMResource try update openIM kefu desc");
            for (java.util.Map.Entry entry : this.f137670n.entrySet()) {
                o13.y yVar = this.f137664e;
                if (yVar != null) {
                    ((com.tencent.mm.plugin.fts.t) yVar).b(this.f137666g + 1, new com.tencent.mm.plugin.fts.logic.i1(this, (java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue()));
                }
            }
        }
    }
}
