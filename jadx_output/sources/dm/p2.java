package dm;

/* loaded from: classes8.dex */
public class p2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239095n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239096o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239097p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239098q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239099r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239100s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239101t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239102u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239103v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239104w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239105x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239106y;
    public java.lang.String field_appMsgSign;
    public java.lang.String field_giftMsgId;
    public boolean field_hasMsgClicked;
    public boolean field_hasOpenPagPlayed;
    public long field_msgLocalId;
    public java.lang.String field_talkerUserName;
    public java.lang.String field_userName;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239107d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239108e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239109f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239110g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239111h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239112i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239113m = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsGiftMsgRecord");
        f239095n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239096o = new java.lang.String[0];
        f239097p = 553957676;
        f239098q = -520067291;
        f239099r = -266666762;
        f239100s = 691516320;
        f239101t = -1911177617;
        f239102u = -1818757251;
        f239103v = 1559331685;
        f239104w = 108705909;
        f239105x = initAutoDBInfo(dm.p2.class);
        f239106y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "giftMsgId";
        e0Var.f316955d.put("giftMsgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "giftMsgId";
        e0Var.f316954c[1] = "msgLocalId";
        e0Var.f316955d.put("msgLocalId", "LONG");
        e0Var.f316954c[2] = "userName";
        e0Var.f316955d.put("userName", "TEXT");
        e0Var.f316954c[3] = "hasMsgClicked";
        e0Var.f316955d.put("hasMsgClicked", "INTEGER");
        e0Var.f316954c[4] = "talkerUserName";
        e0Var.f316955d.put("talkerUserName", "TEXT default '' ");
        e0Var.f316954c[5] = "appMsgSign";
        e0Var.f316955d.put("appMsgSign", "TEXT default '' ");
        e0Var.f316954c[6] = "hasOpenPagPlayed";
        e0Var.f316955d.put("hasOpenPagPlayed", "INTEGER");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " giftMsgId TEXT PRIMARY KEY ,  msgLocalId LONG,  userName TEXT,  hasMsgClicked INTEGER,  talkerUserName TEXT default '' ,  appMsgSign TEXT default '' ,  hasOpenPagPlayed INTEGER";
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
            if (f239097p == hashCode) {
                try {
                    this.field_giftMsgId = cursor.getString(i17);
                    this.f239107d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239098q == hashCode) {
                try {
                    this.field_msgLocalId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239099r == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239100s == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasMsgClicked = z17;
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239101t == hashCode) {
                try {
                    this.field_talkerUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239102u == hashCode) {
                try {
                    this.field_appMsgSign = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239103v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasOpenPagPlayed = z17;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsGiftMsgRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239104w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239107d) {
            contentValues.put("giftMsgId", this.field_giftMsgId);
        }
        if (this.f239108e) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.field_msgLocalId));
        }
        if (this.f239109f) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f239110g) {
            if (this.field_hasMsgClicked) {
                contentValues.put("hasMsgClicked", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasMsgClicked", (java.lang.Integer) 0);
            }
        }
        if (this.field_talkerUserName == null) {
            this.field_talkerUserName = "";
        }
        if (this.f239111h) {
            contentValues.put("talkerUserName", this.field_talkerUserName);
        }
        if (this.field_appMsgSign == null) {
            this.field_appMsgSign = "";
        }
        if (this.f239112i) {
            contentValues.put("appMsgSign", this.field_appMsgSign);
        }
        if (this.f239113m) {
            if (this.field_hasOpenPagPlayed) {
                contentValues.put("hasOpenPagPlayed", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasOpenPagPlayed", (java.lang.Integer) 0);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsGiftMsgRecord ( ");
        l75.e0 e0Var = f239105x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239096o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTableSql %s", str2);
            k0Var.A("EcsGiftMsgRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EcsGiftMsgRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "updateTableSql %s", str3);
            k0Var.A("EcsGiftMsgRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239105x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239106y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_giftMsgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239095n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239095n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("giftMsgId")) {
            this.field_giftMsgId = contentValues.getAsString("giftMsgId");
            if (z17) {
                this.f239107d = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.field_msgLocalId = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f239108e = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f239109f = true;
            }
        }
        if (contentValues.containsKey("hasMsgClicked")) {
            this.field_hasMsgClicked = contentValues.getAsInteger("hasMsgClicked").intValue() != 0;
            if (z17) {
                this.f239110g = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.field_talkerUserName = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f239111h = true;
            }
        }
        if (contentValues.containsKey("appMsgSign")) {
            this.field_appMsgSign = contentValues.getAsString("appMsgSign");
            if (z17) {
                this.f239112i = true;
            }
        }
        if (contentValues.containsKey("hasOpenPagPlayed")) {
            this.field_hasOpenPagPlayed = contentValues.getAsInteger("hasOpenPagPlayed").intValue() != 0;
            if (z17) {
                this.f239113m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
