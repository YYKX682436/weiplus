package dm;

/* loaded from: classes4.dex */
public class y1 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241158f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241159g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241160h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241161i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241162m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241163n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241164o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241165d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241166e = true;
    public java.lang.String field_chatRooms;
    public java.lang.String field_chatRoomsId;

    static {
        p75.n0 n0Var = new p75.n0("ChatRoomsInfo");
        f241158f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241159g = new java.lang.String[0];
        f241160h = -944384069;
        f241161i = 1607954048;
        f241162m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "chatRoomsId";
        ((java.util.HashMap) e0Var.f316955d).put("chatRoomsId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "chatRoomsId";
        e0Var.f316954c[1] = "chatRooms";
        ((java.util.HashMap) e0Var.f316955d).put("chatRooms", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " chatRoomsId TEXT PRIMARY KEY ,  chatRooms TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f241163n = e0Var;
        f241164o = new o75.e();
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
            if (f241160h == hashCode) {
                try {
                    this.field_chatRoomsId = cursor.getString(i17);
                    this.f241165d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241161i == hashCode) {
                try {
                    this.field_chatRooms = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241162m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241165d) {
            contentValues.put("chatRoomsId", this.field_chatRoomsId);
        }
        if (this.f241166e) {
            contentValues.put("chatRooms", this.field_chatRooms);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatRoomsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatRoomsInfo ( ");
        l75.e0 e0Var = f241163n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241159g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "createTableSql %s", str2);
            k0Var.A("ChatRoomsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ChatRoomsInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "updateTableSql %s", str3);
            k0Var.A("ChatRoomsInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241163n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241164o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_chatRoomsId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241158f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241158f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatRoomsId")) {
            this.field_chatRoomsId = contentValues.getAsString("chatRoomsId");
            if (z17) {
                this.f241165d = true;
            }
        }
        if (contentValues.containsKey("chatRooms")) {
            this.field_chatRooms = contentValues.getAsString("chatRooms");
            if (z17) {
                this.f241166e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
