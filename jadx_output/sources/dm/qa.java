package dm;

/* loaded from: classes13.dex */
public class qa extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f239467p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f239468q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239469r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239470s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239471t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239472u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239473v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239474w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239475x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239476y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239477z;
    public int field_action;
    public java.lang.String field_city;
    public int field_dayOfWeek;
    public int field_hourOfDay;
    public java.lang.String field_owner;
    public java.lang.String field_snsid;
    public long field_timestamp;
    public int field_type;
    public int field_weishang;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239478d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239479e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239480f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239481g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239482h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239483i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239484m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239485n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239486o = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsFeature");
        f239467p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239468q = new java.lang.String[0];
        f239469r = 109595795;
        f239470s = 106164915;
        f239471t = -1422950858;
        f239472u = -730552025;
        f239473v = 985252545;
        f239474w = 3575610;
        f239475x = 3053931;
        f239476y = -499948310;
        f239477z = 55126294;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "snsid";
        ((java.util.HashMap) e0Var.f316955d).put("snsid", "TEXT");
        e0Var.f316954c[1] = "owner";
        ((java.util.HashMap) e0Var.f316955d).put("owner", "TEXT");
        e0Var.f316954c[2] = "action";
        ((java.util.HashMap) e0Var.f316955d).put("action", "INTEGER");
        e0Var.f316954c[3] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f316955d).put("dayOfWeek", "INTEGER");
        e0Var.f316954c[4] = "hourOfDay";
        ((java.util.HashMap) e0Var.f316955d).put("hourOfDay", "INTEGER");
        e0Var.f316954c[5] = "type";
        ((java.util.HashMap) e0Var.f316955d).put("type", "INTEGER");
        e0Var.f316954c[6] = "city";
        ((java.util.HashMap) e0Var.f316955d).put("city", "TEXT");
        e0Var.f316954c[7] = "weishang";
        ((java.util.HashMap) e0Var.f316955d).put("weishang", "INTEGER");
        e0Var.f316954c[8] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        ((java.util.HashMap) e0Var.f316955d).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " snsid TEXT,  owner TEXT,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  city TEXT,  weishang INTEGER,  timestamp LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        B = e0Var;
        C = new o75.e();
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
            if (f239469r == hashCode) {
                try {
                    this.field_snsid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239470s == hashCode) {
                try {
                    this.field_owner = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239471t == hashCode) {
                try {
                    this.field_action = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239472u == hashCode) {
                try {
                    this.field_dayOfWeek = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239473v == hashCode) {
                try {
                    this.field_hourOfDay = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239474w == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239475x == hashCode) {
                try {
                    this.field_city = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239476y == hashCode) {
                try {
                    this.field_weishang = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239477z == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsFeature", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239478d) {
            contentValues.put("snsid", this.field_snsid);
        }
        if (this.f239479e) {
            contentValues.put("owner", this.field_owner);
        }
        if (this.f239480f) {
            contentValues.put("action", java.lang.Integer.valueOf(this.field_action));
        }
        if (this.f239481g) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f239482h) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f239483i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f239484m) {
            contentValues.put("city", this.field_city);
        }
        if (this.f239485n) {
            contentValues.put("weishang", java.lang.Integer.valueOf(this.field_weishang));
        }
        if (this.f239486o) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsFeature", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsFeature ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239468q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsFeature", "createTableSql %s", str2);
            k0Var.A("SnsFeature", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsFeature", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsFeature", "updateTableSql %s", str3);
            k0Var.A("SnsFeature", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsFeature", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239467p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239467p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsid")) {
            this.field_snsid = contentValues.getAsString("snsid");
            if (z17) {
                this.f239478d = true;
            }
        }
        if (contentValues.containsKey("owner")) {
            this.field_owner = contentValues.getAsString("owner");
            if (z17) {
                this.f239479e = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f239480f = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f239481g = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f239482h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f239483i = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z17) {
                this.f239484m = true;
            }
        }
        if (contentValues.containsKey("weishang")) {
            this.field_weishang = contentValues.getAsInteger("weishang").intValue();
            if (z17) {
                this.f239485n = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f239486o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
