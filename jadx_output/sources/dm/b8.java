package dm;

/* loaded from: classes7.dex */
public class b8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f235880n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f235881o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235882p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235883q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235884r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235885s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235886t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235887u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235888v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235889w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f235890x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f235891y;
    public java.lang.String field_appId;
    public java.lang.String field_bluetoothDeviceId;
    public java.lang.String field_entryPackage;
    public boolean field_isBlocked;
    public long field_updateTime;
    public int field_versionType;
    public java.lang.String field_wechatToken;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235892d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235893e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235894f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235895g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235896h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235897i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235898m = true;

    static {
        p75.n0 n0Var = new p75.n0("MonitoredBluetoothDeviceInfoV2");
        f235880n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235881o = new java.lang.String[0];
        f235882p = 93028124;
        f235883q = 1676903135;
        f235884r = -147044749;
        f235885s = 689108018;
        f235886t = 128434036;
        f235887u = -295931082;
        f235888v = -601216670;
        f235889w = 108705909;
        f235890x = initAutoDBInfo(dm.b8.class);
        f235891y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "bluetoothDeviceId";
        e0Var.f316955d.put("bluetoothDeviceId", "TEXT");
        e0Var.f316954c[2] = "wechatToken";
        e0Var.f316955d.put("wechatToken", "TEXT");
        e0Var.f316954c[3] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[4] = "entryPackage";
        e0Var.f316955d.put("entryPackage", "TEXT");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = "isBlocked";
        e0Var.f316955d.put("isBlocked", "INTEGER default 'false' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " appId TEXT,  bluetoothDeviceId TEXT,  wechatToken TEXT,  versionType INTEGER,  entryPackage TEXT,  updateTime LONG,  isBlocked INTEGER default 'false' ";
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
            if (f235882p == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235883q == hashCode) {
                try {
                    this.field_bluetoothDeviceId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235884r == hashCode) {
                try {
                    this.field_wechatToken = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235885s == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235886t == hashCode) {
                try {
                    this.field_entryPackage = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235887u == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235888v == hashCode) {
                try {
                    this.field_isBlocked = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235889w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235892d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f235893e) {
            contentValues.put("bluetoothDeviceId", this.field_bluetoothDeviceId);
        }
        if (this.f235894f) {
            contentValues.put("wechatToken", this.field_wechatToken);
        }
        if (this.f235895g) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f235896h) {
            contentValues.put("entryPackage", this.field_entryPackage);
        }
        if (this.f235897i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f235898m) {
            if (this.field_isBlocked) {
                contentValues.put("isBlocked", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBlocked", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MonitoredBluetoothDeviceInfoV2 ( ");
        l75.e0 e0Var = f235890x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235881o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTableSql %s", str2);
            k0Var.A("MonitoredBluetoothDeviceInfoV2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MonitoredBluetoothDeviceInfoV2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "updateTableSql %s", str3);
            k0Var.A("MonitoredBluetoothDeviceInfoV2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235890x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235891y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235880n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235880n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f235892d = true;
            }
        }
        if (contentValues.containsKey("bluetoothDeviceId")) {
            this.field_bluetoothDeviceId = contentValues.getAsString("bluetoothDeviceId");
            if (z17) {
                this.f235893e = true;
            }
        }
        if (contentValues.containsKey("wechatToken")) {
            this.field_wechatToken = contentValues.getAsString("wechatToken");
            if (z17) {
                this.f235894f = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f235895g = true;
            }
        }
        if (contentValues.containsKey("entryPackage")) {
            this.field_entryPackage = contentValues.getAsString("entryPackage");
            if (z17) {
                this.f235896h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f235897i = true;
            }
        }
        if (contentValues.containsKey("isBlocked")) {
            this.field_isBlocked = contentValues.getAsInteger("isBlocked").intValue() != 0;
            if (z17) {
                this.f235898m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
