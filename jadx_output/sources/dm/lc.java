package dm;

/* loaded from: classes4.dex */
public class lc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f238345m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f238346n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238347o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238348p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238349q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238350r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238351s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238352t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238353u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f238354v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f238355w;
    public java.lang.String field_imgUrl;
    public java.lang.String field_link;
    public java.lang.String field_recordId;
    public java.lang.String field_source;
    public long field_timeStamp;
    public java.lang.String field_title;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238356d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238357e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238358f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238359g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238360h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238361i = true;

    static {
        p75.n0 n0Var = new p75.n0("WebViewHistory");
        f238345m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238346n = new java.lang.String[0];
        f238347o = -799234740;
        f238348p = 3321850;
        f238349q = 110371416;
        f238350r = -896505829;
        f238351s = -1185088852;
        f238352t = 25573622;
        f238353u = 108705909;
        f238354v = initAutoDBInfo(dm.lc.class);
        f238355w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "recordId";
        e0Var.f316955d.put("recordId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "recordId";
        e0Var.f316954c[1] = "link";
        e0Var.f316955d.put("link", "TEXT");
        e0Var.f316954c[2] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[3] = ya.b.SOURCE;
        e0Var.f316955d.put(ya.b.SOURCE, "TEXT");
        e0Var.f316954c[4] = "imgUrl";
        e0Var.f316955d.put("imgUrl", "TEXT");
        e0Var.f316954c[5] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " recordId TEXT PRIMARY KEY ,  link TEXT,  title TEXT,  source TEXT,  imgUrl TEXT,  timeStamp LONG";
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
            if (f238347o == hashCode) {
                try {
                    this.field_recordId = cursor.getString(i17);
                    this.f238356d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238348p == hashCode) {
                try {
                    this.field_link = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238349q == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238350r == hashCode) {
                try {
                    this.field_source = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238351s == hashCode) {
                try {
                    this.field_imgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238352t == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238353u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238356d) {
            contentValues.put("recordId", this.field_recordId);
        }
        if (this.f238357e) {
            contentValues.put("link", this.field_link);
        }
        if (this.f238358f) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f238359g) {
            contentValues.put(ya.b.SOURCE, this.field_source);
        }
        if (this.f238360h) {
            contentValues.put("imgUrl", this.field_imgUrl);
        }
        if (this.f238361i) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWebViewHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebViewHistory ( ");
        l75.e0 e0Var = f238354v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238346n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHistory", "createTableSql %s", str2);
            k0Var.A("WebViewHistory", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WebViewHistory", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHistory", "updateTableSql %s", str3);
            k0Var.A("WebViewHistory", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHistory", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238354v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238355w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_recordId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238345m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238345m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsString("recordId");
            if (z17) {
                this.f238356d = true;
            }
        }
        if (contentValues.containsKey("link")) {
            this.field_link = contentValues.getAsString("link");
            if (z17) {
                this.f238357e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f238358f = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsString(ya.b.SOURCE);
            if (z17) {
                this.f238359g = true;
            }
        }
        if (contentValues.containsKey("imgUrl")) {
            this.field_imgUrl = contentValues.getAsString("imgUrl");
            if (z17) {
                this.f238360h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f238361i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
