package dm;

/* loaded from: classes9.dex */
public class a1 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f235544q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f235545r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235546s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235547t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235548u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235549v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235550w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235551x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235552y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235553z;
    public int field_UserVersion;
    public java.lang.String field_addMemberUrl;
    public int field_bitFlag;
    public java.lang.String field_brandUserName;
    public java.lang.String field_headImageUrl;
    public boolean field_needToUpdate;
    public java.lang.String field_profileUrl;
    public java.lang.String field_userId;
    public java.lang.String field_userName;
    public java.lang.String field_userNamePY;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235554d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235555e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235556f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235557g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235558h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235559i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235560m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235561n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235562o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235563p = true;

    static {
        p75.n0 n0Var = new p75.n0("BizChatUserInfo");
        f235544q = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235545r = new java.lang.String[0];
        f235546s = -836030906;
        f235547t = -266666762;
        f235548u = 1431282047;
        f235549v = -64277091;
        f235550w = 1717610093;
        f235551x = -178249254;
        f235552y = 697480212;
        f235553z = -1102645498;
        A = -103570919;
        B = 1204310228;
        C = 108705909;
        D = initAutoDBInfo(dm.a1.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "userId";
        e0Var.f316955d.put("userId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "userId";
        e0Var.f316954c[1] = "userName";
        e0Var.f316955d.put("userName", "TEXT default '' ");
        e0Var.f316954c[2] = "userNamePY";
        e0Var.f316955d.put("userNamePY", "TEXT default '' ");
        e0Var.f316954c[3] = "brandUserName";
        e0Var.f316955d.put("brandUserName", "TEXT default '' ");
        e0Var.f316954c[4] = "UserVersion";
        e0Var.f316955d.put("UserVersion", "INTEGER default '-1' ");
        e0Var.f316954c[5] = "needToUpdate";
        e0Var.f316955d.put("needToUpdate", "INTEGER default 'true' ");
        e0Var.f316954c[6] = "headImageUrl";
        e0Var.f316955d.put("headImageUrl", "TEXT");
        e0Var.f316954c[7] = "profileUrl";
        e0Var.f316955d.put("profileUrl", "TEXT");
        e0Var.f316954c[8] = "bitFlag";
        e0Var.f316955d.put("bitFlag", "INTEGER default '0' ");
        e0Var.f316954c[9] = "addMemberUrl";
        e0Var.f316955d.put("addMemberUrl", "TEXT");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " userId TEXT PRIMARY KEY ,  userName TEXT default '' ,  userNamePY TEXT default '' ,  brandUserName TEXT default '' ,  UserVersion INTEGER default '-1' ,  needToUpdate INTEGER default 'true' ,  headImageUrl TEXT,  profileUrl TEXT,  bitFlag INTEGER default '0' ,  addMemberUrl TEXT";
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
            if (f235546s == hashCode) {
                try {
                    this.field_userId = cursor.getString(i17);
                    this.f235554d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235547t == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235548u == hashCode) {
                try {
                    this.field_userNamePY = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235549v == hashCode) {
                try {
                    this.field_brandUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235550w == hashCode) {
                try {
                    this.field_UserVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235551x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_needToUpdate = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235552y == hashCode) {
                try {
                    this.field_headImageUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235553z == hashCode) {
                try {
                    this.field_profileUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_bitFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_addMemberUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235554d) {
            contentValues.put("userId", this.field_userId);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f235555e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_userNamePY == null) {
            this.field_userNamePY = "";
        }
        if (this.f235556f) {
            contentValues.put("userNamePY", this.field_userNamePY);
        }
        if (this.field_brandUserName == null) {
            this.field_brandUserName = "";
        }
        if (this.f235557g) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f235558h) {
            contentValues.put("UserVersion", java.lang.Integer.valueOf(this.field_UserVersion));
        }
        if (this.f235559i) {
            if (this.field_needToUpdate) {
                contentValues.put("needToUpdate", (java.lang.Integer) 1);
            } else {
                contentValues.put("needToUpdate", (java.lang.Integer) 0);
            }
        }
        if (this.f235560m) {
            contentValues.put("headImageUrl", this.field_headImageUrl);
        }
        if (this.f235561n) {
            contentValues.put("profileUrl", this.field_profileUrl);
        }
        if (this.f235562o) {
            contentValues.put("bitFlag", java.lang.Integer.valueOf(this.field_bitFlag));
        }
        if (this.f235563p) {
            contentValues.put("addMemberUrl", this.field_addMemberUrl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizChatUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatUserInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235545r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "createTableSql %s", str2);
            k0Var.A("BizChatUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizChatUserInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "updateTableSql %s", str3);
            k0Var.A("BizChatUserInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_userId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235544q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235544q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z17) {
                this.f235554d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f235555e = true;
            }
        }
        if (contentValues.containsKey("userNamePY")) {
            this.field_userNamePY = contentValues.getAsString("userNamePY");
            if (z17) {
                this.f235556f = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f235557g = true;
            }
        }
        if (contentValues.containsKey("UserVersion")) {
            this.field_UserVersion = contentValues.getAsInteger("UserVersion").intValue();
            if (z17) {
                this.f235558h = true;
            }
        }
        if (contentValues.containsKey("needToUpdate")) {
            this.field_needToUpdate = contentValues.getAsInteger("needToUpdate").intValue() != 0;
            if (z17) {
                this.f235559i = true;
            }
        }
        if (contentValues.containsKey("headImageUrl")) {
            this.field_headImageUrl = contentValues.getAsString("headImageUrl");
            if (z17) {
                this.f235560m = true;
            }
        }
        if (contentValues.containsKey("profileUrl")) {
            this.field_profileUrl = contentValues.getAsString("profileUrl");
            if (z17) {
                this.f235561n = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z17) {
                this.f235562o = true;
            }
        }
        if (contentValues.containsKey("addMemberUrl")) {
            this.field_addMemberUrl = contentValues.getAsString("addMemberUrl");
            if (z17) {
                this.f235563p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
