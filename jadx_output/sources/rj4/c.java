package rj4;

/* loaded from: classes11.dex */
public class c extends l75.f0 {
    public static final p75.n0 B;
    public static final java.lang.String[] C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f396245J;
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
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final l75.e0 f396246p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f396247x0;
    public int field_actionPermission;
    public java.lang.String field_content;
    public java.lang.String field_digest;
    public java.lang.String field_digestType;
    public java.lang.String field_digestUser;
    public java.lang.String field_editingMsg;
    public int field_isRedDot;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_placedFlag;
    public int field_readStatus;
    public int field_scene;
    public int field_senderRoleType;
    public java.lang.String field_senderUserName;
    public int field_senderUserNameVersion;
    public java.lang.String field_sessionId;
    public int field_status;
    public java.lang.String field_talker;
    public int field_type;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396248d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396249e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396250f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396251g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396252h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396253i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396254m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396255n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396256o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396257p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396258q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396259r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f396260s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396261t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f396262u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f396263v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f396264w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f396265x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f396266y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f396267z = true;
    public boolean A = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusConversation");
        B = n0Var;
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
        C = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatus_sessionId_index ON TextStatusConversation(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_talker_index ON TextStatusConversation(talker)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_username_status ON TextStatusConversation(status)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_updateTime_index ON TextStatusConversation(updateTime)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_type_index ON TextStatusConversation(type)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_scene_index ON TextStatusConversation(scene)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_readStatus_index ON TextStatusConversation(readStatus)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_senderUserName_index ON TextStatusConversation(senderUserName)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_senderUserNameVersion_index ON TextStatusConversation(senderUserNameVersion)"};
        D = 607796817;
        E = -881080743;
        F = 932971136;
        G = -892481550;
        H = -295931082;
        I = -1331913276;
        f396245J = -1309115473;
        K = -1309139170;
        L = 1996652390;
        M = 951530617;
        N = -1180128302;
        P = -262711991;
        Q = -1731317047;
        R = 3575610;
        S = 211768485;
        T = 109254796;
        U = -500691672;
        V = 1667659339;
        W = 1667748389;
        X = -810638323;
        Y = -260886334;
        Z = 108705909;
        f396246p0 = initAutoDBInfo(rj4.c.class);
        f396247x0 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[21];
        java.lang.String[] strArr = new java.lang.String[22];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = "unReadCount";
        e0Var.f316955d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[4] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[5] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[6] = "digestUser";
        e0Var.f316955d.put("digestUser", "TEXT default '' ");
        e0Var.f316954c[7] = "digestType";
        e0Var.f316955d.put("digestType", "TEXT default '' ");
        e0Var.f316954c[8] = "lastMsgID";
        e0Var.f316955d.put("lastMsgID", "LONG");
        e0Var.f316954c[9] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[10] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER");
        e0Var.f316954c[11] = "placedFlag";
        e0Var.f316955d.put("placedFlag", "LONG default '0' ");
        e0Var.f316954c[12] = "editingMsg";
        e0Var.f316955d.put("editingMsg", "TEXT");
        e0Var.f316954c[13] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[14] = "actionPermission";
        e0Var.f316955d.put("actionPermission", "INTEGER");
        e0Var.f316954c[15] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[16] = "readStatus";
        e0Var.f316955d.put("readStatus", "INTEGER");
        e0Var.f316954c[17] = "senderUserName";
        e0Var.f316955d.put("senderUserName", "TEXT default '' ");
        e0Var.f316954c[18] = "senderRoleType";
        e0Var.f316955d.put("senderRoleType", "INTEGER default '0' ");
        e0Var.f316954c[19] = "senderUserNameVersion";
        e0Var.f316955d.put("senderUserNameVersion", "INTEGER default '0' ");
        e0Var.f316954c[20] = "isRedDot";
        e0Var.f316955d.put("isRedDot", "INTEGER default '0' ");
        e0Var.f316954c[21] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  content TEXT,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  actionPermission INTEGER,  scene INTEGER,  readStatus INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  senderUserNameVersion INTEGER default '0' ,  isRedDot INTEGER default '0' ";
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
            if (D == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f396248d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396245J == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_digestType = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_placedFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_actionPermission = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_readStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_senderUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_senderRoleType = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_senderUserNameVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_isRedDot = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
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
        if (this.f396248d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f396249e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f396250f) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f396251g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f396252h) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f396253i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f396254m) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f396255n) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f396256o) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f396257p) {
            contentValues.put("content", this.field_content);
        }
        if (this.f396258q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f396259r) {
            contentValues.put("placedFlag", java.lang.Long.valueOf(this.field_placedFlag));
        }
        if (this.f396260s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f396261t) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f396262u) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.field_actionPermission));
        }
        if (this.f396263v) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f396264w) {
            contentValues.put("readStatus", java.lang.Integer.valueOf(this.field_readStatus));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f396265x) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f396266y) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f396267z) {
            contentValues.put("senderUserNameVersion", java.lang.Integer.valueOf(this.field_senderUserNameVersion));
        }
        if (this.A) {
            contentValues.put("isRedDot", java.lang.Integer.valueOf(this.field_isRedDot));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusConversation ( ");
        l75.e0 e0Var = f396246p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : C) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusConversation", "createTableSql %s", str2);
            k0Var.A("TextStatusConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusConversation", "updateTableSql %s", str3);
            k0Var.A("TextStatusConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f396246p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f396247x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return B;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return B.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f396248d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f396249e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f396250f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f396251g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f396252h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f396253i = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f396254m = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z17) {
                this.f396255n = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f396256o = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f396257p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f396258q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z17) {
                this.f396259r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f396260s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f396261t = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f396262u = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f396263v = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z17) {
                this.f396264w = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f396265x = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f396266y = true;
            }
        }
        if (contentValues.containsKey("senderUserNameVersion")) {
            this.field_senderUserNameVersion = contentValues.getAsInteger("senderUserNameVersion").intValue();
            if (z17) {
                this.f396267z = true;
            }
        }
        if (contentValues.containsKey("isRedDot")) {
            this.field_isRedDot = contentValues.getAsInteger("isRedDot").intValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
