package dm;

/* loaded from: classes7.dex */
public class j6 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f237807i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f237808m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237809n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237810o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237811p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237812q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237813r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237814s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f237815t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f237816u;
    public java.lang.String field_appusername;
    public java.lang.String field_rankID;
    public int field_sort;
    public int field_step;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237817d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237818e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237819f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237820g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237821h = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceRankFollowInfo");
        f237807i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237808m = new java.lang.String[0];
        f237809n = 417550839;
        f237810o = -938280377;
        f237811p = -265713450;
        f237812q = 3540684;
        f237813r = 3536286;
        f237814s = 108705909;
        f237815t = initAutoDBInfo(dm.j6.class);
        f237816u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appusername";
        e0Var.f316955d.put("appusername", "TEXT");
        e0Var.f316954c[1] = "rankID";
        e0Var.f316955d.put("rankID", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[3] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, "INTEGER");
        e0Var.f316954c[4] = "sort";
        e0Var.f316955d.put("sort", "INTEGER default '0' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appusername TEXT,  rankID TEXT,  username TEXT,  step INTEGER,  sort INTEGER default '0' ";
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
            if (f237809n == hashCode) {
                try {
                    this.field_appusername = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237810o == hashCode) {
                try {
                    this.field_rankID = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237811p == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237812q == hashCode) {
                try {
                    this.field_step = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237813r == hashCode) {
                try {
                    this.field_sort = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237814s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237817d) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f237818e) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f237819f) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f237820g) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, java.lang.Integer.valueOf(this.field_step));
        }
        if (this.f237821h) {
            contentValues.put("sort", java.lang.Integer.valueOf(this.field_sort));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceRankFollowInfo ( ");
        l75.e0 e0Var = f237815t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237808m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceRankFollowInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceRankFollowInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceRankFollowInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237815t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237816u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237807i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237807i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z17) {
                this.f237817d = true;
            }
        }
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z17) {
                this.f237818e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f237819f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP)) {
            this.field_step = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP).intValue();
            if (z17) {
                this.f237820g = true;
            }
        }
        if (contentValues.containsKey("sort")) {
            this.field_sort = contentValues.getAsInteger("sort").intValue();
            if (z17) {
                this.f237821h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
