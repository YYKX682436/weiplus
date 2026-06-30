package dm;

/* loaded from: classes4.dex */
public class i extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f237471o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f237472p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237473q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237474r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237475s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237476t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237477u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237478v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237479w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237480x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237481y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f237482z;
    public java.lang.String field_aid;
    public java.lang.String field_ext;
    public int field_isAsync;
    public int field_isSelected;
    public java.lang.String field_sessionKey;
    public java.lang.String field_snsid;
    public long field_storeTime;
    public java.lang.String field_traceid;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237483d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237484e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237485f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237486g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237487h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237488i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237489m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237490n = true;

    static {
        p75.n0 n0Var = new p75.n0("AdPullRecordsInfo");
        f237471o = n0Var;
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
        f237472p = new java.lang.String[0];
        f237473q = -1067400928;
        f237474r = 96572;
        f237475s = 109595795;
        f237476t = 1691969358;
        f237477u = 2054532978;
        f237478v = 398301669;
        f237479w = 1661834217;
        f237480x = 100897;
        f237481y = 108705909;
        f237482z = initAutoDBInfo(dm.i.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "traceid";
        e0Var.f316955d.put("traceid", "TEXT");
        e0Var.f316954c[1] = "aid";
        e0Var.f316955d.put("aid", "TEXT");
        e0Var.f316954c[2] = "snsid";
        e0Var.f316955d.put("snsid", "TEXT");
        e0Var.f316954c[3] = "storeTime";
        e0Var.f316955d.put("storeTime", "LONG");
        e0Var.f316954c[4] = "isAsync";
        e0Var.f316955d.put("isAsync", "INTEGER default '0' ");
        e0Var.f316954c[5] = "isSelected";
        e0Var.f316955d.put("isSelected", "INTEGER default '1' ");
        e0Var.f316954c[6] = "sessionKey";
        e0Var.f316955d.put("sessionKey", "TEXT");
        e0Var.f316954c[7] = "ext";
        e0Var.f316955d.put("ext", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " traceid TEXT,  aid TEXT,  snsid TEXT,  storeTime LONG,  isAsync INTEGER default '0' ,  isSelected INTEGER default '1' ,  sessionKey TEXT,  ext TEXT";
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
            if (f237473q == hashCode) {
                try {
                    this.field_traceid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237474r == hashCode) {
                try {
                    this.field_aid = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237475s == hashCode) {
                try {
                    this.field_snsid = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237476t == hashCode) {
                try {
                    this.field_storeTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237477u == hashCode) {
                try {
                    this.field_isAsync = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237478v == hashCode) {
                try {
                    this.field_isSelected = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237479w == hashCode) {
                try {
                    this.field_sessionKey = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237480x == hashCode) {
                try {
                    this.field_ext = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237481y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237483d) {
            contentValues.put("traceid", this.field_traceid);
        }
        if (this.f237484e) {
            contentValues.put("aid", this.field_aid);
        }
        if (this.f237485f) {
            contentValues.put("snsid", this.field_snsid);
        }
        if (this.f237486g) {
            contentValues.put("storeTime", java.lang.Long.valueOf(this.field_storeTime));
        }
        if (this.f237487h) {
            contentValues.put("isAsync", java.lang.Integer.valueOf(this.field_isAsync));
        }
        if (this.f237488i) {
            contentValues.put("isSelected", java.lang.Integer.valueOf(this.field_isSelected));
        }
        if (this.f237489m) {
            contentValues.put("sessionKey", this.field_sessionKey);
        }
        if (this.f237490n) {
            contentValues.put("ext", this.field_ext);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdPullRecordsInfo ( ");
        l75.e0 e0Var = f237482z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237472p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTableSql %s", str2);
            k0Var.A("AdPullRecordsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AdPullRecordsInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "updateTableSql %s", str3);
            k0Var.A("AdPullRecordsInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237482z;
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
        return f237471o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237471o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("traceid")) {
            this.field_traceid = contentValues.getAsString("traceid");
            if (z17) {
                this.f237483d = true;
            }
        }
        if (contentValues.containsKey("aid")) {
            this.field_aid = contentValues.getAsString("aid");
            if (z17) {
                this.f237484e = true;
            }
        }
        if (contentValues.containsKey("snsid")) {
            this.field_snsid = contentValues.getAsString("snsid");
            if (z17) {
                this.f237485f = true;
            }
        }
        if (contentValues.containsKey("storeTime")) {
            this.field_storeTime = contentValues.getAsLong("storeTime").longValue();
            if (z17) {
                this.f237486g = true;
            }
        }
        if (contentValues.containsKey("isAsync")) {
            this.field_isAsync = contentValues.getAsInteger("isAsync").intValue();
            if (z17) {
                this.f237487h = true;
            }
        }
        if (contentValues.containsKey("isSelected")) {
            this.field_isSelected = contentValues.getAsInteger("isSelected").intValue();
            if (z17) {
                this.f237488i = true;
            }
        }
        if (contentValues.containsKey("sessionKey")) {
            this.field_sessionKey = contentValues.getAsString("sessionKey");
            if (z17) {
                this.f237489m = true;
            }
        }
        if (contentValues.containsKey("ext")) {
            this.field_ext = contentValues.getAsString("ext");
            if (z17) {
                this.f237490n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
