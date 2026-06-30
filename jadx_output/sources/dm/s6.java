package dm;

/* loaded from: classes4.dex */
public class s6 extends l75.f0 {
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
    public static final int f239845J;
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
    public static final l75.e0 f239846p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f239847x0;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f239848z;
    private byte[] field_attrBuf;
    private byte[] field_content;
    private int field_createTime;
    private int field_head;
    private int field_isStar;
    private int field_likeFlag;
    private int field_localFlag;
    private int field_localPrivate;
    private byte[] field_postBuf;
    private int field_pravited;
    private int field_serverExtFlag;
    private long field_snsId;
    private int field_sourceType;
    private java.lang.String field_stringSeq;
    private int field_subType;
    private int field_type;
    private java.lang.String field_userName;
    private java.lang.String field_withTa;
    private int field_withTaHasOther;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239849d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239850e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239851f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239852g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239853h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239854i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239855m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239856n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239857o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239858p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239859q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239860r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239861s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239862t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239863u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239864v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239865w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239866x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f239867y = false;

    static {
        p75.n0 n0Var = new p75.n0(dm.va.TABLE_NAME);
        f239848z = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        A = new p75.d("rowid", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        B = new p75.d("createTime", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d("sourceType", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new p75.d("stringSeq", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        E = new java.lang.String[0];
        F = 109594803;
        G = -266666762;
        H = -1205623433;
        I = 1369213417;
        f239845J = 3198432;
        K = -1746354280;
        L = 3575610;
        M = -1111431691;
        N = 1102348195;
        P = -1388287679;
        Q = -189292914;
        R = -787570221;
        S = 748883849;
        T = 951530617;
        U = -674882878;
        V = -391239245;
        W = -1868521062;
        X = -331264918;
        Y = -1180114276;
        Z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
        e0Var.f316954c = strArr;
        strArr[0] = "snsId";
        ((java.util.HashMap) e0Var.f316955d).put("snsId", "LONG");
        e0Var.f316954c[1] = "userName";
        ((java.util.HashMap) e0Var.f316955d).put("userName", "TEXT");
        e0Var.f316954c[2] = "localFlag";
        ((java.util.HashMap) e0Var.f316955d).put("localFlag", "INTEGER");
        e0Var.f316954c[3] = "createTime";
        ((java.util.HashMap) e0Var.f316955d).put("createTime", "INTEGER");
        e0Var.f316954c[4] = "head";
        ((java.util.HashMap) e0Var.f316955d).put("head", "INTEGER");
        e0Var.f316954c[5] = "localPrivate";
        ((java.util.HashMap) e0Var.f316955d).put("localPrivate", "INTEGER");
        e0Var.f316954c[6] = "type";
        ((java.util.HashMap) e0Var.f316955d).put("type", "INTEGER");
        e0Var.f316954c[7] = "sourceType";
        ((java.util.HashMap) e0Var.f316955d).put("sourceType", "INTEGER");
        e0Var.f316954c[8] = "likeFlag";
        ((java.util.HashMap) e0Var.f316955d).put("likeFlag", "INTEGER");
        e0Var.f316954c[9] = "pravited";
        ((java.util.HashMap) e0Var.f316955d).put("pravited", "INTEGER");
        e0Var.f316954c[10] = "stringSeq";
        ((java.util.HashMap) e0Var.f316955d).put("stringSeq", "TEXT");
        e0Var.f316954c[11] = dm.va.COL_WITHTA;
        ((java.util.HashMap) e0Var.f316955d).put(dm.va.COL_WITHTA, "TEXT");
        e0Var.f316954c[12] = dm.va.COL_WITHTAHASOTHER;
        ((java.util.HashMap) e0Var.f316955d).put(dm.va.COL_WITHTAHASOTHER, "INTEGER");
        e0Var.f316954c[13] = "content";
        ((java.util.HashMap) e0Var.f316955d).put("content", "BLOB");
        e0Var.f316954c[14] = "attrBuf";
        ((java.util.HashMap) e0Var.f316955d).put("attrBuf", "BLOB");
        e0Var.f316954c[15] = "postBuf";
        ((java.util.HashMap) e0Var.f316955d).put("postBuf", "BLOB");
        e0Var.f316954c[16] = "subType";
        ((java.util.HashMap) e0Var.f316955d).put("subType", "INTEGER");
        e0Var.f316954c[17] = dm.va.COL_SERVEREXTFLAG;
        ((java.util.HashMap) e0Var.f316955d).put(dm.va.COL_SERVEREXTFLAG, "INTEGER");
        e0Var.f316954c[18] = "isStar";
        ((java.util.HashMap) e0Var.f316955d).put("isStar", "INTEGER default '0' ");
        e0Var.f316954c[19] = "rowid";
        e0Var.f316956e = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  withTa TEXT,  withTaHasOther INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  subType INTEGER,  serverExtFlag INTEGER,  isStar INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239846p0 = e0Var;
        f239847x0 = new o75.e();
    }

    public void A0(int i17) {
        this.field_localPrivate = i17;
        this.f239854i = true;
    }

    public void D0(java.lang.String str) {
        this.field_withTa = str;
        this.f239860r = true;
    }

    public void F0(int i17) {
        this.field_withTaHasOther = i17;
        this.f239861s = true;
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.s6)) {
            return false;
        }
        dm.s6 s6Var = (dm.s6) f0Var;
        return n51.f.a(java.lang.Long.valueOf(this.field_snsId), java.lang.Long.valueOf(s6Var.field_snsId)) && n51.f.a(this.field_userName, s6Var.field_userName) && n51.f.a(java.lang.Integer.valueOf(this.field_localFlag), java.lang.Integer.valueOf(s6Var.field_localFlag)) && n51.f.a(java.lang.Integer.valueOf(this.field_createTime), java.lang.Integer.valueOf(s6Var.field_createTime)) && n51.f.a(java.lang.Integer.valueOf(this.field_head), java.lang.Integer.valueOf(s6Var.field_head)) && n51.f.a(java.lang.Integer.valueOf(this.field_localPrivate), java.lang.Integer.valueOf(s6Var.field_localPrivate)) && n51.f.a(java.lang.Integer.valueOf(this.field_type), java.lang.Integer.valueOf(s6Var.field_type)) && n51.f.a(java.lang.Integer.valueOf(this.field_sourceType), java.lang.Integer.valueOf(s6Var.field_sourceType)) && n51.f.a(java.lang.Integer.valueOf(this.field_likeFlag), java.lang.Integer.valueOf(s6Var.field_likeFlag)) && n51.f.a(java.lang.Integer.valueOf(this.field_pravited), java.lang.Integer.valueOf(s6Var.field_pravited)) && n51.f.a(this.field_stringSeq, s6Var.field_stringSeq) && n51.f.a(this.field_withTa, s6Var.field_withTa) && n51.f.a(java.lang.Integer.valueOf(this.field_withTaHasOther), java.lang.Integer.valueOf(s6Var.field_withTaHasOther)) && n51.f.a(this.field_content, s6Var.field_content) && n51.f.a(this.field_attrBuf, s6Var.field_attrBuf) && n51.f.a(this.field_postBuf, s6Var.field_postBuf) && n51.f.a(java.lang.Integer.valueOf(this.field_subType), java.lang.Integer.valueOf(s6Var.field_subType)) && n51.f.a(java.lang.Integer.valueOf(this.field_serverExtFlag), java.lang.Integer.valueOf(s6Var.field_serverExtFlag)) && n51.f.a(java.lang.Integer.valueOf(this.field_isStar), java.lang.Integer.valueOf(s6Var.field_isStar));
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
                    this.field_snsId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239845J == hashCode) {
                try {
                    this.field_head = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_localPrivate = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_likeFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_pravited = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_stringSeq = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_withTa = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_withTaHasOther = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_attrBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_postBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_serverExtFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_isStar = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239849d) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.field_snsId));
        }
        if (this.f239850e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f239851f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.f239852g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f239853h) {
            contentValues.put("head", java.lang.Integer.valueOf(this.field_head));
        }
        if (this.f239854i) {
            contentValues.put("localPrivate", java.lang.Integer.valueOf(this.field_localPrivate));
        }
        if (this.f239855m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f239856n) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        }
        if (this.f239857o) {
            contentValues.put("likeFlag", java.lang.Integer.valueOf(this.field_likeFlag));
        }
        if (this.f239858p) {
            contentValues.put("pravited", java.lang.Integer.valueOf(this.field_pravited));
        }
        if (this.f239859q) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.f239860r) {
            contentValues.put(dm.va.COL_WITHTA, this.field_withTa);
        }
        if (this.f239861s) {
            contentValues.put(dm.va.COL_WITHTAHASOTHER, java.lang.Integer.valueOf(this.field_withTaHasOther));
        }
        if (this.f239862t) {
            contentValues.put("content", this.field_content);
        }
        if (this.f239863u) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.f239864v) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.f239865w) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.f239866x) {
            contentValues.put(dm.va.COL_SERVEREXTFLAG, java.lang.Integer.valueOf(this.field_serverExtFlag));
        }
        if (this.f239867y) {
            contentValues.put("isStar", java.lang.Integer.valueOf(this.field_isStar));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseImproveSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsInfo ( ");
        l75.e0 e0Var = f239846p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : E) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "createTableSql %s", str2);
            k0Var.A(dm.va.TABLE_NAME, str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, dm.va.TABLE_NAME, k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "updateTableSql %s", str3);
            k0Var.A(dm.va.TABLE_NAME, str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public int getCreateTime() {
        return this.field_createTime;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239846p0;
    }

    public int getHead() {
        return this.field_head;
    }

    public int getLikeFlag() {
        return this.field_likeFlag;
    }

    public int getLocalFlag() {
        return this.field_localFlag;
    }

    public int getLocalPrivate() {
        return this.field_localPrivate;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239847x0;
    }

    public byte[] getPostBuf() {
        return this.field_postBuf;
    }

    public int getPravited() {
        return this.field_pravited;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    public int getSourceType() {
        return this.field_sourceType;
    }

    public java.lang.String getStringSeq() {
        return this.field_stringSeq;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239848z;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239848z.f352676a;
    }

    public int getType() {
        return this.field_type;
    }

    public java.lang.String getUserName() {
        return this.field_userName;
    }

    public void setCreateTime(int i17) {
        this.field_createTime = i17;
        this.f239852g = true;
    }

    public void setHead(int i17) {
        this.field_head = i17;
        this.f239853h = true;
    }

    public void setLikeFlag(int i17) {
        this.field_likeFlag = i17;
        this.f239857o = true;
    }

    public void setSnsId(long j17) {
        this.field_snsId = j17;
        this.f239849d = true;
    }

    public android.content.ContentValues t0() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("snsId", java.lang.Long.valueOf(this.field_snsId));
        contentValues.put("userName", this.field_userName);
        contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        contentValues.put("head", java.lang.Integer.valueOf(this.field_head));
        contentValues.put("localPrivate", java.lang.Integer.valueOf(this.field_localPrivate));
        contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        contentValues.put("likeFlag", java.lang.Integer.valueOf(this.field_likeFlag));
        contentValues.put("pravited", java.lang.Integer.valueOf(this.field_pravited));
        contentValues.put("stringSeq", this.field_stringSeq);
        contentValues.put(dm.va.COL_WITHTA, this.field_withTa);
        contentValues.put(dm.va.COL_WITHTAHASOTHER, java.lang.Integer.valueOf(this.field_withTaHasOther));
        contentValues.put("content", this.field_content);
        contentValues.put("attrBuf", this.field_attrBuf);
        contentValues.put("postBuf", this.field_postBuf);
        contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
        contentValues.put(dm.va.COL_SERVEREXTFLAG, java.lang.Integer.valueOf(this.field_serverExtFlag));
        contentValues.put("isStar", java.lang.Integer.valueOf(this.field_isStar));
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    public byte[] u0() {
        return this.field_attrBuf;
    }

    public byte[] v0() {
        return this.field_content;
    }

    public int w0() {
        return this.field_serverExtFlag;
    }

    public long y0() {
        return this.field_snsId;
    }

    public void z0(byte[] bArr) {
        this.field_content = bArr;
        this.f239862t = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.f239849d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f239850e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f239851f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f239852g = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.field_head = contentValues.getAsInteger("head").intValue();
            if (z17) {
                this.f239853h = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
            if (z17) {
                this.f239854i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f239855m = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f239856n = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
            if (z17) {
                this.f239857o = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.field_pravited = contentValues.getAsInteger("pravited").intValue();
            if (z17) {
                this.f239858p = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.field_stringSeq = contentValues.getAsString("stringSeq");
            if (z17) {
                this.f239859q = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_WITHTA)) {
            this.field_withTa = contentValues.getAsString(dm.va.COL_WITHTA);
            if (z17) {
                this.f239860r = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_WITHTAHASOTHER)) {
            this.field_withTaHasOther = contentValues.getAsInteger(dm.va.COL_WITHTAHASOTHER).intValue();
            if (z17) {
                this.f239861s = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f239862t = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.f239863u = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.f239864v = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f239865w = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_SERVEREXTFLAG)) {
            this.field_serverExtFlag = contentValues.getAsInteger(dm.va.COL_SERVEREXTFLAG).intValue();
            if (z17) {
                this.f239866x = true;
            }
        }
        if (contentValues.containsKey("isStar")) {
            this.field_isStar = contentValues.getAsInteger("isStar").intValue();
            if (z17) {
                this.f239867y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
