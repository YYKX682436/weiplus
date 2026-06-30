package dm;

/* loaded from: classes4.dex */
public class f extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236744h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236745i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236746m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236747n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236748o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236749p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236750q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236751r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236752s;
    public int field_dau;
    public int field_key;
    public int field_mau;
    public long field_useTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236753d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236754e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236755f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236756g = true;

    static {
        p75.n0 n0Var = new p75.n0("ActiveInfo");
        f236744h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236745i = new java.lang.String[0];
        f236746m = 106079;
        f236747n = 107873;
        f236748o = 99224;
        f236749p = -148016908;
        f236750q = 108705909;
        f236751r = initAutoDBInfo(dm.f.class);
        f236752s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "INTEGER PRIMARY KEY  COLLATE NOCASE ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "mau";
        e0Var.f316955d.put("mau", "INTEGER");
        e0Var.f316954c[2] = "dau";
        e0Var.f316955d.put("dau", "INTEGER");
        e0Var.f316954c[3] = "useTime";
        e0Var.f316955d.put("useTime", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key INTEGER PRIMARY KEY  COLLATE NOCASE ,  mau INTEGER,  dau INTEGER,  useTime LONG";
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
            if (f236746m == hashCode) {
                try {
                    this.field_key = cursor.getInt(i17);
                    this.f236753d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236747n == hashCode) {
                try {
                    this.field_mau = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236748o == hashCode) {
                try {
                    this.field_dau = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236749p == hashCode) {
                try {
                    this.field_useTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseActiveInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236750q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236753d) {
            contentValues.put("key", java.lang.Integer.valueOf(this.field_key));
        }
        if (this.f236754e) {
            contentValues.put("mau", java.lang.Integer.valueOf(this.field_mau));
        }
        if (this.f236755f) {
            contentValues.put("dau", java.lang.Integer.valueOf(this.field_dau));
        }
        if (this.f236756g) {
            contentValues.put("useTime", java.lang.Long.valueOf(this.field_useTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseActiveInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ActiveInfo ( ");
        l75.e0 e0Var = f236751r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236745i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseActiveInfo", "createTableSql %s", str2);
            k0Var.A("ActiveInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ActiveInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseActiveInfo", "updateTableSql %s", str3);
            k0Var.A("ActiveInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseActiveInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236751r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236752s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_key);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236744h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236744h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsInteger("key").intValue();
            if (z17) {
                this.f236753d = true;
            }
        }
        if (contentValues.containsKey("mau")) {
            this.field_mau = contentValues.getAsInteger("mau").intValue();
            if (z17) {
                this.f236754e = true;
            }
        }
        if (contentValues.containsKey("dau")) {
            this.field_dau = contentValues.getAsInteger("dau").intValue();
            if (z17) {
                this.f236755f = true;
            }
        }
        if (contentValues.containsKey("useTime")) {
            this.field_useTime = contentValues.getAsLong("useTime").longValue();
            if (z17) {
                this.f236756g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
