package dm;

/* loaded from: classes4.dex */
public class k4 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f237988i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f237989m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f237990n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237991o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237992p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237993q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237994r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237995s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237996t;

    /* renamed from: u, reason: collision with root package name */
    public static final l75.e0 f237997u;

    /* renamed from: v, reason: collision with root package name */
    public static final o75.e f237998v;
    public int field_badgeDismissed;
    public int field_notificationShown;
    public java.lang.String field_productId;
    public int field_status;
    public java.lang.String field_submissionId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237999d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238000e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238001f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238002g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238003h = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveAigcGiftStatus");
        f237988i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237989m = new p75.d("productId", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237990n = new java.lang.String[0];
        f237991o = -1051830678;
        f237992p = 1335140743;
        f237993q = -892481550;
        f237994r = -1583356186;
        f237995s = -1579012026;
        f237996t = 108705909;
        f237997u = initAutoDBInfo(dm.k4.class);
        f237998v = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "productId";
        e0Var.f316955d.put("productId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "productId";
        e0Var.f316954c[1] = "submissionId";
        e0Var.f316955d.put("submissionId", "TEXT default '' ");
        e0Var.f316954c[2] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[3] = "notificationShown";
        e0Var.f316955d.put("notificationShown", "INTEGER default '0' ");
        e0Var.f316954c[4] = "badgeDismissed";
        e0Var.f316955d.put("badgeDismissed", "INTEGER default '0' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " productId TEXT PRIMARY KEY ,  submissionId TEXT default '' ,  status INTEGER default '0' ,  notificationShown INTEGER default '0' ,  badgeDismissed INTEGER default '0' ";
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
            if (f237991o == hashCode) {
                try {
                    this.field_productId = cursor.getString(i17);
                    this.f237999d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237992p == hashCode) {
                try {
                    this.field_submissionId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237993q == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237994r == hashCode) {
                try {
                    this.field_notificationShown = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237995s == hashCode) {
                try {
                    this.field_badgeDismissed = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237996t == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237999d) {
            contentValues.put("productId", this.field_productId);
        }
        if (this.field_submissionId == null) {
            this.field_submissionId = "";
        }
        if (this.f238000e) {
            contentValues.put("submissionId", this.field_submissionId);
        }
        if (this.f238001f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f238002g) {
            contentValues.put("notificationShown", java.lang.Integer.valueOf(this.field_notificationShown));
        }
        if (this.f238003h) {
            contentValues.put("badgeDismissed", java.lang.Integer.valueOf(this.field_badgeDismissed));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveAigcGiftStatus ( ");
        l75.e0 e0Var = f237997u;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237990n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTableSql %s", str2);
            k0Var.A("FinderLiveAigcGiftStatus", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveAigcGiftStatus", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "updateTableSql %s", str3);
            k0Var.A("FinderLiveAigcGiftStatus", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237997u;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237998v;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_productId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237988i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237988i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productId")) {
            this.field_productId = contentValues.getAsString("productId");
            if (z17) {
                this.f237999d = true;
            }
        }
        if (contentValues.containsKey("submissionId")) {
            this.field_submissionId = contentValues.getAsString("submissionId");
            if (z17) {
                this.f238000e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f238001f = true;
            }
        }
        if (contentValues.containsKey("notificationShown")) {
            this.field_notificationShown = contentValues.getAsInteger("notificationShown").intValue();
            if (z17) {
                this.f238002g = true;
            }
        }
        if (contentValues.containsKey("badgeDismissed")) {
            this.field_badgeDismissed = contentValues.getAsInteger("badgeDismissed").intValue();
            if (z17) {
                this.f238003h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
