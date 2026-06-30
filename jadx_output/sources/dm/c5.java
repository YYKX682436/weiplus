package dm;

/* loaded from: classes4.dex */
public class c5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f236121f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f236122g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f236123h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236124i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236125m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f236126n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f236127o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236128d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236129e = true;
    public long field_shareTime;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("FinderShareInfo");
        f236121f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236122g = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_ShareInfo_username ON FinderShareInfo(username)"};
        f236123h = -265713450;
        f236124i = -1582035124;
        f236125m = 108705909;
        f236126n = initAutoDBInfo(dm.c5.class);
        f236127o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[1] = "shareTime";
        e0Var.f316955d.put("shareTime", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " username TEXT,  shareTime LONG";
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
            if (f236123h == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderShareInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236124i == hashCode) {
                try {
                    this.field_shareTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderShareInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236125m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236128d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236129e) {
            contentValues.put("shareTime", java.lang.Long.valueOf(this.field_shareTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderShareInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderShareInfo ( ");
        l75.e0 e0Var = f236126n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236122g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderShareInfo", "createTableSql %s", str2);
            k0Var.A("FinderShareInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderShareInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderShareInfo", "updateTableSql %s", str3);
            k0Var.A("FinderShareInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderShareInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236126n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236127o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236121f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236121f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236128d = true;
            }
        }
        if (contentValues.containsKey("shareTime")) {
            this.field_shareTime = contentValues.getAsLong("shareTime").longValue();
            if (z17) {
                this.f236129e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
