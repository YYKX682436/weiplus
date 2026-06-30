package dm;

/* loaded from: classes4.dex */
public class p4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239131f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239132g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239133h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239134i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239135m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239136n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239137o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239138d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239139e = true;
    public byte[] field_lastRewardInfo;
    public java.lang.String field_liveId;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveLastRewardInfo");
        f239131f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239132g = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderLiveLastRewardInfo_liveId_index ON FinderLiveLastRewardInfo(liveId)"};
        f239133h = -1102434521;
        f239134i = 1899996083;
        f239135m = 108705909;
        f239136n = initAutoDBInfo(dm.p4.class);
        f239137o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        e0Var.f316955d.put("liveId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = "lastRewardInfo";
        e0Var.f316955d.put("lastRewardInfo", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " liveId TEXT PRIMARY KEY ,  lastRewardInfo BLOB";
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
            if (f239133h == hashCode) {
                try {
                    this.field_liveId = cursor.getString(i17);
                    this.f239138d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239134i == hashCode) {
                try {
                    this.field_lastRewardInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239135m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239138d) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f239139e) {
            contentValues.put("lastRewardInfo", this.field_lastRewardInfo);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveLastRewardInfo ( ");
        l75.e0 e0Var = f239136n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239132g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveLastRewardInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveLastRewardInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveLastRewardInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239136n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239137o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_liveId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239131f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239131f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z17) {
                this.f239138d = true;
            }
        }
        if (contentValues.containsKey("lastRewardInfo")) {
            this.field_lastRewardInfo = contentValues.getAsByteArray("lastRewardInfo");
            if (z17) {
                this.f239139e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
