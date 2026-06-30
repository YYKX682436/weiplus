package dm;

/* loaded from: classes4.dex */
public class pb extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f239260h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f239261i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239262m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239263n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239264o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239265p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239266q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f239267r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f239268s;
    public java.lang.String field_canvasExt;
    public java.lang.String field_canvasId;
    public java.lang.String field_canvasXml;
    public long field_createTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239269d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239270e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239271f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239272g = true;

    static {
        p75.n0 n0Var = new p75.n0("UxCanvasInfo");
        f239260h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239261i = new java.lang.String[0];
        f239262m = -105740141;
        f239263n = 1017037727;
        f239264o = 1369213417;
        f239265p = 1017019817;
        f239266q = 108705909;
        f239267r = initAutoDBInfo(dm.pb.class);
        f239268s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "canvasId";
        e0Var.f316955d.put("canvasId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "canvasId";
        e0Var.f316954c[1] = "canvasXml";
        e0Var.f316955d.put("canvasXml", "TEXT");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[3] = "canvasExt";
        e0Var.f316955d.put("canvasExt", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " canvasId TEXT PRIMARY KEY ,  canvasXml TEXT,  createTime LONG,  canvasExt TEXT";
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
            if (f239262m == hashCode) {
                try {
                    this.field_canvasId = cursor.getString(i17);
                    this.f239269d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239263n == hashCode) {
                try {
                    this.field_canvasXml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239264o == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239265p == hashCode) {
                try {
                    this.field_canvasExt = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUxCanvasInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239266q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239269d) {
            contentValues.put("canvasId", this.field_canvasId);
        }
        if (this.f239270e) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f239271f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f239272g) {
            contentValues.put("canvasExt", this.field_canvasExt);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUxCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UxCanvasInfo ( ");
        l75.e0 e0Var = f239267r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239261i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "createTableSql %s", str2);
            k0Var.A("UxCanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "UxCanvasInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("UxCanvasInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239267r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239268s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_canvasId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239260h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239260h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsString("canvasId");
            if (z17) {
                this.f239269d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f239270e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239271f = true;
            }
        }
        if (contentValues.containsKey("canvasExt")) {
            this.field_canvasExt = contentValues.getAsString("canvasExt");
            if (z17) {
                this.f239272g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
