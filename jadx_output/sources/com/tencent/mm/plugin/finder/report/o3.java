package com.tencent.mm.plugin.finder.report;

@j95.b
/* loaded from: classes10.dex */
public final class o3 extends i95.w implements zy2.qa {

    /* renamed from: s */
    public static final com.tencent.mm.plugin.finder.report.j3 f125207s = new com.tencent.mm.plugin.finder.report.j3(null);

    /* renamed from: d */
    public java.lang.String f125208d = "";

    /* renamed from: e */
    public java.lang.String f125209e = "";

    /* renamed from: f */
    public final android.util.LongSparseArray f125210f = new android.util.LongSparseArray();

    /* renamed from: g */
    public final java.util.HashMap f125211g = new java.util.HashMap();

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentHashMap f125212h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i */
    public java.util.LinkedList f125213i;

    /* renamed from: m */
    public final android.util.LongSparseArray f125214m;

    /* renamed from: n */
    public final android.util.SparseArray f125215n;

    /* renamed from: o */
    public final java.math.BigInteger f125216o;

    /* renamed from: p */
    public boolean f125217p;

    /* renamed from: q */
    public boolean f125218q;

    /* renamed from: r */
    public cl0.g f125219r;

    public o3() {
        new android.util.ArrayMap();
        this.f125214m = new android.util.LongSparseArray();
        this.f125215n = new android.util.SparseArray();
        this.f125216o = java.math.BigInteger.ONE.shiftLeft(64);
    }

    public static void Ij(com.tencent.mm.plugin.finder.report.o3 o3Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, int i27, int i28, java.lang.String str4, int i29, int i37, r45.qt2 qt2Var, java.lang.String str5, int i38, int i39, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i39 & 2048) != 0 ? null : qt2Var;
        java.lang.String str6 = (i39 & 4096) != 0 ? "" : str5;
        int i47 = (i39 & 8192) != 0 ? 0 : i38;
        o3Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderSearchResultExposeClickStruct finderSearchResultExposeClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSearchResultExposeClickStruct();
        finderSearchResultExposeClickStruct.f57796d = finderSearchResultExposeClickStruct.b("RequestId", str == null ? "" : str, true);
        finderSearchResultExposeClickStruct.f57797e = finderSearchResultExposeClickStruct.b("Query", str2 == null ? "" : str2, true);
        finderSearchResultExposeClickStruct.f57798f = i17;
        finderSearchResultExposeClickStruct.f57799g = i18;
        finderSearchResultExposeClickStruct.f57800h = finderSearchResultExposeClickStruct.b("ItemId", str3, true);
        finderSearchResultExposeClickStruct.f57801i = i19;
        finderSearchResultExposeClickStruct.f57802j = i27;
        finderSearchResultExposeClickStruct.f57803k = i28;
        if (qt2Var2 != null) {
            finderSearchResultExposeClickStruct.f57804l = finderSearchResultExposeClickStruct.b("SessionId", qt2Var2.getString(0), true);
            finderSearchResultExposeClickStruct.f57806n = qt2Var2.getInteger(5);
            finderSearchResultExposeClickStruct.f57805m = finderSearchResultExposeClickStruct.b("ClicktabcontextId", qt2Var2.getString(2), true);
        }
        finderSearchResultExposeClickStruct.f57807o = finderSearchResultExposeClickStruct.b("SearchSessionid", str4, true);
        finderSearchResultExposeClickStruct.f57808p = i29;
        finderSearchResultExposeClickStruct.f57809q = i37;
        finderSearchResultExposeClickStruct.f57811s = finderSearchResultExposeClickStruct.b("hotWordId", str6 != null ? str6 : "", true);
        finderSearchResultExposeClickStruct.f57812t = i47;
        finderSearchResultExposeClickStruct.k();
        o3Var.Zk(finderSearchResultExposeClickStruct);
    }

    public static /* synthetic */ void Kj(com.tencent.mm.plugin.finder.report.o3 o3Var, android.content.Context context, long j17, boolean z17, long j18, long j19, boolean z18, long j27, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        o3Var.Jj(context, j17, z17, j18, j19, (i17 & 32) != 0 ? false : z18, (i17 & 64) != 0 ? 0L : j27, (i17 & 128) != 0 ? "" : str, (i17 & 256) != 0 ? "" : str2);
    }

    public static void Mj(com.tencent.mm.plugin.finder.report.o3 o3Var, android.content.Context context, long j17, long j18, boolean z17, int i17, int i18, java.lang.String udfKv, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            z17 = false;
        }
        if ((i19 & 16) != 0) {
            i17 = 1;
        }
        if ((i19 & 32) != 0) {
            i18 = 1;
        }
        if ((i19 & 64) != 0) {
            udfKv = "";
        }
        o3Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        com.tencent.mm.autogen.mmdata.rpt.FinderSettingExposeStruct finderSettingExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSettingExposeStruct();
        finderSettingExposeStruct.f57815d = j17;
        finderSettingExposeStruct.f57816e = j18;
        finderSettingExposeStruct.f57817f = z17 ? 1L : 0L;
        finderSettingExposeStruct.f57818g = i17;
        finderSettingExposeStruct.f57819h = i18;
        finderSettingExposeStruct.f57820i = finderSettingExposeStruct.b("udf_kv", udfKv, true);
        finderSettingExposeStruct.k();
        o3Var.Zk(finderSettingExposeStruct);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Nk(com.tencent.mm.plugin.finder.report.o3 o3Var, android.content.Context context, long j17, java.lang.String str, int i17, int i18, java.lang.String contextId, boolean z17, boolean z18, cl0.g data, int i19, int i27, int i28, int i29, int i37, java.lang.String str2, long j18, long j19, int i38, int i39, int i47, int i48, int i49, java.lang.String str3, boolean z19, int i57, boolean z27, int i58, boolean z28, int i59, int i66, qc2.a aVar, r45.cl2 cl2Var, float f17, so2.e1 e1Var, int i67, int i68, java.lang.Object obj) {
        java.lang.String str4;
        int i69;
        java.lang.Object obj2;
        int i76;
        long j27;
        int i77;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        qc2.a aVar2;
        java.util.HashMap hashMap3;
        boolean z29;
        int i78;
        int i79;
        r45.cl2 cl2Var2;
        int i86;
        long j28;
        java.lang.String gVar;
        android.content.Context context2;
        int i87 = (i67 & 2048) != 0 ? 0 : i28;
        int i88 = (i67 & 4096) != 0 ? 0 : i29;
        int i89 = (i67 & 8192) != 0 ? 0 : i37;
        java.lang.Object adPosId = (i67 & 16384) != 0 ? "" : str2;
        long j29 = (32768 & i67) != 0 ? 0L : j18;
        int i96 = (131072 & i67) != 0 ? 0 : i38;
        int i97 = (i67 & 262144) != 0 ? 0 : i39;
        int i98 = (i67 & 524288) != 0 ? 0 : i47;
        int i99 = (i67 & 1048576) != 0 ? 0 : i48;
        int i100 = (i67 & 2097152) != 0 ? 0 : i49;
        java.lang.String playSequence = (i67 & 4194304) != 0 ? "" : str3;
        boolean z37 = (i67 & 8388608) != 0 ? false : z19;
        int i101 = (16777216 & i67) != 0 ? 0 : i57;
        boolean z38 = (i67 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? false : z27;
        int i102 = (i67 & 67108864) != 0 ? 0 : i58;
        boolean z39 = (i67 & 134217728) != 0 ? false : z28;
        int i103 = (i67 & 268435456) != 0 ? 0 : i59;
        int i104 = (i67 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? -1 : i66;
        int i105 = i101;
        qc2.a aVar3 = (i67 & 1073741824) != 0 ? null : aVar;
        r45.cl2 cl2Var3 = (i67 & Integer.MIN_VALUE) != 0 ? null : cl2Var;
        float f18 = (i68 & 1) != 0 ? 0.0f : f17;
        so2.e1 e1Var2 = (i68 & 2) != 0 ? null : e1Var;
        o3Var.getClass();
        r45.cl2 cl2Var4 = cl2Var3;
        boolean z47 = z37;
        int i106 = i97;
        qc2.b bVar = qc2.b.f361509a;
        int i107 = i87;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(adPosId, "adPosId");
        kotlin.jvm.internal.o.g(playSequence, "playSequence");
        try {
            cl0.g gVar2 = new cl0.g();
            java.lang.Object obj3 = adPosId;
            if (z18) {
                i76 = 2;
                obj2 = "";
            } else {
                obj2 = "";
                i76 = 1;
            }
            long c17 = c01.id.c();
            gVar2.o("report_type", i76);
            gVar2.h("advert_group_id", data.optString(ya.b.GROUP_ID));
            gVar2.h("trace_id", data.optString("traceid"));
            java.lang.Object optString = data.optString("apurl");
            java.lang.Object optString2 = data.optString("rl");
            if (!z18) {
                optString2 = optString;
            }
            gVar2.h("report_link", optString2);
            gVar2.o("pos_type", data.optInt("pos_type"));
            gVar2.o("click_pos", 0);
            gVar2.o("ad_w", i19);
            gVar2.o("ad_h", i27);
            int i108 = i96;
            long j37 = j29;
            try {
                gVar2.p("aid", j37);
                gVar2.h("pt", data.opt("pt"));
                gVar2.r("viewable", z17);
                gVar2.o("screen_cnt", 1);
                gVar2.o("from_h5", 0);
                gVar2.o("from_game", 0);
                gVar2.o("exposure_type", z17 ? 1 : 0);
                cl0.g gVar3 = new cl0.g();
                gVar3.o("page_x", i88);
                gVar3.o("page_y", i89);
                gVar3.o("screen_x", i88);
                gVar3.o("screen_y", i89);
                gVar3.o("ad_number", 1);
                gVar3.o("ad_unit_number", 1);
                gVar3.o("ad_index", 0);
                gVar3.p("page_enter_time", j19);
                com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
                gVar3.o("phone_screen_width", e8Var.c(null));
                gVar3.o("phone_screen_height", e8Var.a());
                gVar2.h("wxa_report_detail", gVar3);
                cl0.g gVar4 = new cl0.g();
                gVar4.h("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
                ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
                gVar4.h("imei", obj2);
                gVar4.h("common_device_id", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
                gVar2.h("ext_click_comm", gVar4.toString());
                gVar2.h("pos_id", obj3);
                cl0.g gVar5 = new cl0.g();
                gVar5.h("context_id", contextId);
                gVar5.o("pos", i108);
                gVar2.h("channels_extra_data", gVar5.toString());
                gVar2.o("click_pos", i107);
                i69 = i106;
                try {
                    gVar2.o("outer_duration", i69);
                    gVar2.o("play_count", i98);
                    int i109 = i99;
                    gVar2.o("play_total_time", i109);
                    gVar2.o("video_total_time", i100);
                    gVar2.h("play_sequence", playSequence);
                    gVar2.h("report_extra_data", data.opt("report_extra_data"));
                    gVar2.r("card_show_flag", z47);
                    gVar2.o("card_delay_sec", i105);
                    boolean z48 = z38;
                    gVar2.r("card_expand_flag", z48);
                    int i110 = i102;
                    gVar2.o("card_expand_sec", i110);
                    boolean z49 = z39;
                    gVar2.r("hit_landpage_preload", z49);
                    j29 = j37;
                    int i111 = i103;
                    try {
                        gVar2.o("landpage_preload_sec", i111);
                        gVar2.p("report_ts", c17);
                        int i112 = i104;
                        if (i112 >= 0) {
                            j27 = c17;
                            gVar2.o("expose_report_mode", i112);
                        } else {
                            j27 = c17;
                        }
                        qc2.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            i77 = i112;
                        } else if (z18) {
                            i77 = i112;
                            gVar2.o("carousel_index", aVar4.f361504a);
                        } else {
                            i77 = i112;
                            gVar2.h("carousel_show_sequence", aVar4.f361507d);
                            gVar2.h("carousel_auto_sequence", aVar4.f361505b);
                            gVar2.h("carousel_man_sequence", aVar4.f361506c);
                            gVar2.h("carousel_click_sequence", aVar4.f361508e);
                        }
                        if (z18) {
                            gVar2.h("current_play_sec", java.lang.Float.valueOf(f18));
                        }
                        so2.e1 e1Var3 = e1Var2;
                        if (e1Var3 != null) {
                            try {
                                hashMap = e1Var3.f410326c;
                                hashMap2 = e1Var3.f410325b;
                                aVar2 = aVar4;
                                hashMap3 = e1Var3.f410324a;
                                z29 = z49;
                                i78 = i110;
                                gVar2.h("carousel_pic_show_sequence", e1Var3.a(hashMap3));
                                gVar2.h("carousel_pic_auto_sequence", e1Var3.a(hashMap2));
                                gVar2.h("carousel_pic_man_sequence", e1Var3.a(hashMap));
                                str4 = "Finder.FinderReportLogic";
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                str4 = "Finder.FinderReportLogic";
                                qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                                com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "reportExpose", new java.lang.Object[0]);
                            }
                            try {
                                com.tencent.mars.xlog.Log.i(str4, "reportHardAdvertisement image, carousel_pic_show_sequence: " + e1Var3.a(hashMap3) + ", carousel_pic_auto_sequence: " + e1Var3.a(hashMap2) + ", carousel_pic_man_sequence: " + e1Var3.a(hashMap));
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                                com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "reportExpose", new java.lang.Object[0]);
                            }
                        } else {
                            str4 = "Finder.FinderReportLogic";
                            i78 = i110;
                            aVar2 = aVar4;
                            z29 = z49;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportHardAdvertisement actionType=");
                        try {
                            sb6.append(i18);
                            sb6.append(", reportType=");
                            sb6.append(i76);
                            sb6.append(", clickPos=");
                            sb6.append(i107);
                            sb6.append(", exposureType=");
                            sb6.append(z17 ? 1 : 0);
                            sb6.append(" outerDuration=");
                            sb6.append(i69);
                            sb6.append(", playTotalTime=");
                            sb6.append(i109);
                            sb6.append(", playSequence=");
                            sb6.append(playSequence);
                            sb6.append(", isCardShown=");
                            sb6.append(z47);
                            sb6.append(", cardDelaySec=");
                            sb6.append(i105);
                            sb6.append(", isCardExpand=");
                            sb6.append(z48);
                            sb6.append(", cardExpandSec=");
                            sb6.append(i78);
                            sb6.append(", hitPreload=");
                            sb6.append(z29);
                            sb6.append(", preloadSec=");
                            sb6.append(i111);
                            sb6.append(", reportTs=");
                            sb6.append(j27);
                            sb6.append(", exposeReportMode=");
                            i79 = i77;
                            sb6.append(i79);
                            sb6.append(", carouselData=");
                            sb6.append(aVar2);
                            sb6.append(", advertisementInfoAid=");
                            if (cl2Var4 != null) {
                                cl2Var2 = cl2Var4;
                                i86 = 1;
                                j28 = cl2Var2.getLong(1);
                            } else {
                                cl2Var2 = cl2Var4;
                                i86 = 1;
                                j28 = 0;
                            }
                            sb6.append(pm0.v.u(j28));
                            com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                            gVar = gVar2.toString();
                            kotlin.jvm.internal.o.f(gVar, "toString(...)");
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                            com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "reportExpose", new java.lang.Object[0]);
                        }
                        try {
                            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                                pf5.z zVar = pf5.z.f353948a;
                                context2 = context;
                                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                new db2.p(j17, str, i18, gVar, "", cl2Var2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).l().K(new com.tencent.mm.plugin.finder.report.l3(j17, i76, z17 ? 1 : 0));
                            } else {
                                context2 = context;
                                db2.l5 l5Var = new db2.l5(j17, str, i17, i18, gVar, cl2Var2);
                                l5Var.f228064m = new com.tencent.mm.plugin.finder.report.m3(j17, i76, z17 ? 1 : 0);
                                gm0.j1.d().g(l5Var);
                            }
                            boolean z57 = i79 == i86 ? i86 : 0;
                            qc2.b.a(bVar, z18 ? 1 : 0, j17, i17, j29, z17, gVar, i18, i69, z57, null, 512, null);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("isViewable", z17);
                            jSONObject.put("isVideoExpose", z57);
                            jSONObject.put("isClick", z18);
                            java.lang.String str5 = z18 ? "click" : z17 ? "viewable" : z57 != 0 ? "original-video" : "original-component";
                            pf5.z zVar2 = pf5.z.f353948a;
                            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
                            if (p1Var != null) {
                                p1Var.O6(j17, "reportFinderAdHard-".concat(str5), jSONObject, j29);
                            }
                            if (z18) {
                                return;
                            }
                            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
                            if (p1Var2 != null) {
                                p1Var2.f135499e.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                            com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "reportExpose", new java.lang.Object[0]);
                        }
                    } catch (java.lang.Exception e28) {
                        e = e28;
                        str4 = "Finder.FinderReportLogic";
                    }
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str4 = "Finder.FinderReportLogic";
                    j29 = j37;
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                str4 = "Finder.FinderReportLogic";
                j29 = j37;
                i69 = i106;
            }
        } catch (java.lang.Exception e38) {
            e = e38;
            str4 = "Finder.FinderReportLogic";
            i69 = i106;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cl0.g] */
    public static void Rk(com.tencent.mm.plugin.finder.report.o3 o3Var, android.content.Context context, boolean z17, long j17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        ?? r37 = (i17 & 8) != 0 ? 0 : z18;
        o3Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        ?? gVar = new cl0.g();
        gVar.h("feedid", pm0.v.u(j17));
        gVar.o("is_spam", r37);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ij(o3Var, z19 ? 1 : 0, "new_fav_add", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public static void Uk(com.tencent.mm.plugin.finder.report.o3 o3Var, android.content.Context context, com.tencent.mm.plugin.finder.report.k3 k3Var, com.tencent.mm.plugin.finder.report.i3 i3Var, com.tencent.mm.plugin.finder.report.h3 h3Var, com.tencent.mm.plugin.finder.report.f3 f3Var, com.tencent.mm.plugin.finder.report.g3 g3Var, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.report.i3 i3Var2 = (i17 & 4) != 0 ? null : i3Var;
        com.tencent.mm.plugin.finder.report.h3 h3Var2 = (i17 & 8) != 0 ? com.tencent.mm.plugin.finder.report.h3.f125062e : h3Var;
        com.tencent.mm.plugin.finder.report.f3 f3Var2 = (i17 & 16) != 0 ? null : f3Var;
        com.tencent.mm.plugin.finder.report.g3 g3Var2 = (i17 & 32) != 0 ? null : g3Var;
        o3Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (k3Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", "reportPreMovieAd: reportInfo is null");
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        try {
            cl0.g gVar = new cl0.g();
            long c17 = c01.id.c() / 1000;
            gVar.h("report_type", i3Var2 != null ? java.lang.Integer.valueOf(i3Var2.f125075d) : null);
            gVar.h("exposure_type", h3Var2 != null ? java.lang.Integer.valueOf(h3Var2.f125065d) : null);
            gVar.h("click_pos", f3Var2 != null ? java.lang.Integer.valueOf(f3Var2.f125019d) : null);
            if (h3Var2 == com.tencent.mm.plugin.finder.report.h3.f125063f) {
                gVar.p("outer_duration", k3Var.f125098c);
                gVar.o("play_count", 1);
                gVar.p("play_total_time", k3Var.f125099d);
                gVar.p("video_total_time", k3Var.f125100e);
            }
            gVar.h("report_extra_data", k3Var.f125101f);
            gVar.p("report_ts", c17);
            gVar.h("ad_finish_type", g3Var2 != null ? java.lang.Integer.valueOf(g3Var2.f125050d) : null);
            java.lang.String gVar2 = gVar.toString();
            java.lang.String str = gVar2 == null ? "" : gVar2;
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "reportPreMovieAd: feedId=" + k3Var.f125096a + ", JSON data: " + str);
            long j17 = k3Var.f125096a;
            java.lang.String str2 = k3Var.f125097b;
            java.lang.String str3 = k3Var.f125102g;
            new db2.p(j17, str2, 0, str, str3 == null ? "" : str3, null, V6).l().f(context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderReportLogic", e17, "reportFinderAdCgi", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r7 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Vi(com.tencent.mm.plugin.finder.report.o3 r2, long r3, int r5, int r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L6
            r7 = r0
        L6:
            r9 = r9 & 16
            if (r9 == 0) goto Lb
            r8 = r0
        Lb:
            java.lang.String r9 = ""
            if (r7 == 0) goto L1a
            r2.getClass()
            java.lang.String r10 = "_"
            java.lang.String r7 = r10.concat(r7)
            if (r7 != 0) goto L1b
        L1a:
            r7 = r9
        L1b:
            java.util.HashMap r2 = r2.f125211g
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r0 = 95
            r10.append(r0)
            if (r8 != 0) goto L2e
            r1 = r9
            goto L2f
        L2e:
            r1 = r8
        L2f:
            r10.append(r1)
            r10.append(r0)
            r10.append(r6)
            r10.append(r7)
            java.lang.String r6 = r10.toString()
            java.lang.Object r6 = r2.get(r6)
            com.tencent.mm.plugin.finder.report.e6 r6 = (com.tencent.mm.plugin.finder.report.e6) r6
            if (r6 == 0) goto L68
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r0)
            if (r8 != 0) goto L55
            r8 = r9
        L55:
            r10.append(r8)
            r10.append(r0)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r3 = r10.toString()
            r2.put(r3, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.Vi(com.tencent.mm.plugin.finder.report.o3, long, int, int, java.lang.String, java.lang.String, int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Vj(com.tencent.mm.plugin.finder.report.o3 r33, long r34, java.lang.String r36, int r37, long r38, java.lang.String r40, r45.qt2 r41, long r42, com.tencent.mm.plugin.finder.storage.FinderItem r44, java.lang.Boolean r45, int r46, java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.Vj(com.tencent.mm.plugin.finder.report.o3, long, java.lang.String, int, long, java.lang.String, r45.qt2, long, com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.Boolean, int, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r8 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String fk(com.tencent.mm.plugin.finder.report.o3 r2, long r3, java.lang.String r5, int r6, int r7, java.lang.String r8, int r9, java.lang.Object r10) {
        /*
            r9 = r9 & 16
            if (r9 == 0) goto L5
            r8 = 0
        L5:
            java.lang.String r9 = ""
            if (r8 == 0) goto L14
            r2.getClass()
            java.lang.String r10 = "_"
            java.lang.String r8 = r10.concat(r8)
            if (r8 != 0) goto L15
        L14:
            r8 = r9
        L15:
            java.util.HashMap r2 = r2.f125211g
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r0 = 95
            r10.append(r0)
            if (r5 != 0) goto L28
            r1 = r9
            goto L29
        L28:
            r1 = r5
        L29:
            r10.append(r1)
            r10.append(r0)
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
            java.lang.Object r6 = r2.get(r6)
            com.tencent.mm.plugin.finder.report.e6 r6 = (com.tencent.mm.plugin.finder.report.e6) r6
            r10 = 1
            if (r6 == 0) goto L4f
            r45.fl2 r6 = r6.f125012a
            if (r6 == 0) goto L4f
            java.lang.String r6 = r6.getString(r10)
            if (r6 != 0) goto L4d
            goto L4f
        L4d:
            r9 = r6
            goto L81
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r0)
            if (r5 != 0) goto L5d
            r5 = r9
        L5d:
            r6.append(r5)
            r6.append(r0)
            r6.append(r7)
            r6.append(r8)
            java.lang.String r3 = r6.toString()
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.finder.report.e6 r2 = (com.tencent.mm.plugin.finder.report.e6) r2
            if (r2 == 0) goto L81
            r45.fl2 r2 = r2.f125012a
            if (r2 == 0) goto L81
            java.lang.String r2 = r2.getString(r10)
            if (r2 != 0) goto L80
            goto L81
        L80:
            r9 = r2
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.fk(com.tencent.mm.plugin.finder.report.o3, long, java.lang.String, int, int, java.lang.String, int, java.lang.Object):java.lang.String");
    }

    public static /* synthetic */ com.tencent.mm.plugin.finder.report.e6 hk(com.tencent.mm.plugin.finder.report.o3 o3Var, long j17, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str2 = null;
        }
        return o3Var.gk(j17, str, i17, str2);
    }

    public static /* synthetic */ void ij(com.tencent.mm.plugin.finder.report.o3 o3Var, int i17, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, java.lang.String str3, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            str3 = null;
        }
        o3Var.hj(i17, str, str2, qt2Var, str3);
    }

    public static void pj(com.tencent.mm.plugin.finder.report.o3 o3Var, r45.qt2 qt2Var, java.lang.String requestId, int i17, int i18, java.lang.String tagText, java.lang.String queryText, int i19, long j17, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 64) != 0) {
            i19 = 0;
        }
        if ((i28 & 128) != 0) {
            j17 = 0;
        }
        if ((i28 & 256) != 0) {
            i27 = 0;
        }
        o3Var.getClass();
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(tagText, "tagText");
        kotlin.jvm.internal.o.g(queryText, "queryText");
        com.tencent.mm.autogen.mmdata.rpt.FinderInteractionSearchStruct finderInteractionSearchStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderInteractionSearchStruct();
        finderInteractionSearchStruct.f56948f = finderInteractionSearchStruct.b("SearchSessionId", o3Var.f125209e, true);
        finderInteractionSearchStruct.f56949g = finderInteractionSearchStruct.b("RequestId", requestId, true);
        finderInteractionSearchStruct.f56950h = i17;
        finderInteractionSearchStruct.f56951i = i18;
        finderInteractionSearchStruct.f56953k = 0;
        finderInteractionSearchStruct.f56954l = finderInteractionSearchStruct.b("TagText", tagText, true);
        finderInteractionSearchStruct.f56955m = finderInteractionSearchStruct.b("QueryText", queryText, true);
        finderInteractionSearchStruct.f56956n = i19;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderInteractionSearchStruct.f56957o = finderInteractionSearchStruct.b("ItemId", b52.b.q(j17), true);
        finderInteractionSearchStruct.f56958p = i27;
        if (qt2Var != null) {
            finderInteractionSearchStruct.f56946d = finderInteractionSearchStruct.b("SessionId", qt2Var.getString(0), true);
            finderInteractionSearchStruct.f56952j = qt2Var.getInteger(5);
            finderInteractionSearchStruct.f56947e = finderInteractionSearchStruct.b("ClicktabcontextId", qt2Var.getString(2), true);
            finderInteractionSearchStruct.f56959q = finderInteractionSearchStruct.b("ContextID", qt2Var.getString(1), true);
        }
        finderInteractionSearchStruct.k();
        o3Var.Zk(finderInteractionSearchStruct);
    }

    public static void uj(com.tencent.mm.plugin.finder.report.o3 o3Var, java.lang.String currUI, int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String str2, long j17, r45.qt2 qt2Var, int i29, int i37, int i38, java.lang.Object obj) {
        int i39 = (i38 & 16) != 0 ? 0 : i27;
        int i47 = (i38 & 32) != 0 ? 0 : i28;
        java.lang.String str3 = (i38 & 64) != 0 ? "" : str;
        java.lang.String redDotWording = (i38 & 128) != 0 ? "" : str2;
        long j18 = (i38 & 256) != 0 ? 0L : j17;
        r45.qt2 qt2Var2 = (i38 & 512) != 0 ? null : qt2Var;
        int i48 = (i38 & 1024) != 0 ? 0 : i29;
        int i49 = (i38 & 2048) != 0 ? 0 : i37;
        o3Var.getClass();
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(redDotWording, "redDotWording");
        o3Var.sj(currUI, i17, i18, i19, i39, i47, str3, redDotWording, j18, qt2Var2, i48, i49, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static void wj(com.tencent.mm.plugin.finder.report.o3 o3Var, r45.qt2 contextObj, long j17, java.lang.String str, androidx.recyclerview.widget.RecyclerView recyclerView, int i17, java.lang.String str2, long j18, java.lang.String str3, int i18, java.lang.Object obj) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String t17;
        ?? r57;
        long j19;
        r45.el2 feedBgmInfo;
        r45.zi2 zi2Var;
        r45.el2 feedBgmInfo2;
        r45.el2 feedBgmInfo3;
        java.lang.String string;
        r45.xl2 event;
        long j27;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (i18 & 8) != 0 ? null : recyclerView;
        int i19 = (i18 & 16) != 0 ? 0 : i17;
        java.lang.String udfKv = (i18 & 32) != 0 ? "" : str2;
        long j28 = (i18 & 64) != 0 ? 0L : j18;
        java.lang.String allFeedInfo = (i18 & 128) != 0 ? "" : str3;
        o3Var.getClass();
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        kotlin.jvm.internal.o.g(allFeedInfo, "allFeedInfo");
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = o3Var.dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct finderFlowClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct();
            finderFlowClickStruct.f56845d = contextObj.getInteger(5);
            finderFlowClickStruct.f56846e = finderFlowClickStruct.b("SessionId", contextObj.getString(0), true);
            finderFlowClickStruct.f56847f = finderFlowClickStruct.b("ContextId", contextObj.getString(1), true);
            finderFlowClickStruct.f56848g = finderFlowClickStruct.b("ClickTabContextId", contextObj.getString(2), true);
            finderFlowClickStruct.f56849h = finderFlowClickStruct.b("ClickFeedid", pm0.v.u(j17), true);
            finderFlowClickStruct.f56852k = c01.id.c();
            java.lang.String string2 = contextObj.getString(9);
            if (string2 != null) {
                str4 = "";
                str5 = r26.i0.t(string2, ",", ";", false);
            } else {
                str4 = "";
                str5 = str4;
            }
            long j29 = j28;
            finderFlowClickStruct.f56853l = finderFlowClickStruct.b("PageTag", str5, true);
            finderFlowClickStruct.f56855n = dk6.getMediaType();
            java.lang.String gVar = o3Var.kk().toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            finderFlowClickStruct.f56856o = finderFlowClickStruct.b("ScreenInfo", r26.i0.t(gVar, ",", ";", false), true);
            if (recyclerView2 != null) {
                java.lang.String jSONArray = o3Var.ck(recyclerView2).toString();
                kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
                t17 = r26.i0.t(jSONArray, ",", ";", false);
            } else {
                t17 = r26.i0.t(allFeedInfo, ",", ";", false);
            }
            finderFlowClickStruct.f56850i = finderFlowClickStruct.b("AllFeedInfo", t17, true);
            finderFlowClickStruct.f56851j = az2.j.f16133r.b(contextObj.getInteger(5));
            finderFlowClickStruct.f56854m = finderFlowClickStruct.b("SessionBuffer", o3Var.ek(j17, str, contextObj.getInteger(5)), true);
            if (contextObj.getInteger(5) == 15) {
                int recommendReasonType = dk6.getFeedObject().getRecommendReasonType();
                if (recommendReasonType != 1) {
                    switch (recommendReasonType) {
                        case 9:
                            j27 = 6;
                            break;
                        case 10:
                            j27 = 2;
                            break;
                        case 11:
                            j27 = 3;
                            break;
                        case 12:
                            j27 = 5;
                            break;
                        case 13:
                            j27 = 4;
                            break;
                        default:
                            j27 = 0;
                            break;
                    }
                } else {
                    j27 = 1;
                }
                finderFlowClickStruct.f56857p = j27;
                java.lang.String recommendReason = dk6.getFeedObject().getRecommendReason();
                if (recommendReason == null) {
                    recommendReason = str4;
                }
                finderFlowClickStruct.f56858q = finderFlowClickStruct.b("RecommendWording", recommendReason, true);
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = dk6.getFeedObject().getObjectDesc();
            if (objectDesc == null || (event = objectDesc.getEvent()) == null) {
                r57 = 1;
            } else {
                r57 = 1;
                finderFlowClickStruct.f56861t = finderFlowClickStruct.b("ActivityID", pm0.v.u(event.getLong(0)), true);
                finderFlowClickStruct.f56862u = i19;
                java.lang.String string3 = contextObj.getString(15);
                if (string3 == null) {
                    string3 = str4;
                }
                finderFlowClickStruct.f56863v = finderFlowClickStruct.b("ActivityInfo", string3, true);
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = dk6.getFeedObject().getObjectDesc();
            finderFlowClickStruct.f56859r = finderFlowClickStruct.b("GroupID", (objectDesc2 == null || (feedBgmInfo3 = objectDesc2.getFeedBgmInfo()) == 0 || (string = feedBgmInfo3.getString(r57)) == null) ? str4 : string, r57);
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = dk6.getFeedObject().getObjectDesc();
            if (((objectDesc3 == null || (feedBgmInfo2 = objectDesc3.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0)) != null) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = dk6.getFeedObject().getObjectDesc();
                java.lang.String string4 = (objectDesc4 == null || (feedBgmInfo = objectDesc4.getFeedBgmInfo()) == null || (zi2Var = (r45.zi2) feedBgmInfo.getCustom(0)) == null) ? null : zi2Var.getString(0);
                if (!(string4 == null || string4.length() == 0)) {
                    j19 = 2;
                    finderFlowClickStruct.f56860s = j19;
                    finderFlowClickStruct.f56864w = finderFlowClickStruct.b("jump_id", contextObj.getString(16), true);
                    finderFlowClickStruct.f56865x = finderFlowClickStruct.b("udf_kv", r26.i0.t(udfKv, ",", ";", false), true);
                    finderFlowClickStruct.f56866y = j29;
                    finderFlowClickStruct.k();
                    o3Var.Zk(finderFlowClickStruct);
                }
            }
            j19 = 1;
            finderFlowClickStruct.f56860s = j19;
            finderFlowClickStruct.f56864w = finderFlowClickStruct.b("jump_id", contextObj.getString(16), true);
            finderFlowClickStruct.f56865x = finderFlowClickStruct.b("udf_kv", r26.i0.t(udfKv, ",", ";", false), true);
            finderFlowClickStruct.f56866y = j29;
            finderFlowClickStruct.k();
            o3Var.Zk(finderFlowClickStruct);
        }
    }

    public final void Ai(android.content.Context context, long j17, java.lang.String str, java.lang.String key, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().getInteger(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        if (fl2Var != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("jumpinfoType", finderJumpInfo.getJumpinfo_type());
                com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
                jSONObject.put("nativeType", native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null);
                jSONObject.put("wording", finderJumpInfo.getWording());
                java.lang.String string = fl2Var.getString(5);
                if (string == null) {
                    string = "";
                }
                org.json.JSONObject jSONObject2 = string.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(string);
                org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("jumpicon_info");
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                optJSONObject.put("jumpicon_info", jSONObject);
                jSONObject2.put(key, optJSONObject);
                fl2Var.set(5, jSONObject2.toString());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", e17.getMessage());
            }
        }
    }

    public final void Ak(int i17, java.lang.String userName, java.lang.String profileBizUin, java.lang.String str, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(profileBizUin, "profileBizUin");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mm.autogen.mmdata.rpt.FinderProfileAtPersonStruct finderProfileAtPersonStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderProfileAtPersonStruct();
        finderProfileAtPersonStruct.f57641d = i17;
        finderProfileAtPersonStruct.f57643f = finderProfileAtPersonStruct.b("ProfileUsername", userName, true);
        finderProfileAtPersonStruct.f57644g = finderProfileAtPersonStruct.b("ProfileBizUin", profileBizUin, true);
        finderProfileAtPersonStruct.f57645h = finderProfileAtPersonStruct.b("ExtInfo", str, true);
        finderProfileAtPersonStruct.f57646i = finderProfileAtPersonStruct.b("Contextid", contextObj.getString(1), true);
        java.lang.String string = contextObj.getString(11);
        finderProfileAtPersonStruct.f57647j = finderProfileAtPersonStruct.b("ExtraInfo", string != null ? r26.i0.t(string, ",", ";", false) : "", true);
        java.lang.String string2 = contextObj.getString(12);
        finderProfileAtPersonStruct.f57648k = finderProfileAtPersonStruct.b("EnterSourceInfo", string2 != null ? r26.i0.t(string2, ",", ";", false) : "", true);
        finderProfileAtPersonStruct.k();
        Zk(finderProfileAtPersonStruct);
    }

    public final void Bi(int i17, long j17, java.lang.String str, float f17, long j18, int i18, java.lang.String traceId, java.lang.String sourceFeedId, int i19, int i27, long j19, int i28) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(sourceFeedId, "sourceFeedId");
        com.tencent.mm.plugin.finder.report.e6 hk6 = hk(this, j17, str, i17, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        if (fl2Var != null) {
            java.lang.String string = fl2Var.getString(5);
            if (string == null) {
                string = "";
            }
            fl2Var.set(5, ak(f17, j18, i18, traceId, sourceFeedId, i19, string, i17, i27, j19, i28));
        }
    }

    public final void Bj(int i17, int i18, int i19, int i27, long j17) {
        java.lang.String str;
        com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct finderMsgItemClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderMsgItemClickStruct.f57421d = finderMsgItemClickStruct.b("SessionId", Ri, true);
        finderMsgItemClickStruct.f57422e = i17;
        finderMsgItemClickStruct.f57426i = i18;
        finderMsgItemClickStruct.f57423f = i19;
        finderMsgItemClickStruct.f57424g = i27;
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            int i28 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            while (j18 > 0) {
                i28--;
                cArr[i28] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i28, 64 - i28);
        }
        finderMsgItemClickStruct.f57425h = finderMsgItemClickStruct.b("feedid", str, true);
        finderMsgItemClickStruct.k();
        Zk(finderMsgItemClickStruct);
    }

    public void Bk(int i17, long j17, long j18, int i18, int i19, long j19, long j27, long j28, long j29, int i27, int i28, java.lang.String statistics, int i29, int i37, java.lang.String cgiErrmsg, int i38, int i39, java.lang.String liveEventMsg, java.lang.String extra, java.lang.String snn, long j37, long j38, java.lang.String session) {
        kotlin.jvm.internal.o.g(statistics, "statistics");
        kotlin.jvm.internal.o.g(cgiErrmsg, "cgiErrmsg");
        kotlin.jvm.internal.o.g(liveEventMsg, "liveEventMsg");
        kotlin.jvm.internal.o.g(extra, "extra");
        kotlin.jvm.internal.o.g(snn, "snn");
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStatisticsReportStruct finderLiveStatisticsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStatisticsReportStruct();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        finderLiveStatisticsReportStruct.f57352d = 7L;
        finderLiveStatisticsReportStruct.f57353e = i17;
        finderLiveStatisticsReportStruct.f57354f = i18;
        finderLiveStatisticsReportStruct.f57355g = i19;
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        st2.f2 f2Var = st2.f2.f412287a;
        finderLiveStatisticsReportStruct.f57356h = ((java.lang.Number) ((jz5.n) st2.f2.f412291e).getValue()).intValue();
        finderLiveStatisticsReportStruct.f57357i = j19;
        finderLiveStatisticsReportStruct.f57358j = j27;
        finderLiveStatisticsReportStruct.f57359k = j28;
        finderLiveStatisticsReportStruct.f57360l = j29;
        finderLiveStatisticsReportStruct.f57361m = i27;
        finderLiveStatisticsReportStruct.f57362n = i28;
        finderLiveStatisticsReportStruct.f57363o = finderLiveStatisticsReportStruct.b("statistics", r26.i0.t(statistics, ",", ";", false), true);
        finderLiveStatisticsReportStruct.f57364p = i29;
        finderLiveStatisticsReportStruct.f57365q = i37;
        finderLiveStatisticsReportStruct.f57366r = finderLiveStatisticsReportStruct.b("cgiErrmsg", cgiErrmsg, true);
        finderLiveStatisticsReportStruct.f57367s = i38;
        finderLiveStatisticsReportStruct.f57368t = i39;
        finderLiveStatisticsReportStruct.f57369u = finderLiveStatisticsReportStruct.b("liveEventMsg", liveEventMsg, true);
        finderLiveStatisticsReportStruct.f57370v = finderLiveStatisticsReportStruct.b("extra", extra, true);
        finderLiveStatisticsReportStruct.f57371w = finderLiveStatisticsReportStruct.b("snn", snn, true);
        finderLiveStatisticsReportStruct.f57372x = j37;
        finderLiveStatisticsReportStruct.f57373y = j38;
        finderLiveStatisticsReportStruct.f57374z = finderLiveStatisticsReportStruct.b("localsession", session, true);
        finderLiveStatisticsReportStruct.A = j17;
        finderLiveStatisticsReportStruct.B = j18;
        if (i17 == 2) {
            cl0.g gVar = new cl0.g();
            ae2.in inVar = ae2.in.f3688a;
            gVar.o("enableClickRedDotPreloadPlayer", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3740f1).getValue()).r()).intValue());
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            finderLiveStatisticsReportStruct.C = finderLiveStatisticsReportStruct.b("exptJson", r26.i0.t(gVar2, ",", ";", false), true);
        }
        finderLiveStatisticsReportStruct.k();
        Zk(finderLiveStatisticsReportStruct);
    }

    public final void Cj(int i17, int i18, int i19, long j17) {
        java.lang.String str;
        com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct finderMsgItemClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderMsgItemClickStruct.f57421d = finderMsgItemClickStruct.b("SessionId", Ri, true);
        finderMsgItemClickStruct.f57422e = i17;
        finderMsgItemClickStruct.f57426i = 0L;
        finderMsgItemClickStruct.f57423f = i18;
        finderMsgItemClickStruct.f57424g = i19;
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            char forDigit = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            int i27 = 63;
            cArr[63] = forDigit;
            while (j18 > 0) {
                i27--;
                cArr[i27] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i27, 64 - i27);
        }
        finderMsgItemClickStruct.f57425h = finderMsgItemClickStruct.b("feedid", str, true);
        finderMsgItemClickStruct.k();
        Zk(finderMsgItemClickStruct);
    }

    public void Ck(long j17, java.lang.String appId, java.lang.String clickId, long j18, java.lang.String sessionid, java.lang.String setting, java.lang.String requestId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(clickId, "clickId");
        kotlin.jvm.internal.o.g(sessionid, "sessionid");
        kotlin.jvm.internal.o.g(setting, "setting");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        com.tencent.mm.autogen.mmdata.rpt.OpenSmallappShopStruct openSmallappShopStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenSmallappShopStruct();
        openSmallappShopStruct.f59806d = java.lang.System.currentTimeMillis();
        openSmallappShopStruct.f59807e = j17;
        openSmallappShopStruct.f59810h = openSmallappShopStruct.b("appid", appId, true);
        openSmallappShopStruct.f59813k = openSmallappShopStruct.b("clickid", clickId, true);
        openSmallappShopStruct.f59808f = j18;
        openSmallappShopStruct.f59812j = openSmallappShopStruct.b("finderid", g92.b.f269769e.U(), true);
        openSmallappShopStruct.f59811i = openSmallappShopStruct.b("session_id", sessionid, true);
        openSmallappShopStruct.f59809g = openSmallappShopStruct.b("setting", setting, true);
        openSmallappShopStruct.f59814l = openSmallappShopStruct.b("requestID", requestId, true);
        openSmallappShopStruct.k();
        Zk(openSmallappShopStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di(android.content.Context r22, com.tencent.mm.plugin.finder.storage.FinderItem r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.Di(android.content.Context, com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    public final void Dj(int i17, java.lang.String str, java.lang.String str2, long j17, int i18) {
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderCommentClickStruct finderCommentClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentClickStruct();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderCommentClickStruct.f56672d = finderCommentClickStruct.b("SessionId", Ri, true);
            finderCommentClickStruct.f56673e = finderCommentClickStruct.b("ClickUI", "", true);
            finderCommentClickStruct.f56674f = finderCommentClickStruct.b("FeedId", Ui(j17), true);
            finderCommentClickStruct.f56675g = finderCommentClickStruct.b("FeedUsr", dk6.getUserName(), true);
            finderCommentClickStruct.f56676h = dk6.getLikeCount();
            finderCommentClickStruct.f56677i = dk6.getCommentCount();
            finderCommentClickStruct.f56678j = dk6.getFriendLikeCount();
            finderCommentClickStruct.f56679k = i18;
            finderCommentClickStruct.f56680l = i17;
            finderCommentClickStruct.f56681m = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() == 1 ? 1L : 0L;
            finderCommentClickStruct.f56682n = finderCommentClickStruct.b("ContextId", str, true);
            finderCommentClickStruct.f56683o = finderCommentClickStruct.b("ClickTabContextId", str2, true);
            finderCommentClickStruct.k();
            Zk(finderCommentClickStruct);
        }
    }

    public final void Dk(long j17, long j18, long j19, r45.qt2 qt2Var) {
        com.tencent.mm.autogen.mmdata.rpt.ActivityBrowseClickStruct activityBrowseClickStruct = new com.tencent.mm.autogen.mmdata.rpt.ActivityBrowseClickStruct();
        activityBrowseClickStruct.f55023h = j17;
        activityBrowseClickStruct.f55024i = activityBrowseClickStruct.b("EventTime", java.lang.String.valueOf(c01.id.c()), true);
        activityBrowseClickStruct.f55025j = j18;
        activityBrowseClickStruct.f55026k = activityBrowseClickStruct.b("ActivityId", pm0.v.u(j19), true);
        activityBrowseClickStruct.f55022g = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        activityBrowseClickStruct.f55019d = activityBrowseClickStruct.b("SessionId", qt2Var != null ? qt2Var.getString(0) : null, true);
        activityBrowseClickStruct.f55020e = activityBrowseClickStruct.b("ClickTabContextid", qt2Var != null ? qt2Var.getString(2) : null, true);
        activityBrowseClickStruct.f55021f = activityBrowseClickStruct.b("FinderContexId", qt2Var != null ? qt2Var.getString(1) : null, true);
        activityBrowseClickStruct.k();
        Zk(activityBrowseClickStruct);
    }

    public final void Ej(int i17, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgItemClickStruct finderSysMsgItemClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgItemClickStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderSysMsgItemClickStruct.f57892d = finderSysMsgItemClickStruct.b("SessionId", Ri, true);
        finderSysMsgItemClickStruct.f57893e = i17;
        finderSysMsgItemClickStruct.f57894f = j17;
        finderSysMsgItemClickStruct.k();
        Zk(finderSysMsgItemClickStruct);
    }

    public final void Ek(java.lang.String appId, int i17, r45.qt2 qt2Var, java.lang.String resId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(resId, "resId");
        com.tencent.mm.autogen.mmdata.rpt.WeAppAtChannelsStruct weAppAtChannelsStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppAtChannelsStruct();
        weAppAtChannelsStruct.f62218d = weAppAtChannelsStruct.b("AppID", appId, true);
        weAppAtChannelsStruct.f62219e = i17;
        weAppAtChannelsStruct.f62224j = weAppAtChannelsStruct.b("pageResrouceID", resId, true);
        if (qt2Var != null) {
            weAppAtChannelsStruct.f62221g = weAppAtChannelsStruct.b("ContextId", qt2Var.getString(1), true);
            weAppAtChannelsStruct.f62223i = qt2Var.getInteger(5);
            weAppAtChannelsStruct.f62222h = weAppAtChannelsStruct.b("click_tab_context_id", qt2Var.getString(2), true);
            weAppAtChannelsStruct.f62220f = weAppAtChannelsStruct.b("sessionID", qt2Var.getString(0), true);
        }
        weAppAtChannelsStruct.k();
        Zk(weAppAtChannelsStruct);
    }

    public final void Fj(int i17, int i18, r45.qt2 contextObj, int i19) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mm.autogen.mmdata.rpt.FinderFeedTabSwitchStruct finderFeedTabSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedTabSwitchStruct();
        finderFeedTabSwitchStruct.f56833d = i17 > 0 ? i17 : 0L;
        finderFeedTabSwitchStruct.f56834e = i18 > 0 ? i18 : 0L;
        finderFeedTabSwitchStruct.f56835f = c01.id.c();
        finderFeedTabSwitchStruct.f56836g = finderFeedTabSwitchStruct.b("Sessionid", contextObj.getString(0), true);
        finderFeedTabSwitchStruct.f56840k = finderFeedTabSwitchStruct.b("ContextID", contextObj.getString(1), true);
        finderFeedTabSwitchStruct.f56837h = finderFeedTabSwitchStruct.b("ClickContextid", contextObj.getString(2), true);
        finderFeedTabSwitchStruct.f56839j = i19;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 != 4) {
                        if (i18 == 35 && ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_city_tab") != null) {
                            finderFeedTabSwitchStruct.f56838i = 1L;
                        }
                    } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_hot_tab") != null) {
                        finderFeedTabSwitchStruct.f56838i = 1L;
                    }
                } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLFollow") != null) {
                    finderFeedTabSwitchStruct.f56838i = 1L;
                }
            } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_nearby_tab") != null) {
                finderFeedTabSwitchStruct.f56838i = 1L;
            }
        } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLRecommendTab") != null) {
            finderFeedTabSwitchStruct.f56838i = 1L;
        }
        finderFeedTabSwitchStruct.k();
        Zk(finderFeedTabSwitchStruct);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, finderFeedTabSwitchStruct.f56837h);
        if (i18 != 2) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_CLICK_TAB_CONTEXT_ID_STRING, finderFeedTabSwitchStruct.f56837h);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "finderReportTabChange clickTabContextId [%s] toTab[%d]", finderFeedTabSwitchStruct.f56837h, java.lang.Integer.valueOf(i18));
    }

    public final void Fk(long j17, java.lang.String str, int i17, int i18, int i19, int i27, java.lang.String mutualAdInfo, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(mutualAdInfo, "mutualAdInfo");
        com.tencent.mm.autogen.mmdata.rpt.FinderAdIconExpoClickNewStruct finderAdIconExpoClickNewStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAdIconExpoClickNewStruct();
        finderAdIconExpoClickNewStruct.f56467d = finderAdIconExpoClickNewStruct.b("feedid", Ui(j17), true);
        finderAdIconExpoClickNewStruct.f56469f = i17;
        finderAdIconExpoClickNewStruct.f56470g = i18;
        if (i18 == 2) {
            cl0.g gVar = new cl0.g();
            gVar.o("duration", i27);
            gVar.o("playpercent", (int) (((i19 * 1.0f) / i27) * 100));
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            finderAdIconExpoClickNewStruct.f56471h = finderAdIconExpoClickNewStruct.b("feedplayinfo", r26.i0.t(gVar2, ",", ";", false), true);
        }
        finderAdIconExpoClickNewStruct.f56472i = finderAdIconExpoClickNewStruct.b("MutualAdInfo", r26.i0.t(mutualAdInfo, ",", ";", false), true);
        if (qt2Var != null) {
            java.lang.String string = qt2Var.getString(11);
            finderAdIconExpoClickNewStruct.f56475l = finderAdIconExpoClickNewStruct.b("ExtraInfo", string != null ? r26.i0.t(string, ",", ";", false) : "", true);
            java.lang.String string2 = qt2Var.getString(12);
            finderAdIconExpoClickNewStruct.f56476m = finderAdIconExpoClickNewStruct.b("enterSourceInfo", string2 != null ? r26.i0.t(string2, ",", ";", false) : "", true);
            finderAdIconExpoClickNewStruct.f56473j = finderAdIconExpoClickNewStruct.b("sessionbuffer", r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, qt2Var.getInteger(5)), ",", ";", false), true);
            finderAdIconExpoClickNewStruct.f56474k = finderAdIconExpoClickNewStruct.b("Contextid", qt2Var.getString(1), true);
            finderAdIconExpoClickNewStruct.f56468e = qt2Var.getInteger(5);
        }
        finderAdIconExpoClickNewStruct.k();
        Zk(finderAdIconExpoClickNewStruct);
    }

    public final void Gj(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, int i27, int i28, int i29, r45.qt2 qt2Var) {
        com.tencent.mm.autogen.mmdata.rpt.FinderSearchActionReportStruct finderSearchActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSearchActionReportStruct();
        finderSearchActionReportStruct.f57772f = i17;
        finderSearchActionReportStruct.f57773g = finderSearchActionReportStruct.b("searchSessionId", str, true);
        finderSearchActionReportStruct.f57774h = finderSearchActionReportStruct.b("requestId", str2, true);
        finderSearchActionReportStruct.f57775i = finderSearchActionReportStruct.b("query", str3, true);
        finderSearchActionReportStruct.f57776j = i18;
        finderSearchActionReportStruct.f57777k = i19;
        finderSearchActionReportStruct.f57779m = i27;
        finderSearchActionReportStruct.f57780n = i28;
        finderSearchActionReportStruct.f57781o = i29;
        if (qt2Var != null) {
            finderSearchActionReportStruct.f57770d = finderSearchActionReportStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, qt2Var.getString(0), true);
            finderSearchActionReportStruct.f57778l = qt2Var.getInteger(5);
            finderSearchActionReportStruct.f57771e = finderSearchActionReportStruct.b("ClickTabContextId", qt2Var.getString(2), true);
        }
        finderSearchActionReportStruct.k();
        Zk(finderSearchActionReportStruct);
    }

    public final void Gk(android.content.Context context, long j17, boolean z17, boolean z18, int i17, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        cl0.g gVar = new cl0.g();
        gVar.o("is_logo", z18 ? 1 : 0);
        gVar.o("finder_type", i17);
        if (z17) {
            gVar.o("click_type", z19 ? 1 : 2);
            gVar.h("feed_id", pm0.v.u(j17));
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ij(this, z17 ? 1 : 0, "comment_avatar", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public final void Hj(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, int i27, int i28, java.lang.String str4, int i29, int i37, r45.qt2 qt2Var) {
        com.tencent.mm.autogen.mmdata.rpt.FinderSearchClickStruct finderSearchClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSearchClickStruct();
        finderSearchClickStruct.f57782d = finderSearchClickStruct.b("RequestId", str, true);
        finderSearchClickStruct.f57783e = finderSearchClickStruct.b("Query", str2, true);
        finderSearchClickStruct.f57784f = i17;
        finderSearchClickStruct.f57785g = i18;
        finderSearchClickStruct.f57786h = finderSearchClickStruct.b("ItemId", str3, true);
        finderSearchClickStruct.f57787i = i19;
        finderSearchClickStruct.f57788j = i27;
        finderSearchClickStruct.f57789k = i28;
        if (qt2Var != null) {
            finderSearchClickStruct.f57790l = finderSearchClickStruct.b("sessionid", qt2Var.getString(0), true);
            finderSearchClickStruct.f57792n = qt2Var.getInteger(5);
            finderSearchClickStruct.f57791m = finderSearchClickStruct.b("clicktabcontextid", qt2Var.getString(2), true);
        }
        finderSearchClickStruct.f57793o = finderSearchClickStruct.b("searchSessionid", str4, true);
        finderSearchClickStruct.f57794p = i29;
        finderSearchClickStruct.f57795q = i37;
        finderSearchClickStruct.k();
        Zk(finderSearchClickStruct);
    }

    public final void Ik(android.view.View view, long j17, long j18, int i17, java.lang.String commentContent) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(commentContent, "commentContent");
        hc2.v0.e(view, "help_author_together", 0, 0, false, false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("comment_id", pm0.v.u(j18)), new jz5.l("comment_content_type", java.lang.Integer.valueOf(i17)), new jz5.l("comment_content", commentContent)), null, 94, null);
    }

    public final void Jj(android.content.Context context, long j17, boolean z17, long j18, long j19, boolean z18, long j27, java.lang.String redDotCountDetail, java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(redDotCountDetail, "redDotCountDetail");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.autogen.mmdata.rpt.FinderPersonalCenterEventStruct finderPersonalCenterEventStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPersonalCenterEventStruct();
        finderPersonalCenterEventStruct.f57481d = finderPersonalCenterEventStruct.b("sessionid", V6 != null ? V6.getString(0) : null, true);
        finderPersonalCenterEventStruct.f57482e = j17;
        finderPersonalCenterEventStruct.f57483f = z17 ? 1L : 0L;
        finderPersonalCenterEventStruct.f57484g = j18;
        finderPersonalCenterEventStruct.f57485h = j19;
        finderPersonalCenterEventStruct.f57486i = java.lang.System.currentTimeMillis();
        finderPersonalCenterEventStruct.f57487j = z18 ? 1L : 0L;
        finderPersonalCenterEventStruct.f57488k = j27;
        finderPersonalCenterEventStruct.f57489l = finderPersonalCenterEventStruct.b("RedDotCountDetail", redDotCountDetail, true);
        if (finderUsername.length() > 0) {
            finderPersonalCenterEventStruct.f57490m = finderPersonalCenterEventStruct.b("finderusername", finderUsername, true);
        }
        finderPersonalCenterEventStruct.k();
    }

    public final void Jk(r45.qt2 qt2Var, boolean z17, int i17, java.lang.String wordText, java.lang.String referer) {
        kotlin.jvm.internal.o.g(wordText, "wordText");
        kotlin.jvm.internal.o.g(referer, "referer");
        int i18 = z17 ? 1 : 0;
        try {
            cl0.g gVar = new cl0.g();
            gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
            byte[] decode = android.util.Base64.decode(referer, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            gVar.h("referer", new cl0.g(new java.lang.String(decode, r26.c.f368865a)));
            cl0.g gVar2 = new cl0.g();
            gVar2.h("jump_info", gVar);
            gVar2.o("position", i17 - 1);
            gVar2.h("word_text", wordText);
            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, qt2Var, "feed_jumpicon", i18, gVar2, true, null, 32, null);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", e17.getMessage());
        }
    }

    public final void Kk(long j17, java.lang.String str, long j18, long j19, java.lang.String paperWording, long j27, int i17) {
        kotlin.jvm.internal.o.g(paperWording, "paperWording");
        com.tencent.mm.autogen.mmdata.rpt.DailyPaperExpoClickStruct dailyPaperExpoClickStruct = new com.tencent.mm.autogen.mmdata.rpt.DailyPaperExpoClickStruct();
        dailyPaperExpoClickStruct.f55768d = dailyPaperExpoClickStruct.b("Feedid", Ui(j17), true);
        dailyPaperExpoClickStruct.f55770f = j18;
        dailyPaperExpoClickStruct.f55771g = dailyPaperExpoClickStruct.b("DailyPaperId", Ui(j19), true);
        dailyPaperExpoClickStruct.f55772h = dailyPaperExpoClickStruct.b("DailyPaperWording", paperWording, true);
        dailyPaperExpoClickStruct.f55774j = j27;
        dailyPaperExpoClickStruct.f55769e = c01.id.c();
        dailyPaperExpoClickStruct.f55773i = dailyPaperExpoClickStruct.b("SessionBuffer", ek(j17, str, i17), true);
        dailyPaperExpoClickStruct.k();
        Zk(dailyPaperExpoClickStruct);
    }

    public final void Lj(int i17, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.FinderSettingCheckStruct finderSettingCheckStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSettingCheckStruct();
        finderSettingCheckStruct.f57813d = i17;
        finderSettingCheckStruct.f57814e = i18;
        finderSettingCheckStruct.k();
        Zk(finderSettingCheckStruct);
    }

    public final void Lk(android.content.Context context, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f125217p) {
            cl0.g gVar = new cl0.g();
            gVar.o("hasfeed", z18 ? 1 : 0);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            ij(this, z17 ? 1 : 0, "post_moment", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
        }
    }

    public final void Mk(java.lang.String exposeFeedId, int i17, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(exposeFeedId, "exposeFeedId");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        jx3.f.INSTANCE.d(20585, exposeFeedId, java.lang.Long.valueOf(c01.id.c()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(contextObj.getInteger(5)), contextObj.getString(2), contextObj.getString(0));
    }

    public final void Ni(in5.s0 holder, long j17, com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        int i17;
        int intValue;
        r45.vx0 vx0Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        long j18 = 0;
        float currentPosMs = ((float) (finderVideoLayout != null ? finderVideoLayout.getCurrentPosMs() : 0L)) / 1000;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(feedObject.getMediaList());
        int integer2 = mb4Var != null ? mb4Var.getInteger(3) : 0;
        int O6 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).O6(j17) + 1;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        int adapterPosition = holder.getAdapterPosition() - (V6 != null ? V6.getInteger(4) : 0);
        java.lang.String str = "";
        java.lang.String u17 = V6 != null ? pm0.v.u(V6.getLong(6)) : "";
        if (V6 != null && (string = V6.getString(19)) != null) {
            str = string;
        }
        int integer3 = V6 != null ? V6.getInteger(7) : 0;
        r45.dm2 object_extend = feedObject.getFeedObject().getObject_extend();
        if (object_extend != null && (vx0Var = (r45.vx0) object_extend.getCustom(0)) != null) {
            j18 = vx0Var.getLong(0);
        }
        long j19 = j18;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(feedObject.getColumnId());
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.search.l4.f125764d.get(java.lang.Long.valueOf(j17));
            java.lang.Integer valueOf2 = finderItem != null ? java.lang.Integer.valueOf(finderItem.getColumnId()) : null;
            if (valueOf2 == null) {
                i17 = 0;
                Bi(integer, j17, feedObject.getDupFlag(), currentPosMs, integer2, O6, str, u17, adapterPosition, integer3, j19, i17);
            }
            intValue = valueOf2.intValue();
        }
        i17 = intValue;
        Bi(integer, j17, feedObject.getDupFlag(), currentPosMs, integer2, O6, str, u17, adapterPosition, integer3, j19, i17);
    }

    public final void Nj(int i17, boolean z17, java.lang.String receiver, long j17, java.lang.String str, r45.qt2 qt2Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.o.g(receiver, "receiver");
        com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct finderForwardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct();
        finderForwardStruct.f56912r = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        finderForwardStruct.f56899e = i17;
        finderForwardStruct.f56900f = z17 ? 1L : 2L;
        finderForwardStruct.f56916v = j17;
        finderForwardStruct.u(receiver);
        java.lang.String str5 = "";
        if (qt2Var == null || (str2 = qt2Var.getString(0)) == null) {
            str2 = "";
        }
        finderForwardStruct.v(str2);
        if (qt2Var == null || (str3 = qt2Var.getString(2)) == null) {
            str3 = "";
        }
        finderForwardStruct.p(str3);
        if (qt2Var == null || (str4 = qt2Var.getString(1)) == null) {
            str4 = "";
        }
        finderForwardStruct.r(str4);
        finderForwardStruct.t((qt2Var == null || (string3 = qt2Var.getString(11)) == null) ? "" : r26.i0.t(string3, ",", ";", false));
        finderForwardStruct.s((qt2Var == null || (string2 = qt2Var.getString(12)) == null) ? "" : r26.i0.t(string2, ",", ";", false));
        if (str == null) {
            str = "";
        }
        finderForwardStruct.C = finderForwardStruct.b("ActivityID", str, true);
        if (qt2Var != null && (string = qt2Var.getString(16)) != null) {
            str5 = string;
        }
        finderForwardStruct.E = finderForwardStruct.b("jump_id", str5, true);
        cl0.g gVar = new cl0.g();
        gVar.p("menu_exp_time", com.tencent.mm.plugin.finder.report.x3.f125433b);
        gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(20)) : null);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderForwardStruct.q(r26.i0.t(gVar2, ",", ";", false));
        finderForwardStruct.k();
        Zk(finderForwardStruct);
    }

    public final void Oj(long j17, int i17, long j18, java.lang.String receiver, long j19, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.o.g(receiver, "receiver");
        com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct finderForwardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct();
        finderForwardStruct.f56912r = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        finderForwardStruct.f56899e = i17;
        finderForwardStruct.f56900f = j18;
        finderForwardStruct.f56916v = j19;
        finderForwardStruct.u(receiver);
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.getString(0)) == null) {
            str = "";
        }
        finderForwardStruct.v(str);
        finderForwardStruct.f56915u = finderForwardStruct.b("SessionBuffer", ek(j17, null, qt2Var != null ? qt2Var.getInteger(5) : 0), true);
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        finderForwardStruct.p(str2);
        if (qt2Var == null || (str3 = qt2Var.getString(1)) == null) {
            str3 = "";
        }
        finderForwardStruct.r(str3);
        finderForwardStruct.t((qt2Var == null || (string3 = qt2Var.getString(11)) == null) ? "" : r26.i0.t(string3, ",", ";", false));
        finderForwardStruct.s((qt2Var == null || (string2 = qt2Var.getString(12)) == null) ? "" : r26.i0.t(string2, ",", ";", false));
        finderForwardStruct.B = finderForwardStruct.b("ColumnId", pm0.v.u(j17), true);
        if (qt2Var != null && (string = qt2Var.getString(16)) != null) {
            str4 = string;
        }
        finderForwardStruct.E = finderForwardStruct.b("jump_id", str4, true);
        cl0.g gVar = new cl0.g();
        gVar.p("menu_exp_time", com.tencent.mm.plugin.finder.report.x3.f125433b);
        gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(20)) : null);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderForwardStruct.q(r26.i0.t(gVar2, ",", ";", false));
        finderForwardStruct.k();
        Zk(finderForwardStruct);
    }

    public final void Ok(java.lang.String contextId, boolean z17, boolean z18, cl0.g data, int i17, int i18, int i19, int i27, int i28, java.lang.String adPosId, long j17, long j18, int i29, float f17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(adPosId, "adPosId");
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("report_type", z18 ? 2 : 1);
            gVar.h("advert_group_id", data.optString(ya.b.GROUP_ID));
            gVar.h("trace_id", data.optString("traceid"));
            java.lang.String optString = data.optString("apurl");
            java.lang.String optString2 = data.optString("rl");
            if (z18) {
                optString = optString2;
            }
            gVar.h("report_link", optString);
            gVar.o("pos_type", data.optInt("pos_type"));
            gVar.o("click_pos", i19);
            gVar.o("ad_w", i17);
            gVar.o("ad_h", i18);
            gVar.h("pt", data.opt("pt"));
            gVar.r("viewable", z17);
            gVar.o("screen_cnt", 1);
            gVar.o("from_h5", 0);
            gVar.o("from_game", 0);
            gVar.o("exposure_type", z17 ? 1 : 0);
            cl0.g gVar2 = new cl0.g();
            gVar2.o("screen_x", i27);
            gVar2.o("screen_y", i28);
            gVar2.o("ad_unit_number", 1);
            gVar2.o("ad_number", 1);
            gVar2.o("ad_index", 0);
            gVar2.p("page_enter_time", j18);
            com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
            gVar2.o("phone_screen_width", e8Var.c(null));
            gVar2.o("phone_screen_height", e8Var.a());
            gVar.h("wxa_report_detail", gVar2);
            cl0.g gVar3 = new cl0.g();
            gVar3.h("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
            gVar3.h("imei", "");
            gVar3.h("common_device_id", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
            gVar.h("ext_click_comm", gVar3.toString());
            gVar.h("pos_id", adPosId);
            gVar.p("aid", j17);
            cl0.g gVar4 = new cl0.g();
            gVar4.h("context_id", contextId);
            gVar4.o("pos", i29);
            gVar.h("channels_extra_data", gVar4.toString());
            if (z18) {
                gVar.h("current_play_sec", java.lang.Float.valueOf(f17));
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                java.lang.String gVar5 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar5, "toString(...)");
                new db2.m2(1, gVar5, qt2Var).l();
            } else {
                java.lang.String gVar6 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar6, "toString(...)");
                gm0.j1.d().g(new db2.w5(1, gVar6));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderReportLogic", e17, "reportExpose", new java.lang.Object[0]);
        }
    }

    public final void Pj(r45.ev2 collection, long j17, java.lang.String receiver, long j18, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        cl0.g gVar;
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(collection, "collection");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct finderForwardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct();
        finderForwardStruct.f56912r = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        if (collection.getInteger(13) > 0) {
            finderForwardStruct.f56912r = collection.getInteger(13);
        }
        finderForwardStruct.f56900f = j17;
        finderForwardStruct.f56916v = j18;
        finderForwardStruct.u(receiver);
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.getString(0)) == null) {
            str = "";
        }
        finderForwardStruct.v(str);
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        finderForwardStruct.p(str2);
        if (qt2Var == null || (str3 = qt2Var.getString(1)) == null) {
            str3 = "";
        }
        finderForwardStruct.r(str3);
        finderForwardStruct.s((qt2Var == null || (string2 = qt2Var.getString(12)) == null) ? "" : r26.i0.t(string2, ",", ";", false));
        cl0.g gVar2 = new cl0.g();
        gVar2.p("menu_exp_time", com.tencent.mm.plugin.finder.report.x3.f125433b);
        gVar2.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(20)) : null);
        java.lang.String gVar3 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
        finderForwardStruct.q(r26.i0.t(gVar3, ",", ";", false));
        if (com.tencent.mm.sdk.platformtools.t8.K0(qt2Var != null ? qt2Var.getString(11) : null)) {
            gVar = new cl0.g();
        } else {
            try {
                if (qt2Var != null && (string = qt2Var.getString(11)) != null) {
                    str4 = string;
                }
                gVar = new cl0.g(str4);
            } catch (org.json.JSONException unused) {
                gVar = new cl0.g();
            }
        }
        gVar.h("collection_id", pm0.v.u(collection.getLong(0)));
        gVar.o("collection_feed_num", collection.getInteger(4));
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        finderForwardStruct.t(r26.i0.t(gVar4, ",", ";", false));
        finderForwardStruct.k();
        Zk(finderForwardStruct);
    }

    public final void Qj(long j17, int i17, long j18, java.lang.String fromUser, int i18, int i19, java.lang.String str, java.lang.String str2, int i27, long j19, java.lang.String str3) {
        long j27;
        r45.el2 feedBgmInfo;
        r45.zi2 zi2Var;
        r45.el2 feedBgmInfo2;
        r45.el2 feedBgmInfo3;
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct finderEnterSharedCardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderEnterSharedCardStruct.f56705d = finderEnterSharedCardStruct.b("SessionId", Ri, true);
        finderEnterSharedCardStruct.f56706e = i17;
        finderEnterSharedCardStruct.f56707f = j18;
        finderEnterSharedCardStruct.f56708g = finderEnterSharedCardStruct.b("SourceUsr", fromUser, true);
        finderEnterSharedCardStruct.f56709h = finderEnterSharedCardStruct.b("FeedId", Ui(j17), true);
        finderEnterSharedCardStruct.f56714m = i18;
        finderEnterSharedCardStruct.f56715n = i19;
        if (str2 != null) {
            finderEnterSharedCardStruct.f56720s = finderEnterSharedCardStruct.b("contextid", str2, true);
        }
        if (str != null) {
            finderEnterSharedCardStruct.f56719r = finderEnterSharedCardStruct.b("ActivityID", str, true);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            finderEnterSharedCardStruct.f56710i = finderEnterSharedCardStruct.b("FeedUsr", dk6.getFeedObject().getUsername(), true);
            finderEnterSharedCardStruct.f56711j = finderEnterSharedCardStruct.b("Tag", r26.i0.t(f125207s.a(dk6), ",", ";", false), true);
            java.util.LinkedList<r45.mb4> mediaList = dk6.getMediaList();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mediaList, 10));
            java.util.Iterator<T> it = mediaList.iterator();
            while (true) {
                j27 = 1;
                if (!it.hasNext()) {
                    break;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.mb4) it.next()).getString(16))) {
                    j27 = 0;
                }
                finderEnterSharedCardStruct.f56713l = j27;
                arrayList.add(jz5.f0.f302826a);
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = dk6.getFinderObject().getObjectDesc();
            java.lang.String str4 = null;
            finderEnterSharedCardStruct.f56716o = finderEnterSharedCardStruct.b("GroupID", (objectDesc == null || (feedBgmInfo3 = objectDesc.getFeedBgmInfo()) == null) ? null : feedBgmInfo3.getString(1), true);
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = dk6.getFeedObject().getObjectDesc();
            if (((objectDesc2 == null || (feedBgmInfo2 = objectDesc2.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0)) != null) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = dk6.getFeedObject().getObjectDesc();
                if (objectDesc3 != null && (feedBgmInfo = objectDesc3.getFeedBgmInfo()) != null && (zi2Var = (r45.zi2) feedBgmInfo.getCustom(0)) != null) {
                    str4 = zi2Var.getString(0);
                }
                if (!(str4 == null || str4.length() == 0)) {
                    j27 = 2;
                }
            }
            finderEnterSharedCardStruct.f56717p = j27;
        }
        finderEnterSharedCardStruct.f56721t = i27;
        finderEnterSharedCardStruct.f56723v = j19;
        finderEnterSharedCardStruct.f56724w = finderEnterSharedCardStruct.b("messageid", str3, true);
        finderEnterSharedCardStruct.k();
        Zk(finderEnterSharedCardStruct);
    }

    public void Qk(long j17, java.lang.String str, int i17, long j18, boolean z17, boolean z18, int i18, cl0.g data, java.lang.String bypassData, int i19, int i27, int i28, int i29, boolean z19) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        int i37 = z18 ? 2 : 1;
        int i38 = z17 ? 1 : 0;
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("report_type", i37);
            java.lang.String optString = data.optString("apurl");
            java.lang.String optString2 = data.optString("rl");
            if (z18) {
                optString = optString2;
            }
            gVar.h("report_link", optString);
            gVar.o("exposure_type", i38);
            gVar.h("pos_id", data.optString("ad_posid"));
            gVar.o("click_pos", i18);
            gVar.o("outer_duration", i19);
            gVar.o("play_count", i27);
            gVar.o("play_total_time", i28);
            gVar.o("video_total_time", i29);
            gVar.h("report_extra_data", data.opt("report_extra_data"));
            gVar.p("report_ts", c01.id.c());
            gVar.r("is_first_screen_exposed", z19);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                new db2.l(j17, str, i17, gVar2, bypassData).l();
            } else {
                java.lang.String gVar3 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                gm0.j1.d().g(new db2.h5(j17, str, i17, gVar3, bypassData));
            }
        } catch (java.lang.Exception unused) {
            pm0.z.b(xy2.b.f458155b, "finderCommentAdReport", false, null, null, false, false, new com.tencent.mm.plugin.finder.report.n3(j18), 60, null);
        }
    }

    public final void Ri(android.content.Context context, long j17, java.lang.String str, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().getInteger(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        if (fl2Var != null) {
            try {
                java.lang.String string = fl2Var.getString(5);
                if (string == null) {
                    string = "";
                }
                org.json.JSONObject jSONObject = string.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(string);
                jSONObject.put(key, obj);
                fl2Var.set(5, jSONObject.toString());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", e17.getMessage());
            }
        }
    }

    public final void Rj(long j17, int i17, java.lang.String fromUser, int i18, int i19, java.lang.String str, int i27, long j18, java.lang.String str2) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        Qj(j17, i17, 1L, fromUser, i18, i19, null, str, i27, j18, str2);
    }

    public final void Sk(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(item, "item");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", item.getFeedObject().getUserName());
        jSONObject.put("ref_commentscene", qt2Var != null ? qt2Var.getInteger(7) : 0);
        wi(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null, jSONObject, item.getItemId(), item.w());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ij(this, 1, "link_avatar_profile", r26.i0.t(jSONObject2, ",", ";", false), qt2Var, null, 16, null);
    }

    public final void Tk(r45.qt2 contextObj, java.lang.String poiText, java.lang.String filterTextItems, int i17, int i18) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(poiText, "poiText");
        kotlin.jvm.internal.o.g(filterTextItems, "filterTextItems");
        com.tencent.mm.autogen.mmdata.rpt.FinderTopicFilterTextExposeStruct finderTopicFilterTextExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderTopicFilterTextExposeStruct();
        finderTopicFilterTextExposeStruct.f57923e = finderTopicFilterTextExposeStruct.b("Sessionid", contextObj.getString(0), true);
        finderTopicFilterTextExposeStruct.f57924f = finderTopicFilterTextExposeStruct.b("Contextid", contextObj.getString(1), true);
        finderTopicFilterTextExposeStruct.f57925g = finderTopicFilterTextExposeStruct.b("ClickTabContextid", contextObj.getString(2), true);
        finderTopicFilterTextExposeStruct.f57922d = contextObj.getInteger(7);
        finderTopicFilterTextExposeStruct.f57926h = finderTopicFilterTextExposeStruct.b("PoiText", poiText, true);
        finderTopicFilterTextExposeStruct.f57927i = finderTopicFilterTextExposeStruct.b("FilterTextItems", filterTextItems, true);
        finderTopicFilterTextExposeStruct.f57928j = i17;
        finderTopicFilterTextExposeStruct.f57929k = i18;
        int integer = contextObj.getInteger(5);
        if (integer == 22) {
            finderTopicFilterTextExposeStruct.f57930l = 1L;
        } else if (integer == 26) {
            finderTopicFilterTextExposeStruct.f57930l = 2L;
        }
        finderTopicFilterTextExposeStruct.f57931m = contextObj.getInteger(5);
        finderTopicFilterTextExposeStruct.k();
        Zk(finderTopicFilterTextExposeStruct);
    }

    public final java.lang.String Ui(long j17) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j17);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(this.f125216o);
        }
        java.lang.String bigInteger = valueOf.toString();
        kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
        return bigInteger;
    }

    public void Uj(r45.kv2 shareObj, int i17, long j17, java.lang.String receiver, r45.qt2 qt2Var, long j18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        cl0.g gVar;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        kotlin.jvm.internal.o.g(shareObj, "shareObj");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct finderForwardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct();
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.getString(0)) == null) {
            str = "";
        }
        finderForwardStruct.v(str);
        finderForwardStruct.f56899e = i17;
        finderForwardStruct.f56900f = j17;
        finderForwardStruct.f56902h = finderForwardStruct.b("FeedId", shareObj.getString(0), true);
        finderForwardStruct.f56903i = finderForwardStruct.b("FeedUsr", shareObj.getString(1), true);
        finderForwardStruct.u(receiver);
        finderForwardStruct.f56905k = 0L;
        finderForwardStruct.f56906l = 0L;
        finderForwardStruct.f56907m = 0L;
        finderForwardStruct.f56908n = finderForwardStruct.b("CurrentPageName", "", true);
        finderForwardStruct.f56909o = shareObj.getInteger(5);
        finderForwardStruct.f56910p = finderForwardStruct.b("Tag", "", true);
        finderForwardStruct.f56911q = finderForwardStruct.b("TagId", "", true);
        finderForwardStruct.f56912r = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        finderForwardStruct.p(str2);
        if (qt2Var == null || (str3 = qt2Var.getString(1)) == null) {
            str3 = "";
        }
        finderForwardStruct.r(str3);
        finderForwardStruct.f56916v = j18;
        finderForwardStruct.D = ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).f188722e > 0 ? 1L : 0L;
        finderForwardStruct.t((qt2Var == null || (string4 = qt2Var.getString(11)) == null) ? "" : r26.i0.t(string4, ",", ";", false));
        finderForwardStruct.s((qt2Var == null || (string3 = qt2Var.getString(12)) == null) ? "" : r26.i0.t(string3, ",", ";", false));
        finderForwardStruct.f56920z = finderForwardStruct.b("GroupID", "", true);
        finderForwardStruct.A = 1L;
        com.tencent.mm.plugin.finder.report.e6 hk6 = hk(this, com.tencent.mm.sdk.platformtools.t8.V(shareObj.getString(0), 0L), null, qt2Var != null ? qt2Var.getInteger(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        finderForwardStruct.f56915u = finderForwardStruct.b("SessionBuffer", fl2Var != null ? fl2Var.getString(1) : null, true);
        if (fl2Var == null || (string = fl2Var.getString(5)) == null) {
            string = qt2Var != null ? qt2Var.getString(11) : null;
            if (string == null) {
                string = "";
            }
        }
        cl0.g gVar2 = new cl0.g();
        try {
            gVar = new cl0.g(string);
            try {
                gVar.p("menu_exp_time", com.tencent.mm.plugin.finder.report.x3.f125433b);
                gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(20)) : null);
            } catch (java.lang.Throwable unused) {
                gVar2 = gVar;
                com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "finderShareFeedReport json error");
                gVar = gVar2;
                java.lang.String gVar3 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                finderForwardStruct.q(r26.i0.t(gVar3, ",", ";", false));
                if (qt2Var != null) {
                    str4 = string2;
                }
                finderForwardStruct.E = finderForwardStruct.b("jump_id", str4, true);
                finderForwardStruct.k();
                Zk(finderForwardStruct);
            }
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String gVar32 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar32, "toString(...)");
        finderForwardStruct.q(r26.i0.t(gVar32, ",", ";", false));
        if (qt2Var != null && (string2 = qt2Var.getString(16)) != null) {
            str4 = string2;
        }
        finderForwardStruct.E = finderForwardStruct.b("jump_id", str4, true);
        finderForwardStruct.k();
        Zk(finderForwardStruct);
    }

    public final void Vk(android.content.Context context, boolean z17, long j17, int i17, java.lang.String error, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(error, "error");
        cl0.g gVar = new cl0.g();
        gVar.h("feedid", pm0.v.u(j17));
        gVar.o("click_result", i17);
        gVar.h("fail_reason", error);
        gVar.o("destination_type", i19);
        if (z17) {
            gVar.o("from_action", i18);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        hj(z17 ? 1 : 0, "launch_promotion", t17, nyVar != null ? nyVar.V6() : null, str);
    }

    public final void Wj(int i17, java.lang.String fromUser, java.lang.String topic, int i18) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        kotlin.jvm.internal.o.g(topic, "topic");
        jx3.f.INSTANCE.kvStat(18944, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + i17 + ",3," + fromUser + ",0,," + r26.i0.t(jk(topic, i18, 0L), ",", ";", false).concat(",,,"));
    }

    public final void Xj(int i17, boolean z17, java.lang.String topic, int i18, long j17, java.lang.String receiver, int i19) {
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        com.tencent.mm.autogen.mmdata.rpt.FinderTagForwardStruct finderTagForwardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderTagForwardStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderTagForwardStruct.f57905d = finderTagForwardStruct.b("SessionId", Ri, true);
        finderTagForwardStruct.f57906e = i17;
        finderTagForwardStruct.f57907f = z17 ? 1L : 2L;
        finderTagForwardStruct.f57908g = finderTagForwardStruct.b("Tag", r26.i0.t(jk(topic, i18, j17), ",", ";", false), true);
        finderTagForwardStruct.f57909h = finderTagForwardStruct.b("TagId", "", true);
        finderTagForwardStruct.f57910i = j17;
        finderTagForwardStruct.f57911j = finderTagForwardStruct.b("ForwardToUsr", receiver, true);
        finderTagForwardStruct.k();
        Zk(finderTagForwardStruct);
    }

    public final void Xk(java.lang.String contextId, int i17) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), contextId, 118, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c01.id.c()), "finder_team_msg", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if ((r41.f410703d.z0() & 2) > 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yj(android.content.Context r40, so2.y0 r41, int r42) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.Yj(android.content.Context, so2.y0, int):void");
    }

    public final void Yk(android.content.Context context, xc2.p0 finderJumpInfoEx, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderJumpInfoEx, "finderJumpInfoEx");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = finderJumpInfoEx.f453234a;
        if (3 == finderJumpInfo.getJumpinfo_type()) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
            java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
            if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("msgId", j17);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                ij(this, z17 ? 1 : 0, "link_msg_topic", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
            }
        }
    }

    public final void Zi(int i17, long j17, r45.qt2 qt2Var, int i18, java.lang.String str) {
        java.lang.String Ri;
        com.tencent.mm.autogen.mmdata.rpt.FinderFeedAvatarClickStruct finderFeedAvatarClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedAvatarClickStruct();
        boolean z17 = false;
        if ((qt2Var == null || (Ri = qt2Var.getString(0)) == null) && (Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri()) == null) {
            Ri = "";
        }
        finderFeedAvatarClickStruct.f56765d = finderFeedAvatarClickStruct.b("SessionId", Ri, true);
        finderFeedAvatarClickStruct.f56772k = finderFeedAvatarClickStruct.b("FeedId", Ui(j17), true);
        finderFeedAvatarClickStruct.f56774m = i17;
        finderFeedAvatarClickStruct.f56773l = qt2Var != null ? qt2Var.getInteger(5) : 0L;
        java.lang.Integer valueOf = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null;
        if ((valueOf != null && valueOf.intValue() == 8) || (valueOf != null && valueOf.intValue() == 7)) {
            z17 = true;
        }
        if (z17) {
            finderFeedAvatarClickStruct.f56769h = 1L;
        } else {
            finderFeedAvatarClickStruct.f56769h = 2L;
        }
        finderFeedAvatarClickStruct.f56767f = i18;
        if (str == null) {
            str = "";
        }
        finderFeedAvatarClickStruct.f56766e = finderFeedAvatarClickStruct.b("FinderUsername", str, true);
        finderFeedAvatarClickStruct.f56768g = finderFeedAvatarClickStruct.b("Username", xy2.c.f(qt2Var), true);
        if (dk(j17) != null) {
            finderFeedAvatarClickStruct.f56770i = r9.getLikeCount();
            finderFeedAvatarClickStruct.f56771j = r9.getCommentCount();
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        finderFeedAvatarClickStruct.f56775n = 1L;
        finderFeedAvatarClickStruct.k();
        Zk(finderFeedAvatarClickStruct);
    }

    public final void Zj(java.lang.String contextId, java.lang.String action) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.autogen.mmdata.rpt.FinderTraceActionStruct finderTraceActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderTraceActionStruct();
        finderTraceActionStruct.f57934f = finderTraceActionStruct.b("ContextId", contextId, true);
        finderTraceActionStruct.f57932d = finderTraceActionStruct.b("Action", action, true);
        finderTraceActionStruct.f57933e = c01.id.c();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderTraceActionStruct.f57935g = finderTraceActionStruct.b("SessionId", Ri, true);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        finderTraceActionStruct.f57936h = 1L;
        finderTraceActionStruct.k();
        Zk(finderTraceActionStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zk(jx3.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "report18054 "
            java.lang.String r1 = "struct"
            kotlin.jvm.internal.o.g(r11, r1)
            boolean r1 = r11 instanceof com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct
            java.lang.String r2 = " "
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = "toShowString(...)"
            java.lang.String r5 = "Finder.FinderReportLogic"
            r6 = 0
            if (r1 == 0) goto L56
            r1 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r1 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r1
            java.lang.String r7 = r1.f56783k
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r8     // Catch: java.lang.Throwable -> L51
            r9 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r9 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r9     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r9.f56783k     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L2e
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L51
            if (r9 != 0) goto L2c
            goto L2e
        L2c:
            r9 = r6
            goto L2f
        L2e:
            r9 = 1
        L2f:
            if (r9 != 0) goto L34
            java.lang.String r9 = "..."
            goto L35
        L34:
            r9 = r7
        L35:
            r8.p(r9)     // Catch: java.lang.Throwable -> L51
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r8     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r11.n()     // Catch: java.lang.Throwable -> L51
            kotlin.jvm.internal.o.f(r11, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> L51
            com.tencent.mars.xlog.Log.i(r5, r11)     // Catch: java.lang.Throwable -> L51
            r1.p(r7)
            goto L7e
        L51:
            r11 = move-exception
            r1.p(r7)
            throw r11
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report"
            r0.<init>(r1)
            int r1 = r11.g()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r11 = r11.n()
            kotlin.jvm.internal.o.f(r11, r4)
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.mars.xlog.Log.i(r5, r11)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.Zk(jx3.a):void");
    }

    public final void aj(r45.qt2 contextObj, int i17, int i18) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mm.autogen.mmdata.rpt.FinderBacktoTopStruct finderBacktoTopStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBacktoTopStruct();
        finderBacktoTopStruct.f56519g = contextObj.getInteger(5);
        boolean z17 = false;
        finderBacktoTopStruct.f56516d = finderBacktoTopStruct.b("Sessionid", contextObj.getString(0), true);
        finderBacktoTopStruct.f56517e = finderBacktoTopStruct.b("Contextid", contextObj.getString(1), true);
        finderBacktoTopStruct.f56518f = finderBacktoTopStruct.b("ClickTabContextId", contextObj.getString(2), true);
        finderBacktoTopStruct.f56520h = i17;
        if (i18 != 0) {
            ey2.t0 t0Var = (ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
            if (t0Var.f257512r) {
                if (gm0.j1.u().c().r(t0Var.O6(i18), 0) < 3) {
                    z17 = true;
                } else {
                    t0Var.f257512r = false;
                }
            }
            finderBacktoTopStruct.f56521i = z17 ? 1L : 0L;
        }
        finderBacktoTopStruct.k();
        Zk(finderBacktoTopStruct);
    }

    public final java.lang.String ak(float f17, long j17, int i17, java.lang.String traceId, java.lang.String sourceFeedId, int i18, java.lang.String clientUdfKv, int i19, int i27, long j18, int i28) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(sourceFeedId, "sourceFeedId");
        kotlin.jvm.internal.o.g(clientUdfKv, "clientUdfKv");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("video_duration", j17);
            jSONObject.put("current_play_sec", (int) f17);
            int i29 = 1;
            org.json.JSONObject jSONObject2 = clientUdfKv.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(clientUdfKv);
            jSONObject2.put("video_play_info", jSONObject);
            jSONObject2.put("watch_cnt", i17);
            jSONObject2.put("feed_progress_duration", java.lang.Float.valueOf(f17));
            jSONObject2.put("entrance_feed_index", i18);
            jSONObject2.put("entrance_feed_traceid", traceId);
            jSONObject2.put("source_feedid", sourceFeedId);
            if (i19 == 172 || i19 == 196) {
                jSONObject2.put("ref_commentscene", i27);
            }
            if (i19 == 172) {
                jSONObject2.put("collection_id", pm0.v.u(j18));
            } else if (i19 == 355) {
                jSONObject2.put("feed_columnid", i28);
            }
            com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
            if (e8Var.c(null) <= e8Var.b(null)) {
                i29 = 0;
            }
            jSONObject2.put("is_landscape", i29);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", e17.getMessage());
            return "";
        }
    }

    public final int al(int i17) {
        if (i17 == 15) {
            return 2;
        }
        if (i17 == 20) {
            return 4;
        }
        if (i17 == 353) {
            return 35;
        }
        if (i17 != 17) {
            return i17 != 18 ? 0 : 1;
        }
        return 3;
    }

    public final void bj(long j17, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FeedManuClickStruct feedManuClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FeedManuClickStruct();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            feedManuClickStruct.f56366d = feedManuClickStruct.b("SessionId", Ri, true);
            feedManuClickStruct.f56367e = feedManuClickStruct.b("FeedId", pm0.v.u(dk6.getId()), true);
            long j18 = i17;
            feedManuClickStruct.f56374l = j18;
            feedManuClickStruct.f56368f = dk6.getLikeCount();
            feedManuClickStruct.f56369g = dk6.getCommentCount();
            feedManuClickStruct.f56370h = dk6.getFriendLikeCount();
            feedManuClickStruct.f56373k = dk6.getMediaType();
            feedManuClickStruct.f56371i = feedManuClickStruct.b("CurrentPageName", "", true);
            feedManuClickStruct.f56372j = j18;
            feedManuClickStruct.k();
            Zk(feedManuClickStruct);
        }
    }

    public int bl(int i17) {
        if (i17 == 1) {
            return 18;
        }
        if (i17 == 2) {
            return 15;
        }
        if (i17 == 3) {
            return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1 ? 155 : 17;
        }
        if (i17 != 4) {
            return i17 != 35 ? i17 != 39 ? 3 : 397 : com.tencent.mm.plugin.appbrand.jsapi.nfc.t.CTRL_INDEX;
        }
        return 20;
    }

    public final void cj(long j17, java.lang.String topic, int i17, long j18, int i18) {
        kotlin.jvm.internal.o.g(topic, "topic");
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderTagClickStruct finderTagClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderTagClickStruct();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderTagClickStruct.f57895d = finderTagClickStruct.b("SessionId", Ri, true);
            finderTagClickStruct.f57896e = finderTagClickStruct.b("CurrentPageName", "", true);
            finderTagClickStruct.f57897f = i18;
            finderTagClickStruct.f57898g = finderTagClickStruct.b("feedid", Ui(dk6.getId()), true);
            finderTagClickStruct.f57899h = dk6.getMediaType();
            finderTagClickStruct.f57900i = finderTagClickStruct.b("Tag", r26.i0.t(jk(topic, i17, j18), ",", ";", false), true);
            finderTagClickStruct.f57901j = finderTagClickStruct.b("TagId", "", true);
            finderTagClickStruct.f57902k = dk6.getFeedObject().getLikeCount();
            finderTagClickStruct.f57903l = dk6.getFeedObject().getCommentCount();
            finderTagClickStruct.f57904m = dk6.getFeedObject().getFriendLikeCount();
            finderTagClickStruct.k();
            Zk(finderTagClickStruct);
        }
    }

    public final org.json.JSONArray ck(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        jz5.l s17 = hc2.f1.s(recyclerView, false);
        java.util.List<fc2.r> m17 = hc2.f1.m(recyclerView, ((java.lang.Number) s17.f302833d).intValue(), ((java.lang.Number) s17.f302834e).intValue());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (fc2.r rVar : m17) {
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(rVar.f260977a.getItemId()));
            gVar.o("feedindex", rVar.f260978b);
            in5.v0 v0Var = rVar.f260979c;
            if (v0Var != null) {
                gVar.o("x", v0Var.f293143a + 1);
                gVar.o("width", v0Var.f293144b);
                gVar.o("height", v0Var.f293145c);
            }
            jSONArray.put(gVar);
        }
        return jSONArray;
    }

    public final void cl(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        if (qt2Var != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, qt2Var.getInteger(5), null);
        }
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem dk(long j17) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (h17 != null) {
            return h17;
        }
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.search.l4.f125764d.get(java.lang.Long.valueOf(j17));
        if (finderItem != null) {
            return finderItem;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I.get(java.lang.Long.valueOf(j17));
        if (finderItem2 != null) {
            return finderItem2;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment.f109537y;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment.f109537y.get(java.lang.Long.valueOf(j17));
        if (finderItem3 != null) {
            return finderItem3;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment.I;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment.I.get(java.lang.Long.valueOf(j17));
        if (finderItem4 != null) {
            return finderItem4;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment.L;
        return (com.tencent.mm.plugin.finder.storage.FinderItem) com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment.L.get(java.lang.Long.valueOf(j17));
    }

    public final java.lang.String ek(long j17, java.lang.String str, int i17) {
        r45.fl2 fl2Var;
        java.lang.String string;
        java.util.HashMap hashMap = this.f125211g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        com.tencent.mm.plugin.finder.report.e6 e6Var = (com.tencent.mm.plugin.finder.report.e6) hashMap.get(sb6.toString());
        return (e6Var == null || (fl2Var = e6Var.f125012a) == null || (string = fl2Var.getString(1)) == null) ? "" : string;
    }

    public final void fj(long j17, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderProfileFeedClickStruct finderProfileFeedClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderProfileFeedClickStruct();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderProfileFeedClickStruct.f57649d = finderProfileFeedClickStruct.b("SessionId", Ri, true);
            finderProfileFeedClickStruct.f57650e = i17;
            finderProfileFeedClickStruct.f57651f = finderProfileFeedClickStruct.b("Tag", r26.i0.t(f125207s.a(dk6), ",", ";", false), true);
            finderProfileFeedClickStruct.f57652g = finderProfileFeedClickStruct.b("TagId", "", true);
            finderProfileFeedClickStruct.f57653h = finderProfileFeedClickStruct.b("feedid", Ui(dk6.getId()), true);
            finderProfileFeedClickStruct.f57654i = dk6.getFeedObject().getLikeCount();
            finderProfileFeedClickStruct.k();
            Zk(finderProfileFeedClickStruct);
        }
    }

    public final com.tencent.mm.plugin.finder.report.e6 gk(long j17, java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        if (str2 == null || (str3 = "_".concat(str2)) == null) {
            str3 = "";
        }
        java.util.HashMap hashMap = this.f125211g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        sb6.append(str3);
        return (com.tencent.mm.plugin.finder.report.e6) hashMap.get(sb6.toString());
    }

    public final void hj(int i17, java.lang.String eid, java.lang.String udfKv, r45.qt2 qt2Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct();
        finderShowInWXProfileStruct.f57829g = i17;
        finderShowInWXProfileStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderShowInWXProfileStruct.q(eid);
        finderShowInWXProfileStruct.t(udfKv);
        finderShowInWXProfileStruct.f57836n = finderShowInWXProfileStruct.b("session_buffer", str, true);
        if (qt2Var != null) {
            java.lang.String string = qt2Var.getString(0);
            if (string == null) {
                string = "";
            }
            finderShowInWXProfileStruct.s(string);
            java.lang.String string2 = qt2Var.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            finderShowInWXProfileStruct.f57827e = finderShowInWXProfileStruct.b("findercontextid", string2, true);
            finderShowInWXProfileStruct.p(java.lang.String.valueOf(qt2Var.getInteger(5)));
            java.lang.String string3 = qt2Var.getString(2);
            finderShowInWXProfileStruct.f57833k = finderShowInWXProfileStruct.b("clicktabcontextid", string3 != null ? string3 : "", true);
            finderShowInWXProfileStruct.f57834l = finderShowInWXProfileStruct.b("ref_commentscene", java.lang.String.valueOf(qt2Var.getInteger(7)), true);
        }
        finderShowInWXProfileStruct.k();
        Zk(finderShowInWXProfileStruct);
    }

    public final int ik() {
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 3;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 4;
        }
        return com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 5 : 0;
    }

    public final java.lang.String jk(java.lang.String str, int i17, long j17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 2) {
                java.lang.String str2 = (java.lang.String) kz5.n0.Z(r26.n0.f0(str, new java.lang.String[]{"·"}, false, 0, 6, null));
                if (str2 != null) {
                    jSONObject.put("topic", str2);
                }
            } else {
                jSONObject.put("topic", str);
            }
            jSONObject.put("type", i17);
            jSONObject.put("count", j17);
            jSONArray.put(jSONObject);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final cl0.g kk() {
        if (this.f125219r == null) {
            cl0.g gVar = new cl0.g();
            gVar.o("screenwidth", i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a));
            gVar.o("screenheight", i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
            this.f125219r = gVar;
        }
        cl0.g gVar2 = this.f125219r;
        return gVar2 == null ? new cl0.g() : gVar2;
    }

    public final java.lang.String lk(java.util.List list, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(str);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return r26.n0.Z(sb7, str);
    }

    public final void mj(int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, boolean z18, boolean z19, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Ri);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        sb6.append(i18);
        sb6.append(',');
        sb6.append(i19);
        sb6.append(',');
        sb6.append(z17 ? 1 : 0);
        sb6.append(',');
        sb6.append(i27);
        sb6.append(',');
        sb6.append(i28);
        sb6.append(',');
        sb6.append(i29);
        sb6.append(',');
        sb6.append(z18 ? 1 : 0);
        sb6.append(',');
        sb6.append(!z19 ? 1 : 0);
        sb6.append(',');
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        if (qt2Var != null && (string = qt2Var.getString(2)) != null) {
            str2 = string;
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18947 " + sb7);
        jx3.f.INSTANCE.kvStat(18947, sb7);
    }

    public final java.lang.String mk(android.content.Context context, long j17, java.lang.String str) {
        r45.fl2 fl2Var;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().getInteger(5) : 0, null, 8, null);
        if (hk6 == null || (fl2Var = hk6.f125012a) == null) {
            return null;
        }
        return fl2Var.getString(5);
    }

    public final void nj(long j17) {
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = dk6.getFeedObject();
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + Ui(feedObject.getId()) + ',' + feedObject.getUsername() + ',' + feedObject.getRecommendType() + ',' + dk6.getMediaType();
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18974 " + str);
            jx3.f.INSTANCE.kvStat(18974, str);
        }
    }

    public final java.lang.String nk() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return uuid;
    }

    public final void oj(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, r45.qt2 qt2Var, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.autogen.mmdata.rpt.FinderHotSearchClickStruct finderHotSearchClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderHotSearchClickStruct();
        if (qt2Var != null) {
            finderHotSearchClickStruct.f56926d = finderHotSearchClickStruct.b("sessionid", qt2Var.getString(0), true);
            finderHotSearchClickStruct.f56927e = finderHotSearchClickStruct.b("clickTabContextid", qt2Var.getString(2), true);
            finderHotSearchClickStruct.f56928f = qt2Var.getInteger(5);
        }
        finderHotSearchClickStruct.f56934l = finderHotSearchClickStruct.b("reasonId", str2 != null ? r26.i0.t(str2, ",", ";", false) : "", true);
        finderHotSearchClickStruct.f56929g = finderHotSearchClickStruct.b("ItemId", str, true);
        finderHotSearchClickStruct.f56930h = i17;
        finderHotSearchClickStruct.f56931i = i18;
        finderHotSearchClickStruct.f56932j = i19;
        finderHotSearchClickStruct.f56933k = i27;
        finderHotSearchClickStruct.f56935m = finderHotSearchClickStruct.b("hotWordId", str3, true);
        finderHotSearchClickStruct.f56936n = finderHotSearchClickStruct.b("requestId", str4, true);
        finderHotSearchClickStruct.k();
        Zk(finderHotSearchClickStruct);
    }

    public final void ok(boolean z17, long j17) {
        com.tencent.mm.autogen.events.FinderCommentReportEvent finderCommentReportEvent = new com.tencent.mm.autogen.events.FinderCommentReportEvent();
        int i17 = z17 ? 2 : 3;
        am.wa waVar = finderCommentReportEvent.f54266g;
        waVar.f8273a = i17;
        waVar.f8274b = j17;
        finderCommentReportEvent.e();
    }

    public final void pk() {
        com.tencent.mm.autogen.events.FinderCommentReportEvent finderCommentReportEvent = new com.tencent.mm.autogen.events.FinderCommentReportEvent();
        am.wa waVar = finderCommentReportEvent.f54266g;
        waVar.f8273a = 1;
        waVar.f8274b = 0L;
        finderCommentReportEvent.e();
    }

    public final void qj(android.content.Context context, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.autogen.mmdata.rpt.FinderLocationRequestStruct finderLocationRequestStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLocationRequestStruct();
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            finderLocationRequestStruct.f57412e = finderLocationRequestStruct.b("SessionId", nyVar.f135385q, true);
        } else {
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderLocationRequestStruct.f57412e = finderLocationRequestStruct.b("SessionId", Ri, true);
        }
        finderLocationRequestStruct.f57411d = i17;
        finderLocationRequestStruct.k();
        Zk(finderLocationRequestStruct);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qk(long r15, java.lang.String r17, int r18, java.lang.String r19, long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.qk(long, java.lang.String, int, java.lang.String, long, java.lang.String):void");
    }

    public final void rj(int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.FinderModeMessageStruct finderModeMessageStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderModeMessageStruct();
        finderModeMessageStruct.f57413d = i17;
        finderModeMessageStruct.f57414e = i18;
        finderModeMessageStruct.f57415f = i19;
        finderModeMessageStruct.k();
        Zk(finderModeMessageStruct);
    }

    public final void rk(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        uk(finderObject);
        long id6 = finderObject.getId();
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        java.lang.String sessionBuffer = finderObject.getSessionBuffer();
        r45.hl2 client_local_buffer = finderObject.getClient_local_buffer();
        qk(id6, string, i17, sessionBuffer, client_local_buffer != null ? client_local_buffer.getLong(0) : 0L, str);
        ((cq.k) i95.n0.c(cq.k.class)).Ri(finderObject, i17);
    }

    public final void sj(java.lang.String currUI, int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String redDotWording, long j17, r45.qt2 qt2Var, int i29, int i37, java.lang.String report_ext_info) {
        java.lang.String str2;
        java.lang.String string;
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(redDotWording, "redDotWording");
        kotlin.jvm.internal.o.g(report_ext_info, "report_ext_info");
        com.tencent.mm.autogen.mmdata.rpt.FinderRedDotStruct finderRedDotStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String str3 = "";
        if (Ri == null) {
            Ri = "";
        }
        finderRedDotStruct.f57744d = finderRedDotStruct.b("SessionId", Ri, true);
        finderRedDotStruct.f57745e = finderRedDotStruct.b("CurrUI", currUI, true);
        finderRedDotStruct.f57746f = i17;
        finderRedDotStruct.f57747g = i18;
        finderRedDotStruct.f57749i = i19;
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        finderRedDotStruct.f57750j = 2L;
        finderRedDotStruct.f57748h = i27;
        finderRedDotStruct.f57752l = finderRedDotStruct.b("RedDotId", str == null ? "" : str, true);
        finderRedDotStruct.f57751k = i28;
        finderRedDotStruct.f57753m = finderRedDotStruct.b("RedDotWording", redDotWording, true);
        finderRedDotStruct.f57754n = finderRedDotStruct.b("FeedId", Ui(j17), true);
        if (qt2Var == null || (str2 = qt2Var.getString(1)) == null) {
            str2 = "";
        }
        finderRedDotStruct.f57755o = finderRedDotStruct.b("ContextId", str2, true);
        if (qt2Var != null && (string = qt2Var.getString(2)) != null) {
            str3 = string;
        }
        finderRedDotStruct.f57756p = finderRedDotStruct.b("ClickTabContextId", str3, true);
        finderRedDotStruct.f57757q = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1 ? 2L : 1L;
        finderRedDotStruct.f57758r = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f0() ? 1L : 2L;
        finderRedDotStruct.f57759s = i29;
        finderRedDotStruct.f57760t = i37;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(report_ext_info)) {
            finderRedDotStruct.f57761u = finderRedDotStruct.b("ExtInfo", report_ext_info, true);
        }
        finderRedDotStruct.k();
        Zk(finderRedDotStruct);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0085. Please report as an issue. */
    public final void tj(java.lang.String currUI, int i17, int i18, int i19, java.lang.String redDotId, java.lang.String redDotWording, long j17, java.lang.String contextId, int i27, java.lang.String report_ext_info, int i28) {
        int i29;
        int i37;
        int i38;
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(redDotId, "redDotId");
        kotlin.jvm.internal.o.g(redDotWording, "redDotWording");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(report_ext_info, "report_ext_info");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() != 1) {
            if (i17 != -1) {
                if (i17 != 29) {
                    if (i17 != 1002) {
                        if (i17 == 1) {
                            i38 = 1;
                            i37 = 1;
                            i29 = 3;
                        } else if (i17 != 2) {
                            if (i17 == 3) {
                                i29 = 4;
                                i37 = 1;
                            } else if (i17 == 4) {
                                i29 = 4;
                                i37 = 2;
                            } else if (i17 == 5) {
                                i38 = 1;
                                i29 = 1;
                                i37 = 2;
                            } else if (i17 == 7) {
                                i38 = 8;
                                i37 = 0;
                                i29 = 3;
                            } else {
                                if (i17 != 8) {
                                    return;
                                }
                                i29 = 4;
                                i38 = 7;
                                i37 = 0;
                            }
                            i38 = 3;
                        }
                    }
                }
                i38 = 1;
                i37 = 2;
                i29 = 3;
            }
            i37 = 1;
            i38 = 2;
            i29 = 6;
        } else {
            if (i17 != -1) {
                if (i17 != 5) {
                    if (i17 != 29) {
                        if (i17 == 1) {
                            i38 = 5;
                            i37 = 0;
                            i29 = 3;
                        } else if (i17 != 2) {
                            if (i17 == 7) {
                                i29 = i27;
                                i38 = 8;
                            } else if (i17 != 8) {
                                switch (i17) {
                                    case 1001:
                                        i29 = 1;
                                        i37 = 0;
                                        i38 = 6;
                                        break;
                                    case 1002:
                                        break;
                                    case 1003:
                                        i37 = 1;
                                        i38 = 3;
                                        i29 = 3;
                                        break;
                                    case 1004:
                                        i37 = 2;
                                        i38 = 3;
                                        i29 = 3;
                                        break;
                                    case 1005:
                                        i38 = 9;
                                        i29 = 100;
                                        break;
                                    default:
                                        return;
                                }
                            } else {
                                i29 = i27;
                                i38 = 7;
                            }
                        }
                    }
                    i38 = 1;
                    i37 = 0;
                    i29 = 3;
                } else {
                    i38 = 1;
                    i29 = 1;
                }
                i37 = 0;
            }
            i29 = i27;
            i37 = 1;
            i38 = 2;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(1, contextId);
        qt2Var.set(2, "");
        sj(currUI, i38, i18, i29, i37, i19, redDotId, redDotWording, j17, qt2Var, 0, i28, report_ext_info);
    }

    public final int tk(int i17) {
        if (i17 == 4) {
            return 1;
        }
        if (i17 == 5) {
            return 2;
        }
        if (i17 != 10001) {
            return i17 != 10002 ? 0 : 4;
        }
        return 3;
    }

    public final void uk(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        if (finderObject.getClient_local_buffer() == null) {
            finderObject.setClient_local_buffer(new r45.hl2());
            r45.hl2 client_local_buffer = finderObject.getClient_local_buffer();
            if (client_local_buffer == null) {
                return;
            }
            client_local_buffer.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    public final void vj(int i17, java.lang.String tipsId, java.lang.String revokeId, int i18) {
        kotlin.jvm.internal.o.g(tipsId, "tipsId");
        kotlin.jvm.internal.o.g(revokeId, "revokeId");
        com.tencent.mm.autogen.mmdata.rpt.FinderRedDotCancelStruct finderRedDotCancelStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotCancelStruct();
        finderRedDotCancelStruct.f57690d = i17;
        finderRedDotCancelStruct.f57692f = c01.id.e();
        finderRedDotCancelStruct.f57691e = finderRedDotCancelStruct.b("TipsId", tipsId, true);
        finderRedDotCancelStruct.f57694h = finderRedDotCancelStruct.b("RevokeId", revokeId, true);
        finderRedDotCancelStruct.f57693g = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1 ? 2L : 1L;
        finderRedDotCancelStruct.f57695i = i18;
        finderRedDotCancelStruct.k();
        Zk(finderRedDotCancelStruct);
    }

    public final void vk(android.content.Context context, boolean z17, int i17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.autogen.mmdata.rpt.FinderUnflodActionStruct finderUnflodActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderUnflodActionStruct();
        finderUnflodActionStruct.f57952d = V6 != null ? V6.getInteger(5) : 0L;
        finderUnflodActionStruct.f57953e = finderUnflodActionStruct.b("Sessionid", V6 != null ? V6.getString(0) : null, true);
        finderUnflodActionStruct.f57954f = finderUnflodActionStruct.b("Contextid", V6 != null ? V6.getString(1) : null, true);
        finderUnflodActionStruct.f57955g = finderUnflodActionStruct.b("ClickTabContextid", V6 != null ? V6.getString(2) : null, true);
        finderUnflodActionStruct.f57956h = finderUnflodActionStruct.b("feedid", pm0.v.u(V6 != null ? V6.getLong(6) : 0L), true);
        finderUnflodActionStruct.f57957i = z17 ? 1L : 2L;
        finderUnflodActionStruct.f57958j = i17;
        finderUnflodActionStruct.f57959k = z18 ? 2L : 1L;
        finderUnflodActionStruct.f57960l = z19 ? 2L : 1L;
        finderUnflodActionStruct.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: JSONException -> 0x0044, TryCatch #0 {JSONException -> 0x0044, blocks: (B:29:0x003b, B:16:0x0049, B:17:0x0057, B:19:0x005d, B:21:0x006b), top: B:28:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(java.lang.Integer r11, org.json.JSONObject r12, long r13, java.lang.String r15) {
        /*
            r10 = this;
            if (r12 != 0) goto L3
            return
        L3:
            if (r11 != 0) goto L7
            goto L7e
        L7:
            int r0 = r11.intValue()
            r1 = 356(0x164, float:4.99E-43)
            if (r0 != r1) goto L7e
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r0 = com.tencent.mm.plugin.finder.report.o3.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2 = r0
            com.tencent.mm.plugin.finder.report.o3 r2 = (com.tencent.mm.plugin.finder.report.o3) r2
            int r6 = r11.intValue()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r13
            r5 = r15
            com.tencent.mm.plugin.finder.report.e6 r11 = hk(r2, r3, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L37
            r45.fl2 r11 = r11.f125012a
            if (r11 == 0) goto L37
            r15 = 5
            java.lang.String r11 = r11.getString(r15)
            goto L38
        L37:
            r11 = 0
        L38:
            r15 = 0
            if (r11 == 0) goto L46
            int r0 = r11.length()     // Catch: org.json.JSONException -> L44
            if (r0 != 0) goto L42
            goto L46
        L42:
            r0 = r15
            goto L47
        L44:
            r11 = move-exception
            goto L75
        L46:
            r0 = 1
        L47:
            if (r0 != 0) goto L6b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>(r11)     // Catch: org.json.JSONException -> L44
            java.util.Iterator r11 = r0.keys()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "keys(...)"
            kotlin.jvm.internal.o.f(r11, r1)     // Catch: org.json.JSONException -> L44
        L57:
            boolean r1 = r11.hasNext()     // Catch: org.json.JSONException -> L44
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r11.next()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L44
            java.lang.Object r2 = r0.get(r1)     // Catch: org.json.JSONException -> L44
            r12.put(r1, r2)     // Catch: org.json.JSONException -> L44
            goto L57
        L6b:
            java.lang.String r11 = "feedid"
            java.lang.String r13 = pm0.v.u(r13)     // Catch: org.json.JSONException -> L44
            r12.put(r11, r13)     // Catch: org.json.JSONException -> L44
            goto L7e
        L75:
            java.lang.String r12 = "addDramaInfo"
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.String r14 = "Finder.FinderReportLogic"
            com.tencent.mars.xlog.Log.printErrStackTrace(r14, r11, r12, r13)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o3.wi(java.lang.Integer, org.json.JSONObject, long, java.lang.String):void");
    }

    public final void wk(java.lang.String profileUsername, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(profileUsername, "profileUsername");
        jx3.f.INSTANCE.kvStat(20698, profileUsername + ',' + i17 + ',' + i18 + ',' + i19 + ',' + i27);
    }

    public final void xj(r45.qt2 contextObj, long j17, java.lang.String str, java.lang.String finderUsername, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct finderClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct();
        finderClickStruct.f56649d = finderClickStruct.b("SessionId", contextObj.getString(0), true);
        finderClickStruct.f56650e = finderClickStruct.b("ClickUI", "", true);
        finderClickStruct.f56664s = contextObj.getInteger(5);
        finderClickStruct.f56652g = finderClickStruct.b("FeedUsr", finderUsername, true);
        finderClickStruct.f56653h = 3L;
        finderClickStruct.f56654i = i17;
        finderClickStruct.f56656k = finderClickStruct.b("ReplyUsr", "", true);
        finderClickStruct.f56657l = 2L;
        finderClickStruct.f56667v = finderClickStruct.b("ContextId", contextObj.getString(1), true);
        finderClickStruct.f56668w = finderClickStruct.b("ClickTabContextId", contextObj.getString(2), true);
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            finderClickStruct.f56651f = finderClickStruct.b("FeedId", Ui(j17), true);
            finderClickStruct.f56658m = dk6.getFeedObject().getLikeCount();
            finderClickStruct.f56659n = dk6.getFeedObject().getCommentCount();
            finderClickStruct.f56660o = dk6.getFeedObject().getFriendLikeCount();
            finderClickStruct.f56661p = dk6.getMediaType();
            finderClickStruct.f56662q = finderClickStruct.b("Tag", r26.i0.t(f125207s.a(dk6), ",", ";", false), true);
            finderClickStruct.f56663r = finderClickStruct.b("TagId", "", true);
            finderClickStruct.f56669x = finderClickStruct.b("SessionBuffer", ek(j17, str, contextObj.getInteger(7)), true);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            finderClickStruct.f56651f = finderClickStruct.b("FeedId", "0", true);
            finderClickStruct.f56662q = finderClickStruct.b("Tag", "", true);
            finderClickStruct.f56663r = finderClickStruct.b("TagId", "", true);
        }
        java.lang.String string = contextObj.getString(11);
        finderClickStruct.f56671z = finderClickStruct.b("ExtraInfo", string != null ? r26.i0.t(string, ",", ";", false) : "", true);
        java.lang.String string2 = contextObj.getString(12);
        finderClickStruct.A = finderClickStruct.b("enterSourceInfo", string2 != null ? r26.i0.t(string2, ",", ";", false) : "", true);
        finderClickStruct.k();
        Zk(finderClickStruct);
    }

    public final void xk(java.lang.String fromUsername, int i17, int i18) {
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        jx3.f.INSTANCE.kvStat(20699, fromUsername + ',' + i17 + ',' + i18);
    }

    public final void yj(int i17, int i18, int i19, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mm.autogen.mmdata.rpt.FinderHottabClickStruct finderHottabClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderHottabClickStruct();
        finderHottabClickStruct.f56937d = contextObj.getInteger(5);
        finderHottabClickStruct.f56938e = finderHottabClickStruct.b("Sessionid", contextObj.getString(0), true);
        finderHottabClickStruct.f56939f = finderHottabClickStruct.b("Contextid", contextObj.getString(1), true);
        finderHottabClickStruct.f56940g = finderHottabClickStruct.b("ClickTabContextid", contextObj.getString(2), true);
        finderHottabClickStruct.f56938e = finderHottabClickStruct.b("Sessionid", contextObj.getString(0), true);
        finderHottabClickStruct.f56942i = c01.id.c();
        finderHottabClickStruct.f56941h = i17;
        finderHottabClickStruct.f56943j = i18;
        finderHottabClickStruct.f56944k = i19;
        finderHottabClickStruct.f56945l = 1L;
        finderHottabClickStruct.k();
        Zk(finderHottabClickStruct);
    }

    public final void yk(int i17, int i18, java.lang.String msgId) {
        kotlin.jvm.internal.o.g(msgId, "msgId");
        com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgActionStruct finderSysMsgActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgActionStruct();
        finderSysMsgActionStruct.f57889d = i17;
        finderSysMsgActionStruct.f57890e = i18;
        finderSysMsgActionStruct.f57891f = finderSysMsgActionStruct.b("msgId", msgId, true);
        finderSysMsgActionStruct.k();
        Zk(finderSysMsgActionStruct);
    }

    public final void zj(r45.qt2 contextObj, long j17, java.lang.String str, int i17, int i18, int i19, java.lang.String replyUsername, int i27, boolean z17, boolean z18, int i28) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(replyUsername, "replyUsername");
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = dk(j17);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct finderClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct();
            finderClickStruct.f56649d = finderClickStruct.b("SessionId", contextObj.getString(0), true);
            finderClickStruct.f56650e = finderClickStruct.b("ClickUI", "", true);
            finderClickStruct.f56651f = finderClickStruct.b("FeedId", Ui(j17), true);
            finderClickStruct.f56652g = finderClickStruct.b("FeedUsr", dk6.getUserName(), true);
            finderClickStruct.f56653h = i17;
            finderClickStruct.f56654i = i18;
            finderClickStruct.f56655j = i19;
            finderClickStruct.f56656k = finderClickStruct.b("ReplyUsr", replyUsername, true);
            finderClickStruct.f56657l = i27;
            finderClickStruct.f56658m = dk6.getLikeCount();
            finderClickStruct.f56659n = dk6.getCommentCount();
            finderClickStruct.f56660o = dk6.getFriendLikeCount();
            finderClickStruct.f56661p = dk6.getMediaType();
            finderClickStruct.f56662q = finderClickStruct.b("Tag", r26.i0.t(f125207s.a(dk6), ",", ";", false), true);
            finderClickStruct.f56663r = finderClickStruct.b("TagId", "", true);
            finderClickStruct.f56664s = contextObj.getInteger(5);
            finderClickStruct.f56665t = kotlin.jvm.internal.o.b(dk6.getUserName(), xy2.c.f(contextObj)) ? 1L : 0L;
            finderClickStruct.f56666u = z17 ? 1L : 0L;
            java.lang.String string = contextObj.getString(1);
            if (string == null) {
                string = "";
            }
            finderClickStruct.f56667v = finderClickStruct.b("ContextId", string, true);
            java.lang.String string2 = contextObj.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            finderClickStruct.f56668w = finderClickStruct.b("ClickTabContextId", string2, true);
            finderClickStruct.f56669x = finderClickStruct.b("SessionBuffer", ek(j17, str, contextObj.getInteger(5)), true);
            finderClickStruct.f56670y = z18 ? 1L : 0L;
            java.lang.String string3 = contextObj.getString(11);
            finderClickStruct.f56671z = finderClickStruct.b("ExtraInfo", string3 != null ? r26.i0.t(string3, ",", ";", false) : "", true);
            java.lang.String string4 = contextObj.getString(12);
            finderClickStruct.A = finderClickStruct.b("enterSourceInfo", string4 != null ? r26.i0.t(string4, ",", ";", false) : "", true);
            finderClickStruct.B = i28;
            finderClickStruct.k();
            Zk(finderClickStruct);
        }
    }

    public final void zk(android.content.Context context, int i17, int i18, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.autogen.mmdata.rpt.FinderClickPatMusicIconStruct finderClickPatMusicIconStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderClickPatMusicIconStruct();
        finderClickPatMusicIconStruct.f56644d = java.lang.System.currentTimeMillis();
        finderClickPatMusicIconStruct.f56645e = i17;
        finderClickPatMusicIconStruct.f56646f = i18;
        finderClickPatMusicIconStruct.f56647g = V6 != null ? V6.getInteger(5) : 0L;
        finderClickPatMusicIconStruct.f56648h = num != null ? num.intValue() : 0L;
        finderClickPatMusicIconStruct.k();
    }
}
