package dm;

/* loaded from: classes8.dex */
public class o3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f238887q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238888r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238889s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238890t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238891u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238892v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238893w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238894x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238895y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238896z;
    public int field_failNum;
    public long field_favTime;
    public java.lang.String field_imgDirPath;
    public java.lang.String field_imgPaths;
    public int field_isReport;
    public java.lang.String field_path;
    public long field_size;
    public int field_status;
    public long field_updateTime;
    public java.lang.String field_url;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238897d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238898e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238899f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238900g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238901h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238902i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238903m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238904n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238905o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238906p = true;

    static {
        p75.n0 n0Var = new p75.n0("FavOffline");
        f238887q = n0Var;
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
        f238888r = new java.lang.String[0];
        f238889s = 116079;
        f238890t = 3530753;
        f238891u = 3433509;
        f238892v = -442721009;
        f238893w = -709166357;
        f238894x = -1075295096;
        f238895y = -295931082;
        f238896z = -892481550;
        A = -1086611576;
        B = -260487426;
        C = 108705909;
        D = initAutoDBInfo(dm.o3.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[1] = "size";
        e0Var.f316955d.put("size", "LONG");
        e0Var.f316954c[2] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[3] = "imgDirPath";
        e0Var.f316955d.put("imgDirPath", "TEXT");
        e0Var.f316954c[4] = "imgPaths";
        e0Var.f316955d.put("imgPaths", "TEXT");
        e0Var.f316954c[5] = "favTime";
        e0Var.f316955d.put("favTime", "LONG");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[7] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[8] = "failNum";
        e0Var.f316955d.put("failNum", "INTEGER");
        e0Var.f316954c[9] = "isReport";
        e0Var.f316955d.put("isReport", "INTEGER");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " url TEXT,  size LONG,  path TEXT,  imgDirPath TEXT,  imgPaths TEXT,  favTime LONG,  updateTime LONG,  status INTEGER,  failNum INTEGER,  isReport INTEGER";
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
            if (f238889s == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238890t == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238891u == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238892v == hashCode) {
                try {
                    this.field_imgDirPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238893w == hashCode) {
                try {
                    this.field_imgPaths = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238894x == hashCode) {
                try {
                    this.field_favTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238895y == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238896z == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_failNum = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_isReport = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavOffline", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238897d) {
            contentValues.put("url", this.field_url);
        }
        if (this.f238898e) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f238899f) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f238900g) {
            contentValues.put("imgDirPath", this.field_imgDirPath);
        }
        if (this.f238901h) {
            contentValues.put("imgPaths", this.field_imgPaths);
        }
        if (this.f238902i) {
            contentValues.put("favTime", java.lang.Long.valueOf(this.field_favTime));
        }
        if (this.f238903m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f238904n) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f238905o) {
            contentValues.put("failNum", java.lang.Integer.valueOf(this.field_failNum));
        }
        if (this.f238906p) {
            contentValues.put("isReport", java.lang.Integer.valueOf(this.field_isReport));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavOffline", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavOffline ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238888r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavOffline", "createTableSql %s", str2);
            k0Var.A("FavOffline", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavOffline", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavOffline", "updateTableSql %s", str3);
            k0Var.A("FavOffline", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavOffline", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238887q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238887q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f238897d = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f238898e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f238899f = true;
            }
        }
        if (contentValues.containsKey("imgDirPath")) {
            this.field_imgDirPath = contentValues.getAsString("imgDirPath");
            if (z17) {
                this.f238900g = true;
            }
        }
        if (contentValues.containsKey("imgPaths")) {
            this.field_imgPaths = contentValues.getAsString("imgPaths");
            if (z17) {
                this.f238901h = true;
            }
        }
        if (contentValues.containsKey("favTime")) {
            this.field_favTime = contentValues.getAsLong("favTime").longValue();
            if (z17) {
                this.f238902i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238903m = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f238904n = true;
            }
        }
        if (contentValues.containsKey("failNum")) {
            this.field_failNum = contentValues.getAsInteger("failNum").intValue();
            if (z17) {
                this.f238905o = true;
            }
        }
        if (contentValues.containsKey("isReport")) {
            this.field_isReport = contentValues.getAsInteger("isReport").intValue();
            if (z17) {
                this.f238906p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
