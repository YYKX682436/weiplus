package dm;

/* loaded from: classes4.dex */
public class n4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f238670f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f238671g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f238672h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238673i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238674m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f238675n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f238676o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238677d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238678e = true;
    public java.lang.String field_dislikeBannerId;
    public long field_timestamp;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveDislikeBannerRecord");
        f238670f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238671g = new java.lang.String[0];
        f238672h = 1647778220;
        f238673i = 55126294;
        f238674m = 108705909;
        f238675n = initAutoDBInfo(dm.n4.class);
        f238676o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "dislikeBannerId";
        e0Var.f316955d.put("dislikeBannerId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "dislikeBannerId";
        e0Var.f316954c[1] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " dislikeBannerId TEXT PRIMARY KEY ,  timestamp LONG";
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
            if (f238672h == hashCode) {
                try {
                    this.field_dislikeBannerId = cursor.getString(i17);
                    this.f238677d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238673i == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238674m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238677d) {
            contentValues.put("dislikeBannerId", this.field_dislikeBannerId);
        }
        if (this.f238678e) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveDislikeBannerRecord ( ");
        l75.e0 e0Var = f238675n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238671g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTableSql %s", str2);
            k0Var.A("FinderLiveDislikeBannerRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveDislikeBannerRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "updateTableSql %s", str3);
            k0Var.A("FinderLiveDislikeBannerRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238675n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238676o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_dislikeBannerId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238670f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238670f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dislikeBannerId")) {
            this.field_dislikeBannerId = contentValues.getAsString("dislikeBannerId");
            if (z17) {
                this.f238677d = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f238678e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
