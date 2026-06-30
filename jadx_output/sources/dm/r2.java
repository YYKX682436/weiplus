package dm;

/* loaded from: classes4.dex */
public class r2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239575g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239576h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239577i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239578m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239579n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239580o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239581p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239582q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239583d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239584e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239585f = true;
    public java.lang.String field_configID;
    public java.lang.String field_data;
    public long field_reportTimeEC;

    static {
        p75.n0 n0Var = new p75.n0("EdgeComputingCacheDataModel");
        f239575g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239576h = new java.lang.String[0];
        f239577i = -580140067;
        f239578m = 621700735;
        f239579n = 3076010;
        f239580o = 108705909;
        f239581p = initAutoDBInfo(dm.r2.class);
        f239582q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "configID";
        e0Var.f316955d.put("configID", "TEXT");
        e0Var.f316954c[1] = "reportTimeEC";
        e0Var.f316955d.put("reportTimeEC", "LONG");
        e0Var.f316954c[2] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " configID TEXT,  reportTimeEC LONG,  data TEXT";
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
            if (f239577i == hashCode) {
                try {
                    this.field_configID = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239578m == hashCode) {
                try {
                    this.field_reportTimeEC = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239579n == hashCode) {
                try {
                    this.field_data = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239580o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239583d) {
            contentValues.put("configID", this.field_configID);
        }
        if (this.f239584e) {
            contentValues.put("reportTimeEC", java.lang.Long.valueOf(this.field_reportTimeEC));
        }
        if (this.f239585f) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EdgeComputingCacheDataModel ( ");
        l75.e0 e0Var = f239581p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239576h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTableSql %s", str2);
            k0Var.A("EdgeComputingCacheDataModel", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EdgeComputingCacheDataModel", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "updateTableSql %s", str3);
            k0Var.A("EdgeComputingCacheDataModel", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239581p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239582q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239575g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239575g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("configID")) {
            this.field_configID = contentValues.getAsString("configID");
            if (z17) {
                this.f239583d = true;
            }
        }
        if (contentValues.containsKey("reportTimeEC")) {
            this.field_reportTimeEC = contentValues.getAsLong("reportTimeEC").longValue();
            if (z17) {
                this.f239584e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            this.field_data = contentValues.getAsString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (z17) {
                this.f239585f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
