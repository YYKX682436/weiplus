package rj4;

/* loaded from: classes9.dex */
public class h extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f396350J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f396351u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f396352v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f396353w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f396354x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f396355y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f396356z;
    public java.lang.String field_bigHeadImgUrl;
    public int field_block;
    public int field_canTalk;
    public java.lang.String field_city;
    public java.lang.String field_country;
    public java.lang.String field_nickname;
    public java.lang.String field_province;
    public java.lang.String field_sessionId;
    public int field_sex;
    public java.lang.String field_signature;
    public java.lang.String field_smallHeadImgUrl;
    public java.lang.String field_textStatusExtInfo;
    public java.lang.String field_textStatusId;
    public java.lang.String field_userName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396357d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396358e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396359f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396360g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396361h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396362i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396363m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396364n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396365o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396366p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396367q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396368r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f396369s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396370t = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusStrangerContact");
        f396351u = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396352v = new p75.d(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "string", tableName, "");
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
        f396353w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusStrangerContact_sessionId_index ON TextStatusStrangerContact(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusStrangerContact_userName_index ON TextStatusStrangerContact(userName)"};
        f396354x = 607796817;
        f396355y = -266666762;
        f396356z = 70690926;
        A = 113766;
        B = -987485392;
        C = 3053931;
        D = 1073584312;
        E = 447997388;
        F = -1262690029;
        G = 1921923568;
        H = 957831062;
        I = 1050464506;
        f396350J = 93832333;
        K = 549765276;
        L = 108705909;
        M = initAutoDBInfo(rj4.h.class);
        N = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "userName";
        e0Var.f316955d.put("userName", "TEXT default '' ");
        e0Var.f316954c[2] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[3] = "sex";
        e0Var.f316955d.put("sex", "INTEGER");
        e0Var.f316954c[4] = "province";
        e0Var.f316955d.put("province", "TEXT");
        e0Var.f316954c[5] = "city";
        e0Var.f316955d.put("city", "TEXT");
        e0Var.f316954c[6] = "signature";
        e0Var.f316955d.put("signature", "TEXT");
        e0Var.f316954c[7] = "bigHeadImgUrl";
        e0Var.f316955d.put("bigHeadImgUrl", "TEXT");
        e0Var.f316954c[8] = "smallHeadImgUrl";
        e0Var.f316955d.put("smallHeadImgUrl", "TEXT");
        e0Var.f316954c[9] = "textStatusExtInfo";
        e0Var.f316955d.put("textStatusExtInfo", "TEXT");
        e0Var.f316954c[10] = "country";
        e0Var.f316955d.put("country", "TEXT");
        e0Var.f316954c[11] = "textStatusId";
        e0Var.f316955d.put("textStatusId", "TEXT");
        e0Var.f316954c[12] = "block";
        e0Var.f316955d.put("block", "INTEGER");
        e0Var.f316954c[13] = "canTalk";
        e0Var.f316955d.put("canTalk", "INTEGER");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  userName TEXT default '' ,  nickname TEXT,  sex INTEGER,  province TEXT,  city TEXT,  signature TEXT,  bigHeadImgUrl TEXT,  smallHeadImgUrl TEXT,  textStatusExtInfo TEXT,  country TEXT,  textStatusId TEXT,  block INTEGER,  canTalk INTEGER";
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
            if (f396354x == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f396357d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396355y == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396356z == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_sex = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_province = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_city = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_signature = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_bigHeadImgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_smallHeadImgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_textStatusExtInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_country = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_textStatusId = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396350J == hashCode) {
                try {
                    this.field_block = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_canTalk = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusStrangerContact", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
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
        if (this.f396357d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f396358e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f396359f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f396360g) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if (this.f396361h) {
            contentValues.put("province", this.field_province);
        }
        if (this.f396362i) {
            contentValues.put("city", this.field_city);
        }
        if (this.f396363m) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f396364n) {
            contentValues.put("bigHeadImgUrl", this.field_bigHeadImgUrl);
        }
        if (this.f396365o) {
            contentValues.put("smallHeadImgUrl", this.field_smallHeadImgUrl);
        }
        if (this.f396366p) {
            contentValues.put("textStatusExtInfo", this.field_textStatusExtInfo);
        }
        if (this.f396367q) {
            contentValues.put("country", this.field_country);
        }
        if (this.f396368r) {
            contentValues.put("textStatusId", this.field_textStatusId);
        }
        if (this.f396369s) {
            contentValues.put("block", java.lang.Integer.valueOf(this.field_block));
        }
        if (this.f396370t) {
            contentValues.put("canTalk", java.lang.Integer.valueOf(this.field_canTalk));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusStrangerContact ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f396353w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTableSql %s", str2);
            k0Var.A("TextStatusStrangerContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusStrangerContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusStrangerContact", "updateTableSql %s", str3);
            k0Var.A("TextStatusStrangerContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusStrangerContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return M;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return N;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396351u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396351u.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f396357d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f396358e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f396359f = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f396360g = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z17) {
                this.f396361h = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z17) {
                this.f396362i = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z17) {
                this.f396363m = true;
            }
        }
        if (contentValues.containsKey("bigHeadImgUrl")) {
            this.field_bigHeadImgUrl = contentValues.getAsString("bigHeadImgUrl");
            if (z17) {
                this.f396364n = true;
            }
        }
        if (contentValues.containsKey("smallHeadImgUrl")) {
            this.field_smallHeadImgUrl = contentValues.getAsString("smallHeadImgUrl");
            if (z17) {
                this.f396365o = true;
            }
        }
        if (contentValues.containsKey("textStatusExtInfo")) {
            this.field_textStatusExtInfo = contentValues.getAsString("textStatusExtInfo");
            if (z17) {
                this.f396366p = true;
            }
        }
        if (contentValues.containsKey("country")) {
            this.field_country = contentValues.getAsString("country");
            if (z17) {
                this.f396367q = true;
            }
        }
        if (contentValues.containsKey("textStatusId")) {
            this.field_textStatusId = contentValues.getAsString("textStatusId");
            if (z17) {
                this.f396368r = true;
            }
        }
        if (contentValues.containsKey("block")) {
            this.field_block = contentValues.getAsInteger("block").intValue();
            if (z17) {
                this.f396369s = true;
            }
        }
        if (contentValues.containsKey("canTalk")) {
            this.field_canTalk = contentValues.getAsInteger("canTalk").intValue();
            if (z17) {
                this.f396370t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
