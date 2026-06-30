package dm;

/* loaded from: classes12.dex */
public class i3 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237554g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f237555h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f237556i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f237557m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f237558n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f237559o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237560p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237561q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237562r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237563s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f237564t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f237565u;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237566d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237567e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237568f = false;
    private long field_flag;
    private java.lang.String field_query;
    private long field_updateTime;

    static {
        p75.n0 n0Var = new p75.n0("FTS5NativeQueryClickRecallInfo");
        f237554g = n0Var;
        java.lang.String str = n0Var.f352676a;
        f237555h = new p75.d("rowid", "long", str, "");
        f237556i = new p75.d("query", "string", str, "");
        f237557m = new p75.d(dm.i4.COL_UPDATETIME, "long", str, "");
        f237558n = new p75.d("flag", "long", str, "");
        f237559o = new java.lang.String[0];
        f237560p = 107944136;
        f237561q = -295931082;
        f237562r = 3145580;
        f237563s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "query";
        ((java.util.HashMap) e0Var.f316955d).put("query", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "query";
        e0Var.f316954c[1] = dm.i4.COL_UPDATETIME;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[2] = "flag";
        ((java.util.HashMap) e0Var.f316955d).put("flag", "LONG default '0' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " query TEXT default ''  PRIMARY KEY ,  updateTime LONG default '0' ,  flag LONG default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f237564t = e0Var;
        f237565u = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5NativeQueryClickRecallInfo ( ");
        l75.e0 e0Var = f237564t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237559o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTableSql %s", str2);
            k0Var.A("FTS5NativeQueryClickRecallInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FTS5NativeQueryClickRecallInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "updateTableSql %s", str3);
            k0Var.A("FTS5NativeQueryClickRecallInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f237560p == hashCode) {
                try {
                    this.field_query = cursor.getString(i17);
                    this.f237566d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237561q == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237562r == hashCode) {
                try {
                    this.field_flag = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237563s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_query == null) {
            this.field_query = "";
        }
        if (this.f237566d) {
            contentValues.put("query", this.field_query);
        }
        if (this.f237567e) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f237568f) {
            contentValues.put("flag", java.lang.Long.valueOf(this.field_flag));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        createTable(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237564t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237565u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_query;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237554g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237554g.f352676a;
    }

    public long replaceToDB(l75.k0 k0Var, boolean z17) {
        m75.d dVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(this.field_query), "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
            cVar.f343590d = this;
            dVar = new m75.d(this, cVar, f237565u, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        } else {
            dVar = new m75.d(this, null, null, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        }
        return dVar.a(k0Var);
    }

    public long t0() {
        return this.field_flag;
    }

    public java.lang.String u0() {
        return this.field_query;
    }

    public long v0() {
        return this.field_updateTime;
    }

    public void w0(long j17) {
        this.field_flag = j17;
        this.f237568f = true;
    }

    public void y0(java.lang.String str) {
        this.field_query = str;
        this.f237566d = true;
    }

    public void z0(long j17) {
        this.field_updateTime = j17;
        this.f237567e = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("query")) {
            this.field_query = contentValues.getAsString("query");
            if (z17) {
                this.f237566d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237567e = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f237568f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
