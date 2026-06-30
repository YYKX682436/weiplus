package dm;

/* loaded from: classes4.dex */
public class o1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238862g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f238863h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f238864i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238865m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238866n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238867o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238868p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f238869q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f238870r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238871d = false;
    private long field_MsgId = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238872e = false;
    private java.lang.String field_CachePath = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f238873f = false;
    private long field_DownloadTime = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CPreloadFileCache");
        f238862g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238863h = new p75.d("DownloadTime", "long", tableName, "");
        f238864i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MsgIdIndex ON C2CPreloadFileCache(MsgId)", "CREATE INDEX IF NOT EXISTS TimeIndex ON C2CPreloadFileCache(DownloadTime)"};
        f238865m = 74638428;
        f238866n = 1450192141;
        f238867o = 1273388949;
        f238868p = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "MsgId";
        ((java.util.HashMap) e0Var.f316955d).put("MsgId", "LONG default '0' ");
        e0Var.f316954c[1] = "CacheName";
        ((java.util.HashMap) e0Var.f316955d).put("CacheName", "TEXT default '' ");
        e0Var.f316954c[2] = "DownloadTime";
        ((java.util.HashMap) e0Var.f316955d).put("DownloadTime", "LONG default '0' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " MsgId LONG default '0' ,  CacheName TEXT default '' ,  DownloadTime LONG default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f238869q = e0Var;
        f238870r = new o75.e();
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
            if (f238865m == hashCode) {
                try {
                    this.field_MsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreloadFileCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238866n == hashCode) {
                try {
                    this.field_CachePath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreloadFileCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238867o == hashCode) {
                try {
                    this.field_DownloadTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreloadFileCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238868p == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238871d) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.field_MsgId));
        }
        if (this.field_CachePath == null) {
            this.field_CachePath = "";
        }
        if (this.f238872e) {
            contentValues.put("CacheName", this.field_CachePath);
        }
        if (this.f238873f) {
            contentValues.put("DownloadTime", java.lang.Long.valueOf(this.field_DownloadTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CPreloadFileCache ( ");
        l75.e0 e0Var = f238869q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238864i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTableSql %s", str2);
            k0Var.A("C2CPreloadFileCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "C2CPreloadFileCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "updateTableSql %s", str3);
            k0Var.A("C2CPreloadFileCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238869q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238870r;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238862g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238862g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("MsgId")) {
            this.field_MsgId = contentValues.getAsLong("MsgId").longValue();
            if (z17) {
                this.f238871d = true;
            }
        }
        if (contentValues.containsKey("CacheName")) {
            this.field_CachePath = contentValues.getAsString("CacheName");
            if (z17) {
                this.f238872e = true;
            }
        }
        if (contentValues.containsKey("DownloadTime")) {
            this.field_DownloadTime = contentValues.getAsLong("DownloadTime").longValue();
            if (z17) {
                this.f238873f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
