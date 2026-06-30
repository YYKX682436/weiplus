package dm;

/* loaded from: classes8.dex */
public class v4 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final l75.e0 G;
    public static final o75.e H;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f240547r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f240548s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f240549t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240550u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240551v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240552w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240553x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240554y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240555z;
    public java.lang.String field_address;
    public r45.qo2 field_basicInfoResponse;
    public java.lang.String field_businessHour;
    public java.lang.String field_categoryTips;
    public java.lang.String field_fromType;
    public float field_latitude;
    public float field_longitude;
    public java.lang.String field_noticeWording;
    public java.lang.String field_phoneNumber;
    public java.lang.String field_poiId;
    public java.lang.String field_priceTips;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240556d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240557e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240558f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240559g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240560h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240561i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240562m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240563n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240564o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240565p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240566q = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderMapPoiInfo");
        f240547r = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240548s = new p75.d("poiId", "string", tableName, "");
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
        f240549t = new java.lang.String[0];
        f240550u = 106844421;
        f240551v = 426235222;
        f240552w = -673101372;
        f240553x = -1192969641;
        f240554y = -2125747167;
        f240555z = -1937827168;
        A = -1439978388;
        B = 137365935;
        C = -1244645884;
        D = -1147692044;
        E = 1374528093;
        F = 108705909;
        G = initAutoDBInfo(dm.v4.class);
        H = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = "poiId";
        e0Var.f316955d.put("poiId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "poiId";
        e0Var.f316954c[1] = "categoryTips";
        e0Var.f316955d.put("categoryTips", "TEXT");
        e0Var.f316954c[2] = "businessHour";
        e0Var.f316955d.put("businessHour", "TEXT");
        e0Var.f316954c[3] = "phoneNumber";
        e0Var.f316955d.put("phoneNumber", "TEXT");
        e0Var.f316954c[4] = "priceTips";
        e0Var.f316955d.put("priceTips", "TEXT");
        e0Var.f316954c[5] = "noticeWording";
        e0Var.f316955d.put("noticeWording", "TEXT");
        e0Var.f316954c[6] = "latitude";
        e0Var.f316955d.put("latitude", "FLOAT");
        e0Var.f316954c[7] = "longitude";
        e0Var.f316955d.put("longitude", "FLOAT");
        e0Var.f316954c[8] = "fromType";
        e0Var.f316955d.put("fromType", "TEXT");
        e0Var.f316954c[9] = "address";
        e0Var.f316955d.put("address", "TEXT default '' ");
        e0Var.f316954c[10] = "basicInfoResponse";
        e0Var.f316955d.put("basicInfoResponse", "BLOB");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " poiId TEXT PRIMARY KEY ,  categoryTips TEXT,  businessHour TEXT,  phoneNumber TEXT,  priceTips TEXT,  noticeWording TEXT,  latitude FLOAT,  longitude FLOAT,  fromType TEXT,  address TEXT default '' ,  basicInfoResponse BLOB";
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
            if (f240550u == hashCode) {
                try {
                    this.field_poiId = cursor.getString(i17);
                    this.f240556d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240551v == hashCode) {
                try {
                    this.field_categoryTips = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240552w == hashCode) {
                try {
                    this.field_businessHour = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240553x == hashCode) {
                try {
                    this.field_phoneNumber = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240554y == hashCode) {
                try {
                    this.field_priceTips = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240555z == hashCode) {
                try {
                    this.field_noticeWording = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_latitude = cursor.getFloat(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_longitude = cursor.getFloat(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_fromType = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_address = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_basicInfoResponse = (r45.qo2) new r45.qo2().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240556d) {
            contentValues.put("poiId", this.field_poiId);
        }
        if (this.f240557e) {
            contentValues.put("categoryTips", this.field_categoryTips);
        }
        if (this.f240558f) {
            contentValues.put("businessHour", this.field_businessHour);
        }
        if (this.f240559g) {
            contentValues.put("phoneNumber", this.field_phoneNumber);
        }
        if (this.f240560h) {
            contentValues.put("priceTips", this.field_priceTips);
        }
        if (this.f240561i) {
            contentValues.put("noticeWording", this.field_noticeWording);
        }
        if (this.f240562m) {
            contentValues.put("latitude", java.lang.Float.valueOf(this.field_latitude));
        }
        if (this.f240563n) {
            contentValues.put("longitude", java.lang.Float.valueOf(this.field_longitude));
        }
        if (this.f240564o) {
            contentValues.put("fromType", this.field_fromType);
        }
        if (this.field_address == null) {
            this.field_address = "";
        }
        if (this.f240565p) {
            contentValues.put("address", this.field_address);
        }
        if (this.f240566q) {
            r45.qo2 qo2Var = this.field_basicInfoResponse;
            if (qo2Var != null) {
                try {
                    contentValues.put("basicInfoResponse", qo2Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", e17.getMessage());
                }
            } else {
                contentValues.put("basicInfoResponse", (byte[]) null);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderMapPoiInfo ( ");
        l75.e0 e0Var = G;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240549t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTableSql %s", str2);
            k0Var.A("FinderMapPoiInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderMapPoiInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "updateTableSql %s", str3);
            k0Var.A("FinderMapPoiInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return G;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return H;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_poiId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240547r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240547r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("poiId")) {
            this.field_poiId = contentValues.getAsString("poiId");
            if (z17) {
                this.f240556d = true;
            }
        }
        if (contentValues.containsKey("categoryTips")) {
            this.field_categoryTips = contentValues.getAsString("categoryTips");
            if (z17) {
                this.f240557e = true;
            }
        }
        if (contentValues.containsKey("businessHour")) {
            this.field_businessHour = contentValues.getAsString("businessHour");
            if (z17) {
                this.f240558f = true;
            }
        }
        if (contentValues.containsKey("phoneNumber")) {
            this.field_phoneNumber = contentValues.getAsString("phoneNumber");
            if (z17) {
                this.f240559g = true;
            }
        }
        if (contentValues.containsKey("priceTips")) {
            this.field_priceTips = contentValues.getAsString("priceTips");
            if (z17) {
                this.f240560h = true;
            }
        }
        if (contentValues.containsKey("noticeWording")) {
            this.field_noticeWording = contentValues.getAsString("noticeWording");
            if (z17) {
                this.f240561i = true;
            }
        }
        if (contentValues.containsKey("latitude")) {
            this.field_latitude = contentValues.getAsFloat("latitude").floatValue();
            if (z17) {
                this.f240562m = true;
            }
        }
        if (contentValues.containsKey("longitude")) {
            this.field_longitude = contentValues.getAsFloat("longitude").floatValue();
            if (z17) {
                this.f240563n = true;
            }
        }
        if (contentValues.containsKey("fromType")) {
            this.field_fromType = contentValues.getAsString("fromType");
            if (z17) {
                this.f240564o = true;
            }
        }
        if (contentValues.containsKey("address")) {
            this.field_address = contentValues.getAsString("address");
            if (z17) {
                this.f240565p = true;
            }
        }
        if (contentValues.containsKey("basicInfoResponse")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("basicInfoResponse");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_basicInfoResponse = (r45.qo2) new r45.qo2().parseFrom(asByteArray);
                    if (z17) {
                        this.f240566q = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
