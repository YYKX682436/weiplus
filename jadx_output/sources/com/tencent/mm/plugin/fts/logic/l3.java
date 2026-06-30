package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class l3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f137619n;

    /* renamed from: o, reason: collision with root package name */
    public p13.y f137620o;

    /* renamed from: p, reason: collision with root package name */
    public int f137621p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashMap f137622q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.m3 f137623r;

    public l3(com.tencent.mm.plugin.fts.logic.m3 m3Var, com.tencent.mm.plugin.fts.logic.i3 i3Var) {
        this.f137623r = m3Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "UpdateTopHitsWithQueryTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long j17;
        long j18;
        w13.k kVar = this.f137623r.f137634g;
        java.lang.String str4 = this.f137619n;
        p13.y yVar = this.f137620o;
        int i19 = this.f137621p;
        java.util.HashMap hashMap = this.f137622q;
        kVar.getClass();
        java.lang.String trim = str4.trim();
        hashMap.remove(yVar.f351187e);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i27 = yVar.f351184b;
        if ((i27 == 131072 || i27 == 131075) && kVar.N(yVar.f351187e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5TopHitsStorage", "last contact msg time older than 60 days");
            return true;
        }
        ((com.tencent.mm.plugin.fts.o) kVar.f342198f).a();
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) kVar.f342198f).o(java.lang.String.format("SELECT docid, score FROM %s WHERE query=? AND aux_index=? AND subtype = ? AND scene=?;", kVar.r()), new java.lang.String[]{trim, yVar.f351187e, java.lang.String.valueOf(yVar.f351185c), java.lang.String.valueOf(i19)});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        if (cursorWrapper.moveToNext()) {
            i18 = cursorWrapper.getInt(0);
            i17 = cursorWrapper.getInt(1);
        } else {
            i17 = -1;
            i18 = -1;
        }
        ((com.tencent.mm.plugin.fts.e) o17).close();
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (!((java.lang.String) entry.getValue()).equals("\u200bchatroom_tophits")) {
                str6 = str6 + "'" + ((java.lang.String) entry.getKey()) + "',";
            }
        }
        if (str6.length() > 0) {
            str2 = "MicroMsg.FTS.FTS5TopHitsStorage";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AND aux_index IN (");
            str = trim;
            sb6.append(str6.substring(0, str6.length() - 1));
            sb6.append(")");
            ((com.tencent.mm.plugin.fts.o) kVar.f342198f).i(java.lang.String.format("UPDATE %s SET score=CASE WHEN score > 6 THEN 6 WHEN score > 2 THEN (score - 1) ELSE score END WHERE scene = %d %s;", kVar.r(), java.lang.Integer.valueOf(i19), sb6.toString()));
        } else {
            str = trim;
            str2 = "MicroMsg.FTS.FTS5TopHitsStorage";
        }
        java.lang.String str7 = "";
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            if (((java.lang.String) entry2.getValue()).equals("\u200bchatroom_tophits")) {
                str7 = str7 + "'" + ((java.lang.String) entry2.getKey()) + "',";
            }
        }
        if (str7.length() > 0) {
            ((com.tencent.mm.plugin.fts.o) kVar.f342198f).j(java.lang.String.format("UPDATE %s SET score=CASE WHEN score = 1 THEN 0 WHEN score < 5 THEN (score - 1) ELSE 4 END WHERE query = ? AND scene = %d %s;", kVar.r(), java.lang.Integer.valueOf(i19), "AND aux_index IN(" + str7.substring(0, str7.length() - 1) + ")"), new java.lang.String[]{"\u200bchatroom_tophits"});
        }
        if (i18 < 0 || i17 < 0) {
            kVar.f442221r.bindString(1, yVar.f351190h);
            kVar.f442221r.execute();
            kVar.f442222s.bindLong(1, yVar.f351184b);
            kVar.f442222s.bindLong(2, yVar.f351185c);
            kVar.f442222s.bindLong(3, yVar.f351186d);
            kVar.f442222s.bindString(4, yVar.f351187e);
            kVar.f442222s.bindLong(5, currentTimeMillis);
            str3 = str;
            kVar.f442222s.bindString(6, str3);
            kVar.f442222s.bindLong(7, 3L);
            kVar.f442222s.bindLong(8, i19);
            kVar.f442222s.bindString(9, yVar.f351190h);
            kVar.f442222s.execute();
        } else {
            ((com.tencent.mm.plugin.fts.o) kVar.f342198f).j(java.lang.String.format("UPDATE %s SET score=?, timestamp=? WHERE docid=?", kVar.r()), new java.lang.String[]{java.lang.String.valueOf(i17 > 6 ? i17 + 1 : i17 + 3), java.lang.String.valueOf(currentTimeMillis), java.lang.String.valueOf(i18)});
            str3 = str;
        }
        ((com.tencent.mm.plugin.fts.o) kVar.f342198f).d();
        java.lang.String[] split = o13.c.f342213f.split(str3);
        if (split.length <= 1 || yVar.f351184b != 131075 || yVar.f351185c != 38) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor o18 = ((com.tencent.mm.plugin.fts.o) kVar.f342198f).o(java.lang.String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE aux_index=? AND query=?;", kVar.r()), new java.lang.String[]{yVar.f351187e, "\u200bchatroom_tophits"});
        android.database.CursorWrapper cursorWrapper2 = (android.database.CursorWrapper) o18;
        if (cursorWrapper2.moveToNext()) {
            long j19 = cursorWrapper2.getLong(0);
            cursorWrapper2.getString(1);
            j18 = cursorWrapper2.getLong(2);
            cursorWrapper2.getLong(3);
            cursorWrapper2.getString(4);
            cursorWrapper2.getLong(5);
            cursorWrapper2.getInt(6);
            cursorWrapper2.getInt(7);
            cursorWrapper2.getLong(8);
            java.lang.String string = cursorWrapper2.getString(9);
            for (java.lang.String str8 : o13.c.f342210c.split(string)) {
                hashSet.add(str8);
            }
            str5 = string;
            j17 = j19;
        } else {
            j17 = 0;
            j18 = 0;
        }
        ((com.tencent.mm.plugin.fts.e) o18).close();
        java.lang.String str9 = str5;
        for (int i28 = 0; i28 < ((java.util.ArrayList) yVar.f351196n).size() && i28 < split.length; i28++) {
            p13.l lVar = (p13.l) ((java.util.ArrayList) yVar.f351196n).get(i28);
            if (hashSet.add(lVar.f351112c)) {
                str9 = str9 + lVar.f351112c + "\u200b";
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "update tophits content=%s", str9);
        if (j17 > 0) {
            kVar.l(j17);
        }
        long j27 = i19;
        java.lang.String str10 = yVar.f351187e;
        long j28 = yVar.f351186d;
        int i29 = yVar.f351184b;
        int i37 = yVar.f351185c;
        ((com.tencent.mm.plugin.fts.o) kVar.f342198f).a();
        kVar.f442221r.bindString(1, str9);
        kVar.f442221r.execute();
        kVar.f442222s.bindLong(1, i29);
        kVar.f442222s.bindLong(2, i37);
        kVar.f442222s.bindLong(3, j28);
        kVar.f442222s.bindString(4, str10);
        kVar.f442222s.bindLong(5, currentTimeMillis);
        kVar.f442222s.bindString(6, "\u200bchatroom_tophits");
        kVar.f442222s.bindLong(7, j18 + 1);
        kVar.f442222s.bindLong(8, j27);
        kVar.f442222s.bindString(9, str9);
        kVar.f442222s.execute();
        ((com.tencent.mm.plugin.fts.o) kVar.f342198f).d();
        return true;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s : query=%s scene=%d", super.toString(), this.f137619n, java.lang.Integer.valueOf(this.f137621p));
    }
}
