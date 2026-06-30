package dm;

/* loaded from: classes4.dex */
public class h7 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237392h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237393i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237394m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237395n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237396o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237397p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237398q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237399r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237400s;
    public java.lang.String field_businessAppInfoKey;
    public long field_duration;
    public long field_lastUpdateTime;
    public byte[] field_respBuff;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237401d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237402e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237403f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237404g = true;

    static {
        p75.n0 n0Var = new p75.n0("LaunchBusinessWxaAppInfo");
        f237392h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237393i = new java.lang.String[0];
        f237394m = -103879344;
        f237395n = -341657533;
        f237396o = -1992012396;
        f237397p = -86827412;
        f237398q = 108705909;
        f237399r = initAutoDBInfo(dm.h7.class);
        f237400s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "businessAppInfoKey";
        e0Var.f316955d.put("businessAppInfoKey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "businessAppInfoKey";
        e0Var.f316954c[1] = "respBuff";
        e0Var.f316955d.put("respBuff", "BLOB");
        e0Var.f316954c[2] = "duration";
        e0Var.f316955d.put("duration", "LONG");
        e0Var.f316954c[3] = "lastUpdateTime";
        e0Var.f316955d.put("lastUpdateTime", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " businessAppInfoKey TEXT PRIMARY KEY ,  respBuff BLOB,  duration LONG,  lastUpdateTime LONG";
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
            if (f237394m == hashCode) {
                try {
                    this.field_businessAppInfoKey = cursor.getString(i17);
                    this.f237401d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237395n == hashCode) {
                try {
                    this.field_respBuff = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237396o == hashCode) {
                try {
                    this.field_duration = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237397p == hashCode) {
                try {
                    this.field_lastUpdateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237398q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237401d) {
            contentValues.put("businessAppInfoKey", this.field_businessAppInfoKey);
        }
        if (this.f237402e) {
            contentValues.put("respBuff", this.field_respBuff);
        }
        if (this.f237403f) {
            contentValues.put("duration", java.lang.Long.valueOf(this.field_duration));
        }
        if (this.f237404g) {
            contentValues.put("lastUpdateTime", java.lang.Long.valueOf(this.field_lastUpdateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LaunchBusinessWxaAppInfo ( ");
        l75.e0 e0Var = f237399r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237393i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTableSql %s", str2);
            k0Var.A("LaunchBusinessWxaAppInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LaunchBusinessWxaAppInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "updateTableSql %s", str3);
            k0Var.A("LaunchBusinessWxaAppInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237399r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237400s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_businessAppInfoKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237392h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237392h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessAppInfoKey")) {
            this.field_businessAppInfoKey = contentValues.getAsString("businessAppInfoKey");
            if (z17) {
                this.f237401d = true;
            }
        }
        if (contentValues.containsKey("respBuff")) {
            this.field_respBuff = contentValues.getAsByteArray("respBuff");
            if (z17) {
                this.f237402e = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f237403f = true;
            }
        }
        if (contentValues.containsKey("lastUpdateTime")) {
            this.field_lastUpdateTime = contentValues.getAsLong("lastUpdateTime").longValue();
            if (z17) {
                this.f237404g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
