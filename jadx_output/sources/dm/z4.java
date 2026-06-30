package dm;

/* loaded from: classes8.dex */
public class z4 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f241447J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f241448u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f241449v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f241450w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241451x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241452y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241453z;
    public long field_accRedDotExpStartTime;
    public r45.vb4 field_banCnt;
    public int field_businessType;
    public r45.pc4 field_businessTypeBanModel;
    public java.lang.String field_dicPath;
    public r45.vb4 field_exposeCnt;
    public int field_exposeCntLimit;
    public int field_exposeCntStrategy;
    public long field_feedid;
    public java.lang.String field_findTabRedDotPath;
    public java.lang.String field_freqControlId;
    public boolean field_isBusinessTypeBanModel;
    public boolean field_isBusinessTypeRedDot;
    public java.lang.String field_reportExtInfo;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241454d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241455e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241456f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241457g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241458h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241459i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241460m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241461n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241462o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241463p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241464q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241465r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241466s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241467t = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderRedDotFreqControl");
        f241448u = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241449v = new p75.d("freqControlId", "string", tableName, "");
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
        f241450w = new java.lang.String[0];
        f241451x = 1742429120;
        f241452y = -807612551;
        f241453z = -672734438;
        A = 422850309;
        B = -1396384038;
        C = 1622705707;
        D = 1656024515;
        E = -1112775300;
        F = -1005824546;
        G = -491303532;
        H = -939931722;
        I = -1990893160;
        f241447J = -1278409927;
        K = 2100308635;
        L = 108705909;
        M = initAutoDBInfo(dm.z4.class);
        N = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = "freqControlId";
        e0Var.f316955d.put("freqControlId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "freqControlId";
        e0Var.f316954c[1] = "findTabRedDotPath";
        e0Var.f316955d.put("findTabRedDotPath", "TEXT");
        e0Var.f316954c[2] = "businessType";
        e0Var.f316955d.put("businessType", "INTEGER default '0' ");
        e0Var.f316954c[3] = "exposeCnt";
        e0Var.f316955d.put("exposeCnt", "BLOB");
        e0Var.f316954c[4] = "banCnt";
        e0Var.f316955d.put("banCnt", "BLOB");
        e0Var.f316954c[5] = "accRedDotExpStartTime";
        e0Var.f316955d.put("accRedDotExpStartTime", "LONG");
        e0Var.f316954c[6] = "dicPath";
        e0Var.f316955d.put("dicPath", "TEXT");
        e0Var.f316954c[7] = "isBusinessTypeRedDot";
        e0Var.f316955d.put("isBusinessTypeRedDot", "INTEGER");
        e0Var.f316954c[8] = "isBusinessTypeBanModel";
        e0Var.f316955d.put("isBusinessTypeBanModel", "INTEGER");
        e0Var.f316954c[9] = "businessTypeBanModel";
        e0Var.f316955d.put("businessTypeBanModel", "BLOB");
        e0Var.f316954c[10] = "exposeCntLimit";
        e0Var.f316955d.put("exposeCntLimit", "INTEGER");
        e0Var.f316954c[11] = "exposeCntStrategy";
        e0Var.f316955d.put("exposeCntStrategy", "INTEGER");
        e0Var.f316954c[12] = "feedid";
        e0Var.f316955d.put("feedid", "LONG");
        e0Var.f316954c[13] = "reportExtInfo";
        e0Var.f316955d.put("reportExtInfo", "TEXT");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " freqControlId TEXT PRIMARY KEY ,  findTabRedDotPath TEXT,  businessType INTEGER default '0' ,  exposeCnt BLOB,  banCnt BLOB,  accRedDotExpStartTime LONG,  dicPath TEXT,  isBusinessTypeRedDot INTEGER,  isBusinessTypeBanModel INTEGER,  businessTypeBanModel BLOB,  exposeCntLimit INTEGER,  exposeCntStrategy INTEGER,  feedid LONG,  reportExtInfo TEXT";
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
            boolean z17 = true;
            if (f241451x == hashCode) {
                try {
                    this.field_freqControlId = cursor.getString(i17);
                    this.f241454d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241452y == hashCode) {
                try {
                    this.field_findTabRedDotPath = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241453z == hashCode) {
                try {
                    this.field_businessType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_exposeCnt = (r45.vb4) new r45.vb4().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_banCnt = (r45.vb4) new r45.vb4().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_accRedDotExpStartTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_dicPath = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isBusinessTypeRedDot = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isBusinessTypeBanModel = z17;
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.field_businessTypeBanModel = (r45.pc4) new r45.pc4().parseFrom(blob3);
                    }
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_exposeCntLimit = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_exposeCntStrategy = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241447J == hashCode) {
                try {
                    this.field_feedid = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_reportExtInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotFreqControl", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241454d) {
            contentValues.put("freqControlId", this.field_freqControlId);
        }
        if (this.f241455e) {
            contentValues.put("findTabRedDotPath", this.field_findTabRedDotPath);
        }
        if (this.f241456f) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.field_businessType));
        }
        if (this.f241457g) {
            r45.vb4 vb4Var = this.field_exposeCnt;
            if (vb4Var != null) {
                try {
                    contentValues.put("exposeCnt", vb4Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e17.getMessage());
                }
            } else {
                contentValues.put("exposeCnt", (byte[]) null);
            }
        }
        if (this.f241458h) {
            r45.vb4 vb4Var2 = this.field_banCnt;
            if (vb4Var2 != null) {
                try {
                    contentValues.put("banCnt", vb4Var2.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e18.getMessage());
                }
            } else {
                contentValues.put("banCnt", (byte[]) null);
            }
        }
        if (this.f241459i) {
            contentValues.put("accRedDotExpStartTime", java.lang.Long.valueOf(this.field_accRedDotExpStartTime));
        }
        if (this.f241460m) {
            contentValues.put("dicPath", this.field_dicPath);
        }
        if (this.f241461n) {
            if (this.field_isBusinessTypeRedDot) {
                contentValues.put("isBusinessTypeRedDot", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBusinessTypeRedDot", (java.lang.Integer) 0);
            }
        }
        if (this.f241462o) {
            if (this.field_isBusinessTypeBanModel) {
                contentValues.put("isBusinessTypeBanModel", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBusinessTypeBanModel", (java.lang.Integer) 0);
            }
        }
        if (this.f241463p) {
            r45.pc4 pc4Var = this.field_businessTypeBanModel;
            if (pc4Var != null) {
                try {
                    contentValues.put("businessTypeBanModel", pc4Var.toByteArray());
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e19.getMessage());
                }
            } else {
                contentValues.put("businessTypeBanModel", (byte[]) null);
            }
        }
        if (this.f241464q) {
            contentValues.put("exposeCntLimit", java.lang.Integer.valueOf(this.field_exposeCntLimit));
        }
        if (this.f241465r) {
            contentValues.put("exposeCntStrategy", java.lang.Integer.valueOf(this.field_exposeCntStrategy));
        }
        if (this.f241466s) {
            contentValues.put("feedid", java.lang.Long.valueOf(this.field_feedid));
        }
        if (this.f241467t) {
            contentValues.put("reportExtInfo", this.field_reportExtInfo);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderRedDotFreqControl ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241450w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTableSql %s", str2);
            k0Var.A("FinderRedDotFreqControl", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderRedDotFreqControl", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "updateTableSql %s", str3);
            k0Var.A("FinderRedDotFreqControl", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return M;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return N;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_freqControlId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241448u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241448u.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("freqControlId")) {
            this.field_freqControlId = contentValues.getAsString("freqControlId");
            if (z17) {
                this.f241454d = true;
            }
        }
        if (contentValues.containsKey("findTabRedDotPath")) {
            this.field_findTabRedDotPath = contentValues.getAsString("findTabRedDotPath");
            if (z17) {
                this.f241455e = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.field_businessType = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f241456f = true;
            }
        }
        if (contentValues.containsKey("exposeCnt")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("exposeCnt");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_exposeCnt = (r45.vb4) new r45.vb4().parseFrom(asByteArray);
                    if (z17) {
                        this.f241457g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e17.getMessage());
            }
        }
        if (contentValues.containsKey("banCnt")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("banCnt");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_banCnt = (r45.vb4) new r45.vb4().parseFrom(asByteArray2);
                    if (z17) {
                        this.f241458h = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e18.getMessage());
            }
        }
        if (contentValues.containsKey("accRedDotExpStartTime")) {
            this.field_accRedDotExpStartTime = contentValues.getAsLong("accRedDotExpStartTime").longValue();
            if (z17) {
                this.f241459i = true;
            }
        }
        if (contentValues.containsKey("dicPath")) {
            this.field_dicPath = contentValues.getAsString("dicPath");
            if (z17) {
                this.f241460m = true;
            }
        }
        if (contentValues.containsKey("isBusinessTypeRedDot")) {
            this.field_isBusinessTypeRedDot = contentValues.getAsInteger("isBusinessTypeRedDot").intValue() != 0;
            if (z17) {
                this.f241461n = true;
            }
        }
        if (contentValues.containsKey("isBusinessTypeBanModel")) {
            this.field_isBusinessTypeBanModel = contentValues.getAsInteger("isBusinessTypeBanModel").intValue() != 0;
            if (z17) {
                this.f241462o = true;
            }
        }
        if (contentValues.containsKey("businessTypeBanModel")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("businessTypeBanModel");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_businessTypeBanModel = (r45.pc4) new r45.pc4().parseFrom(asByteArray3);
                    if (z17) {
                        this.f241463p = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e19.getMessage());
            }
        }
        if (contentValues.containsKey("exposeCntLimit")) {
            this.field_exposeCntLimit = contentValues.getAsInteger("exposeCntLimit").intValue();
            if (z17) {
                this.f241464q = true;
            }
        }
        if (contentValues.containsKey("exposeCntStrategy")) {
            this.field_exposeCntStrategy = contentValues.getAsInteger("exposeCntStrategy").intValue();
            if (z17) {
                this.f241465r = true;
            }
        }
        if (contentValues.containsKey("feedid")) {
            this.field_feedid = contentValues.getAsLong("feedid").longValue();
            if (z17) {
                this.f241466s = true;
            }
        }
        if (contentValues.containsKey("reportExtInfo")) {
            this.field_reportExtInfo = contentValues.getAsString("reportExtInfo");
            if (z17) {
                this.f241467t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
