package dm;

/* loaded from: classes4.dex */
public class p3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f239114m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f239115n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239116o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239117p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239118q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239119r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239120s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239121t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239122u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239123v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239124w;
    public java.lang.String field_content;
    public long field_localId;
    public int field_subtype;
    public java.lang.String field_tagContent;
    public long field_time;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239125d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239126e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239127f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239128g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239129h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239130i = true;

    static {
        p75.n0 n0Var = new p75.n0("FavSearchInfo");
        f239114m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239115n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)"};
        f239116o = 338409958;
        f239117p = 951530617;
        f239118q = 1186868095;
        f239119r = 3560141;
        f239120s = 3575610;
        f239121t = -1867567750;
        f239122u = 108705909;
        f239123v = initAutoDBInfo(dm.p3.class);
        f239124w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[2] = "tagContent";
        e0Var.f316955d.put("tagContent", "TEXT");
        e0Var.f316954c[3] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[4] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[5] = "subtype";
        e0Var.f316955d.put("subtype", "INTEGER default '0' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  content TEXT,  tagContent TEXT,  time LONG,  type INTEGER,  subtype INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (f239116o == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.f239125d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239117p == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239118q == hashCode) {
                try {
                    this.field_tagContent = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239119r == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239120s == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239121t == hashCode) {
                try {
                    this.field_subtype = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239122u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239125d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f239126e) {
            contentValues.put("content", this.field_content);
        }
        if (this.f239127f) {
            contentValues.put("tagContent", this.field_tagContent);
        }
        if (this.f239128g) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
        }
        if (this.f239129h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f239130i) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.field_subtype));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavSearchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavSearchInfo ( ");
        l75.e0 e0Var = f239123v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239115n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "createTableSql %s", str2);
            k0Var.A("FavSearchInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavSearchInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "updateTableSql %s", str3);
            k0Var.A("FavSearchInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239123v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239124w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239114m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239114m.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
            n51.f.b(jSONObject, "content", this.field_content);
            n51.f.b(jSONObject, "tagContent", this.field_tagContent);
            n51.f.b(jSONObject, "time", java.lang.Long.valueOf(this.field_time));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "subtype", java.lang.Integer.valueOf(this.field_subtype));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f239125d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f239126e = true;
            }
        }
        if (contentValues.containsKey("tagContent")) {
            this.field_tagContent = contentValues.getAsString("tagContent");
            if (z17) {
                this.f239127f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f239128g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f239129h = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f239130i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
