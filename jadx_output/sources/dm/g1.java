package dm;

/* loaded from: classes4.dex */
public class g1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237015g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f237016h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237017i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237018m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237019n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237020o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237021p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f237022q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f237023r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237024d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237025e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237026f = true;
    public java.lang.String field_bizUsername;
    public java.lang.String field_digest;
    public long field_updateTime;

    static {
        p75.n0 n0Var = new p75.n0("BizFollowedContactDigest");
        f237015g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237016h = new p75.d("bizUsername", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237017i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BizFansConversation_updateTime_index ON BizFollowedContactDigest(updateTime)"};
        f237018m = -833837303;
        f237019n = -295931082;
        f237020o = -1331913276;
        f237021p = 108705909;
        f237022q = initAutoDBInfo(dm.g1.class);
        f237023r = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "bizUsername";
        e0Var.f316955d.put("bizUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "bizUsername";
        e0Var.f316954c[1] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[2] = "digest";
        e0Var.f316955d.put("digest", "TEXT default '' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " bizUsername TEXT default ''  PRIMARY KEY ,  updateTime LONG default '0' ,  digest TEXT default '' ";
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
            if (f237018m == hashCode) {
                try {
                    this.field_bizUsername = cursor.getString(i17);
                    this.f237024d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFollowedContactDigest", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237019n == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFollowedContactDigest", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237020o == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizFollowedContactDigest", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237021p == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_bizUsername == null) {
            this.field_bizUsername = "";
        }
        if (this.f237024d) {
            contentValues.put("bizUsername", this.field_bizUsername);
        }
        if (this.f237025e) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f237026f) {
            contentValues.put("digest", this.field_digest);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFollowedContactDigest ( ");
        l75.e0 e0Var = f237022q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237017i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTableSql %s", str2);
            k0Var.A("BizFollowedContactDigest", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizFollowedContactDigest", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "updateTableSql %s", str3);
            k0Var.A("BizFollowedContactDigest", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237022q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237023r;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_bizUsername;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237015g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237015g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizUsername")) {
            this.field_bizUsername = contentValues.getAsString("bizUsername");
            if (z17) {
                this.f237024d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237025e = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f237026f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
