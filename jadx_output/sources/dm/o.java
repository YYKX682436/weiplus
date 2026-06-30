package dm;

/* loaded from: classes4.dex */
public class o extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f238831g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f238832h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238833i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238834m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238835n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238836o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f238837p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f238838q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238839d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238840e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238841f = true;
    public int field_scene;
    public java.lang.String field_ticket;
    public java.lang.String field_userName;

    static {
        p75.n0 n0Var = new p75.n0("AddContactAntispamTicket");
        f238831g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238832h = new java.lang.String[0];
        f238833i = -266666762;
        f238834m = 109254796;
        f238835n = -873960692;
        f238836o = 108705909;
        f238837p = initAutoDBInfo(dm.o.class);
        f238838q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        e0Var.f316955d.put("userName", "TEXT");
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[2] = "ticket";
        e0Var.f316955d.put("ticket", "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " userName TEXT,  scene INTEGER,  ticket TEXT";
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
            if (f238833i == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238834m == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238835n == hashCode) {
                try {
                    this.field_ticket = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238836o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238839d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f238840e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f238841f) {
            contentValues.put("ticket", this.field_ticket);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AddContactAntispamTicket ( ");
        l75.e0 e0Var = f238837p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238832h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTableSql %s", str2);
            k0Var.A("AddContactAntispamTicket", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AddContactAntispamTicket", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "updateTableSql %s", str3);
            k0Var.A("AddContactAntispamTicket", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238837p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238838q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238831g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238831g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f238839d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f238840e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z17) {
                this.f238841f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
