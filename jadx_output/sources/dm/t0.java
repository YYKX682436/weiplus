package dm;

/* loaded from: classes4.dex */
public class t0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239988g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239989h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239990i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239991m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239992n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239993o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239994p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239995q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239996d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239997e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239998f = true;
    public long field_endTime;
    public java.lang.String field_sessionName;
    public long field_startTime;

    static {
        p75.n0 n0Var = new p75.n0("BackupTempMoveTime");
        f239988g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239989h = new java.lang.String[0];
        f239990i = -22661567;
        f239991m = -2129294769;
        f239992n = -1607243192;
        f239993o = 108705909;
        f239994p = initAutoDBInfo(dm.t0.class);
        f239995q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "sessionName";
        e0Var.f316955d.put("sessionName", "TEXT default '' ");
        e0Var.f316954c[1] = "startTime";
        e0Var.f316955d.put("startTime", "LONG default '0' ");
        e0Var.f316954c[2] = "endTime";
        e0Var.f316955d.put("endTime", "LONG default '0' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " sessionName TEXT default '' ,  startTime LONG default '0' ,  endTime LONG default '0' ";
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
            if (f239990i == hashCode) {
                try {
                    this.field_sessionName = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239991m == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239992n == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239993o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_sessionName == null) {
            this.field_sessionName = "";
        }
        if (this.f239996d) {
            contentValues.put("sessionName", this.field_sessionName);
        }
        if (this.f239997e) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f239998f) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackupTempMoveTime ( ");
        l75.e0 e0Var = f239994p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239989h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTableSql %s", str2);
            k0Var.A("BackupTempMoveTime", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BackupTempMoveTime", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "updateTableSql %s", str3);
            k0Var.A("BackupTempMoveTime", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239994p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239995q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239988g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239988g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("sessionName")) {
            this.field_sessionName = contentValues.getAsString("sessionName");
            if (z17) {
                this.f239996d = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f239997e = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f239998f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
