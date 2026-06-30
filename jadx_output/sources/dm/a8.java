package dm;

/* loaded from: classes4.dex */
public class a8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f235663h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f235664i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235665m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235666n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235667o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235668p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235669q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f235670r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f235671s;
    public java.lang.String field_bizName;
    public int field_frameSetHeight;
    public java.lang.String field_frameSetName;
    public java.lang.String field_frameSetRootPath;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235672d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235673e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235674f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235675g = true;

    static {
        p75.n0 n0Var = new p75.n0("MagicSclFrameSetInfo");
        f235663h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235664i = new java.lang.String[0];
        f235665m = -97801666;
        f235666n = -453798944;
        f235667o = 1817684284;
        f235668p = -540705028;
        f235669q = 108705909;
        f235670r = initAutoDBInfo(dm.a8.class);
        f235671s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "bizName";
        e0Var.f316955d.put("bizName", "TEXT");
        e0Var.f316954c[1] = "frameSetName";
        e0Var.f316955d.put("frameSetName", "TEXT");
        e0Var.f316954c[2] = "frameSetHeight";
        e0Var.f316955d.put("frameSetHeight", "INTEGER");
        e0Var.f316954c[3] = "frameSetRootPath";
        e0Var.f316955d.put("frameSetRootPath", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " bizName TEXT,  frameSetName TEXT,  frameSetHeight INTEGER,  frameSetRootPath TEXT";
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
            if (f235665m == hashCode) {
                try {
                    this.field_bizName = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235666n == hashCode) {
                try {
                    this.field_frameSetName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235667o == hashCode) {
                try {
                    this.field_frameSetHeight = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235668p == hashCode) {
                try {
                    this.field_frameSetRootPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235669q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235672d) {
            contentValues.put("bizName", this.field_bizName);
        }
        if (this.f235673e) {
            contentValues.put("frameSetName", this.field_frameSetName);
        }
        if (this.f235674f) {
            contentValues.put("frameSetHeight", java.lang.Integer.valueOf(this.field_frameSetHeight));
        }
        if (this.f235675g) {
            contentValues.put("frameSetRootPath", this.field_frameSetRootPath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MagicSclFrameSetInfo ( ");
        l75.e0 e0Var = f235670r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235664i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTableSql %s", str2);
            k0Var.A("MagicSclFrameSetInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MagicSclFrameSetInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "updateTableSql %s", str3);
            k0Var.A("MagicSclFrameSetInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235670r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235671s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235663h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235663h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizName")) {
            this.field_bizName = contentValues.getAsString("bizName");
            if (z17) {
                this.f235672d = true;
            }
        }
        if (contentValues.containsKey("frameSetName")) {
            this.field_frameSetName = contentValues.getAsString("frameSetName");
            if (z17) {
                this.f235673e = true;
            }
        }
        if (contentValues.containsKey("frameSetHeight")) {
            this.field_frameSetHeight = contentValues.getAsInteger("frameSetHeight").intValue();
            if (z17) {
                this.f235674f = true;
            }
        }
        if (contentValues.containsKey("frameSetRootPath")) {
            this.field_frameSetRootPath = contentValues.getAsString("frameSetRootPath");
            if (z17) {
                this.f235675g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
