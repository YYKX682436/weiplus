package dm;

/* loaded from: classes4.dex */
public class ha extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f237438i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f237439m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237440n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237441o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237442p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237443q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237444r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237445s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f237446t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f237447u;
    public java.lang.String field_card_id;
    public int field_retryCount;
    public long field_seq;
    public int field_state_flag;
    public long field_update_time;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237448d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237449e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237450f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237451g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237452h = true;

    static {
        p75.n0 n0Var = new p75.n0("ShareCardSyncItemInfo");
        f237438i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237439m = new java.lang.String[0];
        f237440n = 553933994;
        f237441o = -227989926;
        f237442p = -573446013;
        f237443q = 113759;
        f237444r = -1163811001;
        f237445s = 108705909;
        f237446t = initAutoDBInfo(dm.ha.class);
        f237447u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "card_id";
        e0Var.f316955d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "card_id";
        e0Var.f316954c[1] = "state_flag";
        e0Var.f316955d.put("state_flag", "INTEGER");
        e0Var.f316954c[2] = "update_time";
        e0Var.f316955d.put("update_time", "LONG");
        e0Var.f316954c[3] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, "LONG");
        e0Var.f316954c[4] = "retryCount";
        e0Var.f316955d.put("retryCount", "INTEGER");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " card_id TEXT PRIMARY KEY ,  state_flag INTEGER,  update_time LONG,  seq LONG,  retryCount INTEGER";
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
            if (f237440n == hashCode) {
                try {
                    this.field_card_id = cursor.getString(i17);
                    this.f237448d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237441o == hashCode) {
                try {
                    this.field_state_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237442p == hashCode) {
                try {
                    this.field_update_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237443q == hashCode) {
                try {
                    this.field_seq = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237444r == hashCode) {
                try {
                    this.field_retryCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardSyncItemInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237445s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237448d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f237449e) {
            contentValues.put("state_flag", java.lang.Integer.valueOf(this.field_state_flag));
        }
        if (this.f237450f) {
            contentValues.put("update_time", java.lang.Long.valueOf(this.field_update_time));
        }
        if (this.f237451g) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, java.lang.Long.valueOf(this.field_seq));
        }
        if (this.f237452h) {
            contentValues.put("retryCount", java.lang.Integer.valueOf(this.field_retryCount));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShareCardSyncItemInfo ( ");
        l75.e0 e0Var = f237446t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237439m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTableSql %s", str2);
            k0Var.A("ShareCardSyncItemInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShareCardSyncItemInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "updateTableSql %s", str3);
            k0Var.A("ShareCardSyncItemInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237446t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237447u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237438i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237438i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z17) {
                this.f237448d = true;
            }
        }
        if (contentValues.containsKey("state_flag")) {
            this.field_state_flag = contentValues.getAsInteger("state_flag").intValue();
            if (z17) {
                this.f237449e = true;
            }
        }
        if (contentValues.containsKey("update_time")) {
            this.field_update_time = contentValues.getAsLong("update_time").longValue();
            if (z17) {
                this.f237450f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ)) {
            this.field_seq = contentValues.getAsLong(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ).longValue();
            if (z17) {
                this.f237451g = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z17) {
                this.f237452h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
