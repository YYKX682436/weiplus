package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class m3 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137632e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137633f;

    /* renamed from: g, reason: collision with root package name */
    public w13.k f137634g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f137635h;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.tencent.mm.plugin.fts.logic.k3 k3Var = new com.tencent.mm.plugin.fts.logic.k3(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f137633f).b(-65536, k3Var);
        return k3Var;
    }

    @Override // o13.b, o13.w
    public void d(java.lang.String str, p13.y yVar, int i17, java.util.HashMap hashMap) {
        com.tencent.mm.plugin.fts.logic.l3 l3Var = new com.tencent.mm.plugin.fts.logic.l3(this, null);
        l3Var.f137619n = str;
        l3Var.f137620o = yVar;
        l3Var.f137621p = i17;
        l3Var.f137622q = hashMap;
        ((com.tencent.mm.plugin.fts.t) this.f137632e).b(65626, l3Var);
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchTopHitsLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Success!");
        this.f137635h = new java.util.HashSet();
        this.f137634g = (w13.k) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1);
        this.f137632e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137633f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        ((com.tencent.mm.plugin.fts.t) this.f137632e).b(65626, new com.tencent.mm.plugin.fts.logic.j3(this, null));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        java.util.HashSet hashSet = this.f137635h;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f137634g = null;
        this.f137632e = null;
        this.f137633f = null;
        return true;
    }

    public void j(java.lang.String str) {
        if (this.f137635h.add(str)) {
            w13.k kVar = this.f137634g;
            kVar.f442223t.bindLong(1, 1L);
            kVar.f442223t.bindString(2, str);
            kVar.f442223t.execute();
        }
    }
}
