package dm;

/* loaded from: classes7.dex */
public class e8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f236648m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f236649n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236650o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236651p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236652q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236653r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236654s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236655t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236656u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f236657v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f236658w;
    public long field_msgId;
    public long field_msgSvrId;
    public long field_quotedMsgId;
    public long field_quotedMsgSvrId;
    public java.lang.String field_quotedMsgTalker;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236659d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236660e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236661f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236662g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236663h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236664i = true;

    static {
        p75.n0 n0Var = new p75.n0("MsgQuote");
        f236648m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236649n = new java.lang.String[0];
        f236650o = 104191100;
        f236651p = -1294411543;
        f236652q = 1210381300;
        f236653r = -2066225551;
        f236654s = -892481550;
        f236655t = 380606642;
        f236656u = 108705909;
        f236657v = initAutoDBInfo(dm.e8.class);
        f236658w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[1] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[2] = "quotedMsgId";
        e0Var.f316955d.put("quotedMsgId", "LONG");
        e0Var.f316954c[3] = "quotedMsgSvrId";
        e0Var.f316955d.put("quotedMsgSvrId", "LONG");
        e0Var.f316954c[4] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[5] = "quotedMsgTalker";
        e0Var.f316955d.put("quotedMsgTalker", "TEXT");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " msgId LONG,  msgSvrId LONG,  quotedMsgId LONG,  quotedMsgSvrId LONG,  status INTEGER,  quotedMsgTalker TEXT";
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
            if (f236650o == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236651p == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236652q == hashCode) {
                try {
                    this.field_quotedMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236653r == hashCode) {
                try {
                    this.field_quotedMsgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236654s == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236655t == hashCode) {
                try {
                    this.field_quotedMsgTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQuote", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236656u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236659d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f236660e) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f236661f) {
            contentValues.put("quotedMsgId", java.lang.Long.valueOf(this.field_quotedMsgId));
        }
        if (this.f236662g) {
            contentValues.put("quotedMsgSvrId", java.lang.Long.valueOf(this.field_quotedMsgSvrId));
        }
        if (this.f236663h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f236664i) {
            contentValues.put("quotedMsgTalker", this.field_quotedMsgTalker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgQuote", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MsgQuote ( ");
        l75.e0 e0Var = f236657v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236649n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQuote", "createTableSql %s", str2);
            k0Var.A("MsgQuote", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MsgQuote", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQuote", "updateTableSql %s", str3);
            k0Var.A("MsgQuote", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQuote", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236657v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236658w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236648m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236648m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f236659d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f236660e = true;
            }
        }
        if (contentValues.containsKey("quotedMsgId")) {
            this.field_quotedMsgId = contentValues.getAsLong("quotedMsgId").longValue();
            if (z17) {
                this.f236661f = true;
            }
        }
        if (contentValues.containsKey("quotedMsgSvrId")) {
            this.field_quotedMsgSvrId = contentValues.getAsLong("quotedMsgSvrId").longValue();
            if (z17) {
                this.f236662g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f236663h = true;
            }
        }
        if (contentValues.containsKey("quotedMsgTalker")) {
            this.field_quotedMsgTalker = contentValues.getAsString("quotedMsgTalker");
            if (z17) {
                this.f236664i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
