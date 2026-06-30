package dm;

/* loaded from: classes7.dex */
public class n9 extends l75.f0 {
    public static final java.lang.String[] A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f238749J;
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
    public static final l75.e0 W;
    public static final o75.e X;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f238750z;
    public java.lang.String field_appId;
    public long field_cmdSequence;
    public boolean field_firstTimeTried;
    public long field_lastRetryTime;
    public java.lang.String field_localRequestAppId;
    public java.lang.String field_localRequestKey;
    public java.lang.String field_localRequestUsername;
    public int field_networkType;
    public java.lang.String field_packageKey;
    public int field_packageType;
    public java.lang.String field_pkgMd5;
    public int field_reportId;
    public int field_retriedCount;
    public long field_retryInterval;
    public int field_retryTimes;
    public int field_scene;
    public boolean field_splitDownloadURLCgi;
    public int field_type;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238751d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238752e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238753f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238754g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238755h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238756i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238757m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238758n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238759o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238760p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238761q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238762r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238763s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238764t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f238765u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f238766v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f238767w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f238768x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f238769y = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadCmdGetCodePersistentInfo2");
        f238750z = n0Var;
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
        A = new java.lang.String[0];
        B = 93028124;
        C = 351608024;
        D = 3575610;
        E = -1148297858;
        F = 198222360;
        G = -1174977651;
        H = -1940613496;
        I = -986540014;
        f238749J = 29312057;
        K = 908960928;
        L = 1493724063;
        M = 1279317997;
        N = -427040401;
        P = -1821065992;
        Q = 109254796;
        R = -692288741;
        S = 1211737883;
        T = -226126438;
        U = 535054552;
        V = 108705909;
        W = initAutoDBInfo(dm.n9.class);
        X = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "retryTimes";
        e0Var.f316955d.put("retryTimes", "INTEGER");
        e0Var.f316954c[4] = "retriedCount";
        e0Var.f316955d.put("retriedCount", "INTEGER");
        e0Var.f316954c[5] = "retryInterval";
        e0Var.f316955d.put("retryInterval", "LONG");
        e0Var.f316954c[6] = "networkType";
        e0Var.f316955d.put("networkType", "INTEGER");
        e0Var.f316954c[7] = "pkgMd5";
        e0Var.f316955d.put("pkgMd5", "TEXT");
        e0Var.f316954c[8] = "packageKey";
        e0Var.f316955d.put("packageKey", "TEXT");
        e0Var.f316954c[9] = "packageType";
        e0Var.f316955d.put("packageType", "INTEGER default '0' ");
        e0Var.f316954c[10] = "lastRetryTime";
        e0Var.f316955d.put("lastRetryTime", "LONG");
        e0Var.f316954c[11] = "firstTimeTried";
        e0Var.f316955d.put("firstTimeTried", "INTEGER");
        e0Var.f316954c[12] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER");
        e0Var.f316954c[13] = "splitDownloadURLCgi";
        e0Var.f316955d.put("splitDownloadURLCgi", "INTEGER");
        e0Var.f316954c[14] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[15] = "cmdSequence";
        e0Var.f316955d.put("cmdSequence", "LONG");
        e0Var.f316954c[16] = "localRequestKey";
        e0Var.f316955d.put("localRequestKey", "TEXT");
        e0Var.f316954c[17] = "localRequestUsername";
        e0Var.f316955d.put("localRequestUsername", "TEXT");
        e0Var.f316954c[18] = "localRequestAppId";
        e0Var.f316955d.put("localRequestAppId", "TEXT");
        e0Var.f316954c[19] = "rowid";
        e0Var.f316956e = " appId TEXT,  version INTEGER,  type INTEGER,  retryTimes INTEGER,  retriedCount INTEGER,  retryInterval LONG,  networkType INTEGER,  pkgMd5 TEXT,  packageKey TEXT,  packageType INTEGER default '0' ,  lastRetryTime LONG,  firstTimeTried INTEGER,  reportId INTEGER,  splitDownloadURLCgi INTEGER,  scene INTEGER,  cmdSequence LONG,  localRequestKey TEXT,  localRequestUsername TEXT,  localRequestAppId TEXT";
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
            if (B == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_retryTimes = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_retriedCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_retryInterval = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_networkType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_pkgMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238749J == hashCode) {
                try {
                    this.field_packageKey = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_packageType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_lastRetryTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else {
                boolean z17 = true;
                if (M == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.field_firstTimeTried = z17;
                    } catch (java.lang.Throwable th17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th17, "convertFrom %s", columnNames[i17]);
                        java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (N == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i17);
                    } catch (java.lang.Throwable th18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th18, "convertFrom %s", columnNames[i17]);
                        java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (P == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.field_splitDownloadURLCgi = z17;
                    } catch (java.lang.Throwable th19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th19, "convertFrom %s", columnNames[i17]);
                        java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (Q == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i17);
                    } catch (java.lang.Throwable th20) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th20, "convertFrom %s", columnNames[i17]);
                        java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (R == hashCode) {
                    try {
                        this.field_cmdSequence = cursor.getLong(i17);
                    } catch (java.lang.Throwable th21) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th21, "convertFrom %s", columnNames[i17]);
                        java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (S == hashCode) {
                    try {
                        this.field_localRequestKey = cursor.getString(i17);
                    } catch (java.lang.Throwable th22) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th22, "convertFrom %s", columnNames[i17]);
                        java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (T == hashCode) {
                    try {
                        this.field_localRequestUsername = cursor.getString(i17);
                    } catch (java.lang.Throwable th23) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th23, "convertFrom %s", columnNames[i17]);
                        java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (U == hashCode) {
                    try {
                        this.field_localRequestAppId = cursor.getString(i17);
                    } catch (java.lang.Throwable th24) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th24, "convertFrom %s", columnNames[i17]);
                        java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } else if (V == hashCode) {
                    this.systemRowid = cursor.getLong(i17);
                }
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238751d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238752e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f238753f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238754g) {
            contentValues.put("retryTimes", java.lang.Integer.valueOf(this.field_retryTimes));
        }
        if (this.f238755h) {
            contentValues.put("retriedCount", java.lang.Integer.valueOf(this.field_retriedCount));
        }
        if (this.f238756i) {
            contentValues.put("retryInterval", java.lang.Long.valueOf(this.field_retryInterval));
        }
        if (this.f238757m) {
            contentValues.put("networkType", java.lang.Integer.valueOf(this.field_networkType));
        }
        if (this.f238758n) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f238759o) {
            contentValues.put("packageKey", this.field_packageKey);
        }
        if (this.f238760p) {
            contentValues.put("packageType", java.lang.Integer.valueOf(this.field_packageType));
        }
        if (this.f238761q) {
            contentValues.put("lastRetryTime", java.lang.Long.valueOf(this.field_lastRetryTime));
        }
        if (this.f238762r) {
            if (this.field_firstTimeTried) {
                contentValues.put("firstTimeTried", (java.lang.Integer) 1);
            } else {
                contentValues.put("firstTimeTried", (java.lang.Integer) 0);
            }
        }
        if (this.f238763s) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.field_reportId));
        }
        if (this.f238764t) {
            if (this.field_splitDownloadURLCgi) {
                contentValues.put("splitDownloadURLCgi", (java.lang.Integer) 1);
            } else {
                contentValues.put("splitDownloadURLCgi", (java.lang.Integer) 0);
            }
        }
        if (this.f238765u) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f238766v) {
            contentValues.put("cmdSequence", java.lang.Long.valueOf(this.field_cmdSequence));
        }
        if (this.f238767w) {
            contentValues.put("localRequestKey", this.field_localRequestKey);
        }
        if (this.f238768x) {
            contentValues.put("localRequestUsername", this.field_localRequestUsername);
        }
        if (this.f238769y) {
            contentValues.put("localRequestAppId", this.field_localRequestAppId);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadCmdGetCodePersistentInfo2 ( ");
        l75.e0 e0Var = W;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTableSql %s", str2);
            k0Var.A("PredownloadCmdGetCodePersistentInfo2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PredownloadCmdGetCodePersistentInfo2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "updateTableSql %s", str3);
            k0Var.A("PredownloadCmdGetCodePersistentInfo2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return W;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return X;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238750z;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238750z.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238751d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f238752e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238753f = true;
            }
        }
        if (contentValues.containsKey("retryTimes")) {
            this.field_retryTimes = contentValues.getAsInteger("retryTimes").intValue();
            if (z17) {
                this.f238754g = true;
            }
        }
        if (contentValues.containsKey("retriedCount")) {
            this.field_retriedCount = contentValues.getAsInteger("retriedCount").intValue();
            if (z17) {
                this.f238755h = true;
            }
        }
        if (contentValues.containsKey("retryInterval")) {
            this.field_retryInterval = contentValues.getAsLong("retryInterval").longValue();
            if (z17) {
                this.f238756i = true;
            }
        }
        if (contentValues.containsKey("networkType")) {
            this.field_networkType = contentValues.getAsInteger("networkType").intValue();
            if (z17) {
                this.f238757m = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z17) {
                this.f238758n = true;
            }
        }
        if (contentValues.containsKey("packageKey")) {
            this.field_packageKey = contentValues.getAsString("packageKey");
            if (z17) {
                this.f238759o = true;
            }
        }
        if (contentValues.containsKey("packageType")) {
            this.field_packageType = contentValues.getAsInteger("packageType").intValue();
            if (z17) {
                this.f238760p = true;
            }
        }
        if (contentValues.containsKey("lastRetryTime")) {
            this.field_lastRetryTime = contentValues.getAsLong("lastRetryTime").longValue();
            if (z17) {
                this.f238761q = true;
            }
        }
        if (contentValues.containsKey("firstTimeTried")) {
            this.field_firstTimeTried = contentValues.getAsInteger("firstTimeTried").intValue() != 0;
            if (z17) {
                this.f238762r = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f238763s = true;
            }
        }
        if (contentValues.containsKey("splitDownloadURLCgi")) {
            this.field_splitDownloadURLCgi = contentValues.getAsInteger("splitDownloadURLCgi").intValue() != 0;
            if (z17) {
                this.f238764t = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f238765u = true;
            }
        }
        if (contentValues.containsKey("cmdSequence")) {
            this.field_cmdSequence = contentValues.getAsLong("cmdSequence").longValue();
            if (z17) {
                this.f238766v = true;
            }
        }
        if (contentValues.containsKey("localRequestKey")) {
            this.field_localRequestKey = contentValues.getAsString("localRequestKey");
            if (z17) {
                this.f238767w = true;
            }
        }
        if (contentValues.containsKey("localRequestUsername")) {
            this.field_localRequestUsername = contentValues.getAsString("localRequestUsername");
            if (z17) {
                this.f238768x = true;
            }
        }
        if (contentValues.containsKey("localRequestAppId")) {
            this.field_localRequestAppId = contentValues.getAsString("localRequestAppId");
            if (z17) {
                this.f238769y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
