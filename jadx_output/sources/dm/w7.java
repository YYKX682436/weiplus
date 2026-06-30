package dm;

/* loaded from: classes15.dex */
public class w7 extends l75.f0 {
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
    public static final int f240826J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f240827v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f240828w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240829x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240830y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240831z;
    public int field_audioBitrate;
    public long field_cacheSize;
    public int field_codecFormat;
    public int field_duration;
    public int field_dynamicRangeType;
    public int field_frameRate;
    public boolean field_hasPlayed;
    public java.lang.String field_mediaId;
    public boolean field_moovReady;
    public java.lang.String field_specFormat;
    public int field_state;
    public long field_totalSize;
    public long field_updateTime;
    public java.lang.String field_url;
    public int field_videoBitrate;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240832d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240833e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240834f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240835g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240836h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240837i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240838m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240839n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240840o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240841p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240842q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240843r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240844s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240845t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240846u = true;

    static {
        p75.n0 n0Var = new p75.n0("MBThumbPlayerMediaInfoDbCache");
        f240827v = n0Var;
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
        f240828w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_Id ON MBThumbPlayerMediaInfoDbCache(mediaId)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_State ON MBThumbPlayerMediaInfoDbCache(state)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_SpecFormat ON MBThumbPlayerMediaInfoDbCache(specFormat)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_UpdateTime ON MBThumbPlayerMediaInfoDbCache(updateTime)"};
        f240829x = 940773407;
        f240830y = 116079;
        f240831z = -577311387;
        A = -553618781;
        B = 109757585;
        C = -366002675;
        D = 1504250797;
        E = -1986862190;
        F = -295931082;
        G = -374854630;
        H = -249426318;
        I = -1688626505;
        f240826J = 545057773;
        K = -1992012396;
        L = 505343128;
        M = 108705909;
        N = initAutoDBInfo(dm.w7.class);
        P = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "mediaId";
        e0Var.f316955d.put("mediaId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "mediaId";
        e0Var.f316954c[1] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[2] = "totalSize";
        e0Var.f316955d.put("totalSize", "LONG");
        e0Var.f316954c[3] = "cacheSize";
        e0Var.f316955d.put("cacheSize", "LONG");
        e0Var.f316954c[4] = "state";
        e0Var.f316955d.put("state", "INTEGER");
        e0Var.f316954c[5] = "hasPlayed";
        e0Var.f316955d.put("hasPlayed", "INTEGER");
        e0Var.f316954c[6] = "codecFormat";
        e0Var.f316955d.put("codecFormat", "INTEGER default '-1' ");
        e0Var.f316954c[7] = "specFormat";
        e0Var.f316955d.put("specFormat", "TEXT");
        e0Var.f316954c[8] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[9] = "moovReady";
        e0Var.f316955d.put("moovReady", "INTEGER default 'false' ");
        e0Var.f316954c[10] = "videoBitrate";
        e0Var.f316955d.put("videoBitrate", "INTEGER default '0' ");
        e0Var.f316954c[11] = "audioBitrate";
        e0Var.f316955d.put("audioBitrate", "INTEGER default '0' ");
        e0Var.f316954c[12] = "frameRate";
        e0Var.f316955d.put("frameRate", "INTEGER default '0' ");
        e0Var.f316954c[13] = "duration";
        e0Var.f316955d.put("duration", "INTEGER default '0' ");
        e0Var.f316954c[14] = "dynamicRangeType";
        e0Var.f316955d.put("dynamicRangeType", "INTEGER default '0' ");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " mediaId TEXT PRIMARY KEY ,  url TEXT,  totalSize LONG,  cacheSize LONG,  state INTEGER,  hasPlayed INTEGER,  codecFormat INTEGER default '-1' ,  specFormat TEXT,  updateTime LONG,  moovReady INTEGER default 'false' ,  videoBitrate INTEGER default '0' ,  audioBitrate INTEGER default '0' ,  frameRate INTEGER default '0' ,  duration INTEGER default '0' ,  dynamicRangeType INTEGER default '0' ";
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
            if (f240829x == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                    this.f240832d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240830y == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240831z == hashCode) {
                try {
                    this.field_totalSize = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_cacheSize = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasPlayed = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_codecFormat = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_specFormat = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_moovReady = z17;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_videoBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_audioBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240826J == hashCode) {
                try {
                    this.field_frameRate = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_duration = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_dynamicRangeType = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240832d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f240833e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f240834f) {
            contentValues.put("totalSize", java.lang.Long.valueOf(this.field_totalSize));
        }
        if (this.f240835g) {
            contentValues.put("cacheSize", java.lang.Long.valueOf(this.field_cacheSize));
        }
        if (this.f240836h) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f240837i) {
            if (this.field_hasPlayed) {
                contentValues.put("hasPlayed", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasPlayed", (java.lang.Integer) 0);
            }
        }
        if (this.f240838m) {
            contentValues.put("codecFormat", java.lang.Integer.valueOf(this.field_codecFormat));
        }
        if (this.f240839n) {
            contentValues.put("specFormat", this.field_specFormat);
        }
        if (this.f240840o) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f240841p) {
            if (this.field_moovReady) {
                contentValues.put("moovReady", (java.lang.Integer) 1);
            } else {
                contentValues.put("moovReady", (java.lang.Integer) 0);
            }
        }
        if (this.f240842q) {
            contentValues.put("videoBitrate", java.lang.Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f240843r) {
            contentValues.put("audioBitrate", java.lang.Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f240844s) {
            contentValues.put("frameRate", java.lang.Integer.valueOf(this.field_frameRate));
        }
        if (this.f240845t) {
            contentValues.put("duration", java.lang.Integer.valueOf(this.field_duration));
        }
        if (this.f240846u) {
            contentValues.put("dynamicRangeType", java.lang.Integer.valueOf(this.field_dynamicRangeType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MBThumbPlayerMediaInfoDbCache ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240828w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTableSql %s", str2);
            k0Var.A("MBThumbPlayerMediaInfoDbCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MBThumbPlayerMediaInfoDbCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "updateTableSql %s", str3);
            k0Var.A("MBThumbPlayerMediaInfoDbCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return N;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return P;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_mediaId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240827v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240827v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f240832d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f240833e = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsLong("totalSize").longValue();
            if (z17) {
                this.f240834f = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsLong("cacheSize").longValue();
            if (z17) {
                this.f240835g = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f240836h = true;
            }
        }
        if (contentValues.containsKey("hasPlayed")) {
            this.field_hasPlayed = contentValues.getAsInteger("hasPlayed").intValue() != 0;
            if (z17) {
                this.f240837i = true;
            }
        }
        if (contentValues.containsKey("codecFormat")) {
            this.field_codecFormat = contentValues.getAsInteger("codecFormat").intValue();
            if (z17) {
                this.f240838m = true;
            }
        }
        if (contentValues.containsKey("specFormat")) {
            this.field_specFormat = contentValues.getAsString("specFormat");
            if (z17) {
                this.f240839n = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240840o = true;
            }
        }
        if (contentValues.containsKey("moovReady")) {
            this.field_moovReady = contentValues.getAsInteger("moovReady").intValue() != 0;
            if (z17) {
                this.f240841p = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z17) {
                this.f240842q = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z17) {
                this.f240843r = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z17) {
                this.f240844s = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z17) {
                this.f240845t = true;
            }
        }
        if (contentValues.containsKey("dynamicRangeType")) {
            this.field_dynamicRangeType = contentValues.getAsInteger("dynamicRangeType").intValue();
            if (z17) {
                this.f240846u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
