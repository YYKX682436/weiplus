package dm;

/* loaded from: classes7.dex */
public class f0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f236757J;
    public static final o75.e K;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f236758r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f236759s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f236760t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f236761u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f236762v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f236763w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236764x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236765y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236766z;
    public java.lang.String field_appId;
    public java.lang.String field_enterPath;
    public java.lang.String field_iconUrl;
    public boolean field_isGuideShown;
    public java.lang.String field_nickname;
    public java.lang.String field_savedImgPath;
    public long field_screenshotLastModified;
    public java.lang.String field_screenshotMd5;
    public java.lang.String field_screenshotPath;
    public int field_showSourceView;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236767d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236768e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236769f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236770g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236771h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236772i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236773m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236774n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236775o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236776p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236777q = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandScreenshotInfo");
        f236758r = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236759s = new p75.d("screenshotPath", "string", tableName, "");
        f236760t = new p75.d("screenshotLastModified", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236761u = new p75.d("savedImgPath", "string", tableName, "");
        f236762v = new p75.d("isGuideShown", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236763w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS screenshotLastModifiedIndex ON AppBrandScreenshotInfo(screenshotLastModified)", "CREATE INDEX IF NOT EXISTS savedImgPathIndex ON AppBrandScreenshotInfo(savedImgPath)"};
        f236764x = -525976917;
        f236765y = 617739269;
        f236766z = 1784145464;
        A = 93028124;
        B = 70690926;
        C = 1638765110;
        D = -858148067;
        E = 1639770625;
        F = -2069572545;
        G = 482701373;
        H = 689108018;
        I = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = "screenshotPath";
        ((java.util.HashMap) e0Var.f316955d).put("screenshotPath", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "screenshotPath";
        e0Var.f316954c[1] = "screenshotLastModified";
        ((java.util.HashMap) e0Var.f316955d).put("screenshotLastModified", "LONG");
        e0Var.f316954c[2] = "screenshotMd5";
        ((java.util.HashMap) e0Var.f316955d).put("screenshotMd5", "TEXT");
        e0Var.f316954c[3] = "appId";
        ((java.util.HashMap) e0Var.f316955d).put("appId", "TEXT");
        e0Var.f316954c[4] = "nickname";
        ((java.util.HashMap) e0Var.f316955d).put("nickname", "TEXT");
        e0Var.f316954c[5] = "iconUrl";
        ((java.util.HashMap) e0Var.f316955d).put("iconUrl", "TEXT");
        e0Var.f316954c[6] = "enterPath";
        ((java.util.HashMap) e0Var.f316955d).put("enterPath", "TEXT");
        e0Var.f316954c[7] = "savedImgPath";
        ((java.util.HashMap) e0Var.f316955d).put("savedImgPath", "TEXT");
        e0Var.f316954c[8] = "isGuideShown";
        ((java.util.HashMap) e0Var.f316955d).put("isGuideShown", "INTEGER default 'false' ");
        e0Var.f316954c[9] = "showSourceView";
        ((java.util.HashMap) e0Var.f316955d).put("showSourceView", "INTEGER default '0' ");
        e0Var.f316954c[10] = "versionType";
        ((java.util.HashMap) e0Var.f316955d).put("versionType", "INTEGER default '0' ");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " screenshotPath TEXT PRIMARY KEY ,  screenshotLastModified LONG,  screenshotMd5 TEXT,  appId TEXT,  nickname TEXT,  iconUrl TEXT,  enterPath TEXT,  savedImgPath TEXT,  isGuideShown INTEGER default 'false' ,  showSourceView INTEGER default '0' ,  versionType INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f236757J = e0Var;
        K = new o75.e();
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
            if (f236764x == hashCode) {
                try {
                    this.field_screenshotPath = cursor.getString(i17);
                    this.f236767d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236765y == hashCode) {
                try {
                    this.field_screenshotLastModified = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236766z == hashCode) {
                try {
                    this.field_screenshotMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_iconUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_enterPath = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_savedImgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isGuideShown = z17;
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_showSourceView = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236767d) {
            contentValues.put("screenshotPath", this.field_screenshotPath);
        }
        if (this.f236768e) {
            contentValues.put("screenshotLastModified", java.lang.Long.valueOf(this.field_screenshotLastModified));
        }
        if (this.f236769f) {
            contentValues.put("screenshotMd5", this.field_screenshotMd5);
        }
        if (this.f236770g) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236771h) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f236772i) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        if (this.f236773m) {
            contentValues.put("enterPath", this.field_enterPath);
        }
        if (this.f236774n) {
            contentValues.put("savedImgPath", this.field_savedImgPath);
        }
        if (this.f236775o) {
            if (this.field_isGuideShown) {
                contentValues.put("isGuideShown", (java.lang.Integer) 1);
            } else {
                contentValues.put("isGuideShown", (java.lang.Integer) 0);
            }
        }
        if (this.f236776p) {
            contentValues.put("showSourceView", java.lang.Integer.valueOf(this.field_showSourceView));
        }
        if (this.f236777q) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandScreenshotInfo ( ");
        l75.e0 e0Var = f236757J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236763w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTableSql %s", str2);
            k0Var.A("AppBrandScreenshotInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandScreenshotInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "updateTableSql %s", str3);
            k0Var.A("AppBrandScreenshotInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236757J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_screenshotPath;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236758r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236758r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("screenshotPath")) {
            this.field_screenshotPath = contentValues.getAsString("screenshotPath");
            if (z17) {
                this.f236767d = true;
            }
        }
        if (contentValues.containsKey("screenshotLastModified")) {
            this.field_screenshotLastModified = contentValues.getAsLong("screenshotLastModified").longValue();
            if (z17) {
                this.f236768e = true;
            }
        }
        if (contentValues.containsKey("screenshotMd5")) {
            this.field_screenshotMd5 = contentValues.getAsString("screenshotMd5");
            if (z17) {
                this.f236769f = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236770g = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f236771h = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f236772i = true;
            }
        }
        if (contentValues.containsKey("enterPath")) {
            this.field_enterPath = contentValues.getAsString("enterPath");
            if (z17) {
                this.f236773m = true;
            }
        }
        if (contentValues.containsKey("savedImgPath")) {
            this.field_savedImgPath = contentValues.getAsString("savedImgPath");
            if (z17) {
                this.f236774n = true;
            }
        }
        if (contentValues.containsKey("isGuideShown")) {
            this.field_isGuideShown = contentValues.getAsInteger("isGuideShown").intValue() != 0;
            if (z17) {
                this.f236775o = true;
            }
        }
        if (contentValues.containsKey("showSourceView")) {
            this.field_showSourceView = contentValues.getAsInteger("showSourceView").intValue();
            if (z17) {
                this.f236776p = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f236777q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
