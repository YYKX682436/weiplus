package dm;

/* loaded from: classes8.dex */
public class l6 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f238262p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f238263q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238264r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238265s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238266t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238267u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238268v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238269w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238270x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238271y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238272z;
    public java.lang.String field_aeskey;
    public int field_cdnType;
    public java.lang.String field_fileThumbUrl;
    public java.lang.String field_fileUrl;
    public java.lang.String field_fileid;
    public java.lang.String field_md5;
    public long field_msgid;
    public int field_size;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238273d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238274e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238275f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238276g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238277h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238278i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238279m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238280n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238281o = true;

    static {
        p75.n0 n0Var = new p75.n0("HardIotCdnInfo");
        f238262p = n0Var;
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
        f238263q = new java.lang.String[0];
        f238264r = 104192092;
        f238265s = -1274506345;
        f238266t = -1421131984;
        f238267u = 107902;
        f238268v = 3530753;
        f238269w = -881080743;
        f238270x = 635675911;
        f238271y = -855009709;
        f238272z = 298869077;
        A = 108705909;
        B = initAutoDBInfo(dm.l6.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "msgid";
        e0Var.f316955d.put("msgid", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgid";
        e0Var.f316954c[1] = "fileid";
        e0Var.f316955d.put("fileid", "TEXT");
        e0Var.f316954c[2] = "aeskey";
        e0Var.f316955d.put("aeskey", "TEXT");
        e0Var.f316954c[3] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[4] = "size";
        e0Var.f316955d.put("size", "INTEGER");
        e0Var.f316954c[5] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[6] = "cdnType";
        e0Var.f316955d.put("cdnType", "INTEGER");
        e0Var.f316954c[7] = "fileUrl";
        e0Var.f316955d.put("fileUrl", "TEXT");
        e0Var.f316954c[8] = "fileThumbUrl";
        e0Var.f316955d.put("fileThumbUrl", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " msgid LONG PRIMARY KEY ,  fileid TEXT,  aeskey TEXT,  md5 TEXT,  size INTEGER,  talker TEXT,  cdnType INTEGER,  fileUrl TEXT,  fileThumbUrl TEXT";
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
            if (f238264r == hashCode) {
                try {
                    this.field_msgid = cursor.getLong(i17);
                    this.f238273d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238265s == hashCode) {
                try {
                    this.field_fileid = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238266t == hashCode) {
                try {
                    this.field_aeskey = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238267u == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238268v == hashCode) {
                try {
                    this.field_size = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238269w == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238270x == hashCode) {
                try {
                    this.field_cdnType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238271y == hashCode) {
                try {
                    this.field_fileUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238272z == hashCode) {
                try {
                    this.field_fileThumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f238273d) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.field_msgid));
        }
        if (this.f238274e) {
            contentValues.put("fileid", this.field_fileid);
        }
        if (this.f238275f) {
            contentValues.put("aeskey", this.field_aeskey);
        }
        if (this.f238276g) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f238277h) {
            contentValues.put("size", java.lang.Integer.valueOf(this.field_size));
        }
        if (this.f238278i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f238279m) {
            contentValues.put("cdnType", java.lang.Integer.valueOf(this.field_cdnType));
        }
        if (this.f238280n) {
            contentValues.put("fileUrl", this.field_fileUrl);
        }
        if (this.f238281o) {
            contentValues.put("fileThumbUrl", this.field_fileThumbUrl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardIotCdnInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238263q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTableSql %s", str2);
            k0Var.A("HardIotCdnInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardIotCdnInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "updateTableSql %s", str3);
            k0Var.A("HardIotCdnInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.field_msgid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238262p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238262p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f238273d = true;
            }
        }
        if (contentValues.containsKey("fileid")) {
            this.field_fileid = contentValues.getAsString("fileid");
            if (z17) {
                this.f238274e = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.field_aeskey = contentValues.getAsString("aeskey");
            if (z17) {
                this.f238275f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f238276g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f238277h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238278i = true;
            }
        }
        if (contentValues.containsKey("cdnType")) {
            this.field_cdnType = contentValues.getAsInteger("cdnType").intValue();
            if (z17) {
                this.f238279m = true;
            }
        }
        if (contentValues.containsKey("fileUrl")) {
            this.field_fileUrl = contentValues.getAsString("fileUrl");
            if (z17) {
                this.f238280n = true;
            }
        }
        if (contentValues.containsKey("fileThumbUrl")) {
            this.field_fileThumbUrl = contentValues.getAsString("fileThumbUrl");
            if (z17) {
                this.f238281o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
