package dm;

/* loaded from: classes4.dex */
public class w8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f240847n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f240848o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240849p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240850q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240851r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240852s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240853t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240854u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240855v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240856w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f240857x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f240858y;
    public java.lang.String field_appid;
    public java.lang.String field_language;
    public java.lang.String field_pinyin;
    public java.lang.String field_quanpin;
    public long field_updateTime;
    public java.lang.String field_wording;
    public java.lang.String field_wordingId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240859d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240860e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240861f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240862g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240863h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240864i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240865m = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMWordingInfo");
        f240847n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240848o = new java.lang.String[0];
        f240849p = 93029116;
        f240850q = 899170259;
        f240851r = -1613589672;
        f240852s = 1524956312;
        f240853t = -988136023;
        f240854u = 651281060;
        f240855v = -295931082;
        f240856w = 108705909;
        f240857x = initAutoDBInfo(dm.w8.class);
        f240858y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "appid";
        e0Var.f316955d.put("appid", "TEXT");
        e0Var.f316954c[1] = "wordingId";
        e0Var.f316955d.put("wordingId", "TEXT");
        e0Var.f316954c[2] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        e0Var.f316954c[3] = "wording";
        e0Var.f316955d.put("wording", "TEXT");
        e0Var.f316954c[4] = "pinyin";
        e0Var.f316955d.put("pinyin", "TEXT");
        e0Var.f316954c[5] = "quanpin";
        e0Var.f316955d.put("quanpin", "TEXT");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " appid TEXT,  wordingId TEXT,  language TEXT,  wording TEXT,  pinyin TEXT,  quanpin TEXT,  updateTime LONG default '0' ";
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
            if (f240849p == hashCode) {
                try {
                    this.field_appid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240850q == hashCode) {
                try {
                    this.field_wordingId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240851r == hashCode) {
                try {
                    this.field_language = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240852s == hashCode) {
                try {
                    this.field_wording = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240853t == hashCode) {
                try {
                    this.field_pinyin = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240854u == hashCode) {
                try {
                    this.field_quanpin = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240855v == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240856w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240859d) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f240860e) {
            contentValues.put("wordingId", this.field_wordingId);
        }
        if (this.f240861f) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f240862g) {
            contentValues.put("wording", this.field_wording);
        }
        if (this.f240863h) {
            contentValues.put("pinyin", this.field_pinyin);
        }
        if (this.f240864i) {
            contentValues.put("quanpin", this.field_quanpin);
        }
        if (this.f240865m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMWordingInfo ( ");
        l75.e0 e0Var = f240857x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240848o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMWordingInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenIMWordingInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMWordingInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240857x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240858y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240847n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240847n.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "appid", this.field_appid);
            n51.f.b(jSONObject, "wordingId", this.field_wordingId);
            n51.f.b(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            n51.f.b(jSONObject, "wording", this.field_wording);
            n51.f.b(jSONObject, "pinyin", this.field_pinyin);
            n51.f.b(jSONObject, "quanpin", this.field_quanpin);
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z17) {
                this.f240859d = true;
            }
        }
        if (contentValues.containsKey("wordingId")) {
            this.field_wordingId = contentValues.getAsString("wordingId");
            if (z17) {
                this.f240860e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z17) {
                this.f240861f = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.field_wording = contentValues.getAsString("wording");
            if (z17) {
                this.f240862g = true;
            }
        }
        if (contentValues.containsKey("pinyin")) {
            this.field_pinyin = contentValues.getAsString("pinyin");
            if (z17) {
                this.f240863h = true;
            }
        }
        if (contentValues.containsKey("quanpin")) {
            this.field_quanpin = contentValues.getAsString("quanpin");
            if (z17) {
                this.f240864i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240865m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
