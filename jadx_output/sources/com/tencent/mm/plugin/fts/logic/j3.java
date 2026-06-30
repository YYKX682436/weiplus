package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class j3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137572n;

    /* renamed from: o, reason: collision with root package name */
    public int f137573o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.m3 f137574p;

    public j3(com.tencent.mm.plugin.fts.logic.m3 m3Var, com.tencent.mm.plugin.fts.logic.i3 i3Var) {
        this.f137574p = m3Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildTopHitsIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f137573o = this.f137574p.f137634g.O();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 5184000000L;
        w13.k kVar = this.f137574p.f137634g;
        java.lang.String format = java.lang.String.format("SELECT docid FROM %s WHERE timestamp < ? OR score = 0;", kVar.r());
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) kVar.f342198f).o(format, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                kVar.m(linkedList);
                this.f137572n = linkedList.size();
                return true;
            }
            linkedList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{topHitsUpdateCount: %d deleteExpiredCount: %d}", java.lang.Integer.valueOf(this.f137573o), java.lang.Integer.valueOf(this.f137572n));
    }
}
