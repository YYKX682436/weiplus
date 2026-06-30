package dm;

/* loaded from: classes4.dex */
public class na extends l75.f0 {
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
    public static final int f238770J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f238771w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f238772x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238773y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238774z;
    public java.lang.String field_cacheVideo;
    public long field_finderCheckTime;
    public byte[] field_finderObject;
    public java.lang.String field_imageBgUrl;
    public boolean field_isLike;
    public java.lang.String field_localImage;
    public java.lang.String field_localThumb;
    public java.lang.String field_localVideo;
    public long field_size;
    public long field_snsBgId;
    public int field_snsCoverOffset;
    public boolean field_success;
    public java.lang.String field_thumbUrl;
    public int field_type;
    public java.lang.String field_userName;
    public java.lang.String field_videoBgUrl;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238775d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238776e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238777f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238778g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238779h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238780i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238781m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238782n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238783o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238784p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238785q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238786r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238787s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238788t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f238789u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f238790v = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsCover");
        f238771w = n0Var;
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
        f238772x = new java.lang.String[0];
        f238773y = -266666762;
        f238774z = 3575610;
        A = -2053780008;
        B = 1566917561;
        C = -1469962673;
        D = -1645039825;
        E = 1293208875;
        F = 1283179696;
        G = 1295069136;
        H = 20436505;
        I = 463590149;
        f238770J = 87579247;
        K = -1867169789;
        L = -1180333087;
        M = 3530753;
        N = -1175253358;
        P = 108705909;
        Q = initAutoDBInfo(dm.na.class);
        R = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        e0Var.f316955d.put("userName", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "userName";
        e0Var.f316954c[1] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[2] = "snsBgId";
        e0Var.f316955d.put("snsBgId", "LONG");
        e0Var.f316954c[3] = "thumbUrl";
        e0Var.f316955d.put("thumbUrl", "TEXT");
        e0Var.f316954c[4] = "imageBgUrl";
        e0Var.f316955d.put("imageBgUrl", "TEXT");
        e0Var.f316954c[5] = "videoBgUrl";
        e0Var.f316955d.put("videoBgUrl", "TEXT");
        e0Var.f316954c[6] = "localThumb";
        e0Var.f316955d.put("localThumb", "TEXT");
        e0Var.f316954c[7] = "localImage";
        e0Var.f316955d.put("localImage", "TEXT");
        e0Var.f316954c[8] = "localVideo";
        e0Var.f316955d.put("localVideo", "TEXT");
        e0Var.f316954c[9] = "cacheVideo";
        e0Var.f316955d.put("cacheVideo", "TEXT");
        e0Var.f316954c[10] = dm.i4.COL_FINDEROBJECT;
        e0Var.f316955d.put(dm.i4.COL_FINDEROBJECT, "BLOB");
        e0Var.f316954c[11] = "finderCheckTime";
        e0Var.f316955d.put("finderCheckTime", "LONG");
        e0Var.f316954c[12] = ya.b.SUCCESS;
        e0Var.f316955d.put(ya.b.SUCCESS, "INTEGER default 'false' ");
        e0Var.f316954c[13] = "isLike";
        e0Var.f316955d.put("isLike", "INTEGER default 'false' ");
        e0Var.f316954c[14] = "size";
        e0Var.f316955d.put("size", "LONG");
        e0Var.f316954c[15] = "snsCoverOffset";
        e0Var.f316955d.put("snsCoverOffset", "INTEGER");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " userName TEXT default ''  PRIMARY KEY ,  type INTEGER,  snsBgId LONG,  thumbUrl TEXT,  imageBgUrl TEXT,  videoBgUrl TEXT,  localThumb TEXT,  localImage TEXT,  localVideo TEXT,  cacheVideo TEXT,  finderObject BLOB,  finderCheckTime LONG,  success INTEGER default 'false' ,  isLike INTEGER default 'false' ,  size LONG,  snsCoverOffset INTEGER";
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
            if (f238773y == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                    this.f238775d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238774z == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_snsBgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_thumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_imageBgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_videoBgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_localThumb = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_localImage = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_localVideo = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_cacheVideo = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_finderObject = cursor.getBlob(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238770J == hashCode) {
                try {
                    this.field_finderCheckTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_success = z17;
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isLike = z17;
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_snsCoverOffset = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th21, "convertFrom %s", columnNames[i17]);
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
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f238775d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f238776e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238777f) {
            contentValues.put("snsBgId", java.lang.Long.valueOf(this.field_snsBgId));
        }
        if (this.f238778g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f238779h) {
            contentValues.put("imageBgUrl", this.field_imageBgUrl);
        }
        if (this.f238780i) {
            contentValues.put("videoBgUrl", this.field_videoBgUrl);
        }
        if (this.f238781m) {
            contentValues.put("localThumb", this.field_localThumb);
        }
        if (this.f238782n) {
            contentValues.put("localImage", this.field_localImage);
        }
        if (this.f238783o) {
            contentValues.put("localVideo", this.field_localVideo);
        }
        if (this.f238784p) {
            contentValues.put("cacheVideo", this.field_cacheVideo);
        }
        if (this.f238785q) {
            contentValues.put(dm.i4.COL_FINDEROBJECT, this.field_finderObject);
        }
        if (this.f238786r) {
            contentValues.put("finderCheckTime", java.lang.Long.valueOf(this.field_finderCheckTime));
        }
        if (this.f238787s) {
            if (this.field_success) {
                contentValues.put(ya.b.SUCCESS, (java.lang.Integer) 1);
            } else {
                contentValues.put(ya.b.SUCCESS, (java.lang.Integer) 0);
            }
        }
        if (this.f238788t) {
            if (this.field_isLike) {
                contentValues.put("isLike", (java.lang.Integer) 1);
            } else {
                contentValues.put("isLike", (java.lang.Integer) 0);
            }
        }
        if (this.f238789u) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f238790v) {
            contentValues.put("snsCoverOffset", java.lang.Integer.valueOf(this.field_snsCoverOffset));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsCover", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsCover ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238772x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsCover", "createTableSql %s", str2);
            k0Var.A("SnsCover", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsCover", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsCover", "updateTableSql %s", str3);
            k0Var.A("SnsCover", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsCover", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_userName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238771w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238771w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f238775d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238776e = true;
            }
        }
        if (contentValues.containsKey("snsBgId")) {
            this.field_snsBgId = contentValues.getAsLong("snsBgId").longValue();
            if (z17) {
                this.f238777f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f238778g = true;
            }
        }
        if (contentValues.containsKey("imageBgUrl")) {
            this.field_imageBgUrl = contentValues.getAsString("imageBgUrl");
            if (z17) {
                this.f238779h = true;
            }
        }
        if (contentValues.containsKey("videoBgUrl")) {
            this.field_videoBgUrl = contentValues.getAsString("videoBgUrl");
            if (z17) {
                this.f238780i = true;
            }
        }
        if (contentValues.containsKey("localThumb")) {
            this.field_localThumb = contentValues.getAsString("localThumb");
            if (z17) {
                this.f238781m = true;
            }
        }
        if (contentValues.containsKey("localImage")) {
            this.field_localImage = contentValues.getAsString("localImage");
            if (z17) {
                this.f238782n = true;
            }
        }
        if (contentValues.containsKey("localVideo")) {
            this.field_localVideo = contentValues.getAsString("localVideo");
            if (z17) {
                this.f238783o = true;
            }
        }
        if (contentValues.containsKey("cacheVideo")) {
            this.field_cacheVideo = contentValues.getAsString("cacheVideo");
            if (z17) {
                this.f238784p = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_FINDEROBJECT)) {
            this.field_finderObject = contentValues.getAsByteArray(dm.i4.COL_FINDEROBJECT);
            if (z17) {
                this.f238785q = true;
            }
        }
        if (contentValues.containsKey("finderCheckTime")) {
            this.field_finderCheckTime = contentValues.getAsLong("finderCheckTime").longValue();
            if (z17) {
                this.f238786r = true;
            }
        }
        if (contentValues.containsKey(ya.b.SUCCESS)) {
            this.field_success = contentValues.getAsInteger(ya.b.SUCCESS).intValue() != 0;
            if (z17) {
                this.f238787s = true;
            }
        }
        if (contentValues.containsKey("isLike")) {
            this.field_isLike = contentValues.getAsInteger("isLike").intValue() != 0;
            if (z17) {
                this.f238788t = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f238789u = true;
            }
        }
        if (contentValues.containsKey("snsCoverOffset")) {
            this.field_snsCoverOffset = contentValues.getAsInteger("snsCoverOffset").intValue();
            if (z17) {
                this.f238790v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
