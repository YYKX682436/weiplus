package dm;

/* loaded from: classes4.dex */
public class k2 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237970f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237971g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237972h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237973i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237974m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237975n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237976o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237977d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237978e = true;
    public long field_msgId;
    public java.lang.String field_transferId;

    static {
        p75.n0 n0Var = new p75.n0("DelayTransferRecord");
        f237970f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237971g = new java.lang.String[0];
        f237972h = 104191100;
        f237973i = -1727368602;
        f237974m = 108705909;
        f237975n = initAutoDBInfo(dm.k2.class);
        f237976o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "transferId";
        e0Var.f316955d.put("transferId", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  transferId TEXT";
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
            if (f237972h == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f237977d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDelayTransferRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237973i == hashCode) {
                try {
                    this.field_transferId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseDelayTransferRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237974m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237977d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f237978e) {
            contentValues.put("transferId", this.field_transferId);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseDelayTransferRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DelayTransferRecord ( ");
        l75.e0 e0Var = f237975n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237971g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDelayTransferRecord", "createTableSql %s", str2);
            k0Var.A("DelayTransferRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "DelayTransferRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDelayTransferRecord", "updateTableSql %s", str3);
            k0Var.A("DelayTransferRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseDelayTransferRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237975n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237976o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237970f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237970f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f237977d = true;
            }
        }
        if (contentValues.containsKey("transferId")) {
            this.field_transferId = contentValues.getAsString("transferId");
            if (z17) {
                this.f237978e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
