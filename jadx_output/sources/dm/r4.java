package dm;

/* loaded from: classes10.dex */
public class r4 extends l75.f0 {
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
    public static final int f239606J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f239607v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f239608w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239609x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239610y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239611z;
    public byte[] field_businessBuf;
    public java.lang.String field_bypInfo;
    public int field_controlFlag;
    public int field_ctrlInfoType;
    public int field_exposureStatus;
    public java.lang.String field_feedId;
    public java.lang.String field_forcePushId;
    public long field_insertTime;
    public java.lang.String field_liveId;
    public int field_liveStatus;
    public long field_msgId;
    public java.lang.String field_noticeId;
    public java.lang.String field_revokeId;
    public java.lang.String field_talker;
    public java.lang.String field_tipsId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239612d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239613e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239614f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239615g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239616h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239617i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239618m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239619n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239620o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239621p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239622q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239623r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239624s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239625t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239626u = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveNotifyExposureInfo");
        f239607v = n0Var;
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
        f239608w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_revokeId_index ON FinderLiveNotifyExposureInfo(revokeId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_msgId_index ON FinderLiveNotifyExposureInfo(msgId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_liveId ON FinderLiveNotifyExposureInfo(liveId)"};
        f239609x = -255488447;
        f239610y = 104191100;
        f239611z = 207624153;
        A = 870321150;
        B = 1225207443;
        C = 966165798;
        D = -873566605;
        E = -1102434521;
        F = -1715674519;
        G = -544951136;
        H = -715330413;
        I = 350892871;
        f239606J = -1278410919;
        K = 1585269267;
        L = -881080743;
        M = 108705909;
        N = initAutoDBInfo(dm.r4.class);
        P = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "revokeId";
        e0Var.f316955d.put("revokeId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "revokeId";
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[2] = "exposureStatus";
        e0Var.f316955d.put("exposureStatus", "INTEGER default '0' ");
        e0Var.f316954c[3] = "liveStatus";
        e0Var.f316955d.put("liveStatus", "INTEGER default '1' ");
        e0Var.f316954c[4] = "businessBuf";
        e0Var.f316955d.put("businessBuf", "BLOB");
        e0Var.f316954c[5] = "insertTime";
        e0Var.f316955d.put("insertTime", "LONG");
        e0Var.f316954c[6] = "tipsId";
        e0Var.f316955d.put("tipsId", "TEXT");
        e0Var.f316954c[7] = "liveId";
        e0Var.f316955d.put("liveId", "TEXT");
        e0Var.f316954c[8] = "controlFlag";
        e0Var.f316955d.put("controlFlag", "INTEGER");
        e0Var.f316954c[9] = "forcePushId";
        e0Var.f316955d.put("forcePushId", "TEXT");
        e0Var.f316954c[10] = "ctrlInfoType";
        e0Var.f316955d.put("ctrlInfoType", "INTEGER default '0' ");
        e0Var.f316954c[11] = "bypInfo";
        e0Var.f316955d.put("bypInfo", "TEXT");
        e0Var.f316954c[12] = "feedId";
        e0Var.f316955d.put("feedId", "TEXT");
        e0Var.f316954c[13] = "noticeId";
        e0Var.f316955d.put("noticeId", "TEXT");
        e0Var.f316954c[14] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " revokeId TEXT PRIMARY KEY ,  msgId LONG,  exposureStatus INTEGER default '0' ,  liveStatus INTEGER default '1' ,  businessBuf BLOB,  insertTime LONG,  tipsId TEXT,  liveId TEXT,  controlFlag INTEGER,  forcePushId TEXT,  ctrlInfoType INTEGER default '0' ,  bypInfo TEXT,  feedId TEXT,  noticeId TEXT,  talker TEXT";
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
            if (f239609x == hashCode) {
                try {
                    this.field_revokeId = cursor.getString(i17);
                    this.f239612d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239610y == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239611z == hashCode) {
                try {
                    this.field_exposureStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_liveStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_businessBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_insertTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_tipsId = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_liveId = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_controlFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_forcePushId = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_ctrlInfoType = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_bypInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239606J == hashCode) {
                try {
                    this.field_feedId = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_noticeId = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239612d) {
            contentValues.put("revokeId", this.field_revokeId);
        }
        if (this.f239613e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f239614f) {
            contentValues.put("exposureStatus", java.lang.Integer.valueOf(this.field_exposureStatus));
        }
        if (this.f239615g) {
            contentValues.put("liveStatus", java.lang.Integer.valueOf(this.field_liveStatus));
        }
        if (this.f239616h) {
            contentValues.put("businessBuf", this.field_businessBuf);
        }
        if (this.f239617i) {
            contentValues.put("insertTime", java.lang.Long.valueOf(this.field_insertTime));
        }
        if (this.f239618m) {
            contentValues.put("tipsId", this.field_tipsId);
        }
        if (this.f239619n) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f239620o) {
            contentValues.put("controlFlag", java.lang.Integer.valueOf(this.field_controlFlag));
        }
        if (this.f239621p) {
            contentValues.put("forcePushId", this.field_forcePushId);
        }
        if (this.f239622q) {
            contentValues.put("ctrlInfoType", java.lang.Integer.valueOf(this.field_ctrlInfoType));
        }
        if (this.f239623r) {
            contentValues.put("bypInfo", this.field_bypInfo);
        }
        if (this.f239624s) {
            contentValues.put("feedId", this.field_feedId);
        }
        if (this.f239625t) {
            contentValues.put("noticeId", this.field_noticeId);
        }
        if (this.f239626u) {
            contentValues.put("talker", this.field_talker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveNotifyExposureInfo ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239608w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveNotifyExposureInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLiveNotifyExposureInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveNotifyExposureInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return N;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return P;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_revokeId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239607v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239607v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("revokeId")) {
            this.field_revokeId = contentValues.getAsString("revokeId");
            if (z17) {
                this.f239612d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f239613e = true;
            }
        }
        if (contentValues.containsKey("exposureStatus")) {
            this.field_exposureStatus = contentValues.getAsInteger("exposureStatus").intValue();
            if (z17) {
                this.f239614f = true;
            }
        }
        if (contentValues.containsKey("liveStatus")) {
            this.field_liveStatus = contentValues.getAsInteger("liveStatus").intValue();
            if (z17) {
                this.f239615g = true;
            }
        }
        if (contentValues.containsKey("businessBuf")) {
            this.field_businessBuf = contentValues.getAsByteArray("businessBuf");
            if (z17) {
                this.f239616h = true;
            }
        }
        if (contentValues.containsKey("insertTime")) {
            this.field_insertTime = contentValues.getAsLong("insertTime").longValue();
            if (z17) {
                this.f239617i = true;
            }
        }
        if (contentValues.containsKey("tipsId")) {
            this.field_tipsId = contentValues.getAsString("tipsId");
            if (z17) {
                this.f239618m = true;
            }
        }
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z17) {
                this.f239619n = true;
            }
        }
        if (contentValues.containsKey("controlFlag")) {
            this.field_controlFlag = contentValues.getAsInteger("controlFlag").intValue();
            if (z17) {
                this.f239620o = true;
            }
        }
        if (contentValues.containsKey("forcePushId")) {
            this.field_forcePushId = contentValues.getAsString("forcePushId");
            if (z17) {
                this.f239621p = true;
            }
        }
        if (contentValues.containsKey("ctrlInfoType")) {
            this.field_ctrlInfoType = contentValues.getAsInteger("ctrlInfoType").intValue();
            if (z17) {
                this.f239622q = true;
            }
        }
        if (contentValues.containsKey("bypInfo")) {
            this.field_bypInfo = contentValues.getAsString("bypInfo");
            if (z17) {
                this.f239623r = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsString("feedId");
            if (z17) {
                this.f239624s = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.field_noticeId = contentValues.getAsString("noticeId");
            if (z17) {
                this.f239625t = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f239626u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
