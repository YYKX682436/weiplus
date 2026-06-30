package dm;

/* loaded from: classes11.dex */
public class w1 extends l75.f0 {
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
    public static final int f240717J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f240718q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f240719r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f240720s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f240721t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f240722u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f240723v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f240724w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f240725x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f240726y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f240727z;
    private int field_InteractiveMode;
    private java.lang.String field_menu;
    private java.lang.String field_openIMCustomInfo;
    private java.lang.String field_openIMDescId;
    private java.lang.String field_openIMId;
    private java.lang.String field_profileInfoDetail;
    private java.lang.String field_serviceAgreement;
    private java.lang.String field_shortcutList;
    private long field_toolbarFlag;
    private java.lang.String field_userName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240728d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240729e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240730f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240731g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240732h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240733i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240734m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240735n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240736o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240737p = false;

    static {
        p75.n0 n0Var = new p75.n0("ChatBotConfig");
        f240718q = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240719r = new p75.d("userName", "string", tableName, "");
        f240720s = new p75.d("menu", "string", tableName, "");
        f240721t = new p75.d("profileInfoDetail", "string", tableName, "");
        f240722u = new p75.d("serviceAgreement", "string", tableName, "");
        f240723v = new p75.d("toolbarFlag", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240724w = new p75.d("openIMId", "string", tableName, "");
        f240725x = new p75.d("openIMDescId", "string", tableName, "");
        f240726y = new p75.d("openIMCustomInfo", "string", tableName, "");
        f240727z = new p75.d("shortcutList", "string", tableName, "");
        A = new java.lang.String[0];
        B = -266666762;
        C = 3347807;
        D = -1369123544;
        E = 472082133;
        F = 1815398791;
        G = -1862536315;
        H = -505001303;
        I = -1833275878;
        f240717J = -905768115;
        K = 960916996;
        L = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        ((java.util.HashMap) e0Var.f316955d).put("userName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "userName";
        e0Var.f316954c[1] = "menu";
        ((java.util.HashMap) e0Var.f316955d).put("menu", "TEXT");
        e0Var.f316954c[2] = "profileInfoDetail";
        ((java.util.HashMap) e0Var.f316955d).put("profileInfoDetail", "TEXT");
        e0Var.f316954c[3] = "serviceAgreement";
        ((java.util.HashMap) e0Var.f316955d).put("serviceAgreement", "TEXT");
        e0Var.f316954c[4] = "toolbarFlag";
        ((java.util.HashMap) e0Var.f316955d).put("toolbarFlag", "LONG");
        e0Var.f316954c[5] = "InteractiveMode";
        ((java.util.HashMap) e0Var.f316955d).put("InteractiveMode", "INTEGER");
        e0Var.f316954c[6] = "openIMId";
        ((java.util.HashMap) e0Var.f316955d).put("openIMId", "TEXT");
        e0Var.f316954c[7] = "openIMDescId";
        ((java.util.HashMap) e0Var.f316955d).put("openIMDescId", "TEXT");
        e0Var.f316954c[8] = "openIMCustomInfo";
        ((java.util.HashMap) e0Var.f316955d).put("openIMCustomInfo", "TEXT");
        e0Var.f316954c[9] = "shortcutList";
        ((java.util.HashMap) e0Var.f316955d).put("shortcutList", "TEXT");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " userName TEXT PRIMARY KEY ,  menu TEXT,  profileInfoDetail TEXT,  serviceAgreement TEXT,  toolbarFlag LONG,  InteractiveMode INTEGER,  openIMId TEXT,  openIMDescId TEXT,  openIMCustomInfo TEXT,  shortcutList TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        M = e0Var;
        N = new o75.e();
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
            if (B == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                    this.f240728d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_menu = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_profileInfoDetail = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_serviceAgreement = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_toolbarFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_InteractiveMode = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_openIMId = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_openIMDescId = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240717J == hashCode) {
                try {
                    this.field_openIMCustomInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_shortcutList = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatBotConfig", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240728d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f240729e) {
            contentValues.put("menu", this.field_menu);
        }
        if (this.f240730f) {
            contentValues.put("profileInfoDetail", this.field_profileInfoDetail);
        }
        if (this.f240731g) {
            contentValues.put("serviceAgreement", this.field_serviceAgreement);
        }
        if (this.f240732h) {
            contentValues.put("toolbarFlag", java.lang.Long.valueOf(this.field_toolbarFlag));
        }
        if (this.f240733i) {
            contentValues.put("InteractiveMode", java.lang.Integer.valueOf(this.field_InteractiveMode));
        }
        if (this.f240734m) {
            contentValues.put("openIMId", this.field_openIMId);
        }
        if (this.f240735n) {
            contentValues.put("openIMDescId", this.field_openIMDescId);
        }
        if (this.f240736o) {
            contentValues.put("openIMCustomInfo", this.field_openIMCustomInfo);
        }
        if (this.f240737p) {
            contentValues.put("shortcutList", this.field_shortcutList);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatBotConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatBotConfig ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatBotConfig", "createTableSql %s", str2);
            k0Var.A("ChatBotConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ChatBotConfig", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatBotConfig", "updateTableSql %s", str3);
            k0Var.A("ChatBotConfig", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatBotConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_userName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240718q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240718q.f352676a;
    }

    public void setUserName(java.lang.String str) {
        this.field_userName = str;
        this.f240728d = true;
    }

    public android.content.ContentValues t0() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("userName", this.field_userName);
        contentValues.put("menu", this.field_menu);
        contentValues.put("profileInfoDetail", this.field_profileInfoDetail);
        contentValues.put("serviceAgreement", this.field_serviceAgreement);
        contentValues.put("toolbarFlag", java.lang.Long.valueOf(this.field_toolbarFlag));
        contentValues.put("InteractiveMode", java.lang.Integer.valueOf(this.field_InteractiveMode));
        contentValues.put("openIMId", this.field_openIMId);
        contentValues.put("openIMDescId", this.field_openIMDescId);
        contentValues.put("openIMCustomInfo", this.field_openIMCustomInfo);
        contentValues.put("shortcutList", this.field_shortcutList);
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f240728d = true;
            }
        }
        if (contentValues.containsKey("menu")) {
            this.field_menu = contentValues.getAsString("menu");
            if (z17) {
                this.f240729e = true;
            }
        }
        if (contentValues.containsKey("profileInfoDetail")) {
            this.field_profileInfoDetail = contentValues.getAsString("profileInfoDetail");
            if (z17) {
                this.f240730f = true;
            }
        }
        if (contentValues.containsKey("serviceAgreement")) {
            this.field_serviceAgreement = contentValues.getAsString("serviceAgreement");
            if (z17) {
                this.f240731g = true;
            }
        }
        if (contentValues.containsKey("toolbarFlag")) {
            this.field_toolbarFlag = contentValues.getAsLong("toolbarFlag").longValue();
            if (z17) {
                this.f240732h = true;
            }
        }
        if (contentValues.containsKey("InteractiveMode")) {
            this.field_InteractiveMode = contentValues.getAsInteger("InteractiveMode").intValue();
            if (z17) {
                this.f240733i = true;
            }
        }
        if (contentValues.containsKey("openIMId")) {
            this.field_openIMId = contentValues.getAsString("openIMId");
            if (z17) {
                this.f240734m = true;
            }
        }
        if (contentValues.containsKey("openIMDescId")) {
            this.field_openIMDescId = contentValues.getAsString("openIMDescId");
            if (z17) {
                this.f240735n = true;
            }
        }
        if (contentValues.containsKey("openIMCustomInfo")) {
            this.field_openIMCustomInfo = contentValues.getAsString("openIMCustomInfo");
            if (z17) {
                this.f240736o = true;
            }
        }
        if (contentValues.containsKey("shortcutList")) {
            this.field_shortcutList = contentValues.getAsString("shortcutList");
            if (z17) {
                this.f240737p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
