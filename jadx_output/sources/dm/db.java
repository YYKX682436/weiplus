package dm;

/* loaded from: classes4.dex */
public class db extends l75.f0 {
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
    public static final int f236443J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f236444y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f236445z;
    public long field_duration;
    public java.lang.String field_favoriteMd5;
    public long field_interactTime;
    public java.lang.String field_md5;
    public java.lang.String field_newThumbUrl;
    public java.lang.String field_newVideoUrl;
    public long field_preLoadResource;
    public java.lang.String field_preloadMediaId;
    public long field_preloadStoryId;
    public long field_readId;
    public long field_readTime;
    public int field_storyObjOneDay;
    public int field_storyPostTime;
    public long field_syncId;
    public long field_updateTime;
    public byte[] field_userInfo;
    public java.lang.String field_userName;
    public int field_userStoryFlag;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236446d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236447e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236448f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236449g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236450h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236451i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236452m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236453n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236454o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236455p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236456q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236457r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236458s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236459t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236460u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236461v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236462w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f236463x = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryExtItem");
        f236444y = n0Var;
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
        f236445z = new java.lang.String[0];
        A = -266666762;
        B = 107902;
        C = -620940682;
        D = -1471303303;
        E = -1886842700;
        F = -295931082;
        G = -887494378;
        H = -934980271;
        I = 1049274274;
        f236443J = -1639503432;
        K = -867539581;
        L = -2120771929;
        M = 704253398;
        N = 1081069911;
        P = -1992012396;
        Q = -266803431;
        R = -1922716094;
        S = 1332040227;
        T = 108705909;
        U = initAutoDBInfo(dm.db.class);
        V = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        e0Var.f316955d.put("userName", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "userName";
        e0Var.f316954c[1] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[2] = "userStoryFlag";
        e0Var.f316955d.put("userStoryFlag", "INTEGER");
        e0Var.f316954c[3] = "newThumbUrl";
        e0Var.f316955d.put("newThumbUrl", "TEXT");
        e0Var.f316954c[4] = "newVideoUrl";
        e0Var.f316955d.put("newVideoUrl", "TEXT");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = "syncId";
        e0Var.f316955d.put("syncId", "LONG");
        e0Var.f316954c[7] = "readId";
        e0Var.f316955d.put("readId", "LONG");
        e0Var.f316954c[8] = "storyPostTime";
        e0Var.f316955d.put("storyPostTime", "INTEGER");
        e0Var.f316954c[9] = "storyObjOneDay";
        e0Var.f316955d.put("storyObjOneDay", "INTEGER");
        e0Var.f316954c[10] = "readTime";
        e0Var.f316955d.put("readTime", "LONG");
        e0Var.f316954c[11] = "preloadStoryId";
        e0Var.f316955d.put("preloadStoryId", "LONG");
        e0Var.f316954c[12] = "preloadMediaId";
        e0Var.f316955d.put("preloadMediaId", "TEXT");
        e0Var.f316954c[13] = "preLoadResource";
        e0Var.f316955d.put("preLoadResource", "LONG");
        e0Var.f316954c[14] = "duration";
        e0Var.f316955d.put("duration", "LONG");
        e0Var.f316954c[15] = "userInfo";
        e0Var.f316955d.put("userInfo", "BLOB");
        e0Var.f316954c[16] = "favoriteMd5";
        e0Var.f316955d.put("favoriteMd5", "TEXT");
        e0Var.f316954c[17] = "interactTime";
        e0Var.f316955d.put("interactTime", "LONG");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " userName TEXT default ''  PRIMARY KEY ,  md5 TEXT,  userStoryFlag INTEGER,  newThumbUrl TEXT,  newVideoUrl TEXT,  updateTime LONG,  syncId LONG,  readId LONG,  storyPostTime INTEGER,  storyObjOneDay INTEGER,  readTime LONG,  preloadStoryId LONG,  preloadMediaId TEXT,  preLoadResource LONG,  duration LONG,  userInfo BLOB,  favoriteMd5 TEXT,  interactTime LONG";
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
            if (A == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                    this.f236446d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_userStoryFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_newThumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_newVideoUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_syncId = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_readId = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_storyPostTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236443J == hashCode) {
                try {
                    this.field_storyObjOneDay = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_readTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_preloadStoryId = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_preloadMediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_preLoadResource = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_duration = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_userInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_favoriteMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_interactTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryExtItem", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f236446d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f236447e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f236448f) {
            contentValues.put("userStoryFlag", java.lang.Integer.valueOf(this.field_userStoryFlag));
        }
        if (this.f236449g) {
            contentValues.put("newThumbUrl", this.field_newThumbUrl);
        }
        if (this.f236450h) {
            contentValues.put("newVideoUrl", this.field_newVideoUrl);
        }
        if (this.f236451i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f236452m) {
            contentValues.put("syncId", java.lang.Long.valueOf(this.field_syncId));
        }
        if (this.f236453n) {
            contentValues.put("readId", java.lang.Long.valueOf(this.field_readId));
        }
        if (this.f236454o) {
            contentValues.put("storyPostTime", java.lang.Integer.valueOf(this.field_storyPostTime));
        }
        if (this.f236455p) {
            contentValues.put("storyObjOneDay", java.lang.Integer.valueOf(this.field_storyObjOneDay));
        }
        if (this.f236456q) {
            contentValues.put("readTime", java.lang.Long.valueOf(this.field_readTime));
        }
        if (this.f236457r) {
            contentValues.put("preloadStoryId", java.lang.Long.valueOf(this.field_preloadStoryId));
        }
        if (this.f236458s) {
            contentValues.put("preloadMediaId", this.field_preloadMediaId);
        }
        if (this.f236459t) {
            contentValues.put("preLoadResource", java.lang.Long.valueOf(this.field_preLoadResource));
        }
        if (this.f236460u) {
            contentValues.put("duration", java.lang.Long.valueOf(this.field_duration));
        }
        if (this.f236461v) {
            contentValues.put("userInfo", this.field_userInfo);
        }
        if (this.f236462w) {
            contentValues.put("favoriteMd5", this.field_favoriteMd5);
        }
        if (this.f236463x) {
            contentValues.put("interactTime", java.lang.Long.valueOf(this.field_interactTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStoryExtItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryExtItem ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236445z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryExtItem", "createTableSql %s", str2);
            k0Var.A("StoryExtItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StoryExtItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryExtItem", "updateTableSql %s", str3);
            k0Var.A("StoryExtItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryExtItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return V;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236444y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236444y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f236446d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f236447e = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.field_userStoryFlag = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z17) {
                this.f236448f = true;
            }
        }
        if (contentValues.containsKey("newThumbUrl")) {
            this.field_newThumbUrl = contentValues.getAsString("newThumbUrl");
            if (z17) {
                this.f236449g = true;
            }
        }
        if (contentValues.containsKey("newVideoUrl")) {
            this.field_newVideoUrl = contentValues.getAsString("newVideoUrl");
            if (z17) {
                this.f236450h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f236451i = true;
            }
        }
        if (contentValues.containsKey("syncId")) {
            this.field_syncId = contentValues.getAsLong("syncId").longValue();
            if (z17) {
                this.f236452m = true;
            }
        }
        if (contentValues.containsKey("readId")) {
            this.field_readId = contentValues.getAsLong("readId").longValue();
            if (z17) {
                this.f236453n = true;
            }
        }
        if (contentValues.containsKey("storyPostTime")) {
            this.field_storyPostTime = contentValues.getAsInteger("storyPostTime").intValue();
            if (z17) {
                this.f236454o = true;
            }
        }
        if (contentValues.containsKey("storyObjOneDay")) {
            this.field_storyObjOneDay = contentValues.getAsInteger("storyObjOneDay").intValue();
            if (z17) {
                this.f236455p = true;
            }
        }
        if (contentValues.containsKey("readTime")) {
            this.field_readTime = contentValues.getAsLong("readTime").longValue();
            if (z17) {
                this.f236456q = true;
            }
        }
        if (contentValues.containsKey("preloadStoryId")) {
            this.field_preloadStoryId = contentValues.getAsLong("preloadStoryId").longValue();
            if (z17) {
                this.f236457r = true;
            }
        }
        if (contentValues.containsKey("preloadMediaId")) {
            this.field_preloadMediaId = contentValues.getAsString("preloadMediaId");
            if (z17) {
                this.f236458s = true;
            }
        }
        if (contentValues.containsKey("preLoadResource")) {
            this.field_preLoadResource = contentValues.getAsLong("preLoadResource").longValue();
            if (z17) {
                this.f236459t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f236460u = true;
            }
        }
        if (contentValues.containsKey("userInfo")) {
            this.field_userInfo = contentValues.getAsByteArray("userInfo");
            if (z17) {
                this.f236461v = true;
            }
        }
        if (contentValues.containsKey("favoriteMd5")) {
            this.field_favoriteMd5 = contentValues.getAsString("favoriteMd5");
            if (z17) {
                this.f236462w = true;
            }
        }
        if (contentValues.containsKey("interactTime")) {
            this.field_interactTime = contentValues.getAsLong("interactTime").longValue();
            if (z17) {
                this.f236463x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
