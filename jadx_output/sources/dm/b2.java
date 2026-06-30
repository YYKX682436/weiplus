package dm;

/* loaded from: classes13.dex */
public class b2 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f235809o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f235810p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235811q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235812r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235813s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235814t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235815u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235816v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235817w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235818x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235819y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f235820z;
    public int field_action;
    public int field_dayOfWeek;
    public int field_hourOfDay;
    public int field_isfrom;
    public long field_msgid;
    public java.lang.String field_talker;
    public long field_timestamp;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235821d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235822e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235823f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235824g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235825h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235826i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235827m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235828n = true;

    static {
        p75.n0 n0Var = new p75.n0("ChattingEvent");
        f235809o = n0Var;
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
        f235810p = new java.lang.String[0];
        f235811q = -881080743;
        f235812r = 104192092;
        f235813s = -1179549740;
        f235814t = -1422950858;
        f235815u = -730552025;
        f235816v = 985252545;
        f235817w = 3575610;
        f235818x = 55126294;
        f235819y = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "talker";
        ((java.util.HashMap) e0Var.f316955d).put("talker", "TEXT");
        e0Var.f316954c[1] = "msgid";
        ((java.util.HashMap) e0Var.f316955d).put("msgid", "LONG");
        e0Var.f316954c[2] = "isfrom";
        ((java.util.HashMap) e0Var.f316955d).put("isfrom", "INTEGER");
        e0Var.f316954c[3] = "action";
        ((java.util.HashMap) e0Var.f316955d).put("action", "INTEGER");
        e0Var.f316954c[4] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f316955d).put("dayOfWeek", "INTEGER");
        e0Var.f316954c[5] = "hourOfDay";
        ((java.util.HashMap) e0Var.f316955d).put("hourOfDay", "INTEGER");
        e0Var.f316954c[6] = "type";
        ((java.util.HashMap) e0Var.f316955d).put("type", "INTEGER");
        e0Var.f316954c[7] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        ((java.util.HashMap) e0Var.f316955d).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " talker TEXT,  msgid LONG,  isfrom INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  timestamp LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f235820z = e0Var;
        A = new o75.e();
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
            if (f235811q == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235812r == hashCode) {
                try {
                    this.field_msgid = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235813s == hashCode) {
                try {
                    this.field_isfrom = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235814t == hashCode) {
                try {
                    this.field_action = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235815u == hashCode) {
                try {
                    this.field_dayOfWeek = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235816v == hashCode) {
                try {
                    this.field_hourOfDay = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235817w == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235818x == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChattingEvent", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235819y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235821d) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f235822e) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.field_msgid));
        }
        if (this.f235823f) {
            contentValues.put("isfrom", java.lang.Integer.valueOf(this.field_isfrom));
        }
        if (this.f235824g) {
            contentValues.put("action", java.lang.Integer.valueOf(this.field_action));
        }
        if (this.f235825h) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f235826i) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f235827m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f235828n) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChattingEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChattingEvent ( ");
        l75.e0 e0Var = f235820z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235810p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChattingEvent", "createTableSql %s", str2);
            k0Var.A("ChattingEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ChattingEvent", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChattingEvent", "updateTableSql %s", str3);
            k0Var.A("ChattingEvent", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChattingEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235820z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235809o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235809o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f235821d = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f235822e = true;
            }
        }
        if (contentValues.containsKey("isfrom")) {
            this.field_isfrom = contentValues.getAsInteger("isfrom").intValue();
            if (z17) {
                this.f235823f = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f235824g = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f235825h = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f235826i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235827m = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f235828n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
