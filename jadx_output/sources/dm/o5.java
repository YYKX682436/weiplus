package dm;

/* loaded from: classes8.dex */
public class o5 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f238936h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f238937i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238938m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238939n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238940o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238941p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238942q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f238943r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f238944s;
    public v53.c field_extInfo;
    public java.lang.String field_selfUserName;
    public java.lang.String field_sessionId;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238945d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238946e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238947f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238948g = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeSessionInfo");
        f238936h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238937i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_sessionId_index ON GameLifeSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_talker_index ON GameLifeSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_selfUsername_index ON GameLifeSessionInfo(selfUserName)"};
        f238938m = 607796817;
        f238939n = -881080743;
        f238940o = 1228743778;
        f238941p = -1306498449;
        f238942q = 108705909;
        f238943r = initAutoDBInfo(dm.o5.class);
        f238944s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = "selfUserName";
        e0Var.f316955d.put("selfUserName", "TEXT default '' ");
        e0Var.f316954c[3] = "extInfo";
        e0Var.f316955d.put("extInfo", "BLOB");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  extInfo BLOB";
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
            if (f238938m == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f238945d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238939n == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238940o == hashCode) {
                try {
                    this.field_selfUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238941p == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_extInfo = (v53.c) new v53.c().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238942q == hashCode) {
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
        if (this.f238945d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f238946e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f238947f) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f238948g) {
            v53.c cVar = this.field_extInfo;
            if (cVar != null) {
                try {
                    contentValues.put("extInfo", cVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", e17.getMessage());
                }
            } else {
                contentValues.put("extInfo", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeSessionInfo ( ");
        l75.e0 e0Var = f238943r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238937i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTableSql %s", str2);
            k0Var.A("GameLifeSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameLifeSessionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "updateTableSql %s", str3);
            k0Var.A("GameLifeSessionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238943r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238944s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238936h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238936h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f238945d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238946e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f238947f = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("extInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_extInfo = (v53.c) new v53.c().parseFrom(asByteArray);
                    if (z17) {
                        this.f238948g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
