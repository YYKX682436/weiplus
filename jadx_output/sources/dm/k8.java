package dm;

/* loaded from: classes13.dex */
public class k8 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f238065J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f238066t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f238067u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238068v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238069w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238070x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238071y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238072z;
    public long field_beginShowTime;
    public long field_disappearTime;
    public java.lang.String field_extInfo;
    public boolean field_hadRead;
    public boolean field_isExit;
    public boolean field_isReject;
    public long field_overdueTime;
    public long field_pagestaytime;
    public int field_tipId;
    public int field_tipType;
    public int field_tipVersion;
    public java.lang.String field_tipkey;
    public r45.rm6 field_tipsShowInfo;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238073d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238074e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238075f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238076g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238077h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238078i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238079m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238080n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238081o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238082p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238083q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238084r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238085s = true;

    static {
        p75.n0 n0Var = new p75.n0("NewTipsInfo");
        f238066t = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238067u = new java.lang.String[0];
        f238068v = 110366486;
        f238069w = 1812602813;
        f238070x = -873573404;
        f238071y = -1311637899;
        f238072z = -1180527256;
        A = 683025089;
        B = -260676247;
        C = 376569651;
        D = -1596363504;
        E = 1637261197;
        F = -120656733;
        G = -1306498449;
        H = -540284875;
        I = 108705909;
        f238065J = initAutoDBInfo(dm.k8.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "tipId";
        e0Var.f316955d.put("tipId", "INTEGER default '0'  PRIMARY KEY ");
        e0Var.f316953b = "tipId";
        e0Var.f316954c[1] = "tipVersion";
        e0Var.f316955d.put("tipVersion", "INTEGER");
        e0Var.f316954c[2] = "tipkey";
        e0Var.f316955d.put("tipkey", "TEXT");
        e0Var.f316954c[3] = "tipType";
        e0Var.f316955d.put("tipType", "INTEGER");
        e0Var.f316954c[4] = "isExit";
        e0Var.f316955d.put("isExit", "INTEGER");
        e0Var.f316954c[5] = "hadRead";
        e0Var.f316955d.put("hadRead", "INTEGER");
        e0Var.f316954c[6] = "isReject";
        e0Var.f316955d.put("isReject", "INTEGER");
        e0Var.f316954c[7] = "beginShowTime";
        e0Var.f316955d.put("beginShowTime", "LONG");
        e0Var.f316954c[8] = "disappearTime";
        e0Var.f316955d.put("disappearTime", "LONG");
        e0Var.f316954c[9] = "overdueTime";
        e0Var.f316955d.put("overdueTime", "LONG");
        e0Var.f316954c[10] = "tipsShowInfo";
        e0Var.f316955d.put("tipsShowInfo", "BLOB");
        e0Var.f316954c[11] = "extInfo";
        e0Var.f316955d.put("extInfo", "TEXT");
        e0Var.f316954c[12] = "pagestaytime";
        e0Var.f316955d.put("pagestaytime", "LONG");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " tipId INTEGER default '0'  PRIMARY KEY ,  tipVersion INTEGER,  tipkey TEXT,  tipType INTEGER,  isExit INTEGER,  hadRead INTEGER,  isReject INTEGER,  beginShowTime LONG,  disappearTime LONG,  overdueTime LONG,  tipsShowInfo BLOB,  extInfo TEXT,  pagestaytime LONG";
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
            if (f238068v == hashCode) {
                try {
                    this.field_tipId = cursor.getInt(i17);
                    this.f238073d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238069w == hashCode) {
                try {
                    this.field_tipVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238070x == hashCode) {
                try {
                    this.field_tipkey = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238071y == hashCode) {
                try {
                    this.field_tipType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238072z == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isExit = z17;
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hadRead = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isReject = z17;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_beginShowTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_disappearTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_overdueTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_tipsShowInfo = (r45.rm6) new r45.rm6().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_extInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_pagestaytime = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238073d) {
            contentValues.put("tipId", java.lang.Integer.valueOf(this.field_tipId));
        }
        if (this.f238074e) {
            contentValues.put("tipVersion", java.lang.Integer.valueOf(this.field_tipVersion));
        }
        if (this.f238075f) {
            contentValues.put("tipkey", this.field_tipkey);
        }
        if (this.f238076g) {
            contentValues.put("tipType", java.lang.Integer.valueOf(this.field_tipType));
        }
        if (this.f238077h) {
            if (this.field_isExit) {
                contentValues.put("isExit", (java.lang.Integer) 1);
            } else {
                contentValues.put("isExit", (java.lang.Integer) 0);
            }
        }
        if (this.f238078i) {
            if (this.field_hadRead) {
                contentValues.put("hadRead", (java.lang.Integer) 1);
            } else {
                contentValues.put("hadRead", (java.lang.Integer) 0);
            }
        }
        if (this.f238079m) {
            if (this.field_isReject) {
                contentValues.put("isReject", (java.lang.Integer) 1);
            } else {
                contentValues.put("isReject", (java.lang.Integer) 0);
            }
        }
        if (this.f238080n) {
            contentValues.put("beginShowTime", java.lang.Long.valueOf(this.field_beginShowTime));
        }
        if (this.f238081o) {
            contentValues.put("disappearTime", java.lang.Long.valueOf(this.field_disappearTime));
        }
        if (this.f238082p) {
            contentValues.put("overdueTime", java.lang.Long.valueOf(this.field_overdueTime));
        }
        if (this.f238083q) {
            r45.rm6 rm6Var = this.field_tipsShowInfo;
            if (rm6Var != null) {
                try {
                    contentValues.put("tipsShowInfo", rm6Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo", e17.getMessage());
                }
            } else {
                contentValues.put("tipsShowInfo", (byte[]) null);
            }
        }
        if (this.f238084r) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f238085s) {
            contentValues.put("pagestaytime", java.lang.Long.valueOf(this.field_pagestaytime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NewTipsInfo ( ");
        l75.e0 e0Var = f238065J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238067u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "createTableSql %s", str2);
            k0Var.A("NewTipsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "NewTipsInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "updateTableSql %s", str3);
            k0Var.A("NewTipsInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238065J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_tipId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238066t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238066t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tipId")) {
            this.field_tipId = contentValues.getAsInteger("tipId").intValue();
            if (z17) {
                this.f238073d = true;
            }
        }
        if (contentValues.containsKey("tipVersion")) {
            this.field_tipVersion = contentValues.getAsInteger("tipVersion").intValue();
            if (z17) {
                this.f238074e = true;
            }
        }
        if (contentValues.containsKey("tipkey")) {
            this.field_tipkey = contentValues.getAsString("tipkey");
            if (z17) {
                this.f238075f = true;
            }
        }
        if (contentValues.containsKey("tipType")) {
            this.field_tipType = contentValues.getAsInteger("tipType").intValue();
            if (z17) {
                this.f238076g = true;
            }
        }
        if (contentValues.containsKey("isExit")) {
            this.field_isExit = contentValues.getAsInteger("isExit").intValue() != 0;
            if (z17) {
                this.f238077h = true;
            }
        }
        if (contentValues.containsKey("hadRead")) {
            this.field_hadRead = contentValues.getAsInteger("hadRead").intValue() != 0;
            if (z17) {
                this.f238078i = true;
            }
        }
        if (contentValues.containsKey("isReject")) {
            this.field_isReject = contentValues.getAsInteger("isReject").intValue() != 0;
            if (z17) {
                this.f238079m = true;
            }
        }
        if (contentValues.containsKey("beginShowTime")) {
            this.field_beginShowTime = contentValues.getAsLong("beginShowTime").longValue();
            if (z17) {
                this.f238080n = true;
            }
        }
        if (contentValues.containsKey("disappearTime")) {
            this.field_disappearTime = contentValues.getAsLong("disappearTime").longValue();
            if (z17) {
                this.f238081o = true;
            }
        }
        if (contentValues.containsKey("overdueTime")) {
            this.field_overdueTime = contentValues.getAsLong("overdueTime").longValue();
            if (z17) {
                this.f238082p = true;
            }
        }
        if (contentValues.containsKey("tipsShowInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("tipsShowInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_tipsShowInfo = (r45.rm6) new r45.rm6().parseFrom(asByteArray);
                    if (z17) {
                        this.f238083q = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z17) {
                this.f238084r = true;
            }
        }
        if (contentValues.containsKey("pagestaytime")) {
            this.field_pagestaytime = contentValues.getAsLong("pagestaytime").longValue();
            if (z17) {
                this.f238085s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
