package dm;

/* loaded from: classes4.dex */
public class ab extends l75.f0 {
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
    public static final int f235715J;
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
    public static final l75.e0 Y;
    public static final o75.e Z;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f235716y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f235717z;
    public byte[] field_attrBuf;
    public byte[] field_content;
    public int field_createTime;
    public int field_head;
    public int field_likeFlag;
    public int field_localFlag;
    public int field_localPrivate;
    public byte[] field_postBuf;
    public int field_pravited;
    public int field_serverExtFlag;
    public long field_snsId;
    public int field_sourceType;
    public java.lang.String field_stringSeq;
    public int field_subType;
    public int field_type;
    public java.lang.String field_userName;
    public java.lang.String field_withTa;
    public int field_withTaHasOther;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235718d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235719e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235720f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235721g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235722h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235723i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235724m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235725n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235726o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235727p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235728q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235729r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f235730s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f235731t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235732u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235733v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235734w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f235735x = true;

    static {
        p75.n0 n0Var = new p75.n0("StarSnsInfo");
        f235716y = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        f235717z = new p75.d("rowid", "long", tableName, "");
        A = new p75.d("snsId", "long", tableName, "");
        B = new p75.d("userName", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d("createTime", "int", tableName, "");
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
        D = new java.lang.String[0];
        E = 109594803;
        F = -266666762;
        G = -1205623433;
        H = 1369213417;
        I = 3198432;
        f235715J = -1746354280;
        K = 3575610;
        L = -1111431691;
        M = 1102348195;
        N = -1388287679;
        P = -189292914;
        Q = -787570221;
        R = 748883849;
        S = 951530617;
        T = -674882878;
        U = -391239245;
        V = -1868521062;
        W = -331264918;
        X = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "snsId";
        ((java.util.HashMap) e0Var.f316955d).put("snsId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "snsId";
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
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " snsId LONG PRIMARY KEY ,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  withTa TEXT,  withTaHasOther INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  subType INTEGER,  serverExtFlag INTEGER";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        Y = e0Var;
        Z = new o75.e();
    }

    public static final m75.c t0(dm.ab abVar, boolean z17) {
        if (!z17) {
            return new m75.c(abVar, true, null, null, "MicroMsg.SDK.BaseStarSnsInfo");
        }
        abVar.getClass();
        o75.c cVar = new o75.c(o75.b.f343582c, java.lang.String.valueOf(abVar.getPrimaryKeyValue()), "MicroMsg.SDK.BaseStarSnsInfo");
        cVar.f343590d = abVar;
        return new m75.c(abVar, true, cVar, Z, "MicroMsg.SDK.BaseStarSnsInfo");
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
                    this.field_snsId = cursor.getLong(i17);
                    this.f235718d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_head = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235715J == hashCode) {
                try {
                    this.field_localPrivate = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_likeFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_pravited = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_stringSeq = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_withTa = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_withTaHasOther = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_attrBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_postBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_serverExtFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStarSnsInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235718d) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.field_snsId));
        }
        if (this.f235719e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f235720f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.f235721g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f235722h) {
            contentValues.put("head", java.lang.Integer.valueOf(this.field_head));
        }
        if (this.f235723i) {
            contentValues.put("localPrivate", java.lang.Integer.valueOf(this.field_localPrivate));
        }
        if (this.f235724m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f235725n) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        }
        if (this.f235726o) {
            contentValues.put("likeFlag", java.lang.Integer.valueOf(this.field_likeFlag));
        }
        if (this.f235727p) {
            contentValues.put("pravited", java.lang.Integer.valueOf(this.field_pravited));
        }
        if (this.f235728q) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.f235729r) {
            contentValues.put(dm.va.COL_WITHTA, this.field_withTa);
        }
        if (this.f235730s) {
            contentValues.put(dm.va.COL_WITHTAHASOTHER, java.lang.Integer.valueOf(this.field_withTaHasOther));
        }
        if (this.f235731t) {
            contentValues.put("content", this.field_content);
        }
        if (this.f235732u) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.f235733v) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.f235734w) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.f235735x) {
            contentValues.put(dm.va.COL_SERVEREXTFLAG, java.lang.Integer.valueOf(this.field_serverExtFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStarSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StarSnsInfo ( ");
        l75.e0 e0Var = Y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStarSnsInfo", "createTableSql %s", str2);
            k0Var.A("StarSnsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StarSnsInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStarSnsInfo", "updateTableSql %s", str3);
            k0Var.A("StarSnsInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStarSnsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Y;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return Z;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_snsId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235716y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235716y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.f235718d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f235719e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f235720f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f235721g = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.field_head = contentValues.getAsInteger("head").intValue();
            if (z17) {
                this.f235722h = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
            if (z17) {
                this.f235723i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235724m = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f235725n = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
            if (z17) {
                this.f235726o = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.field_pravited = contentValues.getAsInteger("pravited").intValue();
            if (z17) {
                this.f235727p = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.field_stringSeq = contentValues.getAsString("stringSeq");
            if (z17) {
                this.f235728q = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_WITHTA)) {
            this.field_withTa = contentValues.getAsString(dm.va.COL_WITHTA);
            if (z17) {
                this.f235729r = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_WITHTAHASOTHER)) {
            this.field_withTaHasOther = contentValues.getAsInteger(dm.va.COL_WITHTAHASOTHER).intValue();
            if (z17) {
                this.f235730s = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f235731t = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.f235732u = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.f235733v = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f235734w = true;
            }
        }
        if (contentValues.containsKey(dm.va.COL_SERVEREXTFLAG)) {
            this.field_serverExtFlag = contentValues.getAsInteger(dm.va.COL_SERVEREXTFLAG).intValue();
            if (z17) {
                this.f235735x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
