package wh4;

/* loaded from: classes4.dex */
public class a extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f445973m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f445974n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f445975o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f445976p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f445977q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f445978r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f445979s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f445980t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f445981u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f445982v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f445983w;
    public java.lang.String field_businessKey;
    public int field_businessType;
    public java.lang.String field_guardianUserName;
    public long field_msgSvrId;
    public long field_time;
    public java.lang.String field_wardUserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f445984d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f445985e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f445986f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f445987g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f445988h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f445989i = true;

    static {
        p75.n0 n0Var = new p75.n0("TeenModeAuthorization");
        f445973m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f445974n = new java.lang.String[0];
        f445975o = 1225215615;
        f445976p = -672734438;
        f445977q = -356714073;
        f445978r = -1516193902;
        f445979s = -1294411543;
        f445980t = 3560141;
        f445981u = 108705909;
        f445982v = initAutoDBInfo(wh4.a.class);
        f445983w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "businessKey";
        e0Var.f316955d.put("businessKey", "TEXT");
        e0Var.f316954c[1] = "businessType";
        e0Var.f316955d.put("businessType", "INTEGER");
        e0Var.f316954c[2] = "guardianUserName";
        e0Var.f316955d.put("guardianUserName", "TEXT");
        e0Var.f316954c[3] = "wardUserName";
        e0Var.f316955d.put("wardUserName", "TEXT");
        e0Var.f316954c[4] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[5] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " businessKey TEXT,  businessType INTEGER,  guardianUserName TEXT,  wardUserName TEXT,  msgSvrId LONG,  time LONG";
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
            if (f445975o == hashCode) {
                try {
                    this.field_businessKey = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445976p == hashCode) {
                try {
                    this.field_businessType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445977q == hashCode) {
                try {
                    this.field_guardianUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445978r == hashCode) {
                try {
                    this.field_wardUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445979s == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445980t == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f445981u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f445984d) {
            contentValues.put("businessKey", this.field_businessKey);
        }
        if (this.f445985e) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.field_businessType));
        }
        if (this.f445986f) {
            contentValues.put("guardianUserName", this.field_guardianUserName);
        }
        if (this.f445987g) {
            contentValues.put("wardUserName", this.field_wardUserName);
        }
        if (this.f445988h) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f445989i) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TeenModeAuthorization ( ");
        l75.e0 e0Var = f445982v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f445974n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTableSql %s", str2);
            k0Var.A("TeenModeAuthorization", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TeenModeAuthorization", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "updateTableSql %s", str3);
            k0Var.A("TeenModeAuthorization", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f445982v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f445983w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f445973m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f445973m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessKey")) {
            this.field_businessKey = contentValues.getAsString("businessKey");
            if (z17) {
                this.f445984d = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.field_businessType = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f445985e = true;
            }
        }
        if (contentValues.containsKey("guardianUserName")) {
            this.field_guardianUserName = contentValues.getAsString("guardianUserName");
            if (z17) {
                this.f445986f = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.field_wardUserName = contentValues.getAsString("wardUserName");
            if (z17) {
                this.f445987g = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f445988h = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f445989i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
