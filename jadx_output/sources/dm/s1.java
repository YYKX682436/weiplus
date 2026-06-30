package dm;

/* loaded from: classes4.dex */
public class s1 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239769n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239770o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239771p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239772q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239773r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239774s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239775t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239776u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239777v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239778w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239779x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239780y;
    public java.lang.String field_card_id;
    public int field_expire_time_interval;
    public long field_fetch_time;
    public int field_lower_bound;
    public boolean field_need_insert_show_timestamp;
    public int field_show_expire_interval;
    public java.lang.String field_show_timestamp_encrypt_key;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239781d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239782e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239783f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239784g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239785h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239786i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239787m = true;

    static {
        p75.n0 n0Var = new p75.n0("CardQrCodeConfi");
        f239769n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239770o = new java.lang.String[0];
        f239771p = 553933994;
        f239772q = -634010944;
        f239773r = -162366031;
        f239774s = -22811622;
        f239775t = -1056667945;
        f239776u = -1255079261;
        f239777v = 305998130;
        f239778w = 108705909;
        f239779x = initAutoDBInfo(dm.s1.class);
        f239780y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "card_id";
        e0Var.f316955d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "card_id";
        e0Var.f316954c[1] = "lower_bound";
        e0Var.f316955d.put("lower_bound", "INTEGER");
        e0Var.f316954c[2] = "need_insert_show_timestamp";
        e0Var.f316955d.put("need_insert_show_timestamp", "INTEGER default 'false' ");
        e0Var.f316954c[3] = "show_timestamp_encrypt_key";
        e0Var.f316955d.put("show_timestamp_encrypt_key", "TEXT");
        e0Var.f316954c[4] = "expire_time_interval";
        e0Var.f316955d.put("expire_time_interval", "INTEGER");
        e0Var.f316954c[5] = "show_expire_interval";
        e0Var.f316955d.put("show_expire_interval", "INTEGER");
        e0Var.f316954c[6] = "fetch_time";
        e0Var.f316955d.put("fetch_time", "LONG");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " card_id TEXT PRIMARY KEY ,  lower_bound INTEGER,  need_insert_show_timestamp INTEGER default 'false' ,  show_timestamp_encrypt_key TEXT,  expire_time_interval INTEGER,  show_expire_interval INTEGER,  fetch_time LONG";
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
            if (f239771p == hashCode) {
                try {
                    this.field_card_id = cursor.getString(i17);
                    this.f239781d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239772q == hashCode) {
                try {
                    this.field_lower_bound = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239773r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_need_insert_show_timestamp = z17;
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239774s == hashCode) {
                try {
                    this.field_show_timestamp_encrypt_key = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239775t == hashCode) {
                try {
                    this.field_expire_time_interval = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239776u == hashCode) {
                try {
                    this.field_show_expire_interval = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239777v == hashCode) {
                try {
                    this.field_fetch_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239778w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239781d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f239782e) {
            contentValues.put("lower_bound", java.lang.Integer.valueOf(this.field_lower_bound));
        }
        if (this.f239783f) {
            if (this.field_need_insert_show_timestamp) {
                contentValues.put("need_insert_show_timestamp", (java.lang.Integer) 1);
            } else {
                contentValues.put("need_insert_show_timestamp", (java.lang.Integer) 0);
            }
        }
        if (this.f239784g) {
            contentValues.put("show_timestamp_encrypt_key", this.field_show_timestamp_encrypt_key);
        }
        if (this.f239785h) {
            contentValues.put("expire_time_interval", java.lang.Integer.valueOf(this.field_expire_time_interval));
        }
        if (this.f239786i) {
            contentValues.put("show_expire_interval", java.lang.Integer.valueOf(this.field_show_expire_interval));
        }
        if (this.f239787m) {
            contentValues.put("fetch_time", java.lang.Long.valueOf(this.field_fetch_time));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CardQrCodeConfi ( ");
        l75.e0 e0Var = f239779x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239770o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTableSql %s", str2);
            k0Var.A("CardQrCodeConfi", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CardQrCodeConfi", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "updateTableSql %s", str3);
            k0Var.A("CardQrCodeConfi", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239779x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239780y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239769n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239769n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z17) {
                this.f239781d = true;
            }
        }
        if (contentValues.containsKey("lower_bound")) {
            this.field_lower_bound = contentValues.getAsInteger("lower_bound").intValue();
            if (z17) {
                this.f239782e = true;
            }
        }
        if (contentValues.containsKey("need_insert_show_timestamp")) {
            this.field_need_insert_show_timestamp = contentValues.getAsInteger("need_insert_show_timestamp").intValue() != 0;
            if (z17) {
                this.f239783f = true;
            }
        }
        if (contentValues.containsKey("show_timestamp_encrypt_key")) {
            this.field_show_timestamp_encrypt_key = contentValues.getAsString("show_timestamp_encrypt_key");
            if (z17) {
                this.f239784g = true;
            }
        }
        if (contentValues.containsKey("expire_time_interval")) {
            this.field_expire_time_interval = contentValues.getAsInteger("expire_time_interval").intValue();
            if (z17) {
                this.f239785h = true;
            }
        }
        if (contentValues.containsKey("show_expire_interval")) {
            this.field_show_expire_interval = contentValues.getAsInteger("show_expire_interval").intValue();
            if (z17) {
                this.f239786i = true;
            }
        }
        if (contentValues.containsKey("fetch_time")) {
            this.field_fetch_time = contentValues.getAsLong("fetch_time").longValue();
            if (z17) {
                this.f239787m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
