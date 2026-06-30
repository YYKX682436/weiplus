package dm;

/* loaded from: classes7.dex */
public class w extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f240689n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f240690o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240691p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240692q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240693r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240694s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240695t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240696u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240697v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240698w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f240699x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f240700y;
    public java.lang.String field_appPath;
    public byte[] field_commonUseInfo;
    public int field_recordId;
    public int field_saveIndex;
    public long field_updateTime;
    public java.lang.String field_username;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240701d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240702e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240703f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240704g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240705h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240706i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240707m = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandCommonUseApp");
        f240689n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240690o = new java.lang.String[0];
        f240691p = -799234740;
        f240692q = -265713450;
        f240693r = 689108018;
        f240694s = -295931082;
        f240695t = 1109787242;
        f240696u = 163634517;
        f240697v = -794076698;
        f240698w = 108705909;
        f240699x = initAutoDBInfo(dm.w.class);
        f240700y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "recordId";
        e0Var.f316955d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "recordId";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = "commonUseInfo";
        e0Var.f316955d.put("commonUseInfo", "BLOB");
        e0Var.f316954c[5] = "saveIndex";
        e0Var.f316955d.put("saveIndex", "INTEGER");
        e0Var.f316954c[6] = "appPath";
        e0Var.f316955d.put("appPath", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " recordId INTEGER PRIMARY KEY ,  username TEXT,  versionType INTEGER,  updateTime LONG,  commonUseInfo BLOB,  saveIndex INTEGER,  appPath TEXT";
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
            if (f240691p == hashCode) {
                try {
                    this.field_recordId = cursor.getInt(i17);
                    this.f240701d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240692q == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240693r == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240694s == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240695t == hashCode) {
                try {
                    this.field_commonUseInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240696u == hashCode) {
                try {
                    this.field_saveIndex = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240697v == hashCode) {
                try {
                    this.field_appPath = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonUseApp", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240698w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240701d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.field_recordId));
        }
        if (this.f240702e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f240703f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f240704g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f240705h) {
            contentValues.put("commonUseInfo", this.field_commonUseInfo);
        }
        if (this.f240706i) {
            contentValues.put("saveIndex", java.lang.Integer.valueOf(this.field_saveIndex));
        }
        if (this.f240707m) {
            contentValues.put("appPath", this.field_appPath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandCommonUseApp ( ");
        l75.e0 e0Var = f240699x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240690o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTableSql %s", str2);
            k0Var.A("AppBrandCommonUseApp", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandCommonUseApp", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "updateTableSql %s", str3);
            k0Var.A("AppBrandCommonUseApp", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240699x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240700y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_recordId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240689n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240689n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f240701d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f240702e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f240703f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240704g = true;
            }
        }
        if (contentValues.containsKey("commonUseInfo")) {
            this.field_commonUseInfo = contentValues.getAsByteArray("commonUseInfo");
            if (z17) {
                this.f240705h = true;
            }
        }
        if (contentValues.containsKey("saveIndex")) {
            this.field_saveIndex = contentValues.getAsInteger("saveIndex").intValue();
            if (z17) {
                this.f240706i = true;
            }
        }
        if (contentValues.containsKey("appPath")) {
            this.field_appPath = contentValues.getAsString("appPath");
            if (z17) {
                this.f240707m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
