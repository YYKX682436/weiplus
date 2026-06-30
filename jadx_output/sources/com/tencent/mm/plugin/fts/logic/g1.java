package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class g1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137547n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137548o;

    public g1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137548o = s1Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildKefuContactIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.g gVar;
        w13.g gVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "BuildKefuContactIndexTask execute");
        w13.g gVar3 = this.f137548o.f137665f;
        android.database.Cursor cursor = null;
        if (gVar3 != null) {
            java.lang.String format = java.lang.String.format("SELECT DISTINCT aux_index FROM %s;", java.util.Arrays.copyOf(new java.lang.Object[]{gVar3.r()}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            cursor = ((com.tencent.mm.plugin.fts.o) gVar3.f342198f).o(format, null);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = false;
        if (cursor != null) {
            while (true) {
                android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) cursor;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                hashSet.add(cursorWrapper.getString(0));
            }
            ((com.tencent.mm.plugin.fts.e) cursor).close();
        }
        java.util.List k17 = dm.u8.C.i().a().k(gm0.j1.u().f273153f, dm.u8.class);
        p75.i0 i17 = dm.e2.N1.i();
        i17.f352657d = dm.e2.P1.p("'%@app'");
        java.util.List k18 = i17.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class);
        w13.g gVar4 = this.f137548o.f137665f;
        if (!(gVar4 != null && ((com.tencent.mm.plugin.fts.o) gVar4.f342198f).m()) && (gVar2 = this.f137548o.f137665f) != null) {
            gVar2.h();
        }
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137548o;
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            dm.u8 u8Var = (dm.u8) it.next();
            if (hashSet.add(u8Var.field_username)) {
                com.tencent.mm.plugin.fts.logic.s1.k(s1Var, u8Var, 0);
                this.f137547n++;
            }
        }
        com.tencent.mm.plugin.fts.logic.s1 s1Var2 = this.f137548o;
        java.util.Iterator it6 = ((java.util.ArrayList) k18).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it6.next();
            if (hashSet.add(z3Var.d1())) {
                com.tencent.mm.plugin.fts.logic.s1.j(s1Var2, z3Var);
                this.f137547n++;
            }
        }
        w13.g gVar5 = this.f137548o.f137665f;
        if (gVar5 != null && ((com.tencent.mm.plugin.fts.o) gVar5.f342198f).m()) {
            z17 = true;
        }
        if (z17 && (gVar = this.f137548o.f137665f) != null) {
            gVar.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "add kefu contact index count: " + this.f137547n;
    }
}
