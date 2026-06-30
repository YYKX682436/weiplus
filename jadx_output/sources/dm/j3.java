package dm;

/* loaded from: classes12.dex */
public class j3 extends l75.f0 {
    public static final p75.d A;
    public static final java.lang.String[] B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f237756J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final l75.e0 S;
    public static final o75.e T;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f237757u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f237758v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f237759w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f237760x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f237761y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f237762z;
    public long field_attrFlag;
    public java.lang.String field_cdnKey;
    public java.lang.String field_cdnUrl;
    public java.lang.String field_dataId;
    public int field_dataType;
    public int field_extFlag;
    public long field_favLocalId;
    public long field_modifyTime;
    public int field_offset;
    public java.lang.String field_path;
    public int field_retryTime;
    public int field_status;
    public int field_totalLen;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237763d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237764e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237765f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237766g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237767h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237768i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237769m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237770n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237771o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237772p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237773q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237774r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237775s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237776t = true;

    static {
        p75.n0 n0Var = new p75.n0("FavCdnInfo");
        f237757u = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237758v = new p75.d("dataId", "string", tableName, "");
        f237759w = new p75.d("favLocalId", "long", tableName, "");
        f237760x = new p75.d("type", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237761y = new p75.d("status", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237762z = new p75.d("modifyTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("retryTime", "int", tableName, "");
        B = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)"};
        C = -1338919323;
        D = -597679541;
        E = 3575610;
        F = -1364966910;
        G = -1364976910;
        H = -849913807;
        I = -1019779949;
        f237756J = -892481550;
        K = 3433509;
        L = 1789070852;
        M = 1211388583;
        N = -1306589907;
        P = 553577725;
        Q = -1006873195;
        R = 108705909;
        S = initAutoDBInfo(dm.j3.class);
        T = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = "dataId";
        e0Var.f316955d.put("dataId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "dataId";
        e0Var.f316954c[1] = "favLocalId";
        e0Var.f316955d.put("favLocalId", "LONG");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "cdnUrl";
        e0Var.f316955d.put("cdnUrl", "TEXT");
        e0Var.f316954c[4] = "cdnKey";
        e0Var.f316955d.put("cdnKey", "TEXT");
        e0Var.f316954c[5] = "totalLen";
        e0Var.f316955d.put("totalLen", "INTEGER");
        e0Var.f316954c[6] = "offset";
        e0Var.f316955d.put("offset", "INTEGER");
        e0Var.f316954c[7] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[8] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[9] = "dataType";
        e0Var.f316955d.put("dataType", "INTEGER");
        e0Var.f316954c[10] = "modifyTime";
        e0Var.f316955d.put("modifyTime", "LONG default '0' ");
        e0Var.f316954c[11] = "extFlag";
        e0Var.f316955d.put("extFlag", "INTEGER default '0' ");
        e0Var.f316954c[12] = "attrFlag";
        e0Var.f316955d.put("attrFlag", "LONG default '0' ");
        e0Var.f316954c[13] = "retryTime";
        e0Var.f316955d.put("retryTime", "INTEGER default '0' ");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " dataId TEXT PRIMARY KEY ,  favLocalId LONG,  type INTEGER,  cdnUrl TEXT,  cdnKey TEXT,  totalLen INTEGER,  offset INTEGER,  status INTEGER,  path TEXT,  dataType INTEGER,  modifyTime LONG default '0' ,  extFlag INTEGER default '0' ,  attrFlag LONG default '0' ,  retryTime INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public static final p75.l0 t0(java.lang.String str) {
        p75.i0 i17 = f237757u.i();
        i17.f352657d = f237758v.j(str);
        i17.f352656c = "MicroMsg.SDK.BaseFavCdnInfo";
        return i17.a();
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
            if (C == hashCode) {
                try {
                    this.field_dataId = cursor.getString(i17);
                    this.f237763d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_favLocalId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_cdnUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_cdnKey = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_totalLen = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_offset = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237756J == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_dataType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_modifyTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_extFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_attrFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_retryTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavCdnInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237763d) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f237764e) {
            contentValues.put("favLocalId", java.lang.Long.valueOf(this.field_favLocalId));
        }
        if (this.f237765f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f237766g) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f237767h) {
            contentValues.put("cdnKey", this.field_cdnKey);
        }
        if (this.f237768i) {
            contentValues.put("totalLen", java.lang.Integer.valueOf(this.field_totalLen));
        }
        if (this.f237769m) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.field_offset));
        }
        if (this.f237770n) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f237771o) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f237772p) {
            contentValues.put("dataType", java.lang.Integer.valueOf(this.field_dataType));
        }
        if (this.f237773q) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
        }
        if (this.f237774r) {
            contentValues.put("extFlag", java.lang.Integer.valueOf(this.field_extFlag));
        }
        if (this.f237775s) {
            contentValues.put("attrFlag", java.lang.Long.valueOf(this.field_attrFlag));
        }
        if (this.f237776t) {
            contentValues.put("retryTime", java.lang.Integer.valueOf(this.field_retryTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavCdnInfo ( ");
        l75.e0 e0Var = S;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "createTableSql %s", str2);
            k0Var.A("FavCdnInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavCdnInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "updateTableSql %s", str3);
            k0Var.A("FavCdnInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return S;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return T;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_dataId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237757u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237757u.f352676a;
    }

    @Override // l75.f0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "dataId", this.field_dataId);
            n51.f.b(jSONObject, "favLocalId", java.lang.Long.valueOf(this.field_favLocalId));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "cdnUrl", this.field_cdnUrl);
            n51.f.b(jSONObject, "cdnKey", this.field_cdnKey);
            n51.f.b(jSONObject, "totalLen", java.lang.Integer.valueOf(this.field_totalLen));
            n51.f.b(jSONObject, "offset", java.lang.Integer.valueOf(this.field_offset));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.field_status));
            n51.f.b(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
            n51.f.b(jSONObject, "dataType", java.lang.Integer.valueOf(this.field_dataType));
            n51.f.b(jSONObject, "modifyTime", java.lang.Long.valueOf(this.field_modifyTime));
            n51.f.b(jSONObject, "extFlag", java.lang.Integer.valueOf(this.field_extFlag));
            n51.f.b(jSONObject, "attrFlag", java.lang.Long.valueOf(this.field_attrFlag));
            n51.f.b(jSONObject, "retryTime", java.lang.Integer.valueOf(this.field_retryTime));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z17) {
                this.f237763d = true;
            }
        }
        if (contentValues.containsKey("favLocalId")) {
            this.field_favLocalId = contentValues.getAsLong("favLocalId").longValue();
            if (z17) {
                this.f237764e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f237765f = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z17) {
                this.f237766g = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.field_cdnKey = contentValues.getAsString("cdnKey");
            if (z17) {
                this.f237767h = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsInteger("totalLen").intValue();
            if (z17) {
                this.f237768i = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z17) {
                this.f237769m = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237770n = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f237771o = true;
            }
        }
        if (contentValues.containsKey("dataType")) {
            this.field_dataType = contentValues.getAsInteger("dataType").intValue();
            if (z17) {
                this.f237772p = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f237773q = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z17) {
                this.f237774r = true;
            }
        }
        if (contentValues.containsKey("attrFlag")) {
            this.field_attrFlag = contentValues.getAsLong("attrFlag").longValue();
            if (z17) {
                this.f237775s = true;
            }
        }
        if (contentValues.containsKey("retryTime")) {
            this.field_retryTime = contentValues.getAsInteger("retryTime").intValue();
            if (z17) {
                this.f237776t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
