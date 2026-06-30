package dm;

/* loaded from: classes4.dex */
public class q8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f239433h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f239434i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239435m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239436n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239437o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239438p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239439q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f239440r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f239441s;
    public r45.j1 field_accTypeRec;
    public java.lang.String field_acctTypeId;
    public java.lang.String field_language;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239442d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239443e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239444f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239445g = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMAccTypeInfo");
        f239433h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239434i = new java.lang.String[0];
        f239435m = -1595499544;
        f239436n = -1613589672;
        f239437o = 1119775541;
        f239438p = -295931082;
        f239439q = 108705909;
        f239440r = initAutoDBInfo(dm.q8.class);
        f239441s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "acctTypeId";
        e0Var.f316955d.put("acctTypeId", "TEXT");
        e0Var.f316954c[1] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        e0Var.f316954c[2] = "accTypeRec";
        e0Var.f316955d.put("accTypeRec", "BLOB");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " acctTypeId TEXT,  language TEXT,  accTypeRec BLOB,  updateTime LONG default '0' ";
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
            if (f239435m == hashCode) {
                try {
                    this.field_acctTypeId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239436n == hashCode) {
                try {
                    this.field_language = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239437o == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_accTypeRec = (r45.j1) new r45.j1().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239438p == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239439q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239442d) {
            contentValues.put("acctTypeId", this.field_acctTypeId);
        }
        if (this.f239443e) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f239444f) {
            r45.j1 j1Var = this.field_accTypeRec;
            if (j1Var != null) {
                try {
                    contentValues.put("accTypeRec", j1Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e17.getMessage());
                }
            } else {
                contentValues.put("accTypeRec", (byte[]) null);
            }
        }
        if (this.f239445g) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMAccTypeInfo ( ");
        l75.e0 e0Var = f239440r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239434i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMAccTypeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenIMAccTypeInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMAccTypeInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239440r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239441s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239433h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239433h.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "acctTypeId", this.field_acctTypeId);
            n51.f.b(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            n51.f.b(jSONObject, "accTypeRec", this.field_accTypeRec);
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("acctTypeId")) {
            this.field_acctTypeId = contentValues.getAsString("acctTypeId");
            if (z17) {
                this.f239442d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z17) {
                this.f239443e = true;
            }
        }
        if (contentValues.containsKey("accTypeRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("accTypeRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_accTypeRec = (r45.j1) new r45.j1().parseFrom(asByteArray);
                    if (z17) {
                        this.f239444f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239445g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
