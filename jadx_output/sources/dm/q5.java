package dm;

/* loaded from: classes4.dex */
public class q5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239404f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239405g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239406h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239407i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239408m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239409n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239410o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239411d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239412e = true;
    public java.lang.String field_dateTimeRange;
    public int field_pullCount;

    static {
        p75.n0 n0Var = new p75.n0("GameMsgPullRecord");
        f239404f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239405g = new java.lang.String[0];
        f239406h = 1727701602;
        f239407i = 1697306058;
        f239408m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "dateTimeRange";
        ((java.util.HashMap) e0Var.f316955d).put("dateTimeRange", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "dateTimeRange";
        e0Var.f316954c[1] = "pullCount";
        ((java.util.HashMap) e0Var.f316955d).put("pullCount", "INTEGER default '0' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " dateTimeRange TEXT PRIMARY KEY ,  pullCount INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239409n = e0Var;
        f239410o = new o75.e();
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
            if (f239406h == hashCode) {
                try {
                    this.field_dateTimeRange = cursor.getString(i17);
                    this.f239411d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameMsgPullRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239407i == hashCode) {
                try {
                    this.field_pullCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameMsgPullRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239408m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239411d) {
            contentValues.put("dateTimeRange", this.field_dateTimeRange);
        }
        if (this.f239412e) {
            contentValues.put("pullCount", java.lang.Integer.valueOf(this.field_pullCount));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameMsgPullRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameMsgPullRecord ( ");
        l75.e0 e0Var = f239409n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239405g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "createTableSql %s", str2);
            k0Var.A("GameMsgPullRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameMsgPullRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "updateTableSql %s", str3);
            k0Var.A("GameMsgPullRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239409n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239410o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_dateTimeRange;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239404f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239404f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dateTimeRange")) {
            this.field_dateTimeRange = contentValues.getAsString("dateTimeRange");
            if (z17) {
                this.f239411d = true;
            }
        }
        if (contentValues.containsKey("pullCount")) {
            this.field_pullCount = contentValues.getAsInteger("pullCount").intValue();
            if (z17) {
                this.f239412e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
