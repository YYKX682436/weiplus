package dm;

/* loaded from: classes4.dex */
public class h9 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237425h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237426i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237427m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237428n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237429o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237430p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237431q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237432r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237433s;
    public java.lang.String field_appId;
    public int field_hit;
    public long field_hitTimeMS;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237434d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237435e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237436f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237437g = true;

    static {
        p75.n0 n0Var = new p75.n0("PkgUsageLRURecord");
        f237425h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237426i = new java.lang.String[0];
        f237427m = 93028124;
        f237428n = 3575610;
        f237429o = 103315;
        f237430p = 1691165350;
        f237431q = 108705909;
        f237432r = initAutoDBInfo(dm.h9.class);
        f237433s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[2] = "hit";
        e0Var.f316955d.put("hit", "INTEGER");
        e0Var.f316954c[3] = "hitTimeMS";
        e0Var.f316955d.put("hitTimeMS", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " appId TEXT,  type INTEGER,  hit INTEGER,  hitTimeMS LONG";
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
            if (f237427m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237428n == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237429o == hashCode) {
                try {
                    this.field_hit = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237430p == hashCode) {
                try {
                    this.field_hitTimeMS = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUsageLRURecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237431q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237434d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237435e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f237436f) {
            contentValues.put("hit", java.lang.Integer.valueOf(this.field_hit));
        }
        if (this.f237437g) {
            contentValues.put("hitTimeMS", java.lang.Long.valueOf(this.field_hitTimeMS));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PkgUsageLRURecord ( ");
        l75.e0 e0Var = f237432r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237426i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTableSql %s", str2);
            k0Var.A("PkgUsageLRURecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PkgUsageLRURecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "updateTableSql %s", str3);
            k0Var.A("PkgUsageLRURecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237432r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237433s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237425h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237425h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237434d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f237435e = true;
            }
        }
        if (contentValues.containsKey("hit")) {
            this.field_hit = contentValues.getAsInteger("hit").intValue();
            if (z17) {
                this.f237436f = true;
            }
        }
        if (contentValues.containsKey("hitTimeMS")) {
            this.field_hitTimeMS = contentValues.getAsLong("hitTimeMS").longValue();
            if (z17) {
                this.f237437g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
