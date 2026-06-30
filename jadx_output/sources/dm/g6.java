package dm;

/* loaded from: classes13.dex */
public class g6 extends l75.f0 {
    public static final p75.n0 L;
    public static final java.lang.String[] M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: l1, reason: collision with root package name */
    public static final l75.e0 f237082l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f237083p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final o75.e f237084p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f237085x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f237086y0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public long G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f237087J;
    public java.lang.String K;
    public byte[] field_authBuf;
    public java.lang.String field_authKey;
    public java.lang.String field_brandName;
    public int field_closeStrategy;
    public java.lang.String field_connProto;
    public int field_connStrategy;
    public java.lang.String field_deviceID;
    public java.lang.String field_deviceType;
    public byte[] field_lvbuffer;
    public long field_mac;
    public java.lang.String field_md5Str;
    public byte[] field_sessionBuf;
    public byte[] field_sessionKey;
    public java.lang.String field_url;

    /* renamed from: u, reason: collision with root package name */
    public int f237102u;

    /* renamed from: v, reason: collision with root package name */
    public int f237103v;

    /* renamed from: w, reason: collision with root package name */
    public long f237104w;

    /* renamed from: x, reason: collision with root package name */
    public long f237105x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f237106y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f237107z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237088d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237089e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237090f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237091g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237092h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237093i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237094m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237095n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237096o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237097p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237098q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237099r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237100s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237101t = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceInfo");
        L = n0Var;
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
        M = new java.lang.String[0];
        N = 1109191153;
        P = -787472718;
        Q = 107855;
        R = 781190832;
        S = -598161892;
        T = -1539519809;
        U = -1255248501;
        V = -1080375341;
        W = -646543465;
        X = 116079;
        Y = 1661834217;
        Z = 1661826045;
        f237083p0 = -646551637;
        f237085x0 = -486944182;
        f237086y0 = 108705909;
        f237082l1 = initAutoDBInfo(dm.g6.class);
        f237084p1 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = "deviceID";
        e0Var.f316955d.put("deviceID", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "deviceID";
        e0Var.f316954c[1] = "brandName";
        e0Var.f316955d.put("brandName", "TEXT");
        e0Var.f316954c[2] = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC;
        e0Var.f316955d.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "LONG");
        e0Var.f316954c[3] = "deviceType";
        e0Var.f316955d.put("deviceType", "TEXT");
        e0Var.f316954c[4] = "connProto";
        e0Var.f316955d.put("connProto", "TEXT");
        e0Var.f316954c[5] = "connStrategy";
        e0Var.f316955d.put("connStrategy", "INTEGER");
        e0Var.f316954c[6] = "closeStrategy";
        e0Var.f316955d.put("closeStrategy", "INTEGER");
        e0Var.f316954c[7] = "md5Str";
        e0Var.f316955d.put("md5Str", "TEXT");
        e0Var.f316954c[8] = "authKey";
        e0Var.f316955d.put("authKey", "TEXT");
        e0Var.f316954c[9] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[10] = "sessionKey";
        e0Var.f316955d.put("sessionKey", "BLOB");
        e0Var.f316954c[11] = "sessionBuf";
        e0Var.f316955d.put("sessionBuf", "BLOB");
        e0Var.f316954c[12] = "authBuf";
        e0Var.f316955d.put("authBuf", "BLOB");
        e0Var.f316954c[13] = "lvbuffer";
        e0Var.f316955d.put("lvbuffer", "BLOB");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " deviceID TEXT PRIMARY KEY ,  brandName TEXT,  mac LONG,  deviceType TEXT,  connProto TEXT,  connStrategy INTEGER,  closeStrategy INTEGER,  md5Str TEXT,  authKey TEXT,  url TEXT,  sessionKey BLOB,  sessionBuf BLOB,  authBuf BLOB,  lvbuffer BLOB";
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
            if (N == hashCode) {
                try {
                    this.field_deviceID = cursor.getString(i17);
                    this.f237088d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_brandName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_mac = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_deviceType = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_connProto = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_connStrategy = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_closeStrategy = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_md5Str = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_authKey = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_sessionKey = cursor.getBlob(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                try {
                    this.field_sessionBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237083p0 == hashCode) {
                try {
                    this.field_authBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237085x0 == hashCode) {
                try {
                    this.field_lvbuffer = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237086y0 == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
        try {
            byte[] bArr = this.field_lvbuffer;
            if (bArr != null && bArr.length != 0) {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                int i18 = e2Var.i(bArr);
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceInfo", "parse LVBuffer error:" + i18);
                    return;
                }
                if (!e2Var.c()) {
                    this.f237102u = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.f237103v = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.f237104w = e2Var.f();
                }
                if (!e2Var.c()) {
                    this.f237105x = e2Var.f();
                }
                if (!e2Var.c()) {
                    this.f237106y = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.f237107z = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.A = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.B = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.C = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.D = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.E = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.F = e2Var.e();
                }
                if (!e2Var.c()) {
                    this.G = e2Var.f();
                }
                if (!e2Var.c()) {
                    this.H = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.I = e2Var.g();
                }
                if (!e2Var.c()) {
                    this.f237087J = e2Var.g();
                }
                if (e2Var.c()) {
                    return;
                }
                this.K = e2Var.g();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed");
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        try {
            if (this.f237101t) {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                e2Var.h();
                e2Var.k(this.f237102u);
                e2Var.k(this.f237103v);
                e2Var.l(this.f237104w);
                e2Var.l(this.f237105x);
                e2Var.m(this.f237106y);
                e2Var.m(this.f237107z);
                e2Var.m(this.A);
                e2Var.m(this.B);
                e2Var.m(this.C);
                e2Var.m(this.D);
                e2Var.k(this.E);
                e2Var.k(this.F);
                e2Var.l(this.G);
                e2Var.m(this.H);
                e2Var.m(this.I);
                e2Var.m(this.f237087J);
                e2Var.m(this.K);
                this.field_lvbuffer = e2Var.a();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed, %s", e17.getMessage());
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237088d) {
            contentValues.put("deviceID", this.field_deviceID);
        }
        if (this.f237089e) {
            contentValues.put("brandName", this.field_brandName);
        }
        if (this.f237090f) {
            contentValues.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, java.lang.Long.valueOf(this.field_mac));
        }
        if (this.f237091g) {
            contentValues.put("deviceType", this.field_deviceType);
        }
        if (this.f237092h) {
            contentValues.put("connProto", this.field_connProto);
        }
        if (this.f237093i) {
            contentValues.put("connStrategy", java.lang.Integer.valueOf(this.field_connStrategy));
        }
        if (this.f237094m) {
            contentValues.put("closeStrategy", java.lang.Integer.valueOf(this.field_closeStrategy));
        }
        if (this.f237095n) {
            contentValues.put("md5Str", this.field_md5Str);
        }
        if (this.f237096o) {
            contentValues.put("authKey", this.field_authKey);
        }
        if (this.f237097p) {
            contentValues.put("url", this.field_url);
        }
        if (this.f237098q) {
            contentValues.put("sessionKey", this.field_sessionKey);
        }
        if (this.f237099r) {
            contentValues.put("sessionBuf", this.field_sessionBuf);
        }
        if (this.f237100s) {
            contentValues.put("authBuf", this.field_authBuf);
        }
        if (this.f237101t) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceInfo ( ");
        l75.e0 e0Var = f237082l1;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : M) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237082l1;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237084p1;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_deviceID;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return L;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return L.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("deviceID")) {
            this.field_deviceID = contentValues.getAsString("deviceID");
            if (z17) {
                this.f237088d = true;
            }
        }
        if (contentValues.containsKey("brandName")) {
            this.field_brandName = contentValues.getAsString("brandName");
            if (z17) {
                this.f237089e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC)) {
            this.field_mac = contentValues.getAsLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC).longValue();
            if (z17) {
                this.f237090f = true;
            }
        }
        if (contentValues.containsKey("deviceType")) {
            this.field_deviceType = contentValues.getAsString("deviceType");
            if (z17) {
                this.f237091g = true;
            }
        }
        if (contentValues.containsKey("connProto")) {
            this.field_connProto = contentValues.getAsString("connProto");
            if (z17) {
                this.f237092h = true;
            }
        }
        if (contentValues.containsKey("connStrategy")) {
            this.field_connStrategy = contentValues.getAsInteger("connStrategy").intValue();
            if (z17) {
                this.f237093i = true;
            }
        }
        if (contentValues.containsKey("closeStrategy")) {
            this.field_closeStrategy = contentValues.getAsInteger("closeStrategy").intValue();
            if (z17) {
                this.f237094m = true;
            }
        }
        if (contentValues.containsKey("md5Str")) {
            this.field_md5Str = contentValues.getAsString("md5Str");
            if (z17) {
                this.f237095n = true;
            }
        }
        if (contentValues.containsKey("authKey")) {
            this.field_authKey = contentValues.getAsString("authKey");
            if (z17) {
                this.f237096o = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f237097p = true;
            }
        }
        if (contentValues.containsKey("sessionKey")) {
            this.field_sessionKey = contentValues.getAsByteArray("sessionKey");
            if (z17) {
                this.f237098q = true;
            }
        }
        if (contentValues.containsKey("sessionBuf")) {
            this.field_sessionBuf = contentValues.getAsByteArray("sessionBuf");
            if (z17) {
                this.f237099r = true;
            }
        }
        if (contentValues.containsKey("authBuf")) {
            this.field_authBuf = contentValues.getAsByteArray("authBuf");
            if (z17) {
                this.f237100s = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z17) {
                this.f237101t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
