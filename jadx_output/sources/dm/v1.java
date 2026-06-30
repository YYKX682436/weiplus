package dm;

/* loaded from: classes8.dex */
public class v1 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240448i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240449m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240450n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240451o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240452p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240453q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240454r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240455s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240456t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240457u;
    public int field_businessId;
    public long field_delayTime;
    public byte[] field_itemInfo;
    public long field_localItemReportId;
    public long field_reportTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240458d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240459e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240460f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240461g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240462h = true;

    static {
        p75.n0 n0Var = new p75.n0("CgiReportLocalItemDataCache");
        f240448i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240449m = new java.lang.String[0];
        f240450n = -539006803;
        f240451o = 1177195105;
        f240452p = 1702091003;
        f240453q = 1931371041;
        f240454r = -469104912;
        f240455s = 108705909;
        f240456t = initAutoDBInfo(dm.v1.class);
        f240457u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "localItemReportId";
        e0Var.f316955d.put("localItemReportId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "localItemReportId";
        e0Var.f316954c[1] = "itemInfo";
        e0Var.f316955d.put("itemInfo", "BLOB");
        e0Var.f316954c[2] = "businessId";
        e0Var.f316955d.put("businessId", "INTEGER");
        e0Var.f316954c[3] = "reportTime";
        e0Var.f316955d.put("reportTime", "LONG");
        e0Var.f316954c[4] = "delayTime";
        e0Var.f316955d.put("delayTime", "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " localItemReportId LONG PRIMARY KEY ,  itemInfo BLOB,  businessId INTEGER,  reportTime LONG,  delayTime LONG";
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
            if (f240450n == hashCode) {
                try {
                    this.field_localItemReportId = cursor.getLong(i17);
                    this.f240458d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240451o == hashCode) {
                try {
                    this.field_itemInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240452p == hashCode) {
                try {
                    this.field_businessId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240453q == hashCode) {
                try {
                    this.field_reportTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240454r == hashCode) {
                try {
                    this.field_delayTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240455s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240458d) {
            contentValues.put("localItemReportId", java.lang.Long.valueOf(this.field_localItemReportId));
        }
        if (this.f240459e) {
            contentValues.put("itemInfo", this.field_itemInfo);
        }
        if (this.f240460f) {
            contentValues.put("businessId", java.lang.Integer.valueOf(this.field_businessId));
        }
        if (this.f240461g) {
            contentValues.put("reportTime", java.lang.Long.valueOf(this.field_reportTime));
        }
        if (this.f240462h) {
            contentValues.put("delayTime", java.lang.Long.valueOf(this.field_delayTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CgiReportLocalItemDataCache ( ");
        l75.e0 e0Var = f240456t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240449m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTableSql %s", str2);
            k0Var.A("CgiReportLocalItemDataCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CgiReportLocalItemDataCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "updateTableSql %s", str3);
            k0Var.A("CgiReportLocalItemDataCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240456t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240457u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localItemReportId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240448i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240448i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localItemReportId")) {
            this.field_localItemReportId = contentValues.getAsLong("localItemReportId").longValue();
            if (z17) {
                this.f240458d = true;
            }
        }
        if (contentValues.containsKey("itemInfo")) {
            this.field_itemInfo = contentValues.getAsByteArray("itemInfo");
            if (z17) {
                this.f240459e = true;
            }
        }
        if (contentValues.containsKey("businessId")) {
            this.field_businessId = contentValues.getAsInteger("businessId").intValue();
            if (z17) {
                this.f240460f = true;
            }
        }
        if (contentValues.containsKey("reportTime")) {
            this.field_reportTime = contentValues.getAsLong("reportTime").longValue();
            if (z17) {
                this.f240461g = true;
            }
        }
        if (contentValues.containsKey("delayTime")) {
            this.field_delayTime = contentValues.getAsLong("delayTime").longValue();
            if (z17) {
                this.f240462h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
