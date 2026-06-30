package dm;

/* loaded from: classes4.dex */
public class w0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240708f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240709g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240710h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240711i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240712m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240713n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240714o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240715d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240716e = true;
    public java.lang.String field_bizUsername;
    public java.lang.String field_finderUsername;

    static {
        p75.n0 n0Var = new p75.n0("BizBlockFinderInfo");
        f240708f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240709g = new java.lang.String[0];
        f240710h = -833837303;
        f240711i = -1522671844;
        f240712m = 108705909;
        f240713n = initAutoDBInfo(dm.w0.class);
        f240714o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "bizUsername";
        e0Var.f316955d.put("bizUsername", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "bizUsername";
        e0Var.f316954c[1] = "finderUsername";
        e0Var.f316955d.put("finderUsername", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " bizUsername TEXT PRIMARY KEY ,  finderUsername TEXT";
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
            if (f240710h == hashCode) {
                try {
                    this.field_bizUsername = cursor.getString(i17);
                    this.f240715d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizBlockFinderInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240711i == hashCode) {
                try {
                    this.field_finderUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizBlockFinderInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240712m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240715d) {
            contentValues.put("bizUsername", this.field_bizUsername);
        }
        if (this.f240716e) {
            contentValues.put("finderUsername", this.field_finderUsername);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizBlockFinderInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizBlockFinderInfo ( ");
        l75.e0 e0Var = f240713n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240709g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizBlockFinderInfo", "createTableSql %s", str2);
            k0Var.A("BizBlockFinderInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizBlockFinderInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizBlockFinderInfo", "updateTableSql %s", str3);
            k0Var.A("BizBlockFinderInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizBlockFinderInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240713n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240714o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_bizUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240708f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240708f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizUsername")) {
            this.field_bizUsername = contentValues.getAsString("bizUsername");
            if (z17) {
                this.f240715d = true;
            }
        }
        if (contentValues.containsKey("finderUsername")) {
            this.field_finderUsername = contentValues.getAsString("finderUsername");
            if (z17) {
                this.f240716e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
