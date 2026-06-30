package dm;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f235767h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f235768i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235769m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235770n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235771o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235772p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235773q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f235774r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f235775s;
    public java.lang.String field_billNo;
    public boolean field_insertmsg;
    public long field_localMsgId;
    public int field_status;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235776d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235777e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235778f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235779g = true;

    static {
        p75.n0 n0Var = new p75.n0("AARecord");
        f235767h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235768i = new java.lang.String[0];
        f235769m = -1389017048;
        f235770n = -384451032;
        f235771o = 1287057361;
        f235772p = -892481550;
        f235773q = 108705909;
        f235774r = initAutoDBInfo(dm.b.class);
        f235775s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "billNo";
        e0Var.f316955d.put("billNo", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "billNo";
        e0Var.f316954c[1] = "insertmsg";
        e0Var.f316955d.put("insertmsg", "INTEGER");
        e0Var.f316954c[2] = "localMsgId";
        e0Var.f316955d.put("localMsgId", "LONG");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER default '-1' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " billNo TEXT PRIMARY KEY ,  insertmsg INTEGER,  localMsgId LONG,  status INTEGER default '-1' ";
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
            boolean z17 = true;
            if (f235769m == hashCode) {
                try {
                    this.field_billNo = cursor.getString(i17);
                    this.f235776d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235770n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_insertmsg = z17;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235771o == hashCode) {
                try {
                    this.field_localMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235772p == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235773q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235776d) {
            contentValues.put("billNo", this.field_billNo);
        }
        if (this.f235777e) {
            if (this.field_insertmsg) {
                contentValues.put("insertmsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("insertmsg", (java.lang.Integer) 0);
            }
        }
        if (this.f235778f) {
            contentValues.put("localMsgId", java.lang.Long.valueOf(this.field_localMsgId));
        }
        if (this.f235779g) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAARecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AARecord ( ");
        l75.e0 e0Var = f235774r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235768i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAARecord", "createTableSql %s", str2);
            k0Var.A("AARecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AARecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAARecord", "updateTableSql %s", str3);
            k0Var.A("AARecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAARecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235774r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235775s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_billNo;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235767h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235767h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("billNo")) {
            this.field_billNo = contentValues.getAsString("billNo");
            if (z17) {
                this.f235776d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.field_insertmsg = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z17) {
                this.f235777e = true;
            }
        }
        if (contentValues.containsKey("localMsgId")) {
            this.field_localMsgId = contentValues.getAsLong("localMsgId").longValue();
            if (z17) {
                this.f235778f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f235779g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
