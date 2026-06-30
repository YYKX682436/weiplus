package dm;

/* loaded from: classes13.dex */
public class j8 extends l75.f0 {
    public static final p75.n0 B;
    public static final java.lang.String[] C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f237842J;
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

    /* renamed from: p0, reason: collision with root package name */
    public static final l75.e0 f237843p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f237844x0;
    public long field_beginShowTime;
    public long field_disappearTime;
    public java.lang.String field_dynamicPath;
    public long field_exposureDisappearTime;
    public long field_exposureTime;
    public java.lang.String field_extInfo;
    public java.lang.String field_icon_url;
    public java.lang.String field_lang;
    public int field_maxClientVersion;
    public int field_minClientVersion;
    public long field_overdueTime;
    public r45.sm6 field_parents;
    public int field_path;
    public int field_priority;
    public java.lang.String field_regCountry;
    public int field_showType;
    public int field_state;
    public int field_tipId;
    public int field_tipType;
    public java.lang.String field_title;
    public java.lang.String field_uniqueId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237845d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237846e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237847f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237848g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237849h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237850i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237851m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237852n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237853o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237854p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237855q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237856r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237857s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237858t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237859u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237860v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237861w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237862x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f237863y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f237864z = true;
    public boolean A = true;

    static {
        p75.n0 n0Var = new p75.n0("NewTipsInfo2");
        B = n0Var;
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
        C = new java.lang.String[0];
        D = -294460212;
        E = 3433509;
        F = -338815017;
        G = 110371416;
        H = -737588055;
        I = -793375479;
        f237842J = 110366486;
        K = -1165461084;
        L = -1311637899;
        M = 376569651;
        N = -1648924556;
        P = 1637261197;
        Q = -1596363504;
        R = 111723337;
        S = 1359467867;
        T = 1423336329;
        U = -1306498449;
        V = 109757585;
        W = -258801404;
        X = 3314158;
        Y = -1348655006;
        Z = 108705909;
        f237843p0 = initAutoDBInfo(dm.j8.class);
        f237844x0 = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[21];
        java.lang.String[] strArr = new java.lang.String[22];
        e0Var.f316954c = strArr;
        strArr[0] = "uniqueId";
        e0Var.f316955d.put("uniqueId", "TEXT");
        e0Var.f316954c[1] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "INTEGER");
        e0Var.f316954c[2] = "showType";
        e0Var.f316955d.put("showType", "INTEGER");
        e0Var.f316954c[3] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[4] = "icon_url";
        e0Var.f316955d.put("icon_url", "TEXT");
        e0Var.f316954c[5] = "parents";
        e0Var.f316955d.put("parents", "BLOB");
        e0Var.f316954c[6] = "tipId";
        e0Var.f316955d.put("tipId", "INTEGER");
        e0Var.f316954c[7] = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "INTEGER");
        e0Var.f316954c[8] = "tipType";
        e0Var.f316955d.put("tipType", "INTEGER");
        e0Var.f316954c[9] = "beginShowTime";
        e0Var.f316955d.put("beginShowTime", "LONG");
        e0Var.f316954c[10] = dm.n.COL_EXPOSURETIME;
        e0Var.f316955d.put(dm.n.COL_EXPOSURETIME, "LONG");
        e0Var.f316954c[11] = "overdueTime";
        e0Var.f316955d.put("overdueTime", "LONG");
        e0Var.f316954c[12] = "disappearTime";
        e0Var.f316955d.put("disappearTime", "LONG");
        e0Var.f316954c[13] = "exposureDisappearTime";
        e0Var.f316955d.put("exposureDisappearTime", "LONG");
        e0Var.f316954c[14] = "minClientVersion";
        e0Var.f316955d.put("minClientVersion", "INTEGER");
        e0Var.f316954c[15] = "maxClientVersion";
        e0Var.f316955d.put("maxClientVersion", "INTEGER");
        e0Var.f316954c[16] = "extInfo";
        e0Var.f316955d.put("extInfo", "TEXT");
        e0Var.f316954c[17] = "state";
        e0Var.f316955d.put("state", "INTEGER default '0' ");
        e0Var.f316954c[18] = "dynamicPath";
        e0Var.f316955d.put("dynamicPath", "TEXT");
        e0Var.f316954c[19] = "lang";
        e0Var.f316955d.put("lang", "TEXT");
        e0Var.f316954c[20] = "regCountry";
        e0Var.f316955d.put("regCountry", "TEXT");
        e0Var.f316954c[21] = "rowid";
        e0Var.f316956e = " uniqueId TEXT,  path INTEGER,  showType INTEGER,  title TEXT,  icon_url TEXT,  parents BLOB,  tipId INTEGER,  priority INTEGER,  tipType INTEGER,  beginShowTime LONG,  exposureTime LONG,  overdueTime LONG,  disappearTime LONG,  exposureDisappearTime LONG,  minClientVersion INTEGER,  maxClientVersion INTEGER,  extInfo TEXT,  state INTEGER default '0' ,  dynamicPath TEXT,  lang TEXT,  regCountry TEXT";
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
            if (D == hashCode) {
                try {
                    this.field_uniqueId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_path = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_showType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_icon_url = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_parents = (r45.sm6) new r45.sm6().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237842J == hashCode) {
                try {
                    this.field_tipId = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_priority = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_tipType = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_beginShowTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_exposureTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_overdueTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_disappearTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_exposureDisappearTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_minClientVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_maxClientVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_extInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_dynamicPath = cursor.getString(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                try {
                    this.field_lang = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_regCountry = cursor.getString(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237845d) {
            contentValues.put("uniqueId", this.field_uniqueId);
        }
        if (this.f237846e) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, java.lang.Integer.valueOf(this.field_path));
        }
        if (this.f237847f) {
            contentValues.put("showType", java.lang.Integer.valueOf(this.field_showType));
        }
        if (this.f237848g) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f237849h) {
            contentValues.put("icon_url", this.field_icon_url);
        }
        if (this.f237850i) {
            r45.sm6 sm6Var = this.field_parents;
            if (sm6Var != null) {
                try {
                    contentValues.put("parents", sm6Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo2", e17.getMessage());
                }
            } else {
                contentValues.put("parents", (byte[]) null);
            }
        }
        if (this.f237851m) {
            contentValues.put("tipId", java.lang.Integer.valueOf(this.field_tipId));
        }
        if (this.f237852n) {
            contentValues.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, java.lang.Integer.valueOf(this.field_priority));
        }
        if (this.f237853o) {
            contentValues.put("tipType", java.lang.Integer.valueOf(this.field_tipType));
        }
        if (this.f237854p) {
            contentValues.put("beginShowTime", java.lang.Long.valueOf(this.field_beginShowTime));
        }
        if (this.f237855q) {
            contentValues.put(dm.n.COL_EXPOSURETIME, java.lang.Long.valueOf(this.field_exposureTime));
        }
        if (this.f237856r) {
            contentValues.put("overdueTime", java.lang.Long.valueOf(this.field_overdueTime));
        }
        if (this.f237857s) {
            contentValues.put("disappearTime", java.lang.Long.valueOf(this.field_disappearTime));
        }
        if (this.f237858t) {
            contentValues.put("exposureDisappearTime", java.lang.Long.valueOf(this.field_exposureDisappearTime));
        }
        if (this.f237859u) {
            contentValues.put("minClientVersion", java.lang.Integer.valueOf(this.field_minClientVersion));
        }
        if (this.f237860v) {
            contentValues.put("maxClientVersion", java.lang.Integer.valueOf(this.field_maxClientVersion));
        }
        if (this.f237861w) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f237862x) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f237863y) {
            contentValues.put("dynamicPath", this.field_dynamicPath);
        }
        if (this.f237864z) {
            contentValues.put("lang", this.field_lang);
        }
        if (this.A) {
            contentValues.put("regCountry", this.field_regCountry);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NewTipsInfo2 ( ");
        l75.e0 e0Var = f237843p0;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : C) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo2", "createTableSql %s", str2);
            k0Var.A("NewTipsInfo2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "NewTipsInfo2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo2", "updateTableSql %s", str3);
            k0Var.A("NewTipsInfo2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNewTipsInfo2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237843p0;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237844x0;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return B;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return B.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("uniqueId")) {
            this.field_uniqueId = contentValues.getAsString("uniqueId");
            if (z17) {
                this.f237845d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsInteger(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH).intValue();
            if (z17) {
                this.f237846e = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.field_showType = contentValues.getAsInteger("showType").intValue();
            if (z17) {
                this.f237847f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f237848g = true;
            }
        }
        if (contentValues.containsKey("icon_url")) {
            this.field_icon_url = contentValues.getAsString("icon_url");
            if (z17) {
                this.f237849h = true;
            }
        }
        if (contentValues.containsKey("parents")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("parents");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_parents = (r45.sm6) new r45.sm6().parseFrom(asByteArray);
                    if (z17) {
                        this.f237850i = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNewTipsInfo2", e17.getMessage());
            }
        }
        if (contentValues.containsKey("tipId")) {
            this.field_tipId = contentValues.getAsInteger("tipId").intValue();
            if (z17) {
                this.f237851m = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY)) {
            this.field_priority = contentValues.getAsInteger(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY).intValue();
            if (z17) {
                this.f237852n = true;
            }
        }
        if (contentValues.containsKey("tipType")) {
            this.field_tipType = contentValues.getAsInteger("tipType").intValue();
            if (z17) {
                this.f237853o = true;
            }
        }
        if (contentValues.containsKey("beginShowTime")) {
            this.field_beginShowTime = contentValues.getAsLong("beginShowTime").longValue();
            if (z17) {
                this.f237854p = true;
            }
        }
        if (contentValues.containsKey(dm.n.COL_EXPOSURETIME)) {
            this.field_exposureTime = contentValues.getAsLong(dm.n.COL_EXPOSURETIME).longValue();
            if (z17) {
                this.f237855q = true;
            }
        }
        if (contentValues.containsKey("overdueTime")) {
            this.field_overdueTime = contentValues.getAsLong("overdueTime").longValue();
            if (z17) {
                this.f237856r = true;
            }
        }
        if (contentValues.containsKey("disappearTime")) {
            this.field_disappearTime = contentValues.getAsLong("disappearTime").longValue();
            if (z17) {
                this.f237857s = true;
            }
        }
        if (contentValues.containsKey("exposureDisappearTime")) {
            this.field_exposureDisappearTime = contentValues.getAsLong("exposureDisappearTime").longValue();
            if (z17) {
                this.f237858t = true;
            }
        }
        if (contentValues.containsKey("minClientVersion")) {
            this.field_minClientVersion = contentValues.getAsInteger("minClientVersion").intValue();
            if (z17) {
                this.f237859u = true;
            }
        }
        if (contentValues.containsKey("maxClientVersion")) {
            this.field_maxClientVersion = contentValues.getAsInteger("maxClientVersion").intValue();
            if (z17) {
                this.f237860v = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z17) {
                this.f237861w = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f237862x = true;
            }
        }
        if (contentValues.containsKey("dynamicPath")) {
            this.field_dynamicPath = contentValues.getAsString("dynamicPath");
            if (z17) {
                this.f237863y = true;
            }
        }
        if (contentValues.containsKey("lang")) {
            this.field_lang = contentValues.getAsString("lang");
            if (z17) {
                this.f237864z = true;
            }
        }
        if (contentValues.containsKey("regCountry")) {
            this.field_regCountry = contentValues.getAsString("regCountry");
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
