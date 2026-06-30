package dm;

/* loaded from: classes4.dex */
public class i7 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237601f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237602g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237603h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237604i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237605m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237606n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237607o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237608d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237609e = true;
    public java.lang.String field_appId;
    public r45.v54 field_launchPB;

    static {
        p75.n0 n0Var = new p75.n0("LaunchWxaAppPBTable");
        f237601f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237602g = new java.lang.String[0];
        f237603h = 93028124;
        f237604i = -1407251227;
        f237605m = 108705909;
        f237606n = initAutoDBInfo(dm.i7.class);
        f237607o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "launchPB";
        e0Var.f316955d.put("launchPB", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " appId TEXT,  launchPB BLOB";
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
            if (f237603h == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppPBTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237604i == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_launchPB = (r45.v54) new r45.v54().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppPBTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237605m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237608d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237609e) {
            r45.v54 v54Var = this.field_launchPB;
            if (v54Var != null) {
                try {
                    contentValues.put("launchPB", v54Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", e17.getMessage());
                }
            } else {
                contentValues.put("launchPB", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LaunchWxaAppPBTable ( ");
        l75.e0 e0Var = f237606n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237602g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTableSql %s", str2);
            k0Var.A("LaunchWxaAppPBTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LaunchWxaAppPBTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "updateTableSql %s", str3);
            k0Var.A("LaunchWxaAppPBTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237606n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237607o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237601f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237601f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237608d = true;
            }
        }
        if (contentValues.containsKey("launchPB")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("launchPB");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_launchPB = (r45.v54) new r45.v54().parseFrom(asByteArray);
                    if (z17) {
                        this.f237609e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
