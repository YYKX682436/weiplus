package dm;

/* loaded from: classes15.dex */
public class x7 extends l75.f0 {
    public static final java.lang.String[] A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f241040J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final l75.e0 W;
    public static final o75.e X;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f241041z;
    public int field_audioBitrate;
    public long field_cacheSize;
    public int field_codecFormat;
    public java.lang.String field_decodeKey;
    public int field_duration;
    public int field_dynamicRangeType;
    public int field_frameRate;
    public boolean field_hasPlayed;
    public java.lang.String field_mediaId;
    public boolean field_moovReady;
    public java.lang.String field_netProfile;
    public java.lang.String field_originMediaId;
    public java.lang.String field_specFormat;
    public int field_state;
    public long field_totalSize;
    public long field_updateTime;
    public java.lang.String field_url;
    public java.lang.String field_urlToken;
    public int field_videoBitrate;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241042d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241043e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241044f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241045g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241046h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241047i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241048m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241049n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241050o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241051p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241052q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241053r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241054s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241055t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241056u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f241057v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f241058w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f241059x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f241060y = true;

    static {
        p75.n0 n0Var = new p75.n0("MMPlayerMediaInfoDbCache");
        f241041z = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_id ON MMPlayerMediaInfoDbCache(mediaId)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_state ON MMPlayerMediaInfoDbCache(state)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_origin_media_id ON MMPlayerMediaInfoDbCache(originMediaId)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_specFormat ON MMPlayerMediaInfoDbCache(specFormat)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_updateTime ON MMPlayerMediaInfoDbCache(updateTime)"};
        B = 940773407;
        C = 116079;
        D = -577311387;
        E = -553618781;
        F = 109757585;
        G = -366002675;
        H = 1504250797;
        I = 1097056793;
        f241040J = -1986862190;
        K = -295931082;
        L = -374854630;
        M = -249426318;
        N = -1688626505;
        P = 545057773;
        Q = -1992012396;
        R = -980479542;
        S = 515188113;
        T = -648159924;
        U = 505343128;
        V = 108705909;
        W = initAutoDBInfo(dm.x7.class);
        X = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
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
        e0Var.f316954c[7] = "originMediaId";
        e0Var.f316955d.put("originMediaId", "TEXT");
        e0Var.f316954c[8] = "specFormat";
        e0Var.f316955d.put("specFormat", "TEXT");
        e0Var.f316954c[9] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[10] = "moovReady";
        e0Var.f316955d.put("moovReady", "INTEGER default 'false' ");
        e0Var.f316954c[11] = "videoBitrate";
        e0Var.f316955d.put("videoBitrate", "INTEGER default '0' ");
        e0Var.f316954c[12] = "audioBitrate";
        e0Var.f316955d.put("audioBitrate", "INTEGER default '0' ");
        e0Var.f316954c[13] = "frameRate";
        e0Var.f316955d.put("frameRate", "INTEGER default '0' ");
        e0Var.f316954c[14] = "duration";
        e0Var.f316955d.put("duration", "INTEGER default '0' ");
        e0Var.f316954c[15] = "urlToken";
        e0Var.f316955d.put("urlToken", "TEXT default '' ");
        e0Var.f316954c[16] = "decodeKey";
        e0Var.f316955d.put("decodeKey", "TEXT default '' ");
        e0Var.f316954c[17] = "netProfile";
        e0Var.f316955d.put("netProfile", "TEXT default '' ");
        e0Var.f316954c[18] = "dynamicRangeType";
        e0Var.f316955d.put("dynamicRangeType", "INTEGER default '0' ");
        e0Var.f316954c[19] = "rowid";
        e0Var.f316956e = " mediaId TEXT PRIMARY KEY ,  url TEXT,  totalSize LONG,  cacheSize LONG,  state INTEGER,  hasPlayed INTEGER,  codecFormat INTEGER default '-1' ,  originMediaId TEXT,  specFormat TEXT,  updateTime LONG,  moovReady INTEGER default 'false' ,  videoBitrate INTEGER default '0' ,  audioBitrate INTEGER default '0' ,  frameRate INTEGER default '0' ,  duration INTEGER default '0' ,  urlToken TEXT default '' ,  decodeKey TEXT default '' ,  netProfile TEXT default '' ,  dynamicRangeType INTEGER default '0' ";
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
            if (B == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                    this.f241042d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_totalSize = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_cacheSize = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasPlayed = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_codecFormat = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_originMediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241040J == hashCode) {
                try {
                    this.field_specFormat = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_moovReady = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_videoBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_audioBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_frameRate = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_duration = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_urlToken = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_decodeKey = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_netProfile = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_dynamicRangeType = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241042d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f241043e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f241044f) {
            contentValues.put("totalSize", java.lang.Long.valueOf(this.field_totalSize));
        }
        if (this.f241045g) {
            contentValues.put("cacheSize", java.lang.Long.valueOf(this.field_cacheSize));
        }
        if (this.f241046h) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f241047i) {
            if (this.field_hasPlayed) {
                contentValues.put("hasPlayed", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasPlayed", (java.lang.Integer) 0);
            }
        }
        if (this.f241048m) {
            contentValues.put("codecFormat", java.lang.Integer.valueOf(this.field_codecFormat));
        }
        if (this.f241049n) {
            contentValues.put("originMediaId", this.field_originMediaId);
        }
        if (this.f241050o) {
            contentValues.put("specFormat", this.field_specFormat);
        }
        if (this.f241051p) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f241052q) {
            if (this.field_moovReady) {
                contentValues.put("moovReady", (java.lang.Integer) 1);
            } else {
                contentValues.put("moovReady", (java.lang.Integer) 0);
            }
        }
        if (this.f241053r) {
            contentValues.put("videoBitrate", java.lang.Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f241054s) {
            contentValues.put("audioBitrate", java.lang.Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f241055t) {
            contentValues.put("frameRate", java.lang.Integer.valueOf(this.field_frameRate));
        }
        if (this.f241056u) {
            contentValues.put("duration", java.lang.Integer.valueOf(this.field_duration));
        }
        if (this.field_urlToken == null) {
            this.field_urlToken = "";
        }
        if (this.f241057v) {
            contentValues.put("urlToken", this.field_urlToken);
        }
        if (this.field_decodeKey == null) {
            this.field_decodeKey = "";
        }
        if (this.f241058w) {
            contentValues.put("decodeKey", this.field_decodeKey);
        }
        if (this.field_netProfile == null) {
            this.field_netProfile = "";
        }
        if (this.f241059x) {
            contentValues.put("netProfile", this.field_netProfile);
        }
        if (this.f241060y) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MMPlayerMediaInfoDbCache ( ");
        l75.e0 e0Var = W;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTableSql %s", str2);
            k0Var.A("MMPlayerMediaInfoDbCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MMPlayerMediaInfoDbCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "updateTableSql %s", str3);
            k0Var.A("MMPlayerMediaInfoDbCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return W;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return X;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_mediaId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241041z;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241041z.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f241042d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f241043e = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsLong("totalSize").longValue();
            if (z17) {
                this.f241044f = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsLong("cacheSize").longValue();
            if (z17) {
                this.f241045g = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f241046h = true;
            }
        }
        if (contentValues.containsKey("hasPlayed")) {
            this.field_hasPlayed = contentValues.getAsInteger("hasPlayed").intValue() != 0;
            if (z17) {
                this.f241047i = true;
            }
        }
        if (contentValues.containsKey("codecFormat")) {
            this.field_codecFormat = contentValues.getAsInteger("codecFormat").intValue();
            if (z17) {
                this.f241048m = true;
            }
        }
        if (contentValues.containsKey("originMediaId")) {
            this.field_originMediaId = contentValues.getAsString("originMediaId");
            if (z17) {
                this.f241049n = true;
            }
        }
        if (contentValues.containsKey("specFormat")) {
            this.field_specFormat = contentValues.getAsString("specFormat");
            if (z17) {
                this.f241050o = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f241051p = true;
            }
        }
        if (contentValues.containsKey("moovReady")) {
            this.field_moovReady = contentValues.getAsInteger("moovReady").intValue() != 0;
            if (z17) {
                this.f241052q = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z17) {
                this.f241053r = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z17) {
                this.f241054s = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z17) {
                this.f241055t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z17) {
                this.f241056u = true;
            }
        }
        if (contentValues.containsKey("urlToken")) {
            this.field_urlToken = contentValues.getAsString("urlToken");
            if (z17) {
                this.f241057v = true;
            }
        }
        if (contentValues.containsKey("decodeKey")) {
            this.field_decodeKey = contentValues.getAsString("decodeKey");
            if (z17) {
                this.f241058w = true;
            }
        }
        if (contentValues.containsKey("netProfile")) {
            this.field_netProfile = contentValues.getAsString("netProfile");
            if (z17) {
                this.f241059x = true;
            }
        }
        if (contentValues.containsKey("dynamicRangeType")) {
            this.field_dynamicRangeType = contentValues.getAsInteger("dynamicRangeType").intValue();
            if (z17) {
                this.f241060y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
