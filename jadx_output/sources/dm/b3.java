package dm;

/* loaded from: classes4.dex */
public class b3 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f235829f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f235830g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f235831h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235832i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235833m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f235834n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f235835o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235836d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235837e = true;
    public byte[] field_content;
    public java.lang.String field_productID;

    static {
        p75.n0 n0Var = new p75.n0("EmotionRewardInfo");
        f235829f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235830g = new java.lang.String[0];
        f235831h = -1051830710;
        f235832i = 951530617;
        f235833m = 108705909;
        f235834n = initAutoDBInfo(dm.b3.class);
        f235835o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "productID";
        e0Var.f316955d.put("productID", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "productID";
        e0Var.f316954c[1] = "content";
        e0Var.f316955d.put("content", "BLOB default '' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " productID TEXT PRIMARY KEY ,  content BLOB default '' ";
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
            if (f235831h == hashCode) {
                try {
                    this.field_productID = cursor.getString(i17);
                    this.f235836d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235832i == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235833m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235836d) {
            contentValues.put("productID", this.field_productID);
        }
        if (this.f235837e) {
            contentValues.put("content", this.field_content);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmotionRewardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmotionRewardInfo ( ");
        l75.e0 e0Var = f235834n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235830g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionRewardInfo", "createTableSql %s", str2);
            k0Var.A("EmotionRewardInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmotionRewardInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionRewardInfo", "updateTableSql %s", str3);
            k0Var.A("EmotionRewardInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionRewardInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235834n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235835o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_productID;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235829f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235829f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productID")) {
            this.field_productID = contentValues.getAsString("productID");
            if (z17) {
                this.f235836d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f235837e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
