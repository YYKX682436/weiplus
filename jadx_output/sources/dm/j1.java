package dm;

/* loaded from: classes4.dex */
public class j1 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237730h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237731i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237732m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237733n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237734o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237735p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237736q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237737r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237738s;
    public java.lang.String field_exposeId;
    public long field_exposeTime;
    public int field_exposeType;
    public long field_msgId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237739d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237740e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237741f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237742g = true;

    static {
        p75.n0 n0Var = new p75.n0("BizRecExposeInfo");
        f237730h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237731i = new java.lang.String[0];
        f237732m = -1926022145;
        f237733n = 104191100;
        f237734o = 223959217;
        f237735p = 223974686;
        f237736q = 108705909;
        f237737r = initAutoDBInfo(dm.j1.class);
        f237738s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "exposeId";
        e0Var.f316955d.put("exposeId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "exposeId";
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[2] = "exposeTime";
        e0Var.f316955d.put("exposeTime", "LONG");
        e0Var.f316954c[3] = "exposeType";
        e0Var.f316955d.put("exposeType", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " exposeId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG,  exposeType INTEGER";
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
            if (f237732m == hashCode) {
                try {
                    this.field_exposeId = cursor.getString(i17);
                    this.f237739d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237733n == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237734o == hashCode) {
                try {
                    this.field_exposeTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237735p == hashCode) {
                try {
                    this.field_exposeType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizRecExposeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237736q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237739d) {
            contentValues.put("exposeId", this.field_exposeId);
        }
        if (this.f237740e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f237741f) {
            contentValues.put("exposeTime", java.lang.Long.valueOf(this.field_exposeTime));
        }
        if (this.f237742g) {
            contentValues.put("exposeType", java.lang.Integer.valueOf(this.field_exposeType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizRecExposeInfo ( ");
        l75.e0 e0Var = f237737r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237731i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTableSql %s", str2);
            k0Var.A("BizRecExposeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizRecExposeInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "updateTableSql %s", str3);
            k0Var.A("BizRecExposeInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237737r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237738s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_exposeId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237730h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237730h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("exposeId")) {
            this.field_exposeId = contentValues.getAsString("exposeId");
            if (z17) {
                this.f237739d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f237740e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.field_exposeTime = contentValues.getAsLong("exposeTime").longValue();
            if (z17) {
                this.f237741f = true;
            }
        }
        if (contentValues.containsKey("exposeType")) {
            this.field_exposeType = contentValues.getAsInteger("exposeType").intValue();
            if (z17) {
                this.f237742g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
