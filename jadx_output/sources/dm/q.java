package dm;

/* loaded from: classes8.dex */
public class q extends l75.f0 {
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
    public static final l75.e0 f239304J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f239305t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f239306u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239307v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239308w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239309x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239310y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239311z;
    public java.lang.String field_appId;
    public java.lang.String field_extInfo;
    public boolean field_isServerPatch;
    public java.lang.String field_newChannelApkPath;
    public int field_noticeId;
    public java.lang.String field_patchPath;
    public java.lang.String field_pkgName;
    public int field_scene;
    public int field_ssid;
    public long field_startTime;
    public int field_taskStatus;
    public int field_uiarea;
    public java.lang.String field_userSessionId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239312d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239313e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239314f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239315g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239316h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239317i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239318m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239319n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239320o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239321p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239322q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239323r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239324s = true;

    static {
        p75.n0 n0Var = new p75.n0("ApkChannelPatchInfo");
        f239305t = n0Var;
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
        f239306u = new java.lang.String[0];
        f239307v = -517940617;
        f239308w = 2111942459;
        f239309x = -513502067;
        f239310y = -795999330;
        f239311z = 969538007;
        A = 93028124;
        B = 109254796;
        C = 3539835;
        D = -845384415;
        E = 1585269267;
        F = -1306498449;
        G = -1723169082;
        H = -2129294769;
        I = 108705909;
        f239304J = initAutoDBInfo(dm.q.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "pkgName";
        e0Var.f316955d.put("pkgName", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "pkgName";
        e0Var.f316954c[1] = "isServerPatch";
        e0Var.f316955d.put("isServerPatch", "INTEGER default 'false' ");
        e0Var.f316954c[2] = "patchPath";
        e0Var.f316955d.put("patchPath", "TEXT");
        e0Var.f316954c[3] = "newChannelApkPath";
        e0Var.f316955d.put("newChannelApkPath", "TEXT");
        e0Var.f316954c[4] = "taskStatus";
        e0Var.f316955d.put("taskStatus", "INTEGER");
        e0Var.f316954c[5] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[6] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[7] = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID;
        e0Var.f316955d.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, "INTEGER");
        e0Var.f316954c[8] = "uiarea";
        e0Var.f316955d.put("uiarea", "INTEGER");
        e0Var.f316954c[9] = "noticeId";
        e0Var.f316955d.put("noticeId", "INTEGER");
        e0Var.f316954c[10] = "extInfo";
        e0Var.f316955d.put("extInfo", "TEXT");
        e0Var.f316954c[11] = "userSessionId";
        e0Var.f316955d.put("userSessionId", "TEXT");
        e0Var.f316954c[12] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " pkgName TEXT PRIMARY KEY ,  isServerPatch INTEGER default 'false' ,  patchPath TEXT,  newChannelApkPath TEXT,  taskStatus INTEGER,  appId TEXT,  scene INTEGER,  ssid INTEGER,  uiarea INTEGER,  noticeId INTEGER,  extInfo TEXT,  userSessionId TEXT,  startTime LONG";
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
            if (f239307v == hashCode) {
                try {
                    this.field_pkgName = cursor.getString(i17);
                    this.f239312d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239308w == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isServerPatch = z17;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239309x == hashCode) {
                try {
                    this.field_patchPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239310y == hashCode) {
                try {
                    this.field_newChannelApkPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239311z == hashCode) {
                try {
                    this.field_taskStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_ssid = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_uiarea = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_noticeId = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_extInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_userSessionId = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseApkChannelPatchInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239312d) {
            contentValues.put("pkgName", this.field_pkgName);
        }
        if (this.f239313e) {
            if (this.field_isServerPatch) {
                contentValues.put("isServerPatch", (java.lang.Integer) 1);
            } else {
                contentValues.put("isServerPatch", (java.lang.Integer) 0);
            }
        }
        if (this.f239314f) {
            contentValues.put("patchPath", this.field_patchPath);
        }
        if (this.f239315g) {
            contentValues.put("newChannelApkPath", this.field_newChannelApkPath);
        }
        if (this.f239316h) {
            contentValues.put("taskStatus", java.lang.Integer.valueOf(this.field_taskStatus));
        }
        if (this.f239317i) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239318m) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f239319n) {
            contentValues.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, java.lang.Integer.valueOf(this.field_ssid));
        }
        if (this.f239320o) {
            contentValues.put("uiarea", java.lang.Integer.valueOf(this.field_uiarea));
        }
        if (this.f239321p) {
            contentValues.put("noticeId", java.lang.Integer.valueOf(this.field_noticeId));
        }
        if (this.f239322q) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f239323r) {
            contentValues.put("userSessionId", this.field_userSessionId);
        }
        if (this.f239324s) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ApkChannelPatchInfo ( ");
        l75.e0 e0Var = f239304J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239306u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTableSql %s", str2);
            k0Var.A("ApkChannelPatchInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ApkChannelPatchInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "updateTableSql %s", str3);
            k0Var.A("ApkChannelPatchInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239304J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_pkgName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239305t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239305t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgName")) {
            this.field_pkgName = contentValues.getAsString("pkgName");
            if (z17) {
                this.f239312d = true;
            }
        }
        if (contentValues.containsKey("isServerPatch")) {
            this.field_isServerPatch = contentValues.getAsInteger("isServerPatch").intValue() != 0;
            if (z17) {
                this.f239313e = true;
            }
        }
        if (contentValues.containsKey("patchPath")) {
            this.field_patchPath = contentValues.getAsString("patchPath");
            if (z17) {
                this.f239314f = true;
            }
        }
        if (contentValues.containsKey("newChannelApkPath")) {
            this.field_newChannelApkPath = contentValues.getAsString("newChannelApkPath");
            if (z17) {
                this.f239315g = true;
            }
        }
        if (contentValues.containsKey("taskStatus")) {
            this.field_taskStatus = contentValues.getAsInteger("taskStatus").intValue();
            if (z17) {
                this.f239316h = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239317i = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f239318m = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID)) {
            this.field_ssid = contentValues.getAsInteger(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID).intValue();
            if (z17) {
                this.f239319n = true;
            }
        }
        if (contentValues.containsKey("uiarea")) {
            this.field_uiarea = contentValues.getAsInteger("uiarea").intValue();
            if (z17) {
                this.f239320o = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.field_noticeId = contentValues.getAsInteger("noticeId").intValue();
            if (z17) {
                this.f239321p = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z17) {
                this.f239322q = true;
            }
        }
        if (contentValues.containsKey("userSessionId")) {
            this.field_userSessionId = contentValues.getAsString("userSessionId");
            if (z17) {
                this.f239323r = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f239324s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
