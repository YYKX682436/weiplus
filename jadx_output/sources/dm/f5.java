package dm;

/* loaded from: classes8.dex */
public class f5 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236826p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f236827q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236828r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236829s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236830t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236831u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236832v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236833w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236834x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236835y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236836z;
    public long field_CreateTime;
    public java.lang.String field_Description;
    public long field_ExpiredTime;
    public java.lang.String field_ExtInfo;
    public java.lang.String field_ForcePushId;
    public int field_Status;
    public int field_Type;
    public java.lang.String field_UserIcon;
    public java.lang.String field_UserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236837d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236838e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236839f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236840g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236841h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236842i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236843m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236844n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236845o = true;

    static {
        p75.n0 n0Var = new p75.n0("ForceNotifyData");
        f236826p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236827q = new java.lang.String[0];
        f236828r = 1122917504;
        f236829s = -932289015;
        f236830t = 1575353202;
        f236831u = -56677412;
        f236832v = -202169596;
        f236833w = -202022634;
        f236834x = 358154831;
        f236835y = -1808614382;
        f236836z = 2622298;
        A = 108705909;
        B = initAutoDBInfo(dm.f5.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "ForcePushId";
        e0Var.f316955d.put("ForcePushId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "ForcePushId";
        e0Var.f316954c[1] = "CreateTime";
        e0Var.f316955d.put("CreateTime", "LONG");
        e0Var.f316954c[2] = "ExpiredTime";
        e0Var.f316955d.put("ExpiredTime", "LONG");
        e0Var.f316954c[3] = "Description";
        e0Var.f316955d.put("Description", "TEXT");
        e0Var.f316954c[4] = "UserIcon";
        e0Var.f316955d.put("UserIcon", "TEXT");
        e0Var.f316954c[5] = "UserName";
        e0Var.f316955d.put("UserName", "TEXT");
        e0Var.f316954c[6] = "ExtInfo";
        e0Var.f316955d.put("ExtInfo", "TEXT");
        e0Var.f316954c[7] = "Status";
        e0Var.f316955d.put("Status", "INTEGER default '0' ");
        e0Var.f316954c[8] = "Type";
        e0Var.f316955d.put("Type", "INTEGER default '0' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " ForcePushId TEXT PRIMARY KEY ,  CreateTime LONG,  ExpiredTime LONG,  Description TEXT,  UserIcon TEXT,  UserName TEXT,  ExtInfo TEXT,  Status INTEGER default '0' ,  Type INTEGER default '0' ";
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
            if (f236828r == hashCode) {
                try {
                    this.field_ForcePushId = cursor.getString(i17);
                    this.f236837d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236829s == hashCode) {
                try {
                    this.field_CreateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236830t == hashCode) {
                try {
                    this.field_ExpiredTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236831u == hashCode) {
                try {
                    this.field_Description = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236832v == hashCode) {
                try {
                    this.field_UserIcon = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236833w == hashCode) {
                try {
                    this.field_UserName = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236834x == hashCode) {
                try {
                    this.field_ExtInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236835y == hashCode) {
                try {
                    this.field_Status = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236836z == hashCode) {
                try {
                    this.field_Type = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236837d) {
            contentValues.put("ForcePushId", this.field_ForcePushId);
        }
        if (this.f236838e) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.field_CreateTime));
        }
        if (this.f236839f) {
            contentValues.put("ExpiredTime", java.lang.Long.valueOf(this.field_ExpiredTime));
        }
        if (this.f236840g) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f236841h) {
            contentValues.put("UserIcon", this.field_UserIcon);
        }
        if (this.f236842i) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f236843m) {
            contentValues.put("ExtInfo", this.field_ExtInfo);
        }
        if (this.f236844n) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.field_Status));
        }
        if (this.f236845o) {
            contentValues.put("Type", java.lang.Integer.valueOf(this.field_Type));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseForceNotifyData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ForceNotifyData ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236827q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseForceNotifyData", "createTableSql %s", str2);
            k0Var.A("ForceNotifyData", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ForceNotifyData", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseForceNotifyData", "updateTableSql %s", str3);
            k0Var.A("ForceNotifyData", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseForceNotifyData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_ForcePushId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236826p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236826p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("ForcePushId")) {
            this.field_ForcePushId = contentValues.getAsString("ForcePushId");
            if (z17) {
                this.f236837d = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsLong("CreateTime").longValue();
            if (z17) {
                this.f236838e = true;
            }
        }
        if (contentValues.containsKey("ExpiredTime")) {
            this.field_ExpiredTime = contentValues.getAsLong("ExpiredTime").longValue();
            if (z17) {
                this.f236839f = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z17) {
                this.f236840g = true;
            }
        }
        if (contentValues.containsKey("UserIcon")) {
            this.field_UserIcon = contentValues.getAsString("UserIcon");
            if (z17) {
                this.f236841h = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z17) {
                this.f236842i = true;
            }
        }
        if (contentValues.containsKey("ExtInfo")) {
            this.field_ExtInfo = contentValues.getAsString("ExtInfo");
            if (z17) {
                this.f236843m = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.field_Status = contentValues.getAsInteger("Status").intValue();
            if (z17) {
                this.f236844n = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.field_Type = contentValues.getAsInteger("Type").intValue();
            if (z17) {
                this.f236845o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
