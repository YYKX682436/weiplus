package w13;

/* loaded from: classes12.dex */
public class b extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442203r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442204s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442205t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442206u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442207v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442208w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442209x;

    @Override // o13.a
    public boolean C() {
        return !i(-102, 6);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-102L, 6L);
        }
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE TABLE IF NOT EXISTS FTS5ChatRoomMembers (chatroom TEXT, member TEXT);");
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_chatroom ON FTS5ChatRoomMembers(chatroom);");
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_member ON FTS5ChatRoomMembers(member);");
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE TABLE IF NOT EXISTS FTS5ContactLabels (user TEXT, label_id INTEGER);");
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_user ON FTS5ContactLabels(user);");
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_label ON FTS5ContactLabels(label_id);");
        this.f442203r = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("INSERT INTO FTS5ChatRoomMembers (chatroom, member) VALUES (?, ?);");
        this.f442204s = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=? AND member=?;");
        this.f442205t = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=?;");
        this.f442206u = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("INSERT INTO FTS5ContactLabels (user, label_id) VALUES (?, ?);");
        this.f442207v = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("DELETE FROM FTS5ContactLabels WHERE user=? AND label_id=?;");
        this.f442208w = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("DELETE FROM FTS5ContactLabels WHERE user=?;");
        this.f442209x = ((com.tencent.mm.plugin.fts.o) this.f342198f).e("SELECT changes();");
    }

    @Override // o13.a
    public boolean G() {
        super.G();
        this.f442203r.close();
        this.f442204s.close();
        this.f442205t.close();
        this.f442206u.close();
        this.f442207v.close();
        this.f442208w.close();
        this.f442209x.close();
        return true;
    }

    public void N(java.lang.String str, java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        this.f442203r.bindString(1, str);
        for (java.lang.String str2 : strArr) {
            this.f442203r.bindString(2, str2);
            this.f442203r.execute();
        }
        if (m17) {
            return;
        }
        ((com.tencent.mm.plugin.fts.o) this.f342198f).d();
    }

    public boolean O(p13.r rVar) {
        int i17 = 0;
        if (rVar.a()) {
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = r();
        objArr[1] = o();
        objArr[2] = r();
        objArr[3] = o();
        objArr[4] = o();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) rVar.f351133e;
            if (i17 >= arrayList.size()) {
                objArr[5] = stringBuffer.toString();
                android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type=131072 LIMIT 1;", objArr), null);
                boolean moveToNext = ((android.database.CursorWrapper) o17).moveToNext();
                ((com.tencent.mm.plugin.fts.e) o17).close();
                return moveToNext;
            }
            stringBuffer.append("(");
            stringBuffer.append(((p13.p) arrayList.get(i17)).a());
            stringBuffer.append(")");
            if (i17 != arrayList.size() - 1) {
                stringBuffer.append(" OR ");
            }
            i17++;
        }
    }

    public android.database.Cursor Q(p13.r rVar, java.lang.String str, int[] iArr, int[] iArr2) {
        java.lang.String str2;
        if (rVar.a()) {
            return new d95.d();
        }
        java.lang.String f17 = rVar.f();
        java.lang.String str3 = "";
        java.lang.String format = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : java.lang.String.format(" AND aux_index = '%s'", str);
        if (iArr == null || iArr.length <= 0) {
            str2 = "";
        } else {
            str2 = " AND type IN " + o13.n.m(iArr);
        }
        if (iArr2 != null && iArr2.length > 0) {
            str3 = " AND subtype IN " + o13.n.m(iArr2);
        }
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT aux_index, type, subtype FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + format + str2 + str3 + " AND status >= 0 ORDER BY subtype;", r(), o(), r(), o(), o(), f17), null);
    }

    public android.database.Cursor R(p13.r rVar, int[] iArr) {
        java.lang.String str;
        if (rVar.a()) {
            return new d95.d();
        }
        java.lang.String f17 = rVar.f();
        if (iArr == null || iArr.length <= 0) {
            str = "";
        } else {
            str = " AND type IN " + o13.n.m(iArr);
        }
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + str + " AND status >= 0 ORDER BY subtype;", r(), o(), java.lang.Long.valueOf(((java.util.ArrayList) rVar.f351133e).size()), r(), o(), r(), o(), o(), f17), null);
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5ContactStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 3;
    }

    @Override // o13.u
    public int getType() {
        return 3;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", r());
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5ContactStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Contact";
    }
}
