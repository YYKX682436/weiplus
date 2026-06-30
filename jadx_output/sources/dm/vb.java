package dm;

/* loaded from: classes4.dex */
public class vb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240646i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240647m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240648n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240649o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240650p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240651q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240652r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240653s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240654t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240655u;
    public java.lang.String field_avatar;
    public int field_avatarStyle;
    public java.lang.String field_nickname;
    public java.lang.String field_userJumpInfoStr;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240656d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240657e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240658f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240659g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240660h = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wContact");
        f240646i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240647m = new java.lang.String[0];
        f240648n = -265713450;
        f240649o = -1405959847;
        f240650p = 70690926;
        f240651q = 386227160;
        f240652r = 691449290;
        f240653s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "avatar";
        ((java.util.HashMap) e0Var.f316955d).put("avatar", "TEXT default '' ");
        e0Var.f316954c[2] = "nickname";
        ((java.util.HashMap) e0Var.f316955d).put("nickname", "TEXT default '' ");
        e0Var.f316954c[3] = "avatarStyle";
        ((java.util.HashMap) e0Var.f316955d).put("avatarStyle", "INTEGER default '0' ");
        e0Var.f316954c[4] = "userJumpInfoStr";
        ((java.util.HashMap) e0Var.f316955d).put("userJumpInfoStr", "TEXT default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  avatar TEXT default '' ,  nickname TEXT default '' ,  avatarStyle INTEGER default '0' ,  userJumpInfoStr TEXT default '' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f240654t = e0Var;
        f240655u = new o75.e();
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
            if (f240648n == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f240656d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240649o == hashCode) {
                try {
                    this.field_avatar = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240650p == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240651q == hashCode) {
                try {
                    this.field_avatarStyle = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240652r == hashCode) {
                try {
                    this.field_userJumpInfoStr = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseW1wContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240653s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f240656d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.field_avatar == null) {
            this.field_avatar = "";
        }
        if (this.f240657e) {
            contentValues.put("avatar", this.field_avatar);
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f240658f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f240659g) {
            contentValues.put("avatarStyle", java.lang.Integer.valueOf(this.field_avatarStyle));
        }
        if (this.field_userJumpInfoStr == null) {
            this.field_userJumpInfoStr = "";
        }
        if (this.f240660h) {
            contentValues.put("userJumpInfoStr", this.field_userJumpInfoStr);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseW1wContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wContact ( ");
        l75.e0 e0Var = f240654t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240647m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wContact", "createTableSql %s", str2);
            k0Var.A("W1wContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "W1wContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wContact", "updateTableSql %s", str3);
            k0Var.A("W1wContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseW1wContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240654t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240655u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240646i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240646i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f240656d = true;
            }
        }
        if (contentValues.containsKey("avatar")) {
            this.field_avatar = contentValues.getAsString("avatar");
            if (z17) {
                this.f240657e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f240658f = true;
            }
        }
        if (contentValues.containsKey("avatarStyle")) {
            this.field_avatarStyle = contentValues.getAsInteger("avatarStyle").intValue();
            if (z17) {
                this.f240659g = true;
            }
        }
        if (contentValues.containsKey("userJumpInfoStr")) {
            this.field_userJumpInfoStr = contentValues.getAsString("userJumpInfoStr");
            if (z17) {
                this.f240660h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
