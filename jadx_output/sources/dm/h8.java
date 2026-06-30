package dm;

/* loaded from: classes8.dex */
public class h8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f237405m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f237406n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f237407o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f237408p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f237409q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237410r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237411s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237412t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237413u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237414v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237415w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237416x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f237417y;

    /* renamed from: z, reason: collision with root package name */
    public static final o75.e f237418z;
    public long field_createTime;
    public byte[] field_data;
    public java.lang.String field_id;
    public r45.lr4 field_showData;
    public int field_type;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237419d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237420e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237421f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237422g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237423h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237424i = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTaskInfo");
        f237405m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237406n = new p75.d(dm.i4.COL_ID, "string", tableName, "");
        f237407o = new p75.d("type", "int", tableName, "");
        f237408p = new p75.d("createTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237409q = new java.lang.String[0];
        f237410r = 3355;
        f237411s = 3575610;
        f237412t = 1369213417;
        f237413u = -295931082;
        f237414v = -339314617;
        f237415w = 3076010;
        f237416x = 108705909;
        f237417y = initAutoDBInfo(dm.h8.class);
        f237418z = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTaskInfo ( ");
        l75.e0 e0Var = f237417y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237409q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "createTableSql %s", str2);
            k0Var.A("MultiTaskInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MultiTaskInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "updateTableSql %s", str3);
            k0Var.A("MultiTaskInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "type";
        e0Var.f316955d.put("type", "INTEGER default '0' ");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[4] = "showData";
        e0Var.f316955d.put("showData", "BLOB");
        e0Var.f316954c[5] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "BLOB default '' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  type INTEGER default '0' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  showData BLOB,  data BLOB default '' ";
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
            if (f237410r == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f237419d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237411s == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237412t == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237413u == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237414v == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_showData = (r45.lr4) new r45.lr4().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237415w == hashCode) {
                try {
                    this.field_data = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237416x == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237419d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f237420e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f237421f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f237422g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f237423h) {
            r45.lr4 lr4Var = this.field_showData;
            if (lr4Var != null) {
                try {
                    contentValues.put("showData", lr4Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", e17.getMessage());
                }
            } else {
                contentValues.put("showData", (byte[]) null);
            }
        }
        if (this.f237424i) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
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
        return f237417y;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237418z;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237405m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237405m.f352676a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_ID, this.field_id);
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.field_createTime));
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
            n51.f.b(jSONObject, "showData", this.field_showData);
            n51.f.b(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f237419d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f237420e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237421f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237422g = true;
            }
        }
        if (contentValues.containsKey("showData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("showData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_showData = (r45.lr4) new r45.lr4().parseFrom(asByteArray);
                    if (z17) {
                        this.f237423h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            this.field_data = contentValues.getAsByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (z17) {
                this.f237424i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
