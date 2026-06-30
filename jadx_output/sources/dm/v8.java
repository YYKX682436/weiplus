package dm;

/* loaded from: classes4.dex */
public class v8 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240608f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240609g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240610h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240611i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240612m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240613n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240614o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240615d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240616e = true;
    public long field_openIMSnsFlag;
    public java.lang.String field_openIMUsername;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMSnsFlag");
        f240608f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240609g = new java.lang.String[0];
        f240610h = -2124225564;
        f240611i = -312491978;
        f240612m = 108705909;
        f240613n = initAutoDBInfo(dm.v8.class);
        f240614o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "openIMUsername";
        e0Var.f316955d.put("openIMUsername", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "openIMUsername";
        e0Var.f316954c[1] = "openIMSnsFlag";
        e0Var.f316955d.put("openIMSnsFlag", "LONG default '0' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " openIMUsername TEXT PRIMARY KEY ,  openIMSnsFlag LONG default '0' ";
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
            if (f240610h == hashCode) {
                try {
                    this.field_openIMUsername = cursor.getString(i17);
                    this.f240615d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMSnsFlag", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240611i == hashCode) {
                try {
                    this.field_openIMSnsFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMSnsFlag", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240612m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240615d) {
            contentValues.put("openIMUsername", this.field_openIMUsername);
        }
        if (this.f240616e) {
            contentValues.put("openIMSnsFlag", java.lang.Long.valueOf(this.field_openIMSnsFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMSnsFlag ( ");
        l75.e0 e0Var = f240613n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240609g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTableSql %s", str2);
            k0Var.A("OpenIMSnsFlag", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenIMSnsFlag", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMSnsFlag", "updateTableSql %s", str3);
            k0Var.A("OpenIMSnsFlag", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240613n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240614o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_openIMUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240608f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240608f.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "openIMUsername", this.field_openIMUsername);
            n51.f.b(jSONObject, "openIMSnsFlag", java.lang.Long.valueOf(this.field_openIMSnsFlag));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openIMUsername")) {
            this.field_openIMUsername = contentValues.getAsString("openIMUsername");
            if (z17) {
                this.f240615d = true;
            }
        }
        if (contentValues.containsKey("openIMSnsFlag")) {
            this.field_openIMSnsFlag = contentValues.getAsLong("openIMSnsFlag").longValue();
            if (z17) {
                this.f240616e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
