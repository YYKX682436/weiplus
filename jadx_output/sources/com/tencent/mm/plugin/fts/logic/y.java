package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class y extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137738n;

    /* renamed from: o, reason: collision with root package name */
    public int f137739o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137740p;

    public y(com.tencent.mm.plugin.fts.logic.l lVar, java.lang.String str) {
        this.f137740p = lVar;
        this.f137738n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f137738n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Delete Contact %s", str);
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137740p;
        w13.b bVar = lVar.f137588g;
        int[] iArr = o13.d.f342224j;
        bVar.m0(iArr, str);
        ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij().f137634g.m0(iArr, str);
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) lVar.f137588g.f342198f).o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new java.lang.String[]{str});
        java.util.HashSet hashSet = new java.util.HashSet();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            hashSet.add(cursorWrapper.getString(0));
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!lVar.f137591m.containsKey(str2)) {
                lVar.f137591m.put(str2, lVar.f137588g.w(o13.d.f342224j, str2, 1));
                ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij().j(str2);
                this.f137739o++;
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s mDirtyCount: %d}", this.f137738n, java.lang.Integer.valueOf(this.f137739o));
    }
}
