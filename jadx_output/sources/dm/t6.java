package dm;

/* loaded from: classes4.dex */
public class t6 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240120f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240121g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240122h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240123i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240124m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240125n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240126o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240127d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240128e = true;
    public long field_liftTime;
    public int field_logId;

    static {
        p75.n0 n0Var = new p75.n0("JsLogBlockList");
        f240120f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240121g = new java.lang.String[0];
        f240122h = 103148415;
        f240123i = 973469816;
        f240124m = 108705909;
        f240125n = initAutoDBInfo(dm.t6.class);
        f240126o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "logId";
        e0Var.f316955d.put("logId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "logId";
        e0Var.f316954c[1] = "liftTime";
        e0Var.f316955d.put("liftTime", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " logId INTEGER PRIMARY KEY ,  liftTime LONG";
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
            if (f240122h == hashCode) {
                try {
                    this.field_logId = cursor.getInt(i17);
                    this.f240127d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseJsLogBlockList", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240123i == hashCode) {
                try {
                    this.field_liftTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseJsLogBlockList", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240124m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240127d) {
            contentValues.put("logId", java.lang.Integer.valueOf(this.field_logId));
        }
        if (this.f240128e) {
            contentValues.put("liftTime", java.lang.Long.valueOf(this.field_liftTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseJsLogBlockList", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS JsLogBlockList ( ");
        l75.e0 e0Var = f240125n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240121g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "createTableSql %s", str2);
            k0Var.A("JsLogBlockList", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "JsLogBlockList", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "updateTableSql %s", str3);
            k0Var.A("JsLogBlockList", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240125n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240126o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_logId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240120f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240120f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("logId")) {
            this.field_logId = contentValues.getAsInteger("logId").intValue();
            if (z17) {
                this.f240127d = true;
            }
        }
        if (contentValues.containsKey("liftTime")) {
            this.field_liftTime = contentValues.getAsLong("liftTime").longValue();
            if (z17) {
                this.f240128e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
