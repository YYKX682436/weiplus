package dm;

/* loaded from: classes4.dex */
public class sc extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239950n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239951o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239952p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239953q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239954r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239955s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239956t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239957u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239958v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239959w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239960x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239961y;
    public long field_accessTime;
    public java.lang.String field_appId;
    public java.lang.String field_appVersionId;
    public java.lang.String field_cacheFilePath;
    public java.lang.String field_commLibVersionId;
    public java.lang.String field_pageURL;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239962d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239963e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239964f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239965g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239966h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239967i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239968m = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAppWebRenderingCacheAccessStatsTable");
        f239950n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239951o = new java.lang.String[0];
        f239952p = 93028124;
        f239953q = -318790598;
        f239954r = 303221490;
        f239955s = -803559328;
        f239956t = -295931082;
        f239957u = -1142019503;
        f239958v = 1346576739;
        f239959w = 108705909;
        f239960x = initAutoDBInfo(dm.sc.class);
        f239961y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "commLibVersionId";
        e0Var.f316955d.put("commLibVersionId", "TEXT");
        e0Var.f316954c[2] = "appVersionId";
        e0Var.f316955d.put("appVersionId", "TEXT");
        e0Var.f316954c[3] = "pageURL";
        e0Var.f316955d.put("pageURL", "TEXT");
        e0Var.f316954c[4] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[5] = "accessTime";
        e0Var.f316955d.put("accessTime", "LONG");
        e0Var.f316954c[6] = "cacheFilePath";
        e0Var.f316955d.put("cacheFilePath", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " appId TEXT,  commLibVersionId TEXT,  appVersionId TEXT,  pageURL TEXT,  updateTime LONG,  accessTime LONG,  cacheFilePath TEXT";
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
            if (f239952p == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239953q == hashCode) {
                try {
                    this.field_commLibVersionId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239954r == hashCode) {
                try {
                    this.field_appVersionId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239955s == hashCode) {
                try {
                    this.field_pageURL = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239956t == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239957u == hashCode) {
                try {
                    this.field_accessTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239958v == hashCode) {
                try {
                    this.field_cacheFilePath = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239959w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239962d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239963e) {
            contentValues.put("commLibVersionId", this.field_commLibVersionId);
        }
        if (this.f239964f) {
            contentValues.put("appVersionId", this.field_appVersionId);
        }
        if (this.f239965g) {
            contentValues.put("pageURL", this.field_pageURL);
        }
        if (this.f239966h) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f239967i) {
            contentValues.put("accessTime", java.lang.Long.valueOf(this.field_accessTime));
        }
        if (this.f239968m) {
            contentValues.put("cacheFilePath", this.field_cacheFilePath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAppWebRenderingCacheAccessStatsTable ( ");
        l75.e0 e0Var = f239960x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239951o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTableSql %s", str2);
            k0Var.A("WxaAppWebRenderingCacheAccessStatsTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaAppWebRenderingCacheAccessStatsTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "updateTableSql %s", str3);
            k0Var.A("WxaAppWebRenderingCacheAccessStatsTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239960x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239961y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239950n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239950n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239962d = true;
            }
        }
        if (contentValues.containsKey("commLibVersionId")) {
            this.field_commLibVersionId = contentValues.getAsString("commLibVersionId");
            if (z17) {
                this.f239963e = true;
            }
        }
        if (contentValues.containsKey("appVersionId")) {
            this.field_appVersionId = contentValues.getAsString("appVersionId");
            if (z17) {
                this.f239964f = true;
            }
        }
        if (contentValues.containsKey("pageURL")) {
            this.field_pageURL = contentValues.getAsString("pageURL");
            if (z17) {
                this.f239965g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239966h = true;
            }
        }
        if (contentValues.containsKey("accessTime")) {
            this.field_accessTime = contentValues.getAsLong("accessTime").longValue();
            if (z17) {
                this.f239967i = true;
            }
        }
        if (contentValues.containsKey("cacheFilePath")) {
            this.field_cacheFilePath = contentValues.getAsString("cacheFilePath");
            if (z17) {
                this.f239968m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
