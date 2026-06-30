package dm;

/* loaded from: classes7.dex */
public class m6 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f238477m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f238478n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238479o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238480p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238481q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238482r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238483s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238484t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238485u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f238486v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f238487w;
    public java.lang.String field_deviceId;
    public int field_deviceType;
    public java.lang.String field_iconUrl;
    public java.lang.String field_nickName;
    public int field_productType;
    public java.lang.String field_supportMsgTypeList;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238488d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238489e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238490f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238491g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238492h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238493i = true;

    static {
        p75.n0 n0Var = new p75.n0("HardIotDeviceInfo");
        f238477m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238478n = new java.lang.String[0];
        f238479o = 1109191185;
        f238480p = 781190832;
        f238481q = 69737614;
        f238482r = 1638765110;
        f238483s = -707526070;
        f238484t = -1491615543;
        f238485u = 108705909;
        f238486v = initAutoDBInfo(dm.m6.class);
        f238487w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "deviceId";
        e0Var.f316955d.put("deviceId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "deviceId";
        e0Var.f316954c[1] = "deviceType";
        e0Var.f316955d.put("deviceType", "INTEGER");
        e0Var.f316954c[2] = "nickName";
        e0Var.f316955d.put("nickName", "TEXT");
        e0Var.f316954c[3] = "iconUrl";
        e0Var.f316955d.put("iconUrl", "TEXT");
        e0Var.f316954c[4] = "supportMsgTypeList";
        e0Var.f316955d.put("supportMsgTypeList", "TEXT");
        e0Var.f316954c[5] = "productType";
        e0Var.f316955d.put("productType", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " deviceId TEXT PRIMARY KEY ,  deviceType INTEGER,  nickName TEXT,  iconUrl TEXT,  supportMsgTypeList TEXT,  productType INTEGER";
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
            if (f238479o == hashCode) {
                try {
                    this.field_deviceId = cursor.getString(i17);
                    this.f238488d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238480p == hashCode) {
                try {
                    this.field_deviceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238481q == hashCode) {
                try {
                    this.field_nickName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238482r == hashCode) {
                try {
                    this.field_iconUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238483s == hashCode) {
                try {
                    this.field_supportMsgTypeList = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238484t == hashCode) {
                try {
                    this.field_productType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotDeviceInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238485u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238488d) {
            contentValues.put("deviceId", this.field_deviceId);
        }
        if (this.f238489e) {
            contentValues.put("deviceType", java.lang.Integer.valueOf(this.field_deviceType));
        }
        if (this.f238490f) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.f238491g) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        if (this.f238492h) {
            contentValues.put("supportMsgTypeList", this.field_supportMsgTypeList);
        }
        if (this.f238493i) {
            contentValues.put("productType", java.lang.Integer.valueOf(this.field_productType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardIotDeviceInfo ( ");
        l75.e0 e0Var = f238486v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238478n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTableSql %s", str2);
            k0Var.A("HardIotDeviceInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardIotDeviceInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "updateTableSql %s", str3);
            k0Var.A("HardIotDeviceInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238486v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238487w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_deviceId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238477m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238477m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("deviceId")) {
            this.field_deviceId = contentValues.getAsString("deviceId");
            if (z17) {
                this.f238488d = true;
            }
        }
        if (contentValues.containsKey("deviceType")) {
            this.field_deviceType = contentValues.getAsInteger("deviceType").intValue();
            if (z17) {
                this.f238489e = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z17) {
                this.f238490f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f238491g = true;
            }
        }
        if (contentValues.containsKey("supportMsgTypeList")) {
            this.field_supportMsgTypeList = contentValues.getAsString("supportMsgTypeList");
            if (z17) {
                this.f238492h = true;
            }
        }
        if (contentValues.containsKey("productType")) {
            this.field_productType = contentValues.getAsInteger("productType").intValue();
            if (z17) {
                this.f238493i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
