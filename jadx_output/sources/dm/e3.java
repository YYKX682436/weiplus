package dm;

/* loaded from: classes11.dex */
public class e3 extends l75.f0 {
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
    public static final int f236592J;
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
    public static final l75.e0 f236593p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f236594x0;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f236595y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f236596z;
    public int field_addScene;
    public java.lang.String field_contentFromUsername;
    public java.lang.String field_contentFullPhoneNumMD5;
    public java.lang.String field_contentNickname;
    public java.lang.String field_contentPhoneNumMD5;
    public java.lang.String field_contentVerifyContent;
    public java.lang.String field_displayName;
    public java.lang.String field_encryptTalker;
    public java.lang.String field_fmsgContent;
    public int field_fmsgIsHasShowSelfQRCode;
    public int field_fmsgIsSend;
    public long field_fmsgSysRowId;
    public int field_fmsgType;
    public int field_isNew;
    public long field_lastModifiedTime;
    public int field_recvFmsgType;
    public int field_state;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236597d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236598e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236599f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236600g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236601h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236602i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236603m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236604n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236605o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236606p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236607q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236608r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236609s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236610t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236611u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236612v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236613w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f236614x = true;

    static {
        p75.n0 n0Var = new p75.n0("fmessage_conversation");
        f236595y = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236596z = new p75.d("talker", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("lastModifiedTime", "long", tableName, "");
        B = new p75.d("isNew", "int", tableName, "");
        C = new p75.d("addScene", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new p75.d("fmsgIsSend", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        E = new p75.d("fmsgIsHasShowSelfQRCode", "int", tableName, "");
        F = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS fmconversation_isnew_Index ON fmessage_conversation(isNew)"};
        G = -881080743;
        H = -650394338;
        I = 1714148973;
        f236592J = 109757585;
        K = -1540361492;
        L = 100473878;
        M = -1247417237;
        N = 1383537731;
        P = -331551475;
        Q = -1278221515;
        R = 1487608478;
        S = -1292739781;
        T = -1595845191;
        U = -1800620025;
        V = -742030067;
        W = 1750003582;
        X = 690307527;
        Y = -14629716;
        Z = 108705909;
        f236593p0 = initAutoDBInfo(dm.e3.class);
        f236594x0 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '0'  PRIMARY KEY ");
        e0Var.f316953b = "talker";
        e0Var.f316954c[1] = "encryptTalker";
        e0Var.f316955d.put("encryptTalker", "TEXT default '' ");
        e0Var.f316954c[2] = "displayName";
        e0Var.f316955d.put("displayName", "TEXT default '' ");
        e0Var.f316954c[3] = "state";
        e0Var.f316955d.put("state", "INTEGER default '0' ");
        e0Var.f316954c[4] = "lastModifiedTime";
        e0Var.f316955d.put("lastModifiedTime", "LONG default '0' ");
        e0Var.f316954c[5] = "isNew";
        e0Var.f316955d.put("isNew", "INTEGER default '0' ");
        e0Var.f316954c[6] = "addScene";
        e0Var.f316955d.put("addScene", "INTEGER default '0' ");
        e0Var.f316954c[7] = "fmsgSysRowId";
        e0Var.f316955d.put("fmsgSysRowId", "LONG default '0' ");
        e0Var.f316954c[8] = "fmsgIsSend";
        e0Var.f316955d.put("fmsgIsSend", "INTEGER default '0' ");
        e0Var.f316954c[9] = "fmsgType";
        e0Var.f316955d.put("fmsgType", "INTEGER default '0' ");
        e0Var.f316954c[10] = "fmsgContent";
        e0Var.f316955d.put("fmsgContent", "TEXT default '' ");
        e0Var.f316954c[11] = "recvFmsgType";
        e0Var.f316955d.put("recvFmsgType", "INTEGER default '0' ");
        e0Var.f316954c[12] = "contentFromUsername";
        e0Var.f316955d.put("contentFromUsername", "TEXT default '' ");
        e0Var.f316954c[13] = "contentNickname";
        e0Var.f316955d.put("contentNickname", "TEXT default '' ");
        e0Var.f316954c[14] = "contentPhoneNumMD5";
        e0Var.f316955d.put("contentPhoneNumMD5", "TEXT default '' ");
        e0Var.f316954c[15] = "contentFullPhoneNumMD5";
        e0Var.f316955d.put("contentFullPhoneNumMD5", "TEXT default '' ");
        e0Var.f316954c[16] = "contentVerifyContent";
        e0Var.f316955d.put("contentVerifyContent", "TEXT default '' ");
        e0Var.f316954c[17] = "fmsgIsHasShowSelfQRCode";
        e0Var.f316955d.put("fmsgIsHasShowSelfQRCode", "INTEGER default '0' ");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " talker TEXT default '0'  PRIMARY KEY ,  encryptTalker TEXT default '' ,  displayName TEXT default '' ,  state INTEGER default '0' ,  lastModifiedTime LONG default '0' ,  isNew INTEGER default '0' ,  addScene INTEGER default '0' ,  fmsgSysRowId LONG default '0' ,  fmsgIsSend INTEGER default '0' ,  fmsgType INTEGER default '0' ,  fmsgContent TEXT default '' ,  recvFmsgType INTEGER default '0' ,  contentFromUsername TEXT default '' ,  contentNickname TEXT default '' ,  contentPhoneNumMD5 TEXT default '' ,  contentFullPhoneNumMD5 TEXT default '' ,  contentVerifyContent TEXT default '' ,  fmsgIsHasShowSelfQRCode INTEGER default '0' ";
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
            if (G == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                    this.f236597d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_encryptTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_displayName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236592J == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_lastModifiedTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_isNew = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_addScene = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_fmsgSysRowId = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_fmsgIsSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_fmsgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_fmsgContent = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_recvFmsgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_contentFromUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_contentNickname = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_contentPhoneNumMD5 = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_contentFullPhoneNumMD5 = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_contentVerifyContent = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_fmsgIsHasShowSelfQRCode = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageConversation", th23, "convertFrom %s", columnNames[i17]);
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
        if (this.field_talker == null) {
            this.field_talker = "0";
        }
        if (this.f236597d) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_encryptTalker == null) {
            this.field_encryptTalker = "";
        }
        if (this.f236598e) {
            contentValues.put("encryptTalker", this.field_encryptTalker);
        }
        if (this.field_displayName == null) {
            this.field_displayName = "";
        }
        if (this.f236599f) {
            contentValues.put("displayName", this.field_displayName);
        }
        if (this.f236600g) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f236601h) {
            contentValues.put("lastModifiedTime", java.lang.Long.valueOf(this.field_lastModifiedTime));
        }
        if (this.f236602i) {
            contentValues.put("isNew", java.lang.Integer.valueOf(this.field_isNew));
        }
        if (this.f236603m) {
            contentValues.put("addScene", java.lang.Integer.valueOf(this.field_addScene));
        }
        if (this.f236604n) {
            contentValues.put("fmsgSysRowId", java.lang.Long.valueOf(this.field_fmsgSysRowId));
        }
        if (this.f236605o) {
            contentValues.put("fmsgIsSend", java.lang.Integer.valueOf(this.field_fmsgIsSend));
        }
        if (this.f236606p) {
            contentValues.put("fmsgType", java.lang.Integer.valueOf(this.field_fmsgType));
        }
        if (this.field_fmsgContent == null) {
            this.field_fmsgContent = "";
        }
        if (this.f236607q) {
            contentValues.put("fmsgContent", this.field_fmsgContent);
        }
        if (this.f236608r) {
            contentValues.put("recvFmsgType", java.lang.Integer.valueOf(this.field_recvFmsgType));
        }
        if (this.field_contentFromUsername == null) {
            this.field_contentFromUsername = "";
        }
        if (this.f236609s) {
            contentValues.put("contentFromUsername", this.field_contentFromUsername);
        }
        if (this.field_contentNickname == null) {
            this.field_contentNickname = "";
        }
        if (this.f236610t) {
            contentValues.put("contentNickname", this.field_contentNickname);
        }
        if (this.field_contentPhoneNumMD5 == null) {
            this.field_contentPhoneNumMD5 = "";
        }
        if (this.f236611u) {
            contentValues.put("contentPhoneNumMD5", this.field_contentPhoneNumMD5);
        }
        if (this.field_contentFullPhoneNumMD5 == null) {
            this.field_contentFullPhoneNumMD5 = "";
        }
        if (this.f236612v) {
            contentValues.put("contentFullPhoneNumMD5", this.field_contentFullPhoneNumMD5);
        }
        if (this.field_contentVerifyContent == null) {
            this.field_contentVerifyContent = "";
        }
        if (this.f236613w) {
            contentValues.put("contentVerifyContent", this.field_contentVerifyContent);
        }
        if (this.f236614x) {
            contentValues.put("fmsgIsHasShowSelfQRCode", java.lang.Integer.valueOf(this.field_fmsgIsHasShowSelfQRCode));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFMessageConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS fmessage_conversation ( ");
        l75.e0 e0Var = f236593p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : F) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageConversation", "createTableSql %s", str2);
            k0Var.A("fmessage_conversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "fmessage_conversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageConversation", "updateTableSql %s", str3);
            k0Var.A("fmessage_conversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236593p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236594x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_talker;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236595y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236595y.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "talker", this.field_talker);
            n51.f.b(jSONObject, "encryptTalker", this.field_encryptTalker);
            n51.f.b(jSONObject, "displayName", this.field_displayName);
            n51.f.b(jSONObject, "state", java.lang.Integer.valueOf(this.field_state));
            n51.f.b(jSONObject, "lastModifiedTime", java.lang.Long.valueOf(this.field_lastModifiedTime));
            n51.f.b(jSONObject, "isNew", java.lang.Integer.valueOf(this.field_isNew));
            n51.f.b(jSONObject, "addScene", java.lang.Integer.valueOf(this.field_addScene));
            n51.f.b(jSONObject, "fmsgSysRowId", java.lang.Long.valueOf(this.field_fmsgSysRowId));
            n51.f.b(jSONObject, "fmsgIsSend", java.lang.Integer.valueOf(this.field_fmsgIsSend));
            n51.f.b(jSONObject, "fmsgType", java.lang.Integer.valueOf(this.field_fmsgType));
            n51.f.b(jSONObject, "fmsgContent", this.field_fmsgContent);
            n51.f.b(jSONObject, "recvFmsgType", java.lang.Integer.valueOf(this.field_recvFmsgType));
            n51.f.b(jSONObject, "contentFromUsername", this.field_contentFromUsername);
            n51.f.b(jSONObject, "contentNickname", this.field_contentNickname);
            n51.f.b(jSONObject, "contentPhoneNumMD5", this.field_contentPhoneNumMD5);
            n51.f.b(jSONObject, "contentFullPhoneNumMD5", this.field_contentFullPhoneNumMD5);
            n51.f.b(jSONObject, "contentVerifyContent", this.field_contentVerifyContent);
            n51.f.b(jSONObject, "fmsgIsHasShowSelfQRCode", java.lang.Integer.valueOf(this.field_fmsgIsHasShowSelfQRCode));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236597d = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.field_encryptTalker = contentValues.getAsString("encryptTalker");
            if (z17) {
                this.f236598e = true;
            }
        }
        if (contentValues.containsKey("displayName")) {
            this.field_displayName = contentValues.getAsString("displayName");
            if (z17) {
                this.f236599f = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f236600g = true;
            }
        }
        if (contentValues.containsKey("lastModifiedTime")) {
            this.field_lastModifiedTime = contentValues.getAsLong("lastModifiedTime").longValue();
            if (z17) {
                this.f236601h = true;
            }
        }
        if (contentValues.containsKey("isNew")) {
            this.field_isNew = contentValues.getAsInteger("isNew").intValue();
            if (z17) {
                this.f236602i = true;
            }
        }
        if (contentValues.containsKey("addScene")) {
            this.field_addScene = contentValues.getAsInteger("addScene").intValue();
            if (z17) {
                this.f236603m = true;
            }
        }
        if (contentValues.containsKey("fmsgSysRowId")) {
            this.field_fmsgSysRowId = contentValues.getAsLong("fmsgSysRowId").longValue();
            if (z17) {
                this.f236604n = true;
            }
        }
        if (contentValues.containsKey("fmsgIsSend")) {
            this.field_fmsgIsSend = contentValues.getAsInteger("fmsgIsSend").intValue();
            if (z17) {
                this.f236605o = true;
            }
        }
        if (contentValues.containsKey("fmsgType")) {
            this.field_fmsgType = contentValues.getAsInteger("fmsgType").intValue();
            if (z17) {
                this.f236606p = true;
            }
        }
        if (contentValues.containsKey("fmsgContent")) {
            this.field_fmsgContent = contentValues.getAsString("fmsgContent");
            if (z17) {
                this.f236607q = true;
            }
        }
        if (contentValues.containsKey("recvFmsgType")) {
            this.field_recvFmsgType = contentValues.getAsInteger("recvFmsgType").intValue();
            if (z17) {
                this.f236608r = true;
            }
        }
        if (contentValues.containsKey("contentFromUsername")) {
            this.field_contentFromUsername = contentValues.getAsString("contentFromUsername");
            if (z17) {
                this.f236609s = true;
            }
        }
        if (contentValues.containsKey("contentNickname")) {
            this.field_contentNickname = contentValues.getAsString("contentNickname");
            if (z17) {
                this.f236610t = true;
            }
        }
        if (contentValues.containsKey("contentPhoneNumMD5")) {
            this.field_contentPhoneNumMD5 = contentValues.getAsString("contentPhoneNumMD5");
            if (z17) {
                this.f236611u = true;
            }
        }
        if (contentValues.containsKey("contentFullPhoneNumMD5")) {
            this.field_contentFullPhoneNumMD5 = contentValues.getAsString("contentFullPhoneNumMD5");
            if (z17) {
                this.f236612v = true;
            }
        }
        if (contentValues.containsKey("contentVerifyContent")) {
            this.field_contentVerifyContent = contentValues.getAsString("contentVerifyContent");
            if (z17) {
                this.f236613w = true;
            }
        }
        if (contentValues.containsKey("fmsgIsHasShowSelfQRCode")) {
            this.field_fmsgIsHasShowSelfQRCode = contentValues.getAsInteger("fmsgIsHasShowSelfQRCode").intValue();
            if (z17) {
                this.f236614x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
