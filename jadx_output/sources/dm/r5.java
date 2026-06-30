package dm;

/* loaded from: classes4.dex */
public class r5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f239627f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f239628g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f239629h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239630i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239631m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f239632n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f239633o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239634d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239635e = true;
    public long field_consumeMsgId;
    public java.lang.String field_contentId;

    static {
        p75.n0 n0Var = new p75.n0("GameMsgRelativeContent");
        f239627f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239628g = new java.lang.String[0];
        f239629h = -407108748;
        f239630i = -874117664;
        f239631m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "contentId";
        ((java.util.HashMap) e0Var.f316955d).put("contentId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "contentId";
        e0Var.f316954c[1] = "consumeMsgId";
        ((java.util.HashMap) e0Var.f316955d).put("consumeMsgId", "LONG default '0' ");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " contentId TEXT PRIMARY KEY ,  consumeMsgId LONG default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239632n = e0Var;
        f239633o = new o75.e();
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
            if (f239629h == hashCode) {
                try {
                    this.field_contentId = cursor.getString(i17);
                    this.f239634d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameMsgRelativeContent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239630i == hashCode) {
                try {
                    this.field_consumeMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameMsgRelativeContent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239631m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239634d) {
            contentValues.put("contentId", this.field_contentId);
        }
        if (this.f239635e) {
            contentValues.put("consumeMsgId", java.lang.Long.valueOf(this.field_consumeMsgId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameMsgRelativeContent ( ");
        l75.e0 e0Var = f239632n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239628g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTableSql %s", str2);
            k0Var.A("GameMsgRelativeContent", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameMsgRelativeContent", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "updateTableSql %s", str3);
            k0Var.A("GameMsgRelativeContent", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239632n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239633o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_contentId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239627f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239627f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("contentId")) {
            this.field_contentId = contentValues.getAsString("contentId");
            if (z17) {
                this.f239634d = true;
            }
        }
        if (contentValues.containsKey("consumeMsgId")) {
            this.field_consumeMsgId = contentValues.getAsLong("consumeMsgId").longValue();
            if (z17) {
                this.f239635e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
