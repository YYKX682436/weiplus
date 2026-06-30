package dm;

/* loaded from: classes8.dex */
public class o7 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f238962n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f238963o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238964p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238965q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238966r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238967s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238968t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238969u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238970v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238971w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f238972x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f238973y;
    public java.lang.String field_anchorUsername;
    public java.lang.String field_hostRoomId;
    public boolean field_isSender;
    public long field_liveId;
    public java.lang.String field_liveName;
    public java.lang.String field_thumbUrl;
    public long field_timeStamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238974d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238975e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238976f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238977g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238978h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238979i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238980m = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveTipsBar");
        f238962n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238963o = new java.lang.String[0];
        f238964p = -1102434521;
        f238965q = -1137065186;
        f238966r = 1417496983;
        f238967s = 1566917561;
        f238968t = 1850157739;
        f238969u = -231928833;
        f238970v = 25573622;
        f238971w = 108705909;
        f238972x = initAutoDBInfo(dm.o7.class);
        f238973y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "liveId";
        e0Var.f316955d.put("liveId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "liveId";
        e0Var.f316954c[1] = "hostRoomId";
        e0Var.f316955d.put("hostRoomId", "TEXT default '' ");
        e0Var.f316954c[2] = "liveName";
        e0Var.f316955d.put("liveName", "TEXT default '' ");
        e0Var.f316954c[3] = "thumbUrl";
        e0Var.f316955d.put("thumbUrl", "TEXT default '' ");
        e0Var.f316954c[4] = "anchorUsername";
        e0Var.f316955d.put("anchorUsername", "TEXT default '' ");
        e0Var.f316954c[5] = "isSender";
        e0Var.f316955d.put("isSender", "INTEGER default 'false' ");
        e0Var.f316954c[6] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  liveName TEXT default '' ,  thumbUrl TEXT default '' ,  anchorUsername TEXT default '' ,  isSender INTEGER default 'false' ,  timeStamp LONG default '0' ";
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
            if (f238964p == hashCode) {
                try {
                    this.field_liveId = cursor.getLong(i17);
                    this.f238974d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238965q == hashCode) {
                try {
                    this.field_hostRoomId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238966r == hashCode) {
                try {
                    this.field_liveName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238967s == hashCode) {
                try {
                    this.field_thumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238968t == hashCode) {
                try {
                    this.field_anchorUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238969u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isSender = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238970v == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238971w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238974d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.field_liveId));
        }
        if (this.field_hostRoomId == null) {
            this.field_hostRoomId = "";
        }
        if (this.f238975e) {
            contentValues.put("hostRoomId", this.field_hostRoomId);
        }
        if (this.field_liveName == null) {
            this.field_liveName = "";
        }
        if (this.f238976f) {
            contentValues.put("liveName", this.field_liveName);
        }
        if (this.field_thumbUrl == null) {
            this.field_thumbUrl = "";
        }
        if (this.f238977g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.field_anchorUsername == null) {
            this.field_anchorUsername = "";
        }
        if (this.f238978h) {
            contentValues.put("anchorUsername", this.field_anchorUsername);
        }
        if (this.f238979i) {
            if (this.field_isSender) {
                contentValues.put("isSender", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSender", (java.lang.Integer) 0);
            }
        }
        if (this.f238980m) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveTipsBar ( ");
        l75.e0 e0Var = f238972x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238963o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "createTableSql %s", str2);
            k0Var.A("LiveTipsBar", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiveTipsBar", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "updateTableSql %s", str3);
            k0Var.A("LiveTipsBar", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238972x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238973y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_liveId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238962n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238962n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f238974d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.field_hostRoomId = contentValues.getAsString("hostRoomId");
            if (z17) {
                this.f238975e = true;
            }
        }
        if (contentValues.containsKey("liveName")) {
            this.field_liveName = contentValues.getAsString("liveName");
            if (z17) {
                this.f238976f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f238977g = true;
            }
        }
        if (contentValues.containsKey("anchorUsername")) {
            this.field_anchorUsername = contentValues.getAsString("anchorUsername");
            if (z17) {
                this.f238978h = true;
            }
        }
        if (contentValues.containsKey("isSender")) {
            this.field_isSender = contentValues.getAsInteger("isSender").intValue() != 0;
            if (z17) {
                this.f238979i = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f238980m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
