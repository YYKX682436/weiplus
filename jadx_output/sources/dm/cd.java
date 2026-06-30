package dm;

/* loaded from: classes4.dex */
public class cd extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236244h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236245i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236246m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236247n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236248o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236249p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236250q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236251r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236252s;
    public java.lang.String field_appid;
    public java.lang.String field_token;
    public int field_uin;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236253d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236254e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236255f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236256g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaTokenInfo");
        f236244h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236245i = new java.lang.String[0];
        f236246m = 110541305;
        f236247n = -265713450;
        f236248o = 115802;
        f236249p = 93029116;
        f236250q = 108705909;
        f236251r = initAutoDBInfo(dm.cd.class);
        f236252s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "token";
        e0Var.f316955d.put("token", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "token";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "uin";
        e0Var.f316955d.put("uin", "INTEGER");
        e0Var.f316954c[3] = "appid";
        e0Var.f316955d.put("appid", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " token TEXT PRIMARY KEY ,  username TEXT,  uin INTEGER,  appid TEXT";
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
            if (f236246m == hashCode) {
                try {
                    this.field_token = cursor.getString(i17);
                    this.f236253d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236247n == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236248o == hashCode) {
                try {
                    this.field_uin = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236249p == hashCode) {
                try {
                    this.field_appid = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaTokenInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236250q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236253d) {
            contentValues.put("token", this.field_token);
        }
        if (this.f236254e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236255f) {
            contentValues.put("uin", java.lang.Integer.valueOf(this.field_uin));
        }
        if (this.f236256g) {
            contentValues.put("appid", this.field_appid);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaTokenInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaTokenInfo ( ");
        l75.e0 e0Var = f236251r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236245i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "createTableSql %s", str2);
            k0Var.A("WxaTokenInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaTokenInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "updateTableSql %s", str3);
            k0Var.A("WxaTokenInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236251r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236252s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_token;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236244h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236244h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("token")) {
            this.field_token = contentValues.getAsString("token");
            if (z17) {
                this.f236253d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236254e = true;
            }
        }
        if (contentValues.containsKey("uin")) {
            this.field_uin = contentValues.getAsInteger("uin").intValue();
            if (z17) {
                this.f236255f = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z17) {
                this.f236256g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
