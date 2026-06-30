package dm;

/* loaded from: classes8.dex */
public class v5 extends l75.f0 {
    public static final p75.n0 A;
    public static final java.lang.String[] B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f240567J;
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
    public static final l75.e0 Y;
    public static final o75.e Z;
    public java.lang.String field_SecondaryUrl;
    public java.lang.String field_appId;
    public boolean field_continueDelay;
    public boolean field_downloadInWidget;
    public int field_downloadScene;
    public java.lang.String field_downloadUrl;
    public long field_expireTime;
    public int field_forceUpdateFlag;
    public boolean field_isFirst;
    public boolean field_isRunning;
    public boolean field_lowBattery;
    public java.lang.String field_md5;
    public long field_nextCheckTime;
    public boolean field_noEnoughSpace;
    public boolean field_noSdcard;
    public boolean field_noWifi;
    public java.lang.String field_packageName;
    public long field_randomTime;
    public byte[] field_sectionMd5Byte;
    public long field_size;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240568d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240569e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240570f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240571g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240572h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240573i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240574m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240575n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240576o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240577p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240578q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240579r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240580s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240581t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240582u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240583v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f240584w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f240585x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f240586y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f240587z = true;

    static {
        p75.n0 n0Var = new p75.n0("GameSilentDownload");
        A = n0Var;
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
        B = new java.lang.String[0];
        C = 93028124;
        D = -1211148345;
        E = 3530753;
        F = 107902;
        G = 908759025;
        H = -834724724;
        I = 115642928;
        f240567J = 2058846118;
        K = -1861083582;
        L = 971005237;
        M = -1040553866;
        N = 635887106;
        P = -1376008971;
        Q = -238158823;
        R = -1903071972;
        S = -140817541;
        T = -893564815;
        U = -1222440703;
        V = 268770592;
        W = 20280548;
        X = 108705909;
        Y = initAutoDBInfo(dm.v5.class);
        Z = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[20];
        java.lang.String[] strArr = new java.lang.String[21];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "downloadUrl";
        e0Var.f316955d.put("downloadUrl", "TEXT");
        e0Var.f316954c[2] = "size";
        e0Var.f316955d.put("size", "LONG default '0' ");
        e0Var.f316954c[3] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[4] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, "TEXT");
        e0Var.f316954c[5] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG default '0' ");
        e0Var.f316954c[6] = "randomTime";
        e0Var.f316955d.put("randomTime", "LONG default '0' ");
        e0Var.f316954c[7] = "isFirst";
        e0Var.f316955d.put("isFirst", "INTEGER default 'true' ");
        e0Var.f316954c[8] = "nextCheckTime";
        e0Var.f316955d.put("nextCheckTime", "LONG default '0' ");
        e0Var.f316954c[9] = "isRunning";
        e0Var.f316955d.put("isRunning", "INTEGER default 'false' ");
        e0Var.f316954c[10] = "noWifi";
        e0Var.f316955d.put("noWifi", "INTEGER default 'true' ");
        e0Var.f316954c[11] = "noSdcard";
        e0Var.f316955d.put("noSdcard", "INTEGER default 'true' ");
        e0Var.f316954c[12] = "noEnoughSpace";
        e0Var.f316955d.put("noEnoughSpace", "INTEGER default 'true' ");
        e0Var.f316954c[13] = "lowBattery";
        e0Var.f316955d.put("lowBattery", "INTEGER default 'true' ");
        e0Var.f316954c[14] = "continueDelay";
        e0Var.f316955d.put("continueDelay", "INTEGER default 'true' ");
        e0Var.f316954c[15] = "SecondaryUrl";
        e0Var.f316955d.put("SecondaryUrl", "TEXT");
        e0Var.f316954c[16] = "downloadInWidget";
        e0Var.f316955d.put("downloadInWidget", "INTEGER");
        e0Var.f316954c[17] = "sectionMd5Byte";
        e0Var.f316955d.put("sectionMd5Byte", "BLOB");
        e0Var.f316954c[18] = "forceUpdateFlag";
        e0Var.f316955d.put("forceUpdateFlag", "INTEGER default '0' ");
        e0Var.f316954c[19] = "downloadScene";
        e0Var.f316955d.put("downloadScene", "INTEGER default '0' ");
        e0Var.f316954c[20] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  downloadUrl TEXT,  size LONG default '0' ,  md5 TEXT,  packageName TEXT,  expireTime LONG default '0' ,  randomTime LONG default '0' ,  isFirst INTEGER default 'true' ,  nextCheckTime LONG default '0' ,  isRunning INTEGER default 'false' ,  noWifi INTEGER default 'true' ,  noSdcard INTEGER default 'true' ,  noEnoughSpace INTEGER default 'true' ,  lowBattery INTEGER default 'true' ,  continueDelay INTEGER default 'true' ,  SecondaryUrl TEXT,  downloadInWidget INTEGER,  sectionMd5Byte BLOB,  forceUpdateFlag INTEGER default '0' ,  downloadScene INTEGER default '0' ";
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
            if (C == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f240568d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_downloadUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_packageName = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_randomTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240567J == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isFirst = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_nextCheckTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isRunning = z17;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_noWifi = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_noSdcard = z17;
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_noEnoughSpace = z17;
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_lowBattery = z17;
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_continueDelay = z17;
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_SecondaryUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_downloadInWidget = z17;
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_sectionMd5Byte = cursor.getBlob(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_forceUpdateFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_downloadScene = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240568d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f240569e) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f240570f) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f240571g) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f240572h) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, this.field_packageName);
        }
        if (this.f240573i) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
        }
        if (this.f240574m) {
            contentValues.put("randomTime", java.lang.Long.valueOf(this.field_randomTime));
        }
        if (this.f240575n) {
            if (this.field_isFirst) {
                contentValues.put("isFirst", (java.lang.Integer) 1);
            } else {
                contentValues.put("isFirst", (java.lang.Integer) 0);
            }
        }
        if (this.f240576o) {
            contentValues.put("nextCheckTime", java.lang.Long.valueOf(this.field_nextCheckTime));
        }
        if (this.f240577p) {
            if (this.field_isRunning) {
                contentValues.put("isRunning", (java.lang.Integer) 1);
            } else {
                contentValues.put("isRunning", (java.lang.Integer) 0);
            }
        }
        if (this.f240578q) {
            if (this.field_noWifi) {
                contentValues.put("noWifi", (java.lang.Integer) 1);
            } else {
                contentValues.put("noWifi", (java.lang.Integer) 0);
            }
        }
        if (this.f240579r) {
            if (this.field_noSdcard) {
                contentValues.put("noSdcard", (java.lang.Integer) 1);
            } else {
                contentValues.put("noSdcard", (java.lang.Integer) 0);
            }
        }
        if (this.f240580s) {
            if (this.field_noEnoughSpace) {
                contentValues.put("noEnoughSpace", (java.lang.Integer) 1);
            } else {
                contentValues.put("noEnoughSpace", (java.lang.Integer) 0);
            }
        }
        if (this.f240581t) {
            if (this.field_lowBattery) {
                contentValues.put("lowBattery", (java.lang.Integer) 1);
            } else {
                contentValues.put("lowBattery", (java.lang.Integer) 0);
            }
        }
        if (this.f240582u) {
            if (this.field_continueDelay) {
                contentValues.put("continueDelay", (java.lang.Integer) 1);
            } else {
                contentValues.put("continueDelay", (java.lang.Integer) 0);
            }
        }
        if (this.f240583v) {
            contentValues.put("SecondaryUrl", this.field_SecondaryUrl);
        }
        if (this.f240584w) {
            if (this.field_downloadInWidget) {
                contentValues.put("downloadInWidget", (java.lang.Integer) 1);
            } else {
                contentValues.put("downloadInWidget", (java.lang.Integer) 0);
            }
        }
        if (this.f240585x) {
            contentValues.put("sectionMd5Byte", this.field_sectionMd5Byte);
        }
        if (this.f240586y) {
            contentValues.put("forceUpdateFlag", java.lang.Integer.valueOf(this.field_forceUpdateFlag));
        }
        if (this.f240587z) {
            contentValues.put("downloadScene", java.lang.Integer.valueOf(this.field_downloadScene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameSilentDownload", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameSilentDownload ( ");
        l75.e0 e0Var = Y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSilentDownload", "createTableSql %s", str2);
            k0Var.A("GameSilentDownload", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameSilentDownload", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSilentDownload", "updateTableSql %s", str3);
            k0Var.A("GameSilentDownload", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSilentDownload", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Y;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return Z;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return A;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return A.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f240568d = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f240569e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f240570f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f240571g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME)) {
            this.field_packageName = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            if (z17) {
                this.f240572h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f240573i = true;
            }
        }
        if (contentValues.containsKey("randomTime")) {
            this.field_randomTime = contentValues.getAsLong("randomTime").longValue();
            if (z17) {
                this.f240574m = true;
            }
        }
        if (contentValues.containsKey("isFirst")) {
            this.field_isFirst = contentValues.getAsInteger("isFirst").intValue() != 0;
            if (z17) {
                this.f240575n = true;
            }
        }
        if (contentValues.containsKey("nextCheckTime")) {
            this.field_nextCheckTime = contentValues.getAsLong("nextCheckTime").longValue();
            if (z17) {
                this.f240576o = true;
            }
        }
        if (contentValues.containsKey("isRunning")) {
            this.field_isRunning = contentValues.getAsInteger("isRunning").intValue() != 0;
            if (z17) {
                this.f240577p = true;
            }
        }
        if (contentValues.containsKey("noWifi")) {
            this.field_noWifi = contentValues.getAsInteger("noWifi").intValue() != 0;
            if (z17) {
                this.f240578q = true;
            }
        }
        if (contentValues.containsKey("noSdcard")) {
            this.field_noSdcard = contentValues.getAsInteger("noSdcard").intValue() != 0;
            if (z17) {
                this.f240579r = true;
            }
        }
        if (contentValues.containsKey("noEnoughSpace")) {
            this.field_noEnoughSpace = contentValues.getAsInteger("noEnoughSpace").intValue() != 0;
            if (z17) {
                this.f240580s = true;
            }
        }
        if (contentValues.containsKey("lowBattery")) {
            this.field_lowBattery = contentValues.getAsInteger("lowBattery").intValue() != 0;
            if (z17) {
                this.f240581t = true;
            }
        }
        if (contentValues.containsKey("continueDelay")) {
            this.field_continueDelay = contentValues.getAsInteger("continueDelay").intValue() != 0;
            if (z17) {
                this.f240582u = true;
            }
        }
        if (contentValues.containsKey("SecondaryUrl")) {
            this.field_SecondaryUrl = contentValues.getAsString("SecondaryUrl");
            if (z17) {
                this.f240583v = true;
            }
        }
        if (contentValues.containsKey("downloadInWidget")) {
            this.field_downloadInWidget = contentValues.getAsInteger("downloadInWidget").intValue() != 0;
            if (z17) {
                this.f240584w = true;
            }
        }
        if (contentValues.containsKey("sectionMd5Byte")) {
            this.field_sectionMd5Byte = contentValues.getAsByteArray("sectionMd5Byte");
            if (z17) {
                this.f240585x = true;
            }
        }
        if (contentValues.containsKey("forceUpdateFlag")) {
            this.field_forceUpdateFlag = contentValues.getAsInteger("forceUpdateFlag").intValue();
            if (z17) {
                this.f240586y = true;
            }
        }
        if (contentValues.containsKey("downloadScene")) {
            this.field_downloadScene = contentValues.getAsInteger("downloadScene").intValue();
            if (z17) {
                this.f240587z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
