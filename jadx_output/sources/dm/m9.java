package dm;

/* loaded from: classes4.dex */
public class m9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f238529n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f238530o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238531p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238532q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238533r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238534s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238535t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238536u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238537v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238538w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f238539x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f238540y;
    public java.lang.String field_appId;
    public java.lang.String field_cgiList;
    public long field_endTime;
    public int field_reportId;
    public java.lang.String field_sceneList;
    public long field_startTime;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238541d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238542e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238543f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238544g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238545h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238546i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238547m = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadBlockCgiRequest");
        f238529n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238530o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestAppIDIndex ON PredownloadBlockCgiRequest(appId)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestStartTimeIndex ON PredownloadBlockCgiRequest(startTime)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestEndTimeIndex ON PredownloadBlockCgiRequest(endTime)"};
        f238531p = -265713450;
        f238532q = 93028124;
        f238533r = -2129294769;
        f238534s = -1607243192;
        f238535t = 1729107786;
        f238536u = 716692163;
        f238537v = -427040401;
        f238538w = 108705909;
        f238539x = initAutoDBInfo(dm.m9.class);
        f238540y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[3] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[4] = "sceneList";
        e0Var.f316955d.put("sceneList", "TEXT");
        e0Var.f316954c[5] = "cgiList";
        e0Var.f316955d.put("cgiList", "TEXT");
        e0Var.f316954c[6] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " username TEXT PRIMARY KEY ,  appId TEXT,  startTime LONG,  endTime LONG,  sceneList TEXT,  cgiList TEXT,  reportId INTEGER";
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
            if (f238531p == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f238541d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238532q == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238533r == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238534s == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238535t == hashCode) {
                try {
                    this.field_sceneList = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238536u == hashCode) {
                try {
                    this.field_cgiList = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238537v == hashCode) {
                try {
                    this.field_reportId = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238538w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238541d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f238542e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238543f) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f238544g) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
        }
        if (this.f238545h) {
            contentValues.put("sceneList", this.field_sceneList);
        }
        if (this.f238546i) {
            contentValues.put("cgiList", this.field_cgiList);
        }
        if (this.f238547m) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.field_reportId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadBlockCgiRequest ( ");
        l75.e0 e0Var = f238539x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238530o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTableSql %s", str2);
            k0Var.A("PredownloadBlockCgiRequest", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PredownloadBlockCgiRequest", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "updateTableSql %s", str3);
            k0Var.A("PredownloadBlockCgiRequest", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238539x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238540y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238529n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238529n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f238541d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238542e = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f238543f = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f238544g = true;
            }
        }
        if (contentValues.containsKey("sceneList")) {
            this.field_sceneList = contentValues.getAsString("sceneList");
            if (z17) {
                this.f238545h = true;
            }
        }
        if (contentValues.containsKey("cgiList")) {
            this.field_cgiList = contentValues.getAsString("cgiList");
            if (z17) {
                this.f238546i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f238547m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
