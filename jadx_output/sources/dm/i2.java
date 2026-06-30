package dm;

/* loaded from: classes9.dex */
public class i2 extends l75.f0 {
    public static final int A1;
    public static final int B1;
    public static final int C1;
    public static final int D1;
    public static final int E1;
    public static final int F1;
    public static final int G1;
    public static final int H1;
    public static final int I1;
    public static final int J1;
    public static final p75.n0 K;
    public static final int K1;
    public static final p75.d L;
    public static final int L1;
    public static final p75.d M;
    public static final int M1;
    public static final p75.d N;
    public static final int N1;
    public static final int O1;
    public static final p75.d P;
    public static final int P1;
    public static final p75.d Q;
    public static final int Q1;
    public static final p75.d R;
    public static final int R1;
    public static final p75.d S;
    public static final int S1;
    public static final p75.d T;
    public static final int T1;
    public static final p75.d U;
    public static final int U1;
    public static final p75.d V;
    public static final int V1;
    public static final p75.d W;
    public static final int W1;
    public static final p75.d X;
    public static final int X1;
    public static final p75.d Y;
    public static final int Y1;
    public static final p75.d Z;
    public static final int Z1;

    /* renamed from: a2, reason: collision with root package name */
    public static final int f237521a2;

    /* renamed from: b2, reason: collision with root package name */
    public static final int f237522b2;

    /* renamed from: c2, reason: collision with root package name */
    public static final l75.e0 f237523c2;

    /* renamed from: d2, reason: collision with root package name */
    public static final o75.e f237524d2;

    /* renamed from: l1, reason: collision with root package name */
    public static final p75.d f237525l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final p75.d f237526p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final p75.d f237527p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final p75.d f237528x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f237529x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final p75.d f237530y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f237531y1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f237532z1;
    private int field_UnDeliverCount;
    private int field_UnReadInvite;
    private int field_atCount;
    private int field_attrflag;
    private int field_chatmode;
    private java.lang.String field_content;
    private long field_conversationTime;
    private java.lang.String field_customNotify;
    private java.lang.String field_digest;
    private java.lang.String field_digestUser;
    private java.lang.String field_editingMsg;
    private long field_editingQuoteMsgId;
    private long field_firstUnDeliverSeq;
    private long field_flag;
    private int field_hasSpecialFollow;
    private int field_hasTodo;
    private int field_hasTrunc;
    private int field_hbMarkRed;
    private int field_isSend;
    private long field_lastSeq;
    private int field_msgCount;
    private java.lang.String field_msgType;
    private java.lang.String field_parentRef;
    private int field_remitMarkRed;
    private int field_showTips;
    private long field_sightTime;
    private int field_status;
    private int field_unReadCount;
    private int field_unReadMuteCount;
    private java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237534d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237535e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237536f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237537g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237538h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237539i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237540m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237541n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237542o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237543p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237544q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237545r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237546s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237547t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237548u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237549v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237550w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237551x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f237552y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f237553z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f237533J = false;

    static {
        p75.n0 n0Var = new p75.n0("rconversation");
        K = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        L = new p75.d(dm.i4.COL_USERNAME, "string", tableName, "");
        M = new p75.d("unReadCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        N = new p75.d("status", "int", tableName, "");
        P = new p75.d("isSend", "int", tableName, "");
        Q = new p75.d("conversationTime", "long", tableName, "");
        R = new p75.d("content", "string", tableName, "");
        S = new p75.d("msgType", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        T = new p75.d("flag", "long", tableName, "");
        U = new p75.d("digest", "string", tableName, "");
        V = new p75.d("digestUser", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        W = new p75.d("parentRef", "string", tableName, "");
        X = new p75.d("attrflag", "int", tableName, "");
        Y = new p75.d("editingMsg", "string", tableName, "");
        Z = new p75.d("atCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237526p0 = new p75.d("unReadMuteCount", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237528x0 = new p75.d("UnReadInvite", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237530y0 = new p75.d("hasTodo", "int", tableName, "");
        f237525l1 = new p75.d("hbMarkRed", "int", tableName, "");
        f237527p1 = new p75.d("remitMarkRed", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237529x1 = -1309392370;
        f237531y1 = -265713450;
        f237532z1 = 932971136;
        A1 = 1438146811;
        B1 = -892481550;
        C1 = -1180128302;
        D1 = -114447888;
        E1 = 951530617;
        F1 = 1343750747;
        G1 = 240055834;
        H1 = -338830379;
        I1 = 3145580;
        J1 = -1331913276;
        K1 = -1309115473;
        L1 = 130632498;
        M1 = 2070314889;
        N1 = 554531037;
        O1 = -1731317047;
        P1 = -720175972;
        Q1 = 918391306;
        R1 = 537528167;
        S1 = -47078935;
        T1 = -1435150269;
        U1 = -807469096;
        V1 = 1971866435;
        W1 = -270989544;
        X1 = 696947200;
        Y1 = -1791064022;
        Z1 = -1510771841;
        f237521a2 = 170025296;
        f237522b2 = 108705909;
        f237523c2 = initAutoDBInfo(dm.i2.class);
        f237524d2 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[30];
        java.lang.String[] strArr = new java.lang.String[31];
        e0Var.f316954c = strArr;
        strArr[0] = "msgCount";
        e0Var.f316955d.put("msgCount", "INTEGER default '0' ");
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[2] = "unReadCount";
        e0Var.f316955d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f316954c[3] = "chatmode";
        e0Var.f316955d.put("chatmode", "INTEGER default '0' ");
        e0Var.f316954c[4] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[5] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER default '0' ");
        e0Var.f316954c[6] = "conversationTime";
        e0Var.f316955d.put("conversationTime", "LONG default '0' ");
        e0Var.f316954c[7] = "content";
        e0Var.f316955d.put("content", "TEXT default '' ");
        e0Var.f316954c[8] = "msgType";
        e0Var.f316955d.put("msgType", "TEXT default '' ");
        e0Var.f316954c[9] = "customNotify";
        e0Var.f316955d.put("customNotify", "TEXT default '' ");
        e0Var.f316954c[10] = "showTips";
        e0Var.f316955d.put("showTips", "INTEGER default '0' ");
        e0Var.f316954c[11] = "flag";
        e0Var.f316955d.put("flag", "LONG default '0' ");
        e0Var.f316954c[12] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[13] = "digestUser";
        e0Var.f316955d.put("digestUser", "TEXT default '' ");
        e0Var.f316954c[14] = "hasTrunc";
        e0Var.f316955d.put("hasTrunc", "INTEGER default '0' ");
        e0Var.f316954c[15] = "parentRef";
        e0Var.f316955d.put("parentRef", "TEXT");
        e0Var.f316954c[16] = "attrflag";
        e0Var.f316955d.put("attrflag", "INTEGER default '0' ");
        e0Var.f316954c[17] = "editingMsg";
        e0Var.f316955d.put("editingMsg", "TEXT default '' ");
        e0Var.f316954c[18] = "atCount";
        e0Var.f316955d.put("atCount", "INTEGER default '0' ");
        e0Var.f316954c[19] = "sightTime";
        e0Var.f316955d.put("sightTime", "LONG default '0' ");
        e0Var.f316954c[20] = "unReadMuteCount";
        e0Var.f316955d.put("unReadMuteCount", "INTEGER default '0' ");
        e0Var.f316954c[21] = "lastSeq";
        e0Var.f316955d.put("lastSeq", "LONG");
        e0Var.f316954c[22] = "UnDeliverCount";
        e0Var.f316955d.put("UnDeliverCount", "INTEGER");
        e0Var.f316954c[23] = "UnReadInvite";
        e0Var.f316955d.put("UnReadInvite", "INTEGER");
        e0Var.f316954c[24] = "firstUnDeliverSeq";
        e0Var.f316955d.put("firstUnDeliverSeq", "LONG");
        e0Var.f316954c[25] = "editingQuoteMsgId";
        e0Var.f316955d.put("editingQuoteMsgId", "LONG default '0' ");
        e0Var.f316954c[26] = "hasTodo";
        e0Var.f316955d.put("hasTodo", "INTEGER default '0' ");
        e0Var.f316954c[27] = "hbMarkRed";
        e0Var.f316955d.put("hbMarkRed", "INTEGER default '0' ");
        e0Var.f316954c[28] = "remitMarkRed";
        e0Var.f316955d.put("remitMarkRed", "INTEGER default '0' ");
        e0Var.f316954c[29] = "hasSpecialFollow";
        e0Var.f316955d.put("hasSpecialFollow", "INTEGER default '0' ");
        e0Var.f316954c[30] = "rowid";
        e0Var.f316956e = " msgCount INTEGER default '0' ,  username TEXT default ''  PRIMARY KEY ,  unReadCount INTEGER default '0' ,  chatmode INTEGER default '0' ,  status INTEGER default '0' ,  isSend INTEGER default '0' ,  conversationTime LONG default '0' ,  content TEXT default '' ,  msgType TEXT default '' ,  customNotify TEXT default '' ,  showTips INTEGER default '0' ,  flag LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  hasTrunc INTEGER default '0' ,  parentRef TEXT,  attrflag INTEGER default '0' ,  editingMsg TEXT default '' ,  atCount INTEGER default '0' ,  sightTime LONG default '0' ,  unReadMuteCount INTEGER default '0' ,  lastSeq LONG,  UnDeliverCount INTEGER,  UnReadInvite INTEGER,  firstUnDeliverSeq LONG,  editingQuoteMsgId LONG default '0' ,  hasTodo INTEGER default '0' ,  hbMarkRed INTEGER default '0' ,  remitMarkRed INTEGER default '0' ,  hasSpecialFollow INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public java.lang.String A0() {
        return this.field_editingMsg;
    }

    public void C1(int i17) {
        this.field_hasSpecialFollow = i17;
        this.f237533J = true;
    }

    public long D0() {
        return this.field_editingQuoteMsgId;
    }

    public void D1(int i17) {
        this.field_hasTodo = i17;
        this.G = true;
    }

    public long F0() {
        return this.field_firstUnDeliverSeq;
    }

    public long G0() {
        return this.field_flag;
    }

    public int I0() {
        return this.field_hasSpecialFollow;
    }

    public int J0() {
        return this.field_hasTodo;
    }

    public void K1(int i17) {
        this.field_hasTrunc = i17;
        this.f237548u = true;
    }

    public int L0() {
        return this.field_hasTrunc;
    }

    public void L1(int i17) {
        this.field_hbMarkRed = i17;
        this.H = true;
    }

    public void M1(int i17) {
        this.field_isSend = i17;
        this.f237539i = true;
    }

    public int P0() {
        return this.field_hbMarkRed;
    }

    public void P1(long j17) {
        this.field_lastSeq = j17;
        this.B = true;
    }

    public int Q0() {
        return this.field_isSend;
    }

    public long R0() {
        return this.field_lastSeq;
    }

    public void R1(int i17) {
        this.field_msgCount = i17;
        this.f237534d = true;
    }

    public void S1(java.lang.String str) {
        this.field_msgType = str;
        this.f237542o = true;
    }

    public int T0() {
        return this.field_msgCount;
    }

    public void T1(java.lang.String str) {
        this.field_parentRef = str;
        this.f237549v = true;
    }

    public java.lang.String U0() {
        return this.field_msgType;
    }

    public void U1(int i17) {
        this.field_remitMarkRed = i17;
        this.I = true;
    }

    public void V1(long j17) {
        this.field_sightTime = j17;
        this.f237553z = true;
    }

    public java.lang.String W0() {
        return this.field_parentRef;
    }

    public void W1(int i17) {
        this.field_status = i17;
        this.f237538h = true;
    }

    public void X1(int i17) {
        this.field_UnDeliverCount = i17;
        this.C = true;
    }

    public int Y0() {
        return this.field_remitMarkRed;
    }

    public void Y1(int i17) {
        this.field_unReadCount = i17;
        this.f237536f = true;
    }

    public int Z0() {
        return this.field_showTips;
    }

    public void Z1(int i17) {
        this.field_UnReadInvite = i17;
        this.D = true;
    }

    public int a1() {
        return this.field_status;
    }

    public void a2(int i17) {
        this.field_unReadMuteCount = i17;
        this.A = true;
    }

    public void b2(java.lang.String str) {
        this.field_username = str;
        this.f237535e = true;
    }

    public int c1() {
        return this.field_UnDeliverCount;
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
            if (f237529x1 == hashCode) {
                try {
                    this.field_msgCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237531y1 == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f237535e = true;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237532z1 == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A1 == hashCode) {
                try {
                    this.field_chatmode = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B1 == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C1 == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D1 == hashCode) {
                try {
                    this.field_conversationTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E1 == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F1 == hashCode) {
                try {
                    this.field_msgType = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G1 == hashCode) {
                try {
                    this.field_customNotify = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H1 == hashCode) {
                try {
                    this.field_showTips = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I1 == hashCode) {
                try {
                    this.field_flag = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (J1 == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K1 == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L1 == hashCode) {
                try {
                    this.field_hasTrunc = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M1 == hashCode) {
                try {
                    this.field_parentRef = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N1 == hashCode) {
                try {
                    this.field_attrflag = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (O1 == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P1 == hashCode) {
                try {
                    this.field_atCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q1 == hashCode) {
                try {
                    this.field_sightTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R1 == hashCode) {
                try {
                    this.field_unReadMuteCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S1 == hashCode) {
                try {
                    this.field_lastSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T1 == hashCode) {
                try {
                    this.field_UnDeliverCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th28, "convertFrom %s", columnNames[i17]);
                    java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U1 == hashCode) {
                try {
                    this.field_UnReadInvite = cursor.getInt(i17);
                } catch (java.lang.Throwable th29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th29, "convertFrom %s", columnNames[i17]);
                    java.lang.String str24 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V1 == hashCode) {
                try {
                    this.field_firstUnDeliverSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th30) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th30, "convertFrom %s", columnNames[i17]);
                    java.lang.String str25 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W1 == hashCode) {
                try {
                    this.field_editingQuoteMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th31) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th31, "convertFrom %s", columnNames[i17]);
                    java.lang.String str26 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X1 == hashCode) {
                try {
                    this.field_hasTodo = cursor.getInt(i17);
                } catch (java.lang.Throwable th32) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th32, "convertFrom %s", columnNames[i17]);
                    java.lang.String str27 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y1 == hashCode) {
                try {
                    this.field_hbMarkRed = cursor.getInt(i17);
                } catch (java.lang.Throwable th33) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th33, "convertFrom %s", columnNames[i17]);
                    java.lang.String str28 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z1 == hashCode) {
                try {
                    this.field_remitMarkRed = cursor.getInt(i17);
                } catch (java.lang.Throwable th34) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th34, "convertFrom %s", columnNames[i17]);
                    java.lang.String str29 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237521a2 == hashCode) {
                try {
                    this.field_hasSpecialFollow = cursor.getInt(i17);
                } catch (java.lang.Throwable th35) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th35, "convertFrom %s", columnNames[i17]);
                    java.lang.String str30 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237522b2 == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237534d) {
            contentValues.put("msgCount", java.lang.Integer.valueOf(this.field_msgCount));
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f237535e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f237536f) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f237537g) {
            contentValues.put("chatmode", java.lang.Integer.valueOf(this.field_chatmode));
        }
        if (this.f237538h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f237539i) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.f237540m) {
            contentValues.put("conversationTime", java.lang.Long.valueOf(this.field_conversationTime));
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f237541n) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_msgType == null) {
            this.field_msgType = "";
        }
        if (this.f237542o) {
            contentValues.put("msgType", this.field_msgType);
        }
        if (this.field_customNotify == null) {
            this.field_customNotify = "";
        }
        if (this.f237543p) {
            contentValues.put("customNotify", this.field_customNotify);
        }
        if (this.f237544q) {
            contentValues.put("showTips", java.lang.Integer.valueOf(this.field_showTips));
        }
        if (this.f237545r) {
            contentValues.put("flag", java.lang.Long.valueOf(this.field_flag));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f237546s) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f237547t) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.f237548u) {
            contentValues.put("hasTrunc", java.lang.Integer.valueOf(this.field_hasTrunc));
        }
        if (this.f237549v) {
            contentValues.put("parentRef", this.field_parentRef);
        }
        if (this.f237550w) {
            contentValues.put("attrflag", java.lang.Integer.valueOf(this.field_attrflag));
        }
        if (this.field_editingMsg == null) {
            this.field_editingMsg = "";
        }
        if (this.f237551x) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f237552y) {
            contentValues.put("atCount", java.lang.Integer.valueOf(this.field_atCount));
        }
        if (this.f237553z) {
            contentValues.put("sightTime", java.lang.Long.valueOf(this.field_sightTime));
        }
        if (this.A) {
            contentValues.put("unReadMuteCount", java.lang.Integer.valueOf(this.field_unReadMuteCount));
        }
        if (this.B) {
            contentValues.put("lastSeq", java.lang.Long.valueOf(this.field_lastSeq));
        }
        if (this.C) {
            contentValues.put("UnDeliverCount", java.lang.Integer.valueOf(this.field_UnDeliverCount));
        }
        if (this.D) {
            contentValues.put("UnReadInvite", java.lang.Integer.valueOf(this.field_UnReadInvite));
        }
        if (this.E) {
            contentValues.put("firstUnDeliverSeq", java.lang.Long.valueOf(this.field_firstUnDeliverSeq));
        }
        if (this.F) {
            contentValues.put("editingQuoteMsgId", java.lang.Long.valueOf(this.field_editingQuoteMsgId));
        }
        if (this.G) {
            contentValues.put("hasTodo", java.lang.Integer.valueOf(this.field_hasTodo));
        }
        if (this.H) {
            contentValues.put("hbMarkRed", java.lang.Integer.valueOf(this.field_hbMarkRed));
        }
        if (this.I) {
            contentValues.put("remitMarkRed", java.lang.Integer.valueOf(this.field_remitMarkRed));
        }
        if (this.f237533J) {
            contentValues.put("hasSpecialFollow", java.lang.Integer.valueOf(this.field_hasSpecialFollow));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    public int d1() {
        return this.field_unReadCount;
    }

    public int e1() {
        return this.field_UnReadInvite;
    }

    public int f1() {
        return this.field_unReadMuteCount;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237523c2;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237524d2;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return K;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return K.f352676a;
    }

    public java.lang.String h1() {
        return this.field_username;
    }

    public void i1(int i17) {
        this.field_atCount = i17;
        this.f237552y = true;
    }

    public java.lang.String j() {
        return this.field_content;
    }

    public void j1(int i17) {
        this.field_attrflag = i17;
        this.f237550w = true;
    }

    public void k1(int i17) {
        this.field_chatmode = i17;
        this.f237537g = true;
    }

    public void l1(java.lang.String str) {
        this.field_content = str;
        this.f237541n = true;
    }

    public void n1(long j17) {
        this.field_conversationTime = j17;
        this.f237540m = true;
    }

    public void o1(java.lang.String str) {
        this.field_digest = str;
        this.f237546s = true;
    }

    public void p1(java.lang.String str) {
        this.field_digestUser = str;
        this.f237547t = true;
    }

    public void q1(java.lang.String str) {
        this.field_editingMsg = str;
        this.f237551x = true;
    }

    public void r1(long j17) {
        this.field_editingQuoteMsgId = j17;
        this.F = true;
    }

    public int t0() {
        return this.field_atCount;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgCount", java.lang.Integer.valueOf(this.field_msgCount));
            n51.f.b(jSONObject, dm.i4.COL_USERNAME, this.field_username);
            n51.f.b(jSONObject, "unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
            n51.f.b(jSONObject, "chatmode", java.lang.Integer.valueOf(this.field_chatmode));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.field_status));
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.field_isSend));
            n51.f.b(jSONObject, "conversationTime", java.lang.Long.valueOf(this.field_conversationTime));
            n51.f.b(jSONObject, "content", this.field_content);
            n51.f.b(jSONObject, "msgType", this.field_msgType);
            n51.f.b(jSONObject, "customNotify", this.field_customNotify);
            n51.f.b(jSONObject, "showTips", java.lang.Integer.valueOf(this.field_showTips));
            n51.f.b(jSONObject, "flag", java.lang.Long.valueOf(this.field_flag));
            n51.f.b(jSONObject, "digest", this.field_digest);
            n51.f.b(jSONObject, "digestUser", this.field_digestUser);
            n51.f.b(jSONObject, "hasTrunc", java.lang.Integer.valueOf(this.field_hasTrunc));
            n51.f.b(jSONObject, "parentRef", this.field_parentRef);
            n51.f.b(jSONObject, "attrflag", java.lang.Integer.valueOf(this.field_attrflag));
            n51.f.b(jSONObject, "editingMsg", this.field_editingMsg);
            n51.f.b(jSONObject, "atCount", java.lang.Integer.valueOf(this.field_atCount));
            n51.f.b(jSONObject, "sightTime", java.lang.Long.valueOf(this.field_sightTime));
            n51.f.b(jSONObject, "unReadMuteCount", java.lang.Integer.valueOf(this.field_unReadMuteCount));
            n51.f.b(jSONObject, "lastSeq", java.lang.Long.valueOf(this.field_lastSeq));
            n51.f.b(jSONObject, "UnDeliverCount", java.lang.Integer.valueOf(this.field_UnDeliverCount));
            n51.f.b(jSONObject, "UnReadInvite", java.lang.Integer.valueOf(this.field_UnReadInvite));
            n51.f.b(jSONObject, "firstUnDeliverSeq", java.lang.Long.valueOf(this.field_firstUnDeliverSeq));
            n51.f.b(jSONObject, "editingQuoteMsgId", java.lang.Long.valueOf(this.field_editingQuoteMsgId));
            n51.f.b(jSONObject, "hasTodo", java.lang.Integer.valueOf(this.field_hasTodo));
            n51.f.b(jSONObject, "hbMarkRed", java.lang.Integer.valueOf(this.field_hbMarkRed));
            n51.f.b(jSONObject, "remitMarkRed", java.lang.Integer.valueOf(this.field_remitMarkRed));
            n51.f.b(jSONObject, "hasSpecialFollow", java.lang.Integer.valueOf(this.field_hasSpecialFollow));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public int u0() {
        return this.field_attrflag;
    }

    public void u1(long j17) {
        this.field_firstUnDeliverSeq = j17;
        this.E = true;
    }

    public int v0() {
        return this.field_chatmode;
    }

    public long w0() {
        return this.field_conversationTime;
    }

    public java.lang.String y0() {
        return this.field_digest;
    }

    public java.lang.String z0() {
        return this.field_digestUser;
    }

    public void z1(long j17) {
        this.field_flag = j17;
        this.f237545r = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgCount")) {
            this.field_msgCount = contentValues.getAsInteger("msgCount").intValue();
            if (z17) {
                this.f237534d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f237535e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f237536f = true;
            }
        }
        if (contentValues.containsKey("chatmode")) {
            this.field_chatmode = contentValues.getAsInteger("chatmode").intValue();
            if (z17) {
                this.f237537g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237538h = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f237539i = true;
            }
        }
        if (contentValues.containsKey("conversationTime")) {
            this.field_conversationTime = contentValues.getAsLong("conversationTime").longValue();
            if (z17) {
                this.f237540m = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f237541n = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsString("msgType");
            if (z17) {
                this.f237542o = true;
            }
        }
        if (contentValues.containsKey("customNotify")) {
            this.field_customNotify = contentValues.getAsString("customNotify");
            if (z17) {
                this.f237543p = true;
            }
        }
        if (contentValues.containsKey("showTips")) {
            this.field_showTips = contentValues.getAsInteger("showTips").intValue();
            if (z17) {
                this.f237544q = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f237545r = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f237546s = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f237547t = true;
            }
        }
        if (contentValues.containsKey("hasTrunc")) {
            this.field_hasTrunc = contentValues.getAsInteger("hasTrunc").intValue();
            if (z17) {
                this.f237548u = true;
            }
        }
        if (contentValues.containsKey("parentRef")) {
            this.field_parentRef = contentValues.getAsString("parentRef");
            if (z17) {
                this.f237549v = true;
            }
        }
        if (contentValues.containsKey("attrflag")) {
            this.field_attrflag = contentValues.getAsInteger("attrflag").intValue();
            if (z17) {
                this.f237550w = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f237551x = true;
            }
        }
        if (contentValues.containsKey("atCount")) {
            this.field_atCount = contentValues.getAsInteger("atCount").intValue();
            if (z17) {
                this.f237552y = true;
            }
        }
        if (contentValues.containsKey("sightTime")) {
            this.field_sightTime = contentValues.getAsLong("sightTime").longValue();
            if (z17) {
                this.f237553z = true;
            }
        }
        if (contentValues.containsKey("unReadMuteCount")) {
            this.field_unReadMuteCount = contentValues.getAsInteger("unReadMuteCount").intValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("lastSeq")) {
            this.field_lastSeq = contentValues.getAsLong("lastSeq").longValue();
            if (z17) {
                this.B = true;
            }
        }
        if (contentValues.containsKey("UnDeliverCount")) {
            this.field_UnDeliverCount = contentValues.getAsInteger("UnDeliverCount").intValue();
            if (z17) {
                this.C = true;
            }
        }
        if (contentValues.containsKey("UnReadInvite")) {
            this.field_UnReadInvite = contentValues.getAsInteger("UnReadInvite").intValue();
            if (z17) {
                this.D = true;
            }
        }
        if (contentValues.containsKey("firstUnDeliverSeq")) {
            this.field_firstUnDeliverSeq = contentValues.getAsLong("firstUnDeliverSeq").longValue();
            if (z17) {
                this.E = true;
            }
        }
        if (contentValues.containsKey("editingQuoteMsgId")) {
            this.field_editingQuoteMsgId = contentValues.getAsLong("editingQuoteMsgId").longValue();
            if (z17) {
                this.F = true;
            }
        }
        if (contentValues.containsKey("hasTodo")) {
            this.field_hasTodo = contentValues.getAsInteger("hasTodo").intValue();
            if (z17) {
                this.G = true;
            }
        }
        if (contentValues.containsKey("hbMarkRed")) {
            this.field_hbMarkRed = contentValues.getAsInteger("hbMarkRed").intValue();
            if (z17) {
                this.H = true;
            }
        }
        if (contentValues.containsKey("remitMarkRed")) {
            this.field_remitMarkRed = contentValues.getAsInteger("remitMarkRed").intValue();
            if (z17) {
                this.I = true;
            }
        }
        if (contentValues.containsKey("hasSpecialFollow")) {
            this.field_hasSpecialFollow = contentValues.getAsInteger("hasSpecialFollow").intValue();
            if (z17) {
                this.f237533J = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
