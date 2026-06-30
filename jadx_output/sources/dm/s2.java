package dm;

/* loaded from: classes4.dex */
public class s2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239788g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239789h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239790i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239791m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239792n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239793o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239794p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239795q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239796d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239797e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239798f = true;
    public int field_designerUin;
    public java.lang.String field_productId;
    public int field_syncTime;

    static {
        p75.n0 n0Var = new p75.n0("EmojiDesignerProduct");
        f239788g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239789h = new java.lang.String[0];
        f239790i = -897316497;
        f239791m = -1051830678;
        f239792n = 1816730632;
        f239793o = 108705909;
        f239794p = initAutoDBInfo(dm.s2.class);
        f239795q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "designerUin";
        e0Var.f316955d.put("designerUin", "INTEGER");
        e0Var.f316954c[1] = "productId";
        e0Var.f316955d.put("productId", "TEXT");
        e0Var.f316954c[2] = "syncTime";
        e0Var.f316955d.put("syncTime", "INTEGER");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " designerUin INTEGER,  productId TEXT,  syncTime INTEGER";
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
            if (f239790i == hashCode) {
                try {
                    this.field_designerUin = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239791m == hashCode) {
                try {
                    this.field_productId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239792n == hashCode) {
                try {
                    this.field_syncTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239793o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239796d) {
            contentValues.put("designerUin", java.lang.Integer.valueOf(this.field_designerUin));
        }
        if (this.f239797e) {
            contentValues.put("productId", this.field_productId);
        }
        if (this.f239798f) {
            contentValues.put("syncTime", java.lang.Integer.valueOf(this.field_syncTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiDesignerProduct ( ");
        l75.e0 e0Var = f239794p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239789h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTableSql %s", str2);
            k0Var.A("EmojiDesignerProduct", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmojiDesignerProduct", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "updateTableSql %s", str3);
            k0Var.A("EmojiDesignerProduct", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239794p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239795q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239788g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239788g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("designerUin")) {
            this.field_designerUin = contentValues.getAsInteger("designerUin").intValue();
            if (z17) {
                this.f239796d = true;
            }
        }
        if (contentValues.containsKey("productId")) {
            this.field_productId = contentValues.getAsString("productId");
            if (z17) {
                this.f239797e = true;
            }
        }
        if (contentValues.containsKey("syncTime")) {
            this.field_syncTime = contentValues.getAsInteger("syncTime").intValue();
            if (z17) {
                this.f239798f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
