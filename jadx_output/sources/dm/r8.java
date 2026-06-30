package dm;

/* loaded from: classes4.dex */
public class r8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f239673m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f239674n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239675o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239676p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239677q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239678r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239679s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239680t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239681u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239682v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239683w;
    public java.lang.String field_acctTypeId;
    public r45.x8 field_appRec;
    public java.lang.String field_appid;
    public java.lang.String field_language;
    public int field_subType;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239684d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239685e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239686f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239687g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239688h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239689i = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMAppIdInfo");
        f239673m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239674n = new java.lang.String[0];
        f239675o = 93029116;
        f239676p = -1613589672;
        f239677q = -1411086673;
        f239678r = -295931082;
        f239679s = -1595499544;
        f239680t = -1868521062;
        f239681u = 108705909;
        f239682v = initAutoDBInfo(dm.r8.class);
        f239683w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "appid";
        e0Var.f316955d.put("appid", "TEXT");
        e0Var.f316954c[1] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        e0Var.f316954c[2] = "appRec";
        e0Var.f316955d.put("appRec", "BLOB");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[4] = "acctTypeId";
        e0Var.f316955d.put("acctTypeId", "TEXT");
        e0Var.f316954c[5] = "subType";
        e0Var.f316955d.put("subType", "INTEGER default '0' ");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " appid TEXT,  language TEXT,  appRec BLOB,  updateTime LONG default '0' ,  acctTypeId TEXT,  subType INTEGER default '0' ";
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
            if (f239675o == hashCode) {
                try {
                    this.field_appid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239676p == hashCode) {
                try {
                    this.field_language = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239677q == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_appRec = (r45.x8) new r45.x8().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239678r == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239679s == hashCode) {
                try {
                    this.field_acctTypeId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239680t == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239681u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239684d) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f239685e) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f239686f) {
            r45.x8 x8Var = this.field_appRec;
            if (x8Var != null) {
                try {
                    contentValues.put("appRec", x8Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e17.getMessage());
                }
            } else {
                contentValues.put("appRec", (byte[]) null);
            }
        }
        if (this.f239687g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f239688h) {
            contentValues.put("acctTypeId", this.field_acctTypeId);
        }
        if (this.f239689i) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMAppIdInfo ( ");
        l75.e0 e0Var = f239682v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239674n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMAppIdInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenIMAppIdInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMAppIdInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239682v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239683w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239673m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239673m.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "appid", this.field_appid);
            n51.f.b(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            n51.f.b(jSONObject, "appRec", this.field_appRec);
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
            n51.f.b(jSONObject, "acctTypeId", this.field_acctTypeId);
            n51.f.b(jSONObject, "subType", java.lang.Integer.valueOf(this.field_subType));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z17) {
                this.f239684d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z17) {
                this.f239685e = true;
            }
        }
        if (contentValues.containsKey("appRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("appRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_appRec = (r45.x8) new r45.x8().parseFrom(asByteArray);
                    if (z17) {
                        this.f239686f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239687g = true;
            }
        }
        if (contentValues.containsKey("acctTypeId")) {
            this.field_acctTypeId = contentValues.getAsString("acctTypeId");
            if (z17) {
                this.f239688h = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f239689i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
