package dm;

/* loaded from: classes11.dex */
public class g2 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f237027n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f237028o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f237029p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f237030q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f237031r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f237032s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f237033t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237034u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237035v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237036w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237037x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237038y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237039z;
    public long field_createTime;
    public boolean field_isTemporary;
    public int field_labelID;
    public java.lang.String field_labelName;
    public java.lang.String field_labelPYFull;
    public java.lang.String field_labelPYShort;
    public long field_lastUseTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237040d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237041e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237042f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237043g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237044h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237045i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237046m = true;

    static {
        p75.n0 n0Var = new p75.n0("ContactLabel");
        f237027n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237028o = new p75.d("labelID", "int", tableName, "");
        f237029p = new p75.d("labelName", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237030q = new p75.d("createTime", "long", tableName, "");
        f237031r = new p75.d("isTemporary", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, tableName, "");
        f237032s = new p75.d("lastUseTime", "long", tableName, "");
        f237033t = new java.lang.String[0];
        f237034u = -63202545;
        f237035v = -607923297;
        f237036w = -50009044;
        f237037x = -1538658689;
        f237038y = 1369213417;
        f237039z = -1131560889;
        A = 1736147326;
        B = 108705909;
        C = initAutoDBInfo(dm.g2.class);
        D = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "labelID";
        e0Var.f316955d.put("labelID", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "labelID";
        e0Var.f316954c[1] = "labelName";
        e0Var.f316955d.put("labelName", "TEXT");
        e0Var.f316954c[2] = "labelPYFull";
        e0Var.f316955d.put("labelPYFull", "TEXT");
        e0Var.f316954c[3] = "labelPYShort";
        e0Var.f316955d.put("labelPYShort", "TEXT");
        e0Var.f316954c[4] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[5] = "isTemporary";
        e0Var.f316955d.put("isTemporary", "INTEGER");
        e0Var.f316954c[6] = "lastUseTime";
        e0Var.f316955d.put("lastUseTime", "LONG");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " labelID INTEGER PRIMARY KEY ,  labelName TEXT,  labelPYFull TEXT,  labelPYShort TEXT,  createTime LONG,  isTemporary INTEGER,  lastUseTime LONG";
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
            boolean z17 = true;
            if (f237034u == hashCode) {
                try {
                    this.field_labelID = cursor.getInt(i17);
                    this.f237040d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237035v == hashCode) {
                try {
                    this.field_labelName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237036w == hashCode) {
                try {
                    this.field_labelPYFull = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237037x == hashCode) {
                try {
                    this.field_labelPYShort = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237038y == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237039z == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isTemporary = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_lastUseTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabel", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237040d) {
            contentValues.put("labelID", java.lang.Integer.valueOf(this.field_labelID));
        }
        if (this.f237041e) {
            contentValues.put("labelName", this.field_labelName);
        }
        if (this.f237042f) {
            contentValues.put("labelPYFull", this.field_labelPYFull);
        }
        if (this.f237043g) {
            contentValues.put("labelPYShort", this.field_labelPYShort);
        }
        if (this.f237044h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f237045i) {
            if (this.field_isTemporary) {
                contentValues.put("isTemporary", (java.lang.Integer) 1);
            } else {
                contentValues.put("isTemporary", (java.lang.Integer) 0);
            }
        }
        if (this.f237046m) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.field_lastUseTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseContactLabel", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactLabel ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237033t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabel", "createTableSql %s", str2);
            k0Var.A("ContactLabel", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ContactLabel", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabel", "updateTableSql %s", str3);
            k0Var.A("ContactLabel", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabel", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return C;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return D;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_labelID);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237027n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237027n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("labelID")) {
            this.field_labelID = contentValues.getAsInteger("labelID").intValue();
            if (z17) {
                this.f237040d = true;
            }
        }
        if (contentValues.containsKey("labelName")) {
            this.field_labelName = contentValues.getAsString("labelName");
            if (z17) {
                this.f237041e = true;
            }
        }
        if (contentValues.containsKey("labelPYFull")) {
            this.field_labelPYFull = contentValues.getAsString("labelPYFull");
            if (z17) {
                this.f237042f = true;
            }
        }
        if (contentValues.containsKey("labelPYShort")) {
            this.field_labelPYShort = contentValues.getAsString("labelPYShort");
            if (z17) {
                this.f237043g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237044h = true;
            }
        }
        if (contentValues.containsKey("isTemporary")) {
            this.field_isTemporary = contentValues.getAsInteger("isTemporary").intValue() != 0;
            if (z17) {
                this.f237045i = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f237046m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
