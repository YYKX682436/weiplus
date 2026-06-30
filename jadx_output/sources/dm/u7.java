package dm;

/* loaded from: classes4.dex */
public class u7 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240348f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240349g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240350h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240351i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240352m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240353n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240354o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240355d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240356e = true;
    public int field_open_count;
    public java.lang.String field_send_id;

    static {
        p75.n0 n0Var = new p75.n0("LuckyMoneyDetailOpenRecord");
        f240348f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240349g = new java.lang.String[0];
        f240350h = 1979913522;
        f240351i = 676362970;
        f240352m = 108705909;
        f240353n = initAutoDBInfo(dm.u7.class);
        f240354o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "send_id";
        e0Var.f316955d.put("send_id", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "send_id";
        e0Var.f316954c[1] = "open_count";
        e0Var.f316955d.put("open_count", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " send_id TEXT PRIMARY KEY ,  open_count INTEGER";
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
            if (f240350h == hashCode) {
                try {
                    this.field_send_id = cursor.getString(i17);
                    this.f240355d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240351i == hashCode) {
                try {
                    this.field_open_count = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240352m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240355d) {
            contentValues.put("send_id", this.field_send_id);
        }
        if (this.f240356e) {
            contentValues.put("open_count", java.lang.Integer.valueOf(this.field_open_count));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LuckyMoneyDetailOpenRecord ( ");
        l75.e0 e0Var = f240353n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240349g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTableSql %s", str2);
            k0Var.A("LuckyMoneyDetailOpenRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LuckyMoneyDetailOpenRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "updateTableSql %s", str3);
            k0Var.A("LuckyMoneyDetailOpenRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240353n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240354o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_send_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240348f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240348f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("send_id")) {
            this.field_send_id = contentValues.getAsString("send_id");
            if (z17) {
                this.f240355d = true;
            }
        }
        if (contentValues.containsKey("open_count")) {
            this.field_open_count = contentValues.getAsInteger("open_count").intValue();
            if (z17) {
                this.f240356e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
