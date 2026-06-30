package dm;

/* loaded from: classes4.dex */
public class za extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f241538g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f241539h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241540i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241541m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241542n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241543o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f241544p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f241545q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241546d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241547e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241548f = true;
    public long field_groupId;
    public byte[] field_groupStrcut;
    public int field_groupTime;

    static {
        p75.n0 n0Var = new p75.n0("SnsWsFoldGroupDetail");
        f241538g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241539h = new java.lang.String[0];
        f241540i = 293428218;
        f241541m = -1482988052;
        f241542n = 759304656;
        f241543o = 108705909;
        f241544p = initAutoDBInfo(dm.za.class);
        f241545q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "groupId";
        e0Var.f316955d.put("groupId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "groupId";
        e0Var.f316954c[1] = "groupTime";
        e0Var.f316955d.put("groupTime", "INTEGER");
        e0Var.f316954c[2] = "groupStrcut";
        e0Var.f316955d.put("groupStrcut", "BLOB");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " groupId LONG PRIMARY KEY ,  groupTime INTEGER,  groupStrcut BLOB";
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
            if (f241540i == hashCode) {
                try {
                    this.field_groupId = cursor.getLong(i17);
                    this.f241546d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241541m == hashCode) {
                try {
                    this.field_groupTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241542n == hashCode) {
                try {
                    this.field_groupStrcut = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241543o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241546d) {
            contentValues.put("groupId", java.lang.Long.valueOf(this.field_groupId));
        }
        if (this.f241547e) {
            contentValues.put("groupTime", java.lang.Integer.valueOf(this.field_groupTime));
        }
        if (this.f241548f) {
            contentValues.put("groupStrcut", this.field_groupStrcut);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsWsFoldGroupDetail ( ");
        l75.e0 e0Var = f241544p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241539h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTableSql %s", str2);
            k0Var.A("SnsWsFoldGroupDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsWsFoldGroupDetail", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "updateTableSql %s", str3);
            k0Var.A("SnsWsFoldGroupDetail", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241544p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241545q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_groupId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241538g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241538g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsLong("groupId").longValue();
            if (z17) {
                this.f241546d = true;
            }
        }
        if (contentValues.containsKey("groupTime")) {
            this.field_groupTime = contentValues.getAsInteger("groupTime").intValue();
            if (z17) {
                this.f241547e = true;
            }
        }
        if (contentValues.containsKey("groupStrcut")) {
            this.field_groupStrcut = contentValues.getAsByteArray("groupStrcut");
            if (z17) {
                this.f241548f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
