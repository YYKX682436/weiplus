package dm;

/* loaded from: classes13.dex */
public class n7 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f238708q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238709r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238710s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238711t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238712u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238713v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238714w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238715x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238716y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238717z;
    public int field_action;
    public java.lang.String field_anchorId;
    public int field_dayOfWeek;
    public int field_hasDisturbance;
    public int field_hourOfDay;
    public int field_isReddotScoreValid;
    public java.lang.String field_reddotId;
    public float field_reddotScore;
    public long field_timestamp;
    public java.lang.String field_title;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238718d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238719e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238720f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238721g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238722h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238723i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238724m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238725n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238726o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238727p = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveHomeRedDotEvent");
        f238708q = n0Var;
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
        f238709r = new java.lang.String[0];
        f238710s = -780838317;
        f238711t = -1734738164;
        f238712u = -402110886;
        f238713v = -971181392;
        f238714w = 110371416;
        f238715x = -142210860;
        f238716y = -1422950858;
        f238717z = -730552025;
        A = 985252545;
        B = 55126294;
        C = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f316954c = strArr;
        strArr[0] = "reddotId";
        ((java.util.HashMap) e0Var.f316955d).put("reddotId", "TEXT");
        e0Var.f316954c[1] = "isReddotScoreValid";
        ((java.util.HashMap) e0Var.f316955d).put("isReddotScoreValid", "INTEGER");
        e0Var.f316954c[2] = "reddotScore";
        ((java.util.HashMap) e0Var.f316955d).put("reddotScore", "FLOAT");
        e0Var.f316954c[3] = "anchorId";
        ((java.util.HashMap) e0Var.f316955d).put("anchorId", "TEXT");
        e0Var.f316954c[4] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        ((java.util.HashMap) e0Var.f316955d).put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[5] = "hasDisturbance";
        ((java.util.HashMap) e0Var.f316955d).put("hasDisturbance", "INTEGER");
        e0Var.f316954c[6] = "action";
        ((java.util.HashMap) e0Var.f316955d).put("action", "INTEGER");
        e0Var.f316954c[7] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f316955d).put("dayOfWeek", "INTEGER");
        e0Var.f316954c[8] = "hourOfDay";
        ((java.util.HashMap) e0Var.f316955d).put("hourOfDay", "INTEGER");
        e0Var.f316954c[9] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        ((java.util.HashMap) e0Var.f316955d).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[10] = "rowid";
        e0Var.f316956e = " reddotId TEXT,  isReddotScoreValid INTEGER,  reddotScore FLOAT,  anchorId TEXT,  title TEXT,  hasDisturbance INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  timestamp LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        D = e0Var;
        E = new o75.e();
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
            if (f238710s == hashCode) {
                try {
                    this.field_reddotId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238711t == hashCode) {
                try {
                    this.field_isReddotScoreValid = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238712u == hashCode) {
                try {
                    this.field_reddotScore = cursor.getFloat(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238713v == hashCode) {
                try {
                    this.field_anchorId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238714w == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238715x == hashCode) {
                try {
                    this.field_hasDisturbance = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238716y == hashCode) {
                try {
                    this.field_action = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238717z == hashCode) {
                try {
                    this.field_dayOfWeek = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_hourOfDay = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238718d) {
            contentValues.put("reddotId", this.field_reddotId);
        }
        if (this.f238719e) {
            contentValues.put("isReddotScoreValid", java.lang.Integer.valueOf(this.field_isReddotScoreValid));
        }
        if (this.f238720f) {
            contentValues.put("reddotScore", java.lang.Float.valueOf(this.field_reddotScore));
        }
        if (this.f238721g) {
            contentValues.put("anchorId", this.field_anchorId);
        }
        if (this.f238722h) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f238723i) {
            contentValues.put("hasDisturbance", java.lang.Integer.valueOf(this.field_hasDisturbance));
        }
        if (this.f238724m) {
            contentValues.put("action", java.lang.Integer.valueOf(this.field_action));
        }
        if (this.f238725n) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.field_dayOfWeek));
        }
        if (this.f238726o) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.field_hourOfDay));
        }
        if (this.f238727p) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveHomeRedDotEvent ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238709r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTableSql %s", str2);
            k0Var.A("LiveHomeRedDotEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiveHomeRedDotEvent", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "updateTableSql %s", str3);
            k0Var.A("LiveHomeRedDotEvent", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return E;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238708q;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238708q.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reddotId")) {
            this.field_reddotId = contentValues.getAsString("reddotId");
            if (z17) {
                this.f238718d = true;
            }
        }
        if (contentValues.containsKey("isReddotScoreValid")) {
            this.field_isReddotScoreValid = contentValues.getAsInteger("isReddotScoreValid").intValue();
            if (z17) {
                this.f238719e = true;
            }
        }
        if (contentValues.containsKey("reddotScore")) {
            this.field_reddotScore = contentValues.getAsFloat("reddotScore").floatValue();
            if (z17) {
                this.f238720f = true;
            }
        }
        if (contentValues.containsKey("anchorId")) {
            this.field_anchorId = contentValues.getAsString("anchorId");
            if (z17) {
                this.f238721g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f238722h = true;
            }
        }
        if (contentValues.containsKey("hasDisturbance")) {
            this.field_hasDisturbance = contentValues.getAsInteger("hasDisturbance").intValue();
            if (z17) {
                this.f238723i = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.field_action = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f238724m = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.field_dayOfWeek = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f238725n = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.field_hourOfDay = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f238726o = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f238727p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
