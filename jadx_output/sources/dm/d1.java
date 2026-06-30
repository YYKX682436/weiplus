package dm;

/* loaded from: classes11.dex */
public class d1 extends l75.f0 {
    public static final java.lang.String[] A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f236288J;
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

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f236289z;
    public byte[] field_InteractiveInfo;
    public long field_cacheLifetime;
    public boolean field_canSendMsg;
    public java.lang.String field_city;
    public java.lang.String field_country;
    public long field_createTime;
    public java.lang.String field_headImgUrl;
    public int field_headType;
    public java.lang.String field_identityName;
    public int field_identityType;
    public boolean field_inBlacklist;
    public java.lang.String field_nickname;
    public java.lang.String field_openid;
    public java.lang.String field_province;
    public java.lang.String field_renderMpAppUrl;
    public int field_serviceType;
    public int field_sex;
    public java.lang.String field_signature;
    public byte[] field_userFriendInfo;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236290d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236291e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236292f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236293g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236294h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236295i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236296m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236297n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236298o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236299p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236300q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236301r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236302s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236303t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236304u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236305v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236306w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f236307x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236308y = true;

    static {
        p75.n0 n0Var = new p75.n0("BizFansContact");
        f236289z = n0Var;
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
        A = new java.lang.String[0];
        B = -1010579227;
        C = -120724200;
        D = 70690926;
        E = 1171836076;
        F = 957831062;
        G = -987485392;
        H = 3053931;
        I = 113766;
        f236288J = 1073584312;
        K = 1716598471;
        L = -800967304;
        M = 1369213417;
        N = -1862656368;
        P = -1115758278;
        Q = -120926103;
        R = -1252158101;
        S = -1002493289;
        T = -1928370289;
        U = 575766761;
        V = 108705909;
        W = initAutoDBInfo(dm.d1.class);
        X = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
        e0Var.f316954c = strArr;
        strArr[0] = com.google.android.gms.common.Scopes.OPEN_ID;
        e0Var.f316955d.put(com.google.android.gms.common.Scopes.OPEN_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.google.android.gms.common.Scopes.OPEN_ID;
        e0Var.f316954c[1] = "identityType";
        e0Var.f316955d.put("identityType", "INTEGER default '0' ");
        e0Var.f316954c[2] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT default '' ");
        e0Var.f316954c[3] = "headImgUrl";
        e0Var.f316955d.put("headImgUrl", "TEXT default '' ");
        e0Var.f316954c[4] = "country";
        e0Var.f316955d.put("country", "TEXT default '' ");
        e0Var.f316954c[5] = "province";
        e0Var.f316955d.put("province", "TEXT default '' ");
        e0Var.f316954c[6] = "city";
        e0Var.f316955d.put("city", "TEXT default '' ");
        e0Var.f316954c[7] = "sex";
        e0Var.f316955d.put("sex", "INTEGER default '-1' ");
        e0Var.f316954c[8] = "signature";
        e0Var.f316955d.put("signature", "TEXT default '' ");
        e0Var.f316954c[9] = "renderMpAppUrl";
        e0Var.f316955d.put("renderMpAppUrl", "TEXT default '' ");
        e0Var.f316954c[10] = "inBlacklist";
        e0Var.f316955d.put("inBlacklist", "INTEGER");
        e0Var.f316954c[11] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[12] = "InteractiveInfo";
        e0Var.f316955d.put("InteractiveInfo", "BLOB default '' ");
        e0Var.f316954c[13] = "headType";
        e0Var.f316955d.put("headType", "INTEGER default '0' ");
        e0Var.f316954c[14] = "identityName";
        e0Var.f316955d.put("identityName", "TEXT default '' ");
        e0Var.f316954c[15] = "cacheLifetime";
        e0Var.f316955d.put("cacheLifetime", "LONG default '0' ");
        e0Var.f316954c[16] = "userFriendInfo";
        e0Var.f316955d.put("userFriendInfo", "BLOB default '' ");
        e0Var.f316954c[17] = "serviceType";
        e0Var.f316955d.put("serviceType", "INTEGER default '0' ");
        e0Var.f316954c[18] = "canSendMsg";
        e0Var.f316955d.put("canSendMsg", "INTEGER");
        e0Var.f316954c[19] = "rowid";
        e0Var.f316956e = " openid TEXT default ''  PRIMARY KEY ,  identityType INTEGER default '0' ,  nickname TEXT default '' ,  headImgUrl TEXT default '' ,  country TEXT default '' ,  province TEXT default '' ,  city TEXT default '' ,  sex INTEGER default '-1' ,  signature TEXT default '' ,  renderMpAppUrl TEXT default '' ,  inBlacklist INTEGER,  createTime LONG default '0' ,  InteractiveInfo BLOB default '' ,  headType INTEGER default '0' ,  identityName TEXT default '' ,  cacheLifetime LONG default '0' ,  userFriendInfo BLOB default '' ,  serviceType INTEGER default '0' ,  canSendMsg INTEGER";
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
            boolean z17 = true;
            if (B == hashCode) {
                try {
                    this.field_openid = cursor.getString(i17);
                    this.f236290d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_identityType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_headImgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_country = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_province = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_city = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_sex = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236288J == hashCode) {
                try {
                    this.field_signature = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_renderMpAppUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_inBlacklist = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_InteractiveInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_headType = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_identityName = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_cacheLifetime = cursor.getLong(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_userFriendInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_serviceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canSendMsg = z17;
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFansContact", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_openid == null) {
            this.field_openid = "";
        }
        if (this.f236290d) {
            contentValues.put(com.google.android.gms.common.Scopes.OPEN_ID, this.field_openid);
        }
        if (this.f236291e) {
            contentValues.put("identityType", java.lang.Integer.valueOf(this.field_identityType));
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f236292f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_headImgUrl == null) {
            this.field_headImgUrl = "";
        }
        if (this.f236293g) {
            contentValues.put("headImgUrl", this.field_headImgUrl);
        }
        if (this.field_country == null) {
            this.field_country = "";
        }
        if (this.f236294h) {
            contentValues.put("country", this.field_country);
        }
        if (this.field_province == null) {
            this.field_province = "";
        }
        if (this.f236295i) {
            contentValues.put("province", this.field_province);
        }
        if (this.field_city == null) {
            this.field_city = "";
        }
        if (this.f236296m) {
            contentValues.put("city", this.field_city);
        }
        if (this.f236297n) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if (this.field_signature == null) {
            this.field_signature = "";
        }
        if (this.f236298o) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.field_renderMpAppUrl == null) {
            this.field_renderMpAppUrl = "";
        }
        if (this.f236299p) {
            contentValues.put("renderMpAppUrl", this.field_renderMpAppUrl);
        }
        if (this.f236300q) {
            if (this.field_inBlacklist) {
                contentValues.put("inBlacklist", (java.lang.Integer) 1);
            } else {
                contentValues.put("inBlacklist", (java.lang.Integer) 0);
            }
        }
        if (this.f236301r) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f236302s) {
            contentValues.put("InteractiveInfo", this.field_InteractiveInfo);
        }
        if (this.f236303t) {
            contentValues.put("headType", java.lang.Integer.valueOf(this.field_headType));
        }
        if (this.field_identityName == null) {
            this.field_identityName = "";
        }
        if (this.f236304u) {
            contentValues.put("identityName", this.field_identityName);
        }
        if (this.f236305v) {
            contentValues.put("cacheLifetime", java.lang.Long.valueOf(this.field_cacheLifetime));
        }
        if (this.f236306w) {
            contentValues.put("userFriendInfo", this.field_userFriendInfo);
        }
        if (this.f236307x) {
            contentValues.put("serviceType", java.lang.Integer.valueOf(this.field_serviceType));
        }
        if (this.f236308y) {
            if (this.field_canSendMsg) {
                contentValues.put("canSendMsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("canSendMsg", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizFansContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFansContact ( ");
        l75.e0 e0Var = W;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansContact", "createTableSql %s", str2);
            k0Var.A("BizFansContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizFansContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansContact", "updateTableSql %s", str3);
            k0Var.A("BizFansContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFansContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_openid;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236289z;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236289z.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.google.android.gms.common.Scopes.OPEN_ID)) {
            this.field_openid = contentValues.getAsString(com.google.android.gms.common.Scopes.OPEN_ID);
            if (z17) {
                this.f236290d = true;
            }
        }
        if (contentValues.containsKey("identityType")) {
            this.field_identityType = contentValues.getAsInteger("identityType").intValue();
            if (z17) {
                this.f236291e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f236292f = true;
            }
        }
        if (contentValues.containsKey("headImgUrl")) {
            this.field_headImgUrl = contentValues.getAsString("headImgUrl");
            if (z17) {
                this.f236293g = true;
            }
        }
        if (contentValues.containsKey("country")) {
            this.field_country = contentValues.getAsString("country");
            if (z17) {
                this.f236294h = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z17) {
                this.f236295i = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z17) {
                this.f236296m = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f236297n = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z17) {
                this.f236298o = true;
            }
        }
        if (contentValues.containsKey("renderMpAppUrl")) {
            this.field_renderMpAppUrl = contentValues.getAsString("renderMpAppUrl");
            if (z17) {
                this.f236299p = true;
            }
        }
        if (contentValues.containsKey("inBlacklist")) {
            this.field_inBlacklist = contentValues.getAsInteger("inBlacklist").intValue() != 0;
            if (z17) {
                this.f236300q = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f236301r = true;
            }
        }
        if (contentValues.containsKey("InteractiveInfo")) {
            this.field_InteractiveInfo = contentValues.getAsByteArray("InteractiveInfo");
            if (z17) {
                this.f236302s = true;
            }
        }
        if (contentValues.containsKey("headType")) {
            this.field_headType = contentValues.getAsInteger("headType").intValue();
            if (z17) {
                this.f236303t = true;
            }
        }
        if (contentValues.containsKey("identityName")) {
            this.field_identityName = contentValues.getAsString("identityName");
            if (z17) {
                this.f236304u = true;
            }
        }
        if (contentValues.containsKey("cacheLifetime")) {
            this.field_cacheLifetime = contentValues.getAsLong("cacheLifetime").longValue();
            if (z17) {
                this.f236305v = true;
            }
        }
        if (contentValues.containsKey("userFriendInfo")) {
            this.field_userFriendInfo = contentValues.getAsByteArray("userFriendInfo");
            if (z17) {
                this.f236306w = true;
            }
        }
        if (contentValues.containsKey("serviceType")) {
            this.field_serviceType = contentValues.getAsInteger("serviceType").intValue();
            if (z17) {
                this.f236307x = true;
            }
        }
        if (contentValues.containsKey("canSendMsg")) {
            this.field_canSendMsg = contentValues.getAsInteger("canSendMsg").intValue() != 0;
            if (z17) {
                this.f236308y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
