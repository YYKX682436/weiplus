package dm;

/* loaded from: classes4.dex */
public class l4 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238228i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238229m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238230n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238231o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238232p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238233q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238234r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238235s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f238236t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f238237u;
    public int field_freeTimeForLive;
    public int field_freeTimeForReplay;
    public int field_invalid;
    public long field_liveId;
    public int field_payForLive;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238238d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238239e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238240f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238241g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238242h = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveChargeInfo");
        f238228i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238229m = new java.lang.String[0];
        f238230n = -1102434521;
        f238231o = -370888772;
        f238232p = 226087607;
        f238233q = 1648787341;
        f238234r = 1959784951;
        f238235s = 108705909;
        f238236t = initAutoDBInfo(dm.l4.class);
        f238237u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        e0Var.f316955d.put("liveId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = "freeTimeForLive";
        e0Var.f316955d.put("freeTimeForLive", "INTEGER");
        e0Var.f316954c[2] = "freeTimeForReplay";
        e0Var.f316955d.put("freeTimeForReplay", "INTEGER");
        e0Var.f316954c[3] = "payForLive";
        e0Var.f316955d.put("payForLive", "INTEGER");
        e0Var.f316954c[4] = "invalid";
        e0Var.f316955d.put("invalid", "INTEGER");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " liveId LONG PRIMARY KEY ,  freeTimeForLive INTEGER,  freeTimeForReplay INTEGER,  payForLive INTEGER,  invalid INTEGER";
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
            if (f238230n == hashCode) {
                try {
                    this.field_liveId = cursor.getLong(i17);
                    this.f238238d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238231o == hashCode) {
                try {
                    this.field_freeTimeForLive = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238232p == hashCode) {
                try {
                    this.field_freeTimeForReplay = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238233q == hashCode) {
                try {
                    this.field_payForLive = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238234r == hashCode) {
                try {
                    this.field_invalid = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238235s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238238d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.field_liveId));
        }
        if (this.f238239e) {
            contentValues.put("freeTimeForLive", java.lang.Integer.valueOf(this.field_freeTimeForLive));
        }
        if (this.f238240f) {
            contentValues.put("freeTimeForReplay", java.lang.Integer.valueOf(this.field_freeTimeForReplay));
        }
        if (this.f238241g) {
            contentValues.put("payForLive", java.lang.Integer.valueOf(this.field_payForLive));
        }
        if (this.f238242h) {
            contentValues.put("invalid", java.lang.Integer.valueOf(this.field_invalid));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveChargeInfo ( ");
        l75.e0 e0Var = f238236t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238229m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveChargeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveChargeInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveChargeInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238236t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238237u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_liveId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238228i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238228i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f238238d = true;
            }
        }
        if (contentValues.containsKey("freeTimeForLive")) {
            this.field_freeTimeForLive = contentValues.getAsInteger("freeTimeForLive").intValue();
            if (z17) {
                this.f238239e = true;
            }
        }
        if (contentValues.containsKey("freeTimeForReplay")) {
            this.field_freeTimeForReplay = contentValues.getAsInteger("freeTimeForReplay").intValue();
            if (z17) {
                this.f238240f = true;
            }
        }
        if (contentValues.containsKey("payForLive")) {
            this.field_payForLive = contentValues.getAsInteger("payForLive").intValue();
            if (z17) {
                this.f238241g = true;
            }
        }
        if (contentValues.containsKey("invalid")) {
            this.field_invalid = contentValues.getAsInteger("invalid").intValue();
            if (z17) {
                this.f238242h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
