package dm;

/* loaded from: classes11.dex */
public class wb extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final p75.d D;
    public static final java.lang.String[] E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f240901J;
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
    public static final int W;
    public static final l75.e0 X;
    public static final o75.e Y;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f240902w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f240903x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f240904y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f240905z;
    public java.lang.String field_digest;
    public java.lang.String field_digestType;
    public java.lang.String field_digestUser;
    public java.lang.String field_editingMsg;
    public int field_isHello;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_placedFlag;
    public int field_readStatus;
    public java.lang.String field_selfUserName;
    public java.lang.String field_sessionId;
    public int field_status;
    public java.lang.String field_talkerUserName;
    public int field_type;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240906d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240907e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240908f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240909g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240910h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240911i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240912m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240913n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240914o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240915p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240916q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240917r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240918s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240919t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240920u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240921v = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wConversation");
        f240902w = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240903x = new p75.d(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240904y = new p75.d("selfUserName", "string", tableName, "");
        f240905z = new p75.d("unReadCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        B = new p75.d("placedFlag", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d("type", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new p75.d("isHello", "int", tableName, "");
        E = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS W1wConversation_sessionId_index ON W1wConversation(sessionId)", "CREATE INDEX IF NOT EXISTS W1wConversation_talkerUserName_index ON W1wConversation(talkerUserName)", "CREATE INDEX IF NOT EXISTS W1wConversation_selfUserName_index ON W1wConversation(selfUserName)", "CREATE INDEX IF NOT EXISTS W1wConversation_username_status ON W1wConversation(status)", "CREATE INDEX IF NOT EXISTS W1wConversation_updateTime_index ON W1wConversation(updateTime)", "CREATE INDEX IF NOT EXISTS W1wConversation_type_index ON W1wConversation(type)", "CREATE INDEX IF NOT EXISTS W1wConversation_readStatus_index ON W1wConversation(readStatus)"};
        F = 607796817;
        G = -1911177617;
        H = 1228743778;
        I = 932971136;
        f240901J = -892481550;
        K = -295931082;
        L = -1331913276;
        M = -1309115473;
        N = -1309139170;
        P = 1996652390;
        Q = -1180128302;
        R = -262711991;
        S = -1731317047;
        T = 3575610;
        U = -500691672;
        V = 2060568008;
        W = 108705909;
        X = initAutoDBInfo(dm.wb.class);
        Y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talkerUserName";
        e0Var.f316955d.put("talkerUserName", "TEXT default '' ");
        e0Var.f316954c[2] = "selfUserName";
        e0Var.f316955d.put("selfUserName", "TEXT default '' ");
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
        e0Var.f316954c[15] = "isHello";
        e0Var.f316955d.put("isHello", "INTEGER default '0' ");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talkerUserName TEXT default '' ,  selfUserName TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  readStatus INTEGER,  isHello INTEGER default '0' ";
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
            if (F == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f240906d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_talkerUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_selfUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240901J == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_digestType = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_placedFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_readStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_isHello = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
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
        if (this.f240906d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talkerUserName == null) {
            this.field_talkerUserName = "";
        }
        if (this.f240907e) {
            contentValues.put("talkerUserName", this.field_talkerUserName);
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f240908f) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f240909g) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f240910h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f240911i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f240912m) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f240913n) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f240914o) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f240915p) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f240916q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f240917r) {
            contentValues.put("placedFlag", java.lang.Long.valueOf(this.field_placedFlag));
        }
        if (this.f240918s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f240919t) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f240920u) {
            contentValues.put("readStatus", java.lang.Integer.valueOf(this.field_readStatus));
        }
        if (this.f240921v) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseW1wConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wConversation ( ");
        l75.e0 e0Var = X;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : E) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wConversation", "createTableSql %s", str2);
            k0Var.A("W1wConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "W1wConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wConversation", "updateTableSql %s", str3);
            k0Var.A("W1wConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return X;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return Y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240902w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240902w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f240906d = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.field_talkerUserName = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f240907e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f240908f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f240909g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f240910h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240911i = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f240912m = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f240913n = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z17) {
                this.f240914o = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f240915p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f240916q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z17) {
                this.f240917r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f240918s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f240919t = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z17) {
                this.f240920u = true;
            }
        }
        if (contentValues.containsKey("isHello")) {
            this.field_isHello = contentValues.getAsInteger("isHello").intValue();
            if (z17) {
                this.f240921v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
