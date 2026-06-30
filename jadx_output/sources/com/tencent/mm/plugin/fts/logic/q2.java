package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class q2 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public w13.i f137654e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137655f;

    /* renamed from: g, reason: collision with root package name */
    public o13.y f137656g;

    @Override // o13.b, o13.w
    public void a() {
        com.tencent.mm.plugin.fts.logic.n2 n2Var = new com.tencent.mm.plugin.fts.logic.n2(this);
        o13.y yVar = this.f137655f;
        if (yVar != null) {
            ((com.tencent.mm.plugin.fts.t) yVar).b(132072, n2Var);
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.tencent.mm.plugin.fts.logic.p2 p2Var = new com.tencent.mm.plugin.fts.logic.p2(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f137656g).b(-65536, p2Var);
        return p2Var;
    }

    @Override // o13.b, o13.w
    public void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.fts.logic.m2 m2Var = new com.tencent.mm.plugin.fts.logic.m2(this);
        m2Var.f137628n = str;
        m2Var.f137630p = str2;
        m2Var.f137629o = java.lang.System.currentTimeMillis();
        o13.y yVar = this.f137655f;
        if (yVar != null) {
            ((com.tencent.mm.plugin.fts.t) yVar).b(132072, m2Var);
        }
    }

    @Override // o13.b, o13.w
    public void e(java.lang.String str) {
        com.tencent.mm.plugin.fts.logic.o2 o2Var = new com.tencent.mm.plugin.fts.logic.o2(this);
        o2Var.f137644n = str;
        o13.y yVar = this.f137655f;
        if (yVar != null) {
            ((com.tencent.mm.plugin.fts.t) yVar).b(132072, o2Var);
        }
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchSOSHistoryLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Success!");
        this.f137654e = (w13.i) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1024);
        this.f137655f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137656g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f137654e = null;
        this.f137655f = null;
        this.f137656g = null;
        return true;
    }
}
