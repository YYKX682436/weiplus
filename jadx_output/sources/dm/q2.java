package dm;

/* loaded from: classes8.dex */
public class q2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f239367h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f239368i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f239369m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f239370n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f239371o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f239372p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239373q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239374r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239375s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239376t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239377u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239378v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239379w;
    public java.lang.String field_cachedXml;
    public long field_msgSvrId;
    public java.lang.String field_talker;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239380d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239381e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239382f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239383g = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsKfProductCardCache");
        f239367h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239368i = new p75.d("msgSvrId", "long", tableName, "");
        f239369m = new p75.d("cachedXml", "string", tableName, "");
        f239370n = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        f239371o = new p75.d("talker", "string", tableName, "");
        f239372p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS EcsKfProductCardCache_talker_index ON EcsKfProductCardCache(talker)"};
        f239373q = -1294411543;
        f239374r = -553129067;
        f239375s = -295931082;
        f239376t = -881080743;
        f239377u = 108705909;
        f239378v = initAutoDBInfo(dm.q2.class);
        f239379w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgSvrId";
        e0Var.f316954c[1] = "cachedXml";
        e0Var.f316955d.put("cachedXml", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[3] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " msgSvrId LONG PRIMARY KEY ,  cachedXml TEXT,  updateTime LONG,  talker TEXT default '' ";
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
            if (f239373q == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                    this.f239380d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsKfProductCardCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239374r == hashCode) {
                try {
                    this.field_cachedXml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsKfProductCardCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239375s == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsKfProductCardCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239376t == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsKfProductCardCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239377u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239380d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f239381e) {
            contentValues.put("cachedXml", this.field_cachedXml);
        }
        if (this.f239382f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f239383g) {
            contentValues.put("talker", this.field_talker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsKfProductCardCache ( ");
        l75.e0 e0Var = f239378v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239372p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTableSql %s", str2);
            k0Var.A("EcsKfProductCardCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EcsKfProductCardCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "updateTableSql %s", str3);
            k0Var.A("EcsKfProductCardCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239378v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239379w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgSvrId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239367h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239367h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f239380d = true;
            }
        }
        if (contentValues.containsKey("cachedXml")) {
            this.field_cachedXml = contentValues.getAsString("cachedXml");
            if (z17) {
                this.f239381e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239382f = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f239383g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
