package dm;

/* loaded from: classes4.dex */
public class ia extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237658f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.d f237659g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f237660h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237661i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237662m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237663n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237664o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237665p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237666q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237667d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237668e = true;
    public int field_showType;
    public long field_snsId;

    static {
        p75.n0 n0Var = new p75.n0("ShowTeachSnsInfo");
        f237658f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237659g = new p75.d("snsId", "long", tableName, "");
        f237660h = new p75.d("showType", "int", tableName, "");
        f237661i = new java.lang.String[0];
        f237662m = 109594803;
        f237663n = -338815017;
        f237664o = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "snsId";
        ((java.util.HashMap) e0Var.f316955d).put("snsId", "LONG");
        e0Var.f316954c[1] = "showType";
        ((java.util.HashMap) e0Var.f316955d).put("showType", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " snsId LONG,  showType INTEGER";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f237665p = e0Var;
        f237666q = new o75.e();
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
            if (f237662m == hashCode) {
                try {
                    this.field_snsId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShowTeachSnsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237663n == hashCode) {
                try {
                    this.field_showType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShowTeachSnsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237664o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237667d) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.field_snsId));
        }
        if (this.f237668e) {
            contentValues.put("showType", java.lang.Integer.valueOf(this.field_showType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShowTeachSnsInfo ( ");
        l75.e0 e0Var = f237665p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237661i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTableSql %s", str2);
            k0Var.A("ShowTeachSnsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShowTeachSnsInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "updateTableSql %s", str3);
            k0Var.A("ShowTeachSnsInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237665p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237666q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237658f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237658f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.f237667d = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.field_showType = contentValues.getAsInteger("showType").intValue();
            if (z17) {
                this.f237668e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
