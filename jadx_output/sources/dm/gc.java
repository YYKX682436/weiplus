package dm;

/* loaded from: classes9.dex */
public class gc extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f237223p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f237224q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237225r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237226s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237227t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237228u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237229v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237230w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237231x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237232y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237233z;
    public int field_is_show;
    public int field_jump_type;
    public java.lang.String field_logo_url;
    public java.lang.String field_pref_desc;
    public java.lang.String field_pref_key;
    public java.lang.String field_pref_title;
    public java.lang.String field_pref_url;
    public java.lang.String field_tinyapp_path;
    public java.lang.String field_tinyapp_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237234d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237235e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237236f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237237g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237238h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237239i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237240m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237241n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237242o = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletPrefInfo");
        f237223p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237224q = new java.lang.String[0];
        f237225r = -1288853949;
        f237226s = -1629634244;
        f237227t = -1288843949;
        f237228u = 2082222322;
        f237229v = -1299975379;
        f237230w = 2027875547;
        f237231x = 685162667;
        f237232y = -1101010892;
        f237233z = -540204413;
        A = 108705909;
        B = initAutoDBInfo(dm.gc.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "pref_key";
        e0Var.f316955d.put("pref_key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "pref_key";
        e0Var.f316954c[1] = "pref_title";
        e0Var.f316955d.put("pref_title", "TEXT");
        e0Var.f316954c[2] = "pref_url";
        e0Var.f316955d.put("pref_url", "TEXT");
        e0Var.f316954c[3] = "is_show";
        e0Var.f316955d.put("is_show", "INTEGER default '1' ");
        e0Var.f316954c[4] = "pref_desc";
        e0Var.f316955d.put("pref_desc", "TEXT");
        e0Var.f316954c[5] = "logo_url";
        e0Var.f316955d.put("logo_url", "TEXT");
        e0Var.f316954c[6] = "jump_type";
        e0Var.f316955d.put("jump_type", "INTEGER");
        e0Var.f316954c[7] = "tinyapp_username";
        e0Var.f316955d.put("tinyapp_username", "TEXT");
        e0Var.f316954c[8] = "tinyapp_path";
        e0Var.f316955d.put("tinyapp_path", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " pref_key TEXT PRIMARY KEY ,  pref_title TEXT,  pref_url TEXT,  is_show INTEGER default '1' ,  pref_desc TEXT,  logo_url TEXT,  jump_type INTEGER,  tinyapp_username TEXT,  tinyapp_path TEXT";
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
            if (f237225r == hashCode) {
                try {
                    this.field_pref_key = cursor.getString(i17);
                    this.f237234d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237226s == hashCode) {
                try {
                    this.field_pref_title = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237227t == hashCode) {
                try {
                    this.field_pref_url = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237228u == hashCode) {
                try {
                    this.field_is_show = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237229v == hashCode) {
                try {
                    this.field_pref_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237230w == hashCode) {
                try {
                    this.field_logo_url = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237231x == hashCode) {
                try {
                    this.field_jump_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237232y == hashCode) {
                try {
                    this.field_tinyapp_username = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237233z == hashCode) {
                try {
                    this.field_tinyapp_path = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletPrefInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237234d) {
            contentValues.put("pref_key", this.field_pref_key);
        }
        if (this.f237235e) {
            contentValues.put("pref_title", this.field_pref_title);
        }
        if (this.f237236f) {
            contentValues.put("pref_url", this.field_pref_url);
        }
        if (this.f237237g) {
            contentValues.put("is_show", java.lang.Integer.valueOf(this.field_is_show));
        }
        if (this.f237238h) {
            contentValues.put("pref_desc", this.field_pref_desc);
        }
        if (this.f237239i) {
            contentValues.put("logo_url", this.field_logo_url);
        }
        if (this.f237240m) {
            contentValues.put("jump_type", java.lang.Integer.valueOf(this.field_jump_type));
        }
        if (this.f237241n) {
            contentValues.put("tinyapp_username", this.field_tinyapp_username);
        }
        if (this.f237242o) {
            contentValues.put("tinyapp_path", this.field_tinyapp_path);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletPrefInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletPrefInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237224q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "createTableSql %s", str2);
            k0Var.A("WalletPrefInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletPrefInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "updateTableSql %s", str3);
            k0Var.A("WalletPrefInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_pref_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237223p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237223p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pref_key")) {
            this.field_pref_key = contentValues.getAsString("pref_key");
            if (z17) {
                this.f237234d = true;
            }
        }
        if (contentValues.containsKey("pref_title")) {
            this.field_pref_title = contentValues.getAsString("pref_title");
            if (z17) {
                this.f237235e = true;
            }
        }
        if (contentValues.containsKey("pref_url")) {
            this.field_pref_url = contentValues.getAsString("pref_url");
            if (z17) {
                this.f237236f = true;
            }
        }
        if (contentValues.containsKey("is_show")) {
            this.field_is_show = contentValues.getAsInteger("is_show").intValue();
            if (z17) {
                this.f237237g = true;
            }
        }
        if (contentValues.containsKey("pref_desc")) {
            this.field_pref_desc = contentValues.getAsString("pref_desc");
            if (z17) {
                this.f237238h = true;
            }
        }
        if (contentValues.containsKey("logo_url")) {
            this.field_logo_url = contentValues.getAsString("logo_url");
            if (z17) {
                this.f237239i = true;
            }
        }
        if (contentValues.containsKey("jump_type")) {
            this.field_jump_type = contentValues.getAsInteger("jump_type").intValue();
            if (z17) {
                this.f237240m = true;
            }
        }
        if (contentValues.containsKey("tinyapp_username")) {
            this.field_tinyapp_username = contentValues.getAsString("tinyapp_username");
            if (z17) {
                this.f237241n = true;
            }
        }
        if (contentValues.containsKey("tinyapp_path")) {
            this.field_tinyapp_path = contentValues.getAsString("tinyapp_path");
            if (z17) {
                this.f237242o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
