package dm;

/* loaded from: classes8.dex */
public class n8 extends l75.f0 {
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
    public static final l75.e0 f238728J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f238729t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f238730u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238731v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238732w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238733x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238734y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238735z;
    public float field_autoDisappearTime;
    public long field_bindFeedId;
    public int field_conditions;
    public float field_delayAppearTime;
    public int field_deliverScenes;
    public int field_excludeDays;
    public long field_expireTime;
    public long field_feedMediaTypes;
    public java.lang.String field_feedPos;
    public boolean field_isFromJumper;
    public boolean field_isPreview;
    public long field_startTime;
    public long field_taskId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238736d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238737e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238738f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238739g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238740h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238741i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238742m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238743n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238744o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238745p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238746q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238747r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238748s = true;

    static {
        p75.n0 n0Var = new p75.n0("NpsSurveyTaskConfig");
        f238729t = n0Var;
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
        f238730u = new java.lang.String[0];
        f238731v = -880873088;
        f238732w = -930859336;
        f238733x = -976025642;
        f238734y = -1408450836;
        f238735z = -2129294769;
        A = -834724724;
        B = 1202373969;
        C = -897963202;
        D = 29921253;
        E = 521581473;
        F = 877992755;
        G = -222574993;
        H = 504442358;
        I = 108705909;
        f238728J = initAutoDBInfo(dm.n8.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "taskId";
        e0Var.f316955d.put("taskId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "taskId";
        e0Var.f316954c[1] = "conditions";
        e0Var.f316955d.put("conditions", "INTEGER");
        e0Var.f316954c[2] = "feedPos";
        e0Var.f316955d.put("feedPos", "TEXT default '' ");
        e0Var.f316954c[3] = "deliverScenes";
        e0Var.f316955d.put("deliverScenes", "INTEGER");
        e0Var.f316954c[4] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[5] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG");
        e0Var.f316954c[6] = "excludeDays";
        e0Var.f316955d.put("excludeDays", "INTEGER");
        e0Var.f316954c[7] = "isPreview";
        e0Var.f316955d.put("isPreview", "INTEGER default 'false' ");
        e0Var.f316954c[8] = "delayAppearTime";
        e0Var.f316955d.put("delayAppearTime", "FLOAT");
        e0Var.f316954c[9] = "autoDisappearTime";
        e0Var.f316955d.put("autoDisappearTime", "FLOAT");
        e0Var.f316954c[10] = "feedMediaTypes";
        e0Var.f316955d.put("feedMediaTypes", "LONG");
        e0Var.f316954c[11] = "isFromJumper";
        e0Var.f316955d.put("isFromJumper", "INTEGER default 'false' ");
        e0Var.f316954c[12] = "bindFeedId";
        e0Var.f316955d.put("bindFeedId", "LONG");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " taskId LONG PRIMARY KEY ,  conditions INTEGER,  feedPos TEXT default '' ,  deliverScenes INTEGER,  startTime LONG,  expireTime LONG,  excludeDays INTEGER,  isPreview INTEGER default 'false' ,  delayAppearTime FLOAT,  autoDisappearTime FLOAT,  feedMediaTypes LONG,  isFromJumper INTEGER default 'false' ,  bindFeedId LONG";
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
            if (f238731v == hashCode) {
                try {
                    this.field_taskId = cursor.getLong(i17);
                    this.f238736d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238732w == hashCode) {
                try {
                    this.field_conditions = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238733x == hashCode) {
                try {
                    this.field_feedPos = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238734y == hashCode) {
                try {
                    this.field_deliverScenes = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238735z == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_excludeDays = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isPreview = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_delayAppearTime = cursor.getFloat(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_autoDisappearTime = cursor.getFloat(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_feedMediaTypes = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isFromJumper = z17;
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_bindFeedId = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238736d) {
            contentValues.put("taskId", java.lang.Long.valueOf(this.field_taskId));
        }
        if (this.f238737e) {
            contentValues.put("conditions", java.lang.Integer.valueOf(this.field_conditions));
        }
        if (this.field_feedPos == null) {
            this.field_feedPos = "";
        }
        if (this.f238738f) {
            contentValues.put("feedPos", this.field_feedPos);
        }
        if (this.f238739g) {
            contentValues.put("deliverScenes", java.lang.Integer.valueOf(this.field_deliverScenes));
        }
        if (this.f238740h) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f238741i) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
        }
        if (this.f238742m) {
            contentValues.put("excludeDays", java.lang.Integer.valueOf(this.field_excludeDays));
        }
        if (this.f238743n) {
            if (this.field_isPreview) {
                contentValues.put("isPreview", (java.lang.Integer) 1);
            } else {
                contentValues.put("isPreview", (java.lang.Integer) 0);
            }
        }
        if (this.f238744o) {
            contentValues.put("delayAppearTime", java.lang.Float.valueOf(this.field_delayAppearTime));
        }
        if (this.f238745p) {
            contentValues.put("autoDisappearTime", java.lang.Float.valueOf(this.field_autoDisappearTime));
        }
        if (this.f238746q) {
            contentValues.put("feedMediaTypes", java.lang.Long.valueOf(this.field_feedMediaTypes));
        }
        if (this.f238747r) {
            if (this.field_isFromJumper) {
                contentValues.put("isFromJumper", (java.lang.Integer) 1);
            } else {
                contentValues.put("isFromJumper", (java.lang.Integer) 0);
            }
        }
        if (this.f238748s) {
            contentValues.put("bindFeedId", java.lang.Long.valueOf(this.field_bindFeedId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NpsSurveyTaskConfig ( ");
        l75.e0 e0Var = f238728J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238730u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTableSql %s", str2);
            k0Var.A("NpsSurveyTaskConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "NpsSurveyTaskConfig", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "updateTableSql %s", str3);
            k0Var.A("NpsSurveyTaskConfig", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238728J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_taskId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238729t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238729t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsLong("taskId").longValue();
            if (z17) {
                this.f238736d = true;
            }
        }
        if (contentValues.containsKey("conditions")) {
            this.field_conditions = contentValues.getAsInteger("conditions").intValue();
            if (z17) {
                this.f238737e = true;
            }
        }
        if (contentValues.containsKey("feedPos")) {
            this.field_feedPos = contentValues.getAsString("feedPos");
            if (z17) {
                this.f238738f = true;
            }
        }
        if (contentValues.containsKey("deliverScenes")) {
            this.field_deliverScenes = contentValues.getAsInteger("deliverScenes").intValue();
            if (z17) {
                this.f238739g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f238740h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f238741i = true;
            }
        }
        if (contentValues.containsKey("excludeDays")) {
            this.field_excludeDays = contentValues.getAsInteger("excludeDays").intValue();
            if (z17) {
                this.f238742m = true;
            }
        }
        if (contentValues.containsKey("isPreview")) {
            this.field_isPreview = contentValues.getAsInteger("isPreview").intValue() != 0;
            if (z17) {
                this.f238743n = true;
            }
        }
        if (contentValues.containsKey("delayAppearTime")) {
            this.field_delayAppearTime = contentValues.getAsFloat("delayAppearTime").floatValue();
            if (z17) {
                this.f238744o = true;
            }
        }
        if (contentValues.containsKey("autoDisappearTime")) {
            this.field_autoDisappearTime = contentValues.getAsFloat("autoDisappearTime").floatValue();
            if (z17) {
                this.f238745p = true;
            }
        }
        if (contentValues.containsKey("feedMediaTypes")) {
            this.field_feedMediaTypes = contentValues.getAsLong("feedMediaTypes").longValue();
            if (z17) {
                this.f238746q = true;
            }
        }
        if (contentValues.containsKey("isFromJumper")) {
            this.field_isFromJumper = contentValues.getAsInteger("isFromJumper").intValue() != 0;
            if (z17) {
                this.f238747r = true;
            }
        }
        if (contentValues.containsKey("bindFeedId")) {
            this.field_bindFeedId = contentValues.getAsLong("bindFeedId").longValue();
            if (z17) {
                this.f238748s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
