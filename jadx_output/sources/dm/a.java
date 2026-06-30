package dm;

/* loaded from: classes4.dex */
public class a extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f235511h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f235512i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235513m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235514n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235515o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235516p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235517q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f235518r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f235519s;
    public java.lang.String field_chatroom;
    public boolean field_insertmsg;
    public long field_msgId;
    public java.lang.String field_payMsgId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235520d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235521e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235522f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235523g = true;

    static {
        p75.n0 n0Var = new p75.n0("AAPayRecord");
        f235511h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235512i = new java.lang.String[0];
        f235513m = 1353538740;
        f235514n = -384451032;
        f235515o = 1438296115;
        f235516p = 104191100;
        f235517q = 108705909;
        f235518r = initAutoDBInfo(dm.a.class);
        f235519s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "payMsgId";
        e0Var.f316955d.put("payMsgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "payMsgId";
        e0Var.f316954c[1] = "insertmsg";
        e0Var.f316955d.put("insertmsg", "INTEGER");
        e0Var.f316954c[2] = "chatroom";
        e0Var.f316955d.put("chatroom", "TEXT");
        e0Var.f316954c[3] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " payMsgId TEXT PRIMARY KEY ,  insertmsg INTEGER,  chatroom TEXT,  msgId LONG";
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
            if (f235513m == hashCode) {
                try {
                    this.field_payMsgId = cursor.getString(i17);
                    this.f235520d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235514n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_insertmsg = z17;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235515o == hashCode) {
                try {
                    this.field_chatroom = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235516p == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235517q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235520d) {
            contentValues.put("payMsgId", this.field_payMsgId);
        }
        if (this.f235521e) {
            if (this.field_insertmsg) {
                contentValues.put("insertmsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("insertmsg", (java.lang.Integer) 0);
            }
        }
        if (this.f235522f) {
            contentValues.put("chatroom", this.field_chatroom);
        }
        if (this.f235523g) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAAPayRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AAPayRecord ( ");
        l75.e0 e0Var = f235518r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235512i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAAPayRecord", "createTableSql %s", str2);
            k0Var.A("AAPayRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AAPayRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAAPayRecord", "updateTableSql %s", str3);
            k0Var.A("AAPayRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAAPayRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235518r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235519s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_payMsgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235511h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235511h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("payMsgId")) {
            this.field_payMsgId = contentValues.getAsString("payMsgId");
            if (z17) {
                this.f235520d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.field_insertmsg = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z17) {
                this.f235521e = true;
            }
        }
        if (contentValues.containsKey("chatroom")) {
            this.field_chatroom = contentValues.getAsString("chatroom");
            if (z17) {
                this.f235522f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f235523g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
