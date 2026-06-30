package dm;

/* loaded from: classes12.dex */
public class n1 extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final java.lang.String[] D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f238600J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f238601u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f238602v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f238603w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f238604x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f238605y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f238606z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238607d = false;
    private java.lang.String field_MsgItemId = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f238608e = false;
    private long field_MsgId = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238609f = false;
    private java.lang.String field_FromUser = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f238610g = false;
    private int field_MsgType = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238611h = false;
    private int field_Status = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238612i = false;
    private long field_TotalLen = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238613m = false;
    private long field_LastLen = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238614n = false;
    private int field_ServerPriority = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238615o = false;
    private int field_ClientPriority = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238616p = false;
    private int field_Priority = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238617q = false;
    private int field_DownloadNow = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238618r = false;
    private long field_CreateTime = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238619s = false;
    private long field_ClickTime = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238620t = false;
    private int field_IsGroupMsg = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CPreDownloadDBInfo");
        f238601u = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238602v = new p75.d("MsgItemId", "string", tableName, "");
        f238603w = new p75.d("MsgId", "long", tableName, "");
        f238604x = new p75.d("FromUser", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238605y = new p75.d("Status", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238606z = new p75.d("LastLen", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("Priority", "int", tableName, "");
        B = new p75.d("DownloadNow", "int", tableName, "");
        C = new p75.d("CreateTime", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CreateTimeIndex ON C2CPreDownloadDBInfo(CreateTime)", "CREATE INDEX IF NOT EXISTS ClickTimeIndex ON C2CPreDownloadDBInfo(ClickTime)"};
        E = 243423823;
        F = 74638428;
        G = -1179978059;
        H = -1286563269;
        I = -1808614382;
        f238600J = -785269679;
        K = 1617567615;
        L = -1997150681;
        M = -2023906641;
        N = -1100816956;
        P = 456713486;
        Q = -932289015;
        R = 38905941;
        S = 1706538988;
        T = 108705909;
        U = initAutoDBInfo(dm.n1.class);
        V = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f316954c = strArr;
        strArr[0] = "MsgItemId";
        e0Var.f316955d.put("MsgItemId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "MsgItemId";
        e0Var.f316954c[1] = "MsgId";
        e0Var.f316955d.put("MsgId", "LONG default '0' ");
        e0Var.f316954c[2] = "FromUser";
        e0Var.f316955d.put("FromUser", "TEXT default '' ");
        e0Var.f316954c[3] = "MsgType";
        e0Var.f316955d.put("MsgType", "INTEGER default '0' ");
        e0Var.f316954c[4] = "Status";
        e0Var.f316955d.put("Status", "INTEGER default '0' ");
        e0Var.f316954c[5] = "TotalLen";
        e0Var.f316955d.put("TotalLen", "LONG default '0' ");
        e0Var.f316954c[6] = "LastLen";
        e0Var.f316955d.put("LastLen", "LONG default '0' ");
        e0Var.f316954c[7] = "ServerPriority";
        e0Var.f316955d.put("ServerPriority", "INTEGER default '0' ");
        e0Var.f316954c[8] = "ClientPriority";
        e0Var.f316955d.put("ClientPriority", "INTEGER default '0' ");
        e0Var.f316954c[9] = "Priority";
        e0Var.f316955d.put("Priority", "INTEGER default '0' ");
        e0Var.f316954c[10] = "DownloadNow";
        e0Var.f316955d.put("DownloadNow", "INTEGER default '0' ");
        e0Var.f316954c[11] = "CreateTime";
        e0Var.f316955d.put("CreateTime", "LONG default '0' ");
        e0Var.f316954c[12] = "ClickTime";
        e0Var.f316955d.put("ClickTime", "LONG default '0' ");
        e0Var.f316954c[13] = "IsGroupMsg";
        e0Var.f316955d.put("IsGroupMsg", "INTEGER default '0' ");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " MsgItemId TEXT PRIMARY KEY ,  MsgId LONG default '0' ,  FromUser TEXT default '' ,  MsgType INTEGER default '0' ,  Status INTEGER default '0' ,  TotalLen LONG default '0' ,  LastLen LONG default '0' ,  ServerPriority INTEGER default '0' ,  ClientPriority INTEGER default '0' ,  Priority INTEGER default '0' ,  DownloadNow INTEGER default '0' ,  CreateTime LONG default '0' ,  ClickTime LONG default '0' ,  IsGroupMsg INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public java.lang.String A0() {
        return this.field_MsgItemId;
    }

    public int D0() {
        return this.field_MsgType;
    }

    public int F0() {
        return this.field_Priority;
    }

    public int G0() {
        return this.field_ServerPriority;
    }

    public int I0() {
        return this.field_Status;
    }

    public long J0() {
        return this.field_TotalLen;
    }

    public void L0(long j17) {
        this.field_ClickTime = j17;
        this.f238619s = true;
    }

    public void P0(int i17) {
        this.field_ClientPriority = i17;
        this.f238615o = true;
    }

    public void Q0(long j17) {
        this.field_CreateTime = j17;
        this.f238618r = true;
    }

    public void R0(int i17) {
        this.field_DownloadNow = i17;
        this.f238617q = true;
    }

    public void T0(java.lang.String str) {
        this.field_FromUser = str;
        this.f238609f = true;
    }

    public void U0(int i17) {
        this.field_IsGroupMsg = i17;
        this.f238620t = true;
    }

    public void W0(long j17) {
        this.field_LastLen = j17;
        this.f238613m = true;
    }

    public void Y0(java.lang.String str) {
        this.field_MsgItemId = str;
        this.f238607d = true;
    }

    public void Z0(int i17) {
        this.field_MsgType = i17;
        this.f238610g = true;
    }

    public void a1(int i17) {
        this.field_Priority = i17;
        this.f238616p = true;
    }

    public void c1(int i17) {
        this.field_ServerPriority = i17;
        this.f238614n = true;
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
            if (E == hashCode) {
                try {
                    this.field_MsgItemId = cursor.getString(i17);
                    this.f238607d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_MsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_FromUser = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_MsgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_Status = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238600J == hashCode) {
                try {
                    this.field_TotalLen = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_LastLen = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_ServerPriority = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_ClientPriority = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_Priority = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_DownloadNow = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_CreateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_ClickTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_IsGroupMsg = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238607d) {
            contentValues.put("MsgItemId", this.field_MsgItemId);
        }
        if (this.f238608e) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.field_MsgId));
        }
        if (this.field_FromUser == null) {
            this.field_FromUser = "";
        }
        if (this.f238609f) {
            contentValues.put("FromUser", this.field_FromUser);
        }
        if (this.f238610g) {
            contentValues.put("MsgType", java.lang.Integer.valueOf(this.field_MsgType));
        }
        if (this.f238611h) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.field_Status));
        }
        if (this.f238612i) {
            contentValues.put("TotalLen", java.lang.Long.valueOf(this.field_TotalLen));
        }
        if (this.f238613m) {
            contentValues.put("LastLen", java.lang.Long.valueOf(this.field_LastLen));
        }
        if (this.f238614n) {
            contentValues.put("ServerPriority", java.lang.Integer.valueOf(this.field_ServerPriority));
        }
        if (this.f238615o) {
            contentValues.put("ClientPriority", java.lang.Integer.valueOf(this.field_ClientPriority));
        }
        if (this.f238616p) {
            contentValues.put("Priority", java.lang.Integer.valueOf(this.field_Priority));
        }
        if (this.f238617q) {
            contentValues.put("DownloadNow", java.lang.Integer.valueOf(this.field_DownloadNow));
        }
        if (this.f238618r) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.field_CreateTime));
        }
        if (this.f238619s) {
            contentValues.put("ClickTime", java.lang.Long.valueOf(this.field_ClickTime));
        }
        if (this.f238620t) {
            contentValues.put("IsGroupMsg", java.lang.Integer.valueOf(this.field_IsGroupMsg));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CPreDownloadDBInfo ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTableSql %s", str2);
            k0Var.A("C2CPreDownloadDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "C2CPreDownloadDBInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "updateTableSql %s", str3);
            k0Var.A("C2CPreDownloadDBInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public void d1(int i17) {
        this.field_Status = i17;
        this.f238611h = true;
    }

    public void e1(long j17) {
        this.field_TotalLen = j17;
        this.f238612i = true;
    }

    public long getCreateTime() {
        return this.field_CreateTime;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    public long getMsgId() {
        return this.field_MsgId;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return V;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_MsgItemId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238601u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238601u.f352676a;
    }

    public void setMsgId(long j17) {
        this.field_MsgId = j17;
        this.f238608e = true;
    }

    public long t0() {
        return this.field_ClickTime;
    }

    public int u0() {
        return this.field_ClientPriority;
    }

    public int v0() {
        return this.field_DownloadNow;
    }

    public java.lang.String w0() {
        return this.field_FromUser;
    }

    public int y0() {
        return this.field_IsGroupMsg;
    }

    public long z0() {
        return this.field_LastLen;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("MsgItemId")) {
            this.field_MsgItemId = contentValues.getAsString("MsgItemId");
            if (z17) {
                this.f238607d = true;
            }
        }
        if (contentValues.containsKey("MsgId")) {
            this.field_MsgId = contentValues.getAsLong("MsgId").longValue();
            if (z17) {
                this.f238608e = true;
            }
        }
        if (contentValues.containsKey("FromUser")) {
            this.field_FromUser = contentValues.getAsString("FromUser");
            if (z17) {
                this.f238609f = true;
            }
        }
        if (contentValues.containsKey("MsgType")) {
            this.field_MsgType = contentValues.getAsInteger("MsgType").intValue();
            if (z17) {
                this.f238610g = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.field_Status = contentValues.getAsInteger("Status").intValue();
            if (z17) {
                this.f238611h = true;
            }
        }
        if (contentValues.containsKey("TotalLen")) {
            this.field_TotalLen = contentValues.getAsLong("TotalLen").longValue();
            if (z17) {
                this.f238612i = true;
            }
        }
        if (contentValues.containsKey("LastLen")) {
            this.field_LastLen = contentValues.getAsLong("LastLen").longValue();
            if (z17) {
                this.f238613m = true;
            }
        }
        if (contentValues.containsKey("ServerPriority")) {
            this.field_ServerPriority = contentValues.getAsInteger("ServerPriority").intValue();
            if (z17) {
                this.f238614n = true;
            }
        }
        if (contentValues.containsKey("ClientPriority")) {
            this.field_ClientPriority = contentValues.getAsInteger("ClientPriority").intValue();
            if (z17) {
                this.f238615o = true;
            }
        }
        if (contentValues.containsKey("Priority")) {
            this.field_Priority = contentValues.getAsInteger("Priority").intValue();
            if (z17) {
                this.f238616p = true;
            }
        }
        if (contentValues.containsKey("DownloadNow")) {
            this.field_DownloadNow = contentValues.getAsInteger("DownloadNow").intValue();
            if (z17) {
                this.f238617q = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsLong("CreateTime").longValue();
            if (z17) {
                this.f238618r = true;
            }
        }
        if (contentValues.containsKey("ClickTime")) {
            this.field_ClickTime = contentValues.getAsLong("ClickTime").longValue();
            if (z17) {
                this.f238619s = true;
            }
        }
        if (contentValues.containsKey("IsGroupMsg")) {
            this.field_IsGroupMsg = contentValues.getAsInteger("IsGroupMsg").intValue();
            if (z17) {
                this.f238620t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
