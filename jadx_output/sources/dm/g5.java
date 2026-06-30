package dm;

/* loaded from: classes4.dex */
public class g5 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237071g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f237072h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237073i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237074m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237075n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237076o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237077p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237078q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237079d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237080e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237081f = true;
    public java.lang.String field_encryptUsername;
    public long field_modifyTime;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("FriendUser");
        f237071g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237072h = new java.lang.String[0];
        f237073i = -1914377637;
        f237074m = -265713450;
        f237075n = 1211388583;
        f237076o = 108705909;
        f237077p = initAutoDBInfo(dm.g5.class);
        f237078q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f316955d.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "encryptUsername";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default '' ");
        e0Var.f316954c[2] = "modifyTime";
        e0Var.f316955d.put("modifyTime", "LONG default '0' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " encryptUsername TEXT default ''  PRIMARY KEY ,  username TEXT default '' ,  modifyTime LONG default '0' ";
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
            if (f237073i == hashCode) {
                try {
                    this.field_encryptUsername = cursor.getString(i17);
                    this.f237079d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237074m == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237075n == hashCode) {
                try {
                    this.field_modifyTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237076o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_encryptUsername == null) {
            this.field_encryptUsername = "";
        }
        if (this.f237079d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f237080e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f237081f) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFriendUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FriendUser ( ");
        l75.e0 e0Var = f237077p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237072h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFriendUser", "createTableSql %s", str2);
            k0Var.A("FriendUser", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FriendUser", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFriendUser", "updateTableSql %s", str3);
            k0Var.A("FriendUser", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFriendUser", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237077p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237078q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_encryptUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237071g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237071g.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "encryptUsername", this.field_encryptUsername);
            n51.f.b(jSONObject, dm.i4.COL_USERNAME, this.field_username);
            n51.f.b(jSONObject, "modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f237079d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f237080e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f237081f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
