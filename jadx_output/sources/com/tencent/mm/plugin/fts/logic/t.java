package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class t extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137677n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f137678o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137679p;

    public t(com.tencent.mm.plugin.fts.logic.l lVar, com.tencent.mm.plugin.fts.logic.m mVar) {
        this.f137679p = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildChatroomIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building chatroom index.");
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f137679p.f137588g.f342198f).o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers;", null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            hashSet.add(cursorWrapper.getString(0));
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137679p.f137589h).e("SELECT chatroomname, memberlist FROM chatroom;", null, 2);
        int i17 = 5;
        while (e17.moveToNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                e17.close();
                this.f137679p.f137588g.j();
                throw new java.lang.InterruptedException();
            }
            java.lang.String string = e17.getString(0);
            java.lang.String string2 = e17.getString(1);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2) && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                java.lang.String[] split = o13.c.f342208a.split(string2);
                this.f137679p.f137592n.put(string, split);
                if (!hashSet.remove(string)) {
                    if (i17 >= 5) {
                        this.f137679p.f137588g.j();
                        this.f137679p.f137588g.h();
                        i17 = 0;
                    }
                    this.f137679p.f137588g.N(string, split);
                    i17++;
                    this.f137677n++;
                }
            }
        }
        e17.close();
        this.f137679p.f137588g.j();
        java.util.Iterator it = hashSet.iterator();
        int i18 = 5;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (i18 >= 5) {
                this.f137679p.f137588g.j();
                this.f137679p.f137588g.h();
                i18 = 0;
            }
            w13.b bVar = this.f137679p.f137588g;
            bVar.f442205t.bindString(1, str);
            bVar.f442205t.execute();
            i18++;
            this.f137678o++;
        }
        this.f137679p.f137588g.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{new: %d removed: %d}", java.lang.Integer.valueOf(this.f137677n), java.lang.Integer.valueOf(this.f137678o));
    }

    @Override // p13.c
    public int k() {
        return 3;
    }
}
