package dm;

/* loaded from: classes4.dex */
public class z9 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f241521m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f241522n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241523o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241524p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241525q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241526r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241527s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241528t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241529u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f241530v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f241531w;
    public long field_ScanTime;
    public int field_funcType;
    public java.lang.String field_productId;
    public java.lang.String field_qrcodeUrl;
    public int field_scene;
    public java.lang.String field_xmlContent;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241532d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241533e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241534f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241535g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241536h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241537i = true;

    static {
        p75.n0 n0Var = new p75.n0("ScanHistoryItem");
        f241521m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241522n = new java.lang.String[0];
        f241523o = -1051830678;
        f241524p = 310314082;
        f241525q = -825857270;
        f241526r = 1380000798;
        f241527s = -325175551;
        f241528t = 109254796;
        f241529u = 108705909;
        f241530v = initAutoDBInfo(dm.z9.class);
        f241531w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "productId";
        e0Var.f316955d.put("productId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "productId";
        e0Var.f316954c[1] = "xmlContent";
        e0Var.f316955d.put("xmlContent", "TEXT");
        e0Var.f316954c[2] = "ScanTime";
        e0Var.f316955d.put("ScanTime", "LONG");
        e0Var.f316954c[3] = "funcType";
        e0Var.f316955d.put("funcType", "INTEGER");
        e0Var.f316954c[4] = "qrcodeUrl";
        e0Var.f316955d.put("qrcodeUrl", "TEXT");
        e0Var.f316954c[5] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " productId TEXT PRIMARY KEY ,  xmlContent TEXT,  ScanTime LONG,  funcType INTEGER,  qrcodeUrl TEXT,  scene INTEGER";
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
            if (f241523o == hashCode) {
                try {
                    this.field_productId = cursor.getString(i17);
                    this.f241532d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241524p == hashCode) {
                try {
                    this.field_xmlContent = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241525q == hashCode) {
                try {
                    this.field_ScanTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241526r == hashCode) {
                try {
                    this.field_funcType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241527s == hashCode) {
                try {
                    this.field_qrcodeUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241528t == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseScanHistoryItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241529u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241532d) {
            contentValues.put("productId", this.field_productId);
        }
        if (this.f241533e) {
            contentValues.put("xmlContent", this.field_xmlContent);
        }
        if (this.f241534f) {
            contentValues.put("ScanTime", java.lang.Long.valueOf(this.field_ScanTime));
        }
        if (this.f241535g) {
            contentValues.put("funcType", java.lang.Integer.valueOf(this.field_funcType));
        }
        if (this.f241536h) {
            contentValues.put("qrcodeUrl", this.field_qrcodeUrl);
        }
        if (this.f241537i) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseScanHistoryItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ScanHistoryItem ( ");
        l75.e0 e0Var = f241530v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241522n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "createTableSql %s", str2);
            k0Var.A("ScanHistoryItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ScanHistoryItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "updateTableSql %s", str3);
            k0Var.A("ScanHistoryItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241530v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241531w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_productId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241521m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241521m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productId")) {
            this.field_productId = contentValues.getAsString("productId");
            if (z17) {
                this.f241532d = true;
            }
        }
        if (contentValues.containsKey("xmlContent")) {
            this.field_xmlContent = contentValues.getAsString("xmlContent");
            if (z17) {
                this.f241533e = true;
            }
        }
        if (contentValues.containsKey("ScanTime")) {
            this.field_ScanTime = contentValues.getAsLong("ScanTime").longValue();
            if (z17) {
                this.f241534f = true;
            }
        }
        if (contentValues.containsKey("funcType")) {
            this.field_funcType = contentValues.getAsInteger("funcType").intValue();
            if (z17) {
                this.f241535g = true;
            }
        }
        if (contentValues.containsKey("qrcodeUrl")) {
            this.field_qrcodeUrl = contentValues.getAsString("qrcodeUrl");
            if (z17) {
                this.f241536h = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f241537i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
