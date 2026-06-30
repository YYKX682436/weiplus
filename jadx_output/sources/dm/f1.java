package dm;

/* loaded from: classes8.dex */
public class f1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f236778m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f236779n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236780o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236781p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236782q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236783r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236784s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236785t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236786u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f236787v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f236788w;
    public int field_isGreetSession;
    public java.lang.String field_senderUserName;
    public java.lang.String field_sessionId;
    public java.lang.String field_talker;
    public int field_type;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236789d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236790e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236791f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236792g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236793h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236794i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizFansSessionInfo");
        f236778m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236779n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BizFansSessionInfo_sessionId_index ON BizFansSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_talker_index ON BizFansSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_type_index ON BizFansSessionInfo(type)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_senderUserName_index ON BizFansSessionInfo(senderUserName)"};
        f236780o = 607796817;
        f236781p = -881080743;
        f236782q = -295931082;
        f236783r = 3575610;
        f236784s = 1667659339;
        f236785t = 75166103;
        f236786u = 108705909;
        f236787v = initAutoDBInfo(dm.f1.class);
        f236788w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[3] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[4] = "senderUserName";
        e0Var.f316955d.put("senderUserName", "TEXT default '' ");
        e0Var.f316954c[5] = "isGreetSession";
        e0Var.f316955d.put("isGreetSession", "INTEGER default '0' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  type INTEGER,  senderUserName TEXT default '' ,  isGreetSession INTEGER default '0' ";
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
            if (f236780o == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f236789d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236781p == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236782q == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236783r == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236784s == hashCode) {
                try {
                    this.field_senderUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236785t == hashCode) {
                try {
                    this.field_isGreetSession = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236786u == hashCode) {
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
        if (this.f236789d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f236790e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f236791f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f236792g) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f236793h) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f236794i) {
            contentValues.put("isGreetSession", java.lang.Integer.valueOf(this.field_isGreetSession));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizFansSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFansSessionInfo ( ");
        l75.e0 e0Var = f236787v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236779n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "createTableSql %s", str2);
            k0Var.A("BizFansSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizFansSessionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "updateTableSql %s", str3);
            k0Var.A("BizFansSessionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236787v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236788w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236778m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236778m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f236789d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236790e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f236791f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236792g = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f236793h = true;
            }
        }
        if (contentValues.containsKey("isGreetSession")) {
            this.field_isGreetSession = contentValues.getAsInteger("isGreetSession").intValue();
            if (z17) {
                this.f236794i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
