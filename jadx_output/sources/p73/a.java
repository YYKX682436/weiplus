package p73;

/* loaded from: classes8.dex */
public class a extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f352501h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f352502i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f352503m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f352504n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f352505o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f352506p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f352507q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f352508r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f352509s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f352510t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f352511u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f352512v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f352513w;
    public java.lang.String field_CommHashUserName;
    public java.lang.String field_HardCodeHashUserName;
    public java.lang.String field_HashUserName;
    public java.lang.String field_UserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f352514d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f352515e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352516f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f352517g = true;

    static {
        p75.n0 n0Var = new p75.n0("HashUserNameMap");
        f352501h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f352502i = new p75.d("UserName", "string", tableName, "");
        f352503m = new p75.d("HashUserName", "string", tableName, "");
        f352504n = new p75.d("CommHashUserName", "string", tableName, "");
        f352505o = new p75.d("HardCodeHashUserName", "string", tableName, "");
        f352506p = new java.lang.String[0];
        f352507q = -202022634;
        f352508r = -2124511164;
        f352509s = 971458928;
        f352510t = -211304996;
        f352511u = 108705909;
        f352512v = initAutoDBInfo(p73.a.class);
        f352513w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "UserName";
        e0Var.f316955d.put("UserName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "UserName";
        e0Var.f316954c[1] = "HashUserName";
        e0Var.f316955d.put("HashUserName", "TEXT");
        e0Var.f316954c[2] = "CommHashUserName";
        e0Var.f316955d.put("CommHashUserName", "TEXT");
        e0Var.f316954c[3] = "HardCodeHashUserName";
        e0Var.f316955d.put("HardCodeHashUserName", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " UserName TEXT PRIMARY KEY ,  HashUserName TEXT,  CommHashUserName TEXT,  HardCodeHashUserName TEXT";
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
            if (f352507q == hashCode) {
                try {
                    this.field_UserName = cursor.getString(i17);
                    this.f352514d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f352508r == hashCode) {
                try {
                    this.field_HashUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f352509s == hashCode) {
                try {
                    this.field_CommHashUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f352510t == hashCode) {
                try {
                    this.field_HardCodeHashUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f352511u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f352514d) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f352515e) {
            contentValues.put("HashUserName", this.field_HashUserName);
        }
        if (this.f352516f) {
            contentValues.put("CommHashUserName", this.field_CommHashUserName);
        }
        if (this.f352517g) {
            contentValues.put("HardCodeHashUserName", this.field_HardCodeHashUserName);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHashUserNameMap", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HashUserNameMap ( ");
        l75.e0 e0Var = f352512v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f352506p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "createTableSql %s", str2);
            k0Var.A("HashUserNameMap", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HashUserNameMap", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "updateTableSql %s", str3);
            k0Var.A("HashUserNameMap", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f352512v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f352513w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_UserName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f352501h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f352501h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z17) {
                this.f352514d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.field_HashUserName = contentValues.getAsString("HashUserName");
            if (z17) {
                this.f352515e = true;
            }
        }
        if (contentValues.containsKey("CommHashUserName")) {
            this.field_CommHashUserName = contentValues.getAsString("CommHashUserName");
            if (z17) {
                this.f352516f = true;
            }
        }
        if (contentValues.containsKey("HardCodeHashUserName")) {
            this.field_HardCodeHashUserName = contentValues.getAsString("HardCodeHashUserName");
            if (z17) {
                this.f352517g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
