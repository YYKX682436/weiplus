package dm;

/* loaded from: classes4.dex */
public class i6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237590g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f237591h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237592i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237593m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237594n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237595o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237596p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237597q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237598d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237599e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237600f = true;
    public java.lang.String field_appusername;
    public int field_score;
    public java.lang.String field_title;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceProfileRankDetail");
        f237590g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237591h = new java.lang.String[0];
        f237592i = 417550839;
        f237593m = 110371416;
        f237594n = 109264530;
        f237595o = 108705909;
        f237596p = initAutoDBInfo(dm.i6.class);
        f237597q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appusername";
        e0Var.f316955d.put("appusername", "TEXT");
        e0Var.f316954c[1] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[2] = ya.b.SCORE;
        e0Var.f316955d.put(ya.b.SCORE, "INTEGER");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appusername TEXT,  title TEXT,  score INTEGER";
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
            if (f237592i == hashCode) {
                try {
                    this.field_appusername = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237593m == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237594n == hashCode) {
                try {
                    this.field_score = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237595o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237598d) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f237599e) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f237600f) {
            contentValues.put(ya.b.SCORE, java.lang.Integer.valueOf(this.field_score));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceProfileRankDetail ( ");
        l75.e0 e0Var = f237596p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237591h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTableSql %s", str2);
            k0Var.A("HardDeviceProfileRankDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceProfileRankDetail", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "updateTableSql %s", str3);
            k0Var.A("HardDeviceProfileRankDetail", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237596p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237597q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237590g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237590g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z17) {
                this.f237598d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f237599e = true;
            }
        }
        if (contentValues.containsKey(ya.b.SCORE)) {
            this.field_score = contentValues.getAsInteger(ya.b.SCORE).intValue();
            if (z17) {
                this.f237600f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
