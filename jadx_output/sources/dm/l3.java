package dm;

/* loaded from: classes12.dex */
public class l3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f238208p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f238209q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f238210r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f238211s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238212t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238213u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238214v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238215w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238216x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238217y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238218z;
    private java.lang.String field_clientVersion;
    private int field_delFlag;
    private java.lang.String field_delSource;
    private long field_delTime;
    private int field_delType;
    private int field_favId;
    private int field_itemType;
    private java.lang.String field_oriXml;
    private long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238219d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238220e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238221f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238222g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238223h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238224i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238225m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238226n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238227o = false;

    static {
        p75.n0 n0Var = new p75.n0("FavDelInfo");
        f238208p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238209q = new p75.d("favId", "int", tableName, "");
        f238210r = new p75.d("delTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238211s = new java.lang.String[0];
        f238212t = 97204630;
        f238213u = 1549946232;
        f238214v = -878156794;
        f238215w = -1008634031;
        f238216x = 771880589;
        f238217y = 1549961701;
        f238218z = 1177533677;
        A = -295931082;
        B = 1549531671;
        C = 108705909;
        D = initAutoDBInfo(dm.l3.class);
        E = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavDelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavDelInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238211s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavDelInfo", "createTableSql %s", str2);
            k0Var.A("FavDelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavDelInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavDelInfo", "updateTableSql %s", str3);
            k0Var.A("FavDelInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavDelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "favId";
        e0Var.f316955d.put("favId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "favId";
        e0Var.f316954c[1] = "delTime";
        e0Var.f316955d.put("delTime", "LONG default '0' ");
        e0Var.f316954c[2] = "delSource";
        e0Var.f316955d.put("delSource", "TEXT default '' ");
        e0Var.f316954c[3] = "oriXml";
        e0Var.f316955d.put("oriXml", "TEXT default '' ");
        e0Var.f316954c[4] = "clientVersion";
        e0Var.f316955d.put("clientVersion", "TEXT default '' ");
        e0Var.f316954c[5] = "delType";
        e0Var.f316955d.put("delType", "INTEGER default '0' ");
        e0Var.f316954c[6] = "itemType";
        e0Var.f316955d.put("itemType", "INTEGER default '0' ");
        e0Var.f316954c[7] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[8] = "delFlag";
        e0Var.f316955d.put("delFlag", "INTEGER default '0' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " favId INTEGER PRIMARY KEY ,  delTime LONG default '0' ,  delSource TEXT default '' ,  oriXml TEXT default '' ,  clientVersion TEXT default '' ,  delType INTEGER default '0' ,  itemType INTEGER default '0' ,  updateTime LONG default '0' ,  delFlag INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public void A0(int i17) {
        this.field_delType = i17;
        this.f238224i = true;
    }

    public void D0(int i17) {
        this.field_favId = i17;
        this.f238219d = true;
    }

    public void F0(int i17) {
        this.field_itemType = i17;
        this.f238225m = true;
    }

    public void G0(long j17) {
        this.field_updateTime = j17;
        this.f238226n = true;
    }

    @Override // l75.f0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "favId", java.lang.Integer.valueOf(this.field_favId));
            n51.f.b(jSONObject, "delTime", java.lang.Long.valueOf(this.field_delTime));
            n51.f.b(jSONObject, "delSource", this.field_delSource);
            n51.f.b(jSONObject, "oriXml", this.field_oriXml);
            n51.f.b(jSONObject, "clientVersion", this.field_clientVersion);
            n51.f.b(jSONObject, "delType", java.lang.Integer.valueOf(this.field_delType));
            n51.f.b(jSONObject, "itemType", java.lang.Integer.valueOf(this.field_itemType));
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
            n51.f.b(jSONObject, "delFlag", java.lang.Integer.valueOf(this.field_delFlag));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
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
            if (f238212t == hashCode) {
                try {
                    this.field_favId = cursor.getInt(i17);
                    this.f238219d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238213u == hashCode) {
                try {
                    this.field_delTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238214v == hashCode) {
                try {
                    this.field_delSource = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238215w == hashCode) {
                try {
                    this.field_oriXml = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238216x == hashCode) {
                try {
                    this.field_clientVersion = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238217y == hashCode) {
                try {
                    this.field_delType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238218z == hashCode) {
                try {
                    this.field_itemType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_delFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavDelInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238219d) {
            contentValues.put("favId", java.lang.Integer.valueOf(this.field_favId));
        }
        if (this.f238220e) {
            contentValues.put("delTime", java.lang.Long.valueOf(this.field_delTime));
        }
        if (this.field_delSource == null) {
            this.field_delSource = "";
        }
        if (this.f238221f) {
            contentValues.put("delSource", this.field_delSource);
        }
        if (this.field_oriXml == null) {
            this.field_oriXml = "";
        }
        if (this.f238222g) {
            contentValues.put("oriXml", this.field_oriXml);
        }
        if (this.field_clientVersion == null) {
            this.field_clientVersion = "";
        }
        if (this.f238223h) {
            contentValues.put("clientVersion", this.field_clientVersion);
        }
        if (this.f238224i) {
            contentValues.put("delType", java.lang.Integer.valueOf(this.field_delType));
        }
        if (this.f238225m) {
            contentValues.put("itemType", java.lang.Integer.valueOf(this.field_itemType));
        }
        if (this.f238226n) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f238227o) {
            contentValues.put("delFlag", java.lang.Integer.valueOf(this.field_delFlag));
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
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_favId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238208p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238208p.f352676a;
    }

    public int t0() {
        return this.field_delFlag;
    }

    public long u0() {
        return this.field_delTime;
    }

    public long v0() {
        return this.field_updateTime;
    }

    public void w0(java.lang.String str) {
        this.field_clientVersion = str;
        this.f238223h = true;
    }

    public void y0(int i17) {
        this.field_delFlag = i17;
        this.f238227o = true;
    }

    public void z0(long j17) {
        this.field_delTime = j17;
        this.f238220e = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("favId")) {
            this.field_favId = contentValues.getAsInteger("favId").intValue();
            if (z17) {
                this.f238219d = true;
            }
        }
        if (contentValues.containsKey("delTime")) {
            this.field_delTime = contentValues.getAsLong("delTime").longValue();
            if (z17) {
                this.f238220e = true;
            }
        }
        if (contentValues.containsKey("delSource")) {
            this.field_delSource = contentValues.getAsString("delSource");
            if (z17) {
                this.f238221f = true;
            }
        }
        if (contentValues.containsKey("oriXml")) {
            this.field_oriXml = contentValues.getAsString("oriXml");
            if (z17) {
                this.f238222g = true;
            }
        }
        if (contentValues.containsKey("clientVersion")) {
            this.field_clientVersion = contentValues.getAsString("clientVersion");
            if (z17) {
                this.f238223h = true;
            }
        }
        if (contentValues.containsKey("delType")) {
            this.field_delType = contentValues.getAsInteger("delType").intValue();
            if (z17) {
                this.f238224i = true;
            }
        }
        if (contentValues.containsKey("itemType")) {
            this.field_itemType = contentValues.getAsInteger("itemType").intValue();
            if (z17) {
                this.f238225m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238226n = true;
            }
        }
        if (contentValues.containsKey("delFlag")) {
            this.field_delFlag = contentValues.getAsInteger("delFlag").intValue();
            if (z17) {
                this.f238227o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
