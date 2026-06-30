package dm;

/* loaded from: classes8.dex */
public class s4 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f239816q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f239817r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239818s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239819t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239820u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239821v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239822w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239823x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239824y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239825z;
    public java.lang.String field_anchorFinderNickname;
    public java.lang.String field_anchorFinderUsername;
    public java.lang.String field_anchorWxUsername;
    public java.lang.String field_finderNonceId;
    public long field_finderObjectId;
    public java.lang.String field_hostRoomId;
    public long field_liveId;
    public boolean field_markRead;
    public int field_sourceType;
    public long field_timeStamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239826d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239827e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239828f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239829g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239830h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239831i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239832m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239833n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239834o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239835p = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveTipsBar");
        f239816q = n0Var;
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
        f239817r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_hostRoomId ON FinderLiveTipsBar(hostRoomId)", "CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_anchorWxUsername ON FinderLiveTipsBar(anchorWxUsername)"};
        f239818s = -1102434521;
        f239819t = -1137065186;
        f239820u = 25573622;
        f239821v = 1870138220;
        f239822w = 678300977;
        f239823x = 1014705353;
        f239824y = -1166463232;
        f239825z = 974703204;
        A = 246392323;
        B = -1111431691;
        C = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        ((java.util.HashMap) e0Var.f316955d).put("liveId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = "hostRoomId";
        ((java.util.HashMap) e0Var.f316955d).put("hostRoomId", "TEXT default '' ");
        e0Var.f316954c[2] = "timeStamp";
        ((java.util.HashMap) e0Var.f316955d).put("timeStamp", "LONG default '0' ");
        e0Var.f316954c[3] = "anchorWxUsername";
        ((java.util.HashMap) e0Var.f316955d).put("anchorWxUsername", "TEXT default '' ");
        e0Var.f316954c[4] = "anchorFinderUsername";
        ((java.util.HashMap) e0Var.f316955d).put("anchorFinderUsername", "TEXT default '' ");
        e0Var.f316954c[5] = "anchorFinderNickname";
        ((java.util.HashMap) e0Var.f316955d).put("anchorFinderNickname", "TEXT default '' ");
        e0Var.f316954c[6] = "finderObjectId";
        ((java.util.HashMap) e0Var.f316955d).put("finderObjectId", "LONG default '' ");
        e0Var.f316954c[7] = "finderNonceId";
        ((java.util.HashMap) e0Var.f316955d).put("finderNonceId", "TEXT default '' ");
        e0Var.f316954c[8] = "markRead";
        ((java.util.HashMap) e0Var.f316955d).put("markRead", "INTEGER default 'false' ");
        e0Var.f316954c[9] = "sourceType";
        ((java.util.HashMap) e0Var.f316955d).put("sourceType", "INTEGER");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  timeStamp LONG default '0' ,  anchorWxUsername TEXT default '' ,  anchorFinderUsername TEXT default '' ,  anchorFinderNickname TEXT default '' ,  finderObjectId LONG default '' ,  finderNonceId TEXT default '' ,  markRead INTEGER default 'false' ,  sourceType INTEGER";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        D = e0Var;
        E = new o75.e();
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
            if (f239818s == hashCode) {
                try {
                    this.field_liveId = cursor.getLong(i17);
                    this.f239826d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239819t == hashCode) {
                try {
                    this.field_hostRoomId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239820u == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239821v == hashCode) {
                try {
                    this.field_anchorWxUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239822w == hashCode) {
                try {
                    this.field_anchorFinderUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239823x == hashCode) {
                try {
                    this.field_anchorFinderNickname = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239824y == hashCode) {
                try {
                    this.field_finderObjectId = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239825z == hashCode) {
                try {
                    this.field_finderNonceId = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_markRead = z17;
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f239826d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.field_liveId));
        }
        if (this.field_hostRoomId == null) {
            this.field_hostRoomId = "";
        }
        if (this.f239827e) {
            contentValues.put("hostRoomId", this.field_hostRoomId);
        }
        if (this.f239828f) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
        }
        if (this.field_anchorWxUsername == null) {
            this.field_anchorWxUsername = "";
        }
        if (this.f239829g) {
            contentValues.put("anchorWxUsername", this.field_anchorWxUsername);
        }
        if (this.field_anchorFinderUsername == null) {
            this.field_anchorFinderUsername = "";
        }
        if (this.f239830h) {
            contentValues.put("anchorFinderUsername", this.field_anchorFinderUsername);
        }
        if (this.field_anchorFinderNickname == null) {
            this.field_anchorFinderNickname = "";
        }
        if (this.f239831i) {
            contentValues.put("anchorFinderNickname", this.field_anchorFinderNickname);
        }
        if (this.f239832m) {
            contentValues.put("finderObjectId", java.lang.Long.valueOf(this.field_finderObjectId));
        }
        if (this.field_finderNonceId == null) {
            this.field_finderNonceId = "";
        }
        if (this.f239833n) {
            contentValues.put("finderNonceId", this.field_finderNonceId);
        }
        if (this.f239834o) {
            if (this.field_markRead) {
                contentValues.put("markRead", (java.lang.Integer) 1);
            } else {
                contentValues.put("markRead", (java.lang.Integer) 0);
            }
        }
        if (this.f239835p) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveTipsBar ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239817r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTableSql %s", str2);
            k0Var.A("FinderLiveTipsBar", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveTipsBar", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "updateTableSql %s", str3);
            k0Var.A("FinderLiveTipsBar", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.field_liveId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239816q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239816q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f239826d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.field_hostRoomId = contentValues.getAsString("hostRoomId");
            if (z17) {
                this.f239827e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f239828f = true;
            }
        }
        if (contentValues.containsKey("anchorWxUsername")) {
            this.field_anchorWxUsername = contentValues.getAsString("anchorWxUsername");
            if (z17) {
                this.f239829g = true;
            }
        }
        if (contentValues.containsKey("anchorFinderUsername")) {
            this.field_anchorFinderUsername = contentValues.getAsString("anchorFinderUsername");
            if (z17) {
                this.f239830h = true;
            }
        }
        if (contentValues.containsKey("anchorFinderNickname")) {
            this.field_anchorFinderNickname = contentValues.getAsString("anchorFinderNickname");
            if (z17) {
                this.f239831i = true;
            }
        }
        if (contentValues.containsKey("finderObjectId")) {
            this.field_finderObjectId = contentValues.getAsLong("finderObjectId").longValue();
            if (z17) {
                this.f239832m = true;
            }
        }
        if (contentValues.containsKey("finderNonceId")) {
            this.field_finderNonceId = contentValues.getAsString("finderNonceId");
            if (z17) {
                this.f239833n = true;
            }
        }
        if (contentValues.containsKey("markRead")) {
            this.field_markRead = contentValues.getAsInteger("markRead").intValue() != 0;
            if (z17) {
                this.f239834o = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f239835p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
