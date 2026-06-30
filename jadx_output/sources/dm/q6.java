package dm;

/* loaded from: classes4.dex */
public class q6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239413g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239414h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239415i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239416m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239417n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239418o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239419p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239420q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239421d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239422e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239423f = true;
    public long field_callTimeCount;
    public int field_countryCode;
    public long field_lastCallTime;

    static {
        p75.n0 n0Var = new p75.n0("IPCallPopularCountry");
        f239413g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239414h = new java.lang.String[0];
        f239415i = -1477067101;
        f239416m = 2122790276;
        f239417n = -1893080319;
        f239418o = 108705909;
        f239419p = initAutoDBInfo(dm.q6.class);
        f239420q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "countryCode";
        e0Var.f316955d.put("countryCode", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "countryCode";
        e0Var.f316954c[1] = "callTimeCount";
        e0Var.f316955d.put("callTimeCount", "LONG");
        e0Var.f316954c[2] = "lastCallTime";
        e0Var.f316955d.put("lastCallTime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " countryCode INTEGER PRIMARY KEY ,  callTimeCount LONG,  lastCallTime LONG";
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
            if (f239415i == hashCode) {
                try {
                    this.field_countryCode = cursor.getInt(i17);
                    this.f239421d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239416m == hashCode) {
                try {
                    this.field_callTimeCount = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239417n == hashCode) {
                try {
                    this.field_lastCallTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239418o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239421d) {
            contentValues.put("countryCode", java.lang.Integer.valueOf(this.field_countryCode));
        }
        if (this.f239422e) {
            contentValues.put("callTimeCount", java.lang.Long.valueOf(this.field_callTimeCount));
        }
        if (this.f239423f) {
            contentValues.put("lastCallTime", java.lang.Long.valueOf(this.field_lastCallTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallPopularCountry ( ");
        l75.e0 e0Var = f239419p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239414h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTableSql %s", str2);
            k0Var.A("IPCallPopularCountry", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "IPCallPopularCountry", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "updateTableSql %s", str3);
            k0Var.A("IPCallPopularCountry", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239419p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239420q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_countryCode);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239413g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239413g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("countryCode")) {
            this.field_countryCode = contentValues.getAsInteger("countryCode").intValue();
            if (z17) {
                this.f239421d = true;
            }
        }
        if (contentValues.containsKey("callTimeCount")) {
            this.field_callTimeCount = contentValues.getAsLong("callTimeCount").longValue();
            if (z17) {
                this.f239422e = true;
            }
        }
        if (contentValues.containsKey("lastCallTime")) {
            this.field_lastCallTime = contentValues.getAsLong("lastCallTime").longValue();
            if (z17) {
                this.f239423f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
