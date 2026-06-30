package dm;

/* loaded from: classes4.dex */
public class m2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238422g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f238423h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238424i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238425m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238426n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238427o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f238428p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f238429q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238430d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238431e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238432f = true;
    public java.lang.String field_appId;
    public long field_modifyTime;
    public int field_status;

    static {
        p75.n0 n0Var = new p75.n0("DownloadTaskItem");
        f238422g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238423h = new java.lang.String[0];
        f238424i = 93028124;
        f238425m = -892481550;
        f238426n = 1211388583;
        f238427o = 108705909;
        f238428p = initAutoDBInfo(dm.m2.class);
        f238429q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[2] = "modifyTime";
        e0Var.f316955d.put("modifyTime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  status INTEGER,  modifyTime LONG";
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
            if (f238424i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f238430d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238425m == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238426n == hashCode) {
                try {
                    this.field_modifyTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238427o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238430d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238431e) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f238432f) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseDownloadTaskItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DownloadTaskItem ( ");
        l75.e0 e0Var = f238428p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238423h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "createTableSql %s", str2);
            k0Var.A("DownloadTaskItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "DownloadTaskItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "updateTableSql %s", str3);
            k0Var.A("DownloadTaskItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238428p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238429q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238422g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238422g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238430d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f238431e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f238432f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
