package dm;

/* loaded from: classes7.dex */
public class m7 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238494i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238495m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238496n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238497o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238498p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238499q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238500r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238501s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f238502t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f238503u;
    public int field_action;
    public int field_dayOfWeek;
    public int field_hasDisturbance;
    public int field_hourOfDay;
    public long field_timestamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238504d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238505e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238506f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238507g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238508h = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveHomeNoRedDotEvent");
        f238494i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238495m = new java.lang.String[0];
        f238496n = -142210860;
        f238497o = -1422950858;
        f238498p = -730552025;
        f238499q = 985252545;
        f238500r = 55126294;
        f238501s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "hasDisturbance";
        ((java.util.HashMap) e0Var.f316955d).put("hasDisturbance", "INTEGER");
        e0Var.f316954c[1] = "action";
        ((java.util.HashMap) e0Var.f316955d).put("action", "INTEGER");
        e0Var.f316954c[2] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f316955d).put("dayOfWeek", "INTEGER");
        e0Var.f316954c[3] = "hourOfDay";
        ((java.util.HashMap) e0Var.f316955d).put("hourOfDay", "INTEGER");
        e0Var.f316954c[4] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        ((java.util.HashMap) e0Var.f316955d).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " hasDisturbance INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  timestamp LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f238502t = e0Var;
        f238503u = new o75.e();
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
            if (f238496n == hashCode) {
                try {
                    this.field_hasDisturbance = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238497o == hashCode) {
                try {
                    this.field_action = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238498p == hashCode) {
                try {
                    this.field_dayOfWeek = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238499q == hashCode) {
                try {
                    this.field_hourOfDay = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238500r == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238501s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238504d) {
            contentValues.put("hasDisturbance", java.lang.Integer.valueOf(this.field_hasDisturbance));
        }
        if (this.f238505e) {
            contentValues.put("action", java.lang.Integer.valueOf(this.field_action));
        }
        if (this.f238506f) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f238507g) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f238508h) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveHomeNoRedDotEvent ( ");
        l75.e0 e0Var = f238502t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238495m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTableSql %s", str2);
            k0Var.A("LiveHomeNoRedDotEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiveHomeNoRedDotEvent", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "updateTableSql %s", str3);
            k0Var.A("LiveHomeNoRedDotEvent", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238502t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238503u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238494i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238494i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("hasDisturbance")) {
            this.field_hasDisturbance = contentValues.getAsInteger("hasDisturbance").intValue();
            if (z17) {
                this.f238504d = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f238505e = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f238506f = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f238507g = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f238508h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
