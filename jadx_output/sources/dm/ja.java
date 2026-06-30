package dm;

/* loaded from: classes4.dex */
public class ja extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237876h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f237877i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f237878m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237879n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237880o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237881p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237882q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237883r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f237884s;

    /* renamed from: t, reason: collision with root package name */
    public static final o75.e f237885t;
    public int field_id;
    public java.lang.String field_key;
    public java.lang.String field_selfUsername;
    public int field_signedVersion;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237886d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237887e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237888f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237889g = true;

    static {
        p75.n0 n0Var = new p75.n0("SignedAgreementInfo");
        f237876h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237877i = new p75.d("selfUsername", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237878m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS SignedAgreementInfo_selfUsername ON SignedAgreementInfo(selfUsername)"};
        f237879n = 106079;
        f237880o = 1229697090;
        f237881p = 3355;
        f237882q = -1217507812;
        f237883r = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        ((java.util.HashMap) e0Var.f316955d).put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "selfUsername";
        ((java.util.HashMap) e0Var.f316955d).put("selfUsername", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_ID;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_ID, "INTEGER");
        e0Var.f316954c[3] = "signedVersion";
        ((java.util.HashMap) e0Var.f316955d).put("signedVersion", "INTEGER default '0' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  selfUsername TEXT,  id INTEGER,  signedVersion INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f237884s = e0Var;
        f237885t = new o75.e();
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
            if (f237879n == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f237886d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSignedAgreementInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237880o == hashCode) {
                try {
                    this.field_selfUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSignedAgreementInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237881p == hashCode) {
                try {
                    this.field_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSignedAgreementInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237882q == hashCode) {
                try {
                    this.field_signedVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSignedAgreementInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237883r == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237886d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f237887e) {
            contentValues.put("selfUsername", this.field_selfUsername);
        }
        if (this.f237888f) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
        }
        if (this.f237889g) {
            contentValues.put("signedVersion", java.lang.Integer.valueOf(this.field_signedVersion));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSignedAgreementInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SignedAgreementInfo ( ");
        l75.e0 e0Var = f237884s;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237878m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "createTableSql %s", str2);
            k0Var.A("SignedAgreementInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SignedAgreementInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "updateTableSql %s", str3);
            k0Var.A("SignedAgreementInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237884s;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237885t;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237876h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237876h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f237886d = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.field_selfUsername = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f237887e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsInteger(dm.i4.COL_ID).intValue();
            if (z17) {
                this.f237888f = true;
            }
        }
        if (contentValues.containsKey("signedVersion")) {
            this.field_signedVersion = contentValues.getAsInteger("signedVersion").intValue();
            if (z17) {
                this.f237889g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
