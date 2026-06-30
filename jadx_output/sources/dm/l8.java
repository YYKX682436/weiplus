package dm;

/* loaded from: classes4.dex */
public class l8 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238293g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f238294h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238295i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238296m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238297n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238298o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f238299p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f238300q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238301d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238302e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238303f = true;
    public long field_cacheTime;
    public boolean field_isKeyView;
    public java.lang.String field_reportStr;

    static {
        p75.n0 n0Var = new p75.n0("NewUserBehaviourCache");
        f238293g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238294h = new java.lang.String[0];
        f238295i = -553589393;
        f238296m = -353340323;
        f238297n = -1395176166;
        f238298o = 108705909;
        f238299p = initAutoDBInfo(dm.l8.class);
        f238300q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "cacheTime";
        e0Var.f316955d.put("cacheTime", "LONG");
        e0Var.f316954c[1] = "reportStr";
        e0Var.f316955d.put("reportStr", "TEXT");
        e0Var.f316954c[2] = "isKeyView";
        e0Var.f316955d.put("isKeyView", "INTEGER");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " cacheTime LONG,  reportStr TEXT,  isKeyView INTEGER";
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
            if (f238295i == hashCode) {
                try {
                    this.field_cacheTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewUserBehaviourCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238296m == hashCode) {
                try {
                    this.field_reportStr = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewUserBehaviourCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238297n == hashCode) {
                try {
                    this.field_isKeyView = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewUserBehaviourCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238298o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238301d) {
            contentValues.put("cacheTime", java.lang.Long.valueOf(this.field_cacheTime));
        }
        if (this.f238302e) {
            contentValues.put("reportStr", this.field_reportStr);
        }
        if (this.f238303f) {
            if (this.field_isKeyView) {
                contentValues.put("isKeyView", (java.lang.Integer) 1);
            } else {
                contentValues.put("isKeyView", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NewUserBehaviourCache ( ");
        l75.e0 e0Var = f238299p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238294h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTableSql %s", str2);
            k0Var.A("NewUserBehaviourCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "NewUserBehaviourCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "updateTableSql %s", str3);
            k0Var.A("NewUserBehaviourCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238299p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238300q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238293g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238293g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cacheTime")) {
            this.field_cacheTime = contentValues.getAsLong("cacheTime").longValue();
            if (z17) {
                this.f238301d = true;
            }
        }
        if (contentValues.containsKey("reportStr")) {
            this.field_reportStr = contentValues.getAsString("reportStr");
            if (z17) {
                this.f238302e = true;
            }
        }
        if (contentValues.containsKey("isKeyView")) {
            this.field_isKeyView = contentValues.getAsInteger("isKeyView").intValue() != 0;
            if (z17) {
                this.f238303f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
