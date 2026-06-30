package dm;

/* loaded from: classes7.dex */
public class f9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236898n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f236899o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236900p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236901q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236902r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236903s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236904t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236905u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236906v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236907w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f236908x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f236909y;
    public int field_fileCacheComplete;
    public java.lang.String field_fileName;
    public byte[] field_indexBitData;
    public java.lang.String field_musicId;
    public java.lang.String field_musicUrl;
    public java.lang.String field_pieceFileMIMEType;
    public int field_removeDirtyBit;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236910d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236911e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236912f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236913g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236914h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236915i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236916m = true;

    static {
        p75.n0 n0Var = new p75.n0("PieceMusicInfo");
        f236898n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236899o = new java.lang.String[0];
        f236900p = 1412694560;
        f236901q = 843870474;
        f236902r = -735721945;
        f236903s = 476696869;
        f236904t = 898934463;
        f236905u = 1262717208;
        f236906v = -1333948289;
        f236907w = 108705909;
        f236908x = initAutoDBInfo(dm.f9.class);
        f236909y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "musicId";
        e0Var.f316955d.put("musicId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "musicId";
        e0Var.f316954c[1] = "musicUrl";
        e0Var.f316955d.put("musicUrl", "TEXT");
        e0Var.f316954c[2] = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "TEXT");
        e0Var.f316954c[3] = "indexBitData";
        e0Var.f316955d.put("indexBitData", "BLOB");
        e0Var.f316954c[4] = "fileCacheComplete";
        e0Var.f316955d.put("fileCacheComplete", "INTEGER");
        e0Var.f316954c[5] = "pieceFileMIMEType";
        e0Var.f316955d.put("pieceFileMIMEType", "TEXT");
        e0Var.f316954c[6] = "removeDirtyBit";
        e0Var.f316955d.put("removeDirtyBit", "INTEGER");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " musicId TEXT PRIMARY KEY ,  musicUrl TEXT,  fileName TEXT,  indexBitData BLOB,  fileCacheComplete INTEGER,  pieceFileMIMEType TEXT,  removeDirtyBit INTEGER";
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
            if (f236900p == hashCode) {
                try {
                    this.field_musicId = cursor.getString(i17);
                    this.f236910d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236901q == hashCode) {
                try {
                    this.field_musicUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236902r == hashCode) {
                try {
                    this.field_fileName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236903s == hashCode) {
                try {
                    this.field_indexBitData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236904t == hashCode) {
                try {
                    this.field_fileCacheComplete = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236905u == hashCode) {
                try {
                    this.field_pieceFileMIMEType = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236906v == hashCode) {
                try {
                    this.field_removeDirtyBit = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236907w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236910d) {
            contentValues.put("musicId", this.field_musicId);
        }
        if (this.f236911e) {
            contentValues.put("musicUrl", this.field_musicUrl);
        }
        if (this.f236912f) {
            contentValues.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.f236913g) {
            contentValues.put("indexBitData", this.field_indexBitData);
        }
        if (this.f236914h) {
            contentValues.put("fileCacheComplete", java.lang.Integer.valueOf(this.field_fileCacheComplete));
        }
        if (this.f236915i) {
            contentValues.put("pieceFileMIMEType", this.field_pieceFileMIMEType);
        }
        if (this.f236916m) {
            contentValues.put("removeDirtyBit", java.lang.Integer.valueOf(this.field_removeDirtyBit));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePieceMusicInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PieceMusicInfo ( ");
        l75.e0 e0Var = f236908x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236899o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "createTableSql %s", str2);
            k0Var.A("PieceMusicInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PieceMusicInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "updateTableSql %s", str3);
            k0Var.A("PieceMusicInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236908x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236909y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_musicId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236898n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236898n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("musicId")) {
            this.field_musicId = contentValues.getAsString("musicId");
            if (z17) {
                this.f236910d = true;
            }
        }
        if (contentValues.containsKey("musicUrl")) {
            this.field_musicUrl = contentValues.getAsString("musicUrl");
            if (z17) {
                this.f236911e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
            if (z17) {
                this.f236912f = true;
            }
        }
        if (contentValues.containsKey("indexBitData")) {
            this.field_indexBitData = contentValues.getAsByteArray("indexBitData");
            if (z17) {
                this.f236913g = true;
            }
        }
        if (contentValues.containsKey("fileCacheComplete")) {
            this.field_fileCacheComplete = contentValues.getAsInteger("fileCacheComplete").intValue();
            if (z17) {
                this.f236914h = true;
            }
        }
        if (contentValues.containsKey("pieceFileMIMEType")) {
            this.field_pieceFileMIMEType = contentValues.getAsString("pieceFileMIMEType");
            if (z17) {
                this.f236915i = true;
            }
        }
        if (contentValues.containsKey("removeDirtyBit")) {
            this.field_removeDirtyBit = contentValues.getAsInteger("removeDirtyBit").intValue();
            if (z17) {
                this.f236916m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
