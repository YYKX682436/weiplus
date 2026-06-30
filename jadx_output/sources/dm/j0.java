package dm;

/* loaded from: classes4.dex */
public class j0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237719g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f237720h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237721i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237722m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237723n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237724o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237725p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237726q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237727d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237728e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237729f = true;
    public java.lang.String field_appId;
    public java.lang.String field_versionMd5;
    public int field_versionType;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandTestCodeVersionMarkTable");
        f237719g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237720h = new java.lang.String[0];
        f237721i = 93028124;
        f237722m = 689108018;
        f237723n = -670514810;
        f237724o = 108705909;
        f237725p = initAutoDBInfo(dm.j0.class);
        f237726q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[2] = "versionMd5";
        e0Var.f316955d.put("versionMd5", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT,  versionType INTEGER,  versionMd5 TEXT";
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
            if (f237721i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237722m == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237723n == hashCode) {
                try {
                    this.field_versionMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237724o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237727d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237728e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f237729f) {
            contentValues.put("versionMd5", this.field_versionMd5);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandTestCodeVersionMarkTable ( ");
        l75.e0 e0Var = f237725p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237720h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandTestCodeVersionMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandTestCodeVersionMarkTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandTestCodeVersionMarkTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237725p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237726q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237719g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237719g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237727d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f237728e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.field_versionMd5 = contentValues.getAsString("versionMd5");
            if (z17) {
                this.f237729f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
