package dm;

/* loaded from: classes7.dex */
public class zc extends l75.f0 {
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
    public static final int f241604J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f241605v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f241606w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241607x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241608y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241609z;
    public int field_arch;
    public int field_consumingSnapshotCount;
    public boolean field_isNodeSnapshot;
    public int field_producingSnapshotCount;
    public int field_recoverCount;
    public java.lang.String field_snapshotBaseConfig;
    public java.lang.String field_snapshotCategory;
    public long field_snapshotLastModified;
    public long field_snapshotLength;
    public java.lang.String field_snapshotMetaInfo;
    public java.lang.String field_snapshotNodeConfig;
    public java.lang.String field_snapshotPath;
    public java.lang.String field_wxaPkgMd5;
    public java.lang.String field_wxaPkgPath;
    public int field_wxaPkgVersion;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241610d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241611e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241612f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241613g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241614h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241615i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241616m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241617n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241618o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241619p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241620q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241621r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241622s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241623t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241624u = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaPkgV8SnapshotInfoV3");
        f241605v = n0Var;
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
        f241606w = new java.lang.String[0];
        f241607x = 3002454;
        f241608y = -1360790959;
        f241609z = 925931986;
        A = 2016003884;
        B = -224922910;
        C = -931648503;
        D = -1992054941;
        E = -2072012342;
        F = 315335255;
        G = -726230473;
        H = -1331513296;
        I = -1949736760;
        f241604J = -1148597490;
        K = 217120882;
        L = 1953886731;
        M = 108705909;
        N = initAutoDBInfo(dm.zc.class);
        P = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "arch";
        e0Var.f316955d.put("arch", "INTEGER");
        e0Var.f316954c[1] = "wxaPkgPath";
        e0Var.f316955d.put("wxaPkgPath", "TEXT");
        e0Var.f316954c[2] = "wxaPkgMd5";
        e0Var.f316955d.put("wxaPkgMd5", "TEXT");
        e0Var.f316954c[3] = "wxaPkgVersion";
        e0Var.f316955d.put("wxaPkgVersion", "INTEGER");
        e0Var.f316954c[4] = "snapshotCategory";
        e0Var.f316955d.put("snapshotCategory", "TEXT");
        e0Var.f316954c[5] = "snapshotPath";
        e0Var.f316955d.put("snapshotPath", "TEXT");
        e0Var.f316954c[6] = "snapshotLastModified";
        e0Var.f316955d.put("snapshotLastModified", "LONG");
        e0Var.f316954c[7] = "snapshotLength";
        e0Var.f316955d.put("snapshotLength", "LONG");
        e0Var.f316954c[8] = "snapshotBaseConfig";
        e0Var.f316955d.put("snapshotBaseConfig", "TEXT");
        e0Var.f316954c[9] = "snapshotMetaInfo";
        e0Var.f316955d.put("snapshotMetaInfo", "TEXT");
        e0Var.f316954c[10] = "isNodeSnapshot";
        e0Var.f316955d.put("isNodeSnapshot", "INTEGER default 'false' ");
        e0Var.f316954c[11] = "snapshotNodeConfig";
        e0Var.f316955d.put("snapshotNodeConfig", "TEXT");
        e0Var.f316954c[12] = "producingSnapshotCount";
        e0Var.f316955d.put("producingSnapshotCount", "INTEGER default '0' ");
        e0Var.f316954c[13] = "consumingSnapshotCount";
        e0Var.f316955d.put("consumingSnapshotCount", "INTEGER default '0' ");
        e0Var.f316954c[14] = "recoverCount";
        e0Var.f316955d.put("recoverCount", "INTEGER default '0' ");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " arch INTEGER,  wxaPkgPath TEXT,  wxaPkgMd5 TEXT,  wxaPkgVersion INTEGER,  snapshotCategory TEXT,  snapshotPath TEXT,  snapshotLastModified LONG,  snapshotLength LONG,  snapshotBaseConfig TEXT,  snapshotMetaInfo TEXT,  isNodeSnapshot INTEGER default 'false' ,  snapshotNodeConfig TEXT,  producingSnapshotCount INTEGER default '0' ,  consumingSnapshotCount INTEGER default '0' ,  recoverCount INTEGER default '0' ";
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
            if (f241607x == hashCode) {
                try {
                    this.field_arch = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241608y == hashCode) {
                try {
                    this.field_wxaPkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241609z == hashCode) {
                try {
                    this.field_wxaPkgMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_wxaPkgVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_snapshotCategory = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_snapshotPath = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_snapshotLastModified = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_snapshotLength = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_snapshotBaseConfig = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_snapshotMetaInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_isNodeSnapshot = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_snapshotNodeConfig = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241604J == hashCode) {
                try {
                    this.field_producingSnapshotCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_consumingSnapshotCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_recoverCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th20, "convertFrom %s", columnNames[i17]);
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
        if (this.f241610d) {
            contentValues.put("arch", java.lang.Integer.valueOf(this.field_arch));
        }
        if (this.f241611e) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f241612f) {
            contentValues.put("wxaPkgMd5", this.field_wxaPkgMd5);
        }
        if (this.f241613g) {
            contentValues.put("wxaPkgVersion", java.lang.Integer.valueOf(this.field_wxaPkgVersion));
        }
        if (this.f241614h) {
            contentValues.put("snapshotCategory", this.field_snapshotCategory);
        }
        if (this.f241615i) {
            contentValues.put("snapshotPath", this.field_snapshotPath);
        }
        if (this.f241616m) {
            contentValues.put("snapshotLastModified", java.lang.Long.valueOf(this.field_snapshotLastModified));
        }
        if (this.f241617n) {
            contentValues.put("snapshotLength", java.lang.Long.valueOf(this.field_snapshotLength));
        }
        if (this.f241618o) {
            contentValues.put("snapshotBaseConfig", this.field_snapshotBaseConfig);
        }
        if (this.f241619p) {
            contentValues.put("snapshotMetaInfo", this.field_snapshotMetaInfo);
        }
        if (this.f241620q) {
            if (this.field_isNodeSnapshot) {
                contentValues.put("isNodeSnapshot", (java.lang.Integer) 1);
            } else {
                contentValues.put("isNodeSnapshot", (java.lang.Integer) 0);
            }
        }
        if (this.f241621r) {
            contentValues.put("snapshotNodeConfig", this.field_snapshotNodeConfig);
        }
        if (this.f241622s) {
            contentValues.put("producingSnapshotCount", java.lang.Integer.valueOf(this.field_producingSnapshotCount));
        }
        if (this.f241623t) {
            contentValues.put("consumingSnapshotCount", java.lang.Integer.valueOf(this.field_consumingSnapshotCount));
        }
        if (this.f241624u) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaPkgV8SnapshotInfoV3 ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241606w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTableSql %s", str2);
            k0Var.A("WxaPkgV8SnapshotInfoV3", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaPkgV8SnapshotInfoV3", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "updateTableSql %s", str3);
            k0Var.A("WxaPkgV8SnapshotInfoV3", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return f241605v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241605v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("arch")) {
            this.field_arch = contentValues.getAsInteger("arch").intValue();
            if (z17) {
                this.f241610d = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z17) {
                this.f241611e = true;
            }
        }
        if (contentValues.containsKey("wxaPkgMd5")) {
            this.field_wxaPkgMd5 = contentValues.getAsString("wxaPkgMd5");
            if (z17) {
                this.f241612f = true;
            }
        }
        if (contentValues.containsKey("wxaPkgVersion")) {
            this.field_wxaPkgVersion = contentValues.getAsInteger("wxaPkgVersion").intValue();
            if (z17) {
                this.f241613g = true;
            }
        }
        if (contentValues.containsKey("snapshotCategory")) {
            this.field_snapshotCategory = contentValues.getAsString("snapshotCategory");
            if (z17) {
                this.f241614h = true;
            }
        }
        if (contentValues.containsKey("snapshotPath")) {
            this.field_snapshotPath = contentValues.getAsString("snapshotPath");
            if (z17) {
                this.f241615i = true;
            }
        }
        if (contentValues.containsKey("snapshotLastModified")) {
            this.field_snapshotLastModified = contentValues.getAsLong("snapshotLastModified").longValue();
            if (z17) {
                this.f241616m = true;
            }
        }
        if (contentValues.containsKey("snapshotLength")) {
            this.field_snapshotLength = contentValues.getAsLong("snapshotLength").longValue();
            if (z17) {
                this.f241617n = true;
            }
        }
        if (contentValues.containsKey("snapshotBaseConfig")) {
            this.field_snapshotBaseConfig = contentValues.getAsString("snapshotBaseConfig");
            if (z17) {
                this.f241618o = true;
            }
        }
        if (contentValues.containsKey("snapshotMetaInfo")) {
            this.field_snapshotMetaInfo = contentValues.getAsString("snapshotMetaInfo");
            if (z17) {
                this.f241619p = true;
            }
        }
        if (contentValues.containsKey("isNodeSnapshot")) {
            this.field_isNodeSnapshot = contentValues.getAsInteger("isNodeSnapshot").intValue() != 0;
            if (z17) {
                this.f241620q = true;
            }
        }
        if (contentValues.containsKey("snapshotNodeConfig")) {
            this.field_snapshotNodeConfig = contentValues.getAsString("snapshotNodeConfig");
            if (z17) {
                this.f241621r = true;
            }
        }
        if (contentValues.containsKey("producingSnapshotCount")) {
            this.field_producingSnapshotCount = contentValues.getAsInteger("producingSnapshotCount").intValue();
            if (z17) {
                this.f241622s = true;
            }
        }
        if (contentValues.containsKey("consumingSnapshotCount")) {
            this.field_consumingSnapshotCount = contentValues.getAsInteger("consumingSnapshotCount").intValue();
            if (z17) {
                this.f241623t = true;
            }
        }
        if (contentValues.containsKey("recoverCount")) {
            this.field_recoverCount = contentValues.getAsInteger("recoverCount").intValue();
            if (z17) {
                this.f241624u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
