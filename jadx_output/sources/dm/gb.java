package dm;

/* loaded from: classes8.dex */
public class gb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f237208i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f237209m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237210n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237211o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237212p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237213q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237214r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237215s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f237216t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f237217u;
    public java.lang.String field_conDescription;
    public java.lang.String field_conPhone;
    public java.lang.String field_conRemark;
    public java.lang.String field_contactLabels;
    public java.lang.String field_encryptUsername;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237218d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237219e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237220f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237221g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237222h = true;

    static {
        p75.n0 n0Var = new p75.n0("Stranger");
        f237208i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237209m = new java.lang.String[0];
        f237210n = -1914377637;
        f237211o = -1380546654;
        f237212p = 399038527;
        f237213q = 243860762;
        f237214r = -600478452;
        f237215s = 108705909;
        f237216t = initAutoDBInfo(dm.gb.class);
        f237217u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f316955d.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "encryptUsername";
        e0Var.f316954c[1] = "conRemark";
        e0Var.f316955d.put("conRemark", "TEXT default '' ");
        e0Var.f316954c[2] = "contactLabels";
        e0Var.f316955d.put("contactLabels", "TEXT default '' ");
        e0Var.f316954c[3] = "conDescription";
        e0Var.f316955d.put("conDescription", "TEXT default '' ");
        e0Var.f316954c[4] = "conPhone";
        e0Var.f316955d.put("conPhone", "TEXT default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " encryptUsername TEXT default ''  PRIMARY KEY ,  conRemark TEXT default '' ,  contactLabels TEXT default '' ,  conDescription TEXT default '' ,  conPhone TEXT default '' ";
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
            if (f237210n == hashCode) {
                try {
                    this.field_encryptUsername = cursor.getString(i17);
                    this.f237218d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237211o == hashCode) {
                try {
                    this.field_conRemark = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237212p == hashCode) {
                try {
                    this.field_contactLabels = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237213q == hashCode) {
                try {
                    this.field_conDescription = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237214r == hashCode) {
                try {
                    this.field_conPhone = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237215s == hashCode) {
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
        if (this.f237218d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.field_conRemark == null) {
            this.field_conRemark = "";
        }
        if (this.f237219e) {
            contentValues.put("conRemark", this.field_conRemark);
        }
        if (this.field_contactLabels == null) {
            this.field_contactLabels = "";
        }
        if (this.f237220f) {
            contentValues.put("contactLabels", this.field_contactLabels);
        }
        if (this.field_conDescription == null) {
            this.field_conDescription = "";
        }
        if (this.f237221g) {
            contentValues.put("conDescription", this.field_conDescription);
        }
        if (this.field_conPhone == null) {
            this.field_conPhone = "";
        }
        if (this.f237222h) {
            contentValues.put("conPhone", this.field_conPhone);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStranger", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS Stranger ( ");
        l75.e0 e0Var = f237216t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237209m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStranger", "createTableSql %s", str2);
            k0Var.A("Stranger", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "Stranger", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStranger", "updateTableSql %s", str3);
            k0Var.A("Stranger", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStranger", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237216t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237217u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_encryptUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237208i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237208i.f352676a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "encryptUsername", this.field_encryptUsername);
            n51.f.b(jSONObject, "conRemark", this.field_conRemark);
            n51.f.b(jSONObject, "contactLabels", this.field_contactLabels);
            n51.f.b(jSONObject, "conDescription", this.field_conDescription);
            n51.f.b(jSONObject, "conPhone", this.field_conPhone);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f237218d = true;
            }
        }
        if (contentValues.containsKey("conRemark")) {
            this.field_conRemark = contentValues.getAsString("conRemark");
            if (z17) {
                this.f237219e = true;
            }
        }
        if (contentValues.containsKey("contactLabels")) {
            this.field_contactLabels = contentValues.getAsString("contactLabels");
            if (z17) {
                this.f237220f = true;
            }
        }
        if (contentValues.containsKey("conDescription")) {
            this.field_conDescription = contentValues.getAsString("conDescription");
            if (z17) {
                this.f237221g = true;
            }
        }
        if (contentValues.containsKey("conPhone")) {
            this.field_conPhone = contentValues.getAsString("conPhone");
            if (z17) {
                this.f237222h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
