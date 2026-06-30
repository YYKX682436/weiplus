package dm;

/* loaded from: classes4.dex */
public class l7 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238282g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f238283h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238284i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238285m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238286n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238287o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f238288p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f238289q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238290d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238291e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238292f = true;
    public java.lang.String field_id;
    public java.lang.String field_md5;
    public java.lang.String field_path;

    static {
        p75.n0 n0Var = new p75.n0("LiveElementMediaResource");
        f238282g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238283h = new java.lang.String[0];
        f238284i = 3355;
        f238285m = 3433509;
        f238286n = 107902;
        f238287o = 108705909;
        f238288p = initAutoDBInfo(dm.l7.class);
        f238289q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[2] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  path TEXT,  md5 TEXT";
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
            if (f238284i == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f238290d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveElementMediaResource", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238285m == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveElementMediaResource", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238286n == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveElementMediaResource", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238287o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238290d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f238291e) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f238292f) {
            contentValues.put("md5", this.field_md5);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveElementMediaResource", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveElementMediaResource ( ");
        l75.e0 e0Var = f238288p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238283h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "createTableSql %s", str2);
            k0Var.A("LiveElementMediaResource", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiveElementMediaResource", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "updateTableSql %s", str3);
            k0Var.A("LiveElementMediaResource", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238288p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238289q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238282g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238282g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f238290d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f238291e = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f238292f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
