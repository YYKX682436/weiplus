package dm;

/* loaded from: classes4.dex */
public class g extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236985n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f236986o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236987p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236988q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236989r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236990s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236991t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236992u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236993v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236994w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f236995x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f236996y;
    public java.lang.String field_cacheKey;
    public long field_canvasId;
    public java.lang.String field_canvasXml;
    public long field_createTime;
    public java.lang.String field_dynamicInfo;
    public int field_source;
    public java.lang.String field_uxInfo;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236997d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236998e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236999f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237000g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237001h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237002i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237003m = true;

    static {
        p75.n0 n0Var = new p75.n0("AdCanvasCacheInfo");
        f236985n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236986o = new java.lang.String[0];
        f236987p = -433508483;
        f236988q = -105740141;
        f236989r = 1017037727;
        f236990s = 1369213417;
        f236991t = -896505829;
        f236992u = -832250383;
        f236993v = -258997875;
        f236994w = 108705909;
        f236995x = initAutoDBInfo(dm.g.class);
        f236996y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "cacheKey";
        e0Var.f316955d.put("cacheKey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "cacheKey";
        e0Var.f316954c[1] = "canvasId";
        e0Var.f316955d.put("canvasId", "LONG");
        e0Var.f316954c[2] = "canvasXml";
        e0Var.f316955d.put("canvasXml", "TEXT");
        e0Var.f316954c[3] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[4] = ya.b.SOURCE;
        e0Var.f316955d.put(ya.b.SOURCE, "INTEGER");
        e0Var.f316954c[5] = "uxInfo";
        e0Var.f316955d.put("uxInfo", "TEXT");
        e0Var.f316954c[6] = "dynamicInfo";
        e0Var.f316955d.put("dynamicInfo", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " cacheKey TEXT PRIMARY KEY ,  canvasId LONG,  canvasXml TEXT,  createTime LONG,  source INTEGER,  uxInfo TEXT,  dynamicInfo TEXT";
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
            if (f236987p == hashCode) {
                try {
                    this.field_cacheKey = cursor.getString(i17);
                    this.f236997d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236988q == hashCode) {
                try {
                    this.field_canvasId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236989r == hashCode) {
                try {
                    this.field_canvasXml = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236990s == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236991t == hashCode) {
                try {
                    this.field_source = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236992u == hashCode) {
                try {
                    this.field_uxInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236993v == hashCode) {
                try {
                    this.field_dynamicInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236994w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236997d) {
            contentValues.put("cacheKey", this.field_cacheKey);
        }
        if (this.f236998e) {
            contentValues.put("canvasId", java.lang.Long.valueOf(this.field_canvasId));
        }
        if (this.f236999f) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f237000g) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f237001h) {
            contentValues.put(ya.b.SOURCE, java.lang.Integer.valueOf(this.field_source));
        }
        if (this.f237002i) {
            contentValues.put("uxInfo", this.field_uxInfo);
        }
        if (this.f237003m) {
            contentValues.put("dynamicInfo", this.field_dynamicInfo);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdCanvasCacheInfo ( ");
        l75.e0 e0Var = f236995x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236986o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTableSql %s", str2);
            k0Var.A("AdCanvasCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AdCanvasCacheInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "updateTableSql %s", str3);
            k0Var.A("AdCanvasCacheInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236995x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236996y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_cacheKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236985n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236985n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cacheKey")) {
            this.field_cacheKey = contentValues.getAsString("cacheKey");
            if (z17) {
                this.f236997d = true;
            }
        }
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsLong("canvasId").longValue();
            if (z17) {
                this.f236998e = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f236999f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237000g = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(ya.b.SOURCE).intValue();
            if (z17) {
                this.f237001h = true;
            }
        }
        if (contentValues.containsKey("uxInfo")) {
            this.field_uxInfo = contentValues.getAsString("uxInfo");
            if (z17) {
                this.f237002i = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.field_dynamicInfo = contentValues.getAsString("dynamicInfo");
            if (z17) {
                this.f237003m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
