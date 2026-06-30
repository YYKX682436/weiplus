package dm;

/* loaded from: classes7.dex */
public class k1 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f237950o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f237951p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f237952q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f237953r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237954s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237955t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237956u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237957v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237958w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237959x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237960y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237961z;
    public long field_biz;
    public long field_idx;
    public int field_itemShowType;
    public long field_mid;
    public java.lang.String field_screenshotMd5;
    public java.lang.String field_screenshotPath;
    public long field_screenshotTime;
    public java.lang.String field_url;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237962d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237963e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237964f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237965g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237966h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237967i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237968m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237969n = true;

    static {
        p75.n0 n0Var = new p75.n0("BizScreenshotInfo");
        f237950o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237951p = new p75.d("screenshotPath", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237952q = new p75.d("screenshotTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237953r = new java.lang.String[0];
        f237954s = 1784145464;
        f237955t = -525976917;
        f237956u = 116079;
        f237957v = -525850285;
        f237958w = 97555;
        f237959x = 108104;
        f237960y = 104125;
        f237961z = 289616906;
        A = 108705909;
        B = initAutoDBInfo(dm.k1.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "screenshotMd5";
        e0Var.f316955d.put("screenshotMd5", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "screenshotMd5";
        e0Var.f316954c[1] = "screenshotPath";
        e0Var.f316955d.put("screenshotPath", "TEXT");
        e0Var.f316954c[2] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[3] = "screenshotTime";
        e0Var.f316955d.put("screenshotTime", "LONG");
        e0Var.f316954c[4] = "biz";
        e0Var.f316955d.put("biz", "LONG");
        e0Var.f316954c[5] = "mid";
        e0Var.f316955d.put("mid", "LONG");
        e0Var.f316954c[6] = "idx";
        e0Var.f316955d.put("idx", "LONG");
        e0Var.f316954c[7] = "itemShowType";
        e0Var.f316955d.put("itemShowType", "INTEGER");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " screenshotMd5 TEXT PRIMARY KEY ,  screenshotPath TEXT,  url TEXT,  screenshotTime LONG,  biz LONG,  mid LONG,  idx LONG,  itemShowType INTEGER";
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
            if (f237954s == hashCode) {
                try {
                    this.field_screenshotMd5 = cursor.getString(i17);
                    this.f237962d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237955t == hashCode) {
                try {
                    this.field_screenshotPath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237956u == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237957v == hashCode) {
                try {
                    this.field_screenshotTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237958w == hashCode) {
                try {
                    this.field_biz = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237959x == hashCode) {
                try {
                    this.field_mid = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237960y == hashCode) {
                try {
                    this.field_idx = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237961z == hashCode) {
                try {
                    this.field_itemShowType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizScreenshotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237962d) {
            contentValues.put("screenshotMd5", this.field_screenshotMd5);
        }
        if (this.f237963e) {
            contentValues.put("screenshotPath", this.field_screenshotPath);
        }
        if (this.f237964f) {
            contentValues.put("url", this.field_url);
        }
        if (this.f237965g) {
            contentValues.put("screenshotTime", java.lang.Long.valueOf(this.field_screenshotTime));
        }
        if (this.f237966h) {
            contentValues.put("biz", java.lang.Long.valueOf(this.field_biz));
        }
        if (this.f237967i) {
            contentValues.put("mid", java.lang.Long.valueOf(this.field_mid));
        }
        if (this.f237968m) {
            contentValues.put("idx", java.lang.Long.valueOf(this.field_idx));
        }
        if (this.f237969n) {
            contentValues.put("itemShowType", java.lang.Integer.valueOf(this.field_itemShowType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizScreenshotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizScreenshotInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237953r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "createTableSql %s", str2);
            k0Var.A("BizScreenshotInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizScreenshotInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "updateTableSql %s", str3);
            k0Var.A("BizScreenshotInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_screenshotMd5;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237950o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237950o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("screenshotMd5")) {
            this.field_screenshotMd5 = contentValues.getAsString("screenshotMd5");
            if (z17) {
                this.f237962d = true;
            }
        }
        if (contentValues.containsKey("screenshotPath")) {
            this.field_screenshotPath = contentValues.getAsString("screenshotPath");
            if (z17) {
                this.f237963e = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f237964f = true;
            }
        }
        if (contentValues.containsKey("screenshotTime")) {
            this.field_screenshotTime = contentValues.getAsLong("screenshotTime").longValue();
            if (z17) {
                this.f237965g = true;
            }
        }
        if (contentValues.containsKey("biz")) {
            this.field_biz = contentValues.getAsLong("biz").longValue();
            if (z17) {
                this.f237966h = true;
            }
        }
        if (contentValues.containsKey("mid")) {
            this.field_mid = contentValues.getAsLong("mid").longValue();
            if (z17) {
                this.f237967i = true;
            }
        }
        if (contentValues.containsKey("idx")) {
            this.field_idx = contentValues.getAsLong("idx").longValue();
            if (z17) {
                this.f237968m = true;
            }
        }
        if (contentValues.containsKey("itemShowType")) {
            this.field_itemShowType = contentValues.getAsInteger("itemShowType").intValue();
            if (z17) {
                this.f237969n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
