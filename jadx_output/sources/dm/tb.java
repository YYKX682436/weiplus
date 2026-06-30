package dm;

/* loaded from: classes13.dex */
public class tb extends l75.f0 {
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
    public static final int f240178J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final l75.e0 S;
    public static final o75.e T;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.n0 f240179x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f240180y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240181z;
    public java.lang.String field_clientid;
    public long field_createtime;
    public java.lang.String field_filename;
    public int field_filenowsize;
    public java.lang.String field_human;
    public long field_lastmodifytime;
    public long field_msgid;
    public int field_msglocalid;
    public int field_nettimes;
    public int field_offset;
    public int field_reserved1;
    public java.lang.String field_reserved2;
    public int field_status;
    public int field_totallen;
    public java.lang.String field_user;
    public int field_voiceformat;
    public int field_voicelenght;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240182d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240183e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240184f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240185g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240186h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240187i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240188m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240189n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240190o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240191p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240192q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240193r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240194s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240195t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240196u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240197v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f240198w = true;

    static {
        p75.n0 n0Var = new p75.n0("VoiceRemindInfo");
        f240179x = n0Var;
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
        f240180y = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS voiceRemindFileNameIndex ON VoiceRemindInfo(filename)"};
        f240181z = -734768633;
        A = 3599307;
        B = 104192092;
        C = -1019779949;
        D = -1928440101;
        E = -849883055;
        F = -892481550;
        G = 1370166729;
        H = -572019299;
        I = 908409382;
        f240178J = 642510128;
        K = 2110247717;
        L = 99639597;
        M = 480095145;
        N = 1310513097;
        P = 2022955529;
        Q = 2022955530;
        R = 108705909;
        S = initAutoDBInfo(dm.tb.class);
        T = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[17];
        java.lang.String[] strArr = new java.lang.String[18];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, "TEXT");
        e0Var.f316954c[1] = "user";
        e0Var.f316955d.put("user", "TEXT");
        e0Var.f316954c[2] = "msgid";
        e0Var.f316955d.put("msgid", "LONG");
        e0Var.f316954c[3] = "offset";
        e0Var.f316955d.put("offset", "INTEGER");
        e0Var.f316954c[4] = "filenowsize";
        e0Var.f316955d.put("filenowsize", "INTEGER");
        e0Var.f316954c[5] = "totallen";
        e0Var.f316955d.put("totallen", "INTEGER");
        e0Var.f316954c[6] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[7] = "createtime";
        e0Var.f316955d.put("createtime", "LONG");
        e0Var.f316954c[8] = "lastmodifytime";
        e0Var.f316955d.put("lastmodifytime", "LONG");
        e0Var.f316954c[9] = "clientid";
        e0Var.f316955d.put("clientid", "TEXT");
        e0Var.f316954c[10] = "voicelenght";
        e0Var.f316955d.put("voicelenght", "INTEGER");
        e0Var.f316954c[11] = "msglocalid";
        e0Var.f316955d.put("msglocalid", "INTEGER");
        e0Var.f316954c[12] = "human";
        e0Var.f316955d.put("human", "TEXT");
        e0Var.f316954c[13] = "voiceformat";
        e0Var.f316955d.put("voiceformat", "INTEGER");
        e0Var.f316954c[14] = "nettimes";
        e0Var.f316955d.put("nettimes", "INTEGER");
        e0Var.f316954c[15] = "reserved1";
        e0Var.f316955d.put("reserved1", "INTEGER");
        e0Var.f316954c[16] = "reserved2";
        e0Var.f316955d.put("reserved2", "TEXT");
        e0Var.f316954c[17] = "rowid";
        e0Var.f316956e = " filename TEXT,  user TEXT,  msgid LONG,  offset INTEGER,  filenowsize INTEGER,  totallen INTEGER,  status INTEGER,  createtime LONG,  lastmodifytime LONG,  clientid TEXT,  voicelenght INTEGER,  msglocalid INTEGER,  human TEXT,  voiceformat INTEGER,  nettimes INTEGER,  reserved1 INTEGER,  reserved2 TEXT";
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
            if (f240181z == hashCode) {
                try {
                    this.field_filename = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_user = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_msgid = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_offset = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_filenowsize = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_totallen = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_lastmodifytime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_clientid = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240178J == hashCode) {
                try {
                    this.field_voicelenght = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_msglocalid = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_human = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_voiceformat = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_nettimes = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_reserved1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_reserved2 = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240182d) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, this.field_filename);
        }
        if (this.f240183e) {
            contentValues.put("user", this.field_user);
        }
        if (this.f240184f) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.field_msgid));
        }
        if (this.f240185g) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.field_offset));
        }
        if (this.f240186h) {
            contentValues.put("filenowsize", java.lang.Integer.valueOf(this.field_filenowsize));
        }
        if (this.f240187i) {
            contentValues.put("totallen", java.lang.Integer.valueOf(this.field_totallen));
        }
        if (this.f240188m) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f240189n) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        if (this.f240190o) {
            contentValues.put("lastmodifytime", java.lang.Long.valueOf(this.field_lastmodifytime));
        }
        if (this.f240191p) {
            contentValues.put("clientid", this.field_clientid);
        }
        if (this.f240192q) {
            contentValues.put("voicelenght", java.lang.Integer.valueOf(this.field_voicelenght));
        }
        if (this.f240193r) {
            contentValues.put("msglocalid", java.lang.Integer.valueOf(this.field_msglocalid));
        }
        if (this.f240194s) {
            contentValues.put("human", this.field_human);
        }
        if (this.f240195t) {
            contentValues.put("voiceformat", java.lang.Integer.valueOf(this.field_voiceformat));
        }
        if (this.f240196u) {
            contentValues.put("nettimes", java.lang.Integer.valueOf(this.field_nettimes));
        }
        if (this.f240197v) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.field_reserved1));
        }
        if (this.f240198w) {
            contentValues.put("reserved2", this.field_reserved2);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseVoiceRemindInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS VoiceRemindInfo ( ");
        l75.e0 e0Var = S;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240180y) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceRemindInfo", "createTableSql %s", str2);
            k0Var.A("VoiceRemindInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "VoiceRemindInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceRemindInfo", "updateTableSql %s", str3);
            k0Var.A("VoiceRemindInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceRemindInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return S;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return T;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240179x;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240179x.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME)) {
            this.field_filename = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
            if (z17) {
                this.f240182d = true;
            }
        }
        if (contentValues.containsKey("user")) {
            this.field_user = contentValues.getAsString("user");
            if (z17) {
                this.f240183e = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f240184f = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z17) {
                this.f240185g = true;
            }
        }
        if (contentValues.containsKey("filenowsize")) {
            this.field_filenowsize = contentValues.getAsInteger("filenowsize").intValue();
            if (z17) {
                this.f240186h = true;
            }
        }
        if (contentValues.containsKey("totallen")) {
            this.field_totallen = contentValues.getAsInteger("totallen").intValue();
            if (z17) {
                this.f240187i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f240188m = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f240189n = true;
            }
        }
        if (contentValues.containsKey("lastmodifytime")) {
            this.field_lastmodifytime = contentValues.getAsLong("lastmodifytime").longValue();
            if (z17) {
                this.f240190o = true;
            }
        }
        if (contentValues.containsKey("clientid")) {
            this.field_clientid = contentValues.getAsString("clientid");
            if (z17) {
                this.f240191p = true;
            }
        }
        if (contentValues.containsKey("voicelenght")) {
            this.field_voicelenght = contentValues.getAsInteger("voicelenght").intValue();
            if (z17) {
                this.f240192q = true;
            }
        }
        if (contentValues.containsKey("msglocalid")) {
            this.field_msglocalid = contentValues.getAsInteger("msglocalid").intValue();
            if (z17) {
                this.f240193r = true;
            }
        }
        if (contentValues.containsKey("human")) {
            this.field_human = contentValues.getAsString("human");
            if (z17) {
                this.f240194s = true;
            }
        }
        if (contentValues.containsKey("voiceformat")) {
            this.field_voiceformat = contentValues.getAsInteger("voiceformat").intValue();
            if (z17) {
                this.f240195t = true;
            }
        }
        if (contentValues.containsKey("nettimes")) {
            this.field_nettimes = contentValues.getAsInteger("nettimes").intValue();
            if (z17) {
                this.f240196u = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z17) {
                this.f240197v = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsString("reserved2");
            if (z17) {
                this.f240198w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
