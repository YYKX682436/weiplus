package w13;

/* loaded from: classes12.dex */
public class k extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442221r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442222s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442223t;

    @Override // o13.a
    public boolean C() {
        return !i(-100, 6);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-100L, 6L);
        }
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", r(), r()));
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", r(), r()));
        this.f442221r = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT INTO %s (content) VALUES (?);", o()));
        this.f442222s = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", r()));
        this.f442223t = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("UPDATE %s SET status=? WHERE aux_index=?", r()));
    }

    @Override // o13.a
    public boolean G() {
        super.G();
        this.f442221r.close();
        this.f442222s.close();
        this.f442223t.close();
        return true;
    }

    public boolean N(java.lang.String str) {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(str) < java.lang.System.currentTimeMillis() - 5184000000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int O() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w13.k.O():int");
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5TopHitsStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 768;
    }

    @Override // o13.u
    public int getType() {
        return 1;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", r());
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5TopHitsStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "TopHits";
    }
}
