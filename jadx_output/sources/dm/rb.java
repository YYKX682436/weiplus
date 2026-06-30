package dm;

/* loaded from: classes4.dex */
public class rb extends l75.f0 {
    public static final p75.n0 B;
    public static final java.lang.String[] C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f239705J;
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
    public static final l75.e0 f239706p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f239707x0;
    public int field_audioBitrate;
    public int field_audioChannelCount;
    public int field_audioSampleRate;
    public byte[] field_baseItemData;
    public java.lang.String field_blurBgPath;
    public long field_expiredTime;
    public byte[] field_extraConfig;
    public int field_frameRate;
    public int field_fromScene;
    public byte[] field_location;
    public int field_mixFlag;
    public int field_mixRetryTime;
    public java.lang.String field_reportInfo;
    public int field_status;
    public int field_targetHeight;
    public int field_targetWidth;
    public java.lang.String field_taskId;
    public long field_timeStamp;
    public java.lang.String field_userData;
    public int field_videoBitrate;
    public int field_videoRotate;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239708d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239709e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239710f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239711g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239712h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239713i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239714m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239715n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239716o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239717p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239718q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239719r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239720s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239721t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239722u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239723v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239724w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239725x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f239726y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f239727z = true;
    public boolean A = true;

    static {
        p75.n0 n0Var = new p75.n0("VideoEditInfo");
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
        D = -880873088;
        E = -492230834;
        F = 25573622;
        G = 374093465;
        H = -92515438;
        I = -892481550;
        f239705J = -2092294475;
        K = -869614056;
        L = -249426318;
        M = -1688626505;
        N = -1475447264;
        P = -739414846;
        Q = 545057773;
        R = 1009735094;
        S = 902870898;
        T = 1931047938;
        U = -266964459;
        V = 1901043637;
        W = 1072729064;
        X = -1881330351;
        Y = 69094146;
        Z = 108705909;
        f239706p0 = initAutoDBInfo(dm.rb.class);
        f239707x0 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[21];
        java.lang.String[] strArr = new java.lang.String[22];
        e0Var.f316954c = strArr;
        strArr[0] = "taskId";
        e0Var.f316955d.put("taskId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "taskId";
        e0Var.f316954c[1] = "baseItemData";
        e0Var.f316955d.put("baseItemData", "BLOB");
        e0Var.f316954c[2] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG");
        e0Var.f316954c[3] = "mixRetryTime";
        e0Var.f316955d.put("mixRetryTime", "INTEGER");
        e0Var.f316954c[4] = "expiredTime";
        e0Var.f316955d.put("expiredTime", "LONG");
        e0Var.f316954c[5] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[6] = "targetWidth";
        e0Var.f316955d.put("targetWidth", "INTEGER");
        e0Var.f316954c[7] = "targetHeight";
        e0Var.f316955d.put("targetHeight", "INTEGER");
        e0Var.f316954c[8] = "videoBitrate";
        e0Var.f316955d.put("videoBitrate", "INTEGER");
        e0Var.f316954c[9] = "audioBitrate";
        e0Var.f316955d.put("audioBitrate", "INTEGER");
        e0Var.f316954c[10] = "audioSampleRate";
        e0Var.f316955d.put("audioSampleRate", "INTEGER");
        e0Var.f316954c[11] = "audioChannelCount";
        e0Var.f316955d.put("audioChannelCount", "INTEGER");
        e0Var.f316954c[12] = "frameRate";
        e0Var.f316955d.put("frameRate", "INTEGER");
        e0Var.f316954c[13] = "videoRotate";
        e0Var.f316955d.put("videoRotate", "INTEGER");
        e0Var.f316954c[14] = "extraConfig";
        e0Var.f316955d.put("extraConfig", "BLOB");
        e0Var.f316954c[15] = "reportInfo";
        e0Var.f316955d.put("reportInfo", "TEXT");
        e0Var.f316954c[16] = "userData";
        e0Var.f316955d.put("userData", "TEXT");
        e0Var.f316954c[17] = ya.b.LOCATION;
        e0Var.f316955d.put(ya.b.LOCATION, "BLOB");
        e0Var.f316954c[18] = "mixFlag";
        e0Var.f316955d.put("mixFlag", "INTEGER");
        e0Var.f316954c[19] = "blurBgPath";
        e0Var.f316955d.put("blurBgPath", "TEXT");
        e0Var.f316954c[20] = "fromScene";
        e0Var.f316955d.put("fromScene", "INTEGER");
        e0Var.f316954c[21] = "rowid";
        e0Var.f316956e = " taskId TEXT PRIMARY KEY ,  baseItemData BLOB,  timeStamp LONG,  mixRetryTime INTEGER,  expiredTime LONG,  status INTEGER,  targetWidth INTEGER,  targetHeight INTEGER,  videoBitrate INTEGER,  audioBitrate INTEGER,  audioSampleRate INTEGER,  audioChannelCount INTEGER,  frameRate INTEGER,  videoRotate INTEGER,  extraConfig BLOB,  reportInfo TEXT,  userData TEXT,  location BLOB,  mixFlag INTEGER,  blurBgPath TEXT,  fromScene INTEGER";
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
            if (D == hashCode) {
                try {
                    this.field_taskId = cursor.getString(i17);
                    this.f239708d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_baseItemData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_mixRetryTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_expiredTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239705J == hashCode) {
                try {
                    this.field_targetWidth = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_targetHeight = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_videoBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_audioBitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_audioSampleRate = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_audioChannelCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_frameRate = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_videoRotate = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_extraConfig = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_reportInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_userData = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_location = cursor.getBlob(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_mixFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_blurBgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_fromScene = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th26, "convertFrom %s", columnNames[i17]);
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
        if (this.f239708d) {
            contentValues.put("taskId", this.field_taskId);
        }
        if (this.f239709e) {
            contentValues.put("baseItemData", this.field_baseItemData);
        }
        if (this.f239710f) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
        }
        if (this.f239711g) {
            contentValues.put("mixRetryTime", java.lang.Integer.valueOf(this.field_mixRetryTime));
        }
        if (this.f239712h) {
            contentValues.put("expiredTime", java.lang.Long.valueOf(this.field_expiredTime));
        }
        if (this.f239713i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f239714m) {
            contentValues.put("targetWidth", java.lang.Integer.valueOf(this.field_targetWidth));
        }
        if (this.f239715n) {
            contentValues.put("targetHeight", java.lang.Integer.valueOf(this.field_targetHeight));
        }
        if (this.f239716o) {
            contentValues.put("videoBitrate", java.lang.Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f239717p) {
            contentValues.put("audioBitrate", java.lang.Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f239718q) {
            contentValues.put("audioSampleRate", java.lang.Integer.valueOf(this.field_audioSampleRate));
        }
        if (this.f239719r) {
            contentValues.put("audioChannelCount", java.lang.Integer.valueOf(this.field_audioChannelCount));
        }
        if (this.f239720s) {
            contentValues.put("frameRate", java.lang.Integer.valueOf(this.field_frameRate));
        }
        if (this.f239721t) {
            contentValues.put("videoRotate", java.lang.Integer.valueOf(this.field_videoRotate));
        }
        if (this.f239722u) {
            contentValues.put("extraConfig", this.field_extraConfig);
        }
        if (this.f239723v) {
            contentValues.put("reportInfo", this.field_reportInfo);
        }
        if (this.f239724w) {
            contentValues.put("userData", this.field_userData);
        }
        if (this.f239725x) {
            contentValues.put(ya.b.LOCATION, this.field_location);
        }
        if (this.f239726y) {
            contentValues.put("mixFlag", java.lang.Integer.valueOf(this.field_mixFlag));
        }
        if (this.f239727z) {
            contentValues.put("blurBgPath", this.field_blurBgPath);
        }
        if (this.A) {
            contentValues.put("fromScene", java.lang.Integer.valueOf(this.field_fromScene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseVideoEditInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS VideoEditInfo ( ");
        l75.e0 e0Var = f239706p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : C) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVideoEditInfo", "createTableSql %s", str2);
            k0Var.A("VideoEditInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "VideoEditInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVideoEditInfo", "updateTableSql %s", str3);
            k0Var.A("VideoEditInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVideoEditInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239706p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239707x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_taskId;
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
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsString("taskId");
            if (z17) {
                this.f239708d = true;
            }
        }
        if (contentValues.containsKey("baseItemData")) {
            this.field_baseItemData = contentValues.getAsByteArray("baseItemData");
            if (z17) {
                this.f239709e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f239710f = true;
            }
        }
        if (contentValues.containsKey("mixRetryTime")) {
            this.field_mixRetryTime = contentValues.getAsInteger("mixRetryTime").intValue();
            if (z17) {
                this.f239711g = true;
            }
        }
        if (contentValues.containsKey("expiredTime")) {
            this.field_expiredTime = contentValues.getAsLong("expiredTime").longValue();
            if (z17) {
                this.f239712h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f239713i = true;
            }
        }
        if (contentValues.containsKey("targetWidth")) {
            this.field_targetWidth = contentValues.getAsInteger("targetWidth").intValue();
            if (z17) {
                this.f239714m = true;
            }
        }
        if (contentValues.containsKey("targetHeight")) {
            this.field_targetHeight = contentValues.getAsInteger("targetHeight").intValue();
            if (z17) {
                this.f239715n = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z17) {
                this.f239716o = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z17) {
                this.f239717p = true;
            }
        }
        if (contentValues.containsKey("audioSampleRate")) {
            this.field_audioSampleRate = contentValues.getAsInteger("audioSampleRate").intValue();
            if (z17) {
                this.f239718q = true;
            }
        }
        if (contentValues.containsKey("audioChannelCount")) {
            this.field_audioChannelCount = contentValues.getAsInteger("audioChannelCount").intValue();
            if (z17) {
                this.f239719r = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z17) {
                this.f239720s = true;
            }
        }
        if (contentValues.containsKey("videoRotate")) {
            this.field_videoRotate = contentValues.getAsInteger("videoRotate").intValue();
            if (z17) {
                this.f239721t = true;
            }
        }
        if (contentValues.containsKey("extraConfig")) {
            this.field_extraConfig = contentValues.getAsByteArray("extraConfig");
            if (z17) {
                this.f239722u = true;
            }
        }
        if (contentValues.containsKey("reportInfo")) {
            this.field_reportInfo = contentValues.getAsString("reportInfo");
            if (z17) {
                this.f239723v = true;
            }
        }
        if (contentValues.containsKey("userData")) {
            this.field_userData = contentValues.getAsString("userData");
            if (z17) {
                this.f239724w = true;
            }
        }
        if (contentValues.containsKey(ya.b.LOCATION)) {
            this.field_location = contentValues.getAsByteArray(ya.b.LOCATION);
            if (z17) {
                this.f239725x = true;
            }
        }
        if (contentValues.containsKey("mixFlag")) {
            this.field_mixFlag = contentValues.getAsInteger("mixFlag").intValue();
            if (z17) {
                this.f239726y = true;
            }
        }
        if (contentValues.containsKey("blurBgPath")) {
            this.field_blurBgPath = contentValues.getAsString("blurBgPath");
            if (z17) {
                this.f239727z = true;
            }
        }
        if (contentValues.containsKey("fromScene")) {
            this.field_fromScene = contentValues.getAsInteger("fromScene").intValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
