package dm;

/* loaded from: classes11.dex */
public class y0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f241137J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f241138v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f241139w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f241140x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f241141y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f241142z;
    public java.lang.String field_addMemberUrl;
    public int field_bitFlag;
    public long field_bizChatLocalId;
    public java.lang.String field_bizChatServId;
    public java.lang.String field_brandUserName;
    public java.lang.String field_chatName;
    public java.lang.String field_chatNamePY;
    public int field_chatType;
    public int field_chatVersion;
    public java.lang.String field_headImageUrl;
    public int field_maxMemberCnt;
    public boolean field_needToUpdate;
    public java.lang.String field_ownerUserId;
    public int field_roomflag;
    public java.lang.String field_userList;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241143d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241144e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241145f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241146g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241147h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241148i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241149m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241150n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241151o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241152p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241153q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241154r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241155s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241156t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241157u = true;

    static {
        p75.n0 n0Var = new p75.n0("BizChatInfo");
        f241138v = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241139w = new java.lang.String[0];
        f241140x = -497476517;
        f241141y = 2115249852;
        f241142z = -64277091;
        A = 1437412018;
        B = 697480212;
        C = 1437210115;
        D = -1820546228;
        E = -1972687264;
        F = -178249254;
        G = -103570919;
        H = -81097877;
        I = -190711079;
        f241137J = -266718455;
        K = 1204310228;
        L = -172778809;
        M = 108705909;
        N = initAutoDBInfo(dm.y0.class);
        P = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "bizChatLocalId";
        e0Var.f316955d.put("bizChatLocalId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "bizChatLocalId";
        e0Var.f316954c[1] = "bizChatServId";
        e0Var.f316955d.put("bizChatServId", "TEXT");
        e0Var.f316954c[2] = "brandUserName";
        e0Var.f316955d.put("brandUserName", "TEXT default '' ");
        e0Var.f316954c[3] = "chatType";
        e0Var.f316955d.put("chatType", "INTEGER");
        e0Var.f316954c[4] = "headImageUrl";
        e0Var.f316955d.put("headImageUrl", "TEXT");
        e0Var.f316954c[5] = "chatName";
        e0Var.f316955d.put("chatName", "TEXT default '' ");
        e0Var.f316954c[6] = "chatNamePY";
        e0Var.f316955d.put("chatNamePY", "TEXT default '' ");
        e0Var.f316954c[7] = "chatVersion";
        e0Var.f316955d.put("chatVersion", "INTEGER default '-1' ");
        e0Var.f316954c[8] = "needToUpdate";
        e0Var.f316955d.put("needToUpdate", "INTEGER default 'true' ");
        e0Var.f316954c[9] = "bitFlag";
        e0Var.f316955d.put("bitFlag", "INTEGER default '0' ");
        e0Var.f316954c[10] = "maxMemberCnt";
        e0Var.f316955d.put("maxMemberCnt", "INTEGER default '0' ");
        e0Var.f316954c[11] = "ownerUserId";
        e0Var.f316955d.put("ownerUserId", "TEXT");
        e0Var.f316954c[12] = "userList";
        e0Var.f316955d.put("userList", "TEXT");
        e0Var.f316954c[13] = "addMemberUrl";
        e0Var.f316955d.put("addMemberUrl", "TEXT");
        e0Var.f316954c[14] = "roomflag";
        e0Var.f316955d.put("roomflag", "INTEGER default '0' ");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " bizChatLocalId LONG PRIMARY KEY ,  bizChatServId TEXT,  brandUserName TEXT default '' ,  chatType INTEGER,  headImageUrl TEXT,  chatName TEXT default '' ,  chatNamePY TEXT default '' ,  chatVersion INTEGER default '-1' ,  needToUpdate INTEGER default 'true' ,  bitFlag INTEGER default '0' ,  maxMemberCnt INTEGER default '0' ,  ownerUserId TEXT,  userList TEXT,  addMemberUrl TEXT,  roomflag INTEGER default '0' ";
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
            if (f241140x == hashCode) {
                try {
                    this.field_bizChatLocalId = cursor.getLong(i17);
                    this.f241143d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241141y == hashCode) {
                try {
                    this.field_bizChatServId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241142z == hashCode) {
                try {
                    this.field_brandUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_chatType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_headImageUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_chatName = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_chatNamePY = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_chatVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_needToUpdate = z17;
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_bitFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_maxMemberCnt = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_ownerUserId = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241137J == hashCode) {
                try {
                    this.field_userList = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_addMemberUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_roomflag = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241143d) {
            contentValues.put("bizChatLocalId", java.lang.Long.valueOf(this.field_bizChatLocalId));
        }
        if (this.f241144e) {
            contentValues.put("bizChatServId", this.field_bizChatServId);
        }
        if (this.field_brandUserName == null) {
            this.field_brandUserName = "";
        }
        if (this.f241145f) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f241146g) {
            contentValues.put("chatType", java.lang.Integer.valueOf(this.field_chatType));
        }
        if (this.f241147h) {
            contentValues.put("headImageUrl", this.field_headImageUrl);
        }
        if (this.field_chatName == null) {
            this.field_chatName = "";
        }
        if (this.f241148i) {
            contentValues.put("chatName", this.field_chatName);
        }
        if (this.field_chatNamePY == null) {
            this.field_chatNamePY = "";
        }
        if (this.f241149m) {
            contentValues.put("chatNamePY", this.field_chatNamePY);
        }
        if (this.f241150n) {
            contentValues.put("chatVersion", java.lang.Integer.valueOf(this.field_chatVersion));
        }
        if (this.f241151o) {
            if (this.field_needToUpdate) {
                contentValues.put("needToUpdate", (java.lang.Integer) 1);
            } else {
                contentValues.put("needToUpdate", (java.lang.Integer) 0);
            }
        }
        if (this.f241152p) {
            contentValues.put("bitFlag", java.lang.Integer.valueOf(this.field_bitFlag));
        }
        if (this.f241153q) {
            contentValues.put("maxMemberCnt", java.lang.Integer.valueOf(this.field_maxMemberCnt));
        }
        if (this.f241154r) {
            contentValues.put("ownerUserId", this.field_ownerUserId);
        }
        if (this.f241155s) {
            contentValues.put("userList", this.field_userList);
        }
        if (this.f241156t) {
            contentValues.put("addMemberUrl", this.field_addMemberUrl);
        }
        if (this.f241157u) {
            contentValues.put("roomflag", java.lang.Integer.valueOf(this.field_roomflag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizChatInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatInfo ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241139w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatInfo", "createTableSql %s", str2);
            k0Var.A("BizChatInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizChatInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatInfo", "updateTableSql %s", str3);
            k0Var.A("BizChatInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizChatInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return N;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return P;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_bizChatLocalId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241138v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241138v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizChatLocalId")) {
            this.field_bizChatLocalId = contentValues.getAsLong("bizChatLocalId").longValue();
            if (z17) {
                this.f241143d = true;
            }
        }
        if (contentValues.containsKey("bizChatServId")) {
            this.field_bizChatServId = contentValues.getAsString("bizChatServId");
            if (z17) {
                this.f241144e = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f241145f = true;
            }
        }
        if (contentValues.containsKey("chatType")) {
            this.field_chatType = contentValues.getAsInteger("chatType").intValue();
            if (z17) {
                this.f241146g = true;
            }
        }
        if (contentValues.containsKey("headImageUrl")) {
            this.field_headImageUrl = contentValues.getAsString("headImageUrl");
            if (z17) {
                this.f241147h = true;
            }
        }
        if (contentValues.containsKey("chatName")) {
            this.field_chatName = contentValues.getAsString("chatName");
            if (z17) {
                this.f241148i = true;
            }
        }
        if (contentValues.containsKey("chatNamePY")) {
            this.field_chatNamePY = contentValues.getAsString("chatNamePY");
            if (z17) {
                this.f241149m = true;
            }
        }
        if (contentValues.containsKey("chatVersion")) {
            this.field_chatVersion = contentValues.getAsInteger("chatVersion").intValue();
            if (z17) {
                this.f241150n = true;
            }
        }
        if (contentValues.containsKey("needToUpdate")) {
            this.field_needToUpdate = contentValues.getAsInteger("needToUpdate").intValue() != 0;
            if (z17) {
                this.f241151o = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z17) {
                this.f241152p = true;
            }
        }
        if (contentValues.containsKey("maxMemberCnt")) {
            this.field_maxMemberCnt = contentValues.getAsInteger("maxMemberCnt").intValue();
            if (z17) {
                this.f241153q = true;
            }
        }
        if (contentValues.containsKey("ownerUserId")) {
            this.field_ownerUserId = contentValues.getAsString("ownerUserId");
            if (z17) {
                this.f241154r = true;
            }
        }
        if (contentValues.containsKey("userList")) {
            this.field_userList = contentValues.getAsString("userList");
            if (z17) {
                this.f241155s = true;
            }
        }
        if (contentValues.containsKey("addMemberUrl")) {
            this.field_addMemberUrl = contentValues.getAsString("addMemberUrl");
            if (z17) {
                this.f241156t = true;
            }
        }
        if (contentValues.containsKey("roomflag")) {
            this.field_roomflag = contentValues.getAsInteger("roomflag").intValue();
            if (z17) {
                this.f241157u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
