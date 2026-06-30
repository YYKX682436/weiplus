package dm;

/* loaded from: classes9.dex */
public class c8 extends l75.f0 {
    public static final p75.d A1;
    public static final p75.d B1;
    public static final p75.d C1;
    public static final p75.d D1;
    public static final int E1;
    public static final int F1;
    public static final int G1;
    public static final int H1;
    public static final int I1;
    public static final int J1;
    public static final int K1;
    public static final int L1;
    public static final int M1;
    public static final int N1;
    public static final int O1;
    public static final int P1;
    public static final int Q1;
    public static final int R1;
    public static final int S1;
    public static final int T1;
    public static final int U1;
    public static final int V1;
    public static final int W1;
    public static final int X1;
    public static final int Y1;
    public static final int Z1;

    /* renamed from: a2, reason: collision with root package name */
    public static final int f236154a2;

    /* renamed from: b2, reason: collision with root package name */
    public static final int f236155b2;

    /* renamed from: c2, reason: collision with root package name */
    public static final int f236156c2;

    /* renamed from: d2, reason: collision with root package name */
    public static final l75.e0 f236157d2;

    /* renamed from: e2, reason: collision with root package name */
    public static final o75.e f236158e2;

    /* renamed from: l1, reason: collision with root package name */
    public static final p75.d f236159l1;

    /* renamed from: p1, reason: collision with root package name */
    public static final p75.d f236160p1;

    /* renamed from: x1, reason: collision with root package name */
    public static final p75.d f236161x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final p75.n0 f236162y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final p75.d f236163y1;

    /* renamed from: z1, reason: collision with root package name */
    public static final p75.d f236164z1;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f236165J;
    public int K;
    public int L;
    public int M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;
    public java.lang.String S;
    public byte[] T;
    public java.lang.String U;
    public java.lang.String V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    private long field_bizChatId;
    private java.lang.String field_bizChatUserId;
    private java.lang.String field_bizClientMsgId;
    private java.lang.String field_content;
    private long field_createTime;
    private int field_flag;
    private java.lang.String field_fromUsername;
    private java.lang.String field_historyId;
    private java.lang.String field_imgPath;
    private int field_isSend;
    private int field_isShowTimer;
    private byte[] field_lvbuffer;
    private long field_msgId;
    private long field_msgSeq;
    private long field_msgSvrId;
    private java.lang.String field_reserved;
    private r45.ad4 field_solitaireFoldInfo;
    private int field_status;
    private java.lang.String field_talker;
    private int field_talkerId;
    private java.lang.String field_toUsername;
    private java.lang.String field_transBrandWording;
    private java.lang.String field_transContent;
    private int field_type;

    /* renamed from: p0, reason: collision with root package name */
    public int f236176p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f236185x0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236166d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236167e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236168f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236169g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236170h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236171i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236172m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236173n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236174o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236175p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236177q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236178r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236179s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236180t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236181u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236182v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236183w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f236184x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236186y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f236187z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;

    static {
        p75.n0 n0Var = new p75.n0(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        f236162y0 = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236159l1 = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236160p1 = new p75.d("type", "int", tableName, "");
        f236161x1 = new p75.d("status", "int", tableName, "");
        f236163y1 = new p75.d("isSend", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236164z1 = new p75.d("createTime", "long", tableName, "");
        A1 = new p75.d("talker", "string", tableName, "");
        B1 = new p75.d("content", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C1 = new p75.d("reserved", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D1 = new p75.d("flag", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        E1 = 104191100;
        F1 = -1294411543;
        G1 = 3575610;
        H1 = -892481550;
        I1 = -1180128302;
        J1 = -735390658;
        K1 = 1369213417;
        L1 = -881080743;
        M1 = 951530617;
        N1 = 1916786312;
        O1 = -350385368;
        P1 = -486944182;
        Q1 = -610034348;
        R1 = 1437142193;
        S1 = 522984921;
        T1 = 1298065502;
        U1 = 193082758;
        V1 = -2109920975;
        W1 = -1065033442;
        X1 = 3145580;
        Y1 = 60550149;
        Z1 = 1604237984;
        f236154a2 = -285781903;
        f236155b2 = 1725503695;
        f236156c2 = 108705909;
        f236157d2 = initAutoDBInfo(dm.c8.class);
        f236158e2 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[24];
        java.lang.String[] strArr = new java.lang.String[25];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER");
        e0Var.f316954c[5] = "isShowTimer";
        e0Var.f316955d.put("isShowTimer", "INTEGER");
        e0Var.f316954c[6] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[7] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[8] = "content";
        e0Var.f316955d.put("content", "TEXT default '' ");
        e0Var.f316954c[9] = "imgPath";
        e0Var.f316955d.put("imgPath", "TEXT");
        e0Var.f316954c[10] = "reserved";
        e0Var.f316955d.put("reserved", "TEXT");
        e0Var.f316954c[11] = "lvbuffer";
        e0Var.f316955d.put("lvbuffer", "BLOB");
        e0Var.f316954c[12] = "talkerId";
        e0Var.f316955d.put("talkerId", "INTEGER");
        e0Var.f316954c[13] = "transContent";
        e0Var.f316955d.put("transContent", "TEXT default '' ");
        e0Var.f316954c[14] = "transBrandWording";
        e0Var.f316955d.put("transBrandWording", "TEXT default '' ");
        e0Var.f316954c[15] = "bizClientMsgId";
        e0Var.f316955d.put("bizClientMsgId", "TEXT default '' ");
        e0Var.f316954c[16] = "bizChatId";
        e0Var.f316955d.put("bizChatId", "LONG default '-1' ");
        e0Var.f316954c[17] = "bizChatUserId";
        e0Var.f316955d.put("bizChatUserId", "TEXT default '' ");
        e0Var.f316954c[18] = "msgSeq";
        e0Var.f316955d.put("msgSeq", "LONG");
        e0Var.f316954c[19] = "flag";
        e0Var.f316955d.put("flag", "INTEGER default '0' ");
        e0Var.f316954c[20] = "solitaireFoldInfo";
        e0Var.f316955d.put("solitaireFoldInfo", "BLOB");
        e0Var.f316954c[21] = "fromUsername";
        e0Var.f316955d.put("fromUsername", "TEXT");
        e0Var.f316954c[22] = "toUsername";
        e0Var.f316955d.put("toUsername", "TEXT");
        e0Var.f316954c[23] = "historyId";
        e0Var.f316955d.put("historyId", "TEXT");
        e0Var.f316954c[24] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  msgSvrId LONG,  type INTEGER,  status INTEGER,  isSend INTEGER,  isShowTimer INTEGER,  createTime LONG,  talker TEXT,  content TEXT default '' ,  imgPath TEXT,  reserved TEXT,  lvbuffer BLOB,  talkerId INTEGER,  transContent TEXT default '' ,  transBrandWording TEXT default '' ,  bizClientMsgId TEXT default '' ,  bizChatId LONG default '-1' ,  bizChatUserId TEXT default '' ,  msgSeq LONG,  flag INTEGER default '0' ,  solitaireFoldInfo BLOB,  fromUsername TEXT,  toUsername TEXT,  historyId TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public int A0() {
        return this.field_isSend;
    }

    public void C1(java.lang.String str) {
        this.field_transBrandWording = str;
        this.f236181u = true;
    }

    public byte[] D0() {
        return this.field_lvbuffer;
    }

    public void D1(java.lang.String str) {
        this.field_transContent = str;
        this.f236180t = true;
    }

    public long F0() {
        return this.field_msgSeq;
    }

    public java.lang.String G0() {
        return this.G;
    }

    public long I0() {
        return this.field_msgSvrId;
    }

    public java.lang.String J0() {
        return this.field_reserved;
    }

    public final r45.ad4 L0() {
        return this.field_solitaireFoldInfo;
    }

    public int P0() {
        return this.field_status;
    }

    public java.lang.String Q0() {
        return this.field_talker;
    }

    public int R0() {
        return this.field_talkerId;
    }

    public java.lang.String T0() {
        return this.field_toUsername;
    }

    public java.lang.String U0() {
        return this.field_transBrandWording;
    }

    public java.lang.String W0() {
        return this.field_transContent;
    }

    public void Y0(long j17) {
        this.field_bizChatId = j17;
        this.f236183w = true;
    }

    public void Z0(java.lang.String str) {
        this.field_bizChatUserId = str;
        this.f236184x = true;
    }

    public void a1(java.lang.String str) {
        this.field_bizClientMsgId = str;
        this.f236182v = true;
    }

    public void c1(int i17) {
        this.f236165J = i17;
        this.f236178r = true;
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.c8)) {
            return false;
        }
        dm.c8 c8Var = (dm.c8) f0Var;
        return n51.f.a(java.lang.Long.valueOf(this.field_msgId), java.lang.Long.valueOf(c8Var.field_msgId)) && n51.f.a(java.lang.Long.valueOf(this.field_msgSvrId), java.lang.Long.valueOf(c8Var.field_msgSvrId)) && n51.f.a(java.lang.Integer.valueOf(this.field_type), java.lang.Integer.valueOf(c8Var.field_type)) && n51.f.a(java.lang.Integer.valueOf(this.field_status), java.lang.Integer.valueOf(c8Var.field_status)) && n51.f.a(java.lang.Integer.valueOf(this.field_isSend), java.lang.Integer.valueOf(c8Var.field_isSend)) && n51.f.a(java.lang.Integer.valueOf(this.field_isShowTimer), java.lang.Integer.valueOf(c8Var.field_isShowTimer)) && n51.f.a(java.lang.Long.valueOf(this.field_createTime), java.lang.Long.valueOf(c8Var.field_createTime)) && n51.f.a(this.field_talker, c8Var.field_talker) && n51.f.a(this.field_content, c8Var.field_content) && n51.f.a(this.field_imgPath, c8Var.field_imgPath) && n51.f.a(this.field_reserved, c8Var.field_reserved) && n51.f.a(this.field_lvbuffer, c8Var.field_lvbuffer) && n51.f.a(java.lang.Integer.valueOf(this.field_talkerId), java.lang.Integer.valueOf(c8Var.field_talkerId)) && n51.f.a(this.field_transContent, c8Var.field_transContent) && n51.f.a(this.field_transBrandWording, c8Var.field_transBrandWording) && n51.f.a(this.field_bizClientMsgId, c8Var.field_bizClientMsgId) && n51.f.a(java.lang.Long.valueOf(this.field_bizChatId), java.lang.Long.valueOf(c8Var.field_bizChatId)) && n51.f.a(this.field_bizChatUserId, c8Var.field_bizChatUserId) && n51.f.a(java.lang.Long.valueOf(this.field_msgSeq), java.lang.Long.valueOf(c8Var.field_msgSeq)) && n51.f.a(java.lang.Integer.valueOf(this.field_flag), java.lang.Integer.valueOf(c8Var.field_flag)) && n51.f.a(this.field_solitaireFoldInfo, c8Var.field_solitaireFoldInfo) && n51.f.a(this.field_fromUsername, c8Var.field_fromUsername) && n51.f.a(this.field_toUsername, c8Var.field_toUsername) && n51.f.a(this.field_historyId, c8Var.field_historyId);
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
            if (E1 == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f236166d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F1 == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G1 == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H1 == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I1 == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (J1 == hashCode) {
                try {
                    this.field_isShowTimer = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K1 == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L1 == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M1 == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N1 == hashCode) {
                try {
                    this.field_imgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (O1 == hashCode) {
                try {
                    this.field_reserved = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P1 == hashCode) {
                try {
                    this.field_lvbuffer = cursor.getBlob(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q1 == hashCode) {
                try {
                    this.field_talkerId = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R1 == hashCode) {
                try {
                    this.field_transContent = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S1 == hashCode) {
                try {
                    this.field_transBrandWording = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T1 == hashCode) {
                try {
                    this.field_bizClientMsgId = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U1 == hashCode) {
                try {
                    this.field_bizChatId = cursor.getLong(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V1 == hashCode) {
                try {
                    this.field_bizChatUserId = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W1 == hashCode) {
                try {
                    this.field_msgSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X1 == hashCode) {
                try {
                    this.field_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y1 == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_solitaireFoldInfo = (r45.ad4) new r45.ad4().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z1 == hashCode) {
                try {
                    this.field_fromUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236154a2 == hashCode) {
                try {
                    this.field_toUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th28, "convertFrom %s", columnNames[i17]);
                    java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236155b2 == hashCode) {
                try {
                    this.field_historyId = cursor.getString(i17);
                } catch (java.lang.Throwable th29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th29, "convertFrom %s", columnNames[i17]);
                    java.lang.String str24 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236156c2 == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
        parseBuff();
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        try {
            if (this.f236178r) {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                e2Var.h();
                e2Var.m(this.E);
                e2Var.k(this.F);
                e2Var.m(this.G);
                e2Var.k(this.H);
                e2Var.k(this.I);
                e2Var.k(this.f236165J);
                e2Var.k(this.K);
                e2Var.k(this.L);
                e2Var.k(this.M);
                e2Var.m(this.N);
                e2Var.m(this.P);
                e2Var.m(this.Q);
                e2Var.k(this.R);
                e2Var.m(this.S);
                e2Var.j(this.T);
                e2Var.m(this.U);
                e2Var.m(this.V);
                e2Var.k(this.W);
                e2Var.k(this.X);
                e2Var.k(this.Y);
                e2Var.k(this.Z);
                e2Var.k(this.f236176p0);
                e2Var.m(this.f236185x0);
                this.field_lvbuffer = e2Var.a();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgInfo", "get value failed, %s", e17.getMessage());
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236166d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f236167e) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f236168f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f236169g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f236170h) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f236171i) {
            contentValues.put("isShowTimer", java.lang.Integer.valueOf(this.field_isShowTimer));
        }
        if (this.f236172m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f236173n) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f236174o) {
            contentValues.put("content", this.field_content);
        }
        if (this.f236175p) {
            contentValues.put("imgPath", this.field_imgPath);
        }
        if (this.f236177q) {
            contentValues.put("reserved", this.field_reserved);
        }
        if (this.f236178r) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f236179s) {
            contentValues.put("talkerId", java.lang.Integer.valueOf(this.field_talkerId));
        }
        if (this.field_transContent == null) {
            this.field_transContent = "";
        }
        if (this.f236180t) {
            contentValues.put("transContent", this.field_transContent);
        }
        if (this.field_transBrandWording == null) {
            this.field_transBrandWording = "";
        }
        if (this.f236181u) {
            contentValues.put("transBrandWording", this.field_transBrandWording);
        }
        if (this.field_bizClientMsgId == null) {
            this.field_bizClientMsgId = "";
        }
        if (this.f236182v) {
            contentValues.put("bizClientMsgId", this.field_bizClientMsgId);
        }
        if (this.f236183w) {
            contentValues.put("bizChatId", java.lang.Long.valueOf(this.field_bizChatId));
        }
        if (this.field_bizChatUserId == null) {
            this.field_bizChatUserId = "";
        }
        if (this.f236184x) {
            contentValues.put("bizChatUserId", this.field_bizChatUserId);
        }
        if (this.f236186y) {
            contentValues.put("msgSeq", java.lang.Long.valueOf(this.field_msgSeq));
        }
        if (this.f236187z) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.field_flag));
        }
        if (this.A) {
            r45.ad4 ad4Var = this.field_solitaireFoldInfo;
            if (ad4Var != null) {
                try {
                    contentValues.put("solitaireFoldInfo", ad4Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgInfo", e18.getMessage());
                }
            } else {
                contentValues.put("solitaireFoldInfo", (byte[]) null);
            }
        }
        if (this.B) {
            contentValues.put("fromUsername", this.field_fromUsername);
        }
        if (this.C) {
            contentValues.put("toUsername", this.field_toUsername);
        }
        if (this.D) {
            contentValues.put("historyId", this.field_historyId);
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    public void d1(java.lang.String str) {
        this.field_content = str;
        this.f236174o = true;
    }

    public void e1(long j17) {
        this.field_createTime = j17;
        this.f236172m = true;
    }

    public void f1(int i17) {
        this.field_flag = i17;
        this.f236187z = true;
    }

    public long getCreateTime() {
        return this.field_createTime;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236157d2;
    }

    public long getMsgId() {
        return this.field_msgId;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236158e2;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236162y0;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236162y0.f352676a;
    }

    public int getType() {
        return this.field_type;
    }

    public void h1(java.lang.String str) {
        this.field_historyId = str;
        this.D = true;
    }

    public void i1(java.lang.String str) {
        this.field_imgPath = str;
        this.f236175p = true;
    }

    public java.lang.String j() {
        return this.field_content;
    }

    public void j1(int i17) {
        this.field_isSend = i17;
        this.f236170h = true;
    }

    public void k1(byte[] bArr) {
        this.field_lvbuffer = bArr;
        this.f236178r = true;
    }

    public void l1(int i17) {
        this.F = i17;
        this.f236178r = true;
    }

    public void n1(long j17) {
        this.field_msgSeq = j17;
        this.f236186y = true;
    }

    public void o1(long j17) {
        this.field_msgSvrId = j17;
        this.f236167e = true;
    }

    public void p1(java.lang.String str) {
        this.field_reserved = str;
        this.f236177q = true;
    }

    public final void parseBuff() {
        try {
            byte[] bArr = this.field_lvbuffer;
            if (bArr != null && bArr.length != 0) {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                int i17 = e2Var.i(bArr);
                if (i17 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgInfo", "parse LVBuffer error:" + i17);
                    return;
                }
                if (!e2Var.c()) {
                    this.E = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.F = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.G = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.H = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.I = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.f236165J = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.K = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.L = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.M = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.N = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.P = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.Q = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.R = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.S = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.T = e2Var.d();
                }
                if (!e2Var.c()) {
                    this.U = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.V = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.W = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.X = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.Y = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.Z = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.f236176p0 = e2Var.e();
                }
                if (e2Var.c()) {
                    return;
                }
                this.f236185x0 = e2Var.g();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgInfo", "get value failed");
        }
    }

    public final void q1(r45.ad4 ad4Var) {
        this.field_solitaireFoldInfo = ad4Var;
        this.A = true;
    }

    public void r1(int i17) {
        this.field_status = i17;
        this.f236169g = true;
    }

    public void setMsgId(long j17) {
        this.field_msgId = j17;
        this.f236166d = true;
    }

    public void setType(int i17) {
        this.field_type = i17;
        this.f236168f = true;
    }

    public long t0() {
        return this.field_bizChatId;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgId", java.lang.Long.valueOf(this.field_msgId));
            n51.f.b(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.field_status));
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.field_isSend));
            n51.f.b(jSONObject, "isShowTimer", java.lang.Integer.valueOf(this.field_isShowTimer));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.field_createTime));
            n51.f.b(jSONObject, "talker", this.field_talker);
            n51.f.b(jSONObject, "content", this.field_content);
            n51.f.b(jSONObject, "imgPath", this.field_imgPath);
            n51.f.b(jSONObject, "reserved", this.field_reserved);
            n51.f.b(jSONObject, "lvbuffer", this.field_lvbuffer);
            n51.f.b(jSONObject, "talkerId", java.lang.Integer.valueOf(this.field_talkerId));
            n51.f.b(jSONObject, "transContent", this.field_transContent);
            n51.f.b(jSONObject, "transBrandWording", this.field_transBrandWording);
            n51.f.b(jSONObject, "bizClientMsgId", this.field_bizClientMsgId);
            n51.f.b(jSONObject, "bizChatId", java.lang.Long.valueOf(this.field_bizChatId));
            n51.f.b(jSONObject, "bizChatUserId", this.field_bizChatUserId);
            n51.f.b(jSONObject, "msgSeq", java.lang.Long.valueOf(this.field_msgSeq));
            n51.f.b(jSONObject, "flag", java.lang.Integer.valueOf(this.field_flag));
            n51.f.b(jSONObject, "solitaireFoldInfo", this.field_solitaireFoldInfo);
            n51.f.b(jSONObject, "fromUsername", this.field_fromUsername);
            n51.f.b(jSONObject, "toUsername", this.field_toUsername);
            n51.f.b(jSONObject, "historyId", this.field_historyId);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public java.lang.String u0() {
        return this.field_bizChatUserId;
    }

    public void u1(java.lang.String str) {
        this.field_talker = str;
        this.f236173n = true;
    }

    public java.lang.String v0() {
        return this.field_bizClientMsgId;
    }

    public int w0() {
        return this.field_flag;
    }

    public java.lang.String y0() {
        return this.field_fromUsername;
    }

    public java.lang.String z0() {
        return this.field_imgPath;
    }

    public void z1(int i17) {
        this.field_talkerId = i17;
        this.f236179s = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f236166d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f236167e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236168f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f236169g = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f236170h = true;
            }
        }
        if (contentValues.containsKey("isShowTimer")) {
            this.field_isShowTimer = contentValues.getAsInteger("isShowTimer").intValue();
            if (z17) {
                this.f236171i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f236172m = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236173n = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f236174o = true;
            }
        }
        if (contentValues.containsKey("imgPath")) {
            this.field_imgPath = contentValues.getAsString("imgPath");
            if (z17) {
                this.f236175p = true;
            }
        }
        if (contentValues.containsKey("reserved")) {
            this.field_reserved = contentValues.getAsString("reserved");
            if (z17) {
                this.f236177q = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z17) {
                this.f236178r = true;
            }
        }
        if (contentValues.containsKey("talkerId")) {
            this.field_talkerId = contentValues.getAsInteger("talkerId").intValue();
            if (z17) {
                this.f236179s = true;
            }
        }
        if (contentValues.containsKey("transContent")) {
            this.field_transContent = contentValues.getAsString("transContent");
            if (z17) {
                this.f236180t = true;
            }
        }
        if (contentValues.containsKey("transBrandWording")) {
            this.field_transBrandWording = contentValues.getAsString("transBrandWording");
            if (z17) {
                this.f236181u = true;
            }
        }
        if (contentValues.containsKey("bizClientMsgId")) {
            this.field_bizClientMsgId = contentValues.getAsString("bizClientMsgId");
            if (z17) {
                this.f236182v = true;
            }
        }
        if (contentValues.containsKey("bizChatId")) {
            this.field_bizChatId = contentValues.getAsLong("bizChatId").longValue();
            if (z17) {
                this.f236183w = true;
            }
        }
        if (contentValues.containsKey("bizChatUserId")) {
            this.field_bizChatUserId = contentValues.getAsString("bizChatUserId");
            if (z17) {
                this.f236184x = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.field_msgSeq = contentValues.getAsLong("msgSeq").longValue();
            if (z17) {
                this.f236186y = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f236187z = true;
            }
        }
        if (contentValues.containsKey("solitaireFoldInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("solitaireFoldInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_solitaireFoldInfo = (r45.ad4) new r45.ad4().parseFrom(asByteArray);
                    if (z17) {
                        this.A = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("fromUsername")) {
            this.field_fromUsername = contentValues.getAsString("fromUsername");
            if (z17) {
                this.B = true;
            }
        }
        if (contentValues.containsKey("toUsername")) {
            this.field_toUsername = contentValues.getAsString("toUsername");
            if (z17) {
                this.C = true;
            }
        }
        if (contentValues.containsKey("historyId")) {
            this.field_historyId = contentValues.getAsString("historyId");
            if (z17) {
                this.D = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
