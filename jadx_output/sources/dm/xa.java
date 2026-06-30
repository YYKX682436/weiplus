package dm;

/* loaded from: classes4.dex */
public class xa extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f241087h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f241088i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241089m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241090n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241091o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241092p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241093q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f241094r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f241095s;
    public int field_count;
    public java.lang.String field_memberList;
    public long field_tagId;
    public java.lang.String field_tagName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241096d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241097e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241098f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241099g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsTagInfo");
        f241087h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241088i = new java.lang.String[0];
        f241089m = 110119509;
        f241090n = -1549184699;
        f241091o = 94851343;
        f241092p = -1341402536;
        f241093q = 108705909;
        f241094r = initAutoDBInfo(dm.xa.class);
        f241095s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "tagId";
        e0Var.f316955d.put("tagId", "LONG default '0' ");
        e0Var.f316954c[1] = "tagName";
        e0Var.f316955d.put("tagName", "TEXT default '' ");
        e0Var.f316954c[2] = "count";
        e0Var.f316955d.put("count", "INTEGER default '0' ");
        e0Var.f316954c[3] = "memberList";
        e0Var.f316955d.put("memberList", "TEXT default '' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " tagId LONG default '0' ,  tagName TEXT default '' ,  count INTEGER default '0' ,  memberList TEXT default '' ";
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
            if (f241089m == hashCode) {
                try {
                    this.field_tagId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241090n == hashCode) {
                try {
                    this.field_tagName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241091o == hashCode) {
                try {
                    this.field_count = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241092p == hashCode) {
                try {
                    this.field_memberList = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241093q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241096d) {
            contentValues.put("tagId", java.lang.Long.valueOf(this.field_tagId));
        }
        if (this.field_tagName == null) {
            this.field_tagName = "";
        }
        if (this.f241097e) {
            contentValues.put("tagName", this.field_tagName);
        }
        if (this.f241098f) {
            contentValues.put("count", java.lang.Integer.valueOf(this.field_count));
        }
        if (this.field_memberList == null) {
            this.field_memberList = "";
        }
        if (this.f241099g) {
            contentValues.put("memberList", this.field_memberList);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsTagInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsTagInfo ( ");
        l75.e0 e0Var = f241094r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241088i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "createTableSql %s", str2);
            k0Var.A("SnsTagInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsTagInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "updateTableSql %s", str3);
            k0Var.A("SnsTagInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241094r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241095s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241087h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241087h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tagId")) {
            this.field_tagId = contentValues.getAsLong("tagId").longValue();
            if (z17) {
                this.f241096d = true;
            }
        }
        if (contentValues.containsKey("tagName")) {
            this.field_tagName = contentValues.getAsString("tagName");
            if (z17) {
                this.f241097e = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.field_count = contentValues.getAsInteger("count").intValue();
            if (z17) {
                this.f241098f = true;
            }
        }
        if (contentValues.containsKey("memberList")) {
            this.field_memberList = contentValues.getAsString("memberList");
            if (z17) {
                this.f241099g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
