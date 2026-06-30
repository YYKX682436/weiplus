package dm;

/* loaded from: classes4.dex */
public class j4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237777f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237778g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237779h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237780i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237781m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237782n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237783o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237784d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237785e = true;
    public java.lang.String field_actionTag;
    public long field_actionTime;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveActionRecord");
        f237777f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237778g = new java.lang.String[0];
        f237779h = 198284676;
        f237780i = 1851865635;
        f237781m = 108705909;
        f237782n = initAutoDBInfo(dm.j4.class);
        f237783o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "actionTag";
        e0Var.f316955d.put("actionTag", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "actionTag";
        e0Var.f316954c[1] = "actionTime";
        e0Var.f316955d.put("actionTime", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " actionTag TEXT PRIMARY KEY ,  actionTime LONG";
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
            if (f237779h == hashCode) {
                try {
                    this.field_actionTag = cursor.getString(i17);
                    this.f237784d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveActionRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237780i == hashCode) {
                try {
                    this.field_actionTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveActionRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237781m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237784d) {
            contentValues.put("actionTag", this.field_actionTag);
        }
        if (this.f237785e) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.field_actionTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveActionRecord ( ");
        l75.e0 e0Var = f237782n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237778g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTableSql %s", str2);
            k0Var.A("FinderLiveActionRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveActionRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "updateTableSql %s", str3);
            k0Var.A("FinderLiveActionRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237782n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237783o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_actionTag;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237777f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237777f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("actionTag")) {
            this.field_actionTag = contentValues.getAsString("actionTag");
            if (z17) {
                this.f237784d = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f237785e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
