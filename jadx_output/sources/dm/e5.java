package dm;

/* loaded from: classes8.dex */
public class e5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f236615o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f236616p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236617q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f236618r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f236619s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236620t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236621u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236622v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236623w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236624x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236625y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236626z;
    public int field_businessId;
    public int field_completePlayCnt;
    public long field_courseId;
    public long field_feedId;
    public int field_maxProgress;
    public long field_playTimeMs;
    public int field_progress;
    public float field_speedRatio;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236627d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236628e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236629f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236630g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236631h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236632i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236633m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236634n = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderVideoState");
        f236615o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236616p = new p75.d("businessId", "int", tableName, "");
        f236617q = new p75.d("feedId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236618r = new p75.d("courseId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236619s = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderVideoState_businessId_index ON FinderVideoState(businessId)", "CREATE INDEX IF NOT EXISTS FinderVideoState_feedId_index ON FinderVideoState(feedId)", "CREATE INDEX IF NOT EXISTS FinderVideoState_courseId_index ON FinderVideoState(courseId)"};
        f236620t = 1702091003;
        f236621u = -1278410919;
        f236622v = -1001078227;
        f236623w = 1601576359;
        f236624x = 619738116;
        f236625y = -368357738;
        f236626z = 1031219121;
        A = 1017218588;
        B = 108705909;
        C = initAutoDBInfo(dm.e5.class);
        D = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "businessId";
        e0Var.f316955d.put("businessId", "INTEGER default '0' ");
        e0Var.f316954c[1] = "feedId";
        e0Var.f316955d.put("feedId", "LONG default '0' ");
        e0Var.f316954c[2] = "progress";
        e0Var.f316955d.put("progress", "INTEGER default '0' ");
        e0Var.f316954c[3] = "playTimeMs";
        e0Var.f316955d.put("playTimeMs", "LONG default '0' ");
        e0Var.f316954c[4] = "speedRatio";
        e0Var.f316955d.put("speedRatio", "FLOAT default '0' ");
        e0Var.f316954c[5] = "courseId";
        e0Var.f316955d.put("courseId", "LONG default '0' ");
        e0Var.f316954c[6] = "maxProgress";
        e0Var.f316955d.put("maxProgress", "INTEGER default '0' ");
        e0Var.f316954c[7] = "completePlayCnt";
        e0Var.f316955d.put("completePlayCnt", "INTEGER default '0' ");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " businessId INTEGER default '0' ,  feedId LONG default '0' ,  progress INTEGER default '0' ,  playTimeMs LONG default '0' ,  speedRatio FLOAT default '0' ,  courseId LONG default '0' ,  maxProgress INTEGER default '0' ,  completePlayCnt INTEGER default '0' ";
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
            if (f236620t == hashCode) {
                try {
                    this.field_businessId = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236621u == hashCode) {
                try {
                    this.field_feedId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236622v == hashCode) {
                try {
                    this.field_progress = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236623w == hashCode) {
                try {
                    this.field_playTimeMs = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236624x == hashCode) {
                try {
                    this.field_speedRatio = cursor.getFloat(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236625y == hashCode) {
                try {
                    this.field_courseId = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236626z == hashCode) {
                try {
                    this.field_maxProgress = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_completePlayCnt = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderVideoState", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236627d) {
            contentValues.put("businessId", java.lang.Integer.valueOf(this.field_businessId));
        }
        if (this.f236628e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.field_feedId));
        }
        if (this.f236629f) {
            contentValues.put("progress", java.lang.Integer.valueOf(this.field_progress));
        }
        if (this.f236630g) {
            contentValues.put("playTimeMs", java.lang.Long.valueOf(this.field_playTimeMs));
        }
        if (this.f236631h) {
            contentValues.put("speedRatio", java.lang.Float.valueOf(this.field_speedRatio));
        }
        if (this.f236632i) {
            contentValues.put("courseId", java.lang.Long.valueOf(this.field_courseId));
        }
        if (this.f236633m) {
            contentValues.put("maxProgress", java.lang.Integer.valueOf(this.field_maxProgress));
        }
        if (this.f236634n) {
            contentValues.put("completePlayCnt", java.lang.Integer.valueOf(this.field_completePlayCnt));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderVideoState", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderVideoState ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236619s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderVideoState", "createTableSql %s", str2);
            k0Var.A("FinderVideoState", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderVideoState", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderVideoState", "updateTableSql %s", str3);
            k0Var.A("FinderVideoState", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderVideoState", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return C;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return D;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236615o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236615o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessId")) {
            this.field_businessId = contentValues.getAsInteger("businessId").intValue();
            if (z17) {
                this.f236627d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f236628e = true;
            }
        }
        if (contentValues.containsKey("progress")) {
            this.field_progress = contentValues.getAsInteger("progress").intValue();
            if (z17) {
                this.f236629f = true;
            }
        }
        if (contentValues.containsKey("playTimeMs")) {
            this.field_playTimeMs = contentValues.getAsLong("playTimeMs").longValue();
            if (z17) {
                this.f236630g = true;
            }
        }
        if (contentValues.containsKey("speedRatio")) {
            this.field_speedRatio = contentValues.getAsFloat("speedRatio").floatValue();
            if (z17) {
                this.f236631h = true;
            }
        }
        if (contentValues.containsKey("courseId")) {
            this.field_courseId = contentValues.getAsLong("courseId").longValue();
            if (z17) {
                this.f236632i = true;
            }
        }
        if (contentValues.containsKey("maxProgress")) {
            this.field_maxProgress = contentValues.getAsInteger("maxProgress").intValue();
            if (z17) {
                this.f236633m = true;
            }
        }
        if (contentValues.containsKey("completePlayCnt")) {
            this.field_completePlayCnt = contentValues.getAsInteger("completePlayCnt").intValue();
            if (z17) {
                this.f236634n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
