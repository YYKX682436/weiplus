package dm;

/* loaded from: classes8.dex */
public class l9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238304i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238305m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238306n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238307o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238308p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238309q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238310r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238311s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f238312t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f238313u;
    public java.lang.String field_biz;
    public java.lang.String field_ret;
    public long field_save_time;
    public float field_score;
    public java.lang.String field_uid;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238314d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238315e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238316f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238317g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238318h = true;

    static {
        p75.n0 n0Var = new p75.n0("PredictResultCache");
        f238304i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238305m = new java.lang.String[0];
        f238306n = 97555;
        f238307o = 115792;
        f238308p = 112801;
        f238309q = 184135759;
        f238310r = 109264530;
        f238311s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "biz";
        ((java.util.HashMap) e0Var.f316955d).put("biz", "TEXT");
        e0Var.f316954c[1] = "uid";
        ((java.util.HashMap) e0Var.f316955d).put("uid", "TEXT");
        e0Var.f316954c[2] = "ret";
        ((java.util.HashMap) e0Var.f316955d).put("ret", "TEXT");
        e0Var.f316954c[3] = "save_time";
        ((java.util.HashMap) e0Var.f316955d).put("save_time", "LONG");
        e0Var.f316954c[4] = ya.b.SCORE;
        ((java.util.HashMap) e0Var.f316955d).put(ya.b.SCORE, "FLOAT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " biz TEXT,  uid TEXT,  ret TEXT,  save_time LONG,  score FLOAT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f238312t = e0Var;
        f238313u = new o75.e();
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
            if (f238306n == hashCode) {
                try {
                    this.field_biz = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredictResultCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238307o == hashCode) {
                try {
                    this.field_uid = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredictResultCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238308p == hashCode) {
                try {
                    this.field_ret = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredictResultCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238309q == hashCode) {
                try {
                    this.field_save_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredictResultCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238310r == hashCode) {
                try {
                    this.field_score = cursor.getFloat(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredictResultCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238311s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238314d) {
            contentValues.put("biz", this.field_biz);
        }
        if (this.f238315e) {
            contentValues.put("uid", this.field_uid);
        }
        if (this.f238316f) {
            contentValues.put("ret", this.field_ret);
        }
        if (this.f238317g) {
            contentValues.put("save_time", java.lang.Long.valueOf(this.field_save_time));
        }
        if (this.f238318h) {
            contentValues.put(ya.b.SCORE, java.lang.Float.valueOf(this.field_score));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePredictResultCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredictResultCache ( ");
        l75.e0 e0Var = f238312t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238305m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredictResultCache", "createTableSql %s", str2);
            k0Var.A("PredictResultCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PredictResultCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredictResultCache", "updateTableSql %s", str3);
            k0Var.A("PredictResultCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredictResultCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238312t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238313u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238304i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238304i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("biz")) {
            this.field_biz = contentValues.getAsString("biz");
            if (z17) {
                this.f238314d = true;
            }
        }
        if (contentValues.containsKey("uid")) {
            this.field_uid = contentValues.getAsString("uid");
            if (z17) {
                this.f238315e = true;
            }
        }
        if (contentValues.containsKey("ret")) {
            this.field_ret = contentValues.getAsString("ret");
            if (z17) {
                this.f238316f = true;
            }
        }
        if (contentValues.containsKey("save_time")) {
            this.field_save_time = contentValues.getAsLong("save_time").longValue();
            if (z17) {
                this.f238317g = true;
            }
        }
        if (contentValues.containsKey(ya.b.SCORE)) {
            this.field_score = contentValues.getAsFloat(ya.b.SCORE).floatValue();
            if (z17) {
                this.f238318h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
