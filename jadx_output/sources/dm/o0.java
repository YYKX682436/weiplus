package dm;

/* loaded from: classes9.dex */
public class o0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f238842p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f238843q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238844r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238845s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238846t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238847u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238848v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238849w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238850x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238851y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238852z;
    public java.lang.String field_appId;
    public java.lang.String field_description;
    public long field_msgId;
    public long field_msgSvrId;
    public java.lang.String field_msgTalker;
    public java.lang.String field_source;
    public java.lang.String field_title;
    public int field_type;
    public java.lang.String field_xml;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238853d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238854e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238855f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238856g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238857h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238858i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238859m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238860n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238861o = true;

    static {
        p75.n0 n0Var = new p75.n0("AppMessage");
        f238842p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238843q = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238844r = new java.lang.String[0];
        f238845s = 104191100;
        f238846t = 118807;
        f238847u = 93028124;
        f238848v = 110371416;
        f238849w = -1724546052;
        f238850x = -896505829;
        f238851y = 3575610;
        f238852z = -1294411543;
        A = -1462962886;
        B = 108705909;
        C = initAutoDBInfo(dm.o0.class);
        D = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "xml";
        e0Var.f316955d.put("xml", "TEXT");
        e0Var.f316954c[2] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[3] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[4] = "description";
        e0Var.f316955d.put("description", "TEXT");
        e0Var.f316954c[5] = ya.b.SOURCE;
        e0Var.f316955d.put(ya.b.SOURCE, "TEXT");
        e0Var.f316954c[6] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[7] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[8] = "msgTalker";
        e0Var.f316955d.put("msgTalker", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " msgId LONG default '0'  PRIMARY KEY ,  xml TEXT,  appId TEXT,  title TEXT,  description TEXT,  source TEXT,  type INTEGER,  msgSvrId LONG,  msgTalker TEXT";
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
            if (f238845s == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f238853d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238846t == hashCode) {
                try {
                    this.field_xml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238847u == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238848v == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238849w == hashCode) {
                try {
                    this.field_description = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238850x == hashCode) {
                try {
                    this.field_source = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238851y == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238852z == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_msgTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238853d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f238854e) {
            contentValues.put("xml", this.field_xml);
        }
        if (this.f238855f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238856g) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f238857h) {
            contentValues.put("description", this.field_description);
        }
        if (this.f238858i) {
            contentValues.put(ya.b.SOURCE, this.field_source);
        }
        if (this.f238859m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238860n) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f238861o) {
            contentValues.put("msgTalker", this.field_msgTalker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppMessage ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238844r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppMessage", "createTableSql %s", str2);
            k0Var.A("AppMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppMessage", "updateTableSql %s", str3);
            k0Var.A("AppMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238842p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238842p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f238853d = true;
            }
        }
        if (contentValues.containsKey("xml")) {
            this.field_xml = contentValues.getAsString("xml");
            if (z17) {
                this.f238854e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238855f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f238856g = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z17) {
                this.f238857h = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsString(ya.b.SOURCE);
            if (z17) {
                this.f238858i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238859m = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f238860n = true;
            }
        }
        if (contentValues.containsKey("msgTalker")) {
            this.field_msgTalker = contentValues.getAsString("msgTalker");
            if (z17) {
                this.f238861o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
