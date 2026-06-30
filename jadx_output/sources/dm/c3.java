package dm;

/* loaded from: classes8.dex */
public class c3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f236046r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f236047s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236048t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236049u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236050v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236051w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236052x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236053y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236054z;
    public long field_bucketSrc;
    public long field_endTime;
    public java.lang.String field_exptCheckSum;
    public java.lang.String field_exptContent;
    public int field_exptId;
    public int field_exptSeq;
    public int field_exptType;
    public int field_groupId;
    public java.lang.String field_paramHashVal;
    public long field_startTime;
    public int field_subType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236055d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236056e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236057f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236058g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236059h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236060i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236061m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236062n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236063o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236064p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236065q = true;

    static {
        p75.n0 n0Var = new p75.n0("ExptItem");
        f236046r = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236047s = new java.lang.String[0];
        f236048t = -1289150094;
        f236049u = 293428218;
        f236050v = -1308937496;
        f236051w = -862962046;
        f236052x = -2129294769;
        f236053y = -1607243192;
        f236054z = -1922307631;
        A = -1868521062;
        B = 1122179898;
        C = 1837153178;
        D = -2035383834;
        E = 108705909;
        F = initAutoDBInfo(dm.c3.class);
        G = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = "exptId";
        e0Var.f316955d.put("exptId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "exptId";
        e0Var.f316954c[1] = "groupId";
        e0Var.f316955d.put("groupId", "INTEGER");
        e0Var.f316954c[2] = "exptSeq";
        e0Var.f316955d.put("exptSeq", "INTEGER");
        e0Var.f316954c[3] = "exptContent";
        e0Var.f316955d.put("exptContent", "TEXT");
        e0Var.f316954c[4] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[5] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[6] = "exptType";
        e0Var.f316955d.put("exptType", "INTEGER");
        e0Var.f316954c[7] = "subType";
        e0Var.f316955d.put("subType", "INTEGER");
        e0Var.f316954c[8] = "exptCheckSum";
        e0Var.f316955d.put("exptCheckSum", "TEXT");
        e0Var.f316954c[9] = "bucketSrc";
        e0Var.f316955d.put("bucketSrc", "LONG");
        e0Var.f316954c[10] = "paramHashVal";
        e0Var.f316955d.put("paramHashVal", "TEXT");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " exptId INTEGER PRIMARY KEY ,  groupId INTEGER,  exptSeq INTEGER,  exptContent TEXT,  startTime LONG,  endTime LONG,  exptType INTEGER,  subType INTEGER,  exptCheckSum TEXT,  bucketSrc LONG,  paramHashVal TEXT";
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
            if (f236048t == hashCode) {
                try {
                    this.field_exptId = cursor.getInt(i17);
                    this.f236055d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236049u == hashCode) {
                try {
                    this.field_groupId = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236050v == hashCode) {
                try {
                    this.field_exptSeq = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236051w == hashCode) {
                try {
                    this.field_exptContent = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236052x == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236053y == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236054z == hashCode) {
                try {
                    this.field_exptType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_exptCheckSum = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_bucketSrc = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_paramHashVal = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236055d) {
            contentValues.put("exptId", java.lang.Integer.valueOf(this.field_exptId));
        }
        if (this.f236056e) {
            contentValues.put("groupId", java.lang.Integer.valueOf(this.field_groupId));
        }
        if (this.f236057f) {
            contentValues.put("exptSeq", java.lang.Integer.valueOf(this.field_exptSeq));
        }
        if (this.f236058g) {
            contentValues.put("exptContent", this.field_exptContent);
        }
        if (this.f236059h) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f236060i) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
        }
        if (this.f236061m) {
            contentValues.put("exptType", java.lang.Integer.valueOf(this.field_exptType));
        }
        if (this.f236062n) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.f236063o) {
            contentValues.put("exptCheckSum", this.field_exptCheckSum);
        }
        if (this.f236064p) {
            contentValues.put("bucketSrc", java.lang.Long.valueOf(this.field_bucketSrc));
        }
        if (this.f236065q) {
            contentValues.put("paramHashVal", this.field_paramHashVal);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseExptItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ExptItem ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236047s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptItem", "createTableSql %s", str2);
            k0Var.A("ExptItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ExptItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptItem", "updateTableSql %s", str3);
            k0Var.A("ExptItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseExptItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return G;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_exptId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236046r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236046r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("exptId")) {
            this.field_exptId = contentValues.getAsInteger("exptId").intValue();
            if (z17) {
                this.f236055d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsInteger("groupId").intValue();
            if (z17) {
                this.f236056e = true;
            }
        }
        if (contentValues.containsKey("exptSeq")) {
            this.field_exptSeq = contentValues.getAsInteger("exptSeq").intValue();
            if (z17) {
                this.f236057f = true;
            }
        }
        if (contentValues.containsKey("exptContent")) {
            this.field_exptContent = contentValues.getAsString("exptContent");
            if (z17) {
                this.f236058g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f236059h = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f236060i = true;
            }
        }
        if (contentValues.containsKey("exptType")) {
            this.field_exptType = contentValues.getAsInteger("exptType").intValue();
            if (z17) {
                this.f236061m = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f236062n = true;
            }
        }
        if (contentValues.containsKey("exptCheckSum")) {
            this.field_exptCheckSum = contentValues.getAsString("exptCheckSum");
            if (z17) {
                this.f236063o = true;
            }
        }
        if (contentValues.containsKey("bucketSrc")) {
            this.field_bucketSrc = contentValues.getAsLong("bucketSrc").longValue();
            if (z17) {
                this.f236064p = true;
            }
        }
        if (contentValues.containsKey("paramHashVal")) {
            this.field_paramHashVal = contentValues.getAsString("paramHashVal");
            if (z17) {
                this.f236065q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
