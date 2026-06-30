package dm;

/* loaded from: classes4.dex */
public class v0 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f240435h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f240436i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240437m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240438n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240439o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240440p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240441q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f240442r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f240443s;
    public int field_aScene;
    public long field_appMsgReportContextId;
    public long field_reportTime;
    public java.lang.String field_url;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240444d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240445e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240446f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240447g = true;

    static {
        p75.n0 n0Var = new p75.n0("BizAppMsgReportContext");
        f240435h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240436i = new java.lang.String[0];
        f240437m = 664879766;
        f240438n = 116079;
        f240439o = 1931371041;
        f240440p = -1438237525;
        f240441q = 108705909;
        f240442r = initAutoDBInfo(dm.v0.class);
        f240443s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "appMsgReportContextId";
        e0Var.f316955d.put("appMsgReportContextId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "appMsgReportContextId";
        e0Var.f316954c[1] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[2] = "reportTime";
        e0Var.f316955d.put("reportTime", "LONG");
        e0Var.f316954c[3] = "aScene";
        e0Var.f316955d.put("aScene", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " appMsgReportContextId LONG PRIMARY KEY ,  url TEXT,  reportTime LONG,  aScene INTEGER";
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
            if (f240437m == hashCode) {
                try {
                    this.field_appMsgReportContextId = cursor.getLong(i17);
                    this.f240444d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240438n == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240439o == hashCode) {
                try {
                    this.field_reportTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240440p == hashCode) {
                try {
                    this.field_aScene = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAppMsgReportContext", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240441q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240444d) {
            contentValues.put("appMsgReportContextId", java.lang.Long.valueOf(this.field_appMsgReportContextId));
        }
        if (this.f240445e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f240446f) {
            contentValues.put("reportTime", java.lang.Long.valueOf(this.field_reportTime));
        }
        if (this.f240447g) {
            contentValues.put("aScene", java.lang.Integer.valueOf(this.field_aScene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizAppMsgReportContext ( ");
        l75.e0 e0Var = f240442r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240436i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTableSql %s", str2);
            k0Var.A("BizAppMsgReportContext", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizAppMsgReportContext", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "updateTableSql %s", str3);
            k0Var.A("BizAppMsgReportContext", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240442r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240443s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_appMsgReportContextId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240435h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240435h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appMsgReportContextId")) {
            this.field_appMsgReportContextId = contentValues.getAsLong("appMsgReportContextId").longValue();
            if (z17) {
                this.f240444d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f240445e = true;
            }
        }
        if (contentValues.containsKey("reportTime")) {
            this.field_reportTime = contentValues.getAsLong("reportTime").longValue();
            if (z17) {
                this.f240446f = true;
            }
        }
        if (contentValues.containsKey("aScene")) {
            this.field_aScene = contentValues.getAsInteger("aScene").intValue();
            if (z17) {
                this.f240447g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
