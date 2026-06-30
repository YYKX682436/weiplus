package dm;

/* loaded from: classes8.dex */
public class w9 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f240866o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f240867p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f240868q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f240869r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f240870s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f240871t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f240872u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f240873v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240874w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240875x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240876y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240877z;
    public java.lang.String field_chatRoomName;
    public byte[] field_data;
    public java.lang.String field_hashKey;
    public long field_msgId;
    public java.lang.String field_primaryKey;
    public int field_read;
    public int field_state;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240878d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240879e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240880f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240881g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240882h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240883i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240884m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240885n = true;

    static {
        p75.n0 n0Var = new p75.n0("RoomVerifyApplicationStg");
        f240866o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240867p = new p75.d("hashKey", "string", tableName, "");
        f240868q = new p75.d("chatRoomName", "string", tableName, "");
        f240869r = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240870s = new p75.d("state", "int", tableName, "");
        f240871t = new p75.d("read", "int", tableName, "");
        f240872u = new p75.d(dm.i4.COL_UPDATETIME, "long", tableName, "");
        f240873v = new java.lang.String[0];
        f240874w = -1274920707;
        f240875x = 697508465;
        f240876y = 787786110;
        f240877z = 104191100;
        A = 3076010;
        B = 109757585;
        C = 3496342;
        D = -295931082;
        E = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "primaryKey";
        ((java.util.HashMap) e0Var.f316955d).put("primaryKey", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "primaryKey";
        e0Var.f316954c[1] = "hashKey";
        ((java.util.HashMap) e0Var.f316955d).put("hashKey", "TEXT");
        e0Var.f316954c[2] = "chatRoomName";
        ((java.util.HashMap) e0Var.f316955d).put("chatRoomName", "TEXT");
        e0Var.f316954c[3] = "msgId";
        ((java.util.HashMap) e0Var.f316955d).put("msgId", "LONG");
        e0Var.f316954c[4] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA;
        ((java.util.HashMap) e0Var.f316955d).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "BLOB");
        e0Var.f316954c[5] = "state";
        ((java.util.HashMap) e0Var.f316955d).put("state", "INTEGER");
        e0Var.f316954c[6] = "read";
        ((java.util.HashMap) e0Var.f316955d).put("read", "INTEGER");
        e0Var.f316954c[7] = dm.i4.COL_UPDATETIME;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " primaryKey TEXT PRIMARY KEY ,  hashKey TEXT,  chatRoomName TEXT,  msgId LONG,  data BLOB,  state INTEGER,  read INTEGER,  updateTime LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        F = e0Var;
        G = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RoomVerifyApplicationStg ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240873v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTableSql %s", str2);
            k0Var.A("RoomVerifyApplicationStg", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "RoomVerifyApplicationStg", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "updateTableSql %s", str3);
            k0Var.A("RoomVerifyApplicationStg", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f240874w == hashCode) {
                try {
                    this.field_primaryKey = cursor.getString(i17);
                    this.f240878d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240875x == hashCode) {
                try {
                    this.field_hashKey = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240876y == hashCode) {
                try {
                    this.field_chatRoomName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240877z == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_data = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_read = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240878d) {
            contentValues.put("primaryKey", this.field_primaryKey);
        }
        if (this.f240879e) {
            contentValues.put("hashKey", this.field_hashKey);
        }
        if (this.f240880f) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f240881g) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f240882h) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
        }
        if (this.f240883i) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f240884m) {
            contentValues.put("read", java.lang.Integer.valueOf(this.field_read));
        }
        if (this.f240885n) {
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
        createTable(k0Var);
    }

    public int deleteFromDB(l75.k0 k0Var, boolean z17) {
        m75.b bVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343584e, java.lang.String.valueOf(this.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
            cVar.f343590d = this;
            bVar = new m75.b(this, cVar, G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        } else {
            bVar = new m75.b(this, null, null, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        }
        return bVar.a(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return G;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_primaryKey;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240866o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240866o.f352676a;
    }

    public int updateToDB(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(this.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
            cVar.f343590d = this;
            eVar = new m75.e(this, cVar, G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        }
        return eVar.a(k0Var);
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("primaryKey")) {
            this.field_primaryKey = contentValues.getAsString("primaryKey");
            if (z17) {
                this.f240878d = true;
            }
        }
        if (contentValues.containsKey("hashKey")) {
            this.field_hashKey = contentValues.getAsString("hashKey");
            if (z17) {
                this.f240879e = true;
            }
        }
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z17) {
                this.f240880f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f240881g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            this.field_data = contentValues.getAsByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (z17) {
                this.f240882h = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f240883i = true;
            }
        }
        if (contentValues.containsKey("read")) {
            this.field_read = contentValues.getAsInteger("read").intValue();
            if (z17) {
                this.f240884m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f240885n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
