package dm;

/* loaded from: classes4.dex */
public class y5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241202f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241203g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241204h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241205i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241206m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241207n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241208o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241209d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241210e = true;
    public byte[] field_cache;
    public java.lang.String field_reqType;

    static {
        p75.n0 n0Var = new p75.n0("GetEmotionStoreRecListCache");
        f241202f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241203g = new java.lang.String[0];
        f241204h = 1094728952;
        f241205i = 94416770;
        f241206m = 108705909;
        f241207n = initAutoDBInfo(dm.y5.class);
        f241208o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "reqType";
        e0Var.f316955d.put("reqType", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "reqType";
        e0Var.f316954c[1] = "cache";
        e0Var.f316955d.put("cache", "BLOB default '' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " reqType TEXT PRIMARY KEY ,  cache BLOB default '' ";
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
            if (f241204h == hashCode) {
                try {
                    this.field_reqType = cursor.getString(i17);
                    this.f241209d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241205i == hashCode) {
                try {
                    this.field_cache = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241206m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241209d) {
            contentValues.put("reqType", this.field_reqType);
        }
        if (this.f241210e) {
            contentValues.put("cache", this.field_cache);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GetEmotionStoreRecListCache ( ");
        l75.e0 e0Var = f241207n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241203g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTableSql %s", str2);
            k0Var.A("GetEmotionStoreRecListCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GetEmotionStoreRecListCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "updateTableSql %s", str3);
            k0Var.A("GetEmotionStoreRecListCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241207n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241208o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_reqType;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241202f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241202f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reqType")) {
            this.field_reqType = contentValues.getAsString("reqType");
            if (z17) {
                this.f241209d = true;
            }
        }
        if (contentValues.containsKey("cache")) {
            this.field_cache = contentValues.getAsByteArray("cache");
            if (z17) {
                this.f241210e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
