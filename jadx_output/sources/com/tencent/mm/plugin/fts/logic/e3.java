package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class e3 extends o13.b implements xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137514e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137515f;

    /* renamed from: g, reason: collision with root package name */
    public o13.v f137516g;

    /* renamed from: h, reason: collision with root package name */
    public w13.j f137517h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f137518i = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137519m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137520n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137521o;

    /* renamed from: p, reason: collision with root package name */
    public final p13.n f137522p;

    public e3() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137519m = new com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1(this, a0Var);
        this.f137520n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$2
            {
                this.__eventId = -1435144905;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
                boolean z17 = activateEvent.f53964g.f6412a;
                com.tencent.mm.plugin.fts.logic.e3 e3Var = com.tencent.mm.plugin.fts.logic.e3.this;
                if (z17) {
                    e3Var.f137521o.d();
                    return false;
                }
                e3Var.f137521o.c(30000L, 30000L);
                return false;
            }
        };
        this.f137521o = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.fts.logic.s2(this), false);
        this.f137522p = new com.tencent.mm.plugin.fts.logic.t2(this);
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c z2Var;
        switch (uVar.f351140b) {
            case 10:
                z2Var = new com.tencent.mm.plugin.fts.logic.z2(this, uVar, false);
                break;
            case 11:
                z2Var = new com.tencent.mm.plugin.fts.logic.z2(this, uVar, true);
                break;
            case 12:
                z2Var = new com.tencent.mm.plugin.fts.logic.b3(this, uVar);
                break;
            default:
                z2Var = new com.tencent.mm.plugin.fts.logic.a3(this, uVar);
                break;
        }
        ((com.tencent.mm.plugin.fts.t) this.f137515f).b(-65536, z2Var);
        return z2Var;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f470458d) {
            return;
        }
        boolean equals = "notifymessage".equals(l0Var.f454410a);
        java.lang.String str = l0Var.f454410a;
        if (equals || "gh_3dfda90e39d6".equals(str)) {
            java.lang.String str2 = l0Var.f454411b;
            boolean equals2 = str2.equals("insert");
            int i17 = 0;
            java.util.ArrayList arrayList = l0Var.f454412c;
            if (equals2) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i17 < arrayList.size()) {
                    arrayList2.add((com.tencent.mm.storage.f9) arrayList.get(i17));
                    i17++;
                }
                if (arrayList2.size() > 0) {
                    ((com.tencent.mm.plugin.fts.t) this.f137514e).b(65576, new com.tencent.mm.plugin.fts.logic.x2(this, arrayList2, str));
                    return;
                }
                return;
            }
            if (str2.equals("delete")) {
                if (arrayList == null || arrayList.isEmpty()) {
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(str) == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "clear all record");
                        ((com.tencent.mm.plugin.fts.t) this.f137514e).b(65576, new com.tencent.mm.plugin.fts.logic.v2(this, null));
                        return;
                    }
                    return;
                }
                while (i17 < arrayList.size()) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList.get(i17);
                    ((com.tencent.mm.plugin.fts.t) this.f137514e).b(65576, new com.tencent.mm.plugin.fts.logic.w2(this, f9Var.getMsgId()));
                    i17++;
                }
            }
        }
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchServiceNotifyLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Success!");
        this.f137517h = (w13.j) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX);
        this.f137514e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137515f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        this.f137516g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f137520n.alive();
        this.f137519m.alive();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        this.f137520n.dead();
        this.f137519m.dead();
        this.f137517h = null;
        this.f137514e = null;
        this.f137515f = null;
        this.f137521o.d();
        return true;
    }
}
