package dm;

/* loaded from: classes4.dex */
public class y2 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241167f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241168g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241169h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241170i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241171m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241172n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241173o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241174d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241175e = true;
    public java.lang.String field_desc;
    public java.lang.String field_groupID;

    static {
        p75.n0 n0Var = new p75.n0("EmojiSuggestDescInfo");
        f241167f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241168g = new java.lang.String[0];
        f241169h = 293428186;
        f241170i = 3079825;
        f241171m = 108705909;
        f241172n = initAutoDBInfo(dm.y2.class);
        f241173o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "groupID";
        e0Var.f316955d.put("groupID", "TEXT");
        e0Var.f316954c[1] = "desc";
        e0Var.f316955d.put("desc", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " groupID TEXT,  desc TEXT";
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
            if (f241169h == hashCode) {
                try {
                    this.field_groupID = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestDescInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241170i == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestDescInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241171m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241174d) {
            contentValues.put("groupID", this.field_groupID);
        }
        if (this.f241175e) {
            contentValues.put("desc", this.field_desc);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiSuggestDescInfo ( ");
        l75.e0 e0Var = f241172n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241168g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTableSql %s", str2);
            k0Var.A("EmojiSuggestDescInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmojiSuggestDescInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "updateTableSql %s", str3);
            k0Var.A("EmojiSuggestDescInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241172n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241173o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241167f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241167f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("groupID")) {
            this.field_groupID = contentValues.getAsString("groupID");
            if (z17) {
                this.f241174d = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f241175e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
