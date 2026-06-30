package dm;

/* loaded from: classes4.dex */
public class q7 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239424f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239425g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239426h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239427i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239428m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239429n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239430o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239431d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239432e = true;
    public long field_lastReportTimeStamp;
    public java.lang.String field_pkgName;

    static {
        p75.n0 n0Var = new p75.n0("LocalGameReport");
        f239424f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239425g = new java.lang.String[0];
        f239426h = -517940617;
        f239427i = -1110932308;
        f239428m = 108705909;
        f239429n = initAutoDBInfo(dm.q7.class);
        f239430o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "pkgName";
        e0Var.f316955d.put("pkgName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "pkgName";
        e0Var.f316954c[1] = "lastReportTimeStamp";
        e0Var.f316955d.put("lastReportTimeStamp", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " pkgName TEXT PRIMARY KEY ,  lastReportTimeStamp LONG";
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
            if (f239426h == hashCode) {
                try {
                    this.field_pkgName = cursor.getString(i17);
                    this.f239431d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalGameReport", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239427i == hashCode) {
                try {
                    this.field_lastReportTimeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalGameReport", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239428m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239431d) {
            contentValues.put("pkgName", this.field_pkgName);
        }
        if (this.f239432e) {
            contentValues.put("lastReportTimeStamp", java.lang.Long.valueOf(this.field_lastReportTimeStamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLocalGameReport", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LocalGameReport ( ");
        l75.e0 e0Var = f239429n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239425g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalGameReport", "createTableSql %s", str2);
            k0Var.A("LocalGameReport", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LocalGameReport", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalGameReport", "updateTableSql %s", str3);
            k0Var.A("LocalGameReport", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalGameReport", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239429n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239430o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_pkgName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239424f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239424f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgName")) {
            this.field_pkgName = contentValues.getAsString("pkgName");
            if (z17) {
                this.f239431d = true;
            }
        }
        if (contentValues.containsKey("lastReportTimeStamp")) {
            this.field_lastReportTimeStamp = contentValues.getAsLong("lastReportTimeStamp").longValue();
            if (z17) {
                this.f239432e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
