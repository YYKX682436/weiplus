package dm;

/* loaded from: classes8.dex */
public class i1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f237504m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f237505n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237506o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237507p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237508q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237509r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237510s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237511t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237512u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f237513v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f237514w;
    public java.lang.String field_brandUsername;
    public java.lang.String field_headImgUrl;
    public int field_kfType;
    public java.lang.String field_nickname;
    public java.lang.String field_openId;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237515d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237516e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237517f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237518g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237519h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237520i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizKF");
        f237504m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237505n = new java.lang.String[0];
        f237506o = -1010580219;
        f237507p = -63323779;
        f237508q = 1171836076;
        f237509r = 70690926;
        f237510s = -1134826699;
        f237511t = -295931082;
        f237512u = 108705909;
        f237513v = initAutoDBInfo(dm.i1.class);
        f237514w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "openId";
        e0Var.f316955d.put("openId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "openId";
        e0Var.f316954c[1] = "brandUsername";
        e0Var.f316955d.put("brandUsername", "TEXT default '' ");
        e0Var.f316954c[2] = "headImgUrl";
        e0Var.f316955d.put("headImgUrl", "TEXT");
        e0Var.f316954c[3] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[4] = "kfType";
        e0Var.f316955d.put("kfType", "INTEGER");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " openId TEXT PRIMARY KEY ,  brandUsername TEXT default '' ,  headImgUrl TEXT,  nickname TEXT,  kfType INTEGER,  updateTime LONG";
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
            if (f237506o == hashCode) {
                try {
                    this.field_openId = cursor.getString(i17);
                    this.f237515d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237507p == hashCode) {
                try {
                    this.field_brandUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237508q == hashCode) {
                try {
                    this.field_headImgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237509r == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237510s == hashCode) {
                try {
                    this.field_kfType = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237511t == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizKF", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237512u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237515d) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.field_brandUsername == null) {
            this.field_brandUsername = "";
        }
        if (this.f237516e) {
            contentValues.put("brandUsername", this.field_brandUsername);
        }
        if (this.f237517f) {
            contentValues.put("headImgUrl", this.field_headImgUrl);
        }
        if (this.f237518g) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f237519h) {
            contentValues.put("kfType", java.lang.Integer.valueOf(this.field_kfType));
        }
        if (this.f237520i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizKF", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizKF ( ");
        l75.e0 e0Var = f237513v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237505n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizKF", "createTableSql %s", str2);
            k0Var.A("BizKF", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizKF", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizKF", "updateTableSql %s", str3);
            k0Var.A("BizKF", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizKF", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237513v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237514w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_openId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237504m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237504m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z17) {
                this.f237515d = true;
            }
        }
        if (contentValues.containsKey("brandUsername")) {
            this.field_brandUsername = contentValues.getAsString("brandUsername");
            if (z17) {
                this.f237516e = true;
            }
        }
        if (contentValues.containsKey("headImgUrl")) {
            this.field_headImgUrl = contentValues.getAsString("headImgUrl");
            if (z17) {
                this.f237517f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f237518g = true;
            }
        }
        if (contentValues.containsKey("kfType")) {
            this.field_kfType = contentValues.getAsInteger("kfType").intValue();
            if (z17) {
                this.f237519h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237520i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
