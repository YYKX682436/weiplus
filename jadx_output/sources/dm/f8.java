package dm;

/* loaded from: classes13.dex */
public class f8 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f236878q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f236879r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236880s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236881t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236882u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236883v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236884w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236885x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236886y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236887z;
    public long field_createTime;
    public java.lang.String field_groupId;
    public long field_ilinkRoomId;
    public java.lang.String field_inviteUserName;
    public int field_memberCount;
    public int field_roomId;
    public long field_roomKey;
    public int field_routeId;
    public int field_state;
    public java.lang.String field_wxGroupId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236888d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236889e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236890f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236891g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236892h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236893i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236894m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236895n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236896o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236897p = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTalkInfo");
        f236878q = n0Var;
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
        f236879r = new java.lang.String[0];
        f236880s = 303207897;
        f236881t = 293428218;
        f236882u = -925319338;
        f236883v = 1379873668;
        f236884w = 1385647428;
        f236885x = -500140257;
        f236886y = 1358063253;
        f236887z = 1369213417;
        A = 109757585;
        B = 1108625689;
        C = 108705909;
        D = initAutoDBInfo(dm.f8.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "wxGroupId";
        e0Var.f316955d.put("wxGroupId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "wxGroupId";
        e0Var.f316954c[1] = "groupId";
        e0Var.f316955d.put("groupId", "TEXT");
        e0Var.f316954c[2] = "roomId";
        e0Var.f316955d.put("roomId", "INTEGER");
        e0Var.f316954c[3] = "roomKey";
        e0Var.f316955d.put("roomKey", "LONG");
        e0Var.f316954c[4] = "routeId";
        e0Var.f316955d.put("routeId", "INTEGER");
        e0Var.f316954c[5] = "inviteUserName";
        e0Var.f316955d.put("inviteUserName", "TEXT");
        e0Var.f316954c[6] = "memberCount";
        e0Var.f316955d.put("memberCount", "INTEGER");
        e0Var.f316954c[7] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[8] = "state";
        e0Var.f316955d.put("state", "INTEGER default '0' ");
        e0Var.f316954c[9] = "ilinkRoomId";
        e0Var.f316955d.put("ilinkRoomId", "LONG");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " wxGroupId TEXT PRIMARY KEY ,  groupId TEXT,  roomId INTEGER,  roomKey LONG,  routeId INTEGER,  inviteUserName TEXT,  memberCount INTEGER,  createTime LONG,  state INTEGER default '0' ,  ilinkRoomId LONG";
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
            if (f236880s == hashCode) {
                try {
                    this.field_wxGroupId = cursor.getString(i17);
                    this.f236888d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236881t == hashCode) {
                try {
                    this.field_groupId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236882u == hashCode) {
                try {
                    this.field_roomId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236883v == hashCode) {
                try {
                    this.field_roomKey = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236884w == hashCode) {
                try {
                    this.field_routeId = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236885x == hashCode) {
                try {
                    this.field_inviteUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236886y == hashCode) {
                try {
                    this.field_memberCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236887z == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_ilinkRoomId = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f236888d) {
            contentValues.put("wxGroupId", this.field_wxGroupId);
        }
        if (this.f236889e) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f236890f) {
            contentValues.put("roomId", java.lang.Integer.valueOf(this.field_roomId));
        }
        if (this.f236891g) {
            contentValues.put("roomKey", java.lang.Long.valueOf(this.field_roomKey));
        }
        if (this.f236892h) {
            contentValues.put("routeId", java.lang.Integer.valueOf(this.field_routeId));
        }
        if (this.f236893i) {
            contentValues.put("inviteUserName", this.field_inviteUserName);
        }
        if (this.f236894m) {
            contentValues.put("memberCount", java.lang.Integer.valueOf(this.field_memberCount));
        }
        if (this.f236895n) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f236896o) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f236897p) {
            contentValues.put("ilinkRoomId", java.lang.Long.valueOf(this.field_ilinkRoomId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMultiTalkInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTalkInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236879r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "createTableSql %s", str2);
            k0Var.A("MultiTalkInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MultiTalkInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "updateTableSql %s", str3);
            k0Var.A("MultiTalkInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_wxGroupId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236878q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236878q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wxGroupId")) {
            this.field_wxGroupId = contentValues.getAsString("wxGroupId");
            if (z17) {
                this.f236888d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z17) {
                this.f236889e = true;
            }
        }
        if (contentValues.containsKey("roomId")) {
            this.field_roomId = contentValues.getAsInteger("roomId").intValue();
            if (z17) {
                this.f236890f = true;
            }
        }
        if (contentValues.containsKey("roomKey")) {
            this.field_roomKey = contentValues.getAsLong("roomKey").longValue();
            if (z17) {
                this.f236891g = true;
            }
        }
        if (contentValues.containsKey("routeId")) {
            this.field_routeId = contentValues.getAsInteger("routeId").intValue();
            if (z17) {
                this.f236892h = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.field_inviteUserName = contentValues.getAsString("inviteUserName");
            if (z17) {
                this.f236893i = true;
            }
        }
        if (contentValues.containsKey("memberCount")) {
            this.field_memberCount = contentValues.getAsInteger("memberCount").intValue();
            if (z17) {
                this.f236894m = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f236895n = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f236896o = true;
            }
        }
        if (contentValues.containsKey("ilinkRoomId")) {
            this.field_ilinkRoomId = contentValues.getAsLong("ilinkRoomId").longValue();
            if (z17) {
                this.f236897p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
