package dm;

/* loaded from: classes4.dex */
public class fd extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236972h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236973i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236974m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236975n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236976o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236977p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236978q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236979r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236980s;
    public java.lang.String field_appId;
    public java.lang.String field_exptInfo;
    public long field_issueTimestampMs;
    public int field_source;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236981d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236982e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236983f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236984g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaWeDataExptInfo");
        f236972h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236973i = new java.lang.String[0];
        f236974m = 93028124;
        f236975n = 487289539;
        f236976o = -1922646203;
        f236977p = -896505829;
        f236978q = 108705909;
        f236979r = initAutoDBInfo(dm.fd.class);
        f236980s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "issueTimestampMs";
        e0Var.f316955d.put("issueTimestampMs", "LONG");
        e0Var.f316954c[2] = "exptInfo";
        e0Var.f316955d.put("exptInfo", "TEXT");
        e0Var.f316954c[3] = ya.b.SOURCE;
        e0Var.f316955d.put(ya.b.SOURCE, "INTEGER default '0' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  issueTimestampMs LONG,  exptInfo TEXT,  source INTEGER default '0' ";
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
            if (f236974m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f236981d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236975n == hashCode) {
                try {
                    this.field_issueTimestampMs = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236976o == hashCode) {
                try {
                    this.field_exptInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236977p == hashCode) {
                try {
                    this.field_source = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236978q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236981d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236982e) {
            contentValues.put("issueTimestampMs", java.lang.Long.valueOf(this.field_issueTimestampMs));
        }
        if (this.f236983f) {
            contentValues.put("exptInfo", this.field_exptInfo);
        }
        if (this.f236984g) {
            contentValues.put(ya.b.SOURCE, java.lang.Integer.valueOf(this.field_source));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaWeDataExptInfo ( ");
        l75.e0 e0Var = f236979r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236973i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTableSql %s", str2);
            k0Var.A("WxaWeDataExptInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaWeDataExptInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "updateTableSql %s", str3);
            k0Var.A("WxaWeDataExptInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236979r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236980s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236972h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236972h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236981d = true;
            }
        }
        if (contentValues.containsKey("issueTimestampMs")) {
            this.field_issueTimestampMs = contentValues.getAsLong("issueTimestampMs").longValue();
            if (z17) {
                this.f236982e = true;
            }
        }
        if (contentValues.containsKey("exptInfo")) {
            this.field_exptInfo = contentValues.getAsString("exptInfo");
            if (z17) {
                this.f236983f = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(ya.b.SOURCE).intValue();
            if (z17) {
                this.f236984g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
