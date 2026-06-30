package dm;

/* loaded from: classes4.dex */
public class kc extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f238129o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f238130p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238131q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238132r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238133s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238134t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238135u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238136v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238137w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238138x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238139y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f238140z;
    public java.lang.String field_appId;
    public java.lang.String field_appIdKey;
    public long field_expireTime;
    public java.lang.String field_localFile;
    public long field_size;
    public long field_timeStamp;
    public java.lang.String field_value;
    public java.lang.String field_weight;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238141d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238142e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238143f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238144g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238145h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238146i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238147m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238148n = true;

    static {
        p75.n0 n0Var = new p75.n0("WebViewData");
        f238129o = n0Var;
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
        f238130p = new java.lang.String[0];
        f238131q = 93028124;
        f238132r = 1147011491;
        f238133s = 111972721;
        f238134t = -791592328;
        f238135u = -834724724;
        f238136v = 25573622;
        f238137w = 3530753;
        f238138x = -1205625977;
        f238139y = 108705909;
        f238140z = initAutoDBInfo(dm.kc.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "appIdKey";
        e0Var.f316955d.put("appIdKey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appIdKey";
        e0Var.f316954c[2] = "value";
        e0Var.f316955d.put("value", "TEXT");
        e0Var.f316954c[3] = "weight";
        e0Var.f316955d.put("weight", "TEXT");
        e0Var.f316954c[4] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG");
        e0Var.f316954c[5] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG");
        e0Var.f316954c[6] = "size";
        e0Var.f316955d.put("size", "LONG");
        e0Var.f316954c[7] = "localFile";
        e0Var.f316955d.put("localFile", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " appId TEXT,  appIdKey TEXT PRIMARY KEY ,  value TEXT,  weight TEXT,  expireTime LONG,  timeStamp LONG,  size LONG,  localFile TEXT";
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
            if (f238131q == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238132r == hashCode) {
                try {
                    this.field_appIdKey = cursor.getString(i17);
                    this.f238142e = true;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238133s == hashCode) {
                try {
                    this.field_value = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238134t == hashCode) {
                try {
                    this.field_weight = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238135u == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238136v == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238137w == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238138x == hashCode) {
                try {
                    this.field_localFile = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewData", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238139y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238141d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238142e) {
            contentValues.put("appIdKey", this.field_appIdKey);
        }
        if (this.f238143f) {
            contentValues.put("value", this.field_value);
        }
        if (this.f238144g) {
            contentValues.put("weight", this.field_weight);
        }
        if (this.f238145h) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
        }
        if (this.f238146i) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
        }
        if (this.f238147m) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f238148n) {
            contentValues.put("localFile", this.field_localFile);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWebViewData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebViewData ( ");
        l75.e0 e0Var = f238140z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238130p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewData", "createTableSql %s", str2);
            k0Var.A("WebViewData", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WebViewData", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewData", "updateTableSql %s", str3);
            k0Var.A("WebViewData", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238140z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appIdKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238129o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238129o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238141d = true;
            }
        }
        if (contentValues.containsKey("appIdKey")) {
            this.field_appIdKey = contentValues.getAsString("appIdKey");
            if (z17) {
                this.f238142e = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z17) {
                this.f238143f = true;
            }
        }
        if (contentValues.containsKey("weight")) {
            this.field_weight = contentValues.getAsString("weight");
            if (z17) {
                this.f238144g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f238145h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f238146i = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f238147m = true;
            }
        }
        if (contentValues.containsKey("localFile")) {
            this.field_localFile = contentValues.getAsString("localFile");
            if (z17) {
                this.f238148n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
