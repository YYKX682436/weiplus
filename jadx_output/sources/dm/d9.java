package dm;

/* loaded from: classes4.dex */
public class d9 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f236412g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f236413h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236414i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236415m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236416n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236417o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f236418p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f236419q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236420d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236421e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236422f = true;
    public java.lang.String field_appId;
    public int field_reportId;
    public long field_timestamp;

    static {
        p75.n0 n0Var = new p75.n0("PersistentWxaSyncInvalidCodeCmd");
        f236412g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236413h = new java.lang.String[0];
        f236414i = 93028124;
        f236415m = 55126294;
        f236416n = -427040401;
        f236417o = 108705909;
        f236418p = initAutoDBInfo(dm.d9.class);
        f236419q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[2] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  timestamp LONG,  reportId INTEGER";
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
            if (f236414i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f236420d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236415m == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236416n == hashCode) {
                try {
                    this.field_reportId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236417o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236420d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236421e) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f236422f) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PersistentWxaSyncInvalidCodeCmd ( ");
        l75.e0 e0Var = f236418p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236413h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTableSql %s", str2);
            k0Var.A("PersistentWxaSyncInvalidCodeCmd", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PersistentWxaSyncInvalidCodeCmd", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "updateTableSql %s", str3);
            k0Var.A("PersistentWxaSyncInvalidCodeCmd", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236418p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236419q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236412g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236412g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236420d = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f236421e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f236422f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
