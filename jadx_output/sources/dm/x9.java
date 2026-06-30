package dm;

/* loaded from: classes4.dex */
public class x9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241078f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241079g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241080h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241081i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241082m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241083n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241084o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241085d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241086e = true;
    public int field_orderIndex;
    public java.lang.String field_quickMsg;

    static {
        p75.n0 n0Var = new p75.n0("RtosQuickReplyInfo");
        f241078f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241079g = new java.lang.String[0];
        f241080h = 735908388;
        f241081i = -1066424748;
        f241082m = 108705909;
        f241083n = initAutoDBInfo(dm.x9.class);
        f241084o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "orderIndex";
        e0Var.f316955d.put("orderIndex", "INTEGER");
        e0Var.f316954c[1] = "quickMsg";
        e0Var.f316955d.put("quickMsg", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " orderIndex INTEGER,  quickMsg TEXT";
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
            if (f241080h == hashCode) {
                try {
                    this.field_orderIndex = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRtosQuickReplyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241081i == hashCode) {
                try {
                    this.field_quickMsg = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRtosQuickReplyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241082m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241085d) {
            contentValues.put("orderIndex", java.lang.Integer.valueOf(this.field_orderIndex));
        }
        if (this.f241086e) {
            contentValues.put("quickMsg", this.field_quickMsg);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RtosQuickReplyInfo ( ");
        l75.e0 e0Var = f241083n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241079g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTableSql %s", str2);
            k0Var.A("RtosQuickReplyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "RtosQuickReplyInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "updateTableSql %s", str3);
            k0Var.A("RtosQuickReplyInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241083n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241084o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241078f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241078f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("orderIndex")) {
            this.field_orderIndex = contentValues.getAsInteger("orderIndex").intValue();
            if (z17) {
                this.f241085d = true;
            }
        }
        if (contentValues.containsKey("quickMsg")) {
            this.field_quickMsg = contentValues.getAsString("quickMsg");
            if (z17) {
                this.f241086e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
