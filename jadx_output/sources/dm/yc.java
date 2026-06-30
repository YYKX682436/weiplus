package dm;

/* loaded from: classes7.dex */
public class yc extends l75.f0 {
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
    public static final int f241323J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f241324v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f241325w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241326x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241327y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241328z;
    public int field_arch;
    public int field_consumingSnapshotCount;
    public java.lang.String field_produceSnapshotConfig;
    public java.lang.String field_produceSnapshotFlag;
    public int field_producingSnapshotCount;
    public int field_recoverCount;
    public java.lang.String field_snapshotCategory;
    public long field_snapshotLastModified;
    public long field_snapshotLength;
    public java.lang.String field_snapshotMetaInfo;
    public java.lang.String field_snapshotPath;
    public java.lang.String field_v8Version;
    public java.lang.String field_wxaPkgMd5;
    public java.lang.String field_wxaPkgPath;
    public int field_wxaPkgVersion;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241329d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241330e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241331f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241332g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241333h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241334i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241335m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241336n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241337o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241338p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241339q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241340r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241341s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241342t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241343u = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaPkgV8SnapshotInfoV2");
        f241324v = n0Var;
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
        f241325w = new java.lang.String[0];
        f241326x = 3002454;
        f241327y = -1360790959;
        f241328z = 925931986;
        A = 2016003884;
        B = -1996836874;
        C = 1701671718;
        D = -266299312;
        E = -224922910;
        F = -931648503;
        G = -1992054941;
        H = -2072012342;
        I = -726230473;
        f241323J = -1148597490;
        K = 217120882;
        L = 1953886731;
        M = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "arch";
        ((java.util.HashMap) e0Var.f316955d).put("arch", "INTEGER");
        e0Var.f316954c[1] = "wxaPkgPath";
        ((java.util.HashMap) e0Var.f316955d).put("wxaPkgPath", "TEXT");
        e0Var.f316954c[2] = "wxaPkgMd5";
        ((java.util.HashMap) e0Var.f316955d).put("wxaPkgMd5", "TEXT");
        e0Var.f316954c[3] = "wxaPkgVersion";
        ((java.util.HashMap) e0Var.f316955d).put("wxaPkgVersion", "INTEGER");
        e0Var.f316954c[4] = "v8Version";
        ((java.util.HashMap) e0Var.f316955d).put("v8Version", "TEXT");
        e0Var.f316954c[5] = "produceSnapshotConfig";
        ((java.util.HashMap) e0Var.f316955d).put("produceSnapshotConfig", "TEXT");
        e0Var.f316954c[6] = "produceSnapshotFlag";
        ((java.util.HashMap) e0Var.f316955d).put("produceSnapshotFlag", "TEXT");
        e0Var.f316954c[7] = "snapshotCategory";
        ((java.util.HashMap) e0Var.f316955d).put("snapshotCategory", "TEXT");
        e0Var.f316954c[8] = "snapshotPath";
        ((java.util.HashMap) e0Var.f316955d).put("snapshotPath", "TEXT");
        e0Var.f316954c[9] = "snapshotLastModified";
        ((java.util.HashMap) e0Var.f316955d).put("snapshotLastModified", "LONG");
        e0Var.f316954c[10] = "snapshotLength";
        ((java.util.HashMap) e0Var.f316955d).put("snapshotLength", "LONG");
        e0Var.f316954c[11] = "snapshotMetaInfo";
        ((java.util.HashMap) e0Var.f316955d).put("snapshotMetaInfo", "TEXT");
        e0Var.f316954c[12] = "producingSnapshotCount";
        ((java.util.HashMap) e0Var.f316955d).put("producingSnapshotCount", "INTEGER default '0' ");
        e0Var.f316954c[13] = "consumingSnapshotCount";
        ((java.util.HashMap) e0Var.f316955d).put("consumingSnapshotCount", "INTEGER default '0' ");
        e0Var.f316954c[14] = "recoverCount";
        ((java.util.HashMap) e0Var.f316955d).put("recoverCount", "INTEGER default '0' ");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " arch INTEGER,  wxaPkgPath TEXT,  wxaPkgMd5 TEXT,  wxaPkgVersion INTEGER,  v8Version TEXT,  produceSnapshotConfig TEXT,  produceSnapshotFlag TEXT,  snapshotCategory TEXT,  snapshotPath TEXT,  snapshotLastModified LONG,  snapshotLength LONG,  snapshotMetaInfo TEXT,  producingSnapshotCount INTEGER default '0' ,  consumingSnapshotCount INTEGER default '0' ,  recoverCount INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        N = e0Var;
        P = new o75.e();
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
            if (f241326x == hashCode) {
                try {
                    this.field_arch = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241327y == hashCode) {
                try {
                    this.field_wxaPkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241328z == hashCode) {
                try {
                    this.field_wxaPkgMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_wxaPkgVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_v8Version = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_produceSnapshotConfig = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_produceSnapshotFlag = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_snapshotCategory = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_snapshotPath = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_snapshotLastModified = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_snapshotLength = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_snapshotMetaInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241323J == hashCode) {
                try {
                    this.field_producingSnapshotCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_consumingSnapshotCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_recoverCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th20, "convertFrom %s", columnNames[i17]);
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
        if (this.f241329d) {
            contentValues.put("arch", java.lang.Integer.valueOf(this.field_arch));
        }
        if (this.f241330e) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f241331f) {
            contentValues.put("wxaPkgMd5", this.field_wxaPkgMd5);
        }
        if (this.f241332g) {
            contentValues.put("wxaPkgVersion", java.lang.Integer.valueOf(this.field_wxaPkgVersion));
        }
        if (this.f241333h) {
            contentValues.put("v8Version", this.field_v8Version);
        }
        if (this.f241334i) {
            contentValues.put("produceSnapshotConfig", this.field_produceSnapshotConfig);
        }
        if (this.f241335m) {
            contentValues.put("produceSnapshotFlag", this.field_produceSnapshotFlag);
        }
        if (this.f241336n) {
            contentValues.put("snapshotCategory", this.field_snapshotCategory);
        }
        if (this.f241337o) {
            contentValues.put("snapshotPath", this.field_snapshotPath);
        }
        if (this.f241338p) {
            contentValues.put("snapshotLastModified", java.lang.Long.valueOf(this.field_snapshotLastModified));
        }
        if (this.f241339q) {
            contentValues.put("snapshotLength", java.lang.Long.valueOf(this.field_snapshotLength));
        }
        if (this.f241340r) {
            contentValues.put("snapshotMetaInfo", this.field_snapshotMetaInfo);
        }
        if (this.f241341s) {
            contentValues.put("producingSnapshotCount", java.lang.Integer.valueOf(this.field_producingSnapshotCount));
        }
        if (this.f241342t) {
            contentValues.put("consumingSnapshotCount", java.lang.Integer.valueOf(this.field_consumingSnapshotCount));
        }
        if (this.f241343u) {
            contentValues.put("recoverCount", java.lang.Integer.valueOf(this.field_recoverCount));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaPkgV8SnapshotInfoV2 ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241325w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTableSql %s", str2);
            k0Var.A("WxaPkgV8SnapshotInfoV2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaPkgV8SnapshotInfoV2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "updateTableSql %s", str3);
            k0Var.A("WxaPkgV8SnapshotInfoV2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241324v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241324v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("arch")) {
            this.field_arch = contentValues.getAsInteger("arch").intValue();
            if (z17) {
                this.f241329d = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z17) {
                this.f241330e = true;
            }
        }
        if (contentValues.containsKey("wxaPkgMd5")) {
            this.field_wxaPkgMd5 = contentValues.getAsString("wxaPkgMd5");
            if (z17) {
                this.f241331f = true;
            }
        }
        if (contentValues.containsKey("wxaPkgVersion")) {
            this.field_wxaPkgVersion = contentValues.getAsInteger("wxaPkgVersion").intValue();
            if (z17) {
                this.f241332g = true;
            }
        }
        if (contentValues.containsKey("v8Version")) {
            this.field_v8Version = contentValues.getAsString("v8Version");
            if (z17) {
                this.f241333h = true;
            }
        }
        if (contentValues.containsKey("produceSnapshotConfig")) {
            this.field_produceSnapshotConfig = contentValues.getAsString("produceSnapshotConfig");
            if (z17) {
                this.f241334i = true;
            }
        }
        if (contentValues.containsKey("produceSnapshotFlag")) {
            this.field_produceSnapshotFlag = contentValues.getAsString("produceSnapshotFlag");
            if (z17) {
                this.f241335m = true;
            }
        }
        if (contentValues.containsKey("snapshotCategory")) {
            this.field_snapshotCategory = contentValues.getAsString("snapshotCategory");
            if (z17) {
                this.f241336n = true;
            }
        }
        if (contentValues.containsKey("snapshotPath")) {
            this.field_snapshotPath = contentValues.getAsString("snapshotPath");
            if (z17) {
                this.f241337o = true;
            }
        }
        if (contentValues.containsKey("snapshotLastModified")) {
            this.field_snapshotLastModified = contentValues.getAsLong("snapshotLastModified").longValue();
            if (z17) {
                this.f241338p = true;
            }
        }
        if (contentValues.containsKey("snapshotLength")) {
            this.field_snapshotLength = contentValues.getAsLong("snapshotLength").longValue();
            if (z17) {
                this.f241339q = true;
            }
        }
        if (contentValues.containsKey("snapshotMetaInfo")) {
            this.field_snapshotMetaInfo = contentValues.getAsString("snapshotMetaInfo");
            if (z17) {
                this.f241340r = true;
            }
        }
        if (contentValues.containsKey("producingSnapshotCount")) {
            this.field_producingSnapshotCount = contentValues.getAsInteger("producingSnapshotCount").intValue();
            if (z17) {
                this.f241341s = true;
            }
        }
        if (contentValues.containsKey("consumingSnapshotCount")) {
            this.field_consumingSnapshotCount = contentValues.getAsInteger("consumingSnapshotCount").intValue();
            if (z17) {
                this.f241342t = true;
            }
        }
        if (contentValues.containsKey("recoverCount")) {
            this.field_recoverCount = contentValues.getAsInteger("recoverCount").intValue();
            if (z17) {
                this.f241343u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
