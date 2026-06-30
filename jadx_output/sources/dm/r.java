package dm;

/* loaded from: classes9.dex */
public class r extends l75.f0 {
    public static final p75.n0 B;
    public static final java.lang.String[] C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f239516J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final l75.e0 f239517p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f239518x0;
    public java.lang.String field_appId;
    public java.lang.String field_clientAppDataId;
    public long field_createTime;
    public java.lang.String field_fakeAeskey;
    public java.lang.String field_fakeSignature;
    public java.lang.String field_fileFullPath;
    public java.lang.String field_fullXml;
    public boolean field_isUpload;
    public int field_isUseCdn;
    public long field_lastModifyTime;
    public java.lang.String field_mediaId;
    public java.lang.String field_mediaSvrId;
    public long field_msgInfoId;
    public java.lang.String field_msgInfoTalker;
    public long field_netTimes;
    public long field_offset;
    public long field_sdkVer;
    public java.lang.String field_signature;
    public long field_status;
    public long field_totalLen;
    public long field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239519d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239520e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239521f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239522g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239523h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239524i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239525m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239526n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239527o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239528p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239529q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239530r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239531s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239532t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239533u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239534v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239535w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239536x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f239537y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f239538z = true;
    public boolean A = true;

    static {
        p75.n0 n0Var = new p75.n0("appattach");
        B = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new java.lang.String[0];
        D = 93028124;
        E = -906989303;
        F = 1928844902;
        G = 940773407;
        H = 1207926875;
        I = 3575610;
        f239516J = -849913807;
        K = -1019779949;
        L = -892481550;
        M = -164560949;
        N = 1369213417;
        P = 1420492253;
        Q = 62863600;
        R = -511248632;
        S = -1766053558;
        T = 1280960425;
        U = -162041104;
        V = 1073584312;
        W = 1104441061;
        X = 1183076579;
        Y = 828388104;
        Z = 108705909;
        f239517p0 = initAutoDBInfo(dm.r.class);
        f239518x0 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[21];
        java.lang.String[] strArr = new java.lang.String[22];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "sdkVer";
        e0Var.f316955d.put("sdkVer", "LONG");
        e0Var.f316954c[2] = "mediaSvrId";
        e0Var.f316955d.put("mediaSvrId", "TEXT");
        e0Var.f316954c[3] = "mediaId";
        e0Var.f316955d.put("mediaId", "TEXT");
        e0Var.f316954c[4] = "clientAppDataId";
        e0Var.f316955d.put("clientAppDataId", "TEXT");
        e0Var.f316954c[5] = "type";
        e0Var.f316955d.put("type", "LONG");
        e0Var.f316954c[6] = "totalLen";
        e0Var.f316955d.put("totalLen", "LONG");
        e0Var.f316954c[7] = "offset";
        e0Var.f316955d.put("offset", "LONG");
        e0Var.f316954c[8] = "status";
        e0Var.f316955d.put("status", "LONG");
        e0Var.f316954c[9] = "isUpload";
        e0Var.f316955d.put("isUpload", "INTEGER");
        e0Var.f316954c[10] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[11] = "lastModifyTime";
        e0Var.f316955d.put("lastModifyTime", "LONG");
        e0Var.f316954c[12] = "fileFullPath";
        e0Var.f316955d.put("fileFullPath", "TEXT");
        e0Var.f316954c[13] = "fullXml";
        e0Var.f316955d.put("fullXml", "TEXT");
        e0Var.f316954c[14] = "msgInfoId";
        e0Var.f316955d.put("msgInfoId", "LONG");
        e0Var.f316954c[15] = "netTimes";
        e0Var.f316955d.put("netTimes", "LONG");
        e0Var.f316954c[16] = "isUseCdn";
        e0Var.f316955d.put("isUseCdn", "INTEGER");
        e0Var.f316954c[17] = "signature";
        e0Var.f316955d.put("signature", "TEXT");
        e0Var.f316954c[18] = "fakeAeskey";
        e0Var.f316955d.put("fakeAeskey", "TEXT");
        e0Var.f316954c[19] = "fakeSignature";
        e0Var.f316955d.put("fakeSignature", "TEXT");
        e0Var.f316954c[20] = "msgInfoTalker";
        e0Var.f316955d.put("msgInfoTalker", "TEXT");
        e0Var.f316954c[21] = "rowid";
        e0Var.f316956e = " appId TEXT,  sdkVer LONG,  mediaSvrId TEXT,  mediaId TEXT,  clientAppDataId TEXT,  type LONG,  totalLen LONG,  offset LONG,  status LONG,  isUpload INTEGER,  createTime LONG,  lastModifyTime LONG,  fileFullPath TEXT,  fullXml TEXT,  msgInfoId LONG,  netTimes LONG,  isUseCdn INTEGER,  signature TEXT,  fakeAeskey TEXT,  fakeSignature TEXT,  msgInfoTalker TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.r)) {
            return false;
        }
        dm.r rVar = (dm.r) f0Var;
        return n51.f.a(this.field_appId, rVar.field_appId) && n51.f.a(java.lang.Long.valueOf(this.field_sdkVer), java.lang.Long.valueOf(rVar.field_sdkVer)) && n51.f.a(this.field_mediaSvrId, rVar.field_mediaSvrId) && n51.f.a(this.field_mediaId, rVar.field_mediaId) && n51.f.a(this.field_clientAppDataId, rVar.field_clientAppDataId) && n51.f.a(java.lang.Long.valueOf(this.field_type), java.lang.Long.valueOf(rVar.field_type)) && n51.f.a(java.lang.Long.valueOf(this.field_totalLen), java.lang.Long.valueOf(rVar.field_totalLen)) && n51.f.a(java.lang.Long.valueOf(this.field_offset), java.lang.Long.valueOf(rVar.field_offset)) && n51.f.a(java.lang.Long.valueOf(this.field_status), java.lang.Long.valueOf(rVar.field_status)) && n51.f.a(java.lang.Boolean.valueOf(this.field_isUpload), java.lang.Boolean.valueOf(rVar.field_isUpload)) && n51.f.a(java.lang.Long.valueOf(this.field_createTime), java.lang.Long.valueOf(rVar.field_createTime)) && n51.f.a(java.lang.Long.valueOf(this.field_lastModifyTime), java.lang.Long.valueOf(rVar.field_lastModifyTime)) && n51.f.a(this.field_fileFullPath, rVar.field_fileFullPath) && n51.f.a(this.field_fullXml, rVar.field_fullXml) && n51.f.a(java.lang.Long.valueOf(this.field_msgInfoId), java.lang.Long.valueOf(rVar.field_msgInfoId)) && n51.f.a(java.lang.Long.valueOf(this.field_netTimes), java.lang.Long.valueOf(rVar.field_netTimes)) && n51.f.a(java.lang.Integer.valueOf(this.field_isUseCdn), java.lang.Integer.valueOf(rVar.field_isUseCdn)) && n51.f.a(this.field_signature, rVar.field_signature) && n51.f.a(this.field_fakeAeskey, rVar.field_fakeAeskey) && n51.f.a(this.field_fakeSignature, rVar.field_fakeSignature) && n51.f.a(this.field_msgInfoTalker, rVar.field_msgInfoTalker);
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
            if (D == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_sdkVer = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_mediaSvrId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_mediaId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_clientAppDataId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_type = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239516J == hashCode) {
                try {
                    this.field_totalLen = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_offset = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_status = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_isUpload = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_lastModifyTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_fileFullPath = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_fullXml = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_msgInfoId = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_netTimes = cursor.getLong(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_isUseCdn = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_signature = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_fakeAeskey = cursor.getString(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_fakeSignature = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_msgInfoTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239519d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239520e) {
            contentValues.put("sdkVer", java.lang.Long.valueOf(this.field_sdkVer));
        }
        if (this.f239521f) {
            contentValues.put("mediaSvrId", this.field_mediaSvrId);
        }
        if (this.f239522g) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f239523h) {
            contentValues.put("clientAppDataId", this.field_clientAppDataId);
        }
        if (this.f239524i) {
            contentValues.put("type", java.lang.Long.valueOf(this.field_type));
        }
        if (this.f239525m) {
            contentValues.put("totalLen", java.lang.Long.valueOf(this.field_totalLen));
        }
        if (this.f239526n) {
            contentValues.put("offset", java.lang.Long.valueOf(this.field_offset));
        }
        if (this.f239527o) {
            contentValues.put("status", java.lang.Long.valueOf(this.field_status));
        }
        if (this.f239528p) {
            if (this.field_isUpload) {
                contentValues.put("isUpload", (java.lang.Integer) 1);
            } else {
                contentValues.put("isUpload", (java.lang.Integer) 0);
            }
        }
        if (this.f239529q) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f239530r) {
            contentValues.put("lastModifyTime", java.lang.Long.valueOf(this.field_lastModifyTime));
        }
        if (this.f239531s) {
            contentValues.put("fileFullPath", this.field_fileFullPath);
        }
        if (this.f239532t) {
            contentValues.put("fullXml", this.field_fullXml);
        }
        if (this.f239533u) {
            contentValues.put("msgInfoId", java.lang.Long.valueOf(this.field_msgInfoId));
        }
        if (this.f239534v) {
            contentValues.put("netTimes", java.lang.Long.valueOf(this.field_netTimes));
        }
        if (this.f239535w) {
            contentValues.put("isUseCdn", java.lang.Integer.valueOf(this.field_isUseCdn));
        }
        if (this.f239536x) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f239537y) {
            contentValues.put("fakeAeskey", this.field_fakeAeskey);
        }
        if (this.f239538z) {
            contentValues.put("fakeSignature", this.field_fakeSignature);
        }
        if (this.A) {
            contentValues.put("msgInfoTalker", this.field_msgInfoTalker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppAttachInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS appattach ( ");
        l75.e0 e0Var = f239517p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : C) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppAttachInfo", "createTableSql %s", str2);
            k0Var.A("appattach", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "appattach", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppAttachInfo", "updateTableSql %s", str3);
            k0Var.A("appattach", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppAttachInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239517p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239518x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return B;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return B.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239519d = true;
            }
        }
        if (contentValues.containsKey("sdkVer")) {
            this.field_sdkVer = contentValues.getAsLong("sdkVer").longValue();
            if (z17) {
                this.f239520e = true;
            }
        }
        if (contentValues.containsKey("mediaSvrId")) {
            this.field_mediaSvrId = contentValues.getAsString("mediaSvrId");
            if (z17) {
                this.f239521f = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z17) {
                this.f239522g = true;
            }
        }
        if (contentValues.containsKey("clientAppDataId")) {
            this.field_clientAppDataId = contentValues.getAsString("clientAppDataId");
            if (z17) {
                this.f239523h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsLong("type").longValue();
            if (z17) {
                this.f239524i = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsLong("totalLen").longValue();
            if (z17) {
                this.f239525m = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsLong("offset").longValue();
            if (z17) {
                this.f239526n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsLong("status").longValue();
            if (z17) {
                this.f239527o = true;
            }
        }
        if (contentValues.containsKey("isUpload")) {
            this.field_isUpload = contentValues.getAsInteger("isUpload").intValue() != 0;
            if (z17) {
                this.f239528p = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239529q = true;
            }
        }
        if (contentValues.containsKey("lastModifyTime")) {
            this.field_lastModifyTime = contentValues.getAsLong("lastModifyTime").longValue();
            if (z17) {
                this.f239530r = true;
            }
        }
        if (contentValues.containsKey("fileFullPath")) {
            this.field_fileFullPath = contentValues.getAsString("fileFullPath");
            if (z17) {
                this.f239531s = true;
            }
        }
        if (contentValues.containsKey("fullXml")) {
            this.field_fullXml = contentValues.getAsString("fullXml");
            if (z17) {
                this.f239532t = true;
            }
        }
        if (contentValues.containsKey("msgInfoId")) {
            this.field_msgInfoId = contentValues.getAsLong("msgInfoId").longValue();
            if (z17) {
                this.f239533u = true;
            }
        }
        if (contentValues.containsKey("netTimes")) {
            this.field_netTimes = contentValues.getAsLong("netTimes").longValue();
            if (z17) {
                this.f239534v = true;
            }
        }
        if (contentValues.containsKey("isUseCdn")) {
            this.field_isUseCdn = contentValues.getAsInteger("isUseCdn").intValue();
            if (z17) {
                this.f239535w = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z17) {
                this.f239536x = true;
            }
        }
        if (contentValues.containsKey("fakeAeskey")) {
            this.field_fakeAeskey = contentValues.getAsString("fakeAeskey");
            if (z17) {
                this.f239537y = true;
            }
        }
        if (contentValues.containsKey("fakeSignature")) {
            this.field_fakeSignature = contentValues.getAsString("fakeSignature");
            if (z17) {
                this.f239538z = true;
            }
        }
        if (contentValues.containsKey("msgInfoTalker")) {
            this.field_msgInfoTalker = contentValues.getAsString("msgInfoTalker");
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
