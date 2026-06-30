package dm;

/* loaded from: classes9.dex */
public class x0 extends l75.f0 {
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
    public static final int f240948J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f240949y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f240950z;
    public int field_atAll;
    public int field_atCount;
    public long field_bizChatId;
    public java.lang.String field_brandUserName;
    public int field_chatType;
    public java.lang.String field_content;
    public java.lang.String field_digest;
    public java.lang.String field_digestUser;
    public java.lang.String field_editingMsg;
    public long field_flag;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_lastMsgTime;
    public int field_msgCount;
    public java.lang.String field_msgType;
    public int field_newUnReadCount;
    public int field_status;
    public int field_unReadCount;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240951d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240952e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240953f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240954g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240955h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240956i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240957m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240958n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240959o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240960p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240961q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240962r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240963s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240964t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240965u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240966v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f240967w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f240968x = true;

    static {
        p75.n0 n0Var = new p75.n0("BizChatConversation");
        f240949y = n0Var;
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
        f240950z = new java.lang.String[0];
        A = 193082758;
        B = -64277091;
        C = 932971136;
        D = 1436007616;
        E = 1996652390;
        F = -1067067784;
        G = 951530617;
        H = -1331913276;
        I = -1309115473;
        f240948J = -720175972;
        K = -1731317047;
        L = 1437412018;
        M = -892481550;
        N = -1180128302;
        P = 1343750747;
        Q = -1309392370;
        R = 3145580;
        S = 93103214;
        T = 108705909;
        U = initAutoDBInfo(dm.x0.class);
        V = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "bizChatId";
        e0Var.f316955d.put("bizChatId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "bizChatId";
        e0Var.f316954c[1] = "brandUserName";
        e0Var.f316955d.put("brandUserName", "TEXT");
        e0Var.f316954c[2] = "unReadCount";
        e0Var.f316955d.put("unReadCount", "INTEGER");
        e0Var.f316954c[3] = "newUnReadCount";
        e0Var.f316955d.put("newUnReadCount", "INTEGER");
        e0Var.f316954c[4] = "lastMsgID";
        e0Var.f316955d.put("lastMsgID", "LONG");
        e0Var.f316954c[5] = "lastMsgTime";
        e0Var.f316955d.put("lastMsgTime", "LONG");
        e0Var.f316954c[6] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[7] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[8] = "digestUser";
        e0Var.f316955d.put("digestUser", "TEXT default '' ");
        e0Var.f316954c[9] = "atCount";
        e0Var.f316955d.put("atCount", "INTEGER default '0' ");
        e0Var.f316954c[10] = "editingMsg";
        e0Var.f316955d.put("editingMsg", "TEXT");
        e0Var.f316954c[11] = "chatType";
        e0Var.f316955d.put("chatType", "INTEGER");
        e0Var.f316954c[12] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[13] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER default '0' ");
        e0Var.f316954c[14] = "msgType";
        e0Var.f316955d.put("msgType", "TEXT default '' ");
        e0Var.f316954c[15] = "msgCount";
        e0Var.f316955d.put("msgCount", "INTEGER default '0' ");
        e0Var.f316954c[16] = "flag";
        e0Var.f316955d.put("flag", "LONG default '0' ");
        e0Var.f316954c[17] = "atAll";
        e0Var.f316955d.put("atAll", "INTEGER default '0' ");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " bizChatId LONG PRIMARY KEY ,  brandUserName TEXT,  unReadCount INTEGER,  newUnReadCount INTEGER,  lastMsgID LONG,  lastMsgTime LONG,  content TEXT,  digest TEXT default '' ,  digestUser TEXT default '' ,  atCount INTEGER default '0' ,  editingMsg TEXT,  chatType INTEGER,  status INTEGER default '0' ,  isSend INTEGER default '0' ,  msgType TEXT default '' ,  msgCount INTEGER default '0' ,  flag LONG default '0' ,  atAll INTEGER default '0' ";
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
            if (A == hashCode) {
                try {
                    this.field_bizChatId = cursor.getLong(i17);
                    this.f240951d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_brandUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_unReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_newUnReadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_lastMsgID = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_lastMsgTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_digestUser = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240948J == hashCode) {
                try {
                    this.field_atCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_editingMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_chatType = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_msgType = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_msgCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_flag = cursor.getLong(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_atAll = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240951d) {
            contentValues.put("bizChatId", java.lang.Long.valueOf(this.field_bizChatId));
        }
        if (this.f240952e) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f240953f) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.field_unReadCount));
        }
        if (this.f240954g) {
            contentValues.put("newUnReadCount", java.lang.Integer.valueOf(this.field_newUnReadCount));
        }
        if (this.f240955h) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.field_lastMsgID));
        }
        if (this.f240956i) {
            contentValues.put("lastMsgTime", java.lang.Long.valueOf(this.field_lastMsgTime));
        }
        if (this.f240957m) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f240958n) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f240959o) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.f240960p) {
            contentValues.put("atCount", java.lang.Integer.valueOf(this.field_atCount));
        }
        if (this.f240961q) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f240962r) {
            contentValues.put("chatType", java.lang.Integer.valueOf(this.field_chatType));
        }
        if (this.f240963s) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f240964t) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.field_msgType == null) {
            this.field_msgType = "";
        }
        if (this.f240965u) {
            contentValues.put("msgType", this.field_msgType);
        }
        if (this.f240966v) {
            contentValues.put("msgCount", java.lang.Integer.valueOf(this.field_msgCount));
        }
        if (this.f240967w) {
            contentValues.put("flag", java.lang.Long.valueOf(this.field_flag));
        }
        if (this.f240968x) {
            contentValues.put("atAll", java.lang.Integer.valueOf(this.field_atAll));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizChatConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatConversation ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240950z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatConversation", "createTableSql %s", str2);
            k0Var.A("BizChatConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizChatConversation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatConversation", "updateTableSql %s", str3);
            k0Var.A("BizChatConversation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return V;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_bizChatId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240949y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240949y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizChatId")) {
            this.field_bizChatId = contentValues.getAsLong("bizChatId").longValue();
            if (z17) {
                this.f240951d = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f240952e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f240953f = true;
            }
        }
        if (contentValues.containsKey("newUnReadCount")) {
            this.field_newUnReadCount = contentValues.getAsInteger("newUnReadCount").intValue();
            if (z17) {
                this.f240954g = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f240955h = true;
            }
        }
        if (contentValues.containsKey("lastMsgTime")) {
            this.field_lastMsgTime = contentValues.getAsLong("lastMsgTime").longValue();
            if (z17) {
                this.f240956i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f240957m = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f240958n = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z17) {
                this.f240959o = true;
            }
        }
        if (contentValues.containsKey("atCount")) {
            this.field_atCount = contentValues.getAsInteger("atCount").intValue();
            if (z17) {
                this.f240960p = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f240961q = true;
            }
        }
        if (contentValues.containsKey("chatType")) {
            this.field_chatType = contentValues.getAsInteger("chatType").intValue();
            if (z17) {
                this.f240962r = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f240963s = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f240964t = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsString("msgType");
            if (z17) {
                this.f240965u = true;
            }
        }
        if (contentValues.containsKey("msgCount")) {
            this.field_msgCount = contentValues.getAsInteger("msgCount").intValue();
            if (z17) {
                this.f240966v = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f240967w = true;
            }
        }
        if (contentValues.containsKey("atAll")) {
            this.field_atAll = contentValues.getAsInteger("atAll").intValue();
            if (z17) {
                this.f240968x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
