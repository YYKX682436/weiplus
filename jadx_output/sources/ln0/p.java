package ln0;

/* loaded from: classes16.dex */
public final class p {

    /* renamed from: l, reason: collision with root package name */
    public static ln0.p f319671l;

    /* renamed from: f, reason: collision with root package name */
    public long f319677f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f319672a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f319673b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f319674c = "live.p2p.com";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319675d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final int f319676e = 15;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f319678g = "MMXp2pWrapper-THREAD-POOL-TAG";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319679h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f319680i = new com.tencent.mm.sdk.platformtools.b4("MicroMsg.MMXp2pWrapper", (com.tencent.mm.sdk.platformtools.a4) new ln0.h(this), true);

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f319681j = new com.tencent.mm.sdk.platformtools.b4("MicroMsg.MMXp2pWrapper", (com.tencent.mm.sdk.platformtools.a4) new ln0.e(this), true);

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f319682k = new ln0.d(this);

    public static final /* synthetic */ java.lang.String a(ln0.p pVar) {
        pVar.getClass();
        return "MicroMsg.MMXp2pWrapper";
    }

    public final void b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: streamId is null or empty, skip");
            return;
        }
        java.util.Map p2pParamsMap = this.f319672a;
        kotlin.jvm.internal.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            if (this.f319672a.containsKey(str)) {
                this.f319672a.remove(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: removed streamId=" + str + " from p2pParamsMap");
                if (this.f319672a.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper p2pParamsMap is empty, scheduling P2P SDK delay destroy");
                    ((ku5.t0) ku5.t0.f312615d).h(new ln0.m(this), this.f319678g);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: streamId=" + str + " not found in p2pParamsMap, skip");
            }
        }
    }

    public final java.lang.String c(java.io.InputStream inputStream) {
        java.util.Scanner useDelimiter = new java.util.Scanner(inputStream, com.tencent.mapsdk.internal.rv.f51270c).useDelimiter("\\A");
        if (!useDelimiter.hasNext()) {
            return "";
        }
        java.lang.String next = useDelimiter.next();
        kotlin.jvm.internal.o.f(next, "next(...)");
        return next;
    }

    public final ln0.q d(java.lang.String str) {
        ln0.q qVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.Map p2pParamsMap = this.f319672a;
        kotlin.jvm.internal.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            qVar = (ln0.q) this.f319672a.get(str);
        }
        return qVar;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        long j38;
        long j39;
        long j47;
        long j48;
        long j49;
        long j57;
        long j58;
        long j59;
        long j66;
        long j67;
        long j68;
        long j69;
        long j76;
        long j77;
        ln0.q d17 = d(str2);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper parseJsonAndReport: params not found for streamId=" + str2);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str).getJSONObject("flow");
            long optLong = jSONObject.optLong("p2pBytes", 0L);
            long optLong2 = jSONObject.optLong("cdnBytes", 0L);
            java.lang.String optString = jSONObject.optString("nat_str", "");
            str4 = "MicroMsg.MMXp2pWrapper";
            try {
                long optLong3 = jSONObject.optLong("p2p_upload_switch", 0L);
                long optLong4 = jSONObject.optLong("p2p_download_switch", 0L);
                long optLong5 = jSONObject.optLong("connected", 0L);
                long optLong6 = jSONObject.optLong("standby_c", 0L);
                long optLong7 = jSONObject.optLong("load", 0L);
                java.lang.String optString2 = jSONObject.optString("isp", "");
                java.lang.String optString3 = jSONObject.optString("url", "");
                java.lang.String optString4 = jSONObject.optString("xs_full_url", "");
                long optLong8 = jSONObject.optLong("xs_4xx_status", 0L);
                long optLong9 = jSONObject.optLong("total_pieces", 0L);
                long optLong10 = jSONObject.optLong("verify_pieces", 0L);
                long optLong11 = jSONObject.optLong("invalid_pieces", 0L);
                long optLong12 = jSONObject.optLong("tag_missed_invalid_pieces", 0L);
                java.lang.String optString5 = jSONObject.optString("uuid", "");
                java.lang.String optString6 = jSONObject.optString("pieceid", "");
                java.lang.String optString7 = jSONObject.optString("send", "");
                java.lang.String optString8 = jSONObject.optString("recv", "");
                long optLong13 = jSONObject.optLong("abnormal_ts_count", 0L);
                long optLong14 = jSONObject.optLong("play_ori_by_no_sei", 0L);
                long optLong15 = jSONObject.optLong("buffer_length", 0L);
                long optLong16 = jSONObject.optLong("max_cdn_firstframe", 0L);
                long optLong17 = jSONObject.optLong("max_p2p_firstframe", 0L);
                long optLong18 = jSONObject.optLong("first_frame_t", 0L);
                long optLong19 = jSONObject.optLong("punch_total", 0L);
                long optLong20 = jSONObject.optLong("punch_succ", 0L);
                long optLong21 = jSONObject.optLong("passive_punch_total", 0L);
                long optLong22 = jSONObject.optLong("passive_punch_succ", 0L);
                long optLong23 = jSONObject.optLong("punch_hole", 0L);
                long optLong24 = jSONObject.optLong("played_bytes", 0L);
                long optLong25 = jSONObject.optLong("fullstream_bytes", 0L);
                long optLong26 = jSONObject.optLong("cdn_substream_bytes", 0L);
                long optLong27 = jSONObject.optLong("fillup_bytes", 0L);
                long optLong28 = jSONObject.optLong("xntp_bytes", 0L);
                long optLong29 = jSONObject.optLong("turn_bytes", 0L);
                long optLong30 = jSONObject.optLong("punch_bytes", 0L);
                long optLong31 = jSONObject.optLong("tlive_errmsg_early", 0L);
                long optLong32 = jSONObject.optLong("tlive_errmsg_miss", 0L);
                long optLong33 = jSONObject.optLong("tlive_errmsg_expire", 0L);
                long optLong34 = jSONObject.optLong("subscribe_failure_c", 0L);
                long optLong35 = jSONObject.optLong("subscribe_refused_c", 0L);
                long optLong36 = jSONObject.optLong("subscribe_request_c", 0L);
                long optLong37 = jSONObject.optLong("subscribe_success_c", 0L);
                long optLong38 = jSONObject.optLong("subscribe_timeout_c", 0L);
                long optLong39 = jSONObject.optLong("toofar_subscribe_c", 0L);
                long optLong40 = jSONObject.optLong("too_depth_subscribe_c", 0L);
                long optLong41 = jSONObject.optLong("checkout_subscribe_c", 0L);
                java.lang.String optString9 = jSONObject.optString("version", "");
                long optLong42 = jSONObject.optLong("inner_punch_total", 0L);
                long optLong43 = jSONObject.optLong("inner_punch_succ", 0L);
                long j78 = d17.f319699p;
                if (optLong >= j78) {
                    d17.f319699p = optLong;
                    j17 = optLong - j78;
                } else {
                    j17 = 0;
                }
                long j79 = j17;
                long j86 = d17.f319700q;
                if (optLong2 >= j86) {
                    d17.f319700q = optLong2;
                    j18 = optLong2 - j86;
                } else {
                    j18 = 0;
                }
                long j87 = j18;
                long j88 = d17.f319701r;
                if (optLong8 >= j88) {
                    j19 = optLong8 - j88;
                    d17.f319701r = optLong8;
                } else {
                    j19 = 0;
                }
                long j89 = d17.f319702s;
                if (optLong9 >= j89) {
                    d17.f319702s = optLong9;
                    j27 = optLong9 - j89;
                } else {
                    j27 = 0;
                }
                long j96 = j27;
                long j97 = d17.f319703t;
                if (optLong10 >= j97) {
                    d17.f319703t = optLong10;
                    j28 = optLong10 - j97;
                } else {
                    j28 = 0;
                }
                long j98 = j28;
                long j99 = d17.f319704u;
                if (optLong11 >= j99) {
                    long j100 = optLong11 - j99;
                    d17.f319704u = optLong11;
                    j29 = j100;
                } else {
                    j29 = 0;
                }
                str3 = "";
                try {
                    long j101 = d17.f319705v;
                    if (optLong12 >= j101) {
                        j37 = optLong12 - j101;
                        d17.f319705v = optLong12;
                    } else {
                        j37 = 0;
                    }
                    long j102 = d17.f319706w;
                    if (optLong19 >= j102) {
                        d17.f319706w = optLong19;
                        j38 = optLong19 - j102;
                    } else {
                        j38 = 0;
                    }
                    long j103 = j38;
                    long j104 = d17.f319707x;
                    if (optLong20 >= j104) {
                        d17.f319707x = optLong20;
                        j39 = optLong20 - j104;
                    } else {
                        j39 = 0;
                    }
                    long j105 = j39;
                    long j106 = d17.I;
                    if (optLong42 >= j106) {
                        j47 = optLong42 - j106;
                        d17.I = optLong42;
                    } else {
                        j47 = 0;
                    }
                    long j107 = d17.f319683J;
                    if (optLong43 >= j107) {
                        j48 = optLong43 - j107;
                        d17.f319683J = optLong43;
                    } else {
                        j48 = 0;
                    }
                    long j108 = d17.f319708y;
                    if (optLong21 >= j108) {
                        d17.f319708y = optLong21;
                        j49 = optLong21 - j108;
                    } else {
                        j49 = 0;
                    }
                    long j109 = j48;
                    long j110 = d17.f319709z;
                    if (optLong22 >= j110) {
                        d17.f319709z = optLong22;
                        j57 = optLong22 - j110;
                    } else {
                        j57 = 0;
                    }
                    long j111 = j47;
                    long j112 = d17.A;
                    if (optLong23 >= j112) {
                        d17.A = optLong23;
                        j58 = optLong23 - j112;
                    } else {
                        j58 = 0;
                    }
                    long j113 = j58;
                    long j114 = d17.B;
                    if (optLong24 >= j114) {
                        d17.B = optLong24;
                        j59 = optLong24 - j114;
                    } else {
                        j59 = 0;
                    }
                    long j115 = j59;
                    long j116 = d17.C;
                    if (optLong25 >= j116) {
                        d17.C = optLong25;
                        j66 = optLong25 - j116;
                    } else {
                        j66 = 0;
                    }
                    long j117 = j66;
                    long j118 = d17.D;
                    if (optLong26 >= j118) {
                        d17.D = optLong26;
                        j67 = optLong26 - j118;
                    } else {
                        j67 = 0;
                    }
                    long j119 = j67;
                    long j120 = d17.E;
                    if (optLong27 >= j120) {
                        d17.E = optLong27;
                        j68 = optLong27 - j120;
                    } else {
                        j68 = 0;
                    }
                    long j121 = j68;
                    long j122 = d17.F;
                    if (optLong28 >= j122) {
                        d17.F = optLong28;
                        j69 = optLong28 - j122;
                    } else {
                        j69 = 0;
                    }
                    long j123 = j69;
                    long j124 = d17.G;
                    if (optLong29 >= j124) {
                        d17.G = optLong29;
                        j76 = optLong29 - j124;
                    } else {
                        j76 = 0;
                    }
                    long j125 = j76;
                    long j126 = d17.H;
                    if (optLong30 >= j126) {
                        d17.H = optLong30;
                        j77 = optLong30 - j126;
                    } else {
                        j77 = 0;
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderLiveP2pStatReportStruct finderLiveP2pStatReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveP2pStatReportStruct();
                    finderLiveP2pStatReportStruct.f57231d = d17.L;
                    finderLiveP2pStatReportStruct.f57233e = finderLiveP2pStatReportStruct.b("finderNickname", d17.M, true);
                    finderLiveP2pStatReportStruct.f57235f = j79;
                    finderLiveP2pStatReportStruct.f57237g = j87;
                    finderLiveP2pStatReportStruct.f57239h = finderLiveP2pStatReportStruct.b("natType", optString, true);
                    finderLiveP2pStatReportStruct.f57240i = optLong3;
                    finderLiveP2pStatReportStruct.f57241j = optLong4;
                    finderLiveP2pStatReportStruct.f57242k = optLong5;
                    finderLiveP2pStatReportStruct.f57243l = optLong6;
                    finderLiveP2pStatReportStruct.f57244m = optLong7;
                    finderLiveP2pStatReportStruct.f57245n = finderLiveP2pStatReportStruct.b("isp", optString2, true);
                    finderLiveP2pStatReportStruct.f57246o = finderLiveP2pStatReportStruct.b("url", optString3, true);
                    finderLiveP2pStatReportStruct.f57247p = finderLiveP2pStatReportStruct.b("full_url", optString4, true);
                    finderLiveP2pStatReportStruct.f57248q = j19;
                    finderLiveP2pStatReportStruct.f57249r = j98;
                    finderLiveP2pStatReportStruct.f57250s = j29;
                    finderLiveP2pStatReportStruct.f57251t = j37;
                    finderLiveP2pStatReportStruct.f57252u = finderLiveP2pStatReportStruct.b("uuid", optString5, true);
                    finderLiveP2pStatReportStruct.f57253v = finderLiveP2pStatReportStruct.b("pieceid", optString6, true);
                    finderLiveP2pStatReportStruct.f57254w = finderLiveP2pStatReportStruct.b("send", optString7, true);
                    finderLiveP2pStatReportStruct.f57255x = finderLiveP2pStatReportStruct.b("recv", optString8, true);
                    finderLiveP2pStatReportStruct.f57256y = optLong13;
                    finderLiveP2pStatReportStruct.f57257z = j96;
                    finderLiveP2pStatReportStruct.A = optLong14;
                    finderLiveP2pStatReportStruct.B = optLong15;
                    finderLiveP2pStatReportStruct.C = optLong16;
                    finderLiveP2pStatReportStruct.D = optLong17;
                    finderLiveP2pStatReportStruct.E = optLong18;
                    finderLiveP2pStatReportStruct.F = j103;
                    finderLiveP2pStatReportStruct.G = j105;
                    finderLiveP2pStatReportStruct.H = j49;
                    finderLiveP2pStatReportStruct.I = j57;
                    finderLiveP2pStatReportStruct.f57227J = j113;
                    finderLiveP2pStatReportStruct.K = j115;
                    finderLiveP2pStatReportStruct.L = j117;
                    finderLiveP2pStatReportStruct.M = j119;
                    finderLiveP2pStatReportStruct.N = j121;
                    finderLiveP2pStatReportStruct.O = j123;
                    finderLiveP2pStatReportStruct.P = j125;
                    finderLiveP2pStatReportStruct.Q = j77;
                    finderLiveP2pStatReportStruct.R = optLong31;
                    finderLiveP2pStatReportStruct.S = optLong32;
                    finderLiveP2pStatReportStruct.T = optLong33;
                    finderLiveP2pStatReportStruct.U = optLong34;
                    finderLiveP2pStatReportStruct.V = optLong35;
                    finderLiveP2pStatReportStruct.W = optLong36;
                    finderLiveP2pStatReportStruct.X = optLong37;
                    finderLiveP2pStatReportStruct.Y = optLong38;
                    finderLiveP2pStatReportStruct.Z = optLong39;
                    finderLiveP2pStatReportStruct.f57228a0 = optLong40;
                    finderLiveP2pStatReportStruct.f57229b0 = optLong41;
                    finderLiveP2pStatReportStruct.f57230c0 = d17.K;
                    finderLiveP2pStatReportStruct.f57232d0 = finderLiveP2pStatReportStruct.b("version", optString9, true);
                    finderLiveP2pStatReportStruct.f57234e0 = j111;
                    finderLiveP2pStatReportStruct.f57236f0 = j109;
                    finderLiveP2pStatReportStruct.f57238g0 = finderLiveP2pStatReportStruct.b("trans_stream_name", str2, true);
                    finderLiveP2pStatReportStruct.k();
                } catch (org.json.JSONException e17) {
                    e = e17;
                    java.lang.String str5 = str4;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str5, e, str3, new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e(str5, "xp2p Wrapper parseJsonAndReport error!");
                }
            } catch (org.json.JSONException e18) {
                e = e18;
                str3 = "";
            }
        } catch (org.json.JSONException e19) {
            e = e19;
            str3 = "";
            str4 = "MicroMsg.MMXp2pWrapper";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.MMXp2pWrapper"
            java.lang.String r1 = "xp2p Wrapper getStat dataStr: "
            java.lang.String r2 = "xp2p Wrapper getStat error, statusCode: "
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r4.<init>()     // Catch: java.lang.Exception -> L85
            r4.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = "&token="
            r4.append(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r8.f319673b     // Catch: java.lang.Exception -> L85
            r4.append(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L85
            com.tencent.mm.network.h2 r4 = com.tencent.mm.network.n.d(r4, r3)     // Catch: java.lang.Exception -> L85
            r5 = 10000(0x2710, float:1.4013E-41)
            r4.g(r5)     // Catch: java.lang.Exception -> L82
            r4.k(r5)     // Catch: java.lang.Exception -> L82
            r4.a()     // Catch: java.lang.Exception -> L82
            int r5 = r4.f()     // Catch: java.lang.Exception -> L82
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = " url: "
            if (r5 != r6) goto L6c
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Exception -> L82
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r8.c(r2)     // Catch: java.lang.Throwable -> L65
            vz5.b.a(r2, r3)     // Catch: java.lang.Exception -> L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r2.<init>(r1)     // Catch: java.lang.Exception -> L82
            r2.append(r5)     // Catch: java.lang.Exception -> L82
            r2.append(r7)     // Catch: java.lang.Exception -> L82
            r2.append(r9)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = " streamId: "
            r2.append(r1)     // Catch: java.lang.Exception -> L82
            r2.append(r10)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L82
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L82
            r8.e(r5, r10)     // Catch: java.lang.Exception -> L82
            goto La0
        L65:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            vz5.b.a(r2, r10)     // Catch: java.lang.Exception -> L82
            throw r1     // Catch: java.lang.Exception -> L82
        L6c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r10.<init>(r2)     // Catch: java.lang.Exception -> L82
            r10.append(r5)     // Catch: java.lang.Exception -> L82
            r10.append(r7)     // Catch: java.lang.Exception -> L82
            r10.append(r9)     // Catch: java.lang.Exception -> L82
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L82
            com.tencent.mars.xlog.Log.i(r0, r10)     // Catch: java.lang.Exception -> L82
            goto La0
        L82:
            r10 = move-exception
            r3 = r4
            goto L86
        L85:
            r10 = move-exception
        L86:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r10, r2, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "xp2p Wrapper getStat error!!! "
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mars.xlog.Log.e(r0, r9)
            r4 = r3
        La0:
            if (r4 == 0) goto La5
            r4.disconnect()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.p.f(java.lang.String, java.lang.String):void");
    }

    public final void g(int i17) {
        if (i17 >= 0 && i17 < 4) {
            com.qcloud.qvb.XNet.setLogLevel(i17);
        } else {
            com.qcloud.qvb.XNet.setLogLevel(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper setLogLevel: " + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.p.h(java.lang.String):void");
    }
}
