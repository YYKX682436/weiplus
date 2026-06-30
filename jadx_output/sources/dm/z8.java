package dm;

/* loaded from: classes4.dex */
public class z8 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f241510g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f241511h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241512i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241513m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241514n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241515o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f241516p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f241517q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241518d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241519e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241520f = true;
    public java.lang.String field_isRead;
    public java.lang.String field_msgContentXml;
    public java.lang.String field_msgId;

    static {
        p75.n0 n0Var = new p75.n0("OrderCommonMsgXml");
        f241510g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241511h = new java.lang.String[0];
        f241512i = 104191100;
        f241513m = 1899068223;
        f241514n = -1180158496;
        f241515o = 108705909;
        f241516p = initAutoDBInfo(dm.z8.class);
        f241517q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "msgContentXml";
        e0Var.f316955d.put("msgContentXml", "TEXT");
        e0Var.f316954c[2] = "isRead";
        e0Var.f316955d.put("isRead", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " msgId TEXT PRIMARY KEY ,  msgContentXml TEXT,  isRead TEXT";
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
            if (f241512i == hashCode) {
                try {
                    this.field_msgId = cursor.getString(i17);
                    this.f241518d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241513m == hashCode) {
                try {
                    this.field_msgContentXml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241514n == hashCode) {
                try {
                    this.field_isRead = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOrderCommonMsgXml", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241515o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241518d) {
            contentValues.put("msgId", this.field_msgId);
        }
        if (this.f241519e) {
            contentValues.put("msgContentXml", this.field_msgContentXml);
        }
        if (this.f241520f) {
            contentValues.put("isRead", this.field_isRead);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OrderCommonMsgXml ( ");
        l75.e0 e0Var = f241516p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241511h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTableSql %s", str2);
            k0Var.A("OrderCommonMsgXml", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OrderCommonMsgXml", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "updateTableSql %s", str3);
            k0Var.A("OrderCommonMsgXml", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241516p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241517q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_msgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241510g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241510g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsString("msgId");
            if (z17) {
                this.f241518d = true;
            }
        }
        if (contentValues.containsKey("msgContentXml")) {
            this.field_msgContentXml = contentValues.getAsString("msgContentXml");
            if (z17) {
                this.f241519e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsString("isRead");
            if (z17) {
                this.f241520f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
