package dm;

/* loaded from: classes4.dex */
public class p1 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239086f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239087g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239088h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239089i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239090m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239091n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239092o;
    private int field_Priority;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239093d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239094e = false;
    private long field_Quota = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CQuotaQueryDBInfo");
        f239086f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239087g = new java.lang.String[0];
        f239088h = -1100816956;
        f239089i = -1835527912;
        f239090m = 108705909;
        f239091n = initAutoDBInfo(dm.p1.class);
        f239092o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "Priority";
        e0Var.f316955d.put("Priority", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "Priority";
        e0Var.f316954c[1] = "sum(C2CPreDownloadDBInfo.LastLen)";
        e0Var.f316955d.put("sum(C2CPreDownloadDBInfo.LastLen)", "LONG default '0' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " Priority INTEGER PRIMARY KEY ,  sum(C2CPreDownloadDBInfo.LastLen) LONG default '0' ";
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
            if (f239088h == hashCode) {
                try {
                    this.field_Priority = cursor.getInt(i17);
                    this.f239093d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239089i == hashCode) {
                try {
                    this.field_Quota = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239090m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239093d) {
            contentValues.put("Priority", java.lang.Integer.valueOf(this.field_Priority));
        }
        if (this.f239094e) {
            contentValues.put("sum(C2CPreDownloadDBInfo.LastLen)", java.lang.Long.valueOf(this.field_Quota));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CQuotaQueryDBInfo ( ");
        l75.e0 e0Var = f239091n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239087g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTableSql %s", str2);
            k0Var.A("C2CQuotaQueryDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "C2CQuotaQueryDBInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "updateTableSql %s", str3);
            k0Var.A("C2CQuotaQueryDBInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239091n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239092o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_Priority);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239086f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239086f.f352676a;
    }

    public int t0() {
        return this.field_Priority;
    }

    public long u0() {
        return this.field_Quota;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("Priority")) {
            this.field_Priority = contentValues.getAsInteger("Priority").intValue();
            if (z17) {
                this.f239093d = true;
            }
        }
        if (contentValues.containsKey("sum(C2CPreDownloadDBInfo.LastLen)")) {
            this.field_Quota = contentValues.getAsLong("sum(C2CPreDownloadDBInfo.LastLen)").longValue();
            if (z17) {
                this.f239094e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
