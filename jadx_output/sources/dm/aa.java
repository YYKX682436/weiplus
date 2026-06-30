package dm;

/* loaded from: classes4.dex */
public class aa extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f235695p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f235696q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235697r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235698s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235699t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235700u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235701v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235702w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235703x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235704y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235705z;
    public java.lang.String field_brand;
    public java.lang.String field_fromLang;
    public java.lang.String field_originMD5;
    public java.lang.String field_originalImageAesKey;
    public java.lang.String field_originalImageFileId;
    public java.lang.String field_resultFile;
    public java.lang.String field_resultImageAesKey;
    public java.lang.String field_resultImageFileId;
    public java.lang.String field_toLang;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235706d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235707e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235708f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235709g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235710h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235711i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235712m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235713n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235714o = true;

    static {
        p75.n0 n0Var = new p75.n0("ScanTranslationResult");
        f235695p = n0Var;
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
        f235696q = new java.lang.String[0];
        f235697r = -199335784;
        f235698s = -572269767;
        f235699t = -1244907336;
        f235700u = -869114103;
        f235701v = 93997959;
        f235702w = -497289631;
        f235703x = -643945030;
        f235704y = 1814761621;
        f235705z = 1668106222;
        A = 108705909;
        B = initAutoDBInfo(dm.aa.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "originMD5";
        e0Var.f316955d.put("originMD5", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "originMD5";
        e0Var.f316954c[1] = "resultFile";
        e0Var.f316955d.put("resultFile", "TEXT");
        e0Var.f316954c[2] = "fromLang";
        e0Var.f316955d.put("fromLang", "TEXT");
        e0Var.f316954c[3] = "toLang";
        e0Var.f316955d.put("toLang", "TEXT");
        e0Var.f316954c[4] = "brand";
        e0Var.f316955d.put("brand", "TEXT");
        e0Var.f316954c[5] = "originalImageFileId";
        e0Var.f316955d.put("originalImageFileId", "TEXT");
        e0Var.f316954c[6] = "originalImageAesKey";
        e0Var.f316955d.put("originalImageAesKey", "TEXT");
        e0Var.f316954c[7] = "resultImageFileId";
        e0Var.f316955d.put("resultImageFileId", "TEXT");
        e0Var.f316954c[8] = "resultImageAesKey";
        e0Var.f316955d.put("resultImageAesKey", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " originMD5 TEXT PRIMARY KEY ,  resultFile TEXT,  fromLang TEXT,  toLang TEXT,  brand TEXT,  originalImageFileId TEXT,  originalImageAesKey TEXT,  resultImageFileId TEXT,  resultImageAesKey TEXT";
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
            if (f235697r == hashCode) {
                try {
                    this.field_originMD5 = cursor.getString(i17);
                    this.f235706d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235698s == hashCode) {
                try {
                    this.field_resultFile = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235699t == hashCode) {
                try {
                    this.field_fromLang = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235700u == hashCode) {
                try {
                    this.field_toLang = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235701v == hashCode) {
                try {
                    this.field_brand = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235702w == hashCode) {
                try {
                    this.field_originalImageFileId = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235703x == hashCode) {
                try {
                    this.field_originalImageAesKey = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235704y == hashCode) {
                try {
                    this.field_resultImageFileId = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235705z == hashCode) {
                try {
                    this.field_resultImageAesKey = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235706d) {
            contentValues.put("originMD5", this.field_originMD5);
        }
        if (this.f235707e) {
            contentValues.put("resultFile", this.field_resultFile);
        }
        if (this.f235708f) {
            contentValues.put("fromLang", this.field_fromLang);
        }
        if (this.f235709g) {
            contentValues.put("toLang", this.field_toLang);
        }
        if (this.f235710h) {
            contentValues.put("brand", this.field_brand);
        }
        if (this.f235711i) {
            contentValues.put("originalImageFileId", this.field_originalImageFileId);
        }
        if (this.f235712m) {
            contentValues.put("originalImageAesKey", this.field_originalImageAesKey);
        }
        if (this.f235713n) {
            contentValues.put("resultImageFileId", this.field_resultImageFileId);
        }
        if (this.f235714o) {
            contentValues.put("resultImageAesKey", this.field_resultImageAesKey);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseScanTranslationResult", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ScanTranslationResult ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235696q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "createTableSql %s", str2);
            k0Var.A("ScanTranslationResult", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ScanTranslationResult", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "updateTableSql %s", str3);
            k0Var.A("ScanTranslationResult", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_originMD5;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235695p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235695p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("originMD5")) {
            this.field_originMD5 = contentValues.getAsString("originMD5");
            if (z17) {
                this.f235706d = true;
            }
        }
        if (contentValues.containsKey("resultFile")) {
            this.field_resultFile = contentValues.getAsString("resultFile");
            if (z17) {
                this.f235707e = true;
            }
        }
        if (contentValues.containsKey("fromLang")) {
            this.field_fromLang = contentValues.getAsString("fromLang");
            if (z17) {
                this.f235708f = true;
            }
        }
        if (contentValues.containsKey("toLang")) {
            this.field_toLang = contentValues.getAsString("toLang");
            if (z17) {
                this.f235709g = true;
            }
        }
        if (contentValues.containsKey("brand")) {
            this.field_brand = contentValues.getAsString("brand");
            if (z17) {
                this.f235710h = true;
            }
        }
        if (contentValues.containsKey("originalImageFileId")) {
            this.field_originalImageFileId = contentValues.getAsString("originalImageFileId");
            if (z17) {
                this.f235711i = true;
            }
        }
        if (contentValues.containsKey("originalImageAesKey")) {
            this.field_originalImageAesKey = contentValues.getAsString("originalImageAesKey");
            if (z17) {
                this.f235712m = true;
            }
        }
        if (contentValues.containsKey("resultImageFileId")) {
            this.field_resultImageFileId = contentValues.getAsString("resultImageFileId");
            if (z17) {
                this.f235713n = true;
            }
        }
        if (contentValues.containsKey("resultImageAesKey")) {
            this.field_resultImageAesKey = contentValues.getAsString("resultImageAesKey");
            if (z17) {
                this.f235714o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
