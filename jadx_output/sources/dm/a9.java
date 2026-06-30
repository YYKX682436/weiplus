package dm;

/* loaded from: classes4.dex */
public class a9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f235676n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f235677o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235678p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235679q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235680r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235681s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235682t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235683u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235684v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235685w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f235686x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f235687y;
    public int field_appVersion;
    public java.lang.String field_appid;
    public java.lang.String field_iconUrl;
    public java.lang.String field_nickname;
    public java.lang.String field_token;
    public java.lang.String field_username;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235688d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235689e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235690f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235691g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235692h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235693i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235694m = true;

    static {
        p75.n0 n0Var = new p75.n0("OuterWidgetAppInfo");
        f235676n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235677o = new java.lang.String[0];
        f235678p = 110541305;
        f235679q = -265713450;
        f235680r = 689108018;
        f235681s = 1484112759;
        f235682t = 93029116;
        f235683u = 70690926;
        f235684v = 1638765110;
        f235685w = 108705909;
        f235686x = initAutoDBInfo(dm.a9.class);
        f235687y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "token";
        e0Var.f316955d.put("token", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "token";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[3] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER");
        e0Var.f316954c[4] = "appid";
        e0Var.f316955d.put("appid", "TEXT");
        e0Var.f316954c[5] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[6] = "iconUrl";
        e0Var.f316955d.put("iconUrl", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " token TEXT PRIMARY KEY ,  username TEXT,  versionType INTEGER,  appVersion INTEGER,  appid TEXT,  nickname TEXT,  iconUrl TEXT";
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
            if (f235678p == hashCode) {
                try {
                    this.field_token = cursor.getString(i17);
                    this.f235688d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235679q == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235680r == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235681s == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235682t == hashCode) {
                try {
                    this.field_appid = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235683u == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235684v == hashCode) {
                try {
                    this.field_iconUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOuterWidgetAppInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235685w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235688d) {
            contentValues.put("token", this.field_token);
        }
        if (this.f235689e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f235690f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f235691g) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f235692h) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f235693i) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f235694m) {
            contentValues.put("iconUrl", this.field_iconUrl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OuterWidgetAppInfo ( ");
        l75.e0 e0Var = f235686x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235677o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTableSql %s", str2);
            k0Var.A("OuterWidgetAppInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OuterWidgetAppInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "updateTableSql %s", str3);
            k0Var.A("OuterWidgetAppInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235686x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235687y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_token;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235676n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235676n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("token")) {
            this.field_token = contentValues.getAsString("token");
            if (z17) {
                this.f235688d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f235689e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f235690f = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f235691g = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z17) {
                this.f235692h = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f235693i = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f235694m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
