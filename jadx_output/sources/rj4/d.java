package rj4;

/* loaded from: classes9.dex */
public class d extends l75.f0 {
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
    public static final int f396268J;
    public static final l75.e0 K;
    public static final o75.e L;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f396269t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f396270u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f396271v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f396272w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f396273x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f396274y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f396275z;
    public int field_Read;
    public int field_canChatting;
    public long field_card_key;
    public int field_createTime;
    public java.lang.String field_encUsername;
    public java.lang.String field_hash_username;
    public int field_modify_count;
    public long field_newMsgId;
    public java.lang.String field_plain;
    public java.lang.String field_session_id;
    public java.lang.String field_source_id;
    public java.lang.String field_status_id;
    public java.lang.String field_tag;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396276d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396277e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396278f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396279g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396280h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396281i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396282m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396283n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396284o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396285p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396286q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396287r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f396288s = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusGreetingItem");
        f396269t = n0Var;
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
        f396270u = new p75.d("createTime", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396271v = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusGreetingItem_sessionId_index ON TextStatusGreetingItem(session_id)"};
        f396272w = 1360674492;
        f396273x = 1661853540;
        f396274y = -441759513;
        f396275z = 4455376;
        A = 114586;
        B = -1698410561;
        C = 859999798;
        D = 106748362;
        E = 1369213417;
        F = 2543030;
        G = -2070199160;
        H = 517749066;
        I = -7913296;
        f396268J = 108705909;
        K = initAutoDBInfo(rj4.d.class);
        L = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "newMsgId";
        e0Var.f316955d.put("newMsgId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "newMsgId";
        e0Var.f316954c[1] = "session_id";
        e0Var.f316955d.put("session_id", "TEXT default '' ");
        e0Var.f316954c[2] = "hash_username";
        e0Var.f316955d.put("hash_username", "TEXT default '' ");
        e0Var.f316954c[3] = "encUsername";
        e0Var.f316955d.put("encUsername", "TEXT default '' ");
        e0Var.f316954c[4] = "tag";
        e0Var.f316955d.put("tag", "TEXT default '' ");
        e0Var.f316954c[5] = "source_id";
        e0Var.f316955d.put("source_id", "TEXT default '' ");
        e0Var.f316954c[6] = "canChatting";
        e0Var.f316955d.put("canChatting", "INTEGER default '0' ");
        e0Var.f316954c[7] = "plain";
        e0Var.f316955d.put("plain", "TEXT default '' ");
        e0Var.f316954c[8] = "createTime";
        e0Var.f316955d.put("createTime", "INTEGER");
        e0Var.f316954c[9] = "Read";
        e0Var.f316955d.put("Read", "INTEGER default '0' ");
        e0Var.f316954c[10] = "status_id";
        e0Var.f316955d.put("status_id", "TEXT default '' ");
        e0Var.f316954c[11] = "modify_count";
        e0Var.f316955d.put("modify_count", "INTEGER default '0' ");
        e0Var.f316954c[12] = "card_key";
        e0Var.f316955d.put("card_key", "LONG default '0' ");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " newMsgId LONG default '0'  PRIMARY KEY ,  session_id TEXT default '' ,  hash_username TEXT default '' ,  encUsername TEXT default '' ,  tag TEXT default '' ,  source_id TEXT default '' ,  canChatting INTEGER default '0' ,  plain TEXT default '' ,  createTime INTEGER,  Read INTEGER default '0' ,  status_id TEXT default '' ,  modify_count INTEGER default '0' ,  card_key LONG default '0' ";
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
            if (f396272w == hashCode) {
                try {
                    this.field_newMsgId = cursor.getLong(i17);
                    this.f396276d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396273x == hashCode) {
                try {
                    this.field_session_id = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396274y == hashCode) {
                try {
                    this.field_hash_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396275z == hashCode) {
                try {
                    this.field_encUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_tag = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_source_id = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_canChatting = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_plain = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_Read = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_status_id = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_modify_count = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_card_key = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396268J == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f396276d) {
            contentValues.put("newMsgId", java.lang.Long.valueOf(this.field_newMsgId));
        }
        if (this.field_session_id == null) {
            this.field_session_id = "";
        }
        if (this.f396277e) {
            contentValues.put("session_id", this.field_session_id);
        }
        if (this.field_hash_username == null) {
            this.field_hash_username = "";
        }
        if (this.f396278f) {
            contentValues.put("hash_username", this.field_hash_username);
        }
        if (this.field_encUsername == null) {
            this.field_encUsername = "";
        }
        if (this.f396279g) {
            contentValues.put("encUsername", this.field_encUsername);
        }
        if (this.field_tag == null) {
            this.field_tag = "";
        }
        if (this.f396280h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.field_source_id == null) {
            this.field_source_id = "";
        }
        if (this.f396281i) {
            contentValues.put("source_id", this.field_source_id);
        }
        if (this.f396282m) {
            contentValues.put("canChatting", java.lang.Integer.valueOf(this.field_canChatting));
        }
        if (this.field_plain == null) {
            this.field_plain = "";
        }
        if (this.f396283n) {
            contentValues.put("plain", this.field_plain);
        }
        if (this.f396284o) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f396285p) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.field_Read));
        }
        if (this.field_status_id == null) {
            this.field_status_id = "";
        }
        if (this.f396286q) {
            contentValues.put("status_id", this.field_status_id);
        }
        if (this.f396287r) {
            contentValues.put("modify_count", java.lang.Integer.valueOf(this.field_modify_count));
        }
        if (this.f396288s) {
            contentValues.put("card_key", java.lang.Long.valueOf(this.field_card_key));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusGreetingItem ( ");
        l75.e0 e0Var = K;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f396271v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTableSql %s", str2);
            k0Var.A("TextStatusGreetingItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusGreetingItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "updateTableSql %s", str3);
            k0Var.A("TextStatusGreetingItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return K;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return L;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_newMsgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396269t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396269t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("newMsgId")) {
            this.field_newMsgId = contentValues.getAsLong("newMsgId").longValue();
            if (z17) {
                this.f396276d = true;
            }
        }
        if (contentValues.containsKey("session_id")) {
            this.field_session_id = contentValues.getAsString("session_id");
            if (z17) {
                this.f396277e = true;
            }
        }
        if (contentValues.containsKey("hash_username")) {
            this.field_hash_username = contentValues.getAsString("hash_username");
            if (z17) {
                this.f396278f = true;
            }
        }
        if (contentValues.containsKey("encUsername")) {
            this.field_encUsername = contentValues.getAsString("encUsername");
            if (z17) {
                this.f396279g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z17) {
                this.f396280h = true;
            }
        }
        if (contentValues.containsKey("source_id")) {
            this.field_source_id = contentValues.getAsString("source_id");
            if (z17) {
                this.f396281i = true;
            }
        }
        if (contentValues.containsKey("canChatting")) {
            this.field_canChatting = contentValues.getAsInteger("canChatting").intValue();
            if (z17) {
                this.f396282m = true;
            }
        }
        if (contentValues.containsKey("plain")) {
            this.field_plain = contentValues.getAsString("plain");
            if (z17) {
                this.f396283n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f396284o = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f396285p = true;
            }
        }
        if (contentValues.containsKey("status_id")) {
            this.field_status_id = contentValues.getAsString("status_id");
            if (z17) {
                this.f396286q = true;
            }
        }
        if (contentValues.containsKey("modify_count")) {
            this.field_modify_count = contentValues.getAsInteger("modify_count").intValue();
            if (z17) {
                this.f396287r = true;
            }
        }
        if (contentValues.containsKey("card_key")) {
            this.field_card_key = contentValues.getAsLong("card_key").longValue();
            if (z17) {
                this.f396288s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
