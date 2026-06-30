package dm;

/* loaded from: classes7.dex */
public class h6 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f237377i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f237378m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237379n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237380o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237381p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237382q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237383r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237384s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f237385t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f237386u;
    public java.lang.String field_appusername;
    public java.lang.String field_liketips;
    public java.lang.String field_rankID;
    public int field_timestamp;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237387d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237388e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237389f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237390g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237391h = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceLikeUser");
        f237377i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237378m = new java.lang.String[0];
        f237379n = -938280377;
        f237380o = 417550839;
        f237381p = -265713450;
        f237382q = 55126294;
        f237383r = 1103716175;
        f237384s = 108705909;
        f237385t = initAutoDBInfo(dm.h6.class);
        f237386u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "rankID";
        e0Var.f316955d.put("rankID", "TEXT");
        e0Var.f316954c[1] = "appusername";
        e0Var.f316955d.put("appusername", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[3] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "INTEGER default '0' ");
        e0Var.f316954c[4] = "liketips";
        e0Var.f316955d.put("liketips", "TEXT default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " rankID TEXT,  appusername TEXT,  username TEXT,  timestamp INTEGER default '0' ,  liketips TEXT default '' ";
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
            if (f237379n == hashCode) {
                try {
                    this.field_rankID = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237380o == hashCode) {
                try {
                    this.field_appusername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237381p == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237382q == hashCode) {
                try {
                    this.field_timestamp = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237383r == hashCode) {
                try {
                    this.field_liketips = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceLikeUser", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237384s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237387d) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f237388e) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f237389f) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f237390g) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Integer.valueOf(this.field_timestamp));
        }
        if (this.field_liketips == null) {
            this.field_liketips = "";
        }
        if (this.f237391h) {
            contentValues.put("liketips", this.field_liketips);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceLikeUser ( ");
        l75.e0 e0Var = f237385t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237378m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTableSql %s", str2);
            k0Var.A("HardDeviceLikeUser", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceLikeUser", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "updateTableSql %s", str3);
            k0Var.A("HardDeviceLikeUser", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237385t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237386u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237377i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237377i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z17) {
                this.f237387d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z17) {
                this.f237388e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f237389f = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsInteger(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).intValue();
            if (z17) {
                this.f237390g = true;
            }
        }
        if (contentValues.containsKey("liketips")) {
            this.field_liketips = contentValues.getAsString("liketips");
            if (z17) {
                this.f237391h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
