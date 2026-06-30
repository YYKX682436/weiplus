package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class c0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137476n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f137477o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137478p;

    public c0(com.tencent.mm.plugin.fts.logic.l lVar, com.tencent.mm.plugin.fts.logic.m mVar) {
        this.f137478p = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "LoadLabelCacheTask";
    }

    @Override // p13.c
    public boolean i() {
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f137478p.f137588g.f342198f).o("SELECT user, label_id FROM FTS5ContactLabels;", null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                return true;
            }
            java.lang.String string = cursorWrapper.getString(0);
            long j17 = cursorWrapper.getLong(1);
            java.util.List list = (java.util.List) this.f137478p.f137593o.get(string);
            if (list == null) {
                list = new java.util.ArrayList(16);
                this.f137478p.f137593o.put(string, list);
                this.f137476n++;
            }
            list.add(java.lang.Long.valueOf(j17));
            this.f137477o++;
        }
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{users: %d labels: %d}", java.lang.Integer.valueOf(this.f137476n), java.lang.Integer.valueOf(this.f137477o));
    }
}
