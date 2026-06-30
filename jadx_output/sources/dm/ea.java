package dm;

/* loaded from: classes11.dex */
public class ea extends l75.f0 {
    public static final p75.n0 A;
    public static final java.lang.String[] B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f236676J;
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
    public java.lang.String field_city;
    public java.lang.String field_distance;
    public int field_hasHDImg;
    public int field_imgstatus;
    public int field_insertBatch;
    public byte[] field_lvbuffer;
    public java.lang.String field_nickname;
    public java.lang.String field_province;
    public java.lang.String field_regionCode;
    public int field_reserved1;
    public int field_reserved2;
    public java.lang.String field_reserved3;
    public java.lang.String field_reserved4;
    public int field_sex;
    public int field_shakeItemID;
    public java.lang.String field_signature;
    public int field_snsFlag;
    public java.lang.String field_sns_bgurl;
    public int field_type;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236677d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236678e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236679f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236680g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236681h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236682i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236683m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236684n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236685o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236686p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236687q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236688r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236689s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236690t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236691u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236692v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236693w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f236694x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236695y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f236696z = true;

    static {
        p75.n0 n0Var = new p75.n0("shakeitem1");
        A = n0Var;
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
        B = new java.lang.String[0];
        C = 462907924;
        D = -265713450;
        E = 70690926;
        F = -987485392;
        G = 3053931;
        H = 1073584312;
        I = 288459765;
        f236676J = 113766;
        K = 509692277;
        L = 118137549;
        M = -130486271;
        N = 2022955529;
        P = 2022955530;
        Q = 2022955531;
        R = 2022955532;
        S = 3575610;
        T = -486944182;
        U = -1991004415;
        V = -2053655292;
        W = -1466057341;
        X = 108705909;
        Y = initAutoDBInfo(dm.ea.class);
        Z = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[20];
        java.lang.String[] strArr = new java.lang.String[21];
        e0Var.f316954c = strArr;
        strArr[0] = "shakeItemID";
        e0Var.f316955d.put("shakeItemID", "INTEGER default '0'  PRIMARY KEY ");
        e0Var.f316953b = "shakeItemID";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[3] = "province";
        e0Var.f316955d.put("province", "TEXT");
        e0Var.f316954c[4] = "city";
        e0Var.f316955d.put("city", "TEXT");
        e0Var.f316954c[5] = "signature";
        e0Var.f316955d.put("signature", "TEXT");
        e0Var.f316954c[6] = "distance";
        e0Var.f316955d.put("distance", "TEXT");
        e0Var.f316954c[7] = "sex";
        e0Var.f316955d.put("sex", "INTEGER");
        e0Var.f316954c[8] = "imgstatus";
        e0Var.f316955d.put("imgstatus", "INTEGER");
        e0Var.f316954c[9] = "hasHDImg";
        e0Var.f316955d.put("hasHDImg", "INTEGER");
        e0Var.f316954c[10] = "insertBatch";
        e0Var.f316955d.put("insertBatch", "INTEGER");
        e0Var.f316954c[11] = "reserved1";
        e0Var.f316955d.put("reserved1", "INTEGER");
        e0Var.f316954c[12] = "reserved2";
        e0Var.f316955d.put("reserved2", "INTEGER");
        e0Var.f316954c[13] = "reserved3";
        e0Var.f316955d.put("reserved3", "TEXT");
        e0Var.f316954c[14] = "reserved4";
        e0Var.f316955d.put("reserved4", "TEXT");
        e0Var.f316954c[15] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[16] = "lvbuffer";
        e0Var.f316955d.put("lvbuffer", "BLOB");
        e0Var.f316954c[17] = "regionCode";
        e0Var.f316955d.put("regionCode", "TEXT");
        e0Var.f316954c[18] = "snsFlag";
        e0Var.f316955d.put("snsFlag", "INTEGER");
        e0Var.f316954c[19] = "sns_bgurl";
        e0Var.f316955d.put("sns_bgurl", "TEXT");
        e0Var.f316954c[20] = "rowid";
        e0Var.f316956e = " shakeItemID INTEGER default '0'  PRIMARY KEY ,  username TEXT,  nickname TEXT,  province TEXT,  city TEXT,  signature TEXT,  distance TEXT,  sex INTEGER,  imgstatus INTEGER,  hasHDImg INTEGER,  insertBatch INTEGER,  reserved1 INTEGER,  reserved2 INTEGER,  reserved3 TEXT,  reserved4 TEXT,  type INTEGER,  lvbuffer BLOB,  regionCode TEXT,  snsFlag INTEGER,  sns_bgurl TEXT";
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
            if (C == hashCode) {
                try {
                    this.field_shakeItemID = cursor.getInt(i17);
                    this.f236677d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_province = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_city = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_signature = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_distance = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236676J == hashCode) {
                try {
                    this.field_sex = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_imgstatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_hasHDImg = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_insertBatch = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_reserved1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_reserved2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_reserved3 = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_reserved4 = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_lvbuffer = cursor.getBlob(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_regionCode = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_snsFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_sns_bgurl = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeItem", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236677d) {
            contentValues.put("shakeItemID", java.lang.Integer.valueOf(this.field_shakeItemID));
        }
        if (this.f236678e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236679f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f236680g) {
            contentValues.put("province", this.field_province);
        }
        if (this.f236681h) {
            contentValues.put("city", this.field_city);
        }
        if (this.f236682i) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f236683m) {
            contentValues.put("distance", this.field_distance);
        }
        if (this.f236684n) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if (this.f236685o) {
            contentValues.put("imgstatus", java.lang.Integer.valueOf(this.field_imgstatus));
        }
        if (this.f236686p) {
            contentValues.put("hasHDImg", java.lang.Integer.valueOf(this.field_hasHDImg));
        }
        if (this.f236687q) {
            contentValues.put("insertBatch", java.lang.Integer.valueOf(this.field_insertBatch));
        }
        if (this.f236688r) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.field_reserved1));
        }
        if (this.f236689s) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.field_reserved2));
        }
        if (this.f236690t) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if (this.f236691u) {
            contentValues.put("reserved4", this.field_reserved4);
        }
        if (this.f236692v) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f236693w) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f236694x) {
            contentValues.put("regionCode", this.field_regionCode);
        }
        if (this.f236695y) {
            contentValues.put("snsFlag", java.lang.Integer.valueOf(this.field_snsFlag));
        }
        if (this.f236696z) {
            contentValues.put("sns_bgurl", this.field_sns_bgurl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShakeItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS shakeitem1 ( ");
        l75.e0 e0Var = Y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeItem", "createTableSql %s", str2);
            k0Var.A("shakeitem1", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "shakeitem1", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeItem", "updateTableSql %s", str3);
            k0Var.A("shakeitem1", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.field_shakeItemID);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return A;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return A.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("shakeItemID")) {
            this.field_shakeItemID = contentValues.getAsInteger("shakeItemID").intValue();
            if (z17) {
                this.f236677d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236678e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f236679f = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z17) {
                this.f236680g = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z17) {
                this.f236681h = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z17) {
                this.f236682i = true;
            }
        }
        if (contentValues.containsKey("distance")) {
            this.field_distance = contentValues.getAsString("distance");
            if (z17) {
                this.f236683m = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f236684n = true;
            }
        }
        if (contentValues.containsKey("imgstatus")) {
            this.field_imgstatus = contentValues.getAsInteger("imgstatus").intValue();
            if (z17) {
                this.f236685o = true;
            }
        }
        if (contentValues.containsKey("hasHDImg")) {
            this.field_hasHDImg = contentValues.getAsInteger("hasHDImg").intValue();
            if (z17) {
                this.f236686p = true;
            }
        }
        if (contentValues.containsKey("insertBatch")) {
            this.field_insertBatch = contentValues.getAsInteger("insertBatch").intValue();
            if (z17) {
                this.f236687q = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z17) {
                this.f236688r = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsInteger("reserved2").intValue();
            if (z17) {
                this.f236689s = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsString("reserved3");
            if (z17) {
                this.f236690t = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.field_reserved4 = contentValues.getAsString("reserved4");
            if (z17) {
                this.f236691u = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236692v = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z17) {
                this.f236693w = true;
            }
        }
        if (contentValues.containsKey("regionCode")) {
            this.field_regionCode = contentValues.getAsString("regionCode");
            if (z17) {
                this.f236694x = true;
            }
        }
        if (contentValues.containsKey("snsFlag")) {
            this.field_snsFlag = contentValues.getAsInteger("snsFlag").intValue();
            if (z17) {
                this.f236695y = true;
            }
        }
        if (contentValues.containsKey("sns_bgurl")) {
            this.field_sns_bgurl = contentValues.getAsString("sns_bgurl");
            if (z17) {
                this.f236696z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
