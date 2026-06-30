package dm;

/* loaded from: classes7.dex */
public class jb extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f237890p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f237891q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237892r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237893s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237894t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237895u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237896v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237897w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237898x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237899y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237900z;
    public java.lang.String field_appId;
    public int field_busiType;
    public long field_createTime;
    public java.lang.String field_dataJson;
    public long field_expireTime;
    public java.lang.String field_msgId;
    public int field_msgType;
    public int field_opType;
    public long field_receiveTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237901d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237902e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237903f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237904g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237905h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237906i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237907m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237908n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237909o = true;

    static {
        p75.n0 n0Var = new p75.n0("TipsMsgInfo");
        f237890p = n0Var;
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
        f237891q = new java.lang.String[0];
        f237892r = 93028124;
        f237893s = 1369213417;
        f237894t = -2103439280;
        f237895u = -834724724;
        f237896v = -1011074885;
        f237897w = 104191100;
        f237898x = -1147586365;
        f237899y = 1343750747;
        f237900z = 1788767154;
        A = 108705909;
        B = initAutoDBInfo(dm.jb.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[2] = "receiveTime";
        e0Var.f316955d.put("receiveTime", "LONG");
        e0Var.f316954c[3] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG");
        e0Var.f316954c[4] = "opType";
        e0Var.f316955d.put("opType", "INTEGER");
        e0Var.f316954c[5] = "msgId";
        e0Var.f316955d.put("msgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[6] = "busiType";
        e0Var.f316955d.put("busiType", "INTEGER");
        e0Var.f316954c[7] = "msgType";
        e0Var.f316955d.put("msgType", "INTEGER");
        e0Var.f316954c[8] = "dataJson";
        e0Var.f316955d.put("dataJson", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " appId TEXT,  createTime LONG,  receiveTime LONG,  expireTime LONG,  opType INTEGER,  msgId TEXT PRIMARY KEY ,  busiType INTEGER,  msgType INTEGER,  dataJson TEXT";
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
            if (f237892r == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237893s == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237894t == hashCode) {
                try {
                    this.field_receiveTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237895u == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237896v == hashCode) {
                try {
                    this.field_opType = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237897w == hashCode) {
                try {
                    this.field_msgId = cursor.getString(i17);
                    this.f237906i = true;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237898x == hashCode) {
                try {
                    this.field_busiType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237899y == hashCode) {
                try {
                    this.field_msgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237900z == hashCode) {
                try {
                    this.field_dataJson = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTipsMsgInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f237901d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237902e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f237903f) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.field_receiveTime));
        }
        if (this.f237904g) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
        }
        if (this.f237905h) {
            contentValues.put("opType", java.lang.Integer.valueOf(this.field_opType));
        }
        if (this.f237906i) {
            contentValues.put("msgId", this.field_msgId);
        }
        if (this.f237907m) {
            contentValues.put("busiType", java.lang.Integer.valueOf(this.field_busiType));
        }
        if (this.f237908n) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.field_msgType));
        }
        if (this.f237909o) {
            contentValues.put("dataJson", this.field_dataJson);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTipsMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TipsMsgInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237891q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "createTableSql %s", str2);
            k0Var.A("TipsMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TipsMsgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "updateTableSql %s", str3);
            k0Var.A("TipsMsgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_msgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237890p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237890p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237901d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237902e = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.field_receiveTime = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f237903f = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f237904g = true;
            }
        }
        if (contentValues.containsKey("opType")) {
            this.field_opType = contentValues.getAsInteger("opType").intValue();
            if (z17) {
                this.f237905h = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsString("msgId");
            if (z17) {
                this.f237906i = true;
            }
        }
        if (contentValues.containsKey("busiType")) {
            this.field_busiType = contentValues.getAsInteger("busiType").intValue();
            if (z17) {
                this.f237907m = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f237908n = true;
            }
        }
        if (contentValues.containsKey("dataJson")) {
            this.field_dataJson = contentValues.getAsString("dataJson");
            if (z17) {
                this.f237909o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
