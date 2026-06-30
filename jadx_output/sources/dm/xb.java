package dm;

/* loaded from: classes8.dex */
public class xb extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f241100n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f241101o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241102p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241103q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241104r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241105s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241106t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241107u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f241108v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f241109w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f241110x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f241111y;
    public boolean field_canRecvMsg;
    public int field_isHello;
    public java.lang.String field_selfUserName;
    public java.lang.String field_sessionId;
    public int field_status;
    public java.lang.String field_talkerUserName;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241112d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241113e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241114f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241115g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241116h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241117i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241118m = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wSessionInfo");
        f241100n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241101o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS W1wSessionInfo_sessionId_index ON W1wSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_talkerUserName_index ON W1wSessionInfo(talkerUserName)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_status_index ON W1wSessionInfo(status)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_selfUserName_index ON W1wSessionInfo(selfUserName)"};
        f241102p = 607796817;
        f241103q = -1911177617;
        f241104r = -295931082;
        f241105s = -892481550;
        f241106t = 1228743778;
        f241107u = -321359413;
        f241108v = 2060568008;
        f241109w = 108705909;
        f241110x = initAutoDBInfo(dm.xb.class);
        f241111y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talkerUserName";
        e0Var.f316955d.put("talkerUserName", "TEXT default '' ");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "selfUserName";
        e0Var.f316955d.put("selfUserName", "TEXT default '' ");
        e0Var.f316954c[5] = "canRecvMsg";
        e0Var.f316955d.put("canRecvMsg", "INTEGER default 'true' ");
        e0Var.f316954c[6] = "isHello";
        e0Var.f316955d.put("isHello", "INTEGER default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talkerUserName TEXT default '' ,  updateTime LONG default '0' ,  status INTEGER,  selfUserName TEXT default '' ,  canRecvMsg INTEGER default 'true' ,  isHello INTEGER default '0' ";
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
            if (f241102p == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f241112d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241103q == hashCode) {
                try {
                    this.field_talkerUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241104r == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241105s == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241106t == hashCode) {
                try {
                    this.field_selfUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241107u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canRecvMsg = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241108v == hashCode) {
                try {
                    this.field_isHello = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241109w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f241112d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talkerUserName == null) {
            this.field_talkerUserName = "";
        }
        if (this.f241113e) {
            contentValues.put("talkerUserName", this.field_talkerUserName);
        }
        if (this.f241114f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f241115g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f241116h) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f241117i) {
            if (this.field_canRecvMsg) {
                contentValues.put("canRecvMsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("canRecvMsg", (java.lang.Integer) 0);
            }
        }
        if (this.f241118m) {
            contentValues.put("isHello", java.lang.Integer.valueOf(this.field_isHello));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseW1wSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wSessionInfo ( ");
        l75.e0 e0Var = f241110x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241101o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "createTableSql %s", str2);
            k0Var.A("W1wSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "W1wSessionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "updateTableSql %s", str3);
            k0Var.A("W1wSessionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241110x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241111y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241100n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241100n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f241112d = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.field_talkerUserName = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f241113e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f241114f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f241115g = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f241116h = true;
            }
        }
        if (contentValues.containsKey("canRecvMsg")) {
            this.field_canRecvMsg = contentValues.getAsInteger("canRecvMsg").intValue() != 0;
            if (z17) {
                this.f241117i = true;
            }
        }
        if (contentValues.containsKey("isHello")) {
            this.field_isHello = contentValues.getAsInteger("isHello").intValue();
            if (z17) {
                this.f241118m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
