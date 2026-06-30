package dm;

/* loaded from: classes11.dex */
public class z5 extends l75.f0 {
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
    public static final l75.e0 f241468J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f241469t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f241470u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f241471v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f241472w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241473x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241474y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241475z;
    public java.lang.String field_content;
    public long field_createTime;
    public int field_flag;
    public java.lang.String field_fromUserName;
    public int field_msgSeq;
    public java.lang.String field_msgSource;
    public long field_newMsgId;
    public long field_originSvrId;
    public int field_reserved1;
    public long field_reserved2;
    public java.lang.String field_reserved3;
    public java.lang.String field_reserved4;
    public java.lang.String field_toUserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241476d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241477e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241478f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241479g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241480h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241481i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241482m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241483n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241484o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241485p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241486q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241487r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241488s = true;

    static {
        p75.n0 n0Var = new p75.n0("GetSysCmdMsgInfo");
        f241469t = n0Var;
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
        f241470u = new java.lang.String[0];
        f241471v = 1718931556;
        f241472w = 1360674492;
        f241473x = 1603284672;
        f241474y = -286735215;
        f241475z = 1369213417;
        A = 951530617;
        B = -1478387972;
        C = -1065033442;
        D = 3145580;
        E = 2022955529;
        F = 2022955530;
        G = 2022955531;
        H = 2022955532;
        I = 108705909;
        f241468J = initAutoDBInfo(dm.z5.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "originSvrId";
        e0Var.f316955d.put("originSvrId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "originSvrId";
        e0Var.f316954c[1] = "newMsgId";
        e0Var.f316955d.put("newMsgId", "LONG");
        e0Var.f316954c[2] = "fromUserName";
        e0Var.f316955d.put("fromUserName", "TEXT default '' ");
        e0Var.f316954c[3] = "toUserName";
        e0Var.f316955d.put("toUserName", "TEXT default '' ");
        e0Var.f316954c[4] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[5] = "content";
        e0Var.f316955d.put("content", "TEXT default '' ");
        e0Var.f316954c[6] = "msgSource";
        e0Var.f316955d.put("msgSource", "TEXT default '' ");
        e0Var.f316954c[7] = "msgSeq";
        e0Var.f316955d.put("msgSeq", "INTEGER");
        e0Var.f316954c[8] = "flag";
        e0Var.f316955d.put("flag", "INTEGER");
        e0Var.f316954c[9] = "reserved1";
        e0Var.f316955d.put("reserved1", "INTEGER");
        e0Var.f316954c[10] = "reserved2";
        e0Var.f316955d.put("reserved2", "LONG");
        e0Var.f316954c[11] = "reserved3";
        e0Var.f316955d.put("reserved3", "TEXT default '' ");
        e0Var.f316954c[12] = "reserved4";
        e0Var.f316955d.put("reserved4", "TEXT default '' ");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " originSvrId LONG PRIMARY KEY ,  newMsgId LONG,  fromUserName TEXT default '' ,  toUserName TEXT default '' ,  createTime LONG default '0' ,  content TEXT default '' ,  msgSource TEXT default '' ,  msgSeq INTEGER,  flag INTEGER,  reserved1 INTEGER,  reserved2 LONG,  reserved3 TEXT default '' ,  reserved4 TEXT default '' ";
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
            if (f241471v == hashCode) {
                try {
                    this.field_originSvrId = cursor.getLong(i17);
                    this.f241476d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241472w == hashCode) {
                try {
                    this.field_newMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241473x == hashCode) {
                try {
                    this.field_fromUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241474y == hashCode) {
                try {
                    this.field_toUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241475z == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_msgSource = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_msgSeq = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_reserved1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_reserved2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_reserved3 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_reserved4 = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241476d) {
            contentValues.put("originSvrId", java.lang.Long.valueOf(this.field_originSvrId));
        }
        if (this.f241477e) {
            contentValues.put("newMsgId", java.lang.Long.valueOf(this.field_newMsgId));
        }
        if (this.field_fromUserName == null) {
            this.field_fromUserName = "";
        }
        if (this.f241478f) {
            contentValues.put("fromUserName", this.field_fromUserName);
        }
        if (this.field_toUserName == null) {
            this.field_toUserName = "";
        }
        if (this.f241479g) {
            contentValues.put("toUserName", this.field_toUserName);
        }
        if (this.f241480h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f241481i) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_msgSource == null) {
            this.field_msgSource = "";
        }
        if (this.f241482m) {
            contentValues.put("msgSource", this.field_msgSource);
        }
        if (this.f241483n) {
            contentValues.put("msgSeq", java.lang.Integer.valueOf(this.field_msgSeq));
        }
        if (this.f241484o) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.field_flag));
        }
        if (this.f241485p) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.field_reserved1));
        }
        if (this.f241486q) {
            contentValues.put("reserved2", java.lang.Long.valueOf(this.field_reserved2));
        }
        if (this.field_reserved3 == null) {
            this.field_reserved3 = "";
        }
        if (this.f241487r) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if (this.field_reserved4 == null) {
            this.field_reserved4 = "";
        }
        if (this.f241488s) {
            contentValues.put("reserved4", this.field_reserved4);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GetSysCmdMsgInfo ( ");
        l75.e0 e0Var = f241468J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241470u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTableSql %s", str2);
            k0Var.A("GetSysCmdMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GetSysCmdMsgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "updateTableSql %s", str3);
            k0Var.A("GetSysCmdMsgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241468J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_originSvrId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241469t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241469t.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "originSvrId", java.lang.Long.valueOf(this.field_originSvrId));
            n51.f.b(jSONObject, "newMsgId", java.lang.Long.valueOf(this.field_newMsgId));
            n51.f.b(jSONObject, "fromUserName", this.field_fromUserName);
            n51.f.b(jSONObject, "toUserName", this.field_toUserName);
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.field_createTime));
            n51.f.b(jSONObject, "content", this.field_content);
            n51.f.b(jSONObject, "msgSource", this.field_msgSource);
            n51.f.b(jSONObject, "msgSeq", java.lang.Integer.valueOf(this.field_msgSeq));
            n51.f.b(jSONObject, "flag", java.lang.Integer.valueOf(this.field_flag));
            n51.f.b(jSONObject, "reserved1", java.lang.Integer.valueOf(this.field_reserved1));
            n51.f.b(jSONObject, "reserved2", java.lang.Long.valueOf(this.field_reserved2));
            n51.f.b(jSONObject, "reserved3", this.field_reserved3);
            n51.f.b(jSONObject, "reserved4", this.field_reserved4);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("originSvrId")) {
            this.field_originSvrId = contentValues.getAsLong("originSvrId").longValue();
            if (z17) {
                this.f241476d = true;
            }
        }
        if (contentValues.containsKey("newMsgId")) {
            this.field_newMsgId = contentValues.getAsLong("newMsgId").longValue();
            if (z17) {
                this.f241477e = true;
            }
        }
        if (contentValues.containsKey("fromUserName")) {
            this.field_fromUserName = contentValues.getAsString("fromUserName");
            if (z17) {
                this.f241478f = true;
            }
        }
        if (contentValues.containsKey("toUserName")) {
            this.field_toUserName = contentValues.getAsString("toUserName");
            if (z17) {
                this.f241479g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f241480h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f241481i = true;
            }
        }
        if (contentValues.containsKey("msgSource")) {
            this.field_msgSource = contentValues.getAsString("msgSource");
            if (z17) {
                this.f241482m = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.field_msgSeq = contentValues.getAsInteger("msgSeq").intValue();
            if (z17) {
                this.f241483n = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f241484o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z17) {
                this.f241485p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsLong("reserved2").longValue();
            if (z17) {
                this.f241486q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsString("reserved3");
            if (z17) {
                this.f241487r = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.field_reserved4 = contentValues.getAsString("reserved4");
            if (z17) {
                this.f241488s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
