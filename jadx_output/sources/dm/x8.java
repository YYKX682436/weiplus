package dm;

/* loaded from: classes7.dex */
public class x8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f241061m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f241062n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241063o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241064p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241065q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241066r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241067s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241068t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241069u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f241070v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f241071w;
    public java.lang.String field_appId;
    public int field_msgState;
    public int field_msgTypeFlag;
    public java.lang.String field_packageName;
    public int field_sceneFlag;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241072d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241073e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241074f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241075g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241076h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241077i = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenMsgListener");
        f241061m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241062n = new java.lang.String[0];
        f241063o = 93028124;
        f241064p = 908759025;
        f241065q = -892481550;
        f241066r = 1728931352;
        f241067s = -1519726489;
        f241068t = -1294486128;
        f241069u = 108705909;
        f241070v = initAutoDBInfo(dm.x8.class);
        f241071w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, "TEXT");
        e0Var.f316954c[2] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[3] = "sceneFlag";
        e0Var.f316955d.put("sceneFlag", "INTEGER default '0' ");
        e0Var.f316954c[4] = "msgTypeFlag";
        e0Var.f316955d.put("msgTypeFlag", "INTEGER default '0' ");
        e0Var.f316954c[5] = "msgState";
        e0Var.f316955d.put("msgState", "INTEGER default '0' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  packageName TEXT,  status INTEGER default '0' ,  sceneFlag INTEGER default '0' ,  msgTypeFlag INTEGER default '0' ,  msgState INTEGER default '0' ";
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
            if (f241063o == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f241072d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241064p == hashCode) {
                try {
                    this.field_packageName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241065q == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241066r == hashCode) {
                try {
                    this.field_sceneFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241067s == hashCode) {
                try {
                    this.field_msgTypeFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241068t == hashCode) {
                try {
                    this.field_msgState = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241069u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241072d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f241073e) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, this.field_packageName);
        }
        if (this.f241074f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f241075g) {
            contentValues.put("sceneFlag", java.lang.Integer.valueOf(this.field_sceneFlag));
        }
        if (this.f241076h) {
            contentValues.put("msgTypeFlag", java.lang.Integer.valueOf(this.field_msgTypeFlag));
        }
        if (this.f241077i) {
            contentValues.put("msgState", java.lang.Integer.valueOf(this.field_msgState));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenMsgListener", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenMsgListener ( ");
        l75.e0 e0Var = f241070v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241062n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "createTableSql %s", str2);
            k0Var.A("OpenMsgListener", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenMsgListener", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "updateTableSql %s", str3);
            k0Var.A("OpenMsgListener", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241070v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241071w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241061m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241061m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f241072d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME)) {
            this.field_packageName = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            if (z17) {
                this.f241073e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f241074f = true;
            }
        }
        if (contentValues.containsKey("sceneFlag")) {
            this.field_sceneFlag = contentValues.getAsInteger("sceneFlag").intValue();
            if (z17) {
                this.f241075g = true;
            }
        }
        if (contentValues.containsKey("msgTypeFlag")) {
            this.field_msgTypeFlag = contentValues.getAsInteger("msgTypeFlag").intValue();
            if (z17) {
                this.f241076h = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.field_msgState = contentValues.getAsInteger("msgState").intValue();
            if (z17) {
                this.f241077i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
