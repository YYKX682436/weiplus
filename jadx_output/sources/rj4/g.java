package rj4;

/* loaded from: classes10.dex */
public class g extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f396330q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f396331r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f396332s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f396333t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f396334u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f396335v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f396336w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f396337x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f396338y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f396339z;
    public int field_actionPermission;
    public int field_disableSendMsg;
    public int field_rejectMsg;
    public java.lang.String field_selfUsername;
    public int field_senderRoleType;
    public java.lang.String field_senderUserName;
    public java.lang.String field_sessionId;
    public java.lang.String field_talker;
    public int field_type;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396340d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396341e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396342f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396343g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396344h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396345i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396346m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396347n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396348o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396349p = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusSessionInfo");
        f396330q = n0Var;
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
        f396331r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_sessionId_index ON TextStatusSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_talker_index ON TextStatusSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_selfUsername_index ON TextStatusSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_type_index ON TextStatusSessionInfo(type)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_senderUserName_index ON TextStatusSessionInfo(senderUserName)"};
        f396332s = 607796817;
        f396333t = -881080743;
        f396334u = -295931082;
        f396335v = 1229697090;
        f396336w = 3575610;
        f396337x = 211768485;
        f396338y = -1683545246;
        f396339z = -740052271;
        A = 1667659339;
        B = 1667748389;
        C = 108705909;
        D = initAutoDBInfo(rj4.g.class);
        E = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
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
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ";
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
            if (f396332s == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                    this.f396340d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396333t == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396334u == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396335v == hashCode) {
                try {
                    this.field_selfUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396336w == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396337x == hashCode) {
                try {
                    this.field_actionPermission = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396338y == hashCode) {
                try {
                    this.field_rejectMsg = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396339z == hashCode) {
                try {
                    this.field_disableSendMsg = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_senderUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_senderRoleType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f396340d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f396341e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f396342f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.field_selfUsername == null) {
            this.field_selfUsername = "";
        }
        if (this.f396343g) {
            contentValues.put("selfUsername", this.field_selfUsername);
        }
        if (this.f396344h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f396345i) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.field_actionPermission));
        }
        if (this.f396346m) {
            contentValues.put("rejectMsg", java.lang.Integer.valueOf(this.field_rejectMsg));
        }
        if (this.f396347n) {
            contentValues.put("disableSendMsg", java.lang.Integer.valueOf(this.field_disableSendMsg));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f396348o) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f396349p) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.field_senderRoleType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusSessionInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f396331r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTableSql %s", str2);
            k0Var.A("TextStatusSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusSessionInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "updateTableSql %s", str3);
            k0Var.A("TextStatusSessionInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.field_sessionId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396330q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396330q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f396340d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f396341e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f396342f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.field_selfUsername = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f396343g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f396344h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f396345i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.field_rejectMsg = contentValues.getAsInteger("rejectMsg").intValue();
            if (z17) {
                this.f396346m = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.field_disableSendMsg = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z17) {
                this.f396347n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f396348o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f396349p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
