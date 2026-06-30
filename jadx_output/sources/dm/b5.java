package dm;

/* loaded from: classes10.dex */
public class b5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final l75.e0 I;

    /* renamed from: J, reason: collision with root package name */
    public static final o75.e f235850J;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f235851s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f235852t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f235853u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235854v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235855w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235856x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235857y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235858z;
    public int field_actionPermission;
    public int field_disableSendMsg;
    public boolean field_disableSendmsgNeedFollow;
    public int field_followFlag;
    public int field_rejectMsg;
    public java.lang.String field_selfUsername;
    public int field_senderRoleType;
    public java.lang.String field_senderUserName;
    public java.lang.String field_sessionId;
    public java.lang.String field_talker;
    public int field_type;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235859d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235860e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235861f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235862g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235863h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235864i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235865m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235866n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235867o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235868p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235869q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235870r = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderSessionInfo");
        f235851s = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235852t = new p75.d("selfUsername", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235853u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderSessionInfo_sessionId_index ON FinderSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_talker_index ON FinderSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_selfUsername_index ON FinderSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_type_index ON FinderSessionInfo(type)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_senderUserName_index ON FinderSessionInfo(senderUserName)"};
        f235854v = 607796817;
        f235855w = -881080743;
        f235856x = -295931082;
        f235857y = 1229697090;
        f235858z = 3575610;
        A = 211768485;
        B = -1683545246;
        C = -740052271;
        D = 1667659339;
        E = 1667748389;
        F = -2027458883;
        G = 141309368;
        H = 108705909;
        I = initAutoDBInfo(dm.b5.class);
        f235850J = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG default '0' ");
        e0Var.f316954c[3] = "selfUsername";
        e0Var.f316955d.put("selfUsername", "TEXT default '' ");
        e0Var.f316954c[4] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[5] = "actionPermission";
        e0Var.f316955d.put("actionPermission", "INTEGER");
        e0Var.f316954c[6] = "rejectMsg";
        e0Var.f316955d.put("rejectMsg", "INTEGER");
        e0Var.f316954c[7] = "disableSendMsg";
        e0Var.f316955d.put("disableSendMsg", "INTEGER");
        e0Var.f316954c[8] = "senderUserName";
        e0Var.f316955d.put("senderUserName", "TEXT default '' ");
        e0Var.f316954c[9] = "senderRoleType";
        e0Var.f316955d.put("senderRoleType", "INTEGER default '0' ");
        e0Var.f316954c[10] = "followFlag";
        e0Var.f316955d.put("followFlag", "INTEGER");
        e0Var.f316954c[11] = "disableSendmsgNeedFollow";
        e0Var.f316955d.put("disableSendmsgNeedFollow", "INTEGER");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  followFlag INTEGER,  disableSendmsgNeedFollow INTEGER";
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
            if (f235854v == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f235859d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235855w == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235856x == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235857y == hashCode) {
                try {
                    this.field_selfUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235858z == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_actionPermission = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_rejectMsg = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_disableSendMsg = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_senderUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_senderRoleType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_followFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_disableSendmsgNeedFollow = z17;
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f235859d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f235860e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f235861f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_selfUsername == null) {
            this.field_selfUsername = "";
        }
        if (this.f235862g) {
            contentValues.put("selfUsername", this.field_selfUsername);
        }
        if (this.f235863h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f235864i) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.field_actionPermission));
        }
        if (this.f235865m) {
            contentValues.put("rejectMsg", java.lang.Integer.valueOf(this.field_rejectMsg));
        }
        if (this.f235866n) {
            contentValues.put("disableSendMsg", java.lang.Integer.valueOf(this.field_disableSendMsg));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f235867o) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f235868p) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f235869q) {
            contentValues.put("followFlag", java.lang.Integer.valueOf(this.field_followFlag));
        }
        if (this.f235870r) {
            if (this.field_disableSendmsgNeedFollow) {
                contentValues.put("disableSendmsgNeedFollow", (java.lang.Integer) 1);
            } else {
                contentValues.put("disableSendmsgNeedFollow", (java.lang.Integer) 0);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderSessionInfo ( ");
        l75.e0 e0Var = I;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235853u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "createTableSql %s", str2);
            k0Var.A("FinderSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderSessionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "updateTableSql %s", str3);
            k0Var.A("FinderSessionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return I;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235850J;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235851s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235851s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f235859d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f235860e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f235861f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.field_selfUsername = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f235862g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235863h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f235864i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.field_rejectMsg = contentValues.getAsInteger("rejectMsg").intValue();
            if (z17) {
                this.f235865m = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.field_disableSendMsg = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z17) {
                this.f235866n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f235867o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f235868p = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.field_followFlag = contentValues.getAsInteger("followFlag").intValue();
            if (z17) {
                this.f235869q = true;
            }
        }
        if (contentValues.containsKey("disableSendmsgNeedFollow")) {
            this.field_disableSendmsgNeedFollow = contentValues.getAsInteger("disableSendmsgNeedFollow").intValue() != 0;
            if (z17) {
                this.f235870r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
