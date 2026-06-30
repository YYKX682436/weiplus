package dm;

/* loaded from: classes4.dex */
public class y9 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f241235p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f241236q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241237r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241238s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241239t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241240u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f241241v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f241242w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241243x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241244y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241245z;
    public java.lang.String field_autologinwording;
    public long field_clientVersion;
    public long field_createtime;
    public java.lang.String field_devicetype;
    public boolean field_enableautologin;
    public java.lang.String field_name;
    public boolean field_online;
    public boolean field_supportautologin;
    public java.lang.String field_uid;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241246d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241247e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241248f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241249g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241250h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241251i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241252m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241253n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241254o = true;

    static {
        p75.n0 n0Var = new p75.n0("SafeDeviceInfo");
        f241235p = n0Var;
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
        f241236q = new java.lang.String[0];
        f241237r = 115792;
        f241238s = 3373707;
        f241239t = 782144144;
        f241240u = 1370166729;
        f241241v = -1012222381;
        f241242w = 771880589;
        f241243x = 1739826423;
        f241244y = 1225334827;
        f241245z = 842753086;
        A = 108705909;
        B = initAutoDBInfo(dm.y9.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "uid";
        e0Var.f316955d.put("uid", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "uid";
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "TEXT default '' ");
        e0Var.f316954c[2] = "devicetype";
        e0Var.f316955d.put("devicetype", "TEXT default '' ");
        e0Var.f316954c[3] = "createtime";
        e0Var.f316955d.put("createtime", "LONG default '0' ");
        e0Var.f316954c[4] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE, "INTEGER default 'false' ");
        e0Var.f316954c[5] = "clientVersion";
        e0Var.f316955d.put("clientVersion", "LONG default '0' ");
        e0Var.f316954c[6] = "enableautologin";
        e0Var.f316955d.put("enableautologin", "INTEGER default 'false' ");
        e0Var.f316954c[7] = "supportautologin";
        e0Var.f316955d.put("supportautologin", "INTEGER default 'false' ");
        e0Var.f316954c[8] = "autologinwording";
        e0Var.f316955d.put("autologinwording", "TEXT default '' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " uid TEXT default ''  PRIMARY KEY ,  name TEXT default '' ,  devicetype TEXT default '' ,  createtime LONG default '0' ,  online INTEGER default 'false' ,  clientVersion LONG default '0' ,  enableautologin INTEGER default 'false' ,  supportautologin INTEGER default 'false' ,  autologinwording TEXT default '' ";
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
            if (f241237r == hashCode) {
                try {
                    this.field_uid = cursor.getString(i17);
                    this.f241246d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241238s == hashCode) {
                try {
                    this.field_name = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241239t == hashCode) {
                try {
                    this.field_devicetype = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241240u == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241241v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_online = z17;
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241242w == hashCode) {
                try {
                    this.field_clientVersion = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241243x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_enableautologin = z17;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241244y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_supportautologin = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241245z == hashCode) {
                try {
                    this.field_autologinwording = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSafeDeviceInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_uid == null) {
            this.field_uid = "";
        }
        if (this.f241246d) {
            contentValues.put("uid", this.field_uid);
        }
        if (this.field_name == null) {
            this.field_name = "";
        }
        if (this.f241247e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.field_name);
        }
        if (this.field_devicetype == null) {
            this.field_devicetype = "";
        }
        if (this.f241248f) {
            contentValues.put("devicetype", this.field_devicetype);
        }
        if (this.f241249g) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        if (this.f241250h) {
            if (this.field_online) {
                contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE, (java.lang.Integer) 1);
            } else {
                contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE, (java.lang.Integer) 0);
            }
        }
        if (this.f241251i) {
            contentValues.put("clientVersion", java.lang.Long.valueOf(this.field_clientVersion));
        }
        if (this.f241252m) {
            if (this.field_enableautologin) {
                contentValues.put("enableautologin", (java.lang.Integer) 1);
            } else {
                contentValues.put("enableautologin", (java.lang.Integer) 0);
            }
        }
        if (this.f241253n) {
            if (this.field_supportautologin) {
                contentValues.put("supportautologin", (java.lang.Integer) 1);
            } else {
                contentValues.put("supportautologin", (java.lang.Integer) 0);
            }
        }
        if (this.field_autologinwording == null) {
            this.field_autologinwording = "";
        }
        if (this.f241254o) {
            contentValues.put("autologinwording", this.field_autologinwording);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SafeDeviceInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241236q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTableSql %s", str2);
            k0Var.A("SafeDeviceInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SafeDeviceInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "updateTableSql %s", str3);
            k0Var.A("SafeDeviceInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_uid;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241235p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241235p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("uid")) {
            this.field_uid = contentValues.getAsString("uid");
            if (z17) {
                this.f241246d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) {
            this.field_name = contentValues.getAsString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            if (z17) {
                this.f241247e = true;
            }
        }
        if (contentValues.containsKey("devicetype")) {
            this.field_devicetype = contentValues.getAsString("devicetype");
            if (z17) {
                this.f241248f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f241249g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE)) {
            this.field_online = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE).intValue() != 0;
            if (z17) {
                this.f241250h = true;
            }
        }
        if (contentValues.containsKey("clientVersion")) {
            this.field_clientVersion = contentValues.getAsLong("clientVersion").longValue();
            if (z17) {
                this.f241251i = true;
            }
        }
        if (contentValues.containsKey("enableautologin")) {
            this.field_enableautologin = contentValues.getAsInteger("enableautologin").intValue() != 0;
            if (z17) {
                this.f241252m = true;
            }
        }
        if (contentValues.containsKey("supportautologin")) {
            this.field_supportautologin = contentValues.getAsInteger("supportautologin").intValue() != 0;
            if (z17) {
                this.f241253n = true;
            }
        }
        if (contentValues.containsKey("autologinwording")) {
            this.field_autologinwording = contentValues.getAsString("autologinwording");
            if (z17) {
                this.f241254o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
