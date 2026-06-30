package dm;

/* loaded from: classes4.dex */
public class q9 extends l75.f0 {
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
    public static final int f239446J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final l75.e0 S;
    public static final o75.e T;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.n0 f239447x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f239448y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239449z;
    public java.lang.String field_allArticleWording;
    public java.lang.String field_banReason;
    public java.lang.String field_bizAccountListStr;
    public long field_cacheTime;
    public java.lang.String field_decryptUserName;
    public int field_friendSubscribeCount;
    public int field_hiddenAvatar;
    public int field_hiddenButtonBeforeFocus;
    public java.lang.String field_historyArticlesUrl;
    public java.lang.String field_messageListStr;
    public java.lang.String field_newBanReason;
    public int field_originalArticleCount;
    public java.lang.String field_serviceInfoListStr;
    public int field_showRecommendArticle;
    public int field_showService;
    public int field_userRole;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239450d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239451e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239452f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239453g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239454h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239455i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239456m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239457n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239458o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239459p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239460q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239461r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239462s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239463t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239464u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239465v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239466w = true;

    static {
        p75.n0 n0Var = new p75.n0("ProfileInfo");
        f239447x = n0Var;
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
        f239448y = new java.lang.String[0];
        f239449z = -265713450;
        A = 1600383530;
        B = 1975266339;
        C = 2141634243;
        D = 1503253694;
        E = -266534175;
        F = 1797026611;
        G = 1525468599;
        H = -1922654984;
        I = 1039022764;
        f239446J = -518280656;
        K = 844465593;
        L = -553589393;
        M = 1127144867;
        N = -1245715549;
        P = 539612541;
        Q = 2101460339;
        R = 108705909;
        S = initAutoDBInfo(dm.q9.class);
        T = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[17];
        java.lang.String[] strArr = new java.lang.String[18];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "originalArticleCount";
        e0Var.f316955d.put("originalArticleCount", "INTEGER default '1' ");
        e0Var.f316954c[2] = "friendSubscribeCount";
        e0Var.f316955d.put("friendSubscribeCount", "INTEGER default '1' ");
        e0Var.f316954c[3] = "allArticleWording";
        e0Var.f316955d.put("allArticleWording", "TEXT");
        e0Var.f316954c[4] = "historyArticlesUrl";
        e0Var.f316955d.put("historyArticlesUrl", "TEXT");
        e0Var.f316954c[5] = "userRole";
        e0Var.f316955d.put("userRole", "INTEGER default '1' ");
        e0Var.f316954c[6] = "banReason";
        e0Var.f316955d.put("banReason", "TEXT");
        e0Var.f316954c[7] = "showRecommendArticle";
        e0Var.f316955d.put("showRecommendArticle", "INTEGER default '0' ");
        e0Var.f316954c[8] = "showService";
        e0Var.f316955d.put("showService", "INTEGER default '0' ");
        e0Var.f316954c[9] = "messageListStr";
        e0Var.f316955d.put("messageListStr", "TEXT");
        e0Var.f316954c[10] = "serviceInfoListStr";
        e0Var.f316955d.put("serviceInfoListStr", "TEXT");
        e0Var.f316954c[11] = "bizAccountListStr";
        e0Var.f316955d.put("bizAccountListStr", "TEXT");
        e0Var.f316954c[12] = "cacheTime";
        e0Var.f316955d.put("cacheTime", "LONG default '0' ");
        e0Var.f316954c[13] = "decryptUserName";
        e0Var.f316955d.put("decryptUserName", "TEXT default '' ");
        e0Var.f316954c[14] = "hiddenAvatar";
        e0Var.f316955d.put("hiddenAvatar", "INTEGER default '0' ");
        e0Var.f316954c[15] = "hiddenButtonBeforeFocus";
        e0Var.f316955d.put("hiddenButtonBeforeFocus", "INTEGER default '0' ");
        e0Var.f316954c[16] = "newBanReason";
        e0Var.f316955d.put("newBanReason", "TEXT");
        e0Var.f316954c[17] = "rowid";
        e0Var.f316956e = " username TEXT PRIMARY KEY ,  originalArticleCount INTEGER default '1' ,  friendSubscribeCount INTEGER default '1' ,  allArticleWording TEXT,  historyArticlesUrl TEXT,  userRole INTEGER default '1' ,  banReason TEXT,  showRecommendArticle INTEGER default '0' ,  showService INTEGER default '0' ,  messageListStr TEXT,  serviceInfoListStr TEXT,  bizAccountListStr TEXT,  cacheTime LONG default '0' ,  decryptUserName TEXT default '' ,  hiddenAvatar INTEGER default '0' ,  hiddenButtonBeforeFocus INTEGER default '0' ,  newBanReason TEXT";
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
            if (f239449z == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f239450d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_originalArticleCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_friendSubscribeCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_allArticleWording = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_historyArticlesUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_userRole = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_banReason = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_showRecommendArticle = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_showService = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_messageListStr = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239446J == hashCode) {
                try {
                    this.field_serviceInfoListStr = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_bizAccountListStr = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_cacheTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_decryptUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_hiddenAvatar = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_hiddenButtonBeforeFocus = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_newBanReason = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239450d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f239451e) {
            contentValues.put("originalArticleCount", java.lang.Integer.valueOf(this.field_originalArticleCount));
        }
        if (this.f239452f) {
            contentValues.put("friendSubscribeCount", java.lang.Integer.valueOf(this.field_friendSubscribeCount));
        }
        if (this.f239453g) {
            contentValues.put("allArticleWording", this.field_allArticleWording);
        }
        if (this.f239454h) {
            contentValues.put("historyArticlesUrl", this.field_historyArticlesUrl);
        }
        if (this.f239455i) {
            contentValues.put("userRole", java.lang.Integer.valueOf(this.field_userRole));
        }
        if (this.f239456m) {
            contentValues.put("banReason", this.field_banReason);
        }
        if (this.f239457n) {
            contentValues.put("showRecommendArticle", java.lang.Integer.valueOf(this.field_showRecommendArticle));
        }
        if (this.f239458o) {
            contentValues.put("showService", java.lang.Integer.valueOf(this.field_showService));
        }
        if (this.f239459p) {
            contentValues.put("messageListStr", this.field_messageListStr);
        }
        if (this.f239460q) {
            contentValues.put("serviceInfoListStr", this.field_serviceInfoListStr);
        }
        if (this.f239461r) {
            contentValues.put("bizAccountListStr", this.field_bizAccountListStr);
        }
        if (this.f239462s) {
            contentValues.put("cacheTime", java.lang.Long.valueOf(this.field_cacheTime));
        }
        if (this.field_decryptUserName == null) {
            this.field_decryptUserName = "";
        }
        if (this.f239463t) {
            contentValues.put("decryptUserName", this.field_decryptUserName);
        }
        if (this.f239464u) {
            contentValues.put("hiddenAvatar", java.lang.Integer.valueOf(this.field_hiddenAvatar));
        }
        if (this.f239465v) {
            contentValues.put("hiddenButtonBeforeFocus", java.lang.Integer.valueOf(this.field_hiddenButtonBeforeFocus));
        }
        if (this.f239466w) {
            contentValues.put("newBanReason", this.field_newBanReason);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseProfileInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ProfileInfo ( ");
        l75.e0 e0Var = S;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239448y) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseProfileInfo", "createTableSql %s", str2);
            k0Var.A("ProfileInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ProfileInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseProfileInfo", "updateTableSql %s", str3);
            k0Var.A("ProfileInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseProfileInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return S;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return T;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239447x;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239447x.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f239450d = true;
            }
        }
        if (contentValues.containsKey("originalArticleCount")) {
            this.field_originalArticleCount = contentValues.getAsInteger("originalArticleCount").intValue();
            if (z17) {
                this.f239451e = true;
            }
        }
        if (contentValues.containsKey("friendSubscribeCount")) {
            this.field_friendSubscribeCount = contentValues.getAsInteger("friendSubscribeCount").intValue();
            if (z17) {
                this.f239452f = true;
            }
        }
        if (contentValues.containsKey("allArticleWording")) {
            this.field_allArticleWording = contentValues.getAsString("allArticleWording");
            if (z17) {
                this.f239453g = true;
            }
        }
        if (contentValues.containsKey("historyArticlesUrl")) {
            this.field_historyArticlesUrl = contentValues.getAsString("historyArticlesUrl");
            if (z17) {
                this.f239454h = true;
            }
        }
        if (contentValues.containsKey("userRole")) {
            this.field_userRole = contentValues.getAsInteger("userRole").intValue();
            if (z17) {
                this.f239455i = true;
            }
        }
        if (contentValues.containsKey("banReason")) {
            this.field_banReason = contentValues.getAsString("banReason");
            if (z17) {
                this.f239456m = true;
            }
        }
        if (contentValues.containsKey("showRecommendArticle")) {
            this.field_showRecommendArticle = contentValues.getAsInteger("showRecommendArticle").intValue();
            if (z17) {
                this.f239457n = true;
            }
        }
        if (contentValues.containsKey("showService")) {
            this.field_showService = contentValues.getAsInteger("showService").intValue();
            if (z17) {
                this.f239458o = true;
            }
        }
        if (contentValues.containsKey("messageListStr")) {
            this.field_messageListStr = contentValues.getAsString("messageListStr");
            if (z17) {
                this.f239459p = true;
            }
        }
        if (contentValues.containsKey("serviceInfoListStr")) {
            this.field_serviceInfoListStr = contentValues.getAsString("serviceInfoListStr");
            if (z17) {
                this.f239460q = true;
            }
        }
        if (contentValues.containsKey("bizAccountListStr")) {
            this.field_bizAccountListStr = contentValues.getAsString("bizAccountListStr");
            if (z17) {
                this.f239461r = true;
            }
        }
        if (contentValues.containsKey("cacheTime")) {
            this.field_cacheTime = contentValues.getAsLong("cacheTime").longValue();
            if (z17) {
                this.f239462s = true;
            }
        }
        if (contentValues.containsKey("decryptUserName")) {
            this.field_decryptUserName = contentValues.getAsString("decryptUserName");
            if (z17) {
                this.f239463t = true;
            }
        }
        if (contentValues.containsKey("hiddenAvatar")) {
            this.field_hiddenAvatar = contentValues.getAsInteger("hiddenAvatar").intValue();
            if (z17) {
                this.f239464u = true;
            }
        }
        if (contentValues.containsKey("hiddenButtonBeforeFocus")) {
            this.field_hiddenButtonBeforeFocus = contentValues.getAsInteger("hiddenButtonBeforeFocus").intValue();
            if (z17) {
                this.f239465v = true;
            }
        }
        if (contentValues.containsKey("newBanReason")) {
            this.field_newBanReason = contentValues.getAsString("newBanReason");
            if (z17) {
                this.f239466w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
