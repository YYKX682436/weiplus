package dm;

/* loaded from: classes4.dex */
public class q3 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239384f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.d f239385g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f239386h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f239387i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239388m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239389n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239390o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239391p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239392q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239393d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239394e = true;
    public int field_id;
    public java.lang.String field_name;

    static {
        p75.n0 n0Var = new p75.n0("FavTagInfo");
        f239384f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239385g = new p75.d(dm.i4.COL_ID, "int", tableName, "");
        f239386h = new p75.d(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "string", tableName, "");
        f239387i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavTagInfo_id ON FavTagInfo(id)", "CREATE INDEX IF NOT EXISTS FavTagInfo_name ON FavTagInfo(name)"};
        f239388m = 3355;
        f239389n = 3373707;
        f239390o = 108705909;
        f239391p = initAutoDBInfo(dm.q3.class);
        f239392q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "INTEGER");
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " id INTEGER,  name TEXT";
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
            if (f239388m == hashCode) {
                try {
                    this.field_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavTagInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239389n == hashCode) {
                try {
                    this.field_name = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavTagInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239390o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239393d) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
        }
        if (this.f239394e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.field_name);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavTagInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavTagInfo ( ");
        l75.e0 e0Var = f239391p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239387i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavTagInfo", "createTableSql %s", str2);
            k0Var.A("FavTagInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavTagInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavTagInfo", "updateTableSql %s", str3);
            k0Var.A("FavTagInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavTagInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239391p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239392q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239384f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239384f.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
            n51.f.b(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.field_name);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsInteger(dm.i4.COL_ID).intValue();
            if (z17) {
                this.f239393d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) {
            this.field_name = contentValues.getAsString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            if (z17) {
                this.f239394e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
