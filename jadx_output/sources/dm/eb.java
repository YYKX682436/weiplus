package dm;

/* loaded from: classes4.dex */
public class eb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f236697i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f236698m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236699n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236700o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236701p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236702q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236703r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236704s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f236705t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f236706u;
    public byte[] field_extbuf;
    public java.lang.String field_newStoryList;
    public long field_nextSyncTime;
    public java.lang.String field_roomname;
    public int field_userStoryFlag;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236707d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236708e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236709f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236710g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236711h = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryRoomInfo");
        f236697i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236698m = new java.lang.String[0];
        f236699n = -172550682;
        f236700o = -620940682;
        f236701p = 2014635379;
        f236702q = -1289046862;
        f236703r = 774006811;
        f236704s = 108705909;
        f236705t = initAutoDBInfo(dm.eb.class);
        f236706u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "roomname";
        e0Var.f316955d.put("roomname", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "roomname";
        e0Var.f316954c[1] = "userStoryFlag";
        e0Var.f316955d.put("userStoryFlag", "INTEGER");
        e0Var.f316954c[2] = "newStoryList";
        e0Var.f316955d.put("newStoryList", "TEXT");
        e0Var.f316954c[3] = "extbuf";
        e0Var.f316955d.put("extbuf", "BLOB");
        e0Var.f316954c[4] = "nextSyncTime";
        e0Var.f316955d.put("nextSyncTime", "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " roomname TEXT default ''  PRIMARY KEY ,  userStoryFlag INTEGER,  newStoryList TEXT,  extbuf BLOB,  nextSyncTime LONG";
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
            if (f236699n == hashCode) {
                try {
                    this.field_roomname = cursor.getString(i17);
                    this.f236707d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236700o == hashCode) {
                try {
                    this.field_userStoryFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236701p == hashCode) {
                try {
                    this.field_newStoryList = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236702q == hashCode) {
                try {
                    this.field_extbuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236703r == hashCode) {
                try {
                    this.field_nextSyncTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236704s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_roomname == null) {
            this.field_roomname = "";
        }
        if (this.f236707d) {
            contentValues.put("roomname", this.field_roomname);
        }
        if (this.f236708e) {
            contentValues.put("userStoryFlag", java.lang.Integer.valueOf(this.field_userStoryFlag));
        }
        if (this.f236709f) {
            contentValues.put("newStoryList", this.field_newStoryList);
        }
        if (this.f236710g) {
            contentValues.put("extbuf", this.field_extbuf);
        }
        if (this.f236711h) {
            contentValues.put("nextSyncTime", java.lang.Long.valueOf(this.field_nextSyncTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStoryRoomInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryRoomInfo ( ");
        l75.e0 e0Var = f236705t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236698m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "createTableSql %s", str2);
            k0Var.A("StoryRoomInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StoryRoomInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "updateTableSql %s", str3);
            k0Var.A("StoryRoomInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236705t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236706u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_roomname;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236697i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236697i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("roomname")) {
            this.field_roomname = contentValues.getAsString("roomname");
            if (z17) {
                this.f236707d = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.field_userStoryFlag = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z17) {
                this.f236708e = true;
            }
        }
        if (contentValues.containsKey("newStoryList")) {
            this.field_newStoryList = contentValues.getAsString("newStoryList");
            if (z17) {
                this.f236709f = true;
            }
        }
        if (contentValues.containsKey("extbuf")) {
            this.field_extbuf = contentValues.getAsByteArray("extbuf");
            if (z17) {
                this.f236710g = true;
            }
        }
        if (contentValues.containsKey("nextSyncTime")) {
            this.field_nextSyncTime = contentValues.getAsLong("nextSyncTime").longValue();
            if (z17) {
                this.f236711h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
