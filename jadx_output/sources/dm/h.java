package dm;

/* loaded from: classes4.dex */
public class h extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f237263p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f237264q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237265r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237266s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237267t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237268u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237269v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237270w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237271x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237272y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237273z;
    public long field_createdTime;
    public java.lang.String field_dynamicCanvas;
    public java.lang.String field_dynamicInfo;
    public java.lang.String field_extra;
    public java.lang.String field_extra1;
    public java.lang.String field_extra2;
    public java.lang.String field_key;
    public java.lang.String field_onetimeCanvas;
    public java.lang.String field_pageId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237274d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237275e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237276f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237277g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237278h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237279i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237280m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237281n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237282o = true;

    static {
        p75.n0 n0Var = new p75.n0("AdDynamicCanvasInfo");
        f237263p = n0Var;
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
        f237264q = new java.lang.String[0];
        f237265r = 106079;
        f237266s = -995752950;
        f237267t = -489909803;
        f237268u = -258997875;
        f237269v = 27612791;
        f237270w = -1974661781;
        f237271x = 96965648;
        f237272y = -1289032159;
        f237273z = -1289032158;
        A = 108705909;
        B = initAutoDBInfo(dm.h.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "pageId";
        e0Var.f316955d.put("pageId", "TEXT");
        e0Var.f316954c[2] = "createdTime";
        e0Var.f316955d.put("createdTime", "LONG");
        e0Var.f316954c[3] = "dynamicInfo";
        e0Var.f316955d.put("dynamicInfo", "TEXT");
        e0Var.f316954c[4] = "dynamicCanvas";
        e0Var.f316955d.put("dynamicCanvas", "TEXT");
        e0Var.f316954c[5] = "onetimeCanvas";
        e0Var.f316955d.put("onetimeCanvas", "TEXT");
        e0Var.f316954c[6] = "extra";
        e0Var.f316955d.put("extra", "TEXT");
        e0Var.f316954c[7] = "extra1";
        e0Var.f316955d.put("extra1", "TEXT");
        e0Var.f316954c[8] = "extra2";
        e0Var.f316955d.put("extra2", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  pageId TEXT,  createdTime LONG,  dynamicInfo TEXT,  dynamicCanvas TEXT,  onetimeCanvas TEXT,  extra TEXT,  extra1 TEXT,  extra2 TEXT";
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
            if (f237265r == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f237274d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237266s == hashCode) {
                try {
                    this.field_pageId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237267t == hashCode) {
                try {
                    this.field_createdTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237268u == hashCode) {
                try {
                    this.field_dynamicInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237269v == hashCode) {
                try {
                    this.field_dynamicCanvas = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237270w == hashCode) {
                try {
                    this.field_onetimeCanvas = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237271x == hashCode) {
                try {
                    this.field_extra = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237272y == hashCode) {
                try {
                    this.field_extra1 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237273z == hashCode) {
                try {
                    this.field_extra2 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f237274d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f237275e) {
            contentValues.put("pageId", this.field_pageId);
        }
        if (this.f237276f) {
            contentValues.put("createdTime", java.lang.Long.valueOf(this.field_createdTime));
        }
        if (this.f237277g) {
            contentValues.put("dynamicInfo", this.field_dynamicInfo);
        }
        if (this.f237278h) {
            contentValues.put("dynamicCanvas", this.field_dynamicCanvas);
        }
        if (this.f237279i) {
            contentValues.put("onetimeCanvas", this.field_onetimeCanvas);
        }
        if (this.f237280m) {
            contentValues.put("extra", this.field_extra);
        }
        if (this.f237281n) {
            contentValues.put("extra1", this.field_extra1);
        }
        if (this.f237282o) {
            contentValues.put("extra2", this.field_extra2);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdDynamicCanvasInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237264q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTableSql %s", str2);
            k0Var.A("AdDynamicCanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AdDynamicCanvasInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("AdDynamicCanvasInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237263p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237263p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f237274d = true;
            }
        }
        if (contentValues.containsKey("pageId")) {
            this.field_pageId = contentValues.getAsString("pageId");
            if (z17) {
                this.f237275e = true;
            }
        }
        if (contentValues.containsKey("createdTime")) {
            this.field_createdTime = contentValues.getAsLong("createdTime").longValue();
            if (z17) {
                this.f237276f = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.field_dynamicInfo = contentValues.getAsString("dynamicInfo");
            if (z17) {
                this.f237277g = true;
            }
        }
        if (contentValues.containsKey("dynamicCanvas")) {
            this.field_dynamicCanvas = contentValues.getAsString("dynamicCanvas");
            if (z17) {
                this.f237278h = true;
            }
        }
        if (contentValues.containsKey("onetimeCanvas")) {
            this.field_onetimeCanvas = contentValues.getAsString("onetimeCanvas");
            if (z17) {
                this.f237279i = true;
            }
        }
        if (contentValues.containsKey("extra")) {
            this.field_extra = contentValues.getAsString("extra");
            if (z17) {
                this.f237280m = true;
            }
        }
        if (contentValues.containsKey("extra1")) {
            this.field_extra1 = contentValues.getAsString("extra1");
            if (z17) {
                this.f237281n = true;
            }
        }
        if (contentValues.containsKey("extra2")) {
            this.field_extra2 = contentValues.getAsString("extra2");
            if (z17) {
                this.f237282o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
