package dm;

/* loaded from: classes4.dex */
public class hc extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237462f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237463g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237464h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237465i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237466m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237467n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237468o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237469d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237470e = true;
    public byte[] field_wallet_grey_item_buf;
    public int field_wallet_region;

    static {
        p75.n0 n0Var = new p75.n0("WalletRegionGreyAreaList");
        f237462f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237463g = new java.lang.String[0];
        f237464h = -1553000966;
        f237465i = -89975071;
        f237466m = 108705909;
        f237467n = initAutoDBInfo(dm.hc.class);
        f237468o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "wallet_region";
        e0Var.f316955d.put("wallet_region", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "wallet_region";
        e0Var.f316954c[1] = "wallet_grey_item_buf";
        e0Var.f316955d.put("wallet_grey_item_buf", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " wallet_region INTEGER PRIMARY KEY ,  wallet_grey_item_buf BLOB";
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
            if (f237464h == hashCode) {
                try {
                    this.field_wallet_region = cursor.getInt(i17);
                    this.f237469d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletRegionGreyAreaList", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237465i == hashCode) {
                try {
                    this.field_wallet_grey_item_buf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletRegionGreyAreaList", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237466m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237469d) {
            contentValues.put("wallet_region", java.lang.Integer.valueOf(this.field_wallet_region));
        }
        if (this.f237470e) {
            contentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletRegionGreyAreaList ( ");
        l75.e0 e0Var = f237467n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237463g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTableSql %s", str2);
            k0Var.A("WalletRegionGreyAreaList", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletRegionGreyAreaList", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "updateTableSql %s", str3);
            k0Var.A("WalletRegionGreyAreaList", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237467n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237468o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_wallet_region);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237462f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237462f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wallet_region")) {
            this.field_wallet_region = contentValues.getAsInteger("wallet_region").intValue();
            if (z17) {
                this.f237469d = true;
            }
        }
        if (contentValues.containsKey("wallet_grey_item_buf")) {
            this.field_wallet_grey_item_buf = contentValues.getAsByteArray("wallet_grey_item_buf");
            if (z17) {
                this.f237470e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
