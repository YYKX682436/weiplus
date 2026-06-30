package dm;

/* loaded from: classes9.dex */
public class s9 extends l75.f0 {
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
    public static final int f239906J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f239907y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f239908z;
    public java.lang.String field_cdnKey;
    public java.lang.String field_cdnUrl;
    public java.lang.String field_dataId;
    public int field_errCode;
    public int field_fileType;
    public boolean field_isThumb;
    public int field_localId;
    public java.lang.String field_mediaId;
    public long field_offset;
    public java.lang.String field_path;
    public int field_recordLocalId;
    public int field_status;
    public java.lang.String field_toUser;
    public long field_totalLen;
    public java.lang.String field_tpaeskey;
    public java.lang.String field_tpauthkey;
    public java.lang.String field_tpdataurl;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239909d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239910e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239911f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239912g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239913h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239914i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239915m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239916n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239917o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239918p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239919q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239920r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239921s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239922t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239923u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239924v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239925w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239926x = true;

    static {
        p75.n0 n0Var = new p75.n0("RecordCDNInfo");
        f239907y = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239908z = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS record_localid_index ON RecordCDNInfo(recordLocalId)"};
        A = 338409958;
        B = -779380651;
        C = -868828954;
        D = -1338919323;
        E = 940773407;
        F = 3433509;
        G = -1364966910;
        H = -1364976910;
        I = -849913807;
        f239906J = 2071748300;
        K = -1019779949;
        L = 3575610;
        M = -735520042;
        N = -892481550;
        P = -1480298254;
        Q = -502431572;
        R = 2063396283;
        S = -141841527;
        T = 108705909;
        U = initAutoDBInfo(dm.s9.class);
        V = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "INTEGER PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "recordLocalId";
        e0Var.f316955d.put("recordLocalId", "INTEGER");
        e0Var.f316954c[2] = "toUser";
        e0Var.f316955d.put("toUser", "TEXT default '' ");
        e0Var.f316954c[3] = "dataId";
        e0Var.f316955d.put("dataId", "TEXT");
        e0Var.f316954c[4] = "mediaId";
        e0Var.f316955d.put("mediaId", "TEXT");
        e0Var.f316954c[5] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[6] = "cdnUrl";
        e0Var.f316955d.put("cdnUrl", "TEXT");
        e0Var.f316954c[7] = "cdnKey";
        e0Var.f316955d.put("cdnKey", "TEXT");
        e0Var.f316954c[8] = "totalLen";
        e0Var.f316955d.put("totalLen", "LONG default '0' ");
        e0Var.f316954c[9] = "isThumb";
        e0Var.f316955d.put("isThumb", "INTEGER default 'false' ");
        e0Var.f316954c[10] = "offset";
        e0Var.f316955d.put("offset", "LONG default '0' ");
        e0Var.f316954c[11] = "type";
        e0Var.f316955d.put("type", "INTEGER default '0' ");
        e0Var.f316954c[12] = "fileType";
        e0Var.f316955d.put("fileType", "INTEGER default '5' ");
        e0Var.f316954c[13] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[14] = "errCode";
        e0Var.f316955d.put("errCode", "INTEGER default '0' ");
        e0Var.f316954c[15] = "tpaeskey";
        e0Var.f316955d.put("tpaeskey", "TEXT");
        e0Var.f316954c[16] = "tpauthkey";
        e0Var.f316955d.put("tpauthkey", "TEXT");
        e0Var.f316954c[17] = "tpdataurl";
        e0Var.f316955d.put("tpdataurl", "TEXT");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " localId INTEGER PRIMARY KEY ,  recordLocalId INTEGER,  toUser TEXT default '' ,  dataId TEXT,  mediaId TEXT,  path TEXT,  cdnUrl TEXT,  cdnKey TEXT,  totalLen LONG default '0' ,  isThumb INTEGER default 'false' ,  offset LONG default '0' ,  type INTEGER default '0' ,  fileType INTEGER default '5' ,  status INTEGER default '0' ,  errCode INTEGER default '0' ,  tpaeskey TEXT,  tpauthkey TEXT,  tpdataurl TEXT";
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
            if (A == hashCode) {
                try {
                    this.field_localId = cursor.getInt(i17);
                    this.f239909d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_recordLocalId = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_toUser = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_dataId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_cdnUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_cdnKey = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_totalLen = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239906J == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isThumb = z17;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_offset = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_fileType = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_errCode = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_tpaeskey = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_tpauthkey = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_tpdataurl = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239909d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Integer.valueOf(this.field_localId));
        }
        if (this.f239910e) {
            contentValues.put("recordLocalId", java.lang.Integer.valueOf(this.field_recordLocalId));
        }
        if (this.field_toUser == null) {
            this.field_toUser = "";
        }
        if (this.f239911f) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f239912g) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f239913h) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f239914i) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f239915m) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f239916n) {
            contentValues.put("cdnKey", this.field_cdnKey);
        }
        if (this.f239917o) {
            contentValues.put("totalLen", java.lang.Long.valueOf(this.field_totalLen));
        }
        if (this.f239918p) {
            if (this.field_isThumb) {
                contentValues.put("isThumb", (java.lang.Integer) 1);
            } else {
                contentValues.put("isThumb", (java.lang.Integer) 0);
            }
        }
        if (this.f239919q) {
            contentValues.put("offset", java.lang.Long.valueOf(this.field_offset));
        }
        if (this.f239920r) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f239921s) {
            contentValues.put("fileType", java.lang.Integer.valueOf(this.field_fileType));
        }
        if (this.f239922t) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f239923u) {
            contentValues.put("errCode", java.lang.Integer.valueOf(this.field_errCode));
        }
        if (this.f239924v) {
            contentValues.put("tpaeskey", this.field_tpaeskey);
        }
        if (this.f239925w) {
            contentValues.put("tpauthkey", this.field_tpauthkey);
        }
        if (this.f239926x) {
            contentValues.put("tpdataurl", this.field_tpdataurl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRecordCDNInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RecordCDNInfo ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239908z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "createTableSql %s", str2);
            k0Var.A("RecordCDNInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "RecordCDNInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "updateTableSql %s", str3);
            k0Var.A("RecordCDNInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return V;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239907y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239907y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsInteger(dm.i4.COL_LOCALID).intValue();
            if (z17) {
                this.f239909d = true;
            }
        }
        if (contentValues.containsKey("recordLocalId")) {
            this.field_recordLocalId = contentValues.getAsInteger("recordLocalId").intValue();
            if (z17) {
                this.f239910e = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z17) {
                this.f239911f = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z17) {
                this.f239912g = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f239913h = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f239914i = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z17) {
                this.f239915m = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.field_cdnKey = contentValues.getAsString("cdnKey");
            if (z17) {
                this.f239916n = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsLong("totalLen").longValue();
            if (z17) {
                this.f239917o = true;
            }
        }
        if (contentValues.containsKey("isThumb")) {
            this.field_isThumb = contentValues.getAsInteger("isThumb").intValue() != 0;
            if (z17) {
                this.f239918p = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsLong("offset").longValue();
            if (z17) {
                this.f239919q = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f239920r = true;
            }
        }
        if (contentValues.containsKey("fileType")) {
            this.field_fileType = contentValues.getAsInteger("fileType").intValue();
            if (z17) {
                this.f239921s = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f239922t = true;
            }
        }
        if (contentValues.containsKey("errCode")) {
            this.field_errCode = contentValues.getAsInteger("errCode").intValue();
            if (z17) {
                this.f239923u = true;
            }
        }
        if (contentValues.containsKey("tpaeskey")) {
            this.field_tpaeskey = contentValues.getAsString("tpaeskey");
            if (z17) {
                this.f239924v = true;
            }
        }
        if (contentValues.containsKey("tpauthkey")) {
            this.field_tpauthkey = contentValues.getAsString("tpauthkey");
            if (z17) {
                this.f239925w = true;
            }
        }
        if (contentValues.containsKey("tpdataurl")) {
            this.field_tpdataurl = contentValues.getAsString("tpdataurl");
            if (z17) {
                this.f239926x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
