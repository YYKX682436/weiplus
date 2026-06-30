package dm;

/* loaded from: classes8.dex */
public class o6 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f238949h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f238950i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238951m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238952n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238953o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238954p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238955q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f238956r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f238957s;
    public java.lang.String field_contactId;
    public java.lang.String field_sortKey;
    public java.lang.String field_systemAddressBookUsername;
    public java.lang.String field_wechatUsername;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238958d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238959e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238960f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238961g = true;

    static {
        p75.n0 n0Var = new p75.n0("IPCallAddressItem");
        f238949h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238950i = new java.lang.String[0];
        f238951m = 1094709788;
        f238952n = -929414588;
        f238953o = -411130533;
        f238954p = -2024610847;
        f238955q = 108705909;
        f238956r = initAutoDBInfo(dm.o6.class);
        f238957s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "wechatUsername";
        e0Var.f316955d.put("wechatUsername", "TEXT");
        e0Var.f316954c[1] = "systemAddressBookUsername";
        e0Var.f316955d.put("systemAddressBookUsername", "TEXT");
        e0Var.f316954c[2] = "contactId";
        e0Var.f316955d.put("contactId", "TEXT");
        e0Var.f316954c[3] = "sortKey";
        e0Var.f316955d.put("sortKey", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " wechatUsername TEXT,  systemAddressBookUsername TEXT,  contactId TEXT,  sortKey TEXT";
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
            if (f238951m == hashCode) {
                try {
                    this.field_wechatUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238952n == hashCode) {
                try {
                    this.field_systemAddressBookUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238953o == hashCode) {
                try {
                    this.field_contactId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238954p == hashCode) {
                try {
                    this.field_sortKey = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238955q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238958d) {
            contentValues.put("wechatUsername", this.field_wechatUsername);
        }
        if (this.f238959e) {
            contentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
        }
        if (this.f238960f) {
            contentValues.put("contactId", this.field_contactId);
        }
        if (this.f238961g) {
            contentValues.put("sortKey", this.field_sortKey);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseIPCallAddressItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallAddressItem ( ");
        l75.e0 e0Var = f238956r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238950i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallAddressItem", "createTableSql %s", str2);
            k0Var.A("IPCallAddressItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "IPCallAddressItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallAddressItem", "updateTableSql %s", str3);
            k0Var.A("IPCallAddressItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallAddressItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238956r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238957s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238949h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238949h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wechatUsername")) {
            this.field_wechatUsername = contentValues.getAsString("wechatUsername");
            if (z17) {
                this.f238958d = true;
            }
        }
        if (contentValues.containsKey("systemAddressBookUsername")) {
            this.field_systemAddressBookUsername = contentValues.getAsString("systemAddressBookUsername");
            if (z17) {
                this.f238959e = true;
            }
        }
        if (contentValues.containsKey("contactId")) {
            this.field_contactId = contentValues.getAsString("contactId");
            if (z17) {
                this.f238960f = true;
            }
        }
        if (contentValues.containsKey("sortKey")) {
            this.field_sortKey = contentValues.getAsString("sortKey");
            if (z17) {
                this.f238961g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
