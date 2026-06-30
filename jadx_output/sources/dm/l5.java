package dm;

/* loaded from: classes7.dex */
public class l5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f238243n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f238244o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238245p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238246q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238247r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238248s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238249t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238250u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238251v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238252w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f238253x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f238254y;
    public java.lang.String field_appId;
    public java.lang.String field_description;
    public long field_msgId;
    public java.lang.String field_source;
    public java.lang.String field_title;
    public int field_type;
    public java.lang.String field_xml;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238255d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238256e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238257f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238258g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238259h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238260i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238261m = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeAppMessage");
        f238243n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238244o = new java.lang.String[0];
        f238245p = 104191100;
        f238246q = 118807;
        f238247r = 93028124;
        f238248s = 110371416;
        f238249t = -1724546052;
        f238250u = -896505829;
        f238251v = 3575610;
        f238252w = 108705909;
        f238253x = initAutoDBInfo(dm.l5.class);
        f238254y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
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
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " msgId LONG default '0'  PRIMARY KEY ,  xml TEXT,  appId TEXT,  title TEXT,  description TEXT,  source TEXT,  type INTEGER";
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
            if (f238245p == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f238255d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238246q == hashCode) {
                try {
                    this.field_xml = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238247r == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238248s == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238249t == hashCode) {
                try {
                    this.field_description = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238250u == hashCode) {
                try {
                    this.field_source = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238251v == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238252w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238255d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f238256e) {
            contentValues.put("xml", this.field_xml);
        }
        if (this.f238257f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238258g) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f238259h) {
            contentValues.put("description", this.field_description);
        }
        if (this.f238260i) {
            contentValues.put(ya.b.SOURCE, this.field_source);
        }
        if (this.f238261m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeAppMessage ( ");
        l75.e0 e0Var = f238253x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238244o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTableSql %s", str2);
            k0Var.A("GameLifeAppMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameLifeAppMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "updateTableSql %s", str3);
            k0Var.A("GameLifeAppMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238253x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238254y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238243n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238243n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f238255d = true;
            }
        }
        if (contentValues.containsKey("xml")) {
            this.field_xml = contentValues.getAsString("xml");
            if (z17) {
                this.f238256e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238257f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f238258g = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z17) {
                this.f238259h = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsString(ya.b.SOURCE);
            if (z17) {
                this.f238260i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238261m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
