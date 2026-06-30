package dm;

/* loaded from: classes8.dex */
public class u5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f240301q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f240302r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240303s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240304t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240305u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240306v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240307w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240308x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240309y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240310z;
    public java.lang.String field_appId;
    public long field_checkCgiTime;
    public long field_createTime;
    public byte[] field_downloadItemList;
    public int field_expiredSeconds;
    public long field_finishDownloadTime;
    public int field_intervalSeconds;
    public java.lang.String field_packageName;
    public int field_scene;
    public long field_taskExpiredSeconds;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240311d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240312e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240313f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240314g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240315h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240316i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240317m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240318n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240319o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240320p = true;

    static {
        p75.n0 n0Var = new p75.n0("GameResourceDownload");
        f240301q = n0Var;
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
        f240302r = new java.lang.String[0];
        f240303s = 908759025;
        f240304t = 93028124;
        f240305u = -972749318;
        f240306v = 230741914;
        f240307w = 1369213417;
        f240308x = 656275146;
        f240309y = -684021848;
        f240310z = 540279545;
        A = 1471892607;
        B = 109254796;
        C = 108705909;
        D = initAutoDBInfo(dm.u5.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, "TEXT PRIMARY KEY ");
        e0Var.f316953b = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME;
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "intervalSeconds";
        e0Var.f316955d.put("intervalSeconds", "INTEGER");
        e0Var.f316954c[3] = "expiredSeconds";
        e0Var.f316955d.put("expiredSeconds", "INTEGER");
        e0Var.f316954c[4] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[5] = "checkCgiTime";
        e0Var.f316955d.put("checkCgiTime", "LONG");
        e0Var.f316954c[6] = "finishDownloadTime";
        e0Var.f316955d.put("finishDownloadTime", "LONG");
        e0Var.f316954c[7] = "downloadItemList";
        e0Var.f316955d.put("downloadItemList", "BLOB");
        e0Var.f316954c[8] = "taskExpiredSeconds";
        e0Var.f316955d.put("taskExpiredSeconds", "LONG");
        e0Var.f316954c[9] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " packageName TEXT PRIMARY KEY ,  appId TEXT,  intervalSeconds INTEGER,  expiredSeconds INTEGER,  createTime LONG,  checkCgiTime LONG,  finishDownloadTime LONG,  downloadItemList BLOB,  taskExpiredSeconds LONG,  scene INTEGER";
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
            if (f240303s == hashCode) {
                try {
                    this.field_packageName = cursor.getString(i17);
                    this.f240311d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240304t == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240305u == hashCode) {
                try {
                    this.field_intervalSeconds = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240306v == hashCode) {
                try {
                    this.field_expiredSeconds = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240307w == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240308x == hashCode) {
                try {
                    this.field_checkCgiTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240309y == hashCode) {
                try {
                    this.field_finishDownloadTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240310z == hashCode) {
                try {
                    this.field_downloadItemList = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_taskExpiredSeconds = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameResourceDownload", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240311d) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, this.field_packageName);
        }
        if (this.f240312e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f240313f) {
            contentValues.put("intervalSeconds", java.lang.Integer.valueOf(this.field_intervalSeconds));
        }
        if (this.f240314g) {
            contentValues.put("expiredSeconds", java.lang.Integer.valueOf(this.field_expiredSeconds));
        }
        if (this.f240315h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f240316i) {
            contentValues.put("checkCgiTime", java.lang.Long.valueOf(this.field_checkCgiTime));
        }
        if (this.f240317m) {
            contentValues.put("finishDownloadTime", java.lang.Long.valueOf(this.field_finishDownloadTime));
        }
        if (this.f240318n) {
            contentValues.put("downloadItemList", this.field_downloadItemList);
        }
        if (this.f240319o) {
            contentValues.put("taskExpiredSeconds", java.lang.Long.valueOf(this.field_taskExpiredSeconds));
        }
        if (this.f240320p) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameResourceDownload", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameResourceDownload ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240302r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "createTableSql %s", str2);
            k0Var.A("GameResourceDownload", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameResourceDownload", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "updateTableSql %s", str3);
            k0Var.A("GameResourceDownload", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_packageName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240301q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240301q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME)) {
            this.field_packageName = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            if (z17) {
                this.f240311d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f240312e = true;
            }
        }
        if (contentValues.containsKey("intervalSeconds")) {
            this.field_intervalSeconds = contentValues.getAsInteger("intervalSeconds").intValue();
            if (z17) {
                this.f240313f = true;
            }
        }
        if (contentValues.containsKey("expiredSeconds")) {
            this.field_expiredSeconds = contentValues.getAsInteger("expiredSeconds").intValue();
            if (z17) {
                this.f240314g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f240315h = true;
            }
        }
        if (contentValues.containsKey("checkCgiTime")) {
            this.field_checkCgiTime = contentValues.getAsLong("checkCgiTime").longValue();
            if (z17) {
                this.f240316i = true;
            }
        }
        if (contentValues.containsKey("finishDownloadTime")) {
            this.field_finishDownloadTime = contentValues.getAsLong("finishDownloadTime").longValue();
            if (z17) {
                this.f240317m = true;
            }
        }
        if (contentValues.containsKey("downloadItemList")) {
            this.field_downloadItemList = contentValues.getAsByteArray("downloadItemList");
            if (z17) {
                this.f240318n = true;
            }
        }
        if (contentValues.containsKey("taskExpiredSeconds")) {
            this.field_taskExpiredSeconds = contentValues.getAsLong("taskExpiredSeconds").longValue();
            if (z17) {
                this.f240319o = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f240320p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
