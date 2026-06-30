package dm;

/* loaded from: classes7.dex */
public class u1 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f240234p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f240235q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240236r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240237s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240238t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240239u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240240v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240241w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240242x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240243y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240244z;
    public java.lang.Boolean field_allowMobileNetDownload;
    public java.lang.String field_downloadUrl;
    public int field_downloadUrlHashCode;
    public java.lang.String field_filePath;
    public java.lang.Boolean field_game_package_download;
    public java.lang.String field_httpsUrl;
    public java.lang.String field_mediaId;
    public java.lang.String field_verifyHeaders;
    public java.lang.Boolean field_wifiAutoDownload;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240245d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240246e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240247f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240248g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240249h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240250i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240251m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240252n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240253o = true;

    static {
        p75.n0 n0Var = new p75.n0("CdnDownloadInfo");
        f240234p = n0Var;
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
        f240235q = new java.lang.String[0];
        f240236r = 940773407;
        f240237s = 140685570;
        f240238t = -1211148345;
        f240239u = -132179836;
        f240240v = -735662143;
        f240241w = 952415437;
        f240242x = 927624462;
        f240243y = -1737220358;
        f240244z = -596510964;
        A = 108705909;
        B = initAutoDBInfo(dm.u1.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "mediaId";
        e0Var.f316955d.put("mediaId", "TEXT");
        e0Var.f316954c[1] = "downloadUrlHashCode";
        e0Var.f316955d.put("downloadUrlHashCode", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "downloadUrlHashCode";
        e0Var.f316954c[2] = "downloadUrl";
        e0Var.f316955d.put("downloadUrl", "TEXT");
        e0Var.f316954c[3] = "httpsUrl";
        e0Var.f316955d.put("httpsUrl", "TEXT");
        e0Var.f316954c[4] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        e0Var.f316954c[5] = "verifyHeaders";
        e0Var.f316955d.put("verifyHeaders", "TEXT");
        e0Var.f316954c[6] = "game_package_download";
        e0Var.f316955d.put("game_package_download", "INTEGER");
        e0Var.f316954c[7] = "allowMobileNetDownload";
        e0Var.f316955d.put("allowMobileNetDownload", "INTEGER");
        e0Var.f316954c[8] = "wifiAutoDownload";
        e0Var.f316955d.put("wifiAutoDownload", "INTEGER");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " mediaId TEXT,  downloadUrlHashCode INTEGER PRIMARY KEY ,  downloadUrl TEXT,  httpsUrl TEXT,  filePath TEXT,  verifyHeaders TEXT,  game_package_download INTEGER,  allowMobileNetDownload INTEGER,  wifiAutoDownload INTEGER";
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
            if (f240236r == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else {
                boolean z17 = true;
                if (f240237s == hashCode) {
                    try {
                        this.field_downloadUrlHashCode = cursor.getInt(i17);
                        this.f240246e = true;
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th7, "convertFrom %s", columnNames[i17]);
                        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240238t == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i17);
                    } catch (java.lang.Throwable th8) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th8, "convertFrom %s", columnNames[i17]);
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240239u == hashCode) {
                    try {
                        this.field_httpsUrl = cursor.getString(i17);
                    } catch (java.lang.Throwable th9) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th9, "convertFrom %s", columnNames[i17]);
                        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240240v == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i17);
                    } catch (java.lang.Throwable th10) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th10, "convertFrom %s", columnNames[i17]);
                        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240241w == hashCode) {
                    try {
                        this.field_verifyHeaders = cursor.getString(i17);
                    } catch (java.lang.Throwable th11) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th11, "convertFrom %s", columnNames[i17]);
                        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240242x == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.field_game_package_download = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th12) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th12, "convertFrom %s", columnNames[i17]);
                        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240243y == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.field_allowMobileNetDownload = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th13) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th13, "convertFrom %s", columnNames[i17]);
                        java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (f240244z == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.field_wifiAutoDownload = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th14) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th14, "convertFrom %s", columnNames[i17]);
                        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (A == hashCode) {
                    this.systemRowid = cursor.getLong(i17);
                }
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240245d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f240246e) {
            contentValues.put("downloadUrlHashCode", java.lang.Integer.valueOf(this.field_downloadUrlHashCode));
        }
        if (this.f240247f) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f240248g) {
            contentValues.put("httpsUrl", this.field_httpsUrl);
        }
        if (this.f240249h) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f240250i) {
            contentValues.put("verifyHeaders", this.field_verifyHeaders);
        }
        if (this.f240251m) {
            if (this.field_game_package_download.booleanValue()) {
                contentValues.put("game_package_download", (java.lang.Integer) 1);
            } else {
                contentValues.put("game_package_download", (java.lang.Integer) 0);
            }
        }
        if (this.f240252n) {
            if (this.field_allowMobileNetDownload.booleanValue()) {
                contentValues.put("allowMobileNetDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("allowMobileNetDownload", (java.lang.Integer) 0);
            }
        }
        if (this.f240253o) {
            if (this.field_wifiAutoDownload.booleanValue()) {
                contentValues.put("wifiAutoDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("wifiAutoDownload", (java.lang.Integer) 0);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CdnDownloadInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240235q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTableSql %s", str2);
            k0Var.A("CdnDownloadInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CdnDownloadInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "updateTableSql %s", str3);
            k0Var.A("CdnDownloadInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.field_downloadUrlHashCode);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240234p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240234p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f240245d = true;
            }
        }
        if (contentValues.containsKey("downloadUrlHashCode")) {
            this.field_downloadUrlHashCode = contentValues.getAsInteger("downloadUrlHashCode").intValue();
            if (z17) {
                this.f240246e = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f240247f = true;
            }
        }
        if (contentValues.containsKey("httpsUrl")) {
            this.field_httpsUrl = contentValues.getAsString("httpsUrl");
            if (z17) {
                this.f240248g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f240249h = true;
            }
        }
        if (contentValues.containsKey("verifyHeaders")) {
            this.field_verifyHeaders = contentValues.getAsString("verifyHeaders");
            if (z17) {
                this.f240250i = true;
            }
        }
        if (contentValues.containsKey("game_package_download")) {
            this.field_game_package_download = java.lang.Boolean.valueOf(contentValues.getAsInteger("game_package_download").intValue() != 0);
            if (z17) {
                this.f240251m = true;
            }
        }
        if (contentValues.containsKey("allowMobileNetDownload")) {
            this.field_allowMobileNetDownload = java.lang.Boolean.valueOf(contentValues.getAsInteger("allowMobileNetDownload").intValue() != 0);
            if (z17) {
                this.f240252n = true;
            }
        }
        if (contentValues.containsKey("wifiAutoDownload")) {
            this.field_wifiAutoDownload = java.lang.Boolean.valueOf(contentValues.getAsInteger("wifiAutoDownload").intValue() != 0);
            if (z17) {
                this.f240253o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
