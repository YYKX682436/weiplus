package dm;

/* loaded from: classes4.dex */
public class bc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f235945m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f235946n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235947o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235948p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235949q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235950r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235951s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235952t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235953u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f235954v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f235955w;
    public java.lang.String field_banner_list;
    public java.lang.String field_function_list;
    public int field_isShowSetting;
    public java.lang.String field_new_list;
    public java.lang.String field_type_name_list;
    public int field_wallet_region;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235956d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235957e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235958f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235959g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235960h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235961i = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletFunciontList");
        f235945m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235946n = new java.lang.String[0];
        f235947o = -1553000966;
        f235948p = 2053414053;
        f235949q = 1377092573;
        f235950r = -1907063343;
        f235951s = 556341005;
        f235952t = 964067593;
        f235953u = 108705909;
        f235954v = initAutoDBInfo(dm.bc.class);
        f235955w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "wallet_region";
        e0Var.f316955d.put("wallet_region", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "wallet_region";
        e0Var.f316954c[1] = "function_list";
        e0Var.f316955d.put("function_list", "TEXT");
        e0Var.f316954c[2] = "new_list";
        e0Var.f316955d.put("new_list", "TEXT");
        e0Var.f316954c[3] = "banner_list";
        e0Var.f316955d.put("banner_list", "TEXT");
        e0Var.f316954c[4] = "type_name_list";
        e0Var.f316955d.put("type_name_list", "TEXT");
        e0Var.f316954c[5] = "isShowSetting";
        e0Var.f316955d.put("isShowSetting", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " wallet_region INTEGER PRIMARY KEY ,  function_list TEXT,  new_list TEXT,  banner_list TEXT,  type_name_list TEXT,  isShowSetting INTEGER";
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
            if (f235947o == hashCode) {
                try {
                    this.field_wallet_region = cursor.getInt(i17);
                    this.f235956d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235948p == hashCode) {
                try {
                    this.field_function_list = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235949q == hashCode) {
                try {
                    this.field_new_list = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235950r == hashCode) {
                try {
                    this.field_banner_list = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235951s == hashCode) {
                try {
                    this.field_type_name_list = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235952t == hashCode) {
                try {
                    this.field_isShowSetting = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletFunciontList", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235953u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235956d) {
            contentValues.put("wallet_region", java.lang.Integer.valueOf(this.field_wallet_region));
        }
        if (this.f235957e) {
            contentValues.put("function_list", this.field_function_list);
        }
        if (this.f235958f) {
            contentValues.put("new_list", this.field_new_list);
        }
        if (this.f235959g) {
            contentValues.put("banner_list", this.field_banner_list);
        }
        if (this.f235960h) {
            contentValues.put("type_name_list", this.field_type_name_list);
        }
        if (this.f235961i) {
            contentValues.put("isShowSetting", java.lang.Integer.valueOf(this.field_isShowSetting));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletFunciontList", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletFunciontList ( ");
        l75.e0 e0Var = f235954v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235946n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "createTableSql %s", str2);
            k0Var.A("WalletFunciontList", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletFunciontList", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "updateTableSql %s", str3);
            k0Var.A("WalletFunciontList", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235954v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235955w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_wallet_region);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235945m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235945m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wallet_region")) {
            this.field_wallet_region = contentValues.getAsInteger("wallet_region").intValue();
            if (z17) {
                this.f235956d = true;
            }
        }
        if (contentValues.containsKey("function_list")) {
            this.field_function_list = contentValues.getAsString("function_list");
            if (z17) {
                this.f235957e = true;
            }
        }
        if (contentValues.containsKey("new_list")) {
            this.field_new_list = contentValues.getAsString("new_list");
            if (z17) {
                this.f235958f = true;
            }
        }
        if (contentValues.containsKey("banner_list")) {
            this.field_banner_list = contentValues.getAsString("banner_list");
            if (z17) {
                this.f235959g = true;
            }
        }
        if (contentValues.containsKey("type_name_list")) {
            this.field_type_name_list = contentValues.getAsString("type_name_list");
            if (z17) {
                this.f235960h = true;
            }
        }
        if (contentValues.containsKey("isShowSetting")) {
            this.field_isShowSetting = contentValues.getAsInteger("isShowSetting").intValue();
            if (z17) {
                this.f235961i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
