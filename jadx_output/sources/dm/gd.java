package dm;

/* loaded from: classes4.dex */
public class gd extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f237243p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f237244q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237245r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237246s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237247t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237248u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237249v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237250w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237251x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237252y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237253z;
    public java.lang.String field_AppId;
    public java.lang.String field_AppName;
    public java.lang.String field_BriefIntro;
    public java.lang.String field_IconUrl;
    public java.lang.String field_RecordId;
    public java.lang.String field_UserName;
    public long field_createTime;
    public int field_debugType;
    public boolean field_isSync;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237254d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237255e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237256f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237257g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237258h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237259i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237260m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237261n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237262o = true;

    static {
        p75.n0 n0Var = new p75.n0("WxagGameInfo");
        f237243p = n0Var;
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
        f237244q = new java.lang.String[0];
        f237245r = -734590612;
        f237246s = 63475452;
        f237247t = 870516780;
        f237248u = -202022634;
        f237249v = -991548906;
        f237250w = 769664562;
        f237251x = -1180109083;
        f237252y = -198232019;
        f237253z = 1369213417;
        A = 108705909;
        B = initAutoDBInfo(dm.gd.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "RecordId";
        e0Var.f316955d.put("RecordId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "RecordId";
        e0Var.f316954c[1] = "AppId";
        e0Var.f316955d.put("AppId", "TEXT");
        e0Var.f316954c[2] = "AppName";
        e0Var.f316955d.put("AppName", "TEXT");
        e0Var.f316954c[3] = "UserName";
        e0Var.f316955d.put("UserName", "TEXT");
        e0Var.f316954c[4] = "IconUrl";
        e0Var.f316955d.put("IconUrl", "TEXT");
        e0Var.f316954c[5] = "BriefIntro";
        e0Var.f316955d.put("BriefIntro", "TEXT");
        e0Var.f316954c[6] = "isSync";
        e0Var.f316955d.put("isSync", "INTEGER default 'false' ");
        e0Var.f316954c[7] = "debugType";
        e0Var.f316955d.put("debugType", "INTEGER");
        e0Var.f316954c[8] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " RecordId TEXT PRIMARY KEY ,  AppId TEXT,  AppName TEXT,  UserName TEXT,  IconUrl TEXT,  BriefIntro TEXT,  isSync INTEGER default 'false' ,  debugType INTEGER,  createTime LONG";
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
            if (f237245r == hashCode) {
                try {
                    this.field_RecordId = cursor.getString(i17);
                    this.f237254d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237246s == hashCode) {
                try {
                    this.field_AppId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237247t == hashCode) {
                try {
                    this.field_AppName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237248u == hashCode) {
                try {
                    this.field_UserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237249v == hashCode) {
                try {
                    this.field_IconUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237250w == hashCode) {
                try {
                    this.field_BriefIntro = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237251x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isSync = z17;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237252y == hashCode) {
                try {
                    this.field_debugType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237253z == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxagGameInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f237254d) {
            contentValues.put("RecordId", this.field_RecordId);
        }
        if (this.f237255e) {
            contentValues.put("AppId", this.field_AppId);
        }
        if (this.f237256f) {
            contentValues.put("AppName", this.field_AppName);
        }
        if (this.f237257g) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f237258h) {
            contentValues.put("IconUrl", this.field_IconUrl);
        }
        if (this.f237259i) {
            contentValues.put("BriefIntro", this.field_BriefIntro);
        }
        if (this.f237260m) {
            if (this.field_isSync) {
                contentValues.put("isSync", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSync", (java.lang.Integer) 0);
            }
        }
        if (this.f237261n) {
            contentValues.put("debugType", java.lang.Integer.valueOf(this.field_debugType));
        }
        if (this.f237262o) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxagGameInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxagGameInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237244q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "createTableSql %s", str2);
            k0Var.A("WxagGameInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxagGameInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "updateTableSql %s", str3);
            k0Var.A("WxagGameInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_RecordId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237243p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237243p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("RecordId")) {
            this.field_RecordId = contentValues.getAsString("RecordId");
            if (z17) {
                this.f237254d = true;
            }
        }
        if (contentValues.containsKey("AppId")) {
            this.field_AppId = contentValues.getAsString("AppId");
            if (z17) {
                this.f237255e = true;
            }
        }
        if (contentValues.containsKey("AppName")) {
            this.field_AppName = contentValues.getAsString("AppName");
            if (z17) {
                this.f237256f = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z17) {
                this.f237257g = true;
            }
        }
        if (contentValues.containsKey("IconUrl")) {
            this.field_IconUrl = contentValues.getAsString("IconUrl");
            if (z17) {
                this.f237258h = true;
            }
        }
        if (contentValues.containsKey("BriefIntro")) {
            this.field_BriefIntro = contentValues.getAsString("BriefIntro");
            if (z17) {
                this.f237259i = true;
            }
        }
        if (contentValues.containsKey("isSync")) {
            this.field_isSync = contentValues.getAsInteger("isSync").intValue() != 0;
            if (z17) {
                this.f237260m = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.field_debugType = contentValues.getAsInteger("debugType").intValue();
            if (z17) {
                this.f237261n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237262o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
