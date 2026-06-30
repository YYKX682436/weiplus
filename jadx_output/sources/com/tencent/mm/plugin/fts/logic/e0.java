package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class e0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137508n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137509o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137510p = false;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137511q;

    public e0(com.tencent.mm.plugin.fts.logic.l lVar, java.lang.String str) {
        this.f137511q = lVar;
        this.f137508n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "MarkContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f137508n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Dirty Contact %s", str);
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137511q;
        if (lVar.f137591m.containsKey(str)) {
            this.f137509o = true;
            return true;
        }
        lVar.f137588g.J(str);
        java.util.List w17 = lVar.f137588g.w(o13.d.f342224j, str, 1);
        lVar.f137591m.put(str, w17);
        if (((java.util.ArrayList) w17).isEmpty()) {
            this.f137510p = true;
            ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.a0(lVar, str));
            return true;
        }
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
            lVar.f137588g.J(str2);
            if (!lVar.f137591m.containsKey(str2)) {
                lVar.f137591m.put(str2, lVar.f137588g.w(o13.d.f342224j, str2, 1));
            }
        }
        lVar.f137590i.remove(str);
        ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij().j(str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s cached: %b isSkipped: %b}", this.f137508n, java.lang.Boolean.valueOf(this.f137509o), java.lang.Boolean.valueOf(this.f137510p));
    }

    @Override // p13.c
    public int k() {
        return 17;
    }
}
