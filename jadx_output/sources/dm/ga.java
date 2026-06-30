package dm;

/* loaded from: classes15.dex */
public class ga extends l75.f0 {
    public static final java.lang.String[] A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f237187J;
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
    public static final l75.e0 W;
    public static final o75.e X;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f237188z;
    public java.lang.String field_app_id;
    public long field_begin_time;
    public long field_block_mask;
    public byte[] field_cardTpInfoData;
    public java.lang.String field_card_id;
    public java.lang.String field_card_tp_id;
    public int field_categoryType;
    public java.lang.String field_consumer;
    public byte[] field_dataInfoData;
    public long field_end_time;
    public java.lang.String field_from_username;
    public int field_itemIndex;
    public long field_local_updateTime;
    public byte[] field_shareInfoData;
    public long field_share_time;
    public byte[] field_shopInfoData;
    public int field_status;
    public long field_updateSeq;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237189d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237190e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237191f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237192g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237193h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237194i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237195m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237196n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237197o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237198p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237199q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237200r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237201s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237202t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237203u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237204v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237205w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237206x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f237207y = true;

    static {
        p75.n0 n0Var = new p75.n0("ShareCardInfo");
        f237188z = n0Var;
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
        A = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS ShareCardInfo_card_tp_id_index ON ShareCardInfo(card_tp_id)"};
        B = 553933994;
        C = 993874895;
        D = -45243957;
        E = -567770122;
        F = -1411074055;
        G = -892481550;
        H = -1787965651;
        I = 1178839178;
        f237187J = -295931082;
        K = 1112183971;
        L = 1725551537;
        M = -1949209898;
        N = 1286327134;
        P = 1504693058;
        Q = 1666431812;
        R = 97592951;
        S = -907236722;
        T = 426250584;
        U = 2133307775;
        V = 108705909;
        W = initAutoDBInfo(dm.ga.class);
        X = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
        e0Var.f316954c = strArr;
        strArr[0] = "card_id";
        e0Var.f316955d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "card_id";
        e0Var.f316954c[1] = "card_tp_id";
        e0Var.f316955d.put("card_tp_id", "TEXT");
        e0Var.f316954c[2] = "from_username";
        e0Var.f316955d.put("from_username", "TEXT");
        e0Var.f316954c[3] = "consumer";
        e0Var.f316955d.put("consumer", "TEXT");
        e0Var.f316954c[4] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, "TEXT");
        e0Var.f316954c[5] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[6] = "share_time";
        e0Var.f316955d.put("share_time", "LONG");
        e0Var.f316954c[7] = "local_updateTime";
        e0Var.f316955d.put("local_updateTime", "LONG");
        e0Var.f316954c[8] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[9] = "begin_time";
        e0Var.f316955d.put("begin_time", "LONG");
        e0Var.f316954c[10] = "end_time";
        e0Var.f316955d.put("end_time", "LONG");
        e0Var.f316954c[11] = "updateSeq";
        e0Var.f316955d.put("updateSeq", "LONG");
        e0Var.f316954c[12] = "block_mask";
        e0Var.f316955d.put("block_mask", "LONG");
        e0Var.f316954c[13] = "dataInfoData";
        e0Var.f316955d.put("dataInfoData", "BLOB");
        e0Var.f316954c[14] = "cardTpInfoData";
        e0Var.f316955d.put("cardTpInfoData", "BLOB");
        e0Var.f316954c[15] = "shareInfoData";
        e0Var.f316955d.put("shareInfoData", "BLOB");
        e0Var.f316954c[16] = "shopInfoData";
        e0Var.f316955d.put("shopInfoData", "BLOB");
        e0Var.f316954c[17] = "categoryType";
        e0Var.f316955d.put("categoryType", "INTEGER default '0' ");
        e0Var.f316954c[18] = "itemIndex";
        e0Var.f316955d.put("itemIndex", "INTEGER default '0' ");
        e0Var.f316954c[19] = "rowid";
        e0Var.f316956e = " card_id TEXT PRIMARY KEY ,  card_tp_id TEXT,  from_username TEXT,  consumer TEXT,  app_id TEXT,  status INTEGER,  share_time LONG,  local_updateTime LONG,  updateTime LONG,  begin_time LONG,  end_time LONG,  updateSeq LONG,  block_mask LONG,  dataInfoData BLOB,  cardTpInfoData BLOB,  shareInfoData BLOB,  shopInfoData BLOB,  categoryType INTEGER default '0' ,  itemIndex INTEGER default '0' ";
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
            if (B == hashCode) {
                try {
                    this.field_card_id = cursor.getString(i17);
                    this.f237189d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_card_tp_id = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_from_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_consumer = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_app_id = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_share_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_local_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237187J == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_begin_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_end_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_updateSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_block_mask = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_dataInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_cardTpInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_shareInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_shopInfoData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_categoryType = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_itemIndex = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237189d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f237190e) {
            contentValues.put("card_tp_id", this.field_card_tp_id);
        }
        if (this.f237191f) {
            contentValues.put("from_username", this.field_from_username);
        }
        if (this.f237192g) {
            contentValues.put("consumer", this.field_consumer);
        }
        if (this.f237193h) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, this.field_app_id);
        }
        if (this.f237194i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f237195m) {
            contentValues.put("share_time", java.lang.Long.valueOf(this.field_share_time));
        }
        if (this.f237196n) {
            contentValues.put("local_updateTime", java.lang.Long.valueOf(this.field_local_updateTime));
        }
        if (this.f237197o) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f237198p) {
            contentValues.put("begin_time", java.lang.Long.valueOf(this.field_begin_time));
        }
        if (this.f237199q) {
            contentValues.put("end_time", java.lang.Long.valueOf(this.field_end_time));
        }
        if (this.f237200r) {
            contentValues.put("updateSeq", java.lang.Long.valueOf(this.field_updateSeq));
        }
        if (this.f237201s) {
            contentValues.put("block_mask", java.lang.Long.valueOf(this.field_block_mask));
        }
        if (this.f237202t) {
            contentValues.put("dataInfoData", this.field_dataInfoData);
        }
        if (this.f237203u) {
            contentValues.put("cardTpInfoData", this.field_cardTpInfoData);
        }
        if (this.f237204v) {
            contentValues.put("shareInfoData", this.field_shareInfoData);
        }
        if (this.f237205w) {
            contentValues.put("shopInfoData", this.field_shopInfoData);
        }
        if (this.f237206x) {
            contentValues.put("categoryType", java.lang.Integer.valueOf(this.field_categoryType));
        }
        if (this.f237207y) {
            contentValues.put("itemIndex", java.lang.Integer.valueOf(this.field_itemIndex));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShareCardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShareCardInfo ( ");
        l75.e0 e0Var = W;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardInfo", "createTableSql %s", str2);
            k0Var.A("ShareCardInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShareCardInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardInfo", "updateTableSql %s", str3);
            k0Var.A("ShareCardInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShareCardInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return W;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return X;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237188z;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237188z.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z17) {
                this.f237189d = true;
            }
        }
        if (contentValues.containsKey("card_tp_id")) {
            this.field_card_tp_id = contentValues.getAsString("card_tp_id");
            if (z17) {
                this.f237190e = true;
            }
        }
        if (contentValues.containsKey("from_username")) {
            this.field_from_username = contentValues.getAsString("from_username");
            if (z17) {
                this.f237191f = true;
            }
        }
        if (contentValues.containsKey("consumer")) {
            this.field_consumer = contentValues.getAsString("consumer");
            if (z17) {
                this.f237192g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID)) {
            this.field_app_id = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            if (z17) {
                this.f237193h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237194i = true;
            }
        }
        if (contentValues.containsKey("share_time")) {
            this.field_share_time = contentValues.getAsLong("share_time").longValue();
            if (z17) {
                this.f237195m = true;
            }
        }
        if (contentValues.containsKey("local_updateTime")) {
            this.field_local_updateTime = contentValues.getAsLong("local_updateTime").longValue();
            if (z17) {
                this.f237196n = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237197o = true;
            }
        }
        if (contentValues.containsKey("begin_time")) {
            this.field_begin_time = contentValues.getAsLong("begin_time").longValue();
            if (z17) {
                this.f237198p = true;
            }
        }
        if (contentValues.containsKey("end_time")) {
            this.field_end_time = contentValues.getAsLong("end_time").longValue();
            if (z17) {
                this.f237199q = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsLong("updateSeq").longValue();
            if (z17) {
                this.f237200r = true;
            }
        }
        if (contentValues.containsKey("block_mask")) {
            this.field_block_mask = contentValues.getAsLong("block_mask").longValue();
            if (z17) {
                this.f237201s = true;
            }
        }
        if (contentValues.containsKey("dataInfoData")) {
            this.field_dataInfoData = contentValues.getAsByteArray("dataInfoData");
            if (z17) {
                this.f237202t = true;
            }
        }
        if (contentValues.containsKey("cardTpInfoData")) {
            this.field_cardTpInfoData = contentValues.getAsByteArray("cardTpInfoData");
            if (z17) {
                this.f237203u = true;
            }
        }
        if (contentValues.containsKey("shareInfoData")) {
            this.field_shareInfoData = contentValues.getAsByteArray("shareInfoData");
            if (z17) {
                this.f237204v = true;
            }
        }
        if (contentValues.containsKey("shopInfoData")) {
            this.field_shopInfoData = contentValues.getAsByteArray("shopInfoData");
            if (z17) {
                this.f237205w = true;
            }
        }
        if (contentValues.containsKey("categoryType")) {
            this.field_categoryType = contentValues.getAsInteger("categoryType").intValue();
            if (z17) {
                this.f237206x = true;
            }
        }
        if (contentValues.containsKey("itemIndex")) {
            this.field_itemIndex = contentValues.getAsInteger("itemIndex").intValue();
            if (z17) {
                this.f237207y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
