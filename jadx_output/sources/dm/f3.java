package dm;

/* loaded from: classes11.dex */
public class f3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236806p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236807q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f236808r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f236809s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f236810t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f236811u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236812v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236813w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236814x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236815y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236816z;
    public java.lang.String field_chatroomName;
    public long field_createTime;
    public java.lang.String field_encryptTalker;
    public int field_isContactDeleted;
    public int field_isSend;
    public java.lang.String field_msgContent;
    public long field_svrId;
    public java.lang.String field_talker;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236817d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236818e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236819f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236820g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236821h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236822i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236823m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236824n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236825o = true;

    static {
        p75.n0 n0Var = new p75.n0("fmessage_msginfo");
        f236806p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236807q = new p75.d("talker", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236808r = new p75.d("type", "int", tableName, "");
        f236809s = new p75.d("createTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236810t = new p75.d("isContactDeleted", "int", tableName, "");
        f236811u = new java.lang.String[0];
        f236812v = 93053368;
        f236813w = -1180128302;
        f236814x = -881080743;
        f236815y = -650394338;
        f236816z = 109832170;
        A = 3575610;
        B = 1369213417;
        C = 723141982;
        D = -399751261;
        E = 108705909;
        F = initAutoDBInfo(dm.f3.class);
        G = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "msgContent";
        e0Var.f316955d.put("msgContent", "TEXT default '' ");
        e0Var.f316954c[1] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER default '0' ");
        e0Var.f316954c[2] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[3] = "encryptTalker";
        e0Var.f316955d.put("encryptTalker", "TEXT default '' ");
        e0Var.f316954c[4] = "svrId";
        e0Var.f316955d.put("svrId", "LONG default '0' ");
        e0Var.f316954c[5] = "type";
        e0Var.f316955d.put("type", "INTEGER default '0' ");
        e0Var.f316954c[6] = "createTime";
        e0Var.f316955d.put("createTime", "LONG default '0' ");
        e0Var.f316954c[7] = "chatroomName";
        e0Var.f316955d.put("chatroomName", "TEXT default '' ");
        e0Var.f316954c[8] = "isContactDeleted";
        e0Var.f316955d.put("isContactDeleted", "INTEGER default '0' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " msgContent TEXT default '' ,  isSend INTEGER default '0' ,  talker TEXT default '' ,  encryptTalker TEXT default '' ,  svrId LONG default '0' ,  type INTEGER default '0' ,  createTime LONG default '0' ,  chatroomName TEXT default '' ,  isContactDeleted INTEGER default '0' ";
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
            if (f236812v == hashCode) {
                try {
                    this.field_msgContent = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236813w == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236814x == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236815y == hashCode) {
                try {
                    this.field_encryptTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236816z == hashCode) {
                try {
                    this.field_svrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_chatroomName = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_isContactDeleted = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_msgContent == null) {
            this.field_msgContent = "";
        }
        if (this.f236817d) {
            contentValues.put("msgContent", this.field_msgContent);
        }
        if (this.f236818e) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f236819f) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_encryptTalker == null) {
            this.field_encryptTalker = "";
        }
        if (this.f236820g) {
            contentValues.put("encryptTalker", this.field_encryptTalker);
        }
        if (this.f236821h) {
            contentValues.put("svrId", java.lang.Long.valueOf(this.field_svrId));
        }
        if (this.f236822i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f236823m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.field_chatroomName == null) {
            this.field_chatroomName = "";
        }
        if (this.f236824n) {
            contentValues.put("chatroomName", this.field_chatroomName);
        }
        if (this.f236825o) {
            contentValues.put("isContactDeleted", java.lang.Integer.valueOf(this.field_isContactDeleted));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS fmessage_msginfo ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236811u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTableSql %s", str2);
            k0Var.A("fmessage_msginfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "fmessage_msginfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "updateTableSql %s", str3);
            k0Var.A("fmessage_msginfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return G;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236806p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236806p.f352676a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgContent", this.field_msgContent);
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.field_isSend));
            n51.f.b(jSONObject, "talker", this.field_talker);
            n51.f.b(jSONObject, "encryptTalker", this.field_encryptTalker);
            n51.f.b(jSONObject, "svrId", java.lang.Long.valueOf(this.field_svrId));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.field_createTime));
            n51.f.b(jSONObject, "chatroomName", this.field_chatroomName);
            n51.f.b(jSONObject, "isContactDeleted", java.lang.Integer.valueOf(this.field_isContactDeleted));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgContent")) {
            this.field_msgContent = contentValues.getAsString("msgContent");
            if (z17) {
                this.f236817d = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f236818e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236819f = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.field_encryptTalker = contentValues.getAsString("encryptTalker");
            if (z17) {
                this.f236820g = true;
            }
        }
        if (contentValues.containsKey("svrId")) {
            this.field_svrId = contentValues.getAsLong("svrId").longValue();
            if (z17) {
                this.f236821h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236822i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f236823m = true;
            }
        }
        if (contentValues.containsKey("chatroomName")) {
            this.field_chatroomName = contentValues.getAsString("chatroomName");
            if (z17) {
                this.f236824n = true;
            }
        }
        if (contentValues.containsKey("isContactDeleted")) {
            this.field_isContactDeleted = contentValues.getAsInteger("isContactDeleted").intValue();
            if (z17) {
                this.f236825o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
