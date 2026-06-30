package dm;

/* loaded from: classes8.dex */
public class v7 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f240588p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f240589q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240590r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240591s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240592t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240593u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240594v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240595w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240596x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240597y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240598z;
    public java.lang.String field_bubbleMd5;
    public java.lang.String field_bubbledynamicMd5;
    public java.lang.String field_bubblewidgetMd5;
    public java.lang.String field_coverMd5;
    public java.lang.String field_coverwidgetMd5;
    public java.lang.String field_detailMd5;
    public java.lang.String field_minilogoMd5;
    public int field_subtype;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240599d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240600e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240601f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240602g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240603h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240604i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240605m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240606n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240607o = true;

    static {
        p75.n0 n0Var = new p75.n0("LuckyMoneyEnvelopeResource");
        f240588p = n0Var;
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
        f240589q = new java.lang.String[0];
        f240590r = -1867567750;
        f240591s = 697998674;
        f240592t = 475457099;
        f240593u = -351786425;
        f240594v = -55795812;
        f240595w = -1973098643;
        f240596x = 351608024;
        f240597y = -123918962;
        f240598z = -1123522877;
        A = 108705909;
        B = initAutoDBInfo(dm.v7.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "subtype";
        e0Var.f316955d.put("subtype", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "subtype";
        e0Var.f316954c[1] = "bubbleMd5";
        e0Var.f316955d.put("bubbleMd5", "TEXT");
        e0Var.f316954c[2] = "bubbledynamicMd5";
        e0Var.f316955d.put("bubbledynamicMd5", "TEXT");
        e0Var.f316954c[3] = "coverMd5";
        e0Var.f316955d.put("coverMd5", "TEXT");
        e0Var.f316954c[4] = "minilogoMd5";
        e0Var.f316955d.put("minilogoMd5", "TEXT");
        e0Var.f316954c[5] = "detailMd5";
        e0Var.f316955d.put("detailMd5", "TEXT");
        e0Var.f316954c[6] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[7] = "bubblewidgetMd5";
        e0Var.f316955d.put("bubblewidgetMd5", "TEXT");
        e0Var.f316954c[8] = "coverwidgetMd5";
        e0Var.f316955d.put("coverwidgetMd5", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " subtype INTEGER PRIMARY KEY ,  bubbleMd5 TEXT,  bubbledynamicMd5 TEXT,  coverMd5 TEXT,  minilogoMd5 TEXT,  detailMd5 TEXT,  version INTEGER,  bubblewidgetMd5 TEXT,  coverwidgetMd5 TEXT";
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
            if (f240590r == hashCode) {
                try {
                    this.field_subtype = cursor.getInt(i17);
                    this.f240599d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240591s == hashCode) {
                try {
                    this.field_bubbleMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240592t == hashCode) {
                try {
                    this.field_bubbledynamicMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240593u == hashCode) {
                try {
                    this.field_coverMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240594v == hashCode) {
                try {
                    this.field_minilogoMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240595w == hashCode) {
                try {
                    this.field_detailMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240596x == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240597y == hashCode) {
                try {
                    this.field_bubblewidgetMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240598z == hashCode) {
                try {
                    this.field_coverwidgetMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f240599d) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.field_subtype));
        }
        if (this.f240600e) {
            contentValues.put("bubbleMd5", this.field_bubbleMd5);
        }
        if (this.f240601f) {
            contentValues.put("bubbledynamicMd5", this.field_bubbledynamicMd5);
        }
        if (this.f240602g) {
            contentValues.put("coverMd5", this.field_coverMd5);
        }
        if (this.f240603h) {
            contentValues.put("minilogoMd5", this.field_minilogoMd5);
        }
        if (this.f240604i) {
            contentValues.put("detailMd5", this.field_detailMd5);
        }
        if (this.f240605m) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f240606n) {
            contentValues.put("bubblewidgetMd5", this.field_bubblewidgetMd5);
        }
        if (this.f240607o) {
            contentValues.put("coverwidgetMd5", this.field_coverwidgetMd5);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LuckyMoneyEnvelopeResource ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240589q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTableSql %s", str2);
            k0Var.A("LuckyMoneyEnvelopeResource", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LuckyMoneyEnvelopeResource", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "updateTableSql %s", str3);
            k0Var.A("LuckyMoneyEnvelopeResource", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.field_subtype);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240588p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240588p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f240599d = true;
            }
        }
        if (contentValues.containsKey("bubbleMd5")) {
            this.field_bubbleMd5 = contentValues.getAsString("bubbleMd5");
            if (z17) {
                this.f240600e = true;
            }
        }
        if (contentValues.containsKey("bubbledynamicMd5")) {
            this.field_bubbledynamicMd5 = contentValues.getAsString("bubbledynamicMd5");
            if (z17) {
                this.f240601f = true;
            }
        }
        if (contentValues.containsKey("coverMd5")) {
            this.field_coverMd5 = contentValues.getAsString("coverMd5");
            if (z17) {
                this.f240602g = true;
            }
        }
        if (contentValues.containsKey("minilogoMd5")) {
            this.field_minilogoMd5 = contentValues.getAsString("minilogoMd5");
            if (z17) {
                this.f240603h = true;
            }
        }
        if (contentValues.containsKey("detailMd5")) {
            this.field_detailMd5 = contentValues.getAsString("detailMd5");
            if (z17) {
                this.f240604i = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f240605m = true;
            }
        }
        if (contentValues.containsKey("bubblewidgetMd5")) {
            this.field_bubblewidgetMd5 = contentValues.getAsString("bubblewidgetMd5");
            if (z17) {
                this.f240606n = true;
            }
        }
        if (contentValues.containsKey("coverwidgetMd5")) {
            this.field_coverwidgetMd5 = contentValues.getAsString("coverwidgetMd5");
            if (z17) {
                this.f240607o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
