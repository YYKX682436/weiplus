package dm;

/* loaded from: classes4.dex */
public class t8 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240149f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240150g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240151h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240152i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240153m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240154n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240155o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240156d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240157e = true;
    public java.lang.String field_finder_username;
    public java.lang.String field_openIMUsername;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMFinderInfoNew");
        f240149f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240150g = new java.lang.String[0];
        f240151h = -2124225564;
        f240152i = 1804799183;
        f240153m = 108705909;
        f240154n = initAutoDBInfo(dm.t8.class);
        f240155o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "openIMUsername";
        e0Var.f316955d.put("openIMUsername", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "openIMUsername";
        e0Var.f316954c[1] = "finder_username";
        e0Var.f316955d.put("finder_username", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " openIMUsername TEXT PRIMARY KEY ,  finder_username TEXT";
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
            if (f240151h == hashCode) {
                try {
                    this.field_openIMUsername = cursor.getString(i17);
                    this.f240156d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240152i == hashCode) {
                try {
                    this.field_finder_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240153m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240156d) {
            contentValues.put("openIMUsername", this.field_openIMUsername);
        }
        if (this.f240157e) {
            contentValues.put("finder_username", this.field_finder_username);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMFinderInfoNew ( ");
        l75.e0 e0Var = f240154n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240150g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTableSql %s", str2);
            k0Var.A("OpenIMFinderInfoNew", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenIMFinderInfoNew", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "updateTableSql %s", str3);
            k0Var.A("OpenIMFinderInfoNew", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240154n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240155o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_openIMUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240149f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240149f.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "openIMUsername", this.field_openIMUsername);
            n51.f.b(jSONObject, "finder_username", this.field_finder_username);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openIMUsername")) {
            this.field_openIMUsername = contentValues.getAsString("openIMUsername");
            if (z17) {
                this.f240156d = true;
            }
        }
        if (contentValues.containsKey("finder_username")) {
            this.field_finder_username = contentValues.getAsString("finder_username");
            if (z17) {
                this.f240157e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
