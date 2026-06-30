package ue3;

/* loaded from: classes7.dex */
public class a extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f426871s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f426872t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f426873u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f426874v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f426875w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f426876x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f426877y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f426878z;
    public long field_lastUseTime;
    public java.lang.String field_md5;
    public java.lang.String field_originalName;
    public java.lang.String field_patchId;
    public java.lang.String field_pkgId;
    public java.lang.String field_pkgPath;
    public int field_pkgType;
    public java.lang.String field_unZipPath;
    public long field_updateTime;
    public java.lang.String field_url;
    public java.lang.String field_version;
    public java.lang.String field_wxaPkgPath;

    /* renamed from: d, reason: collision with root package name */
    public boolean f426879d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f426880e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f426881f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f426882g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f426883h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f426884i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f426885m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f426886n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f426887o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f426888p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f426889q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f426890r = true;

    static {
        p75.n0 n0Var = new p75.n0("MagicPkgInfo");
        f426871s = n0Var;
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
        f426872t = new java.lang.String[0];
        f426873u = 106723335;
        f426874v = -517880815;
        f426875w = -1200238067;
        f426876x = -517738714;
        f426877y = -791595133;
        f426878z = -295931082;
        A = 351608024;
        B = 116079;
        C = 107902;
        D = 1736147326;
        E = -1360790959;
        F = 2137794556;
        G = 108705909;
        H = initAutoDBInfo(ue3.a.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "pkgId";
        e0Var.f316955d.put("pkgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "pkgId";
        e0Var.f316954c[1] = "pkgPath";
        e0Var.f316955d.put("pkgPath", "TEXT");
        e0Var.f316954c[2] = "unZipPath";
        e0Var.f316955d.put("unZipPath", "TEXT");
        e0Var.f316954c[3] = "pkgType";
        e0Var.f316955d.put("pkgType", "INTEGER");
        e0Var.f316954c[4] = "patchId";
        e0Var.f316955d.put("patchId", "TEXT");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = "version";
        e0Var.f316955d.put("version", "TEXT");
        e0Var.f316954c[7] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[8] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[9] = "lastUseTime";
        e0Var.f316955d.put("lastUseTime", "LONG");
        e0Var.f316954c[10] = "wxaPkgPath";
        e0Var.f316955d.put("wxaPkgPath", "TEXT");
        e0Var.f316954c[11] = "originalName";
        e0Var.f316955d.put("originalName", "TEXT");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " pkgId TEXT PRIMARY KEY ,  pkgPath TEXT,  unZipPath TEXT,  pkgType INTEGER,  patchId TEXT,  updateTime LONG,  version TEXT,  url TEXT,  md5 TEXT,  lastUseTime LONG,  wxaPkgPath TEXT,  originalName TEXT";
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
            if (f426873u == hashCode) {
                try {
                    this.field_pkgId = cursor.getString(i17);
                    this.f426879d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f426874v == hashCode) {
                try {
                    this.field_pkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f426875w == hashCode) {
                try {
                    this.field_unZipPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f426876x == hashCode) {
                try {
                    this.field_pkgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f426877y == hashCode) {
                try {
                    this.field_patchId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f426878z == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_version = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_lastUseTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_wxaPkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_originalName = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f426879d) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f426880e) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f426881f) {
            contentValues.put("unZipPath", this.field_unZipPath);
        }
        if (this.f426882g) {
            contentValues.put("pkgType", java.lang.Integer.valueOf(this.field_pkgType));
        }
        if (this.f426883h) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f426884i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f426885m) {
            contentValues.put("version", this.field_version);
        }
        if (this.f426886n) {
            contentValues.put("url", this.field_url);
        }
        if (this.f426887o) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f426888p) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.field_lastUseTime));
        }
        if (this.f426889q) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f426890r) {
            contentValues.put("originalName", this.field_originalName);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMagicPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MagicPkgInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f426872t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "createTableSql %s", str2);
            k0Var.A("MagicPkgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MagicPkgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "updateTableSql %s", str3);
            k0Var.A("MagicPkgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_pkgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f426871s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f426871s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z17) {
                this.f426879d = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f426880e = true;
            }
        }
        if (contentValues.containsKey("unZipPath")) {
            this.field_unZipPath = contentValues.getAsString("unZipPath");
            if (z17) {
                this.f426881f = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsInteger("pkgType").intValue();
            if (z17) {
                this.f426882g = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z17) {
                this.f426883h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f426884i = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsString("version");
            if (z17) {
                this.f426885m = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f426886n = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f426887o = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f426888p = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z17) {
                this.f426889q = true;
            }
        }
        if (contentValues.containsKey("originalName")) {
            this.field_originalName = contentValues.getAsString("originalName");
            if (z17) {
                this.f426890r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
