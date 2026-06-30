package dm;

/* loaded from: classes4.dex */
public class p9 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f239218m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f239219n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239220o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239221p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239222q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239223r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239224s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239225t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239226u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f239227v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f239228w;
    public java.lang.String field_appId;
    public long field_endTime;
    public byte[] field_launchProtoBlob;
    public long field_reportId;
    public int field_scene;
    public long field_startTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239229d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239230e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239231f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239232g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239233h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239234i = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadIssueLaunchWxaAppResponse");
        f239218m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239219n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableStartTimeIndex ON PredownloadIssueLaunchWxaAppResponse(startTime)", "CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableEndTimeIndex ON PredownloadIssueLaunchWxaAppResponse(endTime)"};
        f239220o = 93028124;
        f239221p = 109254796;
        f239222q = -205344974;
        f239223r = -2129294769;
        f239224s = -1607243192;
        f239225t = -427040401;
        f239226u = 108705909;
        f239227v = initAutoDBInfo(dm.p9.class);
        f239228w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[2] = "launchProtoBlob";
        e0Var.f316955d.put("launchProtoBlob", "BLOB");
        e0Var.f316954c[3] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[4] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[5] = "reportId";
        e0Var.f316955d.put("reportId", "LONG");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " appId TEXT,  scene INTEGER,  launchProtoBlob BLOB,  startTime LONG,  endTime LONG,  reportId LONG";
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
            if (f239220o == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239221p == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239222q == hashCode) {
                try {
                    this.field_launchProtoBlob = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239223r == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239224s == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239225t == hashCode) {
                try {
                    this.field_reportId = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239226u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239229d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239230e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f239231f) {
            contentValues.put("launchProtoBlob", this.field_launchProtoBlob);
        }
        if (this.f239232g) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f239233h) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
        }
        if (this.f239234i) {
            contentValues.put("reportId", java.lang.Long.valueOf(this.field_reportId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadIssueLaunchWxaAppResponse ( ");
        l75.e0 e0Var = f239227v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239219n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTableSql %s", str2);
            k0Var.A("PredownloadIssueLaunchWxaAppResponse", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PredownloadIssueLaunchWxaAppResponse", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "updateTableSql %s", str3);
            k0Var.A("PredownloadIssueLaunchWxaAppResponse", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239227v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239228w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239218m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239218m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239229d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f239230e = true;
            }
        }
        if (contentValues.containsKey("launchProtoBlob")) {
            this.field_launchProtoBlob = contentValues.getAsByteArray("launchProtoBlob");
            if (z17) {
                this.f239231f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f239232g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f239233h = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsLong("reportId").longValue();
            if (z17) {
                this.f239234i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
