package dm;

/* loaded from: classes7.dex */
public class w5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f240807n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f240808o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240809p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240810q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240811r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240812s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240813t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240814u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240815v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240816w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f240817x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f240818y;
    public java.lang.String field_avatarURL;
    public java.lang.String field_compositionKey;
    public java.lang.String field_nickName;
    public int field_role;
    public java.lang.String field_roomName;
    public long field_updateTime;
    public java.lang.String field_userName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240819d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240820e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240821f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240822g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240823h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240824i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240825m = true;

    static {
        p75.n0 n0Var = new p75.n0("GameSimpleUserInfo");
        f240807n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240808o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_UserName ON GameSimpleUserInfo(userName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_RoomName ON GameSimpleUserInfo(roomName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_NickName ON GameSimpleUserInfo(nickName)"};
        f240809p = 33997909;
        f240810q = -266666762;
        f240811r = -173503994;
        f240812s = 69737614;
        f240813t = -428647082;
        f240814u = 3506294;
        f240815v = -295931082;
        f240816w = 108705909;
        f240817x = initAutoDBInfo(dm.w5.class);
        f240818y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "compositionKey";
        e0Var.f316955d.put("compositionKey", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "compositionKey";
        e0Var.f316954c[1] = "userName";
        e0Var.f316955d.put("userName", "TEXT default '' ");
        e0Var.f316954c[2] = "roomName";
        e0Var.f316955d.put("roomName", "TEXT default '' ");
        e0Var.f316954c[3] = "nickName";
        e0Var.f316955d.put("nickName", "TEXT default '' ");
        e0Var.f316954c[4] = "avatarURL";
        e0Var.f316955d.put("avatarURL", "TEXT default '' ");
        e0Var.f316954c[5] = "role";
        e0Var.f316955d.put("role", "INTEGER default '0' ");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " compositionKey TEXT default ''  PRIMARY KEY ,  userName TEXT default '' ,  roomName TEXT default '' ,  nickName TEXT default '' ,  avatarURL TEXT default '' ,  role INTEGER default '0' ,  updateTime LONG";
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
            if (f240809p == hashCode) {
                try {
                    this.field_compositionKey = cursor.getString(i17);
                    this.f240819d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240810q == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240811r == hashCode) {
                try {
                    this.field_roomName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240812s == hashCode) {
                try {
                    this.field_nickName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240813t == hashCode) {
                try {
                    this.field_avatarURL = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240814u == hashCode) {
                try {
                    this.field_role = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240815v == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240816w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_compositionKey == null) {
            this.field_compositionKey = "";
        }
        if (this.f240819d) {
            contentValues.put("compositionKey", this.field_compositionKey);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f240820e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_roomName == null) {
            this.field_roomName = "";
        }
        if (this.f240821f) {
            contentValues.put("roomName", this.field_roomName);
        }
        if (this.field_nickName == null) {
            this.field_nickName = "";
        }
        if (this.f240822g) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f240823h) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f240824i) {
            contentValues.put("role", java.lang.Integer.valueOf(this.field_role));
        }
        if (this.f240825m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameSimpleUserInfo ( ");
        l75.e0 e0Var = f240817x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240808o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTableSql %s", str2);
            k0Var.A("GameSimpleUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameSimpleUserInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "updateTableSql %s", str3);
            k0Var.A("GameSimpleUserInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240817x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240818y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_compositionKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240807n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240807n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("compositionKey")) {
            this.field_compositionKey = contentValues.getAsString("compositionKey");
            if (z17) {
                this.f240819d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f240820e = true;
            }
        }
        if (contentValues.containsKey("roomName")) {
            this.field_roomName = contentValues.getAsString("roomName");
            if (z17) {
                this.f240821f = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z17) {
                this.f240822g = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z17) {
                this.f240823h = true;
            }
        }
        if (contentValues.containsKey("role")) {
            this.field_role = contentValues.getAsInteger("role").intValue();
            if (z17) {
                this.f240824i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240825m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
