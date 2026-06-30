package dm;

/* loaded from: classes4.dex */
public class ib extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final java.lang.String[] D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f237669J;
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
    public static final l75.e0 Y;
    public static final o75.e Z;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f237670y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f237671z;
    public java.lang.String field_clip_bundle_id;
    public java.lang.String field_clip_bundle_local_path;
    public long field_confirm_publish_video_time_stamp;
    public long field_confirm_remux_time_stamp;
    public int field_export_video_duration_ms;
    public int field_is_killed_process_restart;
    public java.lang.String field_output_thumb_path;
    public java.lang.String field_output_video_path;
    public java.lang.String field_post_session_id;
    public long field_remux_success_time_stamp;
    public int field_sns_create_time;
    public byte[] field_sns_ext_info;
    public int field_sns_local_id;
    public long field_start_remux_time_stamp;
    public int field_tec_enter_scene;
    public int field_work_code;
    public java.lang.String field_work_id;
    public int field_work_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237672d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237673e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237674f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237675g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237676h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237677i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237678m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237679n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237680o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237681p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237682q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237683r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237684s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237685t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237686u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237687v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237688w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237689x = true;

    static {
        p75.n0 n0Var = new p75.n0("TemplateBackgroundVideoInfo");
        f237670y = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237671z = new p75.d("work_id", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("work_code", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        B = new p75.d("remux_success_time_stamp", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        C = new p75.d("sns_ext_info", "byte[]", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        D = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TemplateBackgroundVideoInfo_Work_Id ON TemplateBackgroundVideoInfo(work_id)", "CREATE INDEX IF NOT EXISTS TemplateBackgroundVideoInfo_ClipBundle_Id ON TemplateBackgroundVideoInfo(clip_bundle_id)", "CREATE INDEX IF NOT EXISTS TemplateBackgroundVideoInfo_Local_Id ON TemplateBackgroundVideoInfo(sns_local_id)"};
        E = 1525155081;
        F = 1090536360;
        G = 1090019931;
        H = -1828252727;
        I = 1255645479;
        f237669J = -124461209;
        K = -223059220;
        L = -560290766;
        M = -832703409;
        N = -1301840176;
        P = -899871772;
        Q = -996812045;
        R = -1564413610;
        S = -940324046;
        T = 55350200;
        U = -2073036701;
        V = 1295667177;
        W = -525478238;
        X = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "work_id";
        ((java.util.HashMap) e0Var.f316955d).put("work_id", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "work_id";
        e0Var.f316954c[1] = "work_type";
        ((java.util.HashMap) e0Var.f316955d).put("work_type", "INTEGER");
        e0Var.f316954c[2] = "work_code";
        ((java.util.HashMap) e0Var.f316955d).put("work_code", "INTEGER default '-1' ");
        e0Var.f316954c[3] = "clip_bundle_id";
        ((java.util.HashMap) e0Var.f316955d).put("clip_bundle_id", "TEXT default '' ");
        e0Var.f316954c[4] = "clip_bundle_local_path";
        ((java.util.HashMap) e0Var.f316955d).put("clip_bundle_local_path", "TEXT default '' ");
        e0Var.f316954c[5] = "output_video_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_video_path", "TEXT");
        e0Var.f316954c[6] = "output_thumb_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_thumb_path", "TEXT");
        e0Var.f316954c[7] = "confirm_remux_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("confirm_remux_time_stamp", "LONG default '0' ");
        e0Var.f316954c[8] = "remux_success_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("remux_success_time_stamp", "LONG default '0' ");
        e0Var.f316954c[9] = "start_remux_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("start_remux_time_stamp", "LONG default '0' ");
        e0Var.f316954c[10] = "confirm_publish_video_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("confirm_publish_video_time_stamp", "LONG default '0' ");
        e0Var.f316954c[11] = "sns_ext_info";
        ((java.util.HashMap) e0Var.f316955d).put("sns_ext_info", "BLOB");
        e0Var.f316954c[12] = "sns_local_id";
        ((java.util.HashMap) e0Var.f316955d).put("sns_local_id", "INTEGER default '-1' ");
        e0Var.f316954c[13] = "is_killed_process_restart";
        ((java.util.HashMap) e0Var.f316955d).put("is_killed_process_restart", "INTEGER default '0' ");
        e0Var.f316954c[14] = "tec_enter_scene";
        ((java.util.HashMap) e0Var.f316955d).put("tec_enter_scene", "INTEGER default '0' ");
        e0Var.f316954c[15] = "post_session_id";
        ((java.util.HashMap) e0Var.f316955d).put("post_session_id", "TEXT default '' ");
        e0Var.f316954c[16] = "sns_create_time";
        ((java.util.HashMap) e0Var.f316955d).put("sns_create_time", "INTEGER default '0' ");
        e0Var.f316954c[17] = "export_video_duration_ms";
        ((java.util.HashMap) e0Var.f316955d).put("export_video_duration_ms", "INTEGER default '0' ");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " work_id TEXT default ''  PRIMARY KEY ,  work_type INTEGER,  work_code INTEGER default '-1' ,  clip_bundle_id TEXT default '' ,  clip_bundle_local_path TEXT default '' ,  output_video_path TEXT,  output_thumb_path TEXT,  confirm_remux_time_stamp LONG default '0' ,  remux_success_time_stamp LONG default '0' ,  start_remux_time_stamp LONG default '0' ,  confirm_publish_video_time_stamp LONG default '0' ,  sns_ext_info BLOB,  sns_local_id INTEGER default '-1' ,  is_killed_process_restart INTEGER default '0' ,  tec_enter_scene INTEGER default '0' ,  post_session_id TEXT default '' ,  sns_create_time INTEGER default '0' ,  export_video_duration_ms INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        Y = e0Var;
        Z = new o75.e();
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
            if (E == hashCode) {
                try {
                    this.field_work_id = cursor.getString(i17);
                    this.f237672d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_work_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_work_code = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_clip_bundle_id = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_clip_bundle_local_path = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237669J == hashCode) {
                try {
                    this.field_output_video_path = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_output_thumb_path = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_confirm_remux_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_remux_success_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_start_remux_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_confirm_publish_video_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_sns_ext_info = cursor.getBlob(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_sns_local_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_is_killed_process_restart = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                try {
                    this.field_tec_enter_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U == hashCode) {
                try {
                    this.field_post_session_id = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V == hashCode) {
                try {
                    this.field_sns_create_time = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W == hashCode) {
                try {
                    this.field_export_video_duration_ms = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_work_id == null) {
            this.field_work_id = "";
        }
        if (this.f237672d) {
            contentValues.put("work_id", this.field_work_id);
        }
        if (this.f237673e) {
            contentValues.put("work_type", java.lang.Integer.valueOf(this.field_work_type));
        }
        if (this.f237674f) {
            contentValues.put("work_code", java.lang.Integer.valueOf(this.field_work_code));
        }
        if (this.field_clip_bundle_id == null) {
            this.field_clip_bundle_id = "";
        }
        if (this.f237675g) {
            contentValues.put("clip_bundle_id", this.field_clip_bundle_id);
        }
        if (this.field_clip_bundle_local_path == null) {
            this.field_clip_bundle_local_path = "";
        }
        if (this.f237676h) {
            contentValues.put("clip_bundle_local_path", this.field_clip_bundle_local_path);
        }
        if (this.f237677i) {
            contentValues.put("output_video_path", this.field_output_video_path);
        }
        if (this.f237678m) {
            contentValues.put("output_thumb_path", this.field_output_thumb_path);
        }
        if (this.f237679n) {
            contentValues.put("confirm_remux_time_stamp", java.lang.Long.valueOf(this.field_confirm_remux_time_stamp));
        }
        if (this.f237680o) {
            contentValues.put("remux_success_time_stamp", java.lang.Long.valueOf(this.field_remux_success_time_stamp));
        }
        if (this.f237681p) {
            contentValues.put("start_remux_time_stamp", java.lang.Long.valueOf(this.field_start_remux_time_stamp));
        }
        if (this.f237682q) {
            contentValues.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(this.field_confirm_publish_video_time_stamp));
        }
        if (this.f237683r) {
            contentValues.put("sns_ext_info", this.field_sns_ext_info);
        }
        if (this.f237684s) {
            contentValues.put("sns_local_id", java.lang.Integer.valueOf(this.field_sns_local_id));
        }
        if (this.f237685t) {
            contentValues.put("is_killed_process_restart", java.lang.Integer.valueOf(this.field_is_killed_process_restart));
        }
        if (this.f237686u) {
            contentValues.put("tec_enter_scene", java.lang.Integer.valueOf(this.field_tec_enter_scene));
        }
        if (this.field_post_session_id == null) {
            this.field_post_session_id = "";
        }
        if (this.f237687v) {
            contentValues.put("post_session_id", this.field_post_session_id);
        }
        if (this.f237688w) {
            contentValues.put("sns_create_time", java.lang.Integer.valueOf(this.field_sns_create_time));
        }
        if (this.f237689x) {
            contentValues.put("export_video_duration_ms", java.lang.Integer.valueOf(this.field_export_video_duration_ms));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TemplateBackgroundVideoInfo ( ");
        l75.e0 e0Var = Y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", "createTableSql %s", str2);
            k0Var.A("TemplateBackgroundVideoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TemplateBackgroundVideoInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", "updateTableSql %s", str3);
            k0Var.A("TemplateBackgroundVideoInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTemplateBackgroundVideoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Y;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return Z;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_work_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237670y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237670y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("work_id")) {
            this.field_work_id = contentValues.getAsString("work_id");
            if (z17) {
                this.f237672d = true;
            }
        }
        if (contentValues.containsKey("work_type")) {
            this.field_work_type = contentValues.getAsInteger("work_type").intValue();
            if (z17) {
                this.f237673e = true;
            }
        }
        if (contentValues.containsKey("work_code")) {
            this.field_work_code = contentValues.getAsInteger("work_code").intValue();
            if (z17) {
                this.f237674f = true;
            }
        }
        if (contentValues.containsKey("clip_bundle_id")) {
            this.field_clip_bundle_id = contentValues.getAsString("clip_bundle_id");
            if (z17) {
                this.f237675g = true;
            }
        }
        if (contentValues.containsKey("clip_bundle_local_path")) {
            this.field_clip_bundle_local_path = contentValues.getAsString("clip_bundle_local_path");
            if (z17) {
                this.f237676h = true;
            }
        }
        if (contentValues.containsKey("output_video_path")) {
            this.field_output_video_path = contentValues.getAsString("output_video_path");
            if (z17) {
                this.f237677i = true;
            }
        }
        if (contentValues.containsKey("output_thumb_path")) {
            this.field_output_thumb_path = contentValues.getAsString("output_thumb_path");
            if (z17) {
                this.f237678m = true;
            }
        }
        if (contentValues.containsKey("confirm_remux_time_stamp")) {
            this.field_confirm_remux_time_stamp = contentValues.getAsLong("confirm_remux_time_stamp").longValue();
            if (z17) {
                this.f237679n = true;
            }
        }
        if (contentValues.containsKey("remux_success_time_stamp")) {
            this.field_remux_success_time_stamp = contentValues.getAsLong("remux_success_time_stamp").longValue();
            if (z17) {
                this.f237680o = true;
            }
        }
        if (contentValues.containsKey("start_remux_time_stamp")) {
            this.field_start_remux_time_stamp = contentValues.getAsLong("start_remux_time_stamp").longValue();
            if (z17) {
                this.f237681p = true;
            }
        }
        if (contentValues.containsKey("confirm_publish_video_time_stamp")) {
            this.field_confirm_publish_video_time_stamp = contentValues.getAsLong("confirm_publish_video_time_stamp").longValue();
            if (z17) {
                this.f237682q = true;
            }
        }
        if (contentValues.containsKey("sns_ext_info")) {
            this.field_sns_ext_info = contentValues.getAsByteArray("sns_ext_info");
            if (z17) {
                this.f237683r = true;
            }
        }
        if (contentValues.containsKey("sns_local_id")) {
            this.field_sns_local_id = contentValues.getAsInteger("sns_local_id").intValue();
            if (z17) {
                this.f237684s = true;
            }
        }
        if (contentValues.containsKey("is_killed_process_restart")) {
            this.field_is_killed_process_restart = contentValues.getAsInteger("is_killed_process_restart").intValue();
            if (z17) {
                this.f237685t = true;
            }
        }
        if (contentValues.containsKey("tec_enter_scene")) {
            this.field_tec_enter_scene = contentValues.getAsInteger("tec_enter_scene").intValue();
            if (z17) {
                this.f237686u = true;
            }
        }
        if (contentValues.containsKey("post_session_id")) {
            this.field_post_session_id = contentValues.getAsString("post_session_id");
            if (z17) {
                this.f237687v = true;
            }
        }
        if (contentValues.containsKey("sns_create_time")) {
            this.field_sns_create_time = contentValues.getAsInteger("sns_create_time").intValue();
            if (z17) {
                this.f237688w = true;
            }
        }
        if (contentValues.containsKey("export_video_duration_ms")) {
            this.field_export_video_duration_ms = contentValues.getAsInteger("export_video_duration_ms").intValue();
            if (z17) {
                this.f237689x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
