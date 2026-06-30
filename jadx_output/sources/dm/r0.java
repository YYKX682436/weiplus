package dm;

/* loaded from: classes4.dex */
public class r0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239539g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239540h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239541i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239542m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239543n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239544o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239545p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239546q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239547d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239548e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239549f = true;
    public java.lang.String field_deviceId;
    public r45.dd field_moveTime;
    public java.lang.String field_sessionName;

    static {
        p75.n0 n0Var = new p75.n0("BackupMoveTime");
        f239539g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239540h = new java.lang.String[0];
        f239541i = 1109191185;
        f239542m = -22661567;
        f239543n = -104418754;
        f239544o = 108705909;
        f239545p = initAutoDBInfo(dm.r0.class);
        f239546q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "deviceId";
        e0Var.f316955d.put("deviceId", "TEXT default '' ");
        e0Var.f316954c[1] = "sessionName";
        e0Var.f316955d.put("sessionName", "TEXT default '' ");
        e0Var.f316954c[2] = "moveTime";
        e0Var.f316955d.put("moveTime", "BLOB default '' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " deviceId TEXT default '' ,  sessionName TEXT default '' ,  moveTime BLOB default '' ";
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
            if (f239541i == hashCode) {
                try {
                    this.field_deviceId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239542m == hashCode) {
                try {
                    this.field_sessionName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239543n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_moveTime = (r45.dd) new r45.dd().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239544o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_deviceId == null) {
            this.field_deviceId = "";
        }
        if (this.f239547d) {
            contentValues.put("deviceId", this.field_deviceId);
        }
        if (this.field_sessionName == null) {
            this.field_sessionName = "";
        }
        if (this.f239548e) {
            contentValues.put("sessionName", this.field_sessionName);
        }
        if (this.f239549f) {
            r45.dd ddVar = this.field_moveTime;
            if (ddVar != null) {
                try {
                    contentValues.put("moveTime", ddVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBackupMoveTime", e17.getMessage());
                }
            } else {
                contentValues.put("moveTime", (byte[]) null);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBackupMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackupMoveTime ( ");
        l75.e0 e0Var = f239545p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239540h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "createTableSql %s", str2);
            k0Var.A("BackupMoveTime", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BackupMoveTime", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "updateTableSql %s", str3);
            k0Var.A("BackupMoveTime", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239545p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239546q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239539g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239539g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("deviceId")) {
            this.field_deviceId = contentValues.getAsString("deviceId");
            if (z17) {
                this.f239547d = true;
            }
        }
        if (contentValues.containsKey("sessionName")) {
            this.field_sessionName = contentValues.getAsString("sessionName");
            if (z17) {
                this.f239548e = true;
            }
        }
        if (contentValues.containsKey("moveTime")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("moveTime");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_moveTime = (r45.dd) new r45.dd().parseFrom(asByteArray);
                    if (z17) {
                        this.f239549f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBackupMoveTime", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
