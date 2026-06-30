package dm;

/* loaded from: classes10.dex */
public class a4 extends l75.f0 {
    public static final l75.e0 A1;
    public static final p75.n0 B;
    public static final o75.e B1;
    public static final p75.d C;
    public static final p75.d D;
    public static final p75.d E;
    public static final p75.d F;
    public static final p75.d G;
    public static final p75.d H;
    public static final p75.d I;

    /* renamed from: J, reason: collision with root package name */
    public static final p75.d f235592J;
    public static final java.lang.String[] K;
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

    /* renamed from: l1, reason: collision with root package name */
    public static final int f235593l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f235594p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f235595p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f235596x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f235597x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f235598y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f235599y1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f235600z1;
    public int field_actionPermission;
    public java.lang.String field_content;
    public java.lang.String field_digest;
    public java.lang.String field_digestType;
    public java.lang.String field_digestUser;
    public java.lang.String field_editingMsg;
    public int field_followFlag;
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
    public boolean f235601d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235602e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235603f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235604g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235605h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235606i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235607m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235608n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235609o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235610p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235611q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235612r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f235613s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f235614t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235615u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235616v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235617w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f235618x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f235619y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f235620z = true;
    public boolean A = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderConversation");
        B = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new p75.d("unReadCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        E = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        F = new p75.d("placedFlag", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        G = new p75.d("type", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        H = new p75.d(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        I = new p75.d("senderUserName", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235592J = new p75.d("senderUserNameVersion", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        K = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderConversation_sessionId_index ON FinderConversation(sessionId)", "CREATE INDEX IF NOT EXISTS FinderConversation_talker_index ON FinderConversation(talker)", "CREATE INDEX IF NOT EXISTS FinderConversation_username_status ON FinderConversation(status)", "CREATE INDEX IF NOT EXISTS FinderConversation_updateTime_index ON FinderConversation(updateTime)", "CREATE INDEX IF NOT EXISTS FinderConversation_type_index ON FinderConversation(type)", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_index ON FinderConversation(scene)", "CREATE INDEX IF NOT EXISTS FinderConversation_readStatus_index ON FinderConversation(readStatus)", "CREATE INDEX IF NOT EXISTS FinderConversation_senderUserName_index ON FinderConversation(senderUserName)", "CREATE INDEX IF NOT EXISTS FinderConversation_senderUserNameVersion_index ON FinderConversation(senderUserNameVersion)"};
        L = 607796817;
        M = -881080743;
        N = 932971136;
        P = -892481550;
        Q = -295931082;
        R = -1331913276;
        S = -1309115473;
        T = -1309139170;
        U = 1996652390;
        V = 951530617;
        W = -1180128302;
        X = -262711991;
        Y = -1731317047;
        Z = 3575610;
        f235594p0 = 211768485;
        f235596x0 = 109254796;
        f235598y0 = -500691672;
        f235593l1 = 1667659339;
        f235595p1 = 1667748389;
        f235597x1 = -810638323;
        f235599y1 = -2027458883;
        f235600z1 = 108705909;
        A1 = initAutoDBInfo(dm.a4.class);
        B1 = new o75.e();
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
        e0Var.f316954c[20] = "followFlag";
        e0Var.f316955d.put("followFlag", "INTEGER");
        e0Var.f316954c[21] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  content TEXT,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  actionPermission INTEGER,  scene INTEGER,  readStatus INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  senderUserNameVersion INTEGER default '0' ,  followFlag INTEGER";
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
            if (L == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f235601d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_digestType = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_placedFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235594p0 == hashCode) {
                try {
                    this.field_actionPermission = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235596x0 == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235598y0 == hashCode) {
                try {
                    this.field_readStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235593l1 == hashCode) {
                try {
                    this.field_senderUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235595p1 == hashCode) {
                try {
                    this.field_senderRoleType = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235597x1 == hashCode) {
                try {
                    this.field_senderUserNameVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235599y1 == hashCode) {
                try {
                    this.field_followFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235600z1 == hashCode) {
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
        if (this.f235601d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f235602e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f235603f) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f235604g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f235605h) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f235606i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f235607m) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f235608n) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f235609o) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f235610p) {
            contentValues.put("content", this.field_content);
        }
        if (this.f235611q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f235612r) {
            contentValues.put("placedFlag", java.lang.Long.valueOf(this.field_placedFlag));
        }
        if (this.f235613s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f235614t) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f235615u) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.field_actionPermission));
        }
        if (this.f235616v) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f235617w) {
            contentValues.put("readStatus", java.lang.Integer.valueOf(this.field_readStatus));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f235618x) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f235619y) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f235620z) {
            contentValues.put("senderUserNameVersion", java.lang.Integer.valueOf(this.field_senderUserNameVersion));
        }
        if (this.A) {
            contentValues.put("followFlag", java.lang.Integer.valueOf(this.field_followFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderConversation ( ");
        l75.e0 e0Var = A1;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : K) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConversation", "createTableSql %s", str2);
            k0Var.A("FinderConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConversation", "updateTableSql %s", str3);
            k0Var.A("FinderConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return A1;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return B1;
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
                this.f235601d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f235602e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f235603f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f235604g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f235605h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f235606i = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f235607m = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z17) {
                this.f235608n = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f235609o = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f235610p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f235611q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z17) {
                this.f235612r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f235613s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235614t = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f235615u = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f235616v = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z17) {
                this.f235617w = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f235618x = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f235619y = true;
            }
        }
        if (contentValues.containsKey("senderUserNameVersion")) {
            this.field_senderUserNameVersion = contentValues.getAsInteger("senderUserNameVersion").intValue();
            if (z17) {
                this.f235620z = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.field_followFlag = contentValues.getAsInteger("followFlag").intValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
