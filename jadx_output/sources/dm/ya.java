package dm;

/* loaded from: classes4.dex */
public class ya extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f241255h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f241256i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241257m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241258n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241259o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241260p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241261q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f241262r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f241263s;
    public long field_bottom;
    public int field_size;
    public int field_state;
    public long field_top;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241264d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241265e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241266f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241267g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsWsFoldGroup");
        f241255h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241256i = new java.lang.String[0];
        f241257m = 115029;
        f241258n = -1383228885;
        f241259o = 3530753;
        f241260p = 109757585;
        f241261q = 108705909;
        f241262r = initAutoDBInfo(dm.ya.class);
        f241263s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "top";
        e0Var.f316955d.put("top", "LONG");
        e0Var.f316954c[1] = "bottom";
        e0Var.f316955d.put("bottom", "LONG PRIMARY KEY ");
        e0Var.f316953b = "bottom";
        e0Var.f316954c[2] = "size";
        e0Var.f316955d.put("size", "INTEGER");
        e0Var.f316954c[3] = "state";
        e0Var.f316955d.put("state", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " top LONG,  bottom LONG PRIMARY KEY ,  size INTEGER,  state INTEGER";
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
            if (f241257m == hashCode) {
                try {
                    this.field_top = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241258n == hashCode) {
                try {
                    this.field_bottom = cursor.getLong(i17);
                    this.f241265e = true;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241259o == hashCode) {
                try {
                    this.field_size = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241260p == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroup", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241261q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241264d) {
            contentValues.put("top", java.lang.Long.valueOf(this.field_top));
        }
        if (this.f241265e) {
            contentValues.put("bottom", java.lang.Long.valueOf(this.field_bottom));
        }
        if (this.f241266f) {
            contentValues.put("size", java.lang.Integer.valueOf(this.field_size));
        }
        if (this.f241267g) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsWsFoldGroup ( ");
        l75.e0 e0Var = f241262r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241256i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTableSql %s", str2);
            k0Var.A("SnsWsFoldGroup", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsWsFoldGroup", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "updateTableSql %s", str3);
            k0Var.A("SnsWsFoldGroup", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241262r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241263s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_bottom);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241255h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241255h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("top")) {
            this.field_top = contentValues.getAsLong("top").longValue();
            if (z17) {
                this.f241264d = true;
            }
        }
        if (contentValues.containsKey("bottom")) {
            this.field_bottom = contentValues.getAsLong("bottom").longValue();
            if (z17) {
                this.f241265e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f241266f = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f241267g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
