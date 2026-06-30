package dm;

/* loaded from: classes4.dex */
public class b6 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f235871f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f235872g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f235873h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235874i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235875m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f235876n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f235877o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235878d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235879e = true;
    public byte[] field_BindAppData;
    public java.lang.String field_chatRoomName;

    static {
        p75.n0 n0Var = new p75.n0("GroupBindApp");
        f235871f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235872g = new java.lang.String[0];
        f235873h = 787786110;
        f235874i = 307311182;
        f235875m = 108705909;
        f235876n = initAutoDBInfo(dm.b6.class);
        f235877o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "chatRoomName";
        e0Var.f316955d.put("chatRoomName", "TEXT default '群username'  PRIMARY KEY ");
        e0Var.f316953b = "chatRoomName";
        e0Var.f316954c[1] = "BindAppData";
        e0Var.f316955d.put("BindAppData", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " chatRoomName TEXT default '群username'  PRIMARY KEY ,  BindAppData BLOB";
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
            if (f235873h == hashCode) {
                try {
                    this.field_chatRoomName = cursor.getString(i17);
                    this.f235878d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupBindApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235874i == hashCode) {
                try {
                    this.field_BindAppData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupBindApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235875m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_chatRoomName == null) {
            this.field_chatRoomName = "群username";
        }
        if (this.f235878d) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f235879e) {
            contentValues.put("BindAppData", this.field_BindAppData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGroupBindApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupBindApp ( ");
        l75.e0 e0Var = f235876n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235872g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupBindApp", "createTableSql %s", str2);
            k0Var.A("GroupBindApp", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GroupBindApp", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupBindApp", "updateTableSql %s", str3);
            k0Var.A("GroupBindApp", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupBindApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235876n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235877o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_chatRoomName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235871f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235871f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z17) {
                this.f235878d = true;
            }
        }
        if (contentValues.containsKey("BindAppData")) {
            this.field_BindAppData = contentValues.getAsByteArray("BindAppData");
            if (z17) {
                this.f235879e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
