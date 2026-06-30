package dm;

/* loaded from: classes4.dex */
public class s3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f239799m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f239800n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239801o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239802p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239803q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239804r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239805s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239806t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239807u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239808v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239809w;
    public java.lang.String field_feature_str;
    public int field_label;
    public java.lang.String field_model;
    public java.lang.String field_sample_uid;
    public int field_tag;
    public long field_time;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239810d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239811e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239812f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239813g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239814h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239815i = true;

    static {
        p75.n0 n0Var = new p75.n0("FewShotLearning");
        f239799m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239800n = new java.lang.String[0];
        f239801o = 3560141;
        f239802p = 104069929;
        f239803q = 143492155;
        f239804r = -376636056;
        f239805s = 102727412;
        f239806t = 114586;
        f239807u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "time";
        ((java.util.HashMap) e0Var.f316955d).put("time", "LONG");
        e0Var.f316954c[1] = "model";
        ((java.util.HashMap) e0Var.f316955d).put("model", "TEXT");
        e0Var.f316954c[2] = "sample_uid";
        ((java.util.HashMap) e0Var.f316955d).put("sample_uid", "TEXT");
        e0Var.f316954c[3] = "feature_str";
        ((java.util.HashMap) e0Var.f316955d).put("feature_str", "TEXT");
        e0Var.f316954c[4] = "label";
        ((java.util.HashMap) e0Var.f316955d).put("label", "INTEGER");
        e0Var.f316954c[5] = "tag";
        ((java.util.HashMap) e0Var.f316955d).put("tag", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " time LONG,  model TEXT,  sample_uid TEXT,  feature_str TEXT,  label INTEGER,  tag INTEGER";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239808v = e0Var;
        f239809w = new o75.e();
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
            if (f239801o == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239802p == hashCode) {
                try {
                    this.field_model = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239803q == hashCode) {
                try {
                    this.field_sample_uid = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239804r == hashCode) {
                try {
                    this.field_feature_str = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239805s == hashCode) {
                try {
                    this.field_label = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239806t == hashCode) {
                try {
                    this.field_tag = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239807u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239810d) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
        }
        if (this.f239811e) {
            contentValues.put("model", this.field_model);
        }
        if (this.f239812f) {
            contentValues.put("sample_uid", this.field_sample_uid);
        }
        if (this.f239813g) {
            contentValues.put("feature_str", this.field_feature_str);
        }
        if (this.f239814h) {
            contentValues.put("label", java.lang.Integer.valueOf(this.field_label));
        }
        if (this.f239815i) {
            contentValues.put("tag", java.lang.Integer.valueOf(this.field_tag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFewShotLearning", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FewShotLearning ( ");
        l75.e0 e0Var = f239808v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239800n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFewShotLearning", "createTableSql %s", str2);
            k0Var.A("FewShotLearning", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FewShotLearning", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFewShotLearning", "updateTableSql %s", str3);
            k0Var.A("FewShotLearning", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFewShotLearning", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239808v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239809w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239799m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239799m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f239810d = true;
            }
        }
        if (contentValues.containsKey("model")) {
            this.field_model = contentValues.getAsString("model");
            if (z17) {
                this.f239811e = true;
            }
        }
        if (contentValues.containsKey("sample_uid")) {
            this.field_sample_uid = contentValues.getAsString("sample_uid");
            if (z17) {
                this.f239812f = true;
            }
        }
        if (contentValues.containsKey("feature_str")) {
            this.field_feature_str = contentValues.getAsString("feature_str");
            if (z17) {
                this.f239813g = true;
            }
        }
        if (contentValues.containsKey("label")) {
            this.field_label = contentValues.getAsInteger("label").intValue();
            if (z17) {
                this.f239814h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsInteger("tag").intValue();
            if (z17) {
                this.f239815i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
