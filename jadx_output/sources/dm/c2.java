package dm;

/* loaded from: classes4.dex */
public class c2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236027n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f236028o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236029p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236030q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236031r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236032s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236033t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236034u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236035v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236036w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f236037x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f236038y;
    public long field_createTime;
    public long field_deleteTime;
    public long field_flags;
    public java.lang.String field_id;
    public long field_modifyTime;
    public long field_saveTime;
    public long field_size;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236039d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236040e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236041f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236042g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236043h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236044i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236045m = true;

    static {
        p75.n0 n0Var = new p75.n0("CleanDeleteItem");
        f236027n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236028o = new java.lang.String[0];
        f236029p = 1369213417;
        f236030q = 1211388583;
        f236031r = 1764589336;
        f236032s = 3355;
        f236033t = -2072608278;
        f236034u = 3530753;
        f236035v = 97513095;
        f236036w = 108705909;
        f236037x = initAutoDBInfo(dm.c2.class);
        f236038y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[1] = "modifyTime";
        e0Var.f316955d.put("modifyTime", "LONG default '0' ");
        e0Var.f316954c[2] = "deleteTime";
        e0Var.f316955d.put("deleteTime", "LONG default '0' ");
        e0Var.f316954c[3] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT default '' ");
        e0Var.f316954c[4] = "saveTime";
        e0Var.f316955d.put("saveTime", "LONG default '0' ");
        e0Var.f316954c[5] = "size";
        e0Var.f316955d.put("size", "LONG default '0' ");
        e0Var.f316954c[6] = "flags";
        e0Var.f316955d.put("flags", "LONG default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " createTime LONG default '0' ,  modifyTime LONG default '0' ,  deleteTime LONG default '0' ,  id TEXT default '' ,  saveTime LONG default '0' ,  size LONG default '0' ,  flags LONG default '0' ";
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
            if (f236029p == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236030q == hashCode) {
                try {
                    this.field_modifyTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236031r == hashCode) {
                try {
                    this.field_deleteTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236032s == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236033t == hashCode) {
                try {
                    this.field_saveTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236034u == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236035v == hashCode) {
                try {
                    this.field_flags = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCleanDeleteItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236036w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236039d) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f236040e) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
        }
        if (this.f236041f) {
            contentValues.put("deleteTime", java.lang.Long.valueOf(this.field_deleteTime));
        }
        if (this.field_id == null) {
            this.field_id = "";
        }
        if (this.f236042g) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f236043h) {
            contentValues.put("saveTime", java.lang.Long.valueOf(this.field_saveTime));
        }
        if (this.f236044i) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f236045m) {
            contentValues.put("flags", java.lang.Long.valueOf(this.field_flags));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCleanDeleteItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CleanDeleteItem ( ");
        l75.e0 e0Var = f236037x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236028o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "createTableSql %s", str2);
            k0Var.A("CleanDeleteItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CleanDeleteItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "updateTableSql %s", str3);
            k0Var.A("CleanDeleteItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236037x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236038y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236027n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236027n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f236039d = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f236040e = true;
            }
        }
        if (contentValues.containsKey("deleteTime")) {
            this.field_deleteTime = contentValues.getAsLong("deleteTime").longValue();
            if (z17) {
                this.f236041f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f236042g = true;
            }
        }
        if (contentValues.containsKey("saveTime")) {
            this.field_saveTime = contentValues.getAsLong("saveTime").longValue();
            if (z17) {
                this.f236043h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f236044i = true;
            }
        }
        if (contentValues.containsKey("flags")) {
            this.field_flags = contentValues.getAsLong("flags").longValue();
            if (z17) {
                this.f236045m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
