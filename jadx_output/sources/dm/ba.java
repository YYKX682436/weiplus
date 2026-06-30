package dm;

/* loaded from: classes4.dex */
public class ba extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f235908o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f235909p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f235910q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235911r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235912s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235913t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235914u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235915v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235916w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235917x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235918y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235919z;
    public long field_createTime;
    public byte[] field_data;
    public long field_expireTime;
    public java.lang.String field_id;
    public java.lang.String field_indexData;
    public java.lang.String field_originId;
    public int field_type;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235920d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235921e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235922f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235923g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235924h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235925i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235926m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235927n = true;

    static {
        p75.n0 n0Var = new p75.n0("SecReportDataInfo");
        f235908o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235909p = new p75.d("expireTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235910q = new java.lang.String[0];
        f235911r = 3355;
        f235912s = 1379043041;
        f235913t = 1369213417;
        f235914u = -295931082;
        f235915v = -834724724;
        f235916w = 3575610;
        f235917x = 3076010;
        f235918y = -808004708;
        f235919z = 108705909;
        A = initAutoDBInfo(dm.ba.class);
        B = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "originId";
        e0Var.f316955d.put("originId", "TEXT default '' ");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[4] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG default '0' ");
        e0Var.f316954c[5] = "type";
        e0Var.f316955d.put("type", "INTEGER default '0' ");
        e0Var.f316954c[6] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "BLOB");
        e0Var.f316954c[7] = "indexData";
        e0Var.f316955d.put("indexData", "TEXT default '' ");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  originId TEXT default '' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  expireTime LONG default '0' ,  type INTEGER default '0' ,  data BLOB,  indexData TEXT default '' ";
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
            if (f235911r == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f235920d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235912s == hashCode) {
                try {
                    this.field_originId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235913t == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235914u == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235915v == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235916w == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235917x == hashCode) {
                try {
                    this.field_data = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235918y == hashCode) {
                try {
                    this.field_indexData = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSecReportDataInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235919z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235920d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.field_originId == null) {
            this.field_originId = "";
        }
        if (this.f235921e) {
            contentValues.put("originId", this.field_originId);
        }
        if (this.f235922f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f235923g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f235924h) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
        }
        if (this.f235925i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f235926m) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
        }
        if (this.field_indexData == null) {
            this.field_indexData = "";
        }
        if (this.f235927n) {
            contentValues.put("indexData", this.field_indexData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSecReportDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SecReportDataInfo ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235910q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "createTableSql %s", str2);
            k0Var.A("SecReportDataInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SecReportDataInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "updateTableSql %s", str3);
            k0Var.A("SecReportDataInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return B;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235908o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235908o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f235920d = true;
            }
        }
        if (contentValues.containsKey("originId")) {
            this.field_originId = contentValues.getAsString("originId");
            if (z17) {
                this.f235921e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f235922f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f235923g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f235924h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235925i = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            this.field_data = contentValues.getAsByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (z17) {
                this.f235926m = true;
            }
        }
        if (contentValues.containsKey("indexData")) {
            this.field_indexData = contentValues.getAsString("indexData");
            if (z17) {
                this.f235927n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
