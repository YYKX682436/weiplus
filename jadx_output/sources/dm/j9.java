package dm;

/* loaded from: classes4.dex */
public class j9 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237865g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f237866h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237867i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237868m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237869n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237870o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237871p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237872q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237873d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237874e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237875f = true;
    public java.lang.String field_appId;
    public long field_devKey;
    public java.lang.String field_versionDesc;

    static {
        p75.n0 n0Var = new p75.n0("PluginDevLaunchInfo");
        f237865g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237866h = new java.lang.String[0];
        f237867i = 93028124;
        f237868m = 688612233;
        f237869n = -1335185910;
        f237870o = 108705909;
        f237871p = initAutoDBInfo(dm.j9.class);
        f237872q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "versionDesc";
        e0Var.f316955d.put("versionDesc", "TEXT");
        e0Var.f316954c[2] = "devKey";
        e0Var.f316955d.put("devKey", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT,  versionDesc TEXT,  devKey LONG";
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
            if (f237867i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237868m == hashCode) {
                try {
                    this.field_versionDesc = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237869n == hashCode) {
                try {
                    this.field_devKey = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginDevLaunchInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237870o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237873d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237874e) {
            contentValues.put("versionDesc", this.field_versionDesc);
        }
        if (this.f237875f) {
            contentValues.put("devKey", java.lang.Long.valueOf(this.field_devKey));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PluginDevLaunchInfo ( ");
        l75.e0 e0Var = f237871p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237866h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTableSql %s", str2);
            k0Var.A("PluginDevLaunchInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PluginDevLaunchInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginDevLaunchInfo", "updateTableSql %s", str3);
            k0Var.A("PluginDevLaunchInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginDevLaunchInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237871p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237872q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237865g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237865g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237873d = true;
            }
        }
        if (contentValues.containsKey("versionDesc")) {
            this.field_versionDesc = contentValues.getAsString("versionDesc");
            if (z17) {
                this.f237874e = true;
            }
        }
        if (contentValues.containsKey("devKey")) {
            this.field_devKey = contentValues.getAsLong("devKey").longValue();
            if (z17) {
                this.f237875f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
