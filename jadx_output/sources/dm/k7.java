package dm;

/* loaded from: classes4.dex */
public class k7 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final l75.e0 E;
    public static final o75.e F;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f238045p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f238046q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f238047r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f238048s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f238049t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238050u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238051v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238052w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238053x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238054y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238055z;
    private byte[] field_byteData;
    private r45.rd0 field_pbData;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238056d = false;
    private java.lang.String field_id = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f238057e = false;
    private java.lang.String field_info = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f238058f = false;
    private long field_timestamp = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238059g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238060h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238061i = false;
    private double field_doubleData = 0.0d;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238062m = false;
    private short field_shortData = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238063n = false;
    private int field_intData = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238064o = false;
    private long field_longData = 0;

    static {
        p75.n0 n0Var = new p75.n0("LiveDemoDBInfo");
        f238045p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        p75.d dVar = new p75.d(dm.i4.COL_ID, "string", tableName, "");
        f238046q = dVar;
        p75.d dVar2 = new p75.d("info", "string", tableName, "");
        p75.d dVar3 = new p75.d(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "long", tableName, "");
        f238047r = new p75.d("intData", "int", tableName, "");
        f238048s = new p75.d("longData", "long", tableName, "");
        p75.v f17 = n0Var.f("IdInfoTimestamp");
        f17.b(dVar, dVar2, dVar3);
        f238049t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TimestampIndex ON LiveDemoDBInfo(timestamp)", f17.a().f352636a};
        f238050u = 3355;
        f238051v = 3237038;
        f238052w = 55126294;
        f238053x = -1868103470;
        f238054y = -995874628;
        f238055z = 778276635;
        A = -2028516794;
        B = 1957063737;
        C = -2074899386;
        D = 108705909;
        E = initAutoDBInfo(dm.k7.class);
        F = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveDemoDBInfo ( ");
        l75.e0 e0Var = E;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238049t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTableSql %s", str2);
            k0Var.A("LiveDemoDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiveDemoDBInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "updateTableSql %s", str3);
            k0Var.A("LiveDemoDBInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "info";
        e0Var.f316955d.put("info", "TEXT default '' ");
        e0Var.f316954c[2] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        e0Var.f316954c[3] = "byteData";
        e0Var.f316955d.put("byteData", "BLOB");
        e0Var.f316954c[4] = "pbData";
        e0Var.f316955d.put("pbData", "BLOB");
        e0Var.f316954c[5] = "doubleData";
        e0Var.f316955d.put("doubleData", "DOUBLE default '0' ");
        e0Var.f316954c[6] = "shortData";
        e0Var.f316955d.put("shortData", "SHORT default '0' ");
        e0Var.f316954c[7] = "intData";
        e0Var.f316955d.put("intData", "INTEGER default '0' ");
        e0Var.f316954c[8] = "longData";
        e0Var.f316955d.put("longData", "LONG default '0' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  info TEXT default '' ,  timestamp LONG default '0' ,  byteData BLOB,  pbData BLOB,  doubleData DOUBLE default '0' ,  shortData SHORT default '0' ,  intData INTEGER default '0' ,  longData LONG default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public static final m75.c w0(dm.k7 k7Var, boolean z17) {
        if (!z17) {
            return new m75.c(k7Var, true, null, null, "MicroMsg.SDK.BaseLiveDemoDBInfo");
        }
        k7Var.getClass();
        o75.c cVar = new o75.c(o75.b.f343582c, java.lang.String.valueOf(k7Var.field_id), "MicroMsg.SDK.BaseLiveDemoDBInfo");
        cVar.f343590d = k7Var;
        return new m75.c(k7Var, true, cVar, F, "MicroMsg.SDK.BaseLiveDemoDBInfo");
    }

    public void A0(java.lang.String str) {
        this.field_info = str;
        this.f238057e = true;
    }

    public void D0(int i17) {
        this.field_intData = i17;
        this.f238063n = true;
    }

    public void F0(long j17) {
        this.field_longData = j17;
        this.f238064o = true;
    }

    public void G0(short s17) {
        this.field_shortData = s17;
        this.f238062m = true;
    }

    public void I0(long j17) {
        this.field_timestamp = j17;
        this.f238058f = true;
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
            if (f238050u == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f238056d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238051v == hashCode) {
                try {
                    this.field_info = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238052w == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238053x == hashCode) {
                try {
                    this.field_byteData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238054y == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_pbData = (r45.rd0) new r45.rd0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238055z == hashCode) {
                try {
                    this.field_doubleData = cursor.getDouble(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_shortData = cursor.getShort(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_intData = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_longData = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveDemoDBInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238056d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.field_info == null) {
            this.field_info = "";
        }
        if (this.f238057e) {
            contentValues.put("info", this.field_info);
        }
        if (this.f238058f) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f238059g) {
            contentValues.put("byteData", this.field_byteData);
        }
        if (this.f238060h) {
            r45.rd0 rd0Var = this.field_pbData;
            if (rd0Var != null) {
                try {
                    contentValues.put("pbData", rd0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", e17.getMessage());
                }
            } else {
                contentValues.put("pbData", (byte[]) null);
            }
        }
        if (this.f238061i) {
            contentValues.put("doubleData", java.lang.Double.valueOf(this.field_doubleData));
        }
        if (this.f238062m) {
            contentValues.put("shortData", java.lang.Short.valueOf(this.field_shortData));
        }
        if (this.f238063n) {
            contentValues.put("intData", java.lang.Integer.valueOf(this.field_intData));
        }
        if (this.f238064o) {
            contentValues.put("longData", java.lang.Long.valueOf(this.field_longData));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        createTable(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return E;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return F;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238045p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238045p.f352676a;
    }

    public java.lang.String t0() {
        return this.field_id;
    }

    public java.lang.String u0() {
        return this.field_info;
    }

    public long v0() {
        return this.field_timestamp;
    }

    public void y0(double d17) {
        this.field_doubleData = d17;
        this.f238061i = true;
    }

    public void z0(java.lang.String str) {
        this.field_id = str;
        this.f238056d = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f238056d = true;
            }
        }
        if (contentValues.containsKey("info")) {
            this.field_info = contentValues.getAsString("info");
            if (z17) {
                this.f238057e = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f238058f = true;
            }
        }
        if (contentValues.containsKey("byteData")) {
            this.field_byteData = contentValues.getAsByteArray("byteData");
            if (z17) {
                this.f238059g = true;
            }
        }
        if (contentValues.containsKey("pbData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("pbData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_pbData = (r45.rd0) new r45.rd0().parseFrom(asByteArray);
                    if (z17) {
                        this.f238060h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("doubleData")) {
            this.field_doubleData = contentValues.getAsDouble("doubleData").doubleValue();
            if (z17) {
                this.f238061i = true;
            }
        }
        if (contentValues.containsKey("shortData")) {
            this.field_shortData = contentValues.getAsShort("shortData").shortValue();
            if (z17) {
                this.f238062m = true;
            }
        }
        if (contentValues.containsKey("intData")) {
            this.field_intData = contentValues.getAsInteger("intData").intValue();
            if (z17) {
                this.f238063n = true;
            }
        }
        if (contentValues.containsKey("longData")) {
            this.field_longData = contentValues.getAsLong("longData").longValue();
            if (z17) {
                this.f238064o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
