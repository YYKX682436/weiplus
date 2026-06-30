package dm;

/* loaded from: classes4.dex */
public class l2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238197g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f238198h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238199i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238200m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238201n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238202o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f238203p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f238204q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238205d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238206e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238207f = true;
    public java.lang.String field_appId;
    public java.lang.String field_extJson;
    public int field_versionType;

    static {
        p75.n0 n0Var = new p75.n0("DevPkgLaunchExtInfo");
        f238197g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238198h = new java.lang.String[0];
        f238199i = 93028124;
        f238200m = 689108018;
        f238201n = -1306463575;
        f238202o = 108705909;
        f238203p = initAutoDBInfo(dm.l2.class);
        f238204q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[2] = "extJson";
        e0Var.f316955d.put("extJson", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT,  versionType INTEGER,  extJson TEXT";
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
            if (f238199i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238200m == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238201n == hashCode) {
                try {
                    this.field_extJson = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238202o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238205d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238206e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f238207f) {
            contentValues.put("extJson", this.field_extJson);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DevPkgLaunchExtInfo ( ");
        l75.e0 e0Var = f238203p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238198h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTableSql %s", str2);
            k0Var.A("DevPkgLaunchExtInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "DevPkgLaunchExtInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "updateTableSql %s", str3);
            k0Var.A("DevPkgLaunchExtInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238203p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238204q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238197g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238197g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238205d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f238206e = true;
            }
        }
        if (contentValues.containsKey("extJson")) {
            this.field_extJson = contentValues.getAsString("extJson");
            if (z17) {
                this.f238207f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
