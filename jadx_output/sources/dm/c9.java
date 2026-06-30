package dm;

/* loaded from: classes4.dex */
public class c9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f236188f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f236189g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f236190h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236191i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236192m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f236193n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f236194o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236195d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236196e = true;
    public java.lang.String field_cardUserId;
    public int field_retryCount;

    static {
        p75.n0 n0Var = new p75.n0("PendingCardId");
        f236188f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236189g = new java.lang.String[0];
        f236190h = 706349430;
        f236191i = -1163811001;
        f236192m = 108705909;
        f236193n = initAutoDBInfo(dm.c9.class);
        f236194o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "cardUserId";
        e0Var.f316955d.put("cardUserId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "cardUserId";
        e0Var.f316954c[1] = "retryCount";
        e0Var.f316955d.put("retryCount", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " cardUserId TEXT PRIMARY KEY ,  retryCount INTEGER";
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
            if (f236190h == hashCode) {
                try {
                    this.field_cardUserId = cursor.getString(i17);
                    this.f236195d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePendingCardId", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236191i == hashCode) {
                try {
                    this.field_retryCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePendingCardId", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236192m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236195d) {
            contentValues.put("cardUserId", this.field_cardUserId);
        }
        if (this.f236196e) {
            contentValues.put("retryCount", java.lang.Integer.valueOf(this.field_retryCount));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePendingCardId", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PendingCardId ( ");
        l75.e0 e0Var = f236193n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236189g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePendingCardId", "createTableSql %s", str2);
            k0Var.A("PendingCardId", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PendingCardId", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePendingCardId", "updateTableSql %s", str3);
            k0Var.A("PendingCardId", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePendingCardId", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236193n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236194o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_cardUserId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236188f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236188f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cardUserId")) {
            this.field_cardUserId = contentValues.getAsString("cardUserId");
            if (z17) {
                this.f236195d = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z17) {
                this.f236196e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
