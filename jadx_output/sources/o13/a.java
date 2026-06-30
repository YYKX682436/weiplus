package o13;

/* loaded from: classes12.dex */
public abstract class a implements o13.u {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f342196d;

    /* renamed from: e, reason: collision with root package name */
    public kk.j f342197e;

    /* renamed from: f, reason: collision with root package name */
    public volatile o13.t f342198f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342199g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342200h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342201i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342202m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342203n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342204o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342205p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f342206q;

    public a() {
        com.tencent.mars.xlog.Log.i(p(), "Create %s", getName());
    }

    public java.util.List A(int[] iArr, int i17) {
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT docid, type, subtype, aux_index FROM %s WHERE type IN " + o13.n.m(iArr) + ";", r()), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                y(arrayList2, i17);
                return arrayList;
            }
            p13.d dVar = new p13.d();
            dVar.f351071a = cursorWrapper.getLong(0);
            cursorWrapper.getInt(1);
            cursorWrapper.getInt(2);
            dVar.f351072b = cursorWrapper.getString(3);
            arrayList.add(dVar);
            arrayList2.add(java.lang.Long.valueOf(dVar.f351071a));
        }
    }

    public boolean B() {
        return this instanceof w13.b;
    }

    public abstract boolean C();

    public final boolean D() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i(p(), "Create Fail!");
            return false;
        }
        this.f342198f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f;
        com.tencent.mars.xlog.Log.i(p(), "Create Success!");
        java.lang.String o17 = o();
        java.lang.String r17 = r();
        com.tencent.mars.xlog.Log.i(p(), "indexTableName=%s | metaTableName=%s | TableName=%s", o17, r17, t());
        if (((com.tencent.mm.plugin.fts.o) this.f342198f).n(o17) && ((com.tencent.mm.plugin.fts.o) this.f342198f).n(r17) && !C()) {
            com.tencent.mars.xlog.Log.i(p(), "Table Exist, Not Need To Create");
        } else {
            com.tencent.mars.xlog.Log.i(p(), "Table Not Exist, Need To Create");
            java.lang.String format = java.lang.String.format("DROP TABLE IF EXISTS %s;", o17);
            java.lang.String format2 = java.lang.String.format("DROP TABLE IF EXISTS %s;", r17);
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(format);
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(format2);
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", o()));
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(n());
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_typeId ON %s(type, entity_id);", r17, r17));
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_entity_id_subtype ON %s(entity_id, subtype);", r17, r17));
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_aux_index_subtype ON %s(aux_index, subtype);", r17, r17));
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", r17, r17));
        }
        this.f342199g = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT INTO %s (content) VALUES (?);", o17));
        this.f342200h = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?);", r17));
        this.f342201i = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("DELETE FROM %s WHERE rowid=?;", o17));
        this.f342202m = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("DELETE FROM %s WHERE docid=?;", r17));
        this.f342203n = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("UPDATE %s SET status=? WHERE docid=?;", r17));
        this.f342204o = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("UPDATE %s SET status=? WHERE aux_index=? AND status=?", r17));
        this.f342205p = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("UPDATE %s SET timestamp=? WHERE aux_index=?", r17));
        this.f342206q = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("SELECT mm_last_error();");
        this.f342197e = new kk.l(100);
        E();
        return true;
    }

    public abstract void E();

    @Override // o13.u
    public void F(int[] iArr, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND entity_id=?;", r()), new java.lang.String[]{java.lang.Long.toString(j17)});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public boolean G() {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f342199g;
        if (sQLiteStatement != null) {
            sQLiteStatement.close();
        }
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement2 = this.f342200h;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.close();
        }
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement3 = this.f342201i;
        if (sQLiteStatement3 != null) {
            sQLiteStatement3.close();
        }
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement4 = this.f342202m;
        if (sQLiteStatement4 != null) {
            sQLiteStatement4.close();
        }
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement5 = this.f342203n;
        if (sQLiteStatement5 != null) {
            sQLiteStatement5.close();
        }
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement6 = this.f342206q;
        if (sQLiteStatement6 != null) {
            sQLiteStatement6.close();
        }
        kk.j jVar = this.f342197e;
        if (jVar != null) {
            ((kk.l) jVar).clear();
        }
        this.f342198f = null;
        return true;
    }

    public android.database.Cursor H(p13.r rVar, int[] iArr, int[] iArr2, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2;
        java.lang.String str3;
        if (rVar.a()) {
            return new d95.d();
        }
        java.lang.String f17 = rVar.f();
        java.lang.String format = z17 ? java.lang.String.format(", MMHighlight(%s, %d, type, subtype)", o(), java.lang.Integer.valueOf(((java.util.ArrayList) rVar.f351133e).size())) : "";
        java.lang.String str4 = str != null ? " AND aux_index = ?" : "";
        if (iArr2 == null || iArr2.length <= 0) {
            str2 = "";
        } else {
            str2 = " AND subtype IN " + o13.n.m(iArr2);
        }
        if (iArr == null || iArr.length <= 0) {
            str3 = "";
        } else {
            str3 = " AND type IN " + o13.n.m(iArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp");
        sb6.append(z18 ? ", content" : "");
        sb6.append(format);
        sb6.append(" FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'");
        sb6.append(str3);
        sb6.append(str4);
        sb6.append(" AND status >= 0");
        sb6.append(str2);
        sb6.append(";");
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format(sb6.toString(), r(), r(), o(), r(), o(), o(), f17), str != null ? new java.lang.String[]{str} : null);
    }

    public android.database.Cursor I(int[] iArr, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        if (!z17 && !z18 && !z19 && !z27 && !z28) {
            return d95.d.a();
        }
        if (iArr == null || iArr.length == 0) {
            return d95.d.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        if (z17) {
            sb6.append("docid,");
        }
        if (z18) {
            sb6.append("entity_id,");
        }
        if (z19) {
            sb6.append("aux_index,");
        }
        if (z27) {
            sb6.append("timestamp,");
        }
        if (z28) {
            sb6.append("status,");
        }
        sb6.setLength(sb6.length() - 1);
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT %s FROM %s WHERE type IN " + o13.n.m(iArr) + ";", sb6.toString(), r()), null);
    }

    public void J(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : ((com.tencent.mm.sdk.platformtools.r2) this.f342197e).keySet()) {
            if (str2.startsWith(str)) {
                hashSet.add(str2);
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.platformtools.r2) this.f342197e).remove((java.lang.String) it.next());
        }
    }

    @Override // o13.u
    public java.lang.String K(java.lang.String str, int i17) {
        if (B()) {
            java.lang.String str2 = str + "\u200b" + i17;
            if (((com.tencent.mm.sdk.platformtools.r2) this.f342197e).k(str2)) {
                com.tencent.mars.xlog.Log.i(p(), "hit lru insert content map");
                return (java.lang.String) ((com.tencent.mm.sdk.platformtools.r2) this.f342197e).get(str2);
            }
        }
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT content FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index=? AND subtype=?", r(), o(), r(), o()), new java.lang.String[]{str, java.lang.String.valueOf(i17)});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        java.lang.String string = cursorWrapper.moveToFirst() ? cursorWrapper.getString(0) : null;
        ((com.tencent.mm.plugin.fts.e) o17).close();
        return string;
    }

    public void L(long j17, long j18) {
        ((com.tencent.mm.plugin.fts.o) this.f342198f).q(j17, j18);
    }

    public final void M(java.lang.String str, long j17) {
        this.f342205p.bindLong(1, j17);
        this.f342205p.bindString(2, str);
        this.f342205p.execute();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        o13.u uVar = (o13.u) obj;
        if (getPriority() < uVar.getPriority()) {
            return -1;
        }
        return getPriority() > uVar.getPriority() ? 1 : 0;
    }

    @Override // o13.u
    public synchronized void create() {
        com.tencent.mars.xlog.Log.i(p(), "OnCreate %s | isCreated =%b", getName(), java.lang.Boolean.valueOf(this.f342196d));
        if (!this.f342196d && D()) {
            com.tencent.mars.xlog.Log.i(p(), "SetCreated");
            this.f342196d = true;
        }
    }

    @Override // o13.u
    public final void destroy() {
        com.tencent.mars.xlog.Log.i(p(), "OnDestroy %s | isCreated %b", getName(), java.lang.Boolean.valueOf(this.f342196d));
        if (this.f342196d && G()) {
            com.tencent.mars.xlog.Log.i(p(), "SetDestroyed");
            this.f342196d = false;
        }
    }

    public void h() {
        ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
    }

    public boolean i(int i17, int i18) {
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).b(i17, i18);
    }

    public void j() {
        ((com.tencent.mm.plugin.fts.o) this.f342198f).d();
    }

    public void k(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(2048);
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + ";", r()), null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public final void l(long j17) {
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        this.f342201i.bindLong(1, j17);
        try {
            this.f342201i.execute();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(p(), e17, "deleteIndexByDocId", new java.lang.Object[0]);
        }
        this.f342202m.bindLong(1, j17);
        try {
            this.f342202m.execute();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(p(), e18, "deleteMetaByDocIdStmt", new java.lang.Object[0]);
        }
        if (m17) {
            return;
        }
        j();
    }

    public final void m(java.util.List list) {
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f342201i.bindLong(1, ((java.lang.Long) it.next()).longValue());
            try {
                this.f342201i.execute();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(p(), e17, "deleteIndexByDocIdStmt", new java.lang.Object[0]);
            }
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            try {
                this.f342202m.bindLong(1, ((java.lang.Long) it6.next()).longValue());
                this.f342202m.execute();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(p(), e18, "deleteMetaByDocIdStmt", new java.lang.Object[0]);
            }
        }
        if (m17) {
            return;
        }
        j();
    }

    @Override // o13.u
    public final void m0(int[] iArr, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND aux_index=?;", r()), new java.lang.String[]{str});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", r());
    }

    public final java.lang.String o() {
        return "FTS5Index" + t();
    }

    public java.lang.String p() {
        return "MicroMsg.FTS.BaseFTS5NativeStorage";
    }

    public final java.lang.String r() {
        return "FTS5Meta" + t();
    }

    public long s(int[] iArr) {
        android.database.Cursor cursor = null;
        try {
            cursor = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT count(*) FROM %s WHERE type IN %s", r(), o13.n.m(iArr)), null);
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) cursor;
            long j17 = cursorWrapper.moveToNext() ? cursorWrapper.getLong(0) : 0L;
            ((com.tencent.mm.plugin.fts.e) cursor).close();
            return j17;
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                ((com.tencent.mm.plugin.fts.e) cursor).close();
            }
            throw th6;
        }
    }

    public abstract java.lang.String t();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(int r15, int r16, long r17, java.lang.String r19, long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.a.u(int, int, long, java.lang.String, long, java.lang.String):void");
    }

    public java.util.List w(int[] iArr, java.lang.String str, int i17) {
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE aux_index=? AND type IN " + o13.n.m(iArr) + ";", r()), new java.lang.String[]{str});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.tencent.mm.plugin.fts.e) o17).close();
                y(arrayList, i17);
                return arrayList;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public final void y(java.util.List list, int i17) {
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        this.f342203n.bindLong(1, i17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f342203n.bindLong(2, ((java.lang.Long) it.next()).longValue());
            this.f342203n.execute();
        }
        if (m17) {
            return;
        }
        ((com.tencent.mm.plugin.fts.o) this.f342198f).d();
    }
}
