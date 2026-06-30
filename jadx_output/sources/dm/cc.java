package dm;

/* loaded from: classes8.dex */
public class cc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f236227m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f236228n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236229o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236230p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236231q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236232r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236233s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236234t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236235u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f236236v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f236237w;
    public int field_wallet_balance;
    public java.lang.String field_wallet_name;
    public int field_wallet_selected;
    public java.lang.String field_wallet_tpa_country;
    public int field_wallet_tpa_country_mask;
    public int field_wallet_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236238d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236239e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236240f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236241g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236242h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236243i = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletKindInfo");
        f236227m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236228n = new java.lang.String[0];
        f236229o = 1483411318;
        f236230p = -801536064;
        f236231q = -801737967;
        f236232r = -198363103;
        f236233s = 1971282070;
        f236234t = -1712330219;
        f236235u = 108705909;
        f236236v = initAutoDBInfo(dm.cc.class);
        f236237w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "wallet_tpa_country";
        e0Var.f316955d.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "wallet_tpa_country";
        e0Var.f316954c[1] = "wallet_type";
        e0Var.f316955d.put("wallet_type", "INTEGER");
        e0Var.f316954c[2] = "wallet_name";
        e0Var.f316955d.put("wallet_name", "TEXT");
        e0Var.f316954c[3] = "wallet_selected";
        e0Var.f316955d.put("wallet_selected", "INTEGER");
        e0Var.f316954c[4] = "wallet_balance";
        e0Var.f316955d.put("wallet_balance", "INTEGER");
        e0Var.f316954c[5] = "wallet_tpa_country_mask";
        e0Var.f316955d.put("wallet_tpa_country_mask", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " wallet_tpa_country TEXT PRIMARY KEY ,  wallet_type INTEGER,  wallet_name TEXT,  wallet_selected INTEGER,  wallet_balance INTEGER,  wallet_tpa_country_mask INTEGER";
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
            if (f236229o == hashCode) {
                try {
                    this.field_wallet_tpa_country = cursor.getString(i17);
                    this.f236238d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236230p == hashCode) {
                try {
                    this.field_wallet_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236231q == hashCode) {
                try {
                    this.field_wallet_name = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236232r == hashCode) {
                try {
                    this.field_wallet_selected = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236233s == hashCode) {
                try {
                    this.field_wallet_balance = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236234t == hashCode) {
                try {
                    this.field_wallet_tpa_country_mask = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletKindInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236235u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236238d) {
            contentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
        }
        if (this.f236239e) {
            contentValues.put("wallet_type", java.lang.Integer.valueOf(this.field_wallet_type));
        }
        if (this.f236240f) {
            contentValues.put("wallet_name", this.field_wallet_name);
        }
        if (this.f236241g) {
            contentValues.put("wallet_selected", java.lang.Integer.valueOf(this.field_wallet_selected));
        }
        if (this.f236242h) {
            contentValues.put("wallet_balance", java.lang.Integer.valueOf(this.field_wallet_balance));
        }
        if (this.f236243i) {
            contentValues.put("wallet_tpa_country_mask", java.lang.Integer.valueOf(this.field_wallet_tpa_country_mask));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletKindInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletKindInfo ( ");
        l75.e0 e0Var = f236236v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236228n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "createTableSql %s", str2);
            k0Var.A("WalletKindInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletKindInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "updateTableSql %s", str3);
            k0Var.A("WalletKindInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236236v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236237w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_wallet_tpa_country;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236227m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236227m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wallet_tpa_country")) {
            this.field_wallet_tpa_country = contentValues.getAsString("wallet_tpa_country");
            if (z17) {
                this.f236238d = true;
            }
        }
        if (contentValues.containsKey("wallet_type")) {
            this.field_wallet_type = contentValues.getAsInteger("wallet_type").intValue();
            if (z17) {
                this.f236239e = true;
            }
        }
        if (contentValues.containsKey("wallet_name")) {
            this.field_wallet_name = contentValues.getAsString("wallet_name");
            if (z17) {
                this.f236240f = true;
            }
        }
        if (contentValues.containsKey("wallet_selected")) {
            this.field_wallet_selected = contentValues.getAsInteger("wallet_selected").intValue();
            if (z17) {
                this.f236241g = true;
            }
        }
        if (contentValues.containsKey("wallet_balance")) {
            this.field_wallet_balance = contentValues.getAsInteger("wallet_balance").intValue();
            if (z17) {
                this.f236242h = true;
            }
        }
        if (contentValues.containsKey("wallet_tpa_country_mask")) {
            this.field_wallet_tpa_country_mask = contentValues.getAsInteger("wallet_tpa_country_mask").intValue();
            if (z17) {
                this.f236243i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
