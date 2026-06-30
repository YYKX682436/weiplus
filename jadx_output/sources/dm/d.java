package dm;

/* loaded from: classes8.dex */
public class d extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236257p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f236258q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236259r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236260s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236261t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236262u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236263v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236264w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236265x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236266y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236267z;
    public java.lang.String field_business;
    public long field_endTime;
    public java.lang.String field_expId;
    public java.lang.String field_layerId;
    public boolean field_needReport;
    public int field_prioritylevel;
    public java.lang.String field_rawXML;
    public long field_sequence;
    public long field_startTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236268d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236269e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236270f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236271g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236272h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236273i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236274m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236275n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236276o = true;

    static {
        p75.n0 n0Var = new p75.n0("ABTestItem");
        f236257p = n0Var;
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
        f236258q = new java.lang.String[0];
        f236259r = -41955764;
        f236260s = -1146830912;
        f236261t = 96960536;
        f236262u = 1349547969;
        f236263v = 852985952;
        f236264w = -2129294769;
        f236265x = -1607243192;
        f236266y = -1375370902;
        f236267z = -938030385;
        A = 108705909;
        B = initAutoDBInfo(dm.d.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "layerId";
        e0Var.f316955d.put("layerId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "layerId";
        e0Var.f316954c[1] = "business";
        e0Var.f316955d.put("business", "TEXT");
        e0Var.f316954c[2] = "expId";
        e0Var.f316955d.put("expId", "TEXT");
        e0Var.f316954c[3] = "sequence";
        e0Var.f316955d.put("sequence", "LONG");
        e0Var.f316954c[4] = "prioritylevel";
        e0Var.f316955d.put("prioritylevel", "INTEGER default '0' ");
        e0Var.f316954c[5] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[6] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[7] = "needReport";
        e0Var.f316955d.put("needReport", "INTEGER");
        e0Var.f316954c[8] = "rawXML";
        e0Var.f316955d.put("rawXML", "TEXT default '' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " layerId TEXT PRIMARY KEY ,  business TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER default '0' ,  startTime LONG,  endTime LONG,  needReport INTEGER,  rawXML TEXT default '' ";
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
            if (f236259r == hashCode) {
                try {
                    this.field_layerId = cursor.getString(i17);
                    this.f236268d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236260s == hashCode) {
                try {
                    this.field_business = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236261t == hashCode) {
                try {
                    this.field_expId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236262u == hashCode) {
                try {
                    this.field_sequence = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236263v == hashCode) {
                try {
                    this.field_prioritylevel = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236264w == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236265x == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236266y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_needReport = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236267z == hashCode) {
                try {
                    this.field_rawXML = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseABTestItem", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f236268d) {
            contentValues.put("layerId", this.field_layerId);
        }
        if (this.f236269e) {
            contentValues.put("business", this.field_business);
        }
        if (this.f236270f) {
            contentValues.put("expId", this.field_expId);
        }
        if (this.f236271g) {
            contentValues.put("sequence", java.lang.Long.valueOf(this.field_sequence));
        }
        if (this.f236272h) {
            contentValues.put("prioritylevel", java.lang.Integer.valueOf(this.field_prioritylevel));
        }
        if (this.f236273i) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f236274m) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
        }
        if (this.f236275n) {
            if (this.field_needReport) {
                contentValues.put("needReport", (java.lang.Integer) 1);
            } else {
                contentValues.put("needReport", (java.lang.Integer) 0);
            }
        }
        if (this.field_rawXML == null) {
            this.field_rawXML = "";
        }
        if (this.f236276o) {
            contentValues.put("rawXML", this.field_rawXML);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseABTestItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ABTestItem ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236258q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestItem", "createTableSql %s", str2);
            k0Var.A("ABTestItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ABTestItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestItem", "updateTableSql %s", str3);
            k0Var.A("ABTestItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseABTestItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_layerId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236257p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236257p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("layerId")) {
            this.field_layerId = contentValues.getAsString("layerId");
            if (z17) {
                this.f236268d = true;
            }
        }
        if (contentValues.containsKey("business")) {
            this.field_business = contentValues.getAsString("business");
            if (z17) {
                this.f236269e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.field_expId = contentValues.getAsString("expId");
            if (z17) {
                this.f236270f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.field_sequence = contentValues.getAsLong("sequence").longValue();
            if (z17) {
                this.f236271g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.field_prioritylevel = contentValues.getAsInteger("prioritylevel").intValue();
            if (z17) {
                this.f236272h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f236273i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f236274m = true;
            }
        }
        if (contentValues.containsKey("needReport")) {
            this.field_needReport = contentValues.getAsInteger("needReport").intValue() != 0;
            if (z17) {
                this.f236275n = true;
            }
        }
        if (contentValues.containsKey("rawXML")) {
            this.field_rawXML = contentValues.getAsString("rawXML");
            if (z17) {
                this.f236276o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
