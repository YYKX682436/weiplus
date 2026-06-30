package w13;

/* loaded from: classes12.dex */
public class f extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442213r;

    @Override // o13.a
    public boolean B() {
        return true;
    }

    @Override // o13.a
    public boolean C() {
        return !i(-101, 3);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("DROP TABLE IF EXISTS %s", "Feature"));
            L(-101L, 3L);
        }
        if (!((com.tencent.mm.plugin.fts.o) this.f342198f).n("Feature")) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).i("CREATE TABLE IF NOT EXISTS Feature ( " + p13.f.f351085J.f316956e + ");");
        }
        this.f442213r = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT INTO %s (featureId, title, titlePY, titleShortPY, tag, actionType, url, helpUrl, updateUrl, androidUrl, iconPath, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", "Feature"));
    }

    @Override // o13.a
    public boolean G() {
        super.G();
        this.f442213r.close();
        return true;
    }

    public p13.f N(int i17) {
        android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).o("Select * from Feature where featureId = " + i17, null);
        try {
            if (!((android.database.CursorWrapper) o17).moveToFirst()) {
                return null;
            }
            p13.f fVar = new p13.f();
            fVar.convertFrom(o17);
            return fVar;
        } finally {
            ((com.tencent.mm.plugin.fts.e) o17).close();
        }
    }

    public boolean O(java.util.List list) {
        boolean m17 = ((com.tencent.mm.plugin.fts.o) this.f342198f).m();
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).a();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p13.f fVar = (p13.f) it.next();
            try {
                this.f442213r.bindLong(1, fVar.field_featureId);
                this.f442213r.bindString(2, fVar.field_title);
                this.f442213r.bindString(3, fVar.field_titlePY);
                this.f442213r.bindString(4, fVar.field_titleShortPY);
                this.f442213r.bindString(5, fVar.field_tag);
                this.f442213r.bindLong(6, fVar.field_actionType);
                this.f442213r.bindString(7, fVar.field_url);
                this.f442213r.bindString(8, fVar.field_helpUrl);
                this.f442213r.bindString(9, fVar.field_updateUrl);
                this.f442213r.bindString(10, fVar.field_androidUrl);
                this.f442213r.bindString(11, fVar.field_iconPath);
                this.f442213r.bindLong(12, fVar.field_timestamp);
                this.f442213r.executeInsert();
            } catch (java.lang.Exception unused) {
            }
        }
        if (!m17) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).d();
        }
        return true;
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5FeatureStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 17;
    }

    @Override // o13.u
    public int getType() {
        return 17;
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5FeatureStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Feature";
    }
}
