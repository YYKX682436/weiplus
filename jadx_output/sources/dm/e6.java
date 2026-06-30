package dm;

/* loaded from: classes4.dex */
public class e6 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236635h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236636i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236637m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236638n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236639o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236640p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236641q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236642r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236643s;
    public java.lang.String field_chatroomname;
    public int field_queryState;
    public java.lang.String field_recentUseToolList;
    public java.lang.String field_stickToollist;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236644d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236645e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236646f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236647g = true;

    static {
        p75.n0 n0Var = new p75.n0("GroupTools");
        f236635h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236636i = new java.lang.String[0];
        f236637m = 724095294;
        f236638n = -311541018;
        f236639o = 880484258;
        f236640p = -179242839;
        f236641q = 108705909;
        f236642r = initAutoDBInfo(dm.e6.class);
        f236643s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "chatroomname";
        e0Var.f316955d.put("chatroomname", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "chatroomname";
        e0Var.f316954c[1] = "stickToollist";
        e0Var.f316955d.put("stickToollist", "TEXT");
        e0Var.f316954c[2] = "recentUseToolList";
        e0Var.f316955d.put("recentUseToolList", "TEXT");
        e0Var.f316954c[3] = "queryState";
        e0Var.f316955d.put("queryState", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " chatroomname TEXT PRIMARY KEY ,  stickToollist TEXT,  recentUseToolList TEXT,  queryState INTEGER";
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
            if (f236637m == hashCode) {
                try {
                    this.field_chatroomname = cursor.getString(i17);
                    this.f236644d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236638n == hashCode) {
                try {
                    this.field_stickToollist = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236639o == hashCode) {
                try {
                    this.field_recentUseToolList = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236640p == hashCode) {
                try {
                    this.field_queryState = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTools", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236641q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236644d) {
            contentValues.put("chatroomname", this.field_chatroomname);
        }
        if (this.f236645e) {
            contentValues.put("stickToollist", this.field_stickToollist);
        }
        if (this.f236646f) {
            contentValues.put("recentUseToolList", this.field_recentUseToolList);
        }
        if (this.f236647g) {
            contentValues.put("queryState", java.lang.Integer.valueOf(this.field_queryState));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGroupTools", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupTools ( ");
        l75.e0 e0Var = f236642r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236636i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTools", "createTableSql %s", str2);
            k0Var.A("GroupTools", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GroupTools", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTools", "updateTableSql %s", str3);
            k0Var.A("GroupTools", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTools", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236642r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236643s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_chatroomname;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236635h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236635h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatroomname")) {
            this.field_chatroomname = contentValues.getAsString("chatroomname");
            if (z17) {
                this.f236644d = true;
            }
        }
        if (contentValues.containsKey("stickToollist")) {
            this.field_stickToollist = contentValues.getAsString("stickToollist");
            if (z17) {
                this.f236645e = true;
            }
        }
        if (contentValues.containsKey("recentUseToolList")) {
            this.field_recentUseToolList = contentValues.getAsString("recentUseToolList");
            if (z17) {
                this.f236646f = true;
            }
        }
        if (contentValues.containsKey("queryState")) {
            this.field_queryState = contentValues.getAsInteger("queryState").intValue();
            if (z17) {
                this.f236647g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
