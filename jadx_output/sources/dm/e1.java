package dm;

/* loaded from: classes11.dex */
public class e1 extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final java.lang.String[] D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f236516J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final l75.e0 W;
    public static final o75.e X;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f236517w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f236518x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f236519y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f236520z;
    public java.lang.String field_digest;
    public java.lang.String field_digestType;
    public java.lang.String field_digestUser;
    public java.lang.String field_editingMsg;
    public int field_isGreetSession;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_placedFlag;
    public int field_readStatus;
    public java.lang.String field_selfBiz;
    public java.lang.String field_sessionId;
    public int field_status;
    public java.lang.String field_talker;
    public int field_type;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236521d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236522e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236523f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236524g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236525h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236526i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236527m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236528n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236529o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236530p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236531q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236532r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236533s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236534t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236535u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236536v = true;

    static {
        p75.n0 n0Var = new p75.n0("BizFansConversation");
        f236517w = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236518x = new p75.d(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236519y = new p75.d("selfBiz", "string", tableName, "");
        f236520z = new p75.d("unReadCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        B = new p75.d("placedFlag", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d("isGreetSession", "int", tableName, "");
        D = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BizFansConversation_sessionId_index ON BizFansConversation(sessionId)", "CREATE INDEX IF NOT EXISTS BizFansConversation_talker_index ON BizFansConversation(talker)", "CREATE INDEX IF NOT EXISTS BizFansConversation_selfBiz_index ON BizFansConversation(selfBiz)", "CREATE INDEX IF NOT EXISTS BizFansConversation_username_status ON BizFansConversation(status)", "CREATE INDEX IF NOT EXISTS BizFansConversation_updateTime_index ON BizFansConversation(updateTime)", "CREATE INDEX IF NOT EXISTS BizFansConversation_type_index ON BizFansConversation(type)", "CREATE INDEX IF NOT EXISTS BizFansConversation_readStatus_index ON BizFansConversation(readStatus)", "CREATE INDEX IF NOT EXISTS BizFansConversation_isGreetSession_index ON BizFansConversation(isGreetSession)"};
        E = 607796817;
        F = -881080743;
        G = 1978098215;
        H = 932971136;
        I = -892481550;
        f236516J = -295931082;
        K = -1331913276;
        L = -1309115473;
        M = -1309139170;
        N = 1996652390;
        P = -1180128302;
        Q = -262711991;
        R = -1731317047;
        S = 3575610;
        T = -500691672;
        U = 75166103;
        V = 108705909;
        W = initAutoDBInfo(dm.e1.class);
        X = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = "selfBiz";
        e0Var.f316955d.put("selfBiz", "TEXT default '' ");
        e0Var.f316954c[3] = "unReadCount";
        e0Var.f316955d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f316954c[4] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[6] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[7] = "digestUser";
        e0Var.f316955d.put("digestUser", "TEXT default '' ");
        e0Var.f316954c[8] = "digestType";
        e0Var.f316955d.put("digestType", "TEXT default '' ");
        e0Var.f316954c[9] = "lastMsgID";
        e0Var.f316955d.put("lastMsgID", "LONG");
        e0Var.f316954c[10] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER");
        e0Var.f316954c[11] = "placedFlag";
        e0Var.f316955d.put("placedFlag", "LONG default '0' ");
        e0Var.f316954c[12] = "editingMsg";
        e0Var.f316955d.put("editingMsg", "TEXT");
        e0Var.f316954c[13] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[14] = "readStatus";
        e0Var.f316955d.put("readStatus", "INTEGER");
        e0Var.f316954c[15] = "isGreetSession";
        e0Var.f316955d.put("isGreetSession", "INTEGER default '0' ");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfBiz TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  readStatus INTEGER,  isGreetSession INTEGER default '0' ";
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
            if (E == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f236521d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_selfBiz = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236516J == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_digestType = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_placedFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_readStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_isGreetSession = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
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
        if (this.f236521d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f236522e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_selfBiz == null) {
            this.field_selfBiz = "";
        }
        if (this.f236523f) {
            contentValues.put("selfBiz", this.field_selfBiz);
        }
        if (this.f236524g) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f236525h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f236526i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f236527m) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f236528n) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f236529o) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f236530p) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f236531q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f236532r) {
            contentValues.put("placedFlag", java.lang.Long.valueOf(this.field_placedFlag));
        }
        if (this.f236533s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f236534t) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f236535u) {
            contentValues.put("readStatus", java.lang.Integer.valueOf(this.field_readStatus));
        }
        if (this.f236536v) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizFansConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFansConversation ( ");
        l75.e0 e0Var = W;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansConversation", "createTableSql %s", str2);
            k0Var.A("BizFansConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizFansConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansConversation", "updateTableSql %s", str3);
            k0Var.A("BizFansConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return W;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return X;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236517w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236517w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f236521d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236522e = true;
            }
        }
        if (contentValues.containsKey("selfBiz")) {
            this.field_selfBiz = contentValues.getAsString("selfBiz");
            if (z17) {
                this.f236523f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f236524g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f236525h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f236526i = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f236527m = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f236528n = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z17) {
                this.f236529o = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f236530p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f236531q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z17) {
                this.f236532r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f236533s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236534t = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z17) {
                this.f236535u = true;
            }
        }
        if (contentValues.containsKey("isGreetSession")) {
            this.field_isGreetSession = contentValues.getAsInteger("isGreetSession").intValue();
            if (z17) {
                this.f236536v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
