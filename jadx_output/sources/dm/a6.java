package dm;

/* loaded from: classes4.dex */
public class a6 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f235642J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f235643w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f235644x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235645y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235646z;
    public java.lang.String field_big_url;
    public java.lang.String field_contecttype;
    public int field_googlecgistatus;
    public java.lang.String field_googlegmail;
    public java.lang.String field_googleid;
    public java.lang.String field_googleitemid;
    public java.lang.String field_googlename;
    public java.lang.String field_googlenamepy;
    public java.lang.String field_googlephotourl;
    public java.lang.String field_nickname;
    public java.lang.String field_nicknameqp;
    public int field_ret;
    public java.lang.String field_small_url;
    public int field_status;
    public java.lang.String field_username;
    public java.lang.String field_usernamepy;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235647d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235648e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235649f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235650g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235651h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235652i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235653m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235654n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235655o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235656p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235657q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235658r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f235659s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f235660t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235661u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235662v = true;

    static {
        p75.n0 n0Var = new p75.n0("GoogleFriend");
        f235643w = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235644x = new java.lang.String[0];
        f235645y = 2125775124;
        f235646z = -1534389180;
        A = -887187658;
        B = -327542779;
        C = -265713450;
        D = 70690926;
        E = -785493235;
        F = -1947551393;
        G = -1622888905;
        H = -114822736;
        I = 112801;
        f235642J = -892481550;
        K = -1500045593;
        L = 1786555038;
        M = -703098786;
        N = -1374215859;
        P = 108705909;
        Q = initAutoDBInfo(dm.a6.class);
        R = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = "googleid";
        e0Var.f316955d.put("googleid", "TEXT");
        e0Var.f316954c[1] = "googlename";
        e0Var.f316955d.put("googlename", "TEXT");
        e0Var.f316954c[2] = "googlephotourl";
        e0Var.f316955d.put("googlephotourl", "TEXT");
        e0Var.f316954c[3] = "googlegmail";
        e0Var.f316955d.put("googlegmail", "TEXT");
        e0Var.f316954c[4] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[5] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[6] = "nicknameqp";
        e0Var.f316955d.put("nicknameqp", "TEXT");
        e0Var.f316954c[7] = "usernamepy";
        e0Var.f316955d.put("usernamepy", "TEXT");
        e0Var.f316954c[8] = "small_url";
        e0Var.f316955d.put("small_url", "TEXT");
        e0Var.f316954c[9] = "big_url";
        e0Var.f316955d.put("big_url", "TEXT");
        e0Var.f316954c[10] = "ret";
        e0Var.f316955d.put("ret", "INTEGER");
        e0Var.f316954c[11] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[12] = "googleitemid";
        e0Var.f316955d.put("googleitemid", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "googleitemid";
        e0Var.f316954c[13] = "googlecgistatus";
        e0Var.f316955d.put("googlecgistatus", "INTEGER default '2' ");
        e0Var.f316954c[14] = "contecttype";
        e0Var.f316955d.put("contecttype", "TEXT");
        e0Var.f316954c[15] = "googlenamepy";
        e0Var.f316955d.put("googlenamepy", "TEXT");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " googleid TEXT,  googlename TEXT,  googlephotourl TEXT,  googlegmail TEXT,  username TEXT,  nickname TEXT,  nicknameqp TEXT,  usernamepy TEXT,  small_url TEXT,  big_url TEXT,  ret INTEGER,  status INTEGER,  googleitemid TEXT PRIMARY KEY ,  googlecgistatus INTEGER default '2' ,  contecttype TEXT,  googlenamepy TEXT";
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
            if (f235645y == hashCode) {
                try {
                    this.field_googleid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235646z == hashCode) {
                try {
                    this.field_googlename = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_googlephotourl = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_googlegmail = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_nicknameqp = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_usernamepy = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_small_url = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_big_url = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_ret = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235642J == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_googleitemid = cursor.getString(i17);
                    this.f235659s = true;
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_googlecgistatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_contecttype = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_googlenamepy = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGoogleFriend", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235647d) {
            contentValues.put("googleid", this.field_googleid);
        }
        if (this.f235648e) {
            contentValues.put("googlename", this.field_googlename);
        }
        if (this.f235649f) {
            contentValues.put("googlephotourl", this.field_googlephotourl);
        }
        if (this.f235650g) {
            contentValues.put("googlegmail", this.field_googlegmail);
        }
        if (this.f235651h) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f235652i) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f235653m) {
            contentValues.put("nicknameqp", this.field_nicknameqp);
        }
        if (this.f235654n) {
            contentValues.put("usernamepy", this.field_usernamepy);
        }
        if (this.f235655o) {
            contentValues.put("small_url", this.field_small_url);
        }
        if (this.f235656p) {
            contentValues.put("big_url", this.field_big_url);
        }
        if (this.f235657q) {
            contentValues.put("ret", java.lang.Integer.valueOf(this.field_ret));
        }
        if (this.f235658r) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f235659s) {
            contentValues.put("googleitemid", this.field_googleitemid);
        }
        if (this.f235660t) {
            contentValues.put("googlecgistatus", java.lang.Integer.valueOf(this.field_googlecgistatus));
        }
        if (this.f235661u) {
            contentValues.put("contecttype", this.field_contecttype);
        }
        if (this.f235662v) {
            contentValues.put("googlenamepy", this.field_googlenamepy);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGoogleFriend", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GoogleFriend ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235644x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGoogleFriend", "createTableSql %s", str2);
            k0Var.A("GoogleFriend", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GoogleFriend", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGoogleFriend", "updateTableSql %s", str3);
            k0Var.A("GoogleFriend", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGoogleFriend", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return R;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_googleitemid;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235643w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235643w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("googleid")) {
            this.field_googleid = contentValues.getAsString("googleid");
            if (z17) {
                this.f235647d = true;
            }
        }
        if (contentValues.containsKey("googlename")) {
            this.field_googlename = contentValues.getAsString("googlename");
            if (z17) {
                this.f235648e = true;
            }
        }
        if (contentValues.containsKey("googlephotourl")) {
            this.field_googlephotourl = contentValues.getAsString("googlephotourl");
            if (z17) {
                this.f235649f = true;
            }
        }
        if (contentValues.containsKey("googlegmail")) {
            this.field_googlegmail = contentValues.getAsString("googlegmail");
            if (z17) {
                this.f235650g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f235651h = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f235652i = true;
            }
        }
        if (contentValues.containsKey("nicknameqp")) {
            this.field_nicknameqp = contentValues.getAsString("nicknameqp");
            if (z17) {
                this.f235653m = true;
            }
        }
        if (contentValues.containsKey("usernamepy")) {
            this.field_usernamepy = contentValues.getAsString("usernamepy");
            if (z17) {
                this.f235654n = true;
            }
        }
        if (contentValues.containsKey("small_url")) {
            this.field_small_url = contentValues.getAsString("small_url");
            if (z17) {
                this.f235655o = true;
            }
        }
        if (contentValues.containsKey("big_url")) {
            this.field_big_url = contentValues.getAsString("big_url");
            if (z17) {
                this.f235656p = true;
            }
        }
        if (contentValues.containsKey("ret")) {
            this.field_ret = contentValues.getAsInteger("ret").intValue();
            if (z17) {
                this.f235657q = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f235658r = true;
            }
        }
        if (contentValues.containsKey("googleitemid")) {
            this.field_googleitemid = contentValues.getAsString("googleitemid");
            if (z17) {
                this.f235659s = true;
            }
        }
        if (contentValues.containsKey("googlecgistatus")) {
            this.field_googlecgistatus = contentValues.getAsInteger("googlecgistatus").intValue();
            if (z17) {
                this.f235660t = true;
            }
        }
        if (contentValues.containsKey("contecttype")) {
            this.field_contecttype = contentValues.getAsString("contecttype");
            if (z17) {
                this.f235661u = true;
            }
        }
        if (contentValues.containsKey("googlenamepy")) {
            this.field_googlenamepy = contentValues.getAsString("googlenamepy");
            if (z17) {
                this.f235662v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
