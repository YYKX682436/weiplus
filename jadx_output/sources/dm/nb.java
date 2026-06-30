package dm;

/* loaded from: classes15.dex */
public class nb extends l75.f0 {
    public static final p75.n0 C;
    public static final java.lang.String[] D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f238791J;
    public static final int K;
    public static final int L;
    public static final int M;
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
    public static final o75.e f238792l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f238793p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f238794x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f238795y0;
    public long field_begin_time;
    public java.lang.String field_block_mask;
    public byte[] field_cardTpInfoData;
    public java.lang.String field_card_id;
    public java.lang.String field_card_tp_id;
    public int field_card_type;
    public long field_create_time;
    public byte[] field_dataInfoData;
    public int field_delete_state_flag;
    public long field_end_time;
    public java.lang.String field_from_username;
    public boolean field_is_dynamic;
    public java.lang.String field_label_wording;
    public long field_local_updateTime;
    public byte[] field_shareInfoData;
    public byte[] field_shopInfoData;
    public int field_status;
    public java.lang.String field_stickyAnnouncement;
    public int field_stickyEndTime;
    public int field_stickyIndex;
    public long field_updateSeq;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238796d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238797e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238798f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238799g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238800h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238801i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238802m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238803n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238804o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238805p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238806q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238807r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238808s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238809t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f238810u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f238811v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f238812w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f238813x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f238814y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f238815z = true;
    public boolean A = true;
    public boolean B = true;

    static {
        p75.n0 n0Var = new p75.n0("UserCardInfo");
        C = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS UserCardInfo_card_type_index ON UserCardInfo(card_type)"};
        E = 553933994;
        F = 993874895;
        G = -45243957;
        H = -892481550;
        I = -709538450;
        f238791J = 1178839178;
        K = -295931082;
        L = -1949209898;
        M = -493574096;
        N = 1112183971;
        P = 1725551537;
        Q = 1286327134;
        R = 1504693058;
        S = 1666431812;
        T = 97592951;
        U = -907236722;
        V = 2132201577;
        W = 1090750495;
        X = 1442069968;
        Y = -245025015;
        Z = 1584393805;
        f238793p0 = -669890006;
        f238794x0 = 108705909;
        f238795y0 = initAutoDBInfo(dm.nb.class);
        f238792l1 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[22];
        java.lang.String[] strArr = new java.lang.String[23];
        e0Var.f316954c = strArr;
        strArr[0] = "card_id";
        e0Var.f316955d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "card_id";
        e0Var.f316954c[1] = "card_tp_id";
        e0Var.f316955d.put("card_tp_id", "TEXT");
        e0Var.f316954c[2] = "from_username";
        e0Var.f316955d.put("from_username", "TEXT");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "delete_state_flag";
        e0Var.f316955d.put("delete_state_flag", "INTEGER");
        e0Var.f316954c[5] = "local_updateTime";
        e0Var.f316955d.put("local_updateTime", "LONG");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[7] = "updateSeq";
        e0Var.f316955d.put("updateSeq", "LONG");
        e0Var.f316954c[8] = "create_time";
        e0Var.f316955d.put("create_time", "LONG");
        e0Var.f316954c[9] = "begin_time";
        e0Var.f316955d.put("begin_time", "LONG");
        e0Var.f316954c[10] = "end_time";
        e0Var.f316955d.put("end_time", "LONG");
        e0Var.f316954c[11] = "block_mask";
        e0Var.f316955d.put("block_mask", "TEXT");
        e0Var.f316954c[12] = "dataInfoData";
        e0Var.f316955d.put("dataInfoData", "BLOB");
        e0Var.f316954c[13] = "cardTpInfoData";
        e0Var.f316955d.put("cardTpInfoData", "BLOB");
        e0Var.f316954c[14] = "shareInfoData";
        e0Var.f316955d.put("shareInfoData", "BLOB");
        e0Var.f316954c[15] = "shopInfoData";
        e0Var.f316955d.put("shopInfoData", "BLOB");
        e0Var.f316954c[16] = "stickyIndex";
        e0Var.f316955d.put("stickyIndex", "INTEGER");
        e0Var.f316954c[17] = "stickyEndTime";
        e0Var.f316955d.put("stickyEndTime", "INTEGER");
        e0Var.f316954c[18] = "stickyAnnouncement";
        e0Var.f316955d.put("stickyAnnouncement", "TEXT");
        e0Var.f316954c[19] = "card_type";
        e0Var.f316955d.put("card_type", "INTEGER default '-1' ");
        e0Var.f316954c[20] = "label_wording";
        e0Var.f316955d.put("label_wording", "TEXT");
        e0Var.f316954c[21] = "is_dynamic";
        e0Var.f316955d.put("is_dynamic", "INTEGER");
        e0Var.f316954c[22] = "rowid";
        e0Var.f316956e = " card_id TEXT PRIMARY KEY ,  card_tp_id TEXT,  from_username TEXT,  status INTEGER,  delete_state_flag INTEGER,  local_updateTime LONG,  updateTime LONG,  updateSeq LONG,  create_time LONG,  begin_time LONG,  end_time LONG,  block_mask TEXT,  dataInfoData BLOB,  cardTpInfoData BLOB,  shareInfoData BLOB,  shopInfoData BLOB,  stickyIndex INTEGER,  stickyEndTime INTEGER,  stickyAnnouncement TEXT,  card_type INTEGER default '-1' ,  label_wording TEXT,  is_dynamic INTEGER";
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
            if (E == hashCode) {
                try {
                    this.field_card_id = cursor.getString(i17);
                    this.f238796d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_card_tp_id = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_from_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_delete_state_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238791J == hashCode) {
                try {
                    this.field_local_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_updateSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_create_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_begin_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_end_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_block_mask = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_dataInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_cardTpInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_shareInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_shopInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_stickyIndex = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_stickyEndTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_stickyAnnouncement = cursor.getString(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_card_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                try {
                    this.field_label_wording = cursor.getString(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238793p0 == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_is_dynamic = z17;
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238794x0 == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238796d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f238797e) {
            contentValues.put("card_tp_id", this.field_card_tp_id);
        }
        if (this.f238798f) {
            contentValues.put("from_username", this.field_from_username);
        }
        if (this.f238799g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f238800h) {
            contentValues.put("delete_state_flag", java.lang.Integer.valueOf(this.field_delete_state_flag));
        }
        if (this.f238801i) {
            contentValues.put("local_updateTime", java.lang.Long.valueOf(this.field_local_updateTime));
        }
        if (this.f238802m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f238803n) {
            contentValues.put("updateSeq", java.lang.Long.valueOf(this.field_updateSeq));
        }
        if (this.f238804o) {
            contentValues.put("create_time", java.lang.Long.valueOf(this.field_create_time));
        }
        if (this.f238805p) {
            contentValues.put("begin_time", java.lang.Long.valueOf(this.field_begin_time));
        }
        if (this.f238806q) {
            contentValues.put("end_time", java.lang.Long.valueOf(this.field_end_time));
        }
        if (this.f238807r) {
            contentValues.put("block_mask", this.field_block_mask);
        }
        if (this.f238808s) {
            contentValues.put("dataInfoData", this.field_dataInfoData);
        }
        if (this.f238809t) {
            contentValues.put("cardTpInfoData", this.field_cardTpInfoData);
        }
        if (this.f238810u) {
            contentValues.put("shareInfoData", this.field_shareInfoData);
        }
        if (this.f238811v) {
            contentValues.put("shopInfoData", this.field_shopInfoData);
        }
        if (this.f238812w) {
            contentValues.put("stickyIndex", java.lang.Integer.valueOf(this.field_stickyIndex));
        }
        if (this.f238813x) {
            contentValues.put("stickyEndTime", java.lang.Integer.valueOf(this.field_stickyEndTime));
        }
        if (this.f238814y) {
            contentValues.put("stickyAnnouncement", this.field_stickyAnnouncement);
        }
        if (this.f238815z) {
            contentValues.put("card_type", java.lang.Integer.valueOf(this.field_card_type));
        }
        if (this.A) {
            contentValues.put("label_wording", this.field_label_wording);
        }
        if (this.B) {
            if (this.field_is_dynamic) {
                contentValues.put("is_dynamic", (java.lang.Integer) 1);
            } else {
                contentValues.put("is_dynamic", (java.lang.Integer) 0);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUserCardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UserCardInfo ( ");
        l75.e0 e0Var = f238795y0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserCardInfo", "createTableSql %s", str2);
            k0Var.A("UserCardInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "UserCardInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserCardInfo", "updateTableSql %s", str3);
            k0Var.A("UserCardInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserCardInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238795y0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238792l1;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return C;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return C.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z17) {
                this.f238796d = true;
            }
        }
        if (contentValues.containsKey("card_tp_id")) {
            this.field_card_tp_id = contentValues.getAsString("card_tp_id");
            if (z17) {
                this.f238797e = true;
            }
        }
        if (contentValues.containsKey("from_username")) {
            this.field_from_username = contentValues.getAsString("from_username");
            if (z17) {
                this.f238798f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f238799g = true;
            }
        }
        if (contentValues.containsKey("delete_state_flag")) {
            this.field_delete_state_flag = contentValues.getAsInteger("delete_state_flag").intValue();
            if (z17) {
                this.f238800h = true;
            }
        }
        if (contentValues.containsKey("local_updateTime")) {
            this.field_local_updateTime = contentValues.getAsLong("local_updateTime").longValue();
            if (z17) {
                this.f238801i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238802m = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsLong("updateSeq").longValue();
            if (z17) {
                this.f238803n = true;
            }
        }
        if (contentValues.containsKey("create_time")) {
            this.field_create_time = contentValues.getAsLong("create_time").longValue();
            if (z17) {
                this.f238804o = true;
            }
        }
        if (contentValues.containsKey("begin_time")) {
            this.field_begin_time = contentValues.getAsLong("begin_time").longValue();
            if (z17) {
                this.f238805p = true;
            }
        }
        if (contentValues.containsKey("end_time")) {
            this.field_end_time = contentValues.getAsLong("end_time").longValue();
            if (z17) {
                this.f238806q = true;
            }
        }
        if (contentValues.containsKey("block_mask")) {
            this.field_block_mask = contentValues.getAsString("block_mask");
            if (z17) {
                this.f238807r = true;
            }
        }
        if (contentValues.containsKey("dataInfoData")) {
            this.field_dataInfoData = contentValues.getAsByteArray("dataInfoData");
            if (z17) {
                this.f238808s = true;
            }
        }
        if (contentValues.containsKey("cardTpInfoData")) {
            this.field_cardTpInfoData = contentValues.getAsByteArray("cardTpInfoData");
            if (z17) {
                this.f238809t = true;
            }
        }
        if (contentValues.containsKey("shareInfoData")) {
            this.field_shareInfoData = contentValues.getAsByteArray("shareInfoData");
            if (z17) {
                this.f238810u = true;
            }
        }
        if (contentValues.containsKey("shopInfoData")) {
            this.field_shopInfoData = contentValues.getAsByteArray("shopInfoData");
            if (z17) {
                this.f238811v = true;
            }
        }
        if (contentValues.containsKey("stickyIndex")) {
            this.field_stickyIndex = contentValues.getAsInteger("stickyIndex").intValue();
            if (z17) {
                this.f238812w = true;
            }
        }
        if (contentValues.containsKey("stickyEndTime")) {
            this.field_stickyEndTime = contentValues.getAsInteger("stickyEndTime").intValue();
            if (z17) {
                this.f238813x = true;
            }
        }
        if (contentValues.containsKey("stickyAnnouncement")) {
            this.field_stickyAnnouncement = contentValues.getAsString("stickyAnnouncement");
            if (z17) {
                this.f238814y = true;
            }
        }
        if (contentValues.containsKey("card_type")) {
            this.field_card_type = contentValues.getAsInteger("card_type").intValue();
            if (z17) {
                this.f238815z = true;
            }
        }
        if (contentValues.containsKey("label_wording")) {
            this.field_label_wording = contentValues.getAsString("label_wording");
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("is_dynamic")) {
            this.field_is_dynamic = contentValues.getAsInteger("is_dynamic").intValue() != 0;
            if (z17) {
                this.B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
