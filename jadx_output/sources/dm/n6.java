package dm;

/* loaded from: classes4.dex */
public class n6 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f238699f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f238700g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f238701h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238702i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238703m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f238704n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f238705o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238706d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238707e = true;
    public long field_msgId;
    public java.lang.String field_payMsgId;

    static {
        p75.n0 n0Var = new p75.n0("HoneyPayMsgRecord");
        f238699f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238700g = new java.lang.String[0];
        f238701h = 1353538740;
        f238702i = 104191100;
        f238703m = 108705909;
        f238704n = initAutoDBInfo(dm.n6.class);
        f238705o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "payMsgId";
        e0Var.f316955d.put("payMsgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "payMsgId";
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " payMsgId TEXT PRIMARY KEY ,  msgId LONG";
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
            if (f238701h == hashCode) {
                try {
                    this.field_payMsgId = cursor.getString(i17);
                    this.f238706d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHoneyPayMsgRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238702i == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHoneyPayMsgRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238703m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238706d) {
            contentValues.put("payMsgId", this.field_payMsgId);
        }
        if (this.f238707e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HoneyPayMsgRecord ( ");
        l75.e0 e0Var = f238704n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238700g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTableSql %s", str2);
            k0Var.A("HoneyPayMsgRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HoneyPayMsgRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "updateTableSql %s", str3);
            k0Var.A("HoneyPayMsgRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238704n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238705o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_payMsgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238699f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238699f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("payMsgId")) {
            this.field_payMsgId = contentValues.getAsString("payMsgId");
            if (z17) {
                this.f238706d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f238707e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
