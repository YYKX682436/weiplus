package dm;

/* loaded from: classes4.dex */
public class ad extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f235756g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f235757h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235758i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235759m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235760n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235761o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f235762p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f235763q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235764d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235765e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235766f = true;
    public java.lang.String field_pluginAppID;
    public int field_pluginAppVersion;
    public java.lang.String field_pluginStringVersion;

    static {
        p75.n0 n0Var = new p75.n0("WxaPluginCodeVersionInfo");
        f235756g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235757h = new java.lang.String[0];
        f235758i = 869640073;
        f235759m = -1159730422;
        f235760n = -1177314540;
        f235761o = 108705909;
        f235762p = initAutoDBInfo(dm.ad.class);
        f235763q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "pluginAppID";
        e0Var.f316955d.put("pluginAppID", "TEXT");
        e0Var.f316954c[1] = "pluginAppVersion";
        e0Var.f316955d.put("pluginAppVersion", "INTEGER");
        e0Var.f316954c[2] = "pluginStringVersion";
        e0Var.f316955d.put("pluginStringVersion", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " pluginAppID TEXT,  pluginAppVersion INTEGER,  pluginStringVersion TEXT";
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
            if (f235758i == hashCode) {
                try {
                    this.field_pluginAppID = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235759m == hashCode) {
                try {
                    this.field_pluginAppVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235760n == hashCode) {
                try {
                    this.field_pluginStringVersion = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235761o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235764d) {
            contentValues.put("pluginAppID", this.field_pluginAppID);
        }
        if (this.f235765e) {
            contentValues.put("pluginAppVersion", java.lang.Integer.valueOf(this.field_pluginAppVersion));
        }
        if (this.f235766f) {
            contentValues.put("pluginStringVersion", this.field_pluginStringVersion);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaPluginCodeVersionInfo ( ");
        l75.e0 e0Var = f235762p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235757h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTableSql %s", str2);
            k0Var.A("WxaPluginCodeVersionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaPluginCodeVersionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "updateTableSql %s", str3);
            k0Var.A("WxaPluginCodeVersionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPluginCodeVersionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235762p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235763q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235756g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235756g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pluginAppID")) {
            this.field_pluginAppID = contentValues.getAsString("pluginAppID");
            if (z17) {
                this.f235764d = true;
            }
        }
        if (contentValues.containsKey("pluginAppVersion")) {
            this.field_pluginAppVersion = contentValues.getAsInteger("pluginAppVersion").intValue();
            if (z17) {
                this.f235765e = true;
            }
        }
        if (contentValues.containsKey("pluginStringVersion")) {
            this.field_pluginStringVersion = contentValues.getAsString("pluginStringVersion");
            if (z17) {
                this.f235766f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
