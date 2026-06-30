package dm;

/* loaded from: classes9.dex */
public class fc extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f236952s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f236953t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236954u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236955v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236956w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236957x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236958y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236959z;
    public java.lang.String field_exclusiveUsername;
    public int field_hbStatus;
    public int field_hbType;
    public int field_invalidtime;
    public java.lang.String field_mNativeUrl;
    public long field_msgLocalId;
    public long field_msgSvrId;
    public long field_receiveAmount;
    public int field_receiveStatus;
    public long field_receiveTime;
    public java.lang.String field_sendId;
    public java.lang.String field_sender;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236960d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236961e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236962f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236963g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236964h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236965i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236966m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236967n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236968o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236969p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236970q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236971r = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletLuckyMoney");
        f236952s = n0Var;
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
        f236953t = new java.lang.String[0];
        f236954u = 1050590187;
        f236955v = -1224408236;
        f236956w = 984267035;
        f236957x = -2103439280;
        f236958y = 1505638581;
        f236959z = 131048844;
        A = -905962955;
        B = 774516116;
        C = -905963837;
        D = -952209084;
        E = -1294411543;
        F = -520067291;
        G = 108705909;
        H = initAutoDBInfo(dm.fc.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "mNativeUrl";
        e0Var.f316955d.put("mNativeUrl", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "mNativeUrl";
        e0Var.f316954c[1] = "hbType";
        e0Var.f316955d.put("hbType", "INTEGER");
        e0Var.f316954c[2] = "receiveAmount";
        e0Var.f316955d.put("receiveAmount", "LONG");
        e0Var.f316954c[3] = "receiveTime";
        e0Var.f316955d.put("receiveTime", "LONG");
        e0Var.f316954c[4] = "receiveStatus";
        e0Var.f316955d.put("receiveStatus", "INTEGER");
        e0Var.f316954c[5] = "hbStatus";
        e0Var.f316955d.put("hbStatus", "INTEGER");
        e0Var.f316954c[6] = "sender";
        e0Var.f316955d.put("sender", "TEXT");
        e0Var.f316954c[7] = "exclusiveUsername";
        e0Var.f316955d.put("exclusiveUsername", "TEXT");
        e0Var.f316954c[8] = "sendId";
        e0Var.f316955d.put("sendId", "TEXT");
        e0Var.f316954c[9] = "invalidtime";
        e0Var.f316955d.put("invalidtime", "INTEGER");
        e0Var.f316954c[10] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[11] = "msgLocalId";
        e0Var.f316955d.put("msgLocalId", "LONG");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " mNativeUrl TEXT PRIMARY KEY ,  hbType INTEGER,  receiveAmount LONG,  receiveTime LONG,  receiveStatus INTEGER,  hbStatus INTEGER,  sender TEXT,  exclusiveUsername TEXT,  sendId TEXT,  invalidtime INTEGER,  msgSvrId LONG,  msgLocalId LONG";
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
            if (f236954u == hashCode) {
                try {
                    this.field_mNativeUrl = cursor.getString(i17);
                    this.f236960d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236955v == hashCode) {
                try {
                    this.field_hbType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236956w == hashCode) {
                try {
                    this.field_receiveAmount = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236957x == hashCode) {
                try {
                    this.field_receiveTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236958y == hashCode) {
                try {
                    this.field_receiveStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236959z == hashCode) {
                try {
                    this.field_hbStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_sender = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_exclusiveUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_sendId = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_invalidtime = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_msgLocalId = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLuckyMoney", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236960d) {
            contentValues.put("mNativeUrl", this.field_mNativeUrl);
        }
        if (this.f236961e) {
            contentValues.put("hbType", java.lang.Integer.valueOf(this.field_hbType));
        }
        if (this.f236962f) {
            contentValues.put("receiveAmount", java.lang.Long.valueOf(this.field_receiveAmount));
        }
        if (this.f236963g) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.field_receiveTime));
        }
        if (this.f236964h) {
            contentValues.put("receiveStatus", java.lang.Integer.valueOf(this.field_receiveStatus));
        }
        if (this.f236965i) {
            contentValues.put("hbStatus", java.lang.Integer.valueOf(this.field_hbStatus));
        }
        if (this.f236966m) {
            contentValues.put("sender", this.field_sender);
        }
        if (this.f236967n) {
            contentValues.put("exclusiveUsername", this.field_exclusiveUsername);
        }
        if (this.f236968o) {
            contentValues.put("sendId", this.field_sendId);
        }
        if (this.f236969p) {
            contentValues.put("invalidtime", java.lang.Integer.valueOf(this.field_invalidtime));
        }
        if (this.f236970q) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f236971r) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.field_msgLocalId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletLuckyMoney ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236953t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTableSql %s", str2);
            k0Var.A("WalletLuckyMoney", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletLuckyMoney", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "updateTableSql %s", str3);
            k0Var.A("WalletLuckyMoney", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_mNativeUrl;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236952s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236952s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mNativeUrl")) {
            this.field_mNativeUrl = contentValues.getAsString("mNativeUrl");
            if (z17) {
                this.f236960d = true;
            }
        }
        if (contentValues.containsKey("hbType")) {
            this.field_hbType = contentValues.getAsInteger("hbType").intValue();
            if (z17) {
                this.f236961e = true;
            }
        }
        if (contentValues.containsKey("receiveAmount")) {
            this.field_receiveAmount = contentValues.getAsLong("receiveAmount").longValue();
            if (z17) {
                this.f236962f = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.field_receiveTime = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f236963g = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.field_receiveStatus = contentValues.getAsInteger("receiveStatus").intValue();
            if (z17) {
                this.f236964h = true;
            }
        }
        if (contentValues.containsKey("hbStatus")) {
            this.field_hbStatus = contentValues.getAsInteger("hbStatus").intValue();
            if (z17) {
                this.f236965i = true;
            }
        }
        if (contentValues.containsKey("sender")) {
            this.field_sender = contentValues.getAsString("sender");
            if (z17) {
                this.f236966m = true;
            }
        }
        if (contentValues.containsKey("exclusiveUsername")) {
            this.field_exclusiveUsername = contentValues.getAsString("exclusiveUsername");
            if (z17) {
                this.f236967n = true;
            }
        }
        if (contentValues.containsKey("sendId")) {
            this.field_sendId = contentValues.getAsString("sendId");
            if (z17) {
                this.f236968o = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.field_invalidtime = contentValues.getAsInteger("invalidtime").intValue();
            if (z17) {
                this.f236969p = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f236970q = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.field_msgLocalId = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f236971r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
