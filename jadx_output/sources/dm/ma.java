package dm;

/* loaded from: classes4.dex */
public class ma extends l75.f0 {
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
    public static final int f238548J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f238549w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f238550x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238551y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238552z;
    public java.lang.String field_clientId;
    public long field_commentSvrID;
    public int field_commentflag;
    public int field_createTime;
    public byte[] field_curActionBuf;
    public short field_isRead;
    public int field_isReminding;
    public boolean field_isSend;
    public int field_isSilence;
    public int field_msgRelevanceType;
    public long field_parentID;
    public byte[] field_refActionBuf;
    public long field_snsID;
    public int field_springWishFlag;
    public java.lang.String field_talker;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238553d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238554e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238555f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238556g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238557h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238558i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238559m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238560n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238561o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238562p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238563q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238564r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238565s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238566t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f238567u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f238568v = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsComment");
        f238549w = n0Var;
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
        f238550x = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)"};
        f238551y = 109594771;
        f238552z = 1175162693;
        A = -1180158496;
        B = 1369213417;
        C = -881080743;
        D = 3575610;
        E = -1180128302;
        F = 1378908669;
        G = 64794890;
        H = 784608427;
        I = 908408390;
        f238548J = 2104075851;
        K = 1512848407;
        L = -1207860768;
        M = 115171378;
        N = -2013356365;
        P = 108705909;
        Q = initAutoDBInfo(dm.ma.class);
        R = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = "snsID";
        e0Var.f316955d.put("snsID", "LONG");
        e0Var.f316954c[1] = "parentID";
        e0Var.f316955d.put("parentID", "LONG");
        e0Var.f316954c[2] = "isRead";
        e0Var.f316955d.put("isRead", "SHORT default '0' ");
        e0Var.f316954c[3] = "createTime";
        e0Var.f316955d.put("createTime", "INTEGER");
        e0Var.f316954c[4] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[5] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[6] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER default 'false' ");
        e0Var.f316954c[7] = "curActionBuf";
        e0Var.f316955d.put("curActionBuf", "BLOB");
        e0Var.f316954c[8] = "refActionBuf";
        e0Var.f316955d.put("refActionBuf", "BLOB");
        e0Var.f316954c[9] = "commentSvrID";
        e0Var.f316955d.put("commentSvrID", "LONG");
        e0Var.f316954c[10] = com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, "TEXT");
        e0Var.f316954c[11] = "commentflag";
        e0Var.f316955d.put("commentflag", "INTEGER");
        e0Var.f316954c[12] = "isSilence";
        e0Var.f316955d.put("isSilence", "INTEGER default '0' ");
        e0Var.f316954c[13] = "springWishFlag";
        e0Var.f316955d.put("springWishFlag", "INTEGER default '0' ");
        e0Var.f316954c[14] = "msgRelevanceType";
        e0Var.f316955d.put("msgRelevanceType", "INTEGER default '0' ");
        e0Var.f316954c[15] = "isReminding";
        e0Var.f316955d.put("isReminding", "INTEGER default '0' ");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " snsID LONG,  parentID LONG,  isRead SHORT default '0' ,  createTime INTEGER,  talker TEXT,  type INTEGER,  isSend INTEGER default 'false' ,  curActionBuf BLOB,  refActionBuf BLOB,  commentSvrID LONG,  clientId TEXT,  commentflag INTEGER,  isSilence INTEGER default '0' ,  springWishFlag INTEGER default '0' ,  msgRelevanceType INTEGER default '0' ,  isReminding INTEGER default '0' ";
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
            if (f238551y == hashCode) {
                try {
                    this.field_snsID = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238552z == hashCode) {
                try {
                    this.field_parentID = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_isRead = cursor.getShort(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_curActionBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_refActionBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_commentSvrID = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_clientId = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238548J == hashCode) {
                try {
                    this.field_commentflag = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_isSilence = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_springWishFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_msgRelevanceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_isReminding = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsComment", th21, "convertFrom %s", columnNames[i17]);
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
        if (this.f238553d) {
            contentValues.put("snsID", java.lang.Long.valueOf(this.field_snsID));
        }
        if (this.f238554e) {
            contentValues.put("parentID", java.lang.Long.valueOf(this.field_parentID));
        }
        if (this.f238555f) {
            contentValues.put("isRead", java.lang.Short.valueOf(this.field_isRead));
        }
        if (this.f238556g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f238557h) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f238558i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238559m) {
            if (this.field_isSend) {
                contentValues.put("isSend", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSend", (java.lang.Integer) 0);
            }
        }
        if (this.f238560n) {
            contentValues.put("curActionBuf", this.field_curActionBuf);
        }
        if (this.f238561o) {
            contentValues.put("refActionBuf", this.field_refActionBuf);
        }
        if (this.f238562p) {
            contentValues.put("commentSvrID", java.lang.Long.valueOf(this.field_commentSvrID));
        }
        if (this.f238563q) {
            contentValues.put(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, this.field_clientId);
        }
        if (this.f238564r) {
            contentValues.put("commentflag", java.lang.Integer.valueOf(this.field_commentflag));
        }
        if (this.f238565s) {
            contentValues.put("isSilence", java.lang.Integer.valueOf(this.field_isSilence));
        }
        if (this.f238566t) {
            contentValues.put("springWishFlag", java.lang.Integer.valueOf(this.field_springWishFlag));
        }
        if (this.f238567u) {
            contentValues.put("msgRelevanceType", java.lang.Integer.valueOf(this.field_msgRelevanceType));
        }
        if (this.f238568v) {
            contentValues.put("isReminding", java.lang.Integer.valueOf(this.field_isReminding));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsComment", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsComment ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238550x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsComment", "createTableSql %s", str2);
            k0Var.A("SnsComment", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsComment", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsComment", "updateTableSql %s", str3);
            k0Var.A("SnsComment", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsComment", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238549w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238549w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsID")) {
            this.field_snsID = contentValues.getAsLong("snsID").longValue();
            if (z17) {
                this.f238553d = true;
            }
        }
        if (contentValues.containsKey("parentID")) {
            this.field_parentID = contentValues.getAsLong("parentID").longValue();
            if (z17) {
                this.f238554e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsShort("isRead").shortValue();
            if (z17) {
                this.f238555f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f238556g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238557h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238558i = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z17) {
                this.f238559m = true;
            }
        }
        if (contentValues.containsKey("curActionBuf")) {
            this.field_curActionBuf = contentValues.getAsByteArray("curActionBuf");
            if (z17) {
                this.f238560n = true;
            }
        }
        if (contentValues.containsKey("refActionBuf")) {
            this.field_refActionBuf = contentValues.getAsByteArray("refActionBuf");
            if (z17) {
                this.f238561o = true;
            }
        }
        if (contentValues.containsKey("commentSvrID")) {
            this.field_commentSvrID = contentValues.getAsLong("commentSvrID").longValue();
            if (z17) {
                this.f238562p = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID)) {
            this.field_clientId = contentValues.getAsString(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID);
            if (z17) {
                this.f238563q = true;
            }
        }
        if (contentValues.containsKey("commentflag")) {
            this.field_commentflag = contentValues.getAsInteger("commentflag").intValue();
            if (z17) {
                this.f238564r = true;
            }
        }
        if (contentValues.containsKey("isSilence")) {
            this.field_isSilence = contentValues.getAsInteger("isSilence").intValue();
            if (z17) {
                this.f238565s = true;
            }
        }
        if (contentValues.containsKey("springWishFlag")) {
            this.field_springWishFlag = contentValues.getAsInteger("springWishFlag").intValue();
            if (z17) {
                this.f238566t = true;
            }
        }
        if (contentValues.containsKey("msgRelevanceType")) {
            this.field_msgRelevanceType = contentValues.getAsInteger("msgRelevanceType").intValue();
            if (z17) {
                this.f238567u = true;
            }
        }
        if (contentValues.containsKey("isReminding")) {
            this.field_isReminding = contentValues.getAsInteger("isReminding").intValue();
            if (z17) {
                this.f238568v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
