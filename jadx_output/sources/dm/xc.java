package dm;

/* loaded from: classes4.dex */
public class xc extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241119f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241120g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241121h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241122i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241123m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241124n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241125o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241126d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241127e = true;
    public java.lang.String field_appId;
    public byte[] field_permissionProtoBlob;

    static {
        p75.n0 n0Var = new p75.n0("WxaJsApiPluginInfo");
        f241119f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241120g = new java.lang.String[0];
        f241121h = 93028124;
        f241122i = -141251434;
        f241123m = 108705909;
        f241124n = initAutoDBInfo(dm.xc.class);
        f241125o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "permissionProtoBlob";
        e0Var.f316955d.put("permissionProtoBlob", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  permissionProtoBlob BLOB";
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
            if (f241121h == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f241126d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaJsApiPluginInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241122i == hashCode) {
                try {
                    this.field_permissionProtoBlob = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaJsApiPluginInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241123m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241126d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f241127e) {
            contentValues.put("permissionProtoBlob", this.field_permissionProtoBlob);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaJsApiPluginInfo ( ");
        l75.e0 e0Var = f241124n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241120g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTableSql %s", str2);
            k0Var.A("WxaJsApiPluginInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaJsApiPluginInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "updateTableSql %s", str3);
            k0Var.A("WxaJsApiPluginInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241124n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241125o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241119f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241119f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f241126d = true;
            }
        }
        if (contentValues.containsKey("permissionProtoBlob")) {
            this.field_permissionProtoBlob = contentValues.getAsByteArray("permissionProtoBlob");
            if (z17) {
                this.f241127e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
