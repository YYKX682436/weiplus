package dm;

/* loaded from: classes7.dex */
public class j7 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f237822s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f237823t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237824u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237825v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237826w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237827x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237828y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237829z;
    public r45.t1 field_actionsheetInfo;
    public java.lang.String field_appId;
    public int field_appIdHash;
    public long field_expiredAtTimestampSeconds;
    public r45.mc7 field_hostInfo;
    public r45.b10 field_jsapiInfo;
    public r45.o54 field_launchAction;
    public java.lang.String field_opConfig;
    public java.lang.String field_openId;
    public r45.d25 field_operationInfo;
    public boolean field_showThirdBusiTips;
    public r45.s54 field_switchList;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237830d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237831e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237832f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237833g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237834h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237835i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237836m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237837n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237838o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237839p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237840q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237841r = true;

    static {
        p75.n0 n0Var = new p75.n0("LaunchWxaAppRespTable");
        f237822s = n0Var;
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
        f237823t = new java.lang.String[0];
        f237824u = 1197524554;
        f237825v = 93028124;
        f237826w = 583187401;
        f237827x = -557656961;
        f237828y = -300893578;
        f237829z = -2033677001;
        A = 91660981;
        B = -1476341629;
        C = -1033321759;
        D = -1010580219;
        E = -1146722485;
        F = -347528718;
        G = 108705909;
        H = initAutoDBInfo(dm.j7.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "appIdHash";
        e0Var.f316955d.put("appIdHash", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "appIdHash";
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "launchAction";
        e0Var.f316955d.put("launchAction", "BLOB");
        e0Var.f316954c[3] = "jsapiInfo";
        e0Var.f316955d.put("jsapiInfo", "BLOB");
        e0Var.f316954c[4] = "hostInfo";
        e0Var.f316955d.put("hostInfo", "BLOB");
        e0Var.f316954c[5] = "actionsheetInfo";
        e0Var.f316955d.put("actionsheetInfo", "BLOB");
        e0Var.f316954c[6] = "operationInfo";
        e0Var.f316955d.put("operationInfo", "BLOB");
        e0Var.f316954c[7] = "opConfig";
        e0Var.f316955d.put("opConfig", "TEXT");
        e0Var.f316954c[8] = "expiredAtTimestampSeconds";
        e0Var.f316955d.put("expiredAtTimestampSeconds", "LONG");
        e0Var.f316954c[9] = "openId";
        e0Var.f316955d.put("openId", "TEXT");
        e0Var.f316954c[10] = "showThirdBusiTips";
        e0Var.f316955d.put("showThirdBusiTips", "INTEGER default 'false' ");
        e0Var.f316954c[11] = "switchList";
        e0Var.f316955d.put("switchList", "BLOB");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " appIdHash INTEGER PRIMARY KEY ,  appId TEXT,  launchAction BLOB,  jsapiInfo BLOB,  hostInfo BLOB,  actionsheetInfo BLOB,  operationInfo BLOB,  opConfig TEXT,  expiredAtTimestampSeconds LONG,  openId TEXT,  showThirdBusiTips INTEGER default 'false' ,  switchList BLOB";
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
            if (f237824u == hashCode) {
                try {
                    this.field_appIdHash = cursor.getInt(i17);
                    this.f237830d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237825v == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237826w == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_launchAction = (r45.o54) new r45.o54().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237827x == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_jsapiInfo = (r45.b10) new r45.b10().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237828y == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.field_hostInfo = (r45.mc7) new r45.mc7().parseFrom(blob3);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237829z == hashCode) {
                try {
                    byte[] blob4 = cursor.getBlob(i17);
                    if (blob4 != null && blob4.length > 0) {
                        this.field_actionsheetInfo = (r45.t1) new r45.t1().parseFrom(blob4);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob5 = cursor.getBlob(i17);
                    if (blob5 != null && blob5.length > 0) {
                        this.field_operationInfo = (r45.d25) new r45.d25().parseFrom(blob5);
                    }
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_opConfig = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_expiredAtTimestampSeconds = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_openId = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_showThirdBusiTips = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    byte[] blob6 = cursor.getBlob(i17);
                    if (blob6 != null && blob6.length > 0) {
                        this.field_switchList = (r45.s54) new r45.s54().parseFrom(blob6);
                    }
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237830d) {
            contentValues.put("appIdHash", java.lang.Integer.valueOf(this.field_appIdHash));
        }
        if (this.f237831e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237832f) {
            r45.o54 o54Var = this.field_launchAction;
            if (o54Var != null) {
                try {
                    contentValues.put("launchAction", o54Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e17.getMessage());
                }
            } else {
                contentValues.put("launchAction", (byte[]) null);
            }
        }
        if (this.f237833g) {
            r45.b10 b10Var = this.field_jsapiInfo;
            if (b10Var != null) {
                try {
                    contentValues.put("jsapiInfo", b10Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e18.getMessage());
                }
            } else {
                contentValues.put("jsapiInfo", (byte[]) null);
            }
        }
        if (this.f237834h) {
            r45.mc7 mc7Var = this.field_hostInfo;
            if (mc7Var != null) {
                try {
                    contentValues.put("hostInfo", mc7Var.toByteArray());
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e19.getMessage());
                }
            } else {
                contentValues.put("hostInfo", (byte[]) null);
            }
        }
        if (this.f237835i) {
            r45.t1 t1Var = this.field_actionsheetInfo;
            if (t1Var != null) {
                try {
                    contentValues.put("actionsheetInfo", t1Var.toByteArray());
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e27.getMessage());
                }
            } else {
                contentValues.put("actionsheetInfo", (byte[]) null);
            }
        }
        if (this.f237836m) {
            r45.d25 d25Var = this.field_operationInfo;
            if (d25Var != null) {
                try {
                    contentValues.put("operationInfo", d25Var.toByteArray());
                } catch (java.io.IOException e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e28.getMessage());
                }
            } else {
                contentValues.put("operationInfo", (byte[]) null);
            }
        }
        if (this.f237837n) {
            contentValues.put("opConfig", this.field_opConfig);
        }
        if (this.f237838o) {
            contentValues.put("expiredAtTimestampSeconds", java.lang.Long.valueOf(this.field_expiredAtTimestampSeconds));
        }
        if (this.f237839p) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.f237840q) {
            if (this.field_showThirdBusiTips) {
                contentValues.put("showThirdBusiTips", (java.lang.Integer) 1);
            } else {
                contentValues.put("showThirdBusiTips", (java.lang.Integer) 0);
            }
        }
        if (this.f237841r) {
            r45.s54 s54Var = this.field_switchList;
            if (s54Var != null) {
                try {
                    contentValues.put("switchList", s54Var.toByteArray());
                } catch (java.io.IOException e29) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e29.getMessage());
                }
            } else {
                contentValues.put("switchList", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LaunchWxaAppRespTable ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237823t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTableSql %s", str2);
            k0Var.A("LaunchWxaAppRespTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LaunchWxaAppRespTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "updateTableSql %s", str3);
            k0Var.A("LaunchWxaAppRespTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_appIdHash);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237822s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237822s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appIdHash")) {
            this.field_appIdHash = contentValues.getAsInteger("appIdHash").intValue();
            if (z17) {
                this.f237830d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237831e = true;
            }
        }
        if (contentValues.containsKey("launchAction")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("launchAction");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_launchAction = (r45.o54) new r45.o54().parseFrom(asByteArray);
                    if (z17) {
                        this.f237832f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e17.getMessage());
            }
        }
        if (contentValues.containsKey("jsapiInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("jsapiInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_jsapiInfo = (r45.b10) new r45.b10().parseFrom(asByteArray2);
                    if (z17) {
                        this.f237833g = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e18.getMessage());
            }
        }
        if (contentValues.containsKey("hostInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("hostInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_hostInfo = (r45.mc7) new r45.mc7().parseFrom(asByteArray3);
                    if (z17) {
                        this.f237834h = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e19.getMessage());
            }
        }
        if (contentValues.containsKey("actionsheetInfo")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("actionsheetInfo");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_actionsheetInfo = (r45.t1) new r45.t1().parseFrom(asByteArray4);
                    if (z17) {
                        this.f237835i = true;
                    }
                }
            } catch (java.io.IOException e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e27.getMessage());
            }
        }
        if (contentValues.containsKey("operationInfo")) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray("operationInfo");
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_operationInfo = (r45.d25) new r45.d25().parseFrom(asByteArray5);
                    if (z17) {
                        this.f237836m = true;
                    }
                }
            } catch (java.io.IOException e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e28.getMessage());
            }
        }
        if (contentValues.containsKey("opConfig")) {
            this.field_opConfig = contentValues.getAsString("opConfig");
            if (z17) {
                this.f237837n = true;
            }
        }
        if (contentValues.containsKey("expiredAtTimestampSeconds")) {
            this.field_expiredAtTimestampSeconds = contentValues.getAsLong("expiredAtTimestampSeconds").longValue();
            if (z17) {
                this.f237838o = true;
            }
        }
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z17) {
                this.f237839p = true;
            }
        }
        if (contentValues.containsKey("showThirdBusiTips")) {
            this.field_showThirdBusiTips = contentValues.getAsInteger("showThirdBusiTips").intValue() != 0;
            if (z17) {
                this.f237840q = true;
            }
        }
        if (contentValues.containsKey("switchList")) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray("switchList");
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.field_switchList = (r45.s54) new r45.s54().parseFrom(asByteArray6);
                    if (z17) {
                        this.f237841r = true;
                    }
                }
            } catch (java.io.IOException e29) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e29.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
