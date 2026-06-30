package dm;

/* loaded from: classes4.dex */
public class wc extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f240922g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f240923h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240924i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240925m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240926n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240927o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f240928p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f240929q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240930d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240931e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240932f = true;
    public java.lang.String field_appId;
    public boolean field_permissionDemo;
    public long field_versiontime;

    static {
        p75.n0 n0Var = new p75.n0("WxaCheckDemoInfo");
        f240922g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240923h = new java.lang.String[0];
        f240924i = 93028124;
        f240925m = -1438599086;
        f240926n = 690045861;
        f240927o = 108705909;
        f240928p = initAutoDBInfo(dm.wc.class);
        f240929q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "permissionDemo";
        e0Var.f316955d.put("permissionDemo", "INTEGER default 'false' ");
        e0Var.f316954c[2] = "versiontime";
        e0Var.f316955d.put("versiontime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  permissionDemo INTEGER default 'false' ,  versiontime LONG";
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
            boolean z17 = true;
            if (f240924i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f240930d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240925m == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_permissionDemo = z17;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240926n == hashCode) {
                try {
                    this.field_versiontime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaCheckDemoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240927o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240930d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f240931e) {
            if (this.field_permissionDemo) {
                contentValues.put("permissionDemo", (java.lang.Integer) 1);
            } else {
                contentValues.put("permissionDemo", (java.lang.Integer) 0);
            }
        }
        if (this.f240932f) {
            contentValues.put("versiontime", java.lang.Long.valueOf(this.field_versiontime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaCheckDemoInfo ( ");
        l75.e0 e0Var = f240928p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240923h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTableSql %s", str2);
            k0Var.A("WxaCheckDemoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaCheckDemoInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "updateTableSql %s", str3);
            k0Var.A("WxaCheckDemoInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240928p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240929q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240922g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240922g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f240930d = true;
            }
        }
        if (contentValues.containsKey("permissionDemo")) {
            this.field_permissionDemo = contentValues.getAsInteger("permissionDemo").intValue() != 0;
            if (z17) {
                this.f240931e = true;
            }
        }
        if (contentValues.containsKey("versiontime")) {
            this.field_versiontime = contentValues.getAsLong("versiontime").longValue();
            if (z17) {
                this.f240932f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
