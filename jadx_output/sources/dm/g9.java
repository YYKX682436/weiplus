package dm;

/* loaded from: classes4.dex */
public class g9 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237174h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237175i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237176m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237177n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237178o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237179p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237180q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237181r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237182s;
    public java.lang.String field_key;
    public int field_scene;
    public long field_updateTime;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237183d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237184e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237185f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237186g = true;

    static {
        p75.n0 n0Var = new p75.n0("PkgUpdateStats");
        f237174h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237175i = new java.lang.String[0];
        f237176m = 106079;
        f237177n = 351608024;
        f237178o = 109254796;
        f237179p = -295931082;
        f237180q = 108705909;
        f237181r = initAutoDBInfo(dm.g9.class);
        f237182s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key TEXT,  version INTEGER,  scene INTEGER,  updateTime LONG";
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
            if (f237176m == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUpdateStats", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237177n == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUpdateStats", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237178o == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUpdateStats", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237179p == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePkgUpdateStats", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237180q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237183d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f237184e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f237185f) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f237186g) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePkgUpdateStats", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PkgUpdateStats ( ");
        l75.e0 e0Var = f237181r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237175i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "createTableSql %s", str2);
            k0Var.A("PkgUpdateStats", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PkgUpdateStats", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "updateTableSql %s", str3);
            k0Var.A("PkgUpdateStats", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237181r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237182s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237174h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237174h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f237183d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f237184e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f237185f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237186g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
