package dm;

/* loaded from: classes4.dex */
public class d3 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f236329f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f236330g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f236331h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236332i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236333m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f236334n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f236335o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236336d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236337e = true;
    public int field_exptId;
    public java.lang.String field_exptKey;

    static {
        p75.n0 n0Var = new p75.n0("ExptKeyMapId");
        f236329f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236330g = new java.lang.String[0];
        f236331h = -1308945176;
        f236332i = -1289150094;
        f236333m = 108705909;
        f236334n = initAutoDBInfo(dm.d3.class);
        f236335o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "exptKey";
        e0Var.f316955d.put("exptKey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "exptKey";
        e0Var.f316954c[1] = "exptId";
        e0Var.f316955d.put("exptId", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " exptKey TEXT PRIMARY KEY ,  exptId INTEGER";
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
            if (f236331h == hashCode) {
                try {
                    this.field_exptKey = cursor.getString(i17);
                    this.f236336d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptKeyMapId", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236332i == hashCode) {
                try {
                    this.field_exptId = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptKeyMapId", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236333m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236336d) {
            contentValues.put("exptKey", this.field_exptKey);
        }
        if (this.f236337e) {
            contentValues.put("exptId", java.lang.Integer.valueOf(this.field_exptId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseExptKeyMapId", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ExptKeyMapId ( ");
        l75.e0 e0Var = f236334n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236330g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptKeyMapId", "createTableSql %s", str2);
            k0Var.A("ExptKeyMapId", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ExptKeyMapId", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptKeyMapId", "updateTableSql %s", str3);
            k0Var.A("ExptKeyMapId", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptKeyMapId", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236334n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236335o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_exptKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236329f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236329f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("exptKey")) {
            this.field_exptKey = contentValues.getAsString("exptKey");
            if (z17) {
                this.f236336d = true;
            }
        }
        if (contentValues.containsKey("exptId")) {
            this.field_exptId = contentValues.getAsInteger("exptId").intValue();
            if (z17) {
                this.f236337e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
