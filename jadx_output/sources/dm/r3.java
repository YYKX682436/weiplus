package dm;

/* loaded from: classes12.dex */
public class r3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f239586s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f239587t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239588u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239589v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239590w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239591x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239592y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239593z;
    public int field_actionType;
    public java.lang.String field_androidUrl;
    public int field_featureId;
    public java.lang.String field_helpUrl;
    public java.lang.String field_iconPath;
    public java.lang.String field_tag;
    public long field_timestamp;
    public java.lang.String field_title;
    public java.lang.String field_titlePY;
    public java.lang.String field_titleShortPY;
    public java.lang.String field_updateUrl;
    public java.lang.String field_url;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239594d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239595e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239596f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239597g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239598h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239599i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239600m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239601n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239602o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239603p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239604q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239605r = true;

    static {
        p75.n0 n0Var = new p75.n0("Feature");
        f239586s = n0Var;
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
        f239587t = new java.lang.String[0];
        f239588u = -420503887;
        f239589v = 110371416;
        f239590w = -1307249055;
        f239591x = -1497890291;
        f239592y = 114586;
        f239593z = 1851881104;
        A = 116079;
        B = 805808750;
        C = -1949207578;
        D = 722979968;
        E = -738054082;
        F = 55126294;
        G = 108705909;
        H = initAutoDBInfo(dm.r3.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "featureId";
        e0Var.f316955d.put("featureId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "featureId";
        e0Var.f316954c[1] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[2] = "titlePY";
        e0Var.f316955d.put("titlePY", "TEXT");
        e0Var.f316954c[3] = "titleShortPY";
        e0Var.f316955d.put("titleShortPY", "TEXT");
        e0Var.f316954c[4] = "tag";
        e0Var.f316955d.put("tag", "TEXT");
        e0Var.f316954c[5] = "actionType";
        e0Var.f316955d.put("actionType", "INTEGER default '0' ");
        e0Var.f316954c[6] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[7] = "helpUrl";
        e0Var.f316955d.put("helpUrl", "TEXT");
        e0Var.f316954c[8] = "updateUrl";
        e0Var.f316955d.put("updateUrl", "TEXT");
        e0Var.f316954c[9] = "androidUrl";
        e0Var.f316955d.put("androidUrl", "TEXT");
        e0Var.f316954c[10] = "iconPath";
        e0Var.f316955d.put("iconPath", "TEXT");
        e0Var.f316954c[11] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " featureId INTEGER PRIMARY KEY ,  title TEXT,  titlePY TEXT,  titleShortPY TEXT,  tag TEXT,  actionType INTEGER default '0' ,  url TEXT,  helpUrl TEXT,  updateUrl TEXT,  androidUrl TEXT,  iconPath TEXT,  timestamp LONG default '0' ";
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
            if (f239588u == hashCode) {
                try {
                    this.field_featureId = cursor.getInt(i17);
                    this.f239594d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239589v == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239590w == hashCode) {
                try {
                    this.field_titlePY = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239591x == hashCode) {
                try {
                    this.field_titleShortPY = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239592y == hashCode) {
                try {
                    this.field_tag = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239593z == hashCode) {
                try {
                    this.field_actionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_helpUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_updateUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_androidUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_iconPath = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239594d) {
            contentValues.put("featureId", java.lang.Integer.valueOf(this.field_featureId));
        }
        if (this.f239595e) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f239596f) {
            contentValues.put("titlePY", this.field_titlePY);
        }
        if (this.f239597g) {
            contentValues.put("titleShortPY", this.field_titleShortPY);
        }
        if (this.f239598h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f239599i) {
            contentValues.put("actionType", java.lang.Integer.valueOf(this.field_actionType));
        }
        if (this.f239600m) {
            contentValues.put("url", this.field_url);
        }
        if (this.f239601n) {
            contentValues.put("helpUrl", this.field_helpUrl);
        }
        if (this.f239602o) {
            contentValues.put("updateUrl", this.field_updateUrl);
        }
        if (this.f239603p) {
            contentValues.put("androidUrl", this.field_androidUrl);
        }
        if (this.f239604q) {
            contentValues.put("iconPath", this.field_iconPath);
        }
        if (this.f239605r) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFeature", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS Feature ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239587t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFeature", "createTableSql %s", str2);
            k0Var.A("Feature", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "Feature", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFeature", "updateTableSql %s", str3);
            k0Var.A("Feature", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFeature", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_featureId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239586s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239586s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("featureId")) {
            this.field_featureId = contentValues.getAsInteger("featureId").intValue();
            if (z17) {
                this.f239594d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f239595e = true;
            }
        }
        if (contentValues.containsKey("titlePY")) {
            this.field_titlePY = contentValues.getAsString("titlePY");
            if (z17) {
                this.f239596f = true;
            }
        }
        if (contentValues.containsKey("titleShortPY")) {
            this.field_titleShortPY = contentValues.getAsString("titleShortPY");
            if (z17) {
                this.f239597g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z17) {
                this.f239598h = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.field_actionType = contentValues.getAsInteger("actionType").intValue();
            if (z17) {
                this.f239599i = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f239600m = true;
            }
        }
        if (contentValues.containsKey("helpUrl")) {
            this.field_helpUrl = contentValues.getAsString("helpUrl");
            if (z17) {
                this.f239601n = true;
            }
        }
        if (contentValues.containsKey("updateUrl")) {
            this.field_updateUrl = contentValues.getAsString("updateUrl");
            if (z17) {
                this.f239602o = true;
            }
        }
        if (contentValues.containsKey("androidUrl")) {
            this.field_androidUrl = contentValues.getAsString("androidUrl");
            if (z17) {
                this.f239603p = true;
            }
        }
        if (contentValues.containsKey("iconPath")) {
            this.field_iconPath = contentValues.getAsString("iconPath");
            if (z17) {
                this.f239604q = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f239605r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
