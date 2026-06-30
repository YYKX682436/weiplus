package dm;

/* loaded from: classes4.dex */
public class f6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f236846g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f236847h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236848i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236849m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236850n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236851o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f236852p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f236853q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236854d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236855e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236856f = true;
    public java.lang.String field_championMotto;
    public java.lang.String field_championUrl;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceChampionInfo");
        f236846g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236847h = new java.lang.String[0];
        f236848i = -265713450;
        f236849m = 424379462;
        f236850n = -200696284;
        f236851o = 108705909;
        f236852p = initAutoDBInfo(dm.f6.class);
        f236853q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[1] = "championUrl";
        e0Var.f316955d.put("championUrl", "TEXT");
        e0Var.f316954c[2] = "championMotto";
        e0Var.f316955d.put("championMotto", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " username TEXT,  championUrl TEXT,  championMotto TEXT";
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
            if (f236848i == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236849m == hashCode) {
                try {
                    this.field_championUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236850n == hashCode) {
                try {
                    this.field_championMotto = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceChampionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236851o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236854d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236855e) {
            contentValues.put("championUrl", this.field_championUrl);
        }
        if (this.f236856f) {
            contentValues.put("championMotto", this.field_championMotto);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceChampionInfo ( ");
        l75.e0 e0Var = f236852p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236847h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceChampionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceChampionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceChampionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236852p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236853q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236846g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236846g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236854d = true;
            }
        }
        if (contentValues.containsKey("championUrl")) {
            this.field_championUrl = contentValues.getAsString("championUrl");
            if (z17) {
                this.f236855e = true;
            }
        }
        if (contentValues.containsKey("championMotto")) {
            this.field_championMotto = contentValues.getAsString("championMotto");
            if (z17) {
                this.f236856f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
