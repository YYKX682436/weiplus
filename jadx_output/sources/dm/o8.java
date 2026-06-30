package dm;

/* loaded from: classes4.dex */
public class o8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f238981h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f238982i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238983m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238984n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238985o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238986p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238987q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f238988r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f238989s;
    public java.lang.String field_ack_key;
    public long field_receive_time;
    public java.lang.String field_reqkey;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238990d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238991e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238992f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238993g = true;

    static {
        p75.n0 n0Var = new p75.n0("OfflineOrderStatus");
        f238981h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238982i = new java.lang.String[0];
        f238983m = -934495999;
        f238984n = -1170417239;
        f238985o = -892481550;
        f238986p = -771625303;
        f238987q = 108705909;
        f238988r = initAutoDBInfo(dm.o8.class);
        f238989s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "reqkey";
        e0Var.f316955d.put("reqkey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "reqkey";
        e0Var.f316954c[1] = "ack_key";
        e0Var.f316955d.put("ack_key", "TEXT");
        e0Var.f316954c[2] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[3] = "receive_time";
        e0Var.f316955d.put("receive_time", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " reqkey TEXT PRIMARY KEY ,  ack_key TEXT,  status INTEGER,  receive_time LONG";
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
            if (f238983m == hashCode) {
                try {
                    this.field_reqkey = cursor.getString(i17);
                    this.f238990d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238984n == hashCode) {
                try {
                    this.field_ack_key = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238985o == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238986p == hashCode) {
                try {
                    this.field_receive_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOfflineOrderStatus", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238987q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238990d) {
            contentValues.put("reqkey", this.field_reqkey);
        }
        if (this.f238991e) {
            contentValues.put("ack_key", this.field_ack_key);
        }
        if (this.f238992f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f238993g) {
            contentValues.put("receive_time", java.lang.Long.valueOf(this.field_receive_time));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OfflineOrderStatus ( ");
        l75.e0 e0Var = f238988r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238982i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTableSql %s", str2);
            k0Var.A("OfflineOrderStatus", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OfflineOrderStatus", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "updateTableSql %s", str3);
            k0Var.A("OfflineOrderStatus", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238988r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238989s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_reqkey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238981h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238981h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reqkey")) {
            this.field_reqkey = contentValues.getAsString("reqkey");
            if (z17) {
                this.f238990d = true;
            }
        }
        if (contentValues.containsKey("ack_key")) {
            this.field_ack_key = contentValues.getAsString("ack_key");
            if (z17) {
                this.f238991e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f238992f = true;
            }
        }
        if (contentValues.containsKey("receive_time")) {
            this.field_receive_time = contentValues.getAsLong("receive_time").longValue();
            if (z17) {
                this.f238993g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
