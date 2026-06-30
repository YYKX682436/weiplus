package v72;

/* loaded from: classes12.dex */
public class a extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f433643r;

    @Override // o13.a
    public boolean C() {
        return !i(-106, 4);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-106L, 4L);
        }
        this.f433643r = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, fav_type) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", r()));
    }

    public void N(int i17, int i18, long j17, java.lang.String str, long j18, java.lang.String str2, int i19) {
        java.lang.String a17 = o13.n.a(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return;
        }
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        try {
            this.f342199g.bindString(1, a17);
            this.f342199g.execute();
            this.f433643r.bindLong(1, i17);
            this.f433643r.bindLong(2, i18);
            this.f433643r.bindLong(3, j17);
            this.f433643r.bindString(4, str);
            this.f433643r.bindLong(5, j18);
            this.f433643r.bindLong(6, i19);
            this.f433643r.execute();
            if (m17) {
                return;
            }
            ((com.tencent.mm.plugin.fts.o) this.f342198f).d();
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTS5FavoriteStorage", java.lang.String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(j18)));
            java.lang.String simpleQueryForString = this.f342206q.simpleQueryForString();
            if (simpleQueryForString != null && simpleQueryForString.length() > 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTS5FavoriteStorage", ">> ".concat(simpleQueryForString));
            }
            throw e17;
        }
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5FavoriteStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 256;
    }

    @Override // o13.u
    public int getType() {
        return 256;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, fav_type INT DEFAULT 0);", r());
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Favorite";
    }
}
