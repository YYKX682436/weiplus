package dm;

/* loaded from: classes8.dex */
public class p5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f239140s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f239141t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239142u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239143v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239144w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239145x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239146y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239147z;
    public java.lang.String field_appId;
    public java.lang.String field_appName;
    public java.lang.String field_coverPath;
    public long field_createTime;
    public java.lang.String field_desc;
    public long field_durationSec;
    public java.lang.String field_extJsonData;
    public java.lang.String field_fileId;
    public java.lang.String field_filePath;
    public java.lang.String field_orgFilePath;
    public java.lang.String field_title;
    public java.lang.String field_userId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239148d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239149e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239150f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239151g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239152h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239153i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239154m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239155n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239156o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239157p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239158q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239159r = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLocalVideoInfo");
        f239140s = n0Var;
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
        f239141t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_UserId ON GameLocalVideoInfo(userId)", "CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_AppId ON GameLocalVideoInfo(appId)"};
        f239142u = -1274507337;
        f239143v = -836030906;
        f239144w = 93028124;
        f239145x = -794136500;
        f239146y = -735662143;
        f239147z = -681075003;
        A = 1979611260;
        B = -37365261;
        C = 1369213417;
        D = -478077411;
        E = 110371416;
        F = 3079825;
        G = 108705909;
        H = initAutoDBInfo(dm.p5.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "fileId";
        e0Var.f316955d.put("fileId", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "fileId";
        e0Var.f316954c[1] = "userId";
        e0Var.f316955d.put("userId", "TEXT default '' ");
        e0Var.f316954c[2] = "appId";
        e0Var.f316955d.put("appId", "TEXT default '' ");
        e0Var.f316954c[3] = "appName";
        e0Var.f316955d.put("appName", "TEXT default '' ");
        e0Var.f316954c[4] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT default '' ");
        e0Var.f316954c[5] = "orgFilePath";
        e0Var.f316955d.put("orgFilePath", "TEXT default '' ");
        e0Var.f316954c[6] = "coverPath";
        e0Var.f316955d.put("coverPath", "TEXT default '' ");
        e0Var.f316954c[7] = "extJsonData";
        e0Var.f316955d.put("extJsonData", "TEXT default '' ");
        e0Var.f316954c[8] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[9] = "durationSec";
        e0Var.f316955d.put("durationSec", "LONG");
        e0Var.f316954c[10] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        e0Var.f316954c[11] = "desc";
        e0Var.f316955d.put("desc", "TEXT default '' ");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " fileId TEXT default ''  PRIMARY KEY ,  userId TEXT default '' ,  appId TEXT default '' ,  appName TEXT default '' ,  filePath TEXT default '' ,  orgFilePath TEXT default '' ,  coverPath TEXT default '' ,  extJsonData TEXT default '' ,  createTime LONG,  durationSec LONG,  title TEXT default '' ,  desc TEXT default '' ";
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
            if (f239142u == hashCode) {
                try {
                    this.field_fileId = cursor.getString(i17);
                    this.f239148d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239143v == hashCode) {
                try {
                    this.field_userId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239144w == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239145x == hashCode) {
                try {
                    this.field_appName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239146y == hashCode) {
                try {
                    this.field_filePath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239147z == hashCode) {
                try {
                    this.field_orgFilePath = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_coverPath = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_extJsonData = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_durationSec = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_fileId == null) {
            this.field_fileId = "";
        }
        if (this.f239148d) {
            contentValues.put("fileId", this.field_fileId);
        }
        if (this.field_userId == null) {
            this.field_userId = "";
        }
        if (this.f239149e) {
            contentValues.put("userId", this.field_userId);
        }
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f239150f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.field_appName == null) {
            this.field_appName = "";
        }
        if (this.f239151g) {
            contentValues.put("appName", this.field_appName);
        }
        if (this.field_filePath == null) {
            this.field_filePath = "";
        }
        if (this.f239152h) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.field_orgFilePath == null) {
            this.field_orgFilePath = "";
        }
        if (this.f239153i) {
            contentValues.put("orgFilePath", this.field_orgFilePath);
        }
        if (this.field_coverPath == null) {
            this.field_coverPath = "";
        }
        if (this.f239154m) {
            contentValues.put("coverPath", this.field_coverPath);
        }
        if (this.field_extJsonData == null) {
            this.field_extJsonData = "";
        }
        if (this.f239155n) {
            contentValues.put("extJsonData", this.field_extJsonData);
        }
        if (this.f239156o) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f239157p) {
            contentValues.put("durationSec", java.lang.Long.valueOf(this.field_durationSec));
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f239158q) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.field_desc == null) {
            this.field_desc = "";
        }
        if (this.f239159r) {
            contentValues.put("desc", this.field_desc);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLocalVideoInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239141t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTableSql %s", str2);
            k0Var.A("GameLocalVideoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameLocalVideoInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "updateTableSql %s", str3);
            k0Var.A("GameLocalVideoInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_fileId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239140s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239140s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("fileId")) {
            this.field_fileId = contentValues.getAsString("fileId");
            if (z17) {
                this.f239148d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z17) {
                this.f239149e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239150f = true;
            }
        }
        if (contentValues.containsKey("appName")) {
            this.field_appName = contentValues.getAsString("appName");
            if (z17) {
                this.f239151g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f239152h = true;
            }
        }
        if (contentValues.containsKey("orgFilePath")) {
            this.field_orgFilePath = contentValues.getAsString("orgFilePath");
            if (z17) {
                this.f239153i = true;
            }
        }
        if (contentValues.containsKey("coverPath")) {
            this.field_coverPath = contentValues.getAsString("coverPath");
            if (z17) {
                this.f239154m = true;
            }
        }
        if (contentValues.containsKey("extJsonData")) {
            this.field_extJsonData = contentValues.getAsString("extJsonData");
            if (z17) {
                this.f239155n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239156o = true;
            }
        }
        if (contentValues.containsKey("durationSec")) {
            this.field_durationSec = contentValues.getAsLong("durationSec").longValue();
            if (z17) {
                this.f239157p = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f239158q = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f239159r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
