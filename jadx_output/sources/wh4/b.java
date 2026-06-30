package wh4;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f445990h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f445991i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f445992m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f445993n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f445994o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f445995p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f445996q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f445997r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f445998s;
    public java.lang.String field_guardianUserName;
    public java.lang.String field_ticket;
    public long field_time;
    public java.lang.String field_wardUserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f445999d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f446000e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f446001f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446002g = true;

    static {
        p75.n0 n0Var = new p75.n0("TeenModeBindGuardian");
        f445990h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f445991i = new java.lang.String[0];
        f445992m = -356714073;
        f445993n = -1516193902;
        f445994o = -873960692;
        f445995p = 3560141;
        f445996q = 108705909;
        f445997r = initAutoDBInfo(wh4.b.class);
        f445998s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "guardianUserName";
        e0Var.f316955d.put("guardianUserName", "TEXT");
        e0Var.f316954c[1] = "wardUserName";
        e0Var.f316955d.put("wardUserName", "TEXT");
        e0Var.f316954c[2] = "ticket";
        e0Var.f316955d.put("ticket", "TEXT");
        e0Var.f316954c[3] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " guardianUserName TEXT,  wardUserName TEXT,  ticket TEXT,  time LONG";
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
            if (f445992m == hashCode) {
                try {
                    this.field_guardianUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445993n == hashCode) {
                try {
                    this.field_wardUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445994o == hashCode) {
                try {
                    this.field_ticket = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445995p == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445996q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f445999d) {
            contentValues.put("guardianUserName", this.field_guardianUserName);
        }
        if (this.f446000e) {
            contentValues.put("wardUserName", this.field_wardUserName);
        }
        if (this.f446001f) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f446002g) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TeenModeBindGuardian ( ");
        l75.e0 e0Var = f445997r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f445991i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTableSql %s", str2);
            k0Var.A("TeenModeBindGuardian", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TeenModeBindGuardian", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "updateTableSql %s", str3);
            k0Var.A("TeenModeBindGuardian", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f445997r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f445998s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f445990h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f445990h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("guardianUserName")) {
            this.field_guardianUserName = contentValues.getAsString("guardianUserName");
            if (z17) {
                this.f445999d = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.field_wardUserName = contentValues.getAsString("wardUserName");
            if (z17) {
                this.f446000e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z17) {
                this.f446001f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f446002g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
