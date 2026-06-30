package dm;

/* loaded from: classes4.dex */
public class z7 extends l75.f0 {
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
    public static final l75.e0 f241489J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f241490t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f241491u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f241492v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f241493w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241494x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241495y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241496z;
    public byte[] field_attrBuf;
    public int field_commentListCount;
    public byte[] field_content;
    public int field_createTime;
    public int field_favoriteTime;
    public int field_itemStoryFlag;
    public int field_localFlag;
    public byte[] field_postBuf;
    public int field_readCount;
    public int field_sourceType;
    public long field_storyID;
    public int field_type;
    public java.lang.String field_userName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241497d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241498e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241499f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241500g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241501h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241502i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241503m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241504n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241505o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241506p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241507q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241508r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241509s = true;

    static {
        p75.n0 n0Var = new p75.n0("MMStoryInfo");
        f241490t = n0Var;
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
        f241491u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MMStoryInfo_id_Index ON MMStoryInfo(storyID)"};
        f241492v = -1884251952;
        f241493w = -266666762;
        f241494x = -1205623433;
        f241495y = 1369213417;
        f241496z = -866758798;
        A = 951530617;
        B = -674882878;
        C = -391239245;
        D = -1111431691;
        E = 3575610;
        F = -283421650;
        G = -1139436263;
        H = 525558409;
        I = 108705909;
        f241489J = initAutoDBInfo(dm.z7.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "storyID";
        e0Var.f316955d.put("storyID", "LONG");
        e0Var.f316954c[1] = "userName";
        e0Var.f316955d.put("userName", "TEXT");
        e0Var.f316954c[2] = "localFlag";
        e0Var.f316955d.put("localFlag", "INTEGER");
        e0Var.f316954c[3] = "createTime";
        e0Var.f316955d.put("createTime", "INTEGER");
        e0Var.f316954c[4] = "commentListCount";
        e0Var.f316955d.put("commentListCount", "INTEGER");
        e0Var.f316954c[5] = "content";
        e0Var.f316955d.put("content", "BLOB");
        e0Var.f316954c[6] = "attrBuf";
        e0Var.f316955d.put("attrBuf", "BLOB");
        e0Var.f316954c[7] = "postBuf";
        e0Var.f316955d.put("postBuf", "BLOB");
        e0Var.f316954c[8] = "sourceType";
        e0Var.f316955d.put("sourceType", "INTEGER");
        e0Var.f316954c[9] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[10] = "itemStoryFlag";
        e0Var.f316955d.put("itemStoryFlag", "INTEGER");
        e0Var.f316954c[11] = "readCount";
        e0Var.f316955d.put("readCount", "INTEGER");
        e0Var.f316954c[12] = "favoriteTime";
        e0Var.f316955d.put("favoriteTime", "INTEGER");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " storyID LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  commentListCount INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  sourceType INTEGER,  type INTEGER,  itemStoryFlag INTEGER,  readCount INTEGER,  favoriteTime INTEGER";
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
            if (f241492v == hashCode) {
                try {
                    this.field_storyID = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241493w == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241494x == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241495y == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241496z == hashCode) {
                try {
                    this.field_commentListCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_attrBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_postBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_itemStoryFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_readCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_favoriteTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241497d) {
            contentValues.put("storyID", java.lang.Long.valueOf(this.field_storyID));
        }
        if (this.f241498e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f241499f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.f241500g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f241501h) {
            contentValues.put("commentListCount", java.lang.Integer.valueOf(this.field_commentListCount));
        }
        if (this.f241502i) {
            contentValues.put("content", this.field_content);
        }
        if (this.f241503m) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.f241504n) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.f241505o) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        }
        if (this.f241506p) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f241507q) {
            contentValues.put("itemStoryFlag", java.lang.Integer.valueOf(this.field_itemStoryFlag));
        }
        if (this.f241508r) {
            contentValues.put("readCount", java.lang.Integer.valueOf(this.field_readCount));
        }
        if (this.f241509s) {
            contentValues.put("favoriteTime", java.lang.Integer.valueOf(this.field_favoriteTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMMStoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MMStoryInfo ( ");
        l75.e0 e0Var = f241489J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241491u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "createTableSql %s", str2);
            k0Var.A("MMStoryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MMStoryInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "updateTableSql %s", str3);
            k0Var.A("MMStoryInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241489J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241490t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241490t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyID")) {
            this.field_storyID = contentValues.getAsLong("storyID").longValue();
            if (z17) {
                this.f241497d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f241498e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f241499f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f241500g = true;
            }
        }
        if (contentValues.containsKey("commentListCount")) {
            this.field_commentListCount = contentValues.getAsInteger("commentListCount").intValue();
            if (z17) {
                this.f241501h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f241502i = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.f241503m = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.f241504n = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f241505o = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f241506p = true;
            }
        }
        if (contentValues.containsKey("itemStoryFlag")) {
            this.field_itemStoryFlag = contentValues.getAsInteger("itemStoryFlag").intValue();
            if (z17) {
                this.f241507q = true;
            }
        }
        if (contentValues.containsKey("readCount")) {
            this.field_readCount = contentValues.getAsInteger("readCount").intValue();
            if (z17) {
                this.f241508r = true;
            }
        }
        if (contentValues.containsKey("favoriteTime")) {
            this.field_favoriteTime = contentValues.getAsInteger("favoriteTime").intValue();
            if (z17) {
                this.f241509s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
