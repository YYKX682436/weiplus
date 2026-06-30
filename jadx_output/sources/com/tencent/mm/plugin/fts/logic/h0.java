package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class h0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137555o;

    public h0(com.tencent.mm.plugin.fts.logic.l lVar, long j17) {
        this.f137555o = lVar;
        this.f137554n = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "MarkLabelDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        if (!this.f137555o.f137594p.containsKey(java.lang.Long.valueOf(this.f137554n))) {
            this.f137555o.f137594p.put(java.lang.Long.valueOf(this.f137554n), this.f137555o.f137588g.w(o13.d.f342226l, java.lang.String.valueOf(this.f137554n), 1));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(32);
        w13.b bVar = this.f137555o.f137588g;
        long j17 = this.f137554n;
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o("SELECT user FROM FTS5ContactLabels WHERE label_id=?;", new java.lang.String[]{java.lang.Long.toString(j17)});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            arrayList.add(cursorWrapper.getString(0));
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f137555o.f137591m.containsKey(str)) {
                this.f137555o.f137591m.put(str, this.f137555o.f137588g.w(o13.d.f342225k, str, 1));
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{mLabelId: %d mContactCount: %d}", java.lang.Long.valueOf(this.f137554n), 0);
    }
}
