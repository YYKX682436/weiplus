package dm;

/* loaded from: classes4.dex */
public class i9 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237645h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237646i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237647m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237648n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237649o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237650p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237651q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237652r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237653s;
    public java.lang.String field_appId;
    public int field_hit;
    public long field_hitTimeMS;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237654d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237655e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237656f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237657g = true;

    static {
        p75.n0 n0Var = new p75.n0("PluginCodeUsageLRURecord");
        f237645h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237646i = new java.lang.String[0];
        f237647m = 93028124;
        f237648n = 351608024;
        f237649o = 103315;
        f237650p = 1691165350;
        f237651q = 108705909;
        f237652r = initAutoDBInfo(dm.i9.class);
        f237653s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = "hit";
        e0Var.f316955d.put("hit", "INTEGER");
        e0Var.f316954c[3] = "hitTimeMS";
        e0Var.f316955d.put("hitTimeMS", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " appId TEXT,  version INTEGER,  hit INTEGER,  hitTimeMS LONG";
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
            if (f237647m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237648n == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237649o == hashCode) {
                try {
                    this.field_hit = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237650p == hashCode) {
                try {
                    this.field_hitTimeMS = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237651q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237654d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237655e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f237656f) {
            contentValues.put("hit", java.lang.Integer.valueOf(this.field_hit));
        }
        if (this.f237657g) {
            contentValues.put("hitTimeMS", java.lang.Long.valueOf(this.field_hitTimeMS));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PluginCodeUsageLRURecord ( ");
        l75.e0 e0Var = f237652r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237646i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTableSql %s", str2);
            k0Var.A("PluginCodeUsageLRURecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PluginCodeUsageLRURecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "updateTableSql %s", str3);
            k0Var.A("PluginCodeUsageLRURecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237652r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237653s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237645h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237645h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237654d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f237655e = true;
            }
        }
        if (contentValues.containsKey("hit")) {
            this.field_hit = contentValues.getAsInteger("hit").intValue();
            if (z17) {
                this.f237656f = true;
            }
        }
        if (contentValues.containsKey("hitTimeMS")) {
            this.field_hitTimeMS = contentValues.getAsLong("hitTimeMS").longValue();
            if (z17) {
                this.f237657g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
