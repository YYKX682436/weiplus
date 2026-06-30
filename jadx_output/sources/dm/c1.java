package dm;

/* loaded from: classes11.dex */
public class c1 extends l75.f0 {
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
    public static final int f236006J;
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
    public static final p75.n0 f236007x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f236008y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236009z;
    public boolean field_chatOpen;
    public boolean field_hide_colleage_invite;
    public boolean field_hide_create_chat;
    public boolean field_hide_mod_chat_member;
    public int field_qyUin;
    public byte[] field_raw_attrs;
    public boolean field_show_confirm;
    public boolean field_use_preset_banner_tips;
    public int field_userFlag;
    public java.lang.String field_userName;
    public int field_userType;
    public int field_userUin;
    public long field_wwCorpId;
    public int field_wwExposeTimes;
    public int field_wwMaxExposeTimes;
    public int field_wwUnreadCnt;
    public long field_wwUserVid;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236010d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236011e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236012f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236013g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236014h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236015i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236016m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236017n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236018o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236019p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236020q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236021r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236022s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236023t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236024u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236025v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236026w = true;

    static {
        p75.n0 n0Var = new p75.n0("BizEnterprise");
        f236007x = n0Var;
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
        f236008y = new java.lang.String[0];
        f236009z = -266666762;
        A = 108047634;
        B = -147142513;
        C = -266894889;
        D = 1941392098;
        E = -1951888162;
        F = 1498925413;
        G = -1880172218;
        H = -266464859;
        I = 1437254082;
        f236006J = -497938374;
        K = -1902240898;
        L = -1180598077;
        M = -1878109890;
        N = 1894056615;
        P = -1622122235;
        Q = -1585790517;
        R = 108705909;
        S = initAutoDBInfo(dm.c1.class);
        T = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[17];
        java.lang.String[] strArr = new java.lang.String[18];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        e0Var.f316955d.put("userName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "userName";
        e0Var.f316954c[1] = "qyUin";
        e0Var.f316955d.put("qyUin", "INTEGER");
        e0Var.f316954c[2] = "userUin";
        e0Var.f316955d.put("userUin", "INTEGER");
        e0Var.f316954c[3] = "userFlag";
        e0Var.f316955d.put("userFlag", "INTEGER");
        e0Var.f316954c[4] = "wwExposeTimes";
        e0Var.f316955d.put("wwExposeTimes", "INTEGER");
        e0Var.f316954c[5] = "wwMaxExposeTimes";
        e0Var.f316955d.put("wwMaxExposeTimes", "INTEGER");
        e0Var.f316954c[6] = "wwCorpId";
        e0Var.f316955d.put("wwCorpId", "LONG");
        e0Var.f316954c[7] = "wwUserVid";
        e0Var.f316955d.put("wwUserVid", "LONG");
        e0Var.f316954c[8] = "userType";
        e0Var.f316955d.put("userType", "INTEGER");
        e0Var.f316954c[9] = "chatOpen";
        e0Var.f316955d.put("chatOpen", "INTEGER");
        e0Var.f316954c[10] = "wwUnreadCnt";
        e0Var.f316955d.put("wwUnreadCnt", "INTEGER default '0' ");
        e0Var.f316954c[11] = "show_confirm";
        e0Var.f316955d.put("show_confirm", "INTEGER");
        e0Var.f316954c[12] = "use_preset_banner_tips";
        e0Var.f316955d.put("use_preset_banner_tips", "INTEGER");
        e0Var.f316954c[13] = "hide_create_chat";
        e0Var.f316955d.put("hide_create_chat", "INTEGER");
        e0Var.f316954c[14] = "hide_mod_chat_member";
        e0Var.f316955d.put("hide_mod_chat_member", "INTEGER");
        e0Var.f316954c[15] = "hide_colleage_invite";
        e0Var.f316955d.put("hide_colleage_invite", "INTEGER default 'true' ");
        e0Var.f316954c[16] = "raw_attrs";
        e0Var.f316955d.put("raw_attrs", "BLOB");
        e0Var.f316954c[17] = "rowid";
        e0Var.f316956e = " userName TEXT PRIMARY KEY ,  qyUin INTEGER,  userUin INTEGER,  userFlag INTEGER,  wwExposeTimes INTEGER,  wwMaxExposeTimes INTEGER,  wwCorpId LONG,  wwUserVid LONG,  userType INTEGER,  chatOpen INTEGER,  wwUnreadCnt INTEGER default '0' ,  show_confirm INTEGER,  use_preset_banner_tips INTEGER,  hide_create_chat INTEGER,  hide_mod_chat_member INTEGER,  hide_colleage_invite INTEGER default 'true' ,  raw_attrs BLOB";
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
            if (f236009z == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                    this.f236010d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_qyUin = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_userUin = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_userFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_wwExposeTimes = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_wwMaxExposeTimes = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_wwCorpId = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_wwUserVid = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_userType = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_chatOpen = z17;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236006J == hashCode) {
                try {
                    this.field_wwUnreadCnt = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_show_confirm = z17;
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_use_preset_banner_tips = z17;
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hide_create_chat = z17;
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hide_mod_chat_member = z17;
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hide_colleage_invite = z17;
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_raw_attrs = cursor.getBlob(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizEnterprise", th22, "convertFrom %s", columnNames[i17]);
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
        if (this.f236010d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f236011e) {
            contentValues.put("qyUin", java.lang.Integer.valueOf(this.field_qyUin));
        }
        if (this.f236012f) {
            contentValues.put("userUin", java.lang.Integer.valueOf(this.field_userUin));
        }
        if (this.f236013g) {
            contentValues.put("userFlag", java.lang.Integer.valueOf(this.field_userFlag));
        }
        if (this.f236014h) {
            contentValues.put("wwExposeTimes", java.lang.Integer.valueOf(this.field_wwExposeTimes));
        }
        if (this.f236015i) {
            contentValues.put("wwMaxExposeTimes", java.lang.Integer.valueOf(this.field_wwMaxExposeTimes));
        }
        if (this.f236016m) {
            contentValues.put("wwCorpId", java.lang.Long.valueOf(this.field_wwCorpId));
        }
        if (this.f236017n) {
            contentValues.put("wwUserVid", java.lang.Long.valueOf(this.field_wwUserVid));
        }
        if (this.f236018o) {
            contentValues.put("userType", java.lang.Integer.valueOf(this.field_userType));
        }
        if (this.f236019p) {
            if (this.field_chatOpen) {
                contentValues.put("chatOpen", (java.lang.Integer) 1);
            } else {
                contentValues.put("chatOpen", (java.lang.Integer) 0);
            }
        }
        if (this.f236020q) {
            contentValues.put("wwUnreadCnt", java.lang.Integer.valueOf(this.field_wwUnreadCnt));
        }
        if (this.f236021r) {
            if (this.field_show_confirm) {
                contentValues.put("show_confirm", (java.lang.Integer) 1);
            } else {
                contentValues.put("show_confirm", (java.lang.Integer) 0);
            }
        }
        if (this.f236022s) {
            if (this.field_use_preset_banner_tips) {
                contentValues.put("use_preset_banner_tips", (java.lang.Integer) 1);
            } else {
                contentValues.put("use_preset_banner_tips", (java.lang.Integer) 0);
            }
        }
        if (this.f236023t) {
            if (this.field_hide_create_chat) {
                contentValues.put("hide_create_chat", (java.lang.Integer) 1);
            } else {
                contentValues.put("hide_create_chat", (java.lang.Integer) 0);
            }
        }
        if (this.f236024u) {
            if (this.field_hide_mod_chat_member) {
                contentValues.put("hide_mod_chat_member", (java.lang.Integer) 1);
            } else {
                contentValues.put("hide_mod_chat_member", (java.lang.Integer) 0);
            }
        }
        if (this.f236025v) {
            if (this.field_hide_colleage_invite) {
                contentValues.put("hide_colleage_invite", (java.lang.Integer) 1);
            } else {
                contentValues.put("hide_colleage_invite", (java.lang.Integer) 0);
            }
        }
        if (this.f236026w) {
            contentValues.put("raw_attrs", this.field_raw_attrs);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizEnterprise", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizEnterprise ( ");
        l75.e0 e0Var = S;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236008y) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizEnterprise", "createTableSql %s", str2);
            k0Var.A("BizEnterprise", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizEnterprise", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizEnterprise", "updateTableSql %s", str3);
            k0Var.A("BizEnterprise", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizEnterprise", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_userName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236007x;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236007x.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f236010d = true;
            }
        }
        if (contentValues.containsKey("qyUin")) {
            this.field_qyUin = contentValues.getAsInteger("qyUin").intValue();
            if (z17) {
                this.f236011e = true;
            }
        }
        if (contentValues.containsKey("userUin")) {
            this.field_userUin = contentValues.getAsInteger("userUin").intValue();
            if (z17) {
                this.f236012f = true;
            }
        }
        if (contentValues.containsKey("userFlag")) {
            this.field_userFlag = contentValues.getAsInteger("userFlag").intValue();
            if (z17) {
                this.f236013g = true;
            }
        }
        if (contentValues.containsKey("wwExposeTimes")) {
            this.field_wwExposeTimes = contentValues.getAsInteger("wwExposeTimes").intValue();
            if (z17) {
                this.f236014h = true;
            }
        }
        if (contentValues.containsKey("wwMaxExposeTimes")) {
            this.field_wwMaxExposeTimes = contentValues.getAsInteger("wwMaxExposeTimes").intValue();
            if (z17) {
                this.f236015i = true;
            }
        }
        if (contentValues.containsKey("wwCorpId")) {
            this.field_wwCorpId = contentValues.getAsLong("wwCorpId").longValue();
            if (z17) {
                this.f236016m = true;
            }
        }
        if (contentValues.containsKey("wwUserVid")) {
            this.field_wwUserVid = contentValues.getAsLong("wwUserVid").longValue();
            if (z17) {
                this.f236017n = true;
            }
        }
        if (contentValues.containsKey("userType")) {
            this.field_userType = contentValues.getAsInteger("userType").intValue();
            if (z17) {
                this.f236018o = true;
            }
        }
        if (contentValues.containsKey("chatOpen")) {
            this.field_chatOpen = contentValues.getAsInteger("chatOpen").intValue() != 0;
            if (z17) {
                this.f236019p = true;
            }
        }
        if (contentValues.containsKey("wwUnreadCnt")) {
            this.field_wwUnreadCnt = contentValues.getAsInteger("wwUnreadCnt").intValue();
            if (z17) {
                this.f236020q = true;
            }
        }
        if (contentValues.containsKey("show_confirm")) {
            this.field_show_confirm = contentValues.getAsInteger("show_confirm").intValue() != 0;
            if (z17) {
                this.f236021r = true;
            }
        }
        if (contentValues.containsKey("use_preset_banner_tips")) {
            this.field_use_preset_banner_tips = contentValues.getAsInteger("use_preset_banner_tips").intValue() != 0;
            if (z17) {
                this.f236022s = true;
            }
        }
        if (contentValues.containsKey("hide_create_chat")) {
            this.field_hide_create_chat = contentValues.getAsInteger("hide_create_chat").intValue() != 0;
            if (z17) {
                this.f236023t = true;
            }
        }
        if (contentValues.containsKey("hide_mod_chat_member")) {
            this.field_hide_mod_chat_member = contentValues.getAsInteger("hide_mod_chat_member").intValue() != 0;
            if (z17) {
                this.f236024u = true;
            }
        }
        if (contentValues.containsKey("hide_colleage_invite")) {
            this.field_hide_colleage_invite = contentValues.getAsInteger("hide_colleage_invite").intValue() != 0;
            if (z17) {
                this.f236025v = true;
            }
        }
        if (contentValues.containsKey("raw_attrs")) {
            this.field_raw_attrs = contentValues.getAsByteArray("raw_attrs");
            if (z17) {
                this.f236026w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
