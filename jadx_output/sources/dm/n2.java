package dm;

/* loaded from: classes12.dex */
public class n2 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f238621n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f238622o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f238623p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f238624q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f238625r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f238626s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238627t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238628u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238629v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238630w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238631x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238632y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238633z;
    private long field_bizType;
    private byte[] field_extData;
    private java.lang.String field_id;
    private java.lang.String field_md5;
    private java.lang.String field_path;
    private long field_size;
    private long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238634d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238635e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238636f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238637g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238638h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238639i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238640m = false;

    static {
        p75.n0 n0Var = new p75.n0("DupCheckInfo");
        f238621n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238622o = new p75.d(dm.i4.COL_ID, "string", tableName, "");
        f238623p = new p75.d("md5", "string", tableName, "");
        f238624q = new p75.d("size", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238625r = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238626s = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS md5Index ON DupCheckInfo(md5)"};
        f238627t = 3355;
        f238628u = 107902;
        f238629v = 3530753;
        f238630w = 3433509;
        f238631x = -97599763;
        f238632y = -295931082;
        f238633z = -1306659477;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "md5";
        ((java.util.HashMap) e0Var.f316955d).put("md5", "TEXT");
        e0Var.f316954c[2] = "size";
        ((java.util.HashMap) e0Var.f316955d).put("size", "LONG default '0' ");
        e0Var.f316954c[3] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        ((java.util.HashMap) e0Var.f316955d).put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT default '' ");
        e0Var.f316954c[4] = "bizType";
        ((java.util.HashMap) e0Var.f316955d).put("bizType", "LONG default '0' ");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[6] = "extData";
        ((java.util.HashMap) e0Var.f316955d).put("extData", "BLOB");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  md5 TEXT,  size LONG default '0' ,  path TEXT default '' ,  bizType LONG default '0' ,  updateTime LONG default '0' ,  extData BLOB";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        B = e0Var;
        C = new o75.e();
    }

    public static p75.l0 A0(java.lang.String str, long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = f238623p.j(str).c(f238624q.i(java.lang.Long.valueOf(j17)));
        p75.i0 g17 = f238621n.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return g17.a();
    }

    public static final m75.b t0(dm.n2 n2Var, boolean z17) {
        if (!z17) {
            return new m75.b(n2Var, null, null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        n2Var.getClass();
        o75.c cVar = new o75.c(o75.b.f343584e, java.lang.String.valueOf(n2Var.field_id), "MicroMsg.SDK.BaseDupCheckInfo");
        cVar.f343590d = n2Var;
        return new m75.b(n2Var, cVar, C, "MicroMsg.SDK.BaseDupCheckInfo");
    }

    public static final p75.l0 z0(java.lang.String str) {
        p75.i0 i17 = f238621n.i();
        i17.f352657d = f238622o.j(str);
        i17.f352656c = "MicroMsg.SDK.BaseDupCheckInfo";
        return i17.a();
    }

    public void D0(long j17) {
        this.field_bizType = j17;
        this.f238638h = true;
    }

    public void F0(byte[] bArr) {
        this.field_extData = bArr;
        this.f238640m = true;
    }

    public void G0(java.lang.String str) {
        this.field_id = str;
        this.f238634d = true;
    }

    public void I0(java.lang.String str) {
        this.field_md5 = str;
        this.f238635e = true;
    }

    public void J0(java.lang.String str) {
        this.field_path = str;
        this.f238637g = true;
    }

    public void L0(long j17) {
        this.field_size = j17;
        this.f238636f = true;
    }

    public void P0(long j17) {
        this.field_updateTime = j17;
        this.f238639i = true;
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
            if (f238627t == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f238634d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238628u == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238629v == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238630w == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238631x == hashCode) {
                try {
                    this.field_bizType = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238632y == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238633z == hashCode) {
                try {
                    this.field_extData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDupCheckInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238634d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f238635e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f238636f) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.field_path == null) {
            this.field_path = "";
        }
        if (this.f238637g) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f238638h) {
            contentValues.put("bizType", java.lang.Long.valueOf(this.field_bizType));
        }
        if (this.f238639i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f238640m) {
            contentValues.put("extData", this.field_extData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseDupCheckInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DupCheckInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238626s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "createTableSql %s", str2);
            k0Var.A("DupCheckInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "DupCheckInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "updateTableSql %s", str3);
            k0Var.A("DupCheckInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    public java.lang.String getPath() {
        return this.field_path;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238621n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238621n.f352676a;
    }

    public long replaceToDB(l75.k0 k0Var, boolean z17) {
        m75.d dVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(this.field_id), "MicroMsg.SDK.BaseDupCheckInfo");
            cVar.f343590d = this;
            dVar = new m75.d(this, cVar, C, "MicroMsg.SDK.BaseDupCheckInfo");
        } else {
            dVar = new m75.d(this, null, null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        return dVar.a(k0Var);
    }

    public long u0() {
        return this.field_bizType;
    }

    public byte[] v0() {
        return this.field_extData;
    }

    public java.lang.String w0() {
        return this.field_id;
    }

    public long y0() {
        return this.field_size;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f238634d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f238635e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f238636f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f238637g = true;
            }
        }
        if (contentValues.containsKey("bizType")) {
            this.field_bizType = contentValues.getAsLong("bizType").longValue();
            if (z17) {
                this.f238638h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238639i = true;
            }
        }
        if (contentValues.containsKey("extData")) {
            this.field_extData = contentValues.getAsByteArray("extData");
            if (z17) {
                this.f238640m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
