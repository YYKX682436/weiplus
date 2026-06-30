package dm;

/* loaded from: classes14.dex */
public class ec extends l75.f0 {
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
    public static final int f236712J;
    public static final l75.e0 K;
    public static final o75.e L;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236713p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236714q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f236715r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f236716s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f236717t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f236718u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f236719v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f236720w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f236721x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f236722y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f236723z;
    private int field_msgDate;
    private long field_msgLocalId;
    private long field_msgTime;
    private java.lang.String field_talker;
    private long field_tradeAmount;
    private int field_tradeDirection;
    private int field_tradeType;
    private java.lang.String field_tradeUser;
    private java.lang.String field_transferId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236724d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236725e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236726f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236727g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236728h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236729i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236730m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236731n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236732o = false;

    static {
        p75.n0 n0Var = new p75.n0("WalletLedgerRecord");
        f236713p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236714q = new p75.d("transferId", "string", tableName, "");
        p75.d dVar = new p75.d("talker", "string", tableName, "");
        f236715r = dVar;
        p75.d dVar2 = new p75.d("msgTime", "long", tableName, "");
        f236716s = dVar2;
        p75.d dVar3 = new p75.d("msgDate", "int", tableName, "");
        f236717t = dVar3;
        f236718u = new p75.d("msgLocalId", "long", tableName, "");
        f236719v = new p75.d("tradeUser", "string", tableName, "");
        p75.d dVar4 = new p75.d("tradeType", "int", tableName, "");
        f236720w = dVar4;
        f236721x = new p75.d("tradeAmount", "long", tableName, "");
        f236722y = new p75.d("tradeDirection", "int", tableName, "");
        p75.v f17 = n0Var.f("talkerTimeIndex");
        f17.b(dVar, dVar2);
        p75.w a17 = f17.a();
        p75.v f18 = n0Var.f("talkerDateIndex");
        f18.b(dVar, dVar3);
        p75.w a18 = f18.a();
        p75.v f19 = n0Var.f("talkerTypeTimeIndex");
        f19.b(dVar, dVar4, dVar2);
        f236723z = new java.lang.String[]{a17.f352636a, a18.f352636a, f19.a().f352636a};
        A = -1727368602;
        B = -881080743;
        C = 1343735278;
        D = 1343251151;
        E = -520067291;
        F = 752942927;
        G = 752919230;
        H = 1445827292;
        I = 1099531899;
        f236712J = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "transferId";
        ((java.util.HashMap) e0Var.f316955d).put("transferId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "transferId";
        e0Var.f316954c[1] = "talker";
        ((java.util.HashMap) e0Var.f316955d).put("talker", "TEXT");
        e0Var.f316954c[2] = "msgTime";
        ((java.util.HashMap) e0Var.f316955d).put("msgTime", "LONG default '-1' ");
        e0Var.f316954c[3] = "msgDate";
        ((java.util.HashMap) e0Var.f316955d).put("msgDate", "INTEGER default '-1' ");
        e0Var.f316954c[4] = "msgLocalId";
        ((java.util.HashMap) e0Var.f316955d).put("msgLocalId", "LONG default '-1' ");
        e0Var.f316954c[5] = "tradeUser";
        ((java.util.HashMap) e0Var.f316955d).put("tradeUser", "TEXT");
        e0Var.f316954c[6] = "tradeType";
        ((java.util.HashMap) e0Var.f316955d).put("tradeType", "INTEGER default '-1' ");
        e0Var.f316954c[7] = "tradeAmount";
        ((java.util.HashMap) e0Var.f316955d).put("tradeAmount", "LONG default '-1' ");
        e0Var.f316954c[8] = "tradeDirection";
        ((java.util.HashMap) e0Var.f316955d).put("tradeDirection", "INTEGER default '-1' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " transferId TEXT PRIMARY KEY ,  talker TEXT,  msgTime LONG default '-1' ,  msgDate INTEGER default '-1' ,  msgLocalId LONG default '-1' ,  tradeUser TEXT,  tradeType INTEGER default '-1' ,  tradeAmount LONG default '-1' ,  tradeDirection INTEGER default '-1' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        K = e0Var;
        L = new o75.e();
    }

    public static final p75.l0 G0(java.lang.String str) {
        p75.i0 i17 = f236713p.i();
        i17.f352657d = f236714q.j(str);
        i17.f352656c = "MicroMsg.SDK.BaseWalletLedgerRecord";
        return i17.a();
    }

    public int A0() {
        return this.field_tradeType;
    }

    public java.lang.String D0() {
        return this.field_tradeUser;
    }

    public java.lang.String F0() {
        return this.field_transferId;
    }

    public void I0(int i17) {
        this.field_msgDate = i17;
        this.f236727g = true;
    }

    public void J0(long j17) {
        this.field_msgLocalId = j17;
        this.f236728h = true;
    }

    public void L0(long j17) {
        this.field_msgTime = j17;
        this.f236726f = true;
    }

    public void P0(java.lang.String str) {
        this.field_talker = str;
        this.f236725e = true;
    }

    public void Q0(long j17) {
        this.field_tradeAmount = j17;
        this.f236731n = true;
    }

    public void R0(int i17) {
        this.field_tradeDirection = i17;
        this.f236732o = true;
    }

    public void T0(int i17) {
        this.field_tradeType = i17;
        this.f236730m = true;
    }

    public void U0(java.lang.String str) {
        this.field_tradeUser = str;
        this.f236729i = true;
    }

    public void W0(java.lang.String str) {
        this.field_transferId = str;
        this.f236724d = true;
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
            if (A == hashCode) {
                try {
                    this.field_transferId = cursor.getString(i17);
                    this.f236724d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_msgTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_msgDate = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_msgLocalId = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_tradeUser = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_tradeType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_tradeAmount = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_tradeDirection = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletLedgerRecord", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236712J == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236724d) {
            contentValues.put("transferId", this.field_transferId);
        }
        if (this.f236725e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f236726f) {
            contentValues.put("msgTime", java.lang.Long.valueOf(this.field_msgTime));
        }
        if (this.f236727g) {
            contentValues.put("msgDate", java.lang.Integer.valueOf(this.field_msgDate));
        }
        if (this.f236728h) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.field_msgLocalId));
        }
        if (this.f236729i) {
            contentValues.put("tradeUser", this.field_tradeUser);
        }
        if (this.f236730m) {
            contentValues.put("tradeType", java.lang.Integer.valueOf(this.field_tradeType));
        }
        if (this.f236731n) {
            contentValues.put("tradeAmount", java.lang.Long.valueOf(this.field_tradeAmount));
        }
        if (this.f236732o) {
            contentValues.put("tradeDirection", java.lang.Integer.valueOf(this.field_tradeDirection));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletLedgerRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletLedgerRecord ( ");
        l75.e0 e0Var = K;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236723z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "createTableSql %s", str2);
            k0Var.A("WalletLedgerRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletLedgerRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "updateTableSql %s", str3);
            k0Var.A("WalletLedgerRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return K;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return L;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_transferId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236713p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236713p.f352676a;
    }

    public long insertToDB(l75.k0 k0Var, boolean z17) {
        m75.c cVar;
        if (z17) {
            o75.c cVar2 = new o75.c(o75.b.f343582c, java.lang.String.valueOf(this.field_transferId), "MicroMsg.SDK.BaseWalletLedgerRecord");
            cVar2.f343590d = this;
            cVar = new m75.c(this, true, cVar2, L, "MicroMsg.SDK.BaseWalletLedgerRecord");
        } else {
            cVar = new m75.c(this, true, null, null, "MicroMsg.SDK.BaseWalletLedgerRecord");
        }
        return cVar.a(k0Var);
    }

    public int t0() {
        return this.field_msgDate;
    }

    public long u0() {
        return this.field_msgLocalId;
    }

    public int updateToDB(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(this.field_transferId), "MicroMsg.SDK.BaseWalletLedgerRecord");
            cVar.f343590d = this;
            eVar = new m75.e(this, cVar, L, "MicroMsg.SDK.BaseWalletLedgerRecord");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseWalletLedgerRecord");
        }
        return eVar.a(k0Var);
    }

    public long v0() {
        return this.field_msgTime;
    }

    public java.lang.String w0() {
        return this.field_talker;
    }

    public long y0() {
        return this.field_tradeAmount;
    }

    public int z0() {
        return this.field_tradeDirection;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("transferId")) {
            this.field_transferId = contentValues.getAsString("transferId");
            if (z17) {
                this.f236724d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236725e = true;
            }
        }
        if (contentValues.containsKey("msgTime")) {
            this.field_msgTime = contentValues.getAsLong("msgTime").longValue();
            if (z17) {
                this.f236726f = true;
            }
        }
        if (contentValues.containsKey("msgDate")) {
            this.field_msgDate = contentValues.getAsInteger("msgDate").intValue();
            if (z17) {
                this.f236727g = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.field_msgLocalId = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f236728h = true;
            }
        }
        if (contentValues.containsKey("tradeUser")) {
            this.field_tradeUser = contentValues.getAsString("tradeUser");
            if (z17) {
                this.f236729i = true;
            }
        }
        if (contentValues.containsKey("tradeType")) {
            this.field_tradeType = contentValues.getAsInteger("tradeType").intValue();
            if (z17) {
                this.f236730m = true;
            }
        }
        if (contentValues.containsKey("tradeAmount")) {
            this.field_tradeAmount = contentValues.getAsLong("tradeAmount").longValue();
            if (z17) {
                this.f236731n = true;
            }
        }
        if (contentValues.containsKey("tradeDirection")) {
            this.field_tradeDirection = contentValues.getAsInteger("tradeDirection").intValue();
            if (z17) {
                this.f236732o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
