package dm;

/* loaded from: classes4.dex */
public class q4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239395f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239396g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239397h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239398i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239399m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239400n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239401o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239402d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239403e = true;
    public java.lang.String field_liveId;
    public byte[] field_luckyMoneyData;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveLuckyMoneyInfo");
        f239395f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239396g = new java.lang.String[0];
        f239397h = -1102434521;
        f239398i = 146501250;
        f239399m = 108705909;
        f239400n = initAutoDBInfo(dm.q4.class);
        f239401o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        e0Var.f316955d.put("liveId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = "luckyMoneyData";
        e0Var.f316955d.put("luckyMoneyData", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " liveId TEXT PRIMARY KEY ,  luckyMoneyData BLOB";
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
            if (f239397h == hashCode) {
                try {
                    this.field_liveId = cursor.getString(i17);
                    this.f239402d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239398i == hashCode) {
                try {
                    this.field_luckyMoneyData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239399m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239402d) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f239403e) {
            contentValues.put("luckyMoneyData", this.field_luckyMoneyData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveLuckyMoneyInfo ( ");
        l75.e0 e0Var = f239400n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239396g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveLuckyMoneyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveLuckyMoneyInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveLuckyMoneyInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239400n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239401o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_liveId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239395f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239395f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z17) {
                this.f239402d = true;
            }
        }
        if (contentValues.containsKey("luckyMoneyData")) {
            this.field_luckyMoneyData = contentValues.getAsByteArray("luckyMoneyData");
            if (z17) {
                this.f239403e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
