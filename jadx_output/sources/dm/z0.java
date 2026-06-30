package dm;

/* loaded from: classes4.dex */
public class z0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241357f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241358g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241359h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241360i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241361m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241362n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241363o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241364d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241365e = true;
    public java.lang.String field_brandUserName;
    public java.lang.String field_userId;

    static {
        p75.n0 n0Var = new p75.n0("BizChatMyUserInfo");
        f241357f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241358g = new java.lang.String[0];
        f241359h = -64277091;
        f241360i = -836030906;
        f241361m = 108705909;
        f241362n = initAutoDBInfo(dm.z0.class);
        f241363o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "brandUserName";
        e0Var.f316955d.put("brandUserName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "brandUserName";
        e0Var.f316954c[1] = "userId";
        e0Var.f316955d.put("userId", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " brandUserName TEXT PRIMARY KEY ,  userId TEXT";
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
            if (f241359h == hashCode) {
                try {
                    this.field_brandUserName = cursor.getString(i17);
                    this.f241364d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatMyUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241360i == hashCode) {
                try {
                    this.field_userId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatMyUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241361m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241364d) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f241365e) {
            contentValues.put("userId", this.field_userId);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatMyUserInfo ( ");
        l75.e0 e0Var = f241362n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241358g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTableSql %s", str2);
            k0Var.A("BizChatMyUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizChatMyUserInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "updateTableSql %s", str3);
            k0Var.A("BizChatMyUserInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241362n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241363o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_brandUserName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241357f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241357f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f241364d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z17) {
                this.f241365e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
