package dm;

/* loaded from: classes4.dex */
public class a3 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f235581g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f235582h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235583i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235584m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235585n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235586o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f235587p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f235588q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235589d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235590e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235591f = true;
    public byte[] field_content;
    public java.lang.String field_lan;
    public java.lang.String field_productID;

    static {
        p75.n0 n0Var = new p75.n0("EmotionDetailInfo");
        f235581g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235582h = new java.lang.String[0];
        f235583i = -1051830710;
        f235584m = 951530617;
        f235585n = 106905;
        f235586o = 108705909;
        f235587p = initAutoDBInfo(dm.a3.class);
        f235588q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "productID";
        e0Var.f316955d.put("productID", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "productID";
        e0Var.f316954c[1] = "content";
        e0Var.f316955d.put("content", "BLOB default '' ");
        e0Var.f316954c[2] = "lan";
        e0Var.f316955d.put("lan", "TEXT default '' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " productID TEXT PRIMARY KEY ,  content BLOB default '' ,  lan TEXT default '' ";
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
            if (f235583i == hashCode) {
                try {
                    this.field_productID = cursor.getString(i17);
                    this.f235589d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235584m == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235585n == hashCode) {
                try {
                    this.field_lan = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235586o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235589d) {
            contentValues.put("productID", this.field_productID);
        }
        if (this.f235590e) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_lan == null) {
            this.field_lan = "";
        }
        if (this.f235591f) {
            contentValues.put("lan", this.field_lan);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmotionDetailInfo ( ");
        l75.e0 e0Var = f235587p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235582h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTableSql %s", str2);
            k0Var.A("EmotionDetailInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmotionDetailInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "updateTableSql %s", str3);
            k0Var.A("EmotionDetailInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235587p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235588q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_productID;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235581g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235581g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productID")) {
            this.field_productID = contentValues.getAsString("productID");
            if (z17) {
                this.f235589d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.f235590e = true;
            }
        }
        if (contentValues.containsKey("lan")) {
            this.field_lan = contentValues.getAsString("lan");
            if (z17) {
                this.f235591f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
