package dm;

/* loaded from: classes14.dex */
public class sb extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final p75.d D;
    public static final p75.d E;
    public static final java.lang.String[] F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f239927J;
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
    public static final l75.e0 f239928p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f239929x0;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f239930y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f239931z;
    private int field_abort_backend_informed;
    private long field_aliveTimestamp;
    private long field_bubbleMsgTimestamp;
    private long field_connectedTimestamp;
    private long field_id;
    private java.lang.String field_identity;
    private long field_inviteTimestamp;
    private long field_inviteid;
    private int field_mainRecord;
    private int field_msgType;
    private long field_msgid;
    private int field_outCall;
    private long field_recallTipsTimestamp;
    private int field_room_state;
    private int field_room_type;
    private long field_roomid;
    private long field_roomkey;
    private java.lang.String field_talkerName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239932d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239933e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239934f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239935g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239936h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239937i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239938m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239939n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239940o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239941p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239942q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239943r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239944s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239945t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239946u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239947v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239948w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239949x = false;

    static {
        p75.n0 n0Var = new p75.n0("BubbleInfo");
        f239930y = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239931z = new p75.d("roomid", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("inviteid", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        B = new p75.d("msgid", "long", tableName, "");
        C = new p75.d("room_state", "int", tableName, "");
        D = new p75.d("abort_backend_informed", "int", tableName, "");
        E = new p75.d("inviteTimestamp", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        F = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS roomid ON BubbleInfo(roomid)", "CREATE INDEX IF NOT EXISTS inviteid ON BubbleInfo(inviteid)", "CREATE INDEX IF NOT EXISTS msgIdIdx ON BubbleInfo(msgid)"};
        G = 3355;
        H = -925318346;
        I = 1379904420;
        f239927J = 631414244;
        K = -1067378658;
        L = 53929135;
        M = -2127306620;
        N = -135761730;
        P = 104192092;
        Q = 1269913645;
        R = -1056625598;
        S = 1407382541;
        T = 39301133;
        U = -970469075;
        V = 939923777;
        W = 1343750747;
        X = 422014826;
        Y = -649312567;
        Z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_ID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "roomid";
        ((java.util.HashMap) e0Var.f316955d).put("roomid", "LONG default '0' ");
        e0Var.f316954c[2] = "roomkey";
        ((java.util.HashMap) e0Var.f316955d).put("roomkey", "LONG default '0' ");
        e0Var.f316954c[3] = "inviteid";
        ((java.util.HashMap) e0Var.f316955d).put("inviteid", "LONG default '0' ");
        e0Var.f316954c[4] = "room_type";
        ((java.util.HashMap) e0Var.f316955d).put("room_type", "INTEGER default '0' ");
        e0Var.f316954c[5] = "out_call";
        ((java.util.HashMap) e0Var.f316955d).put("out_call", "INTEGER default 'false' ");
        e0Var.f316954c[6] = "talkerName";
        ((java.util.HashMap) e0Var.f316955d).put("talkerName", "TEXT default '' ");
        e0Var.f316954c[7] = "identity";
        ((java.util.HashMap) e0Var.f316955d).put("identity", "TEXT default '' ");
        e0Var.f316954c[8] = "msgid";
        ((java.util.HashMap) e0Var.f316955d).put("msgid", "LONG default '0' ");
        e0Var.f316954c[9] = "room_state";
        ((java.util.HashMap) e0Var.f316955d).put("room_state", "INTEGER default '0' ");
        e0Var.f316954c[10] = "abort_backend_informed";
        ((java.util.HashMap) e0Var.f316955d).put("abort_backend_informed", "INTEGER default '0' ");
        e0Var.f316954c[11] = "inviteTimestamp";
        ((java.util.HashMap) e0Var.f316955d).put("inviteTimestamp", "LONG default '0' ");
        e0Var.f316954c[12] = "connectedTimestamp";
        ((java.util.HashMap) e0Var.f316955d).put("connectedTimestamp", "LONG default '0' ");
        e0Var.f316954c[13] = "recallTipsTimestamp";
        ((java.util.HashMap) e0Var.f316955d).put("recallTipsTimestamp", "LONG default '0' ");
        e0Var.f316954c[14] = "bubbleMsgTimestamp";
        ((java.util.HashMap) e0Var.f316955d).put("bubbleMsgTimestamp", "LONG default '0' ");
        e0Var.f316954c[15] = "msgType";
        ((java.util.HashMap) e0Var.f316955d).put("msgType", "INTEGER default '0' ");
        e0Var.f316954c[16] = "mainRecord";
        ((java.util.HashMap) e0Var.f316955d).put("mainRecord", "INTEGER default '0' ");
        e0Var.f316954c[17] = "aliveTimestamp";
        ((java.util.HashMap) e0Var.f316955d).put("aliveTimestamp", "LONG default '0' ");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " id LONG PRIMARY KEY ,  roomid LONG default '0' ,  roomkey LONG default '0' ,  inviteid LONG default '0' ,  room_type INTEGER default '0' ,  out_call INTEGER default 'false' ,  talkerName TEXT default '' ,  identity TEXT default '' ,  msgid LONG default '0' ,  room_state INTEGER default '0' ,  abort_backend_informed INTEGER default '0' ,  inviteTimestamp LONG default '0' ,  connectedTimestamp LONG default '0' ,  recallTipsTimestamp LONG default '0' ,  bubbleMsgTimestamp LONG default '0' ,  msgType INTEGER default '0' ,  mainRecord INTEGER default '0' ,  aliveTimestamp LONG default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239928p0 = e0Var;
        f239929x0 = new o75.e();
    }

    public static final p75.l0 U0(long j17) {
        p75.i0 i17 = f239930y.i();
        i17.f352657d = A.i(java.lang.Long.valueOf(j17));
        i17.f352656c = "MicroMsg.SDK.BaseVoIPBubbleInfo";
        return i17.a();
    }

    public static final p75.l0 W0(long j17) {
        p75.i0 i17 = f239930y.i();
        i17.f352657d = f239931z.i(java.lang.Long.valueOf(j17));
        i17.f352656c = "MicroMsg.SDK.BaseVoIPBubbleInfo";
        return i17.a();
    }

    public long A0() {
        return this.field_inviteid;
    }

    public int D0() {
        return this.field_mainRecord;
    }

    public int F0() {
        return this.field_msgType;
    }

    public long G0() {
        return this.field_msgid;
    }

    public int I0() {
        return this.field_outCall;
    }

    public long J0() {
        return this.field_recallTipsTimestamp;
    }

    public int L0() {
        return this.field_room_state;
    }

    public int P0() {
        return this.field_room_type;
    }

    public long Q0() {
        return this.field_roomid;
    }

    public long R0() {
        return this.field_roomkey;
    }

    public java.lang.String T0() {
        return this.field_talkerName;
    }

    public void Y0(int i17) {
        this.field_abort_backend_informed = i17;
        this.f239942q = true;
    }

    public void Z0(long j17) {
        this.field_aliveTimestamp = j17;
        this.f239949x = true;
    }

    public void a1(long j17) {
        this.field_bubbleMsgTimestamp = j17;
        this.f239946u = true;
    }

    public void c1(long j17) {
        this.field_connectedTimestamp = j17;
        this.f239944s = true;
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
            if (G == hashCode) {
                try {
                    this.field_id = cursor.getLong(i17);
                    this.f239932d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_roomid = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_roomkey = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239927J == hashCode) {
                try {
                    this.field_inviteid = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_room_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_outCall = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_talkerName = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_identity = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_msgid = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_room_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_abort_backend_informed = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_inviteTimestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_connectedTimestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_recallTipsTimestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_bubbleMsgTimestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_msgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_mainRecord = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_aliveTimestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239932d) {
            contentValues.put(dm.i4.COL_ID, java.lang.Long.valueOf(this.field_id));
        }
        if (this.f239933e) {
            contentValues.put("roomid", java.lang.Long.valueOf(this.field_roomid));
        }
        if (this.f239934f) {
            contentValues.put("roomkey", java.lang.Long.valueOf(this.field_roomkey));
        }
        if (this.f239935g) {
            contentValues.put("inviteid", java.lang.Long.valueOf(this.field_inviteid));
        }
        if (this.f239936h) {
            contentValues.put("room_type", java.lang.Integer.valueOf(this.field_room_type));
        }
        if (this.f239937i) {
            contentValues.put("out_call", java.lang.Integer.valueOf(this.field_outCall));
        }
        if (this.field_talkerName == null) {
            this.field_talkerName = "";
        }
        if (this.f239938m) {
            contentValues.put("talkerName", this.field_talkerName);
        }
        if (this.field_identity == null) {
            this.field_identity = "";
        }
        if (this.f239939n) {
            contentValues.put("identity", this.field_identity);
        }
        if (this.f239940o) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.field_msgid));
        }
        if (this.f239941p) {
            contentValues.put("room_state", java.lang.Integer.valueOf(this.field_room_state));
        }
        if (this.f239942q) {
            contentValues.put("abort_backend_informed", java.lang.Integer.valueOf(this.field_abort_backend_informed));
        }
        if (this.f239943r) {
            contentValues.put("inviteTimestamp", java.lang.Long.valueOf(this.field_inviteTimestamp));
        }
        if (this.f239944s) {
            contentValues.put("connectedTimestamp", java.lang.Long.valueOf(this.field_connectedTimestamp));
        }
        if (this.f239945t) {
            contentValues.put("recallTipsTimestamp", java.lang.Long.valueOf(this.field_recallTipsTimestamp));
        }
        if (this.f239946u) {
            contentValues.put("bubbleMsgTimestamp", java.lang.Long.valueOf(this.field_bubbleMsgTimestamp));
        }
        if (this.f239947v) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.field_msgType));
        }
        if (this.f239948w) {
            contentValues.put("mainRecord", java.lang.Integer.valueOf(this.field_mainRecord));
        }
        if (this.f239949x) {
            contentValues.put("aliveTimestamp", java.lang.Long.valueOf(this.field_aliveTimestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BubbleInfo ( ");
        l75.e0 e0Var = f239928p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : F) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTableSql %s", str2);
            k0Var.A("BubbleInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BubbleInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "updateTableSql %s", str3);
            k0Var.A("BubbleInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public void d1(long j17) {
        this.field_id = j17;
        this.f239932d = true;
    }

    public void e1(java.lang.String str) {
        this.field_identity = str;
        this.f239939n = true;
    }

    public void f1(long j17) {
        this.field_inviteTimestamp = j17;
        this.f239943r = true;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239928p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239929x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_id);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239930y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239930y.f352676a;
    }

    public void h1(long j17) {
        this.field_inviteid = j17;
        this.f239935g = true;
    }

    public void i1(int i17) {
        this.field_mainRecord = i17;
        this.f239948w = true;
    }

    public void j1(int i17) {
        this.field_msgType = i17;
        this.f239947v = true;
    }

    public void k1(long j17) {
        this.field_msgid = j17;
        this.f239940o = true;
    }

    public void l1(int i17) {
        this.field_outCall = i17;
        this.f239937i = true;
    }

    public void n1(long j17) {
        this.field_recallTipsTimestamp = j17;
        this.f239945t = true;
    }

    public void o1(int i17) {
        this.field_room_state = i17;
        this.f239941p = true;
    }

    public void p1(int i17) {
        this.field_room_type = i17;
        this.f239936h = true;
    }

    public void q1(long j17) {
        this.field_roomid = j17;
        this.f239933e = true;
    }

    public void r1(long j17) {
        this.field_roomkey = j17;
        this.f239934f = true;
    }

    public int t0() {
        return this.field_abort_backend_informed;
    }

    public long u0() {
        return this.field_aliveTimestamp;
    }

    public void u1(java.lang.String str) {
        this.field_talkerName = str;
        this.f239938m = true;
    }

    public long v0() {
        return this.field_bubbleMsgTimestamp;
    }

    public long w0() {
        return this.field_connectedTimestamp;
    }

    public java.lang.String y0() {
        return this.field_identity;
    }

    public long z0() {
        return this.field_inviteTimestamp;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsLong(dm.i4.COL_ID).longValue();
            if (z17) {
                this.f239932d = true;
            }
        }
        if (contentValues.containsKey("roomid")) {
            this.field_roomid = contentValues.getAsLong("roomid").longValue();
            if (z17) {
                this.f239933e = true;
            }
        }
        if (contentValues.containsKey("roomkey")) {
            this.field_roomkey = contentValues.getAsLong("roomkey").longValue();
            if (z17) {
                this.f239934f = true;
            }
        }
        if (contentValues.containsKey("inviteid")) {
            this.field_inviteid = contentValues.getAsLong("inviteid").longValue();
            if (z17) {
                this.f239935g = true;
            }
        }
        if (contentValues.containsKey("room_type")) {
            this.field_room_type = contentValues.getAsInteger("room_type").intValue();
            if (z17) {
                this.f239936h = true;
            }
        }
        if (contentValues.containsKey("out_call")) {
            this.field_outCall = contentValues.getAsInteger("out_call").intValue();
            if (z17) {
                this.f239937i = true;
            }
        }
        if (contentValues.containsKey("talkerName")) {
            this.field_talkerName = contentValues.getAsString("talkerName");
            if (z17) {
                this.f239938m = true;
            }
        }
        if (contentValues.containsKey("identity")) {
            this.field_identity = contentValues.getAsString("identity");
            if (z17) {
                this.f239939n = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f239940o = true;
            }
        }
        if (contentValues.containsKey("room_state")) {
            this.field_room_state = contentValues.getAsInteger("room_state").intValue();
            if (z17) {
                this.f239941p = true;
            }
        }
        if (contentValues.containsKey("abort_backend_informed")) {
            this.field_abort_backend_informed = contentValues.getAsInteger("abort_backend_informed").intValue();
            if (z17) {
                this.f239942q = true;
            }
        }
        if (contentValues.containsKey("inviteTimestamp")) {
            this.field_inviteTimestamp = contentValues.getAsLong("inviteTimestamp").longValue();
            if (z17) {
                this.f239943r = true;
            }
        }
        if (contentValues.containsKey("connectedTimestamp")) {
            this.field_connectedTimestamp = contentValues.getAsLong("connectedTimestamp").longValue();
            if (z17) {
                this.f239944s = true;
            }
        }
        if (contentValues.containsKey("recallTipsTimestamp")) {
            this.field_recallTipsTimestamp = contentValues.getAsLong("recallTipsTimestamp").longValue();
            if (z17) {
                this.f239945t = true;
            }
        }
        if (contentValues.containsKey("bubbleMsgTimestamp")) {
            this.field_bubbleMsgTimestamp = contentValues.getAsLong("bubbleMsgTimestamp").longValue();
            if (z17) {
                this.f239946u = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f239947v = true;
            }
        }
        if (contentValues.containsKey("mainRecord")) {
            this.field_mainRecord = contentValues.getAsInteger("mainRecord").intValue();
            if (z17) {
                this.f239948w = true;
            }
        }
        if (contentValues.containsKey("aliveTimestamp")) {
            this.field_aliveTimestamp = contentValues.getAsLong("aliveTimestamp").longValue();
            if (z17) {
                this.f239949x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
