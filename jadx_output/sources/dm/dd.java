package dm;

/* loaded from: classes4.dex */
public class dd extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f236468o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f236469p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236470q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236471r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236472s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236473t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236474u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236475v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236476w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236477x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236478y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f236479z;
    public int field_btnState;
    public java.lang.String field_content;
    public java.lang.String field_contentColor;
    public int field_msgState;
    public int field_msgType;
    public int field_shareKeyHash;
    public int field_updatePeroid;
    public java.lang.String field_weAppSourceUserName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236480d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236481e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236482f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236483g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236484h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236485i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236486m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236487n = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaUpdateableMsg");
        f236468o = n0Var;
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
        f236469p = new java.lang.String[0];
        f236470q = -1234040018;
        f236471r = 2097344405;
        f236472s = -1294486128;
        f236473t = 951530617;
        f236474u = 805826154;
        f236475v = -1039977034;
        f236476w = 1343750747;
        f236477x = 97443204;
        f236478y = 108705909;
        f236479z = initAutoDBInfo(dm.dd.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "shareKeyHash";
        e0Var.f316955d.put("shareKeyHash", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "shareKeyHash";
        e0Var.f316954c[1] = "btnState";
        e0Var.f316955d.put("btnState", "INTEGER");
        e0Var.f316954c[2] = "msgState";
        e0Var.f316955d.put("msgState", "INTEGER");
        e0Var.f316954c[3] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[4] = "contentColor";
        e0Var.f316955d.put("contentColor", "TEXT");
        e0Var.f316954c[5] = "updatePeroid";
        e0Var.f316955d.put("updatePeroid", "INTEGER");
        e0Var.f316954c[6] = "msgType";
        e0Var.f316955d.put("msgType", "INTEGER");
        e0Var.f316954c[7] = "weAppSourceUserName";
        e0Var.f316955d.put("weAppSourceUserName", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " shareKeyHash INTEGER PRIMARY KEY ,  btnState INTEGER,  msgState INTEGER,  content TEXT,  contentColor TEXT,  updatePeroid INTEGER,  msgType INTEGER,  weAppSourceUserName TEXT";
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
            if (f236470q == hashCode) {
                try {
                    this.field_shareKeyHash = cursor.getInt(i17);
                    this.f236480d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236471r == hashCode) {
                try {
                    this.field_btnState = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236472s == hashCode) {
                try {
                    this.field_msgState = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236473t == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236474u == hashCode) {
                try {
                    this.field_contentColor = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236475v == hashCode) {
                try {
                    this.field_updatePeroid = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236476w == hashCode) {
                try {
                    this.field_msgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236477x == hashCode) {
                try {
                    this.field_weAppSourceUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236478y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236480d) {
            contentValues.put("shareKeyHash", java.lang.Integer.valueOf(this.field_shareKeyHash));
        }
        if (this.f236481e) {
            contentValues.put("btnState", java.lang.Integer.valueOf(this.field_btnState));
        }
        if (this.f236482f) {
            contentValues.put("msgState", java.lang.Integer.valueOf(this.field_msgState));
        }
        if (this.f236483g) {
            contentValues.put("content", this.field_content);
        }
        if (this.f236484h) {
            contentValues.put("contentColor", this.field_contentColor);
        }
        if (this.f236485i) {
            contentValues.put("updatePeroid", java.lang.Integer.valueOf(this.field_updatePeroid));
        }
        if (this.f236486m) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.field_msgType));
        }
        if (this.f236487n) {
            contentValues.put("weAppSourceUserName", this.field_weAppSourceUserName);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaUpdateableMsg ( ");
        l75.e0 e0Var = f236479z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236469p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTableSql %s", str2);
            k0Var.A("WxaUpdateableMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaUpdateableMsg", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "updateTableSql %s", str3);
            k0Var.A("WxaUpdateableMsg", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236479z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_shareKeyHash);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236468o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236468o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("shareKeyHash")) {
            this.field_shareKeyHash = contentValues.getAsInteger("shareKeyHash").intValue();
            if (z17) {
                this.f236480d = true;
            }
        }
        if (contentValues.containsKey("btnState")) {
            this.field_btnState = contentValues.getAsInteger("btnState").intValue();
            if (z17) {
                this.f236481e = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.field_msgState = contentValues.getAsInteger("msgState").intValue();
            if (z17) {
                this.f236482f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f236483g = true;
            }
        }
        if (contentValues.containsKey("contentColor")) {
            this.field_contentColor = contentValues.getAsString("contentColor");
            if (z17) {
                this.f236484h = true;
            }
        }
        if (contentValues.containsKey("updatePeroid")) {
            this.field_updatePeroid = contentValues.getAsInteger("updatePeroid").intValue();
            if (z17) {
                this.f236485i = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f236486m = true;
            }
        }
        if (contentValues.containsKey("weAppSourceUserName")) {
            this.field_weAppSourceUserName = contentValues.getAsString("weAppSourceUserName");
            if (z17) {
                this.f236487n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
