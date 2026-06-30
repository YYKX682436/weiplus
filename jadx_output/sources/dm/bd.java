package dm;

/* loaded from: classes4.dex */
public class bd extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f235962f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f235963g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f235964h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235965i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235966m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f235967n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f235968o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235969d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235970e = true;
    public java.lang.String field_appId;
    public java.lang.String field_securityKeySalt;

    static {
        p75.n0 n0Var = new p75.n0("WxaSecurityStorageInfo");
        f235962f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235963g = new java.lang.String[0];
        f235964h = 93028124;
        f235965i = 905053173;
        f235966m = 108705909;
        f235967n = initAutoDBInfo(dm.bd.class);
        f235968o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "securityKeySalt";
        e0Var.f316955d.put("securityKeySalt", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " appId TEXT,  securityKeySalt TEXT";
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
            if (f235964h == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235965i == hashCode) {
                try {
                    this.field_securityKeySalt = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235966m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235969d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f235970e) {
            contentValues.put("securityKeySalt", this.field_securityKeySalt);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaSecurityStorageInfo ( ");
        l75.e0 e0Var = f235967n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235963g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTableSql %s", str2);
            k0Var.A("WxaSecurityStorageInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaSecurityStorageInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "updateTableSql %s", str3);
            k0Var.A("WxaSecurityStorageInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235967n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235968o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235962f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235962f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f235969d = true;
            }
        }
        if (contentValues.containsKey("securityKeySalt")) {
            this.field_securityKeySalt = contentValues.getAsString("securityKeySalt");
            if (z17) {
                this.f235970e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
