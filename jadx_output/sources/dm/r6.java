package dm;

/* loaded from: classes8.dex */
public class r6 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f239636m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f239637n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239638o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239639p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239640q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239641r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239642s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239643t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239644u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239645v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239646w;
    public long field_addressId;
    public long field_calltime;
    public long field_duration;
    public int field_phoneType;
    public java.lang.String field_phonenumber;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239647d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239648e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239649f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239650g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239651h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239652i = true;

    static {
        p75.n0 n0Var = new p75.n0("IPCallRecord");
        f239636m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239637n = new java.lang.String[0];
        f239638o = -276836809;
        f239639p = -171676117;
        f239640q = -1992012396;
        f239641r = -892481550;
        f239642s = 874543151;
        f239643t = -1028990520;
        f239644u = 108705909;
        f239645v = initAutoDBInfo(dm.r6.class);
        f239646w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "phonenumber";
        e0Var.f316955d.put("phonenumber", "TEXT");
        e0Var.f316954c[1] = "calltime";
        e0Var.f316955d.put("calltime", "LONG");
        e0Var.f316954c[2] = "duration";
        e0Var.f316955d.put("duration", "LONG");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "addressId";
        e0Var.f316955d.put("addressId", "LONG default '-1' ");
        e0Var.f316954c[5] = "phoneType";
        e0Var.f316955d.put("phoneType", "INTEGER default '-1' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " phonenumber TEXT,  calltime LONG,  duration LONG,  status INTEGER,  addressId LONG default '-1' ,  phoneType INTEGER default '-1' ";
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
            if (f239638o == hashCode) {
                try {
                    this.field_phonenumber = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239639p == hashCode) {
                try {
                    this.field_calltime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239640q == hashCode) {
                try {
                    this.field_duration = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239641r == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239642s == hashCode) {
                try {
                    this.field_addressId = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239643t == hashCode) {
                try {
                    this.field_phoneType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239644u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239647d) {
            contentValues.put("phonenumber", this.field_phonenumber);
        }
        if (this.f239648e) {
            contentValues.put("calltime", java.lang.Long.valueOf(this.field_calltime));
        }
        if (this.f239649f) {
            contentValues.put("duration", java.lang.Long.valueOf(this.field_duration));
        }
        if (this.f239650g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f239651h) {
            contentValues.put("addressId", java.lang.Long.valueOf(this.field_addressId));
        }
        if (this.f239652i) {
            contentValues.put("phoneType", java.lang.Integer.valueOf(this.field_phoneType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseIPCallRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallRecord ( ");
        l75.e0 e0Var = f239645v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239637n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallRecord", "createTableSql %s", str2);
            k0Var.A("IPCallRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "IPCallRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallRecord", "updateTableSql %s", str3);
            k0Var.A("IPCallRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239645v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239646w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239636m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239636m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("phonenumber")) {
            this.field_phonenumber = contentValues.getAsString("phonenumber");
            if (z17) {
                this.f239647d = true;
            }
        }
        if (contentValues.containsKey("calltime")) {
            this.field_calltime = contentValues.getAsLong("calltime").longValue();
            if (z17) {
                this.f239648e = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f239649f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f239650g = true;
            }
        }
        if (contentValues.containsKey("addressId")) {
            this.field_addressId = contentValues.getAsLong("addressId").longValue();
            if (z17) {
                this.f239651h = true;
            }
        }
        if (contentValues.containsKey("phoneType")) {
            this.field_phoneType = contentValues.getAsInteger("phoneType").intValue();
            if (z17) {
                this.f239652i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
