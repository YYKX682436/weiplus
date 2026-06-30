package dm;

/* loaded from: classes9.dex */
public class n3 extends l75.f0 {
    public static final o75.e A1;
    public static final p75.n0 E;
    public static final p75.d F;
    public static final java.lang.String[] G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f238641J;
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
    public static final int f238642l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f238643p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f238644p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f238645x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f238646x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f238647y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f238648y1;

    /* renamed from: z1, reason: collision with root package name */
    public static final l75.e0 f238649z1;
    public long field_datatotalsize;
    public long field_edittime;
    public java.lang.String field_ext;
    public r45.bq0 field_favProto;
    public int field_flag;
    public java.lang.String field_fromUser;
    public int field_id;
    public int field_itemStatus;
    public long field_localId;
    public int field_localSeq;
    public java.lang.String field_realChatName;
    public java.lang.String field_sessionId;
    public long field_sourceCreateTime;
    public java.lang.String field_sourceId;
    public int field_sourceType;
    public int field_subType;
    public r45.rq0 field_tagProto;
    public int field_targetID;
    public java.lang.String field_toUser;
    public java.lang.String field_transferCtx;
    public int field_type;
    public int field_updateSeq;
    public long field_updateTime;
    public java.lang.String field_xml;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238650d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238651e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238652f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238653g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238654h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238655i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238656m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238657n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238658o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238659p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238660q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238661r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238662s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f238663t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f238664u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f238665v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f238666w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f238667x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f238668y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f238669z = true;
    public boolean A = true;
    public boolean B = true;
    public boolean C = true;
    public boolean D = true;

    static {
        p75.n0 n0Var = new p75.n0("FavItemInfo");
        E = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        F = new p75.d("itemStatus", "int", tableName, "");
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
        G = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavItemInfo_id_Index ON FavItemInfo(id)", "CREATE INDEX IF NOT EXISTS FavItemInfo_type_Index ON FavItemInfo(type)", "CREATE INDEX IF NOT EXISTS FavItemInfo_updateSeq_Index ON FavItemInfo(updateSeq)", "CREATE INDEX IF NOT EXISTS FavItemInfo_flag_Index ON FavItemInfo(flag)", "CREATE INDEX IF NOT EXISTS FavItemInfo_sourceId_Index ON FavItemInfo(sourceId)", "CREATE INDEX IF NOT EXISTS FavItemInfo_datatotalsize_Index ON FavItemInfo(datatotalsize)"};
        H = 338409958;
        I = 3355;
        f238641J = 3575610;
        K = 1900783860;
        L = -1949209898;
        M = 3145580;
        N = 1746327190;
        P = 1999789285;
        Q = -1111431691;
        R = 1002154084;
        S = -295931082;
        T = -1244622187;
        U = -868828954;
        V = -1584572991;
        W = 1022166925;
        X = 118807;
        Y = 100897;
        Z = 1602989015;
        f238643p0 = -777729426;
        f238645x0 = 607796817;
        f238647y0 = -90666789;
        f238642l1 = -2008824260;
        f238644p1 = -441951636;
        f238646x1 = -1868521062;
        f238648y1 = 108705909;
        f238649z1 = initAutoDBInfo(dm.n3.class);
        A1 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[24];
        java.lang.String[] strArr = new java.lang.String[25];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "INTEGER");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "localSeq";
        e0Var.f316955d.put("localSeq", "INTEGER");
        e0Var.f316954c[4] = "updateSeq";
        e0Var.f316955d.put("updateSeq", "INTEGER");
        e0Var.f316954c[5] = "flag";
        e0Var.f316955d.put("flag", "INTEGER");
        e0Var.f316954c[6] = "sourceId";
        e0Var.f316955d.put("sourceId", "TEXT");
        e0Var.f316954c[7] = "itemStatus";
        e0Var.f316955d.put("itemStatus", "INTEGER");
        e0Var.f316954c[8] = "sourceType";
        e0Var.f316955d.put("sourceType", "INTEGER");
        e0Var.f316954c[9] = "sourceCreateTime";
        e0Var.f316955d.put("sourceCreateTime", "LONG");
        e0Var.f316954c[10] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[11] = "fromUser";
        e0Var.f316955d.put("fromUser", "TEXT");
        e0Var.f316954c[12] = "toUser";
        e0Var.f316955d.put("toUser", "TEXT");
        e0Var.f316954c[13] = "realChatName";
        e0Var.f316955d.put("realChatName", "TEXT");
        e0Var.f316954c[14] = "favProto";
        e0Var.f316955d.put("favProto", "BLOB");
        e0Var.f316954c[15] = "xml";
        e0Var.f316955d.put("xml", "TEXT");
        e0Var.f316954c[16] = "ext";
        e0Var.f316955d.put("ext", "TEXT");
        e0Var.f316954c[17] = "edittime";
        e0Var.f316955d.put("edittime", "LONG");
        e0Var.f316954c[18] = "tagProto";
        e0Var.f316955d.put("tagProto", "BLOB");
        e0Var.f316954c[19] = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "TEXT");
        e0Var.f316954c[20] = "datatotalsize";
        e0Var.f316955d.put("datatotalsize", "LONG");
        e0Var.f316954c[21] = "transferCtx";
        e0Var.f316955d.put("transferCtx", "TEXT default '' ");
        e0Var.f316954c[22] = "targetID";
        e0Var.f316955d.put("targetID", "INTEGER");
        e0Var.f316954c[23] = "subType";
        e0Var.f316955d.put("subType", "INTEGER");
        e0Var.f316954c[24] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  id INTEGER,  type INTEGER,  localSeq INTEGER,  updateSeq INTEGER,  flag INTEGER,  sourceId TEXT,  itemStatus INTEGER,  sourceType INTEGER,  sourceCreateTime LONG,  updateTime LONG,  fromUser TEXT,  toUser TEXT,  realChatName TEXT,  favProto BLOB,  xml TEXT,  ext TEXT,  edittime LONG,  tagProto BLOB,  sessionId TEXT,  datatotalsize LONG,  transferCtx TEXT default '' ,  targetID INTEGER,  subType INTEGER";
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
            if (H == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.f238650d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238641J == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_localSeq = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_updateSeq = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_sourceId = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_itemStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_sourceCreateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_fromUser = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_toUser = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_realChatName = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_favProto = (r45.bq0) new r45.bq0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_xml = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_ext = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                try {
                    this.field_edittime = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238643p0 == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_tagProto = (r45.rq0) new r45.rq0().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238645x0 == hashCode) {
                try {
                    this.field_sessionId = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238647y0 == hashCode) {
                try {
                    this.field_datatotalsize = cursor.getLong(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238642l1 == hashCode) {
                try {
                    this.field_transferCtx = cursor.getString(i17);
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238644p1 == hashCode) {
                try {
                    this.field_targetID = cursor.getInt(i17);
                } catch (java.lang.Throwable th28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th28, "convertFrom %s", columnNames[i17]);
                    java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238646x1 == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th29, "convertFrom %s", columnNames[i17]);
                    java.lang.String str24 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238648y1 == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238650d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f238651e) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
        }
        if (this.f238652f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238653g) {
            contentValues.put("localSeq", java.lang.Integer.valueOf(this.field_localSeq));
        }
        if (this.f238654h) {
            contentValues.put("updateSeq", java.lang.Integer.valueOf(this.field_updateSeq));
        }
        if (this.f238655i) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.field_flag));
        }
        if (this.f238656m) {
            contentValues.put("sourceId", this.field_sourceId);
        }
        if (this.f238657n) {
            contentValues.put("itemStatus", java.lang.Integer.valueOf(this.field_itemStatus));
        }
        if (this.f238658o) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        }
        if (this.f238659p) {
            contentValues.put("sourceCreateTime", java.lang.Long.valueOf(this.field_sourceCreateTime));
        }
        if (this.f238660q) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f238661r) {
            contentValues.put("fromUser", this.field_fromUser);
        }
        if (this.f238662s) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f238663t) {
            contentValues.put("realChatName", this.field_realChatName);
        }
        if (this.f238664u) {
            r45.bq0 bq0Var = this.field_favProto;
            if (bq0Var != null) {
                try {
                    contentValues.put("favProto", bq0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavItemInfo", e17.getMessage());
                }
            } else {
                contentValues.put("favProto", (byte[]) null);
            }
        }
        if (this.f238665v) {
            contentValues.put("xml", this.field_xml);
        }
        if (this.f238666w) {
            contentValues.put("ext", this.field_ext);
        }
        if (this.f238667x) {
            contentValues.put("edittime", java.lang.Long.valueOf(this.field_edittime));
        }
        if (this.f238668y) {
            r45.rq0 rq0Var = this.field_tagProto;
            if (rq0Var != null) {
                try {
                    contentValues.put("tagProto", rq0Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavItemInfo", e18.getMessage());
                }
            } else {
                contentValues.put("tagProto", (byte[]) null);
            }
        }
        if (this.f238669z) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
        }
        if (this.A) {
            contentValues.put("datatotalsize", java.lang.Long.valueOf(this.field_datatotalsize));
        }
        if (this.field_transferCtx == null) {
            this.field_transferCtx = "";
        }
        if (this.B) {
            contentValues.put("transferCtx", this.field_transferCtx);
        }
        if (this.C) {
            contentValues.put("targetID", java.lang.Integer.valueOf(this.field_targetID));
        }
        if (this.D) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavItemInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavItemInfo ( ");
        l75.e0 e0Var = f238649z1;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : G) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavItemInfo", "createTableSql %s", str2);
            k0Var.A("FavItemInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavItemInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavItemInfo", "updateTableSql %s", str3);
            k0Var.A("FavItemInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavItemInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238649z1;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A1;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return E;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return E.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
            n51.f.b(jSONObject, dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, "localSeq", java.lang.Integer.valueOf(this.field_localSeq));
            n51.f.b(jSONObject, "updateSeq", java.lang.Integer.valueOf(this.field_updateSeq));
            n51.f.b(jSONObject, "flag", java.lang.Integer.valueOf(this.field_flag));
            n51.f.b(jSONObject, "sourceId", this.field_sourceId);
            n51.f.b(jSONObject, "itemStatus", java.lang.Integer.valueOf(this.field_itemStatus));
            n51.f.b(jSONObject, "sourceType", java.lang.Integer.valueOf(this.field_sourceType));
            n51.f.b(jSONObject, "sourceCreateTime", java.lang.Long.valueOf(this.field_sourceCreateTime));
            n51.f.b(jSONObject, dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
            n51.f.b(jSONObject, "fromUser", this.field_fromUser);
            n51.f.b(jSONObject, "toUser", this.field_toUser);
            n51.f.b(jSONObject, "realChatName", this.field_realChatName);
            n51.f.b(jSONObject, "favProto", this.field_favProto);
            n51.f.b(jSONObject, "xml", this.field_xml);
            n51.f.b(jSONObject, "ext", this.field_ext);
            n51.f.b(jSONObject, "edittime", java.lang.Long.valueOf(this.field_edittime));
            n51.f.b(jSONObject, "tagProto", this.field_tagProto);
            n51.f.b(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.field_sessionId);
            n51.f.b(jSONObject, "datatotalsize", java.lang.Long.valueOf(this.field_datatotalsize));
            n51.f.b(jSONObject, "transferCtx", this.field_transferCtx);
            n51.f.b(jSONObject, "targetID", java.lang.Integer.valueOf(this.field_targetID));
            n51.f.b(jSONObject, "subType", java.lang.Integer.valueOf(this.field_subType));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f238650d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsInteger(dm.i4.COL_ID).intValue();
            if (z17) {
                this.f238651e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238652f = true;
            }
        }
        if (contentValues.containsKey("localSeq")) {
            this.field_localSeq = contentValues.getAsInteger("localSeq").intValue();
            if (z17) {
                this.f238653g = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsInteger("updateSeq").intValue();
            if (z17) {
                this.f238654h = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f238655i = true;
            }
        }
        if (contentValues.containsKey("sourceId")) {
            this.field_sourceId = contentValues.getAsString("sourceId");
            if (z17) {
                this.f238656m = true;
            }
        }
        if (contentValues.containsKey("itemStatus")) {
            this.field_itemStatus = contentValues.getAsInteger("itemStatus").intValue();
            if (z17) {
                this.f238657n = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f238658o = true;
            }
        }
        if (contentValues.containsKey("sourceCreateTime")) {
            this.field_sourceCreateTime = contentValues.getAsLong("sourceCreateTime").longValue();
            if (z17) {
                this.f238659p = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238660q = true;
            }
        }
        if (contentValues.containsKey("fromUser")) {
            this.field_fromUser = contentValues.getAsString("fromUser");
            if (z17) {
                this.f238661r = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z17) {
                this.f238662s = true;
            }
        }
        if (contentValues.containsKey("realChatName")) {
            this.field_realChatName = contentValues.getAsString("realChatName");
            if (z17) {
                this.f238663t = true;
            }
        }
        if (contentValues.containsKey("favProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("favProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_favProto = (r45.bq0) new r45.bq0().parseFrom(asByteArray);
                    if (z17) {
                        this.f238664u = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavItemInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("xml")) {
            this.field_xml = contentValues.getAsString("xml");
            if (z17) {
                this.f238665v = true;
            }
        }
        if (contentValues.containsKey("ext")) {
            this.field_ext = contentValues.getAsString("ext");
            if (z17) {
                this.f238666w = true;
            }
        }
        if (contentValues.containsKey("edittime")) {
            this.field_edittime = contentValues.getAsLong("edittime").longValue();
            if (z17) {
                this.f238667x = true;
            }
        }
        if (contentValues.containsKey("tagProto")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tagProto");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tagProto = (r45.rq0) new r45.rq0().parseFrom(asByteArray2);
                    if (z17) {
                        this.f238668y = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavItemInfo", e18.getMessage());
            }
        }
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.field_sessionId = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (z17) {
                this.f238669z = true;
            }
        }
        if (contentValues.containsKey("datatotalsize")) {
            this.field_datatotalsize = contentValues.getAsLong("datatotalsize").longValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("transferCtx")) {
            this.field_transferCtx = contentValues.getAsString("transferCtx");
            if (z17) {
                this.B = true;
            }
        }
        if (contentValues.containsKey("targetID")) {
            this.field_targetID = contentValues.getAsInteger("targetID").intValue();
            if (z17) {
                this.C = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.D = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
