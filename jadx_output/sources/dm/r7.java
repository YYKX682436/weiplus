package dm;

/* loaded from: classes8.dex */
public class r7 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f239653o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f239654p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239655q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239656r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239657s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239658t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239659u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239660v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239661w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239662x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239663y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f239664z;
    public java.lang.String field_appid;
    public int field_expire_duration;
    public boolean field_hasLiteConf;
    public java.lang.String field_path;
    public int field_refresh_duration;
    public long field_updateTime;
    public java.lang.String field_url;
    public java.lang.String field_wepkg_id;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239665d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239666e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239667f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239668g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239669h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239670i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239671m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239672n = true;

    static {
        p75.n0 n0Var = new p75.n0("LocalLiteAppConf");
        f239653o = n0Var;
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
        f239654p = new java.lang.String[0];
        f239655q = 116079;
        f239656r = 93029116;
        f239657s = 3433509;
        f239658t = 305255604;
        f239659u = -745606536;
        f239660v = -306964292;
        f239661w = -295931082;
        f239662x = -60585556;
        f239663y = 108705909;
        f239664z = initAutoDBInfo(dm.r7.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "url";
        e0Var.f316955d.put("url", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "url";
        e0Var.f316954c[1] = "appid";
        e0Var.f316955d.put("appid", "TEXT");
        e0Var.f316954c[2] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[3] = "expire_duration";
        e0Var.f316955d.put("expire_duration", "INTEGER");
        e0Var.f316954c[4] = "refresh_duration";
        e0Var.f316955d.put("refresh_duration", "INTEGER");
        e0Var.f316954c[5] = "wepkg_id";
        e0Var.f316955d.put("wepkg_id", "TEXT");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[7] = "hasLiteConf";
        e0Var.f316955d.put("hasLiteConf", "INTEGER default 'false' ");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " url TEXT PRIMARY KEY ,  appid TEXT,  path TEXT,  expire_duration INTEGER,  refresh_duration INTEGER,  wepkg_id TEXT,  updateTime LONG,  hasLiteConf INTEGER default 'false' ";
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
            boolean z17 = true;
            if (f239655q == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                    this.f239665d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239656r == hashCode) {
                try {
                    this.field_appid = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239657s == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239658t == hashCode) {
                try {
                    this.field_expire_duration = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239659u == hashCode) {
                try {
                    this.field_refresh_duration = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239660v == hashCode) {
                try {
                    this.field_wepkg_id = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239661w == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239662x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasLiteConf = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalLiteAppConf", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239663y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239665d) {
            contentValues.put("url", this.field_url);
        }
        if (this.f239666e) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f239667f) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f239668g) {
            contentValues.put("expire_duration", java.lang.Integer.valueOf(this.field_expire_duration));
        }
        if (this.f239669h) {
            contentValues.put("refresh_duration", java.lang.Integer.valueOf(this.field_refresh_duration));
        }
        if (this.f239670i) {
            contentValues.put("wepkg_id", this.field_wepkg_id);
        }
        if (this.f239671m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f239672n) {
            if (this.field_hasLiteConf) {
                contentValues.put("hasLiteConf", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasLiteConf", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LocalLiteAppConf ( ");
        l75.e0 e0Var = f239664z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239654p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTableSql %s", str2);
            k0Var.A("LocalLiteAppConf", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LocalLiteAppConf", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "updateTableSql %s", str3);
            k0Var.A("LocalLiteAppConf", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239664z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_url;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239653o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239653o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f239665d = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z17) {
                this.f239666e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f239667f = true;
            }
        }
        if (contentValues.containsKey("expire_duration")) {
            this.field_expire_duration = contentValues.getAsInteger("expire_duration").intValue();
            if (z17) {
                this.f239668g = true;
            }
        }
        if (contentValues.containsKey("refresh_duration")) {
            this.field_refresh_duration = contentValues.getAsInteger("refresh_duration").intValue();
            if (z17) {
                this.f239669h = true;
            }
        }
        if (contentValues.containsKey("wepkg_id")) {
            this.field_wepkg_id = contentValues.getAsString("wepkg_id");
            if (z17) {
                this.f239670i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239671m = true;
            }
        }
        if (contentValues.containsKey("hasLiteConf")) {
            this.field_hasLiteConf = contentValues.getAsInteger("hasLiteConf").intValue() != 0;
            if (z17) {
                this.f239672n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
