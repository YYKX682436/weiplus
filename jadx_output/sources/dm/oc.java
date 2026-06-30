package dm;

/* loaded from: classes8.dex */
public class oc extends l75.f0 {
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
    public static final int f239033J;
    public static final int K;
    public static final l75.e0 L;
    public static final o75.e M;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f239034u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f239035v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239036w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239037x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239038y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239039z;
    public int field_autoDownloadCount;
    public boolean field_completeDownload;
    public long field_createTime;
    public int field_downloadNetType;
    public java.lang.String field_downloadUrl;
    public int field_fileDownloadCount;
    public java.lang.String field_filePath;
    public java.lang.String field_key;
    public java.lang.String field_md5;
    public java.lang.String field_mimeType;
    public java.lang.String field_pkgId;
    public java.lang.String field_rid;
    public int field_size;
    public java.lang.String field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239040d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239041e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239042f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239043g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239044h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239045i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239046m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239047n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239048o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239049p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239050q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239051r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239052s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239053t = true;

    static {
        p75.n0 n0Var = new p75.n0("WepkgPreloadFiles");
        f239034u = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239035v = new java.lang.String[0];
        f239036w = 106079;
        f239037x = 106723335;
        f239038y = 351608024;
        f239039z = -735662143;
        A = 112909;
        B = -1392120434;
        C = 107902;
        D = -1211148345;
        E = 3530753;
        F = -2057421617;
        G = 1018565857;
        H = 1369213417;
        I = 2123822072;
        f239033J = -577982133;
        K = 108705909;
        L = initAutoDBInfo(dm.oc.class);
        M = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "pkgId";
        e0Var.f316955d.put("pkgId", "TEXT");
        e0Var.f316954c[2] = "version";
        e0Var.f316955d.put("version", "TEXT");
        e0Var.f316954c[3] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        e0Var.f316954c[4] = "rid";
        e0Var.f316955d.put("rid", "TEXT");
        e0Var.f316954c[5] = "mimeType";
        e0Var.f316955d.put("mimeType", "TEXT");
        e0Var.f316954c[6] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[7] = "downloadUrl";
        e0Var.f316955d.put("downloadUrl", "TEXT");
        e0Var.f316954c[8] = "size";
        e0Var.f316955d.put("size", "INTEGER");
        e0Var.f316954c[9] = "downloadNetType";
        e0Var.f316955d.put("downloadNetType", "INTEGER");
        e0Var.f316954c[10] = "completeDownload";
        e0Var.f316955d.put("completeDownload", "INTEGER default 'false' ");
        e0Var.f316954c[11] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[12] = "autoDownloadCount";
        e0Var.f316955d.put("autoDownloadCount", "INTEGER default '0' ");
        e0Var.f316954c[13] = "fileDownloadCount";
        e0Var.f316955d.put("fileDownloadCount", "INTEGER default '0' ");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  pkgId TEXT,  version TEXT,  filePath TEXT,  rid TEXT,  mimeType TEXT,  md5 TEXT,  downloadUrl TEXT,  size INTEGER,  downloadNetType INTEGER,  completeDownload INTEGER default 'false' ,  createTime LONG,  autoDownloadCount INTEGER default '0' ,  fileDownloadCount INTEGER default '0' ";
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
            if (f239036w == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f239040d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239037x == hashCode) {
                try {
                    this.field_pkgId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239038y == hashCode) {
                try {
                    this.field_version = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239039z == hashCode) {
                try {
                    this.field_filePath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_rid = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_mimeType = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_downloadUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_size = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_downloadNetType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_completeDownload = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_autoDownloadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239033J == hashCode) {
                try {
                    this.field_fileDownloadCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239040d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f239041e) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f239042f) {
            contentValues.put("version", this.field_version);
        }
        if (this.f239043g) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f239044h) {
            contentValues.put("rid", this.field_rid);
        }
        if (this.f239045i) {
            contentValues.put("mimeType", this.field_mimeType);
        }
        if (this.f239046m) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f239047n) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f239048o) {
            contentValues.put("size", java.lang.Integer.valueOf(this.field_size));
        }
        if (this.f239049p) {
            contentValues.put("downloadNetType", java.lang.Integer.valueOf(this.field_downloadNetType));
        }
        if (this.f239050q) {
            if (this.field_completeDownload) {
                contentValues.put("completeDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("completeDownload", (java.lang.Integer) 0);
            }
        }
        if (this.f239051r) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f239052s) {
            contentValues.put("autoDownloadCount", java.lang.Integer.valueOf(this.field_autoDownloadCount));
        }
        if (this.f239053t) {
            contentValues.put("fileDownloadCount", java.lang.Integer.valueOf(this.field_fileDownloadCount));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WepkgPreloadFiles ( ");
        l75.e0 e0Var = L;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239035v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTableSql %s", str2);
            k0Var.A("WepkgPreloadFiles", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WepkgPreloadFiles", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "updateTableSql %s", str3);
            k0Var.A("WepkgPreloadFiles", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return L;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return M;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239034u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239034u.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f239040d = true;
            }
        }
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z17) {
                this.f239041e = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsString("version");
            if (z17) {
                this.f239042f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f239043g = true;
            }
        }
        if (contentValues.containsKey("rid")) {
            this.field_rid = contentValues.getAsString("rid");
            if (z17) {
                this.f239044h = true;
            }
        }
        if (contentValues.containsKey("mimeType")) {
            this.field_mimeType = contentValues.getAsString("mimeType");
            if (z17) {
                this.f239045i = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f239046m = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f239047n = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f239048o = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.field_downloadNetType = contentValues.getAsInteger("downloadNetType").intValue();
            if (z17) {
                this.f239049p = true;
            }
        }
        if (contentValues.containsKey("completeDownload")) {
            this.field_completeDownload = contentValues.getAsInteger("completeDownload").intValue() != 0;
            if (z17) {
                this.f239050q = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239051r = true;
            }
        }
        if (contentValues.containsKey("autoDownloadCount")) {
            this.field_autoDownloadCount = contentValues.getAsInteger("autoDownloadCount").intValue();
            if (z17) {
                this.f239052s = true;
            }
        }
        if (contentValues.containsKey("fileDownloadCount")) {
            this.field_fileDownloadCount = contentValues.getAsInteger("fileDownloadCount").intValue();
            if (z17) {
                this.f239053t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
