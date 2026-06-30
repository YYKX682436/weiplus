package dm;

/* loaded from: classes12.dex */
public class ka extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f238095q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238096r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238097s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238098t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238099u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238100v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238101w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238102x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238103y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238104z;
    public java.lang.String field_cnValue;
    public int field_eggIndex;
    public java.lang.String field_enValue;
    public java.lang.String field_fileName;
    public int field_flag;
    public java.lang.String field_key;
    public int field_position;
    public java.lang.String field_qqValue;
    public java.lang.String field_thValue;
    public java.lang.String field_twValue;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238105d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238106e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238107f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238108g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238109h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238110i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238111m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238112n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238113o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238114p = true;

    static {
        p75.n0 n0Var = new p75.n0("SmileyInfo");
        f238095q = n0Var;
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
        f238096r = new java.lang.String[0];
        f238097s = 106079;
        f238098t = 900177862;
        f238099u = 526214961;
        f238100v = -934466386;
        f238101w = -1619782072;
        f238102x = -1363903651;
        f238103y = -735721945;
        f238104z = -126620723;
        A = 747804969;
        B = 3145580;
        C = 108705909;
        D = initAutoDBInfo(dm.ka.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "cnValue";
        e0Var.f316955d.put("cnValue", "TEXT");
        e0Var.f316954c[2] = "qqValue";
        e0Var.f316955d.put("qqValue", "TEXT");
        e0Var.f316954c[3] = "twValue";
        e0Var.f316955d.put("twValue", "TEXT");
        e0Var.f316954c[4] = "enValue";
        e0Var.f316955d.put("enValue", "TEXT");
        e0Var.f316954c[5] = "thValue";
        e0Var.f316955d.put("thValue", "TEXT");
        e0Var.f316954c[6] = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "TEXT");
        e0Var.f316954c[7] = "eggIndex";
        e0Var.f316955d.put("eggIndex", "INTEGER default '-1' ");
        e0Var.f316954c[8] = "position";
        e0Var.f316955d.put("position", "INTEGER default '-1' ");
        e0Var.f316954c[9] = "flag";
        e0Var.f316955d.put("flag", "INTEGER");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  cnValue TEXT,  qqValue TEXT,  twValue TEXT,  enValue TEXT,  thValue TEXT,  fileName TEXT,  eggIndex INTEGER default '-1' ,  position INTEGER default '-1' ,  flag INTEGER";
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
            if (f238097s == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f238105d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238098t == hashCode) {
                try {
                    this.field_cnValue = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238099u == hashCode) {
                try {
                    this.field_qqValue = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238100v == hashCode) {
                try {
                    this.field_twValue = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238101w == hashCode) {
                try {
                    this.field_enValue = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238102x == hashCode) {
                try {
                    this.field_thValue = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238103y == hashCode) {
                try {
                    this.field_fileName = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238104z == hashCode) {
                try {
                    this.field_eggIndex = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_position = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238105d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f238106e) {
            contentValues.put("cnValue", this.field_cnValue);
        }
        if (this.f238107f) {
            contentValues.put("qqValue", this.field_qqValue);
        }
        if (this.f238108g) {
            contentValues.put("twValue", this.field_twValue);
        }
        if (this.f238109h) {
            contentValues.put("enValue", this.field_enValue);
        }
        if (this.f238110i) {
            contentValues.put("thValue", this.field_thValue);
        }
        if (this.f238111m) {
            contentValues.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.f238112n) {
            contentValues.put("eggIndex", java.lang.Integer.valueOf(this.field_eggIndex));
        }
        if (this.f238113o) {
            contentValues.put("position", java.lang.Integer.valueOf(this.field_position));
        }
        if (this.f238114p) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.field_flag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSmileyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SmileyInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238096r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyInfo", "createTableSql %s", str2);
            k0Var.A("SmileyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SmileyInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyInfo", "updateTableSql %s", str3);
            k0Var.A("SmileyInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238095q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238095q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f238105d = true;
            }
        }
        if (contentValues.containsKey("cnValue")) {
            this.field_cnValue = contentValues.getAsString("cnValue");
            if (z17) {
                this.f238106e = true;
            }
        }
        if (contentValues.containsKey("qqValue")) {
            this.field_qqValue = contentValues.getAsString("qqValue");
            if (z17) {
                this.f238107f = true;
            }
        }
        if (contentValues.containsKey("twValue")) {
            this.field_twValue = contentValues.getAsString("twValue");
            if (z17) {
                this.f238108g = true;
            }
        }
        if (contentValues.containsKey("enValue")) {
            this.field_enValue = contentValues.getAsString("enValue");
            if (z17) {
                this.f238109h = true;
            }
        }
        if (contentValues.containsKey("thValue")) {
            this.field_thValue = contentValues.getAsString("thValue");
            if (z17) {
                this.f238110i = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
            if (z17) {
                this.f238111m = true;
            }
        }
        if (contentValues.containsKey("eggIndex")) {
            this.field_eggIndex = contentValues.getAsInteger("eggIndex").intValue();
            if (z17) {
                this.f238112n = true;
            }
        }
        if (contentValues.containsKey("position")) {
            this.field_position = contentValues.getAsInteger("position").intValue();
            if (z17) {
                this.f238113o = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f238114p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
