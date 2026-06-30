package dm;

/* loaded from: classes8.dex */
public class j5 extends l75.f0 {
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
    public static final int f237786J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f237787w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f237788x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237789y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237790z;
    public java.lang.String field_compressPath;
    public int field_duration;
    public int field_editFlag;
    public java.lang.String field_filePath;
    public int field_height;
    public java.lang.String field_hostTaskId;
    public boolean field_isGif;
    public java.lang.String field_localId;
    public java.lang.String field_mediaId;
    public int field_mediaType;
    public java.lang.String field_mediaUrl;
    public long field_size;
    public java.lang.String field_thumbPath;
    public java.lang.String field_thumbPicUrl;
    public int field_uploadState;
    public int field_width;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237791d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237792e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237793f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237794g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237795h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237796i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237797m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237798n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237799o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237800p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237801q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237802r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237803s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237804t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237805u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237806v = true;

    static {
        p75.n0 n0Var = new p75.n0("GameHaowanMedia");
        f237787w = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237788x = new java.lang.String[0];
        f237789y = 338409958;
        f237790z = 940773407;
        A = 2140463422;
        B = -735662143;
        C = 1441088167;
        D = 1329639195;
        E = 113126854;
        F = -1221029593;
        G = -1992012396;
        H = 3530753;
        I = 100467258;
        f237786J = -900783381;
        K = -2110120709;
        L = 1053908752;
        M = -1092618936;
        N = 1601621142;
        P = 108705909;
        Q = initAutoDBInfo(dm.j5.class);
        R = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "mediaId";
        e0Var.f316955d.put("mediaId", "TEXT");
        e0Var.f316954c[2] = "mediaType";
        e0Var.f316955d.put("mediaType", "INTEGER");
        e0Var.f316954c[3] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        e0Var.f316954c[4] = "compressPath";
        e0Var.f316955d.put("compressPath", "TEXT");
        e0Var.f316954c[5] = "thumbPath";
        e0Var.f316955d.put("thumbPath", "TEXT");
        e0Var.f316954c[6] = "width";
        e0Var.f316955d.put("width", "INTEGER");
        e0Var.f316954c[7] = "height";
        e0Var.f316955d.put("height", "INTEGER");
        e0Var.f316954c[8] = "duration";
        e0Var.f316955d.put("duration", "INTEGER");
        e0Var.f316954c[9] = "size";
        e0Var.f316955d.put("size", "LONG");
        e0Var.f316954c[10] = "isGif";
        e0Var.f316955d.put("isGif", "INTEGER");
        e0Var.f316954c[11] = "mediaUrl";
        e0Var.f316955d.put("mediaUrl", "TEXT");
        e0Var.f316954c[12] = "thumbPicUrl";
        e0Var.f316955d.put("thumbPicUrl", "TEXT");
        e0Var.f316954c[13] = "uploadState";
        e0Var.f316955d.put("uploadState", "INTEGER default 'false' ");
        e0Var.f316954c[14] = "hostTaskId";
        e0Var.f316955d.put("hostTaskId", "TEXT");
        e0Var.f316954c[15] = "editFlag";
        e0Var.f316955d.put("editFlag", "INTEGER default '0' ");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " localId TEXT PRIMARY KEY ,  mediaId TEXT,  mediaType INTEGER,  filePath TEXT,  compressPath TEXT,  thumbPath TEXT,  width INTEGER,  height INTEGER,  duration INTEGER,  size LONG,  isGif INTEGER,  mediaUrl TEXT,  thumbPicUrl TEXT,  uploadState INTEGER default 'false' ,  hostTaskId TEXT,  editFlag INTEGER default '0' ";
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
            if (f237789y == hashCode) {
                try {
                    this.field_localId = cursor.getString(i17);
                    this.f237791d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237790z == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_mediaType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_filePath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_compressPath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_thumbPath = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_width = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_height = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_duration = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isGif = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237786J == hashCode) {
                try {
                    this.field_mediaUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_thumbPicUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_uploadState = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_hostTaskId = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_editFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237791d) {
            contentValues.put(dm.i4.COL_LOCALID, this.field_localId);
        }
        if (this.f237792e) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f237793f) {
            contentValues.put("mediaType", java.lang.Integer.valueOf(this.field_mediaType));
        }
        if (this.f237794g) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f237795h) {
            contentValues.put("compressPath", this.field_compressPath);
        }
        if (this.f237796i) {
            contentValues.put("thumbPath", this.field_thumbPath);
        }
        if (this.f237797m) {
            contentValues.put("width", java.lang.Integer.valueOf(this.field_width));
        }
        if (this.f237798n) {
            contentValues.put("height", java.lang.Integer.valueOf(this.field_height));
        }
        if (this.f237799o) {
            contentValues.put("duration", java.lang.Integer.valueOf(this.field_duration));
        }
        if (this.f237800p) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f237801q) {
            if (this.field_isGif) {
                contentValues.put("isGif", (java.lang.Integer) 1);
            } else {
                contentValues.put("isGif", (java.lang.Integer) 0);
            }
        }
        if (this.f237802r) {
            contentValues.put("mediaUrl", this.field_mediaUrl);
        }
        if (this.f237803s) {
            contentValues.put("thumbPicUrl", this.field_thumbPicUrl);
        }
        if (this.f237804t) {
            contentValues.put("uploadState", java.lang.Integer.valueOf(this.field_uploadState));
        }
        if (this.f237805u) {
            contentValues.put("hostTaskId", this.field_hostTaskId);
        }
        if (this.f237806v) {
            contentValues.put("editFlag", java.lang.Integer.valueOf(this.field_editFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameHaowanMedia", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameHaowanMedia ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237788x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanMedia", "createTableSql %s", str2);
            k0Var.A("GameHaowanMedia", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameHaowanMedia", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanMedia", "updateTableSql %s", str3);
            k0Var.A("GameHaowanMedia", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanMedia", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return R;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_localId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237787w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237787w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsString(dm.i4.COL_LOCALID);
            if (z17) {
                this.f237791d = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f237792e = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.field_mediaType = contentValues.getAsInteger("mediaType").intValue();
            if (z17) {
                this.f237793f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f237794g = true;
            }
        }
        if (contentValues.containsKey("compressPath")) {
            this.field_compressPath = contentValues.getAsString("compressPath");
            if (z17) {
                this.f237795h = true;
            }
        }
        if (contentValues.containsKey("thumbPath")) {
            this.field_thumbPath = contentValues.getAsString("thumbPath");
            if (z17) {
                this.f237796i = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.field_width = contentValues.getAsInteger("width").intValue();
            if (z17) {
                this.f237797m = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.field_height = contentValues.getAsInteger("height").intValue();
            if (z17) {
                this.f237798n = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z17) {
                this.f237799o = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f237800p = true;
            }
        }
        if (contentValues.containsKey("isGif")) {
            this.field_isGif = contentValues.getAsInteger("isGif").intValue() != 0;
            if (z17) {
                this.f237801q = true;
            }
        }
        if (contentValues.containsKey("mediaUrl")) {
            this.field_mediaUrl = contentValues.getAsString("mediaUrl");
            if (z17) {
                this.f237802r = true;
            }
        }
        if (contentValues.containsKey("thumbPicUrl")) {
            this.field_thumbPicUrl = contentValues.getAsString("thumbPicUrl");
            if (z17) {
                this.f237803s = true;
            }
        }
        if (contentValues.containsKey("uploadState")) {
            this.field_uploadState = contentValues.getAsInteger("uploadState").intValue();
            if (z17) {
                this.f237804t = true;
            }
        }
        if (contentValues.containsKey("hostTaskId")) {
            this.field_hostTaskId = contentValues.getAsString("hostTaskId");
            if (z17) {
                this.f237805u = true;
            }
        }
        if (contentValues.containsKey("editFlag")) {
            this.field_editFlag = contentValues.getAsInteger("editFlag").intValue();
            if (z17) {
                this.f237806v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
