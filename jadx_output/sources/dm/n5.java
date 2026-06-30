package dm;

/* loaded from: classes8.dex */
public class n5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f238679q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238680r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238681s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238682t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238683u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238684v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238685w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238686x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238687y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238688z;
    public java.lang.String field_digest;
    public long field_digestFlag;
    public java.lang.String field_digestPrefix;
    public java.lang.String field_editingMsg;
    public long field_lastMsgID;
    public java.lang.String field_selfUserName;
    public java.lang.String field_sessionId;
    public java.lang.String field_talker;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238689d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238690e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238691f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238692g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238693h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238694i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238695m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238696n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238697o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238698p = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeConversation");
        f238679q = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238680r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLifeConversation_sessionId_index ON GameLifeConversation(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_talker_index ON GameLifeConversation(talker)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_selfUserName_index ON GameLifeConversation(selfUserName)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_updateTime_index ON GameLifeConversation(updateTime)"};
        f238681s = 607796817;
        f238682t = -881080743;
        f238683u = 1228743778;
        f238684v = 932971136;
        f238685w = -295931082;
        f238686x = -1331913276;
        f238687y = 1996652390;
        f238688z = -1309569200;
        A = 221370742;
        B = -1731317047;
        C = 108705909;
        D = initAutoDBInfo(dm.n5.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = "selfUserName";
        e0Var.f316955d.put("selfUserName", "TEXT default '' ");
        e0Var.f316954c[3] = "unReadCount";
        e0Var.f316955d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f316954c[4] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[5] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[6] = "lastMsgID";
        e0Var.f316955d.put("lastMsgID", "LONG");
        e0Var.f316954c[7] = "digestFlag";
        e0Var.f316955d.put("digestFlag", "LONG default '0' ");
        e0Var.f316954c[8] = "digestPrefix";
        e0Var.f316955d.put("digestPrefix", "TEXT default '' ");
        e0Var.f316954c[9] = "editingMsg";
        e0Var.f316955d.put("editingMsg", "TEXT default '' ");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  unReadCount INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  lastMsgID LONG,  digestFlag LONG default '0' ,  digestPrefix TEXT default '' ,  editingMsg TEXT default '' ";
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
            if (f238681s == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f238689d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238682t == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238683u == hashCode) {
                try {
                    this.field_selfUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238684v == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238685w == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238686x == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238687y == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238688z == hashCode) {
                try {
                    this.field_digestFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_digestPrefix = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
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
        if (this.f238689d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f238690e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f238691f) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f238692g) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f238693h) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f238694i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.f238695m) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f238696n) {
            contentValues.put("digestFlag", java.lang.Long.valueOf(this.field_digestFlag));
        }
        if (this.field_digestPrefix == null) {
            this.field_digestPrefix = "";
        }
        if (this.f238697o) {
            contentValues.put("digestPrefix", this.field_digestPrefix);
        }
        if (this.field_editingMsg == null) {
            this.field_editingMsg = "";
        }
        if (this.f238698p) {
            contentValues.put("editingMsg", this.field_editingMsg);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeConversation ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238680r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "createTableSql %s", str2);
            k0Var.A("GameLifeConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameLifeConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "updateTableSql %s", str3);
            k0Var.A("GameLifeConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238679q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238679q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f238689d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238690e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f238691f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f238692g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238693h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f238694i = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f238695m = true;
            }
        }
        if (contentValues.containsKey("digestFlag")) {
            this.field_digestFlag = contentValues.getAsLong("digestFlag").longValue();
            if (z17) {
                this.f238696n = true;
            }
        }
        if (contentValues.containsKey("digestPrefix")) {
            this.field_digestPrefix = contentValues.getAsString("digestPrefix");
            if (z17) {
                this.f238697o = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f238698p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
