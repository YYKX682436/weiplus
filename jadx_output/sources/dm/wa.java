package dm;

/* loaded from: classes4.dex */
public class wa extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240886i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240887m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240888n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240889o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240890p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240891q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240892r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240893s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240894t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240895u;
    public int field_errorcount;
    public int field_logsize;
    public long field_logtime;
    public int field_offset;
    public byte[] field_value;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240896d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240897e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240898f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240899g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240900h = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsReportKv");
        f240886i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240887m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)"};
        f240888n = 342668305;
        f240889o = -1019779949;
        f240890p = 342638917;
        f240891q = 1639744519;
        f240892r = 111972721;
        f240893s = 108705909;
        f240894t = initAutoDBInfo(dm.wa.class);
        f240895u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "logtime";
        e0Var.f316955d.put("logtime", "LONG");
        e0Var.f316954c[1] = "offset";
        e0Var.f316955d.put("offset", "INTEGER default '0' ");
        e0Var.f316954c[2] = "logsize";
        e0Var.f316955d.put("logsize", "INTEGER");
        e0Var.f316954c[3] = "errorcount";
        e0Var.f316955d.put("errorcount", "INTEGER");
        e0Var.f316954c[4] = "value";
        e0Var.f316955d.put("value", "BLOB");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " logtime LONG,  offset INTEGER default '0' ,  logsize INTEGER,  errorcount INTEGER,  value BLOB";
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
            if (f240888n == hashCode) {
                try {
                    this.field_logtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240889o == hashCode) {
                try {
                    this.field_offset = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240890p == hashCode) {
                try {
                    this.field_logsize = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240891q == hashCode) {
                try {
                    this.field_errorcount = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240892r == hashCode) {
                try {
                    this.field_value = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240893s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240896d) {
            contentValues.put("logtime", java.lang.Long.valueOf(this.field_logtime));
        }
        if (this.f240897e) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.field_offset));
        }
        if (this.f240898f) {
            contentValues.put("logsize", java.lang.Integer.valueOf(this.field_logsize));
        }
        if (this.f240899g) {
            contentValues.put("errorcount", java.lang.Integer.valueOf(this.field_errorcount));
        }
        if (this.f240900h) {
            contentValues.put("value", this.field_value);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsReportKv", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsReportKv ( ");
        l75.e0 e0Var = f240894t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240887m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsReportKv", "createTableSql %s", str2);
            k0Var.A("SnsReportKv", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsReportKv", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsReportKv", "updateTableSql %s", str3);
            k0Var.A("SnsReportKv", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsReportKv", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240894t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240895u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240886i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240886i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("logtime")) {
            this.field_logtime = contentValues.getAsLong("logtime").longValue();
            if (z17) {
                this.f240896d = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z17) {
                this.f240897e = true;
            }
        }
        if (contentValues.containsKey("logsize")) {
            this.field_logsize = contentValues.getAsInteger("logsize").intValue();
            if (z17) {
                this.f240898f = true;
            }
        }
        if (contentValues.containsKey("errorcount")) {
            this.field_errorcount = contentValues.getAsInteger("errorcount").intValue();
            if (z17) {
                this.f240899g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z17) {
                this.f240900h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
