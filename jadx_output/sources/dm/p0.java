package dm;

/* loaded from: classes4.dex */
public class p0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239075g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239076h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239077i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239078m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239079n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239080o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239081p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239082q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239083d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239084e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239085f = true;
    public java.lang.String field_appId;
    public long field_flag;
    public int field_sortId;

    static {
        p75.n0 n0Var = new p75.n0("AppSort");
        f239075g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239076h = new java.lang.String[0];
        f239077i = 3145580;
        f239078m = 93028124;
        f239079n = -896594087;
        f239080o = 108705909;
        f239081p = initAutoDBInfo(dm.p0.class);
        f239082q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "flag";
        e0Var.f316955d.put("flag", "LONG default '0' ");
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT default '' ");
        e0Var.f316954c[2] = "sortId";
        e0Var.f316955d.put("sortId", "INTEGER default '0' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " flag LONG default '0' ,  appId TEXT default '' ,  sortId INTEGER default '0' ";
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
            if (f239077i == hashCode) {
                try {
                    this.field_flag = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239078m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239079n == hashCode) {
                try {
                    this.field_sortId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppSort", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239080o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239083d) {
            contentValues.put("flag", java.lang.Long.valueOf(this.field_flag));
        }
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f239084e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239085f) {
            contentValues.put("sortId", java.lang.Integer.valueOf(this.field_sortId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppSort", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppSort ( ");
        l75.e0 e0Var = f239081p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239076h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppSort", "createTableSql %s", str2);
            k0Var.A("AppSort", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppSort", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppSort", "updateTableSql %s", str3);
            k0Var.A("AppSort", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppSort", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239081p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239082q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239075g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239075g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f239083d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239084e = true;
            }
        }
        if (contentValues.containsKey("sortId")) {
            this.field_sortId = contentValues.getAsInteger("sortId").intValue();
            if (z17) {
                this.f239085f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
