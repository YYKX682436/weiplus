package dm;

/* loaded from: classes4.dex */
public class x2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f240998g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f240999h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241000i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241001m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241002n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241003o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f241004p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f241005q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241006d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241007e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241008f = true;
    public byte[] field_content;
    public java.lang.String field_desc;
    public int field_updateTime;

    static {
        p75.n0 n0Var = new p75.n0("EmojiSuggestCacheInfo");
        f240998g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240999h = new java.lang.String[0];
        f241000i = 3079825;
        f241001m = -295931082;
        f241002n = 951530617;
        f241003o = 108705909;
        f241004p = initAutoDBInfo(dm.x2.class);
        f241005q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "desc";
        e0Var.f316955d.put("desc", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "desc";
        e0Var.f316954c[1] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "INTEGER");
        e0Var.f316954c[2] = "content";
        e0Var.f316955d.put("content", "BLOB");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " desc TEXT PRIMARY KEY ,  updateTime INTEGER,  content BLOB";
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
            if (f241000i == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                    this.f241006d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241001m == hashCode) {
                try {
                    this.field_updateTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241002n == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241003o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241006d) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f241007e) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Integer.valueOf(this.field_updateTime));
        }
        if (this.f241008f) {
            contentValues.put("content", this.field_content);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiSuggestCacheInfo ( ");
        l75.e0 e0Var = f241004p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240999h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTableSql %s", str2);
            k0Var.A("EmojiSuggestCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmojiSuggestCacheInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "updateTableSql %s", str3);
            k0Var.A("EmojiSuggestCacheInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241004p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241005q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_desc;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240998g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240998g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f241006d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsInteger(dm.i4.COL_UPDATETIME).intValue();
            if (z17) {
                this.f241007e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f241008f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
