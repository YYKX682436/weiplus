package dm;

/* loaded from: classes4.dex */
public class q1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239356g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239357h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239358i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239359m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239360n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239361o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239362p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239363q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239364d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239365e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239366f = true;
    public long field_canvasId;
    public java.lang.String field_canvasXml;
    public long field_createTime;

    static {
        p75.n0 n0Var = new p75.n0("CanvasInfo");
        f239356g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239357h = new java.lang.String[0];
        f239358i = -105740141;
        f239359m = 1017037727;
        f239360n = 1369213417;
        f239361o = 108705909;
        f239362p = initAutoDBInfo(dm.q1.class);
        f239363q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "canvasId";
        e0Var.f316955d.put("canvasId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "canvasId";
        e0Var.f316954c[1] = "canvasXml";
        e0Var.f316955d.put("canvasXml", "TEXT");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " canvasId LONG PRIMARY KEY ,  canvasXml TEXT,  createTime LONG";
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
            if (f239358i == hashCode) {
                try {
                    this.field_canvasId = cursor.getLong(i17);
                    this.f239364d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239359m == hashCode) {
                try {
                    this.field_canvasXml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239360n == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239361o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239364d) {
            contentValues.put("canvasId", java.lang.Long.valueOf(this.field_canvasId));
        }
        if (this.f239365e) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f239366f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CanvasInfo ( ");
        l75.e0 e0Var = f239362p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239357h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCanvasInfo", "createTableSql %s", str2);
            k0Var.A("CanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CanvasInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("CanvasInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239362p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239363q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_canvasId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239356g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239356g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsLong("canvasId").longValue();
            if (z17) {
                this.f239364d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f239365e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239366f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
