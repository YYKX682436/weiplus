package dm;

/* loaded from: classes4.dex */
public class t1 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f239999h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f240000i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240001m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240002n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240003o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240004p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240005q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f240006r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f240007s;
    public java.lang.String field_card_id;
    public java.lang.String field_code;
    public java.lang.String field_code_id;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240008d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240009e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240010f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240011g = true;

    static {
        p75.n0 n0Var = new p75.n0("CardQrCodeDataInfo");
        f239999h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240000i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)"};
        f240001m = 941842605;
        f240002n = 553933994;
        f240003o = 3059181;
        f240004p = -892481550;
        f240005q = 108705909;
        f240006r = initAutoDBInfo(dm.t1.class);
        f240007s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "code_id";
        e0Var.f316955d.put("code_id", "TEXT");
        e0Var.f316954c[1] = "card_id";
        e0Var.f316955d.put("card_id", "TEXT");
        e0Var.f316954c[2] = "code";
        e0Var.f316955d.put("code", "TEXT");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " code_id TEXT,  card_id TEXT,  code TEXT,  status INTEGER";
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
            if (f240001m == hashCode) {
                try {
                    this.field_code_id = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240002n == hashCode) {
                try {
                    this.field_card_id = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240003o == hashCode) {
                try {
                    this.field_code = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240004p == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240005q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240008d) {
            contentValues.put("code_id", this.field_code_id);
        }
        if (this.f240009e) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f240010f) {
            contentValues.put("code", this.field_code);
        }
        if (this.f240011g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CardQrCodeDataInfo ( ");
        l75.e0 e0Var = f240006r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240000i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTableSql %s", str2);
            k0Var.A("CardQrCodeDataInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CardQrCodeDataInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "updateTableSql %s", str3);
            k0Var.A("CardQrCodeDataInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240006r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240007s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239999h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239999h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("code_id")) {
            this.field_code_id = contentValues.getAsString("code_id");
            if (z17) {
                this.f240008d = true;
            }
        }
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z17) {
                this.f240009e = true;
            }
        }
        if (contentValues.containsKey("code")) {
            this.field_code = contentValues.getAsString("code");
            if (z17) {
                this.f240010f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f240011g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
