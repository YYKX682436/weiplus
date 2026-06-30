package dm;

/* loaded from: classes8.dex */
public class c extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f235971o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f235972p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235973q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235974r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235975s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235976t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235977u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235978v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235979w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235980x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235981y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f235982z;
    public java.lang.String field_abtestkey;
    public long field_endTime;
    public java.lang.String field_expId;
    public boolean field_noReport;
    public int field_prioritylevel;
    public long field_sequence;
    public long field_startTime;
    public java.lang.String field_value;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235983d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235984e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235985f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235986g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235987h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235988i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235989m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235990n = true;

    static {
        p75.n0 n0Var = new p75.n0("ABTestInfo");
        f235971o = n0Var;
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
        f235972p = new java.lang.String[0];
        f235973q = -1655147188;
        f235974r = 111972721;
        f235975s = 96960536;
        f235976t = 1349547969;
        f235977u = 852985952;
        f235978v = -2129294769;
        f235979w = -1607243192;
        f235980x = 608582229;
        f235981y = 108705909;
        f235982z = initAutoDBInfo(dm.c.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "abtestkey";
        e0Var.f316955d.put("abtestkey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "abtestkey";
        e0Var.f316954c[1] = "value";
        e0Var.f316955d.put("value", "TEXT");
        e0Var.f316954c[2] = "expId";
        e0Var.f316955d.put("expId", "TEXT");
        e0Var.f316954c[3] = "sequence";
        e0Var.f316955d.put("sequence", "LONG");
        e0Var.f316954c[4] = "prioritylevel";
        e0Var.f316955d.put("prioritylevel", "INTEGER");
        e0Var.f316954c[5] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[6] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[7] = "noReport";
        e0Var.f316955d.put("noReport", "INTEGER");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " abtestkey TEXT PRIMARY KEY ,  value TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER,  startTime LONG,  endTime LONG,  noReport INTEGER";
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
            boolean z17 = true;
            if (f235973q == hashCode) {
                try {
                    this.field_abtestkey = cursor.getString(i17);
                    this.f235983d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235974r == hashCode) {
                try {
                    this.field_value = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235975s == hashCode) {
                try {
                    this.field_expId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235976t == hashCode) {
                try {
                    this.field_sequence = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235977u == hashCode) {
                try {
                    this.field_prioritylevel = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235978v == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235979w == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235980x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_noReport = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235981y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235983d) {
            contentValues.put("abtestkey", this.field_abtestkey);
        }
        if (this.f235984e) {
            contentValues.put("value", this.field_value);
        }
        if (this.f235985f) {
            contentValues.put("expId", this.field_expId);
        }
        if (this.f235986g) {
            contentValues.put("sequence", java.lang.Long.valueOf(this.field_sequence));
        }
        if (this.f235987h) {
            contentValues.put("prioritylevel", java.lang.Integer.valueOf(this.field_prioritylevel));
        }
        if (this.f235988i) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f235989m) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
        }
        if (this.f235990n) {
            if (this.field_noReport) {
                contentValues.put("noReport", (java.lang.Integer) 1);
            } else {
                contentValues.put("noReport", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ABTestInfo ( ");
        l75.e0 e0Var = f235982z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235972p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestInfo", "createTableSql %s", str2);
            k0Var.A("ABTestInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ABTestInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestInfo", "updateTableSql %s", str3);
            k0Var.A("ABTestInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235982z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_abtestkey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235971o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235971o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("abtestkey")) {
            this.field_abtestkey = contentValues.getAsString("abtestkey");
            if (z17) {
                this.f235983d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z17) {
                this.f235984e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.field_expId = contentValues.getAsString("expId");
            if (z17) {
                this.f235985f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.field_sequence = contentValues.getAsLong("sequence").longValue();
            if (z17) {
                this.f235986g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.field_prioritylevel = contentValues.getAsInteger("prioritylevel").intValue();
            if (z17) {
                this.f235987h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f235988i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f235989m = true;
            }
        }
        if (contentValues.containsKey("noReport")) {
            this.field_noReport = contentValues.getAsInteger("noReport").intValue() != 0;
            if (z17) {
                this.f235990n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
