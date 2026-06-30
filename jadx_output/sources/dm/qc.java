package dm;

/* loaded from: classes4.dex */
public class qc extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239507f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239508g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239509h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239510i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239511m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239512n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239513o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239514d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239515e = true;
    public long field_time;
    public java.lang.String field_weSeeUri;

    static {
        p75.n0 n0Var = new p75.n0("WeseeProviderInfo");
        f239507f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239508g = new java.lang.String[0];
        f239509h = -1142819705;
        f239510i = 3560141;
        f239511m = 108705909;
        f239512n = initAutoDBInfo(dm.qc.class);
        f239513o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "weSeeUri";
        e0Var.f316955d.put("weSeeUri", "TEXT");
        e0Var.f316954c[1] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " weSeeUri TEXT,  time LONG";
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
            if (f239509h == hashCode) {
                try {
                    this.field_weSeeUri = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWeseeProviderInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239510i == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWeseeProviderInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239511m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239514d) {
            contentValues.put("weSeeUri", this.field_weSeeUri);
        }
        if (this.f239515e) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWeseeProviderInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WeseeProviderInfo ( ");
        l75.e0 e0Var = f239512n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239508g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWeseeProviderInfo", "createTableSql %s", str2);
            k0Var.A("WeseeProviderInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WeseeProviderInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWeseeProviderInfo", "updateTableSql %s", str3);
            k0Var.A("WeseeProviderInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWeseeProviderInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239512n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239513o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239507f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239507f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("weSeeUri")) {
            this.field_weSeeUri = contentValues.getAsString("weSeeUri");
            if (z17) {
                this.f239514d = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f239515e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
