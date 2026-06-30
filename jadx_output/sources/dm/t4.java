package dm;

/* loaded from: classes4.dex */
public class t4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240082f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240083g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240084h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240085i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240086m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240087n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240088o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240089d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240090e = true;
    public int field_definition;
    public long field_liveId;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveVideoDefinitionInfo");
        f240082f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240083g = new java.lang.String[0];
        f240084h = -1102434521;
        f240085i = -1014418093;
        f240086m = 108705909;
        f240087n = initAutoDBInfo(dm.t4.class);
        f240088o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        e0Var.f316955d.put("liveId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " liveId LONG PRIMARY KEY ,  definition INTEGER";
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
            if (f240084h == hashCode) {
                try {
                    this.field_liveId = cursor.getLong(i17);
                    this.f240089d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240085i == hashCode) {
                try {
                    this.field_definition = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240086m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240089d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.field_liveId));
        }
        if (this.f240090e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, java.lang.Integer.valueOf(this.field_definition));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveVideoDefinitionInfo ( ");
        l75.e0 e0Var = f240087n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240083g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveVideoDefinitionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveVideoDefinitionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveVideoDefinitionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240087n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240088o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_liveId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240082f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240082f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f240089d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION)) {
            this.field_definition = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION).intValue();
            if (z17) {
                this.f240090e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
