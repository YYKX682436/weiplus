package dm;

/* loaded from: classes4.dex */
public class q0 extends l75.f0 {
    public static final int A1;
    public static final int B1;
    public static final int C1;
    public static final int D1;
    public static final int E1;
    public static final int F1;
    public static final int G1;
    public static final int H1;
    public static final int I1;
    public static final int J1;
    public static final int K1;
    public static final int L1;
    public static final int M1;
    public static final int N1;
    public static final int O1;
    public static final int P1;
    public static final int Q1;
    public static final p75.n0 R;
    public static final int R1;
    public static final p75.d S;
    public static final int S1;
    public static final p75.d T;
    public static final int T1;
    public static final p75.d U;
    public static final int U1;
    public static final p75.d V;
    public static final int V1;
    public static final java.lang.String[] W;
    public static final int W1;
    public static final int X;
    public static final int X1;
    public static final int Y;
    public static final int Y1;
    public static final int Z;
    public static final int Z1;

    /* renamed from: a2, reason: collision with root package name */
    public static final l75.e0 f239325a2;

    /* renamed from: b2, reason: collision with root package name */
    public static final o75.e f239326b2;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f239327l1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f239328p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f239329p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f239330x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f239331x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f239332y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f239333y1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f239334z1;
    public int field_aba_target_bitrate;
    public byte[] field_composition_info;
    public long field_confirm_publish_video_time_stamp;
    public long field_confirm_remux_time_stamp;
    public int field_encode_frame_rate;
    public int field_encode_qp_switch;
    public int field_encode_target_height;
    public int field_encode_target_width;
    public int field_encode_video_bitrate;
    public int field_export_video_duration_ms;
    public boolean field_is_capture_video;
    public boolean field_is_change;
    public int field_is_killed_process_restart;
    public boolean field_is_sava_to_sys_album_if_media_edited;
    public boolean field_is_save_source_media;
    public int field_is_sns_double_check;
    public java.lang.String field_music_path;
    public java.lang.String field_output_thumb_path;
    public java.lang.String field_output_thumb_temp_path;
    public java.lang.String field_output_video_path;
    public java.lang.String field_output_video_temp_path;
    public java.lang.String field_post_session_id;
    public long field_remux_success_time_stamp;
    public int field_sns_create_time;
    public byte[] field_sns_ext_info;
    public int field_sns_local_id;
    public java.lang.String field_source_video_path;
    public int field_source_video_rotate;
    public long field_start_remux_time_stamp;
    public int field_tec_enter_scene;
    public byte[] field_video_param;
    public int field_video_param_preset_index;
    public int field_video_param_profile_index;
    public int field_work_code;
    public java.lang.String field_work_id;
    public int field_work_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239336d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239337e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239338f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239339g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239340h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239341i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239342m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239343n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239344o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239345p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239346q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239347r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239348s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f239349t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f239350u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f239351v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f239352w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f239353x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f239354y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f239355z = true;
    public boolean A = true;
    public boolean B = true;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean G = true;
    public boolean H = true;
    public boolean I = true;

    /* renamed from: J, reason: collision with root package name */
    public boolean f239335J = true;
    public boolean K = true;
    public boolean L = true;
    public boolean M = true;
    public boolean N = true;
    public boolean P = true;
    public boolean Q = true;

    static {
        p75.n0 n0Var = new p75.n0("BackgroundVideoInfo");
        R = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        S = new p75.d("work_id", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        T = new p75.d("work_code", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        U = new p75.d("remux_success_time_stamp", "long", tableName, "");
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
        V = new p75.d("sns_ext_info", "byte[]", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        W = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BackgroundVideoInfo_Work_Id ON BackgroundVideoInfo(work_id)", "CREATE INDEX IF NOT EXISTS BackgroundVideoInfo_Local_Id ON BackgroundVideoInfo(sns_local_id)"};
        X = 1525155081;
        Y = 1090536360;
        Z = 1090019931;
        f239328p0 = -124461209;
        f239330x0 = -223059220;
        f239332y0 = -691471347;
        f239327l1 = 230841262;
        f239329p1 = -53394615;
        f239331x1 = -780124673;
        f239333y1 = -560290766;
        f239334z1 = -832703409;
        A1 = -1301840176;
        B1 = -899871772;
        C1 = 1026670573;
        D1 = -897597339;
        E1 = 2031810157;
        F1 = -1115574927;
        G1 = 1354144894;
        H1 = 1286150979;
        I1 = 1209340193;
        J1 = -1598154452;
        K1 = -1800454848;
        L1 = -742865349;
        M1 = 376269419;
        N1 = -571827160;
        O1 = -2034730810;
        P1 = -1669165533;
        Q1 = 1382287305;
        R1 = -996812045;
        S1 = -1564413610;
        T1 = -748076810;
        U1 = -940324046;
        V1 = 55350200;
        W1 = -2073036701;
        X1 = 1295667177;
        Y1 = -525478238;
        Z1 = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[36];
        java.lang.String[] strArr = new java.lang.String[37];
        e0Var.f316954c = strArr;
        strArr[0] = "work_id";
        ((java.util.HashMap) e0Var.f316955d).put("work_id", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "work_id";
        e0Var.f316954c[1] = "work_type";
        ((java.util.HashMap) e0Var.f316955d).put("work_type", "INTEGER");
        e0Var.f316954c[2] = "work_code";
        ((java.util.HashMap) e0Var.f316955d).put("work_code", "INTEGER default '-1' ");
        e0Var.f316954c[3] = "output_video_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_video_path", "TEXT");
        e0Var.f316954c[4] = "output_thumb_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_thumb_path", "TEXT");
        e0Var.f316954c[5] = "source_video_path";
        ((java.util.HashMap) e0Var.f316955d).put("source_video_path", "TEXT");
        e0Var.f316954c[6] = "output_video_temp_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_video_temp_path", "TEXT");
        e0Var.f316954c[7] = "output_thumb_temp_path";
        ((java.util.HashMap) e0Var.f316955d).put("output_thumb_temp_path", "TEXT");
        e0Var.f316954c[8] = "music_path";
        ((java.util.HashMap) e0Var.f316955d).put("music_path", "TEXT default '' ");
        e0Var.f316954c[9] = "confirm_remux_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("confirm_remux_time_stamp", "LONG default '0' ");
        e0Var.f316954c[10] = "remux_success_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("remux_success_time_stamp", "LONG default '0' ");
        e0Var.f316954c[11] = "start_remux_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("start_remux_time_stamp", "LONG default '0' ");
        e0Var.f316954c[12] = "confirm_publish_video_time_stamp";
        ((java.util.HashMap) e0Var.f316955d).put("confirm_publish_video_time_stamp", "LONG default '0' ");
        e0Var.f316954c[13] = "is_capture_video";
        ((java.util.HashMap) e0Var.f316955d).put("is_capture_video", "INTEGER");
        e0Var.f316954c[14] = "is_change";
        ((java.util.HashMap) e0Var.f316955d).put("is_change", "INTEGER");
        e0Var.f316954c[15] = "is_save_source_media";
        ((java.util.HashMap) e0Var.f316955d).put("is_save_source_media", "INTEGER");
        e0Var.f316954c[16] = "is_sava_to_sys_album_if_media_edited";
        ((java.util.HashMap) e0Var.f316955d).put("is_sava_to_sys_album_if_media_edited", "INTEGER");
        e0Var.f316954c[17] = "aba_target_bitrate";
        ((java.util.HashMap) e0Var.f316955d).put("aba_target_bitrate", "INTEGER");
        e0Var.f316954c[18] = "source_video_rotate";
        ((java.util.HashMap) e0Var.f316955d).put("source_video_rotate", "INTEGER");
        e0Var.f316954c[19] = "encode_target_width";
        ((java.util.HashMap) e0Var.f316955d).put("encode_target_width", "INTEGER");
        e0Var.f316954c[20] = "encode_target_height";
        ((java.util.HashMap) e0Var.f316955d).put("encode_target_height", "INTEGER");
        e0Var.f316954c[21] = "encode_video_bitrate";
        ((java.util.HashMap) e0Var.f316955d).put("encode_video_bitrate", "INTEGER");
        e0Var.f316954c[22] = "encode_frame_rate";
        ((java.util.HashMap) e0Var.f316955d).put("encode_frame_rate", "INTEGER");
        e0Var.f316954c[23] = "encode_qp_switch";
        ((java.util.HashMap) e0Var.f316955d).put("encode_qp_switch", "INTEGER");
        e0Var.f316954c[24] = "video_param_preset_index";
        ((java.util.HashMap) e0Var.f316955d).put("video_param_preset_index", "INTEGER");
        e0Var.f316954c[25] = "video_param_profile_index";
        ((java.util.HashMap) e0Var.f316955d).put("video_param_profile_index", "INTEGER");
        e0Var.f316954c[26] = "composition_info";
        ((java.util.HashMap) e0Var.f316955d).put("composition_info", "BLOB");
        e0Var.f316954c[27] = "video_param";
        ((java.util.HashMap) e0Var.f316955d).put("video_param", "BLOB");
        e0Var.f316954c[28] = "sns_ext_info";
        ((java.util.HashMap) e0Var.f316955d).put("sns_ext_info", "BLOB");
        e0Var.f316954c[29] = "sns_local_id";
        ((java.util.HashMap) e0Var.f316955d).put("sns_local_id", "INTEGER default '-1' ");
        e0Var.f316954c[30] = "is_sns_double_check";
        ((java.util.HashMap) e0Var.f316955d).put("is_sns_double_check", "INTEGER default '0' ");
        e0Var.f316954c[31] = "is_killed_process_restart";
        ((java.util.HashMap) e0Var.f316955d).put("is_killed_process_restart", "INTEGER default '0' ");
        e0Var.f316954c[32] = "tec_enter_scene";
        ((java.util.HashMap) e0Var.f316955d).put("tec_enter_scene", "INTEGER default '0' ");
        e0Var.f316954c[33] = "post_session_id";
        ((java.util.HashMap) e0Var.f316955d).put("post_session_id", "TEXT default '' ");
        e0Var.f316954c[34] = "sns_create_time";
        ((java.util.HashMap) e0Var.f316955d).put("sns_create_time", "INTEGER default '0' ");
        e0Var.f316954c[35] = "export_video_duration_ms";
        ((java.util.HashMap) e0Var.f316955d).put("export_video_duration_ms", "INTEGER default '0' ");
        e0Var.f316954c[36] = "rowid";
        e0Var.f316956e = " work_id TEXT default ''  PRIMARY KEY ,  work_type INTEGER,  work_code INTEGER default '-1' ,  output_video_path TEXT,  output_thumb_path TEXT,  source_video_path TEXT,  output_video_temp_path TEXT,  output_thumb_temp_path TEXT,  music_path TEXT default '' ,  confirm_remux_time_stamp LONG default '0' ,  remux_success_time_stamp LONG default '0' ,  start_remux_time_stamp LONG default '0' ,  confirm_publish_video_time_stamp LONG default '0' ,  is_capture_video INTEGER,  is_change INTEGER,  is_save_source_media INTEGER,  is_sava_to_sys_album_if_media_edited INTEGER,  aba_target_bitrate INTEGER,  source_video_rotate INTEGER,  encode_target_width INTEGER,  encode_target_height INTEGER,  encode_video_bitrate INTEGER,  encode_frame_rate INTEGER,  encode_qp_switch INTEGER,  video_param_preset_index INTEGER,  video_param_profile_index INTEGER,  composition_info BLOB,  video_param BLOB,  sns_ext_info BLOB,  sns_local_id INTEGER default '-1' ,  is_sns_double_check INTEGER default '0' ,  is_killed_process_restart INTEGER default '0' ,  tec_enter_scene INTEGER default '0' ,  post_session_id TEXT default '' ,  sns_create_time INTEGER default '0' ,  export_video_duration_ms INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f239325a2 = e0Var;
        f239326b2 = new o75.e();
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
            if (X == hashCode) {
                try {
                    this.field_work_id = cursor.getString(i17);
                    this.f239336d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y == hashCode) {
                try {
                    this.field_work_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z == hashCode) {
                try {
                    this.field_work_code = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239328p0 == hashCode) {
                try {
                    this.field_output_video_path = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239330x0 == hashCode) {
                try {
                    this.field_output_thumb_path = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239332y0 == hashCode) {
                try {
                    this.field_source_video_path = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239327l1 == hashCode) {
                try {
                    this.field_output_video_temp_path = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239329p1 == hashCode) {
                try {
                    this.field_output_thumb_temp_path = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239331x1 == hashCode) {
                try {
                    this.field_music_path = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239333y1 == hashCode) {
                try {
                    this.field_confirm_remux_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239334z1 == hashCode) {
                try {
                    this.field_remux_success_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A1 == hashCode) {
                try {
                    this.field_start_remux_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B1 == hashCode) {
                try {
                    this.field_confirm_publish_video_time_stamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C1 == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_is_capture_video = z17;
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D1 == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_is_change = z17;
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E1 == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_is_save_source_media = z17;
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F1 == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_is_sava_to_sys_album_if_media_edited = z17;
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G1 == hashCode) {
                try {
                    this.field_aba_target_bitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H1 == hashCode) {
                try {
                    this.field_source_video_rotate = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I1 == hashCode) {
                try {
                    this.field_encode_target_width = cursor.getInt(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (J1 == hashCode) {
                try {
                    this.field_encode_target_height = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K1 == hashCode) {
                try {
                    this.field_encode_video_bitrate = cursor.getInt(i17);
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L1 == hashCode) {
                try {
                    this.field_encode_frame_rate = cursor.getInt(i17);
                } catch (java.lang.Throwable th28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th28, "convertFrom %s", columnNames[i17]);
                    java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M1 == hashCode) {
                try {
                    this.field_encode_qp_switch = cursor.getInt(i17);
                } catch (java.lang.Throwable th29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th29, "convertFrom %s", columnNames[i17]);
                    java.lang.String str24 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N1 == hashCode) {
                try {
                    this.field_video_param_preset_index = cursor.getInt(i17);
                } catch (java.lang.Throwable th30) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th30, "convertFrom %s", columnNames[i17]);
                    java.lang.String str25 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (O1 == hashCode) {
                try {
                    this.field_video_param_profile_index = cursor.getInt(i17);
                } catch (java.lang.Throwable th31) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th31, "convertFrom %s", columnNames[i17]);
                    java.lang.String str26 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P1 == hashCode) {
                try {
                    this.field_composition_info = cursor.getBlob(i17);
                } catch (java.lang.Throwable th32) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th32, "convertFrom %s", columnNames[i17]);
                    java.lang.String str27 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q1 == hashCode) {
                try {
                    this.field_video_param = cursor.getBlob(i17);
                } catch (java.lang.Throwable th33) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th33, "convertFrom %s", columnNames[i17]);
                    java.lang.String str28 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R1 == hashCode) {
                try {
                    this.field_sns_ext_info = cursor.getBlob(i17);
                } catch (java.lang.Throwable th34) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th34, "convertFrom %s", columnNames[i17]);
                    java.lang.String str29 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S1 == hashCode) {
                try {
                    this.field_sns_local_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th35) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th35, "convertFrom %s", columnNames[i17]);
                    java.lang.String str30 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T1 == hashCode) {
                try {
                    this.field_is_sns_double_check = cursor.getInt(i17);
                } catch (java.lang.Throwable th36) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th36, "convertFrom %s", columnNames[i17]);
                    java.lang.String str31 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (U1 == hashCode) {
                try {
                    this.field_is_killed_process_restart = cursor.getInt(i17);
                } catch (java.lang.Throwable th37) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th37, "convertFrom %s", columnNames[i17]);
                    java.lang.String str32 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (V1 == hashCode) {
                try {
                    this.field_tec_enter_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th38) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th38, "convertFrom %s", columnNames[i17]);
                    java.lang.String str33 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (W1 == hashCode) {
                try {
                    this.field_post_session_id = cursor.getString(i17);
                } catch (java.lang.Throwable th39) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th39, "convertFrom %s", columnNames[i17]);
                    java.lang.String str34 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (X1 == hashCode) {
                try {
                    this.field_sns_create_time = cursor.getInt(i17);
                } catch (java.lang.Throwable th40) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th40, "convertFrom %s", columnNames[i17]);
                    java.lang.String str35 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Y1 == hashCode) {
                try {
                    this.field_export_video_duration_ms = cursor.getInt(i17);
                } catch (java.lang.Throwable th41) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th41, "convertFrom %s", columnNames[i17]);
                    java.lang.String str36 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Z1 == hashCode) {
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
        if (this.f239336d) {
            contentValues.put("work_id", this.field_work_id);
        }
        if (this.f239337e) {
            contentValues.put("work_type", java.lang.Integer.valueOf(this.field_work_type));
        }
        if (this.f239338f) {
            contentValues.put("work_code", java.lang.Integer.valueOf(this.field_work_code));
        }
        if (this.f239339g) {
            contentValues.put("output_video_path", this.field_output_video_path);
        }
        if (this.f239340h) {
            contentValues.put("output_thumb_path", this.field_output_thumb_path);
        }
        if (this.f239341i) {
            contentValues.put("source_video_path", this.field_source_video_path);
        }
        if (this.f239342m) {
            contentValues.put("output_video_temp_path", this.field_output_video_temp_path);
        }
        if (this.f239343n) {
            contentValues.put("output_thumb_temp_path", this.field_output_thumb_temp_path);
        }
        if (this.field_music_path == null) {
            this.field_music_path = "";
        }
        if (this.f239344o) {
            contentValues.put("music_path", this.field_music_path);
        }
        if (this.f239345p) {
            contentValues.put("confirm_remux_time_stamp", java.lang.Long.valueOf(this.field_confirm_remux_time_stamp));
        }
        if (this.f239346q) {
            contentValues.put("remux_success_time_stamp", java.lang.Long.valueOf(this.field_remux_success_time_stamp));
        }
        if (this.f239347r) {
            contentValues.put("start_remux_time_stamp", java.lang.Long.valueOf(this.field_start_remux_time_stamp));
        }
        if (this.f239348s) {
            contentValues.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(this.field_confirm_publish_video_time_stamp));
        }
        if (this.f239349t) {
            if (this.field_is_capture_video) {
                contentValues.put("is_capture_video", (java.lang.Integer) 1);
            } else {
                contentValues.put("is_capture_video", (java.lang.Integer) 0);
            }
        }
        if (this.f239350u) {
            if (this.field_is_change) {
                contentValues.put("is_change", (java.lang.Integer) 1);
            } else {
                contentValues.put("is_change", (java.lang.Integer) 0);
            }
        }
        if (this.f239351v) {
            if (this.field_is_save_source_media) {
                contentValues.put("is_save_source_media", (java.lang.Integer) 1);
            } else {
                contentValues.put("is_save_source_media", (java.lang.Integer) 0);
            }
        }
        if (this.f239352w) {
            if (this.field_is_sava_to_sys_album_if_media_edited) {
                contentValues.put("is_sava_to_sys_album_if_media_edited", (java.lang.Integer) 1);
            } else {
                contentValues.put("is_sava_to_sys_album_if_media_edited", (java.lang.Integer) 0);
            }
        }
        if (this.f239353x) {
            contentValues.put("aba_target_bitrate", java.lang.Integer.valueOf(this.field_aba_target_bitrate));
        }
        if (this.f239354y) {
            contentValues.put("source_video_rotate", java.lang.Integer.valueOf(this.field_source_video_rotate));
        }
        if (this.f239355z) {
            contentValues.put("encode_target_width", java.lang.Integer.valueOf(this.field_encode_target_width));
        }
        if (this.A) {
            contentValues.put("encode_target_height", java.lang.Integer.valueOf(this.field_encode_target_height));
        }
        if (this.B) {
            contentValues.put("encode_video_bitrate", java.lang.Integer.valueOf(this.field_encode_video_bitrate));
        }
        if (this.C) {
            contentValues.put("encode_frame_rate", java.lang.Integer.valueOf(this.field_encode_frame_rate));
        }
        if (this.D) {
            contentValues.put("encode_qp_switch", java.lang.Integer.valueOf(this.field_encode_qp_switch));
        }
        if (this.E) {
            contentValues.put("video_param_preset_index", java.lang.Integer.valueOf(this.field_video_param_preset_index));
        }
        if (this.F) {
            contentValues.put("video_param_profile_index", java.lang.Integer.valueOf(this.field_video_param_profile_index));
        }
        if (this.G) {
            contentValues.put("composition_info", this.field_composition_info);
        }
        if (this.H) {
            contentValues.put("video_param", this.field_video_param);
        }
        if (this.I) {
            contentValues.put("sns_ext_info", this.field_sns_ext_info);
        }
        if (this.f239335J) {
            contentValues.put("sns_local_id", java.lang.Integer.valueOf(this.field_sns_local_id));
        }
        if (this.K) {
            contentValues.put("is_sns_double_check", java.lang.Integer.valueOf(this.field_is_sns_double_check));
        }
        if (this.L) {
            contentValues.put("is_killed_process_restart", java.lang.Integer.valueOf(this.field_is_killed_process_restart));
        }
        if (this.M) {
            contentValues.put("tec_enter_scene", java.lang.Integer.valueOf(this.field_tec_enter_scene));
        }
        if (this.field_post_session_id == null) {
            this.field_post_session_id = "";
        }
        if (this.N) {
            contentValues.put("post_session_id", this.field_post_session_id);
        }
        if (this.P) {
            contentValues.put("sns_create_time", java.lang.Integer.valueOf(this.field_sns_create_time));
        }
        if (this.Q) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackgroundVideoInfo ( ");
        l75.e0 e0Var = f239325a2;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : W) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTableSql %s", str2);
            k0Var.A("BackgroundVideoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BackgroundVideoInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackgroundVideoInfo", "updateTableSql %s", str3);
            k0Var.A("BackgroundVideoInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239325a2;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239326b2;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_work_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return R;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return R.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("work_id")) {
            this.field_work_id = contentValues.getAsString("work_id");
            if (z17) {
                this.f239336d = true;
            }
        }
        if (contentValues.containsKey("work_type")) {
            this.field_work_type = contentValues.getAsInteger("work_type").intValue();
            if (z17) {
                this.f239337e = true;
            }
        }
        if (contentValues.containsKey("work_code")) {
            this.field_work_code = contentValues.getAsInteger("work_code").intValue();
            if (z17) {
                this.f239338f = true;
            }
        }
        if (contentValues.containsKey("output_video_path")) {
            this.field_output_video_path = contentValues.getAsString("output_video_path");
            if (z17) {
                this.f239339g = true;
            }
        }
        if (contentValues.containsKey("output_thumb_path")) {
            this.field_output_thumb_path = contentValues.getAsString("output_thumb_path");
            if (z17) {
                this.f239340h = true;
            }
        }
        if (contentValues.containsKey("source_video_path")) {
            this.field_source_video_path = contentValues.getAsString("source_video_path");
            if (z17) {
                this.f239341i = true;
            }
        }
        if (contentValues.containsKey("output_video_temp_path")) {
            this.field_output_video_temp_path = contentValues.getAsString("output_video_temp_path");
            if (z17) {
                this.f239342m = true;
            }
        }
        if (contentValues.containsKey("output_thumb_temp_path")) {
            this.field_output_thumb_temp_path = contentValues.getAsString("output_thumb_temp_path");
            if (z17) {
                this.f239343n = true;
            }
        }
        if (contentValues.containsKey("music_path")) {
            this.field_music_path = contentValues.getAsString("music_path");
            if (z17) {
                this.f239344o = true;
            }
        }
        if (contentValues.containsKey("confirm_remux_time_stamp")) {
            this.field_confirm_remux_time_stamp = contentValues.getAsLong("confirm_remux_time_stamp").longValue();
            if (z17) {
                this.f239345p = true;
            }
        }
        if (contentValues.containsKey("remux_success_time_stamp")) {
            this.field_remux_success_time_stamp = contentValues.getAsLong("remux_success_time_stamp").longValue();
            if (z17) {
                this.f239346q = true;
            }
        }
        if (contentValues.containsKey("start_remux_time_stamp")) {
            this.field_start_remux_time_stamp = contentValues.getAsLong("start_remux_time_stamp").longValue();
            if (z17) {
                this.f239347r = true;
            }
        }
        if (contentValues.containsKey("confirm_publish_video_time_stamp")) {
            this.field_confirm_publish_video_time_stamp = contentValues.getAsLong("confirm_publish_video_time_stamp").longValue();
            if (z17) {
                this.f239348s = true;
            }
        }
        if (contentValues.containsKey("is_capture_video")) {
            this.field_is_capture_video = contentValues.getAsInteger("is_capture_video").intValue() != 0;
            if (z17) {
                this.f239349t = true;
            }
        }
        if (contentValues.containsKey("is_change")) {
            this.field_is_change = contentValues.getAsInteger("is_change").intValue() != 0;
            if (z17) {
                this.f239350u = true;
            }
        }
        if (contentValues.containsKey("is_save_source_media")) {
            this.field_is_save_source_media = contentValues.getAsInteger("is_save_source_media").intValue() != 0;
            if (z17) {
                this.f239351v = true;
            }
        }
        if (contentValues.containsKey("is_sava_to_sys_album_if_media_edited")) {
            this.field_is_sava_to_sys_album_if_media_edited = contentValues.getAsInteger("is_sava_to_sys_album_if_media_edited").intValue() != 0;
            if (z17) {
                this.f239352w = true;
            }
        }
        if (contentValues.containsKey("aba_target_bitrate")) {
            this.field_aba_target_bitrate = contentValues.getAsInteger("aba_target_bitrate").intValue();
            if (z17) {
                this.f239353x = true;
            }
        }
        if (contentValues.containsKey("source_video_rotate")) {
            this.field_source_video_rotate = contentValues.getAsInteger("source_video_rotate").intValue();
            if (z17) {
                this.f239354y = true;
            }
        }
        if (contentValues.containsKey("encode_target_width")) {
            this.field_encode_target_width = contentValues.getAsInteger("encode_target_width").intValue();
            if (z17) {
                this.f239355z = true;
            }
        }
        if (contentValues.containsKey("encode_target_height")) {
            this.field_encode_target_height = contentValues.getAsInteger("encode_target_height").intValue();
            if (z17) {
                this.A = true;
            }
        }
        if (contentValues.containsKey("encode_video_bitrate")) {
            this.field_encode_video_bitrate = contentValues.getAsInteger("encode_video_bitrate").intValue();
            if (z17) {
                this.B = true;
            }
        }
        if (contentValues.containsKey("encode_frame_rate")) {
            this.field_encode_frame_rate = contentValues.getAsInteger("encode_frame_rate").intValue();
            if (z17) {
                this.C = true;
            }
        }
        if (contentValues.containsKey("encode_qp_switch")) {
            this.field_encode_qp_switch = contentValues.getAsInteger("encode_qp_switch").intValue();
            if (z17) {
                this.D = true;
            }
        }
        if (contentValues.containsKey("video_param_preset_index")) {
            this.field_video_param_preset_index = contentValues.getAsInteger("video_param_preset_index").intValue();
            if (z17) {
                this.E = true;
            }
        }
        if (contentValues.containsKey("video_param_profile_index")) {
            this.field_video_param_profile_index = contentValues.getAsInteger("video_param_profile_index").intValue();
            if (z17) {
                this.F = true;
            }
        }
        if (contentValues.containsKey("composition_info")) {
            this.field_composition_info = contentValues.getAsByteArray("composition_info");
            if (z17) {
                this.G = true;
            }
        }
        if (contentValues.containsKey("video_param")) {
            this.field_video_param = contentValues.getAsByteArray("video_param");
            if (z17) {
                this.H = true;
            }
        }
        if (contentValues.containsKey("sns_ext_info")) {
            this.field_sns_ext_info = contentValues.getAsByteArray("sns_ext_info");
            if (z17) {
                this.I = true;
            }
        }
        if (contentValues.containsKey("sns_local_id")) {
            this.field_sns_local_id = contentValues.getAsInteger("sns_local_id").intValue();
            if (z17) {
                this.f239335J = true;
            }
        }
        if (contentValues.containsKey("is_sns_double_check")) {
            this.field_is_sns_double_check = contentValues.getAsInteger("is_sns_double_check").intValue();
            if (z17) {
                this.K = true;
            }
        }
        if (contentValues.containsKey("is_killed_process_restart")) {
            this.field_is_killed_process_restart = contentValues.getAsInteger("is_killed_process_restart").intValue();
            if (z17) {
                this.L = true;
            }
        }
        if (contentValues.containsKey("tec_enter_scene")) {
            this.field_tec_enter_scene = contentValues.getAsInteger("tec_enter_scene").intValue();
            if (z17) {
                this.M = true;
            }
        }
        if (contentValues.containsKey("post_session_id")) {
            this.field_post_session_id = contentValues.getAsString("post_session_id");
            if (z17) {
                this.N = true;
            }
        }
        if (contentValues.containsKey("sns_create_time")) {
            this.field_sns_create_time = contentValues.getAsInteger("sns_create_time").intValue();
            if (z17) {
                this.P = true;
            }
        }
        if (contentValues.containsKey("export_video_duration_ms")) {
            this.field_export_video_duration_ms = contentValues.getAsInteger("export_video_duration_ms").intValue();
            if (z17) {
                this.Q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
