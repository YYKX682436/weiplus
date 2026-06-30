package dm;

/* loaded from: classes4.dex */
public class fb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f236937i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f236938m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236939n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236940o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236941p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236942q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236943r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236944s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f236945t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f236946u;
    public int field_cacheSize;
    public java.lang.String field_filePath;
    public long field_storyId;
    public int field_totalSize;
    public java.lang.String field_url;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236947d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236948e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236949f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236950g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236951h = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryVideoCacheInfo");
        f236937i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236938m = new java.lang.String[0];
        f236939n = -1884251920;
        f236940o = 116079;
        f236941p = -735662143;
        f236942q = -577311387;
        f236943r = -553618781;
        f236944s = 108705909;
        f236945t = initAutoDBInfo(dm.fb.class);
        f236946u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "storyId";
        e0Var.f316955d.put("storyId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "storyId";
        e0Var.f316954c[1] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[2] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        e0Var.f316954c[3] = "totalSize";
        e0Var.f316955d.put("totalSize", "INTEGER");
        e0Var.f316954c[4] = "cacheSize";
        e0Var.f316955d.put("cacheSize", "INTEGER");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " storyId LONG PRIMARY KEY ,  url TEXT,  filePath TEXT,  totalSize INTEGER,  cacheSize INTEGER";
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
            if (f236939n == hashCode) {
                try {
                    this.field_storyId = cursor.getLong(i17);
                    this.f236947d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236940o == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236941p == hashCode) {
                try {
                    this.field_filePath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236942q == hashCode) {
                try {
                    this.field_totalSize = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236943r == hashCode) {
                try {
                    this.field_cacheSize = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236944s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236947d) {
            contentValues.put("storyId", java.lang.Long.valueOf(this.field_storyId));
        }
        if (this.f236948e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f236949f) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f236950g) {
            contentValues.put("totalSize", java.lang.Integer.valueOf(this.field_totalSize));
        }
        if (this.f236951h) {
            contentValues.put("cacheSize", java.lang.Integer.valueOf(this.field_cacheSize));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryVideoCacheInfo ( ");
        l75.e0 e0Var = f236945t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236938m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTableSql %s", str2);
            k0Var.A("StoryVideoCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StoryVideoCacheInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "updateTableSql %s", str3);
            k0Var.A("StoryVideoCacheInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236945t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236946u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_storyId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236937i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236937i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyId")) {
            this.field_storyId = contentValues.getAsLong("storyId").longValue();
            if (z17) {
                this.f236947d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f236948e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f236949f = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsInteger("totalSize").intValue();
            if (z17) {
                this.f236950g = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsInteger("cacheSize").intValue();
            if (z17) {
                this.f236951h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
