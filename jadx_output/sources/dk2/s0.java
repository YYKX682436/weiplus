package dk2;

/* loaded from: classes3.dex */
public final class s0 {
    public s0(kotlin.jvm.internal.i iVar) {
    }

    public final r45.na4 a(java.lang.String name, r45.ma4 liveSdkInfo, r45.nw1 liveInfo, com.tencent.trtc.TRTCCloudDef.TRTCParams trtcParams, kn0.g liveRoomInfo, int i17, gk2.e liveData) {
        int i18;
        com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams;
        java.lang.String str;
        boolean z17;
        int i19;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(liveSdkInfo, "liveSdkInfo");
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        kotlin.jvm.internal.o.g(trtcParams, "trtcParams");
        kotlin.jvm.internal.o.g(liveRoomInfo, "liveRoomInfo");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        trtcParams.roomId = liveSdkInfo.f380296f;
        trtcParams.sdkAppId = liveSdkInfo.f380294d;
        trtcParams.privateMapKey = x51.j1.b(liveSdkInfo.f380299i);
        trtcParams.userId = liveSdkInfo.f380295e;
        trtcParams.userSig = x51.j1.b(liveSdkInfo.f380298h);
        trtcParams.role = (i17 == 1 || i17 != 2) ? 20 : 21;
        liveRoomInfo.f309534a = name;
        liveRoomInfo.f309535b = liveInfo.getLong(0);
        java.util.HashMap hashMap = liveRoomInfo.f309544k;
        java.lang.String live_cdn_url = liveSdkInfo.f380305r;
        kotlin.jvm.internal.o.f(live_cdn_url, "live_cdn_url");
        java.lang.String str2 = "";
        hashMap.put(0, new kn0.r(live_cdn_url, 0, "", ""));
        liveRoomInfo.f309537d = liveSdkInfo.f380301n;
        com.tencent.mm.protobuf.f parseFrom = new r45.na4().parseFrom(liveSdkInfo.f380300m.f192156a);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
        r45.na4 na4Var = (r45.na4) parseFrom;
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.W1(liveData) || r4Var.z1(liveData)) {
            r45.q82 q82Var = (r45.q82) liveInfo.getCustom(9);
            liveRoomInfo.f309536c = q82Var != null ? q82Var.getInteger(0) : 0;
        } else {
            liveRoomInfo.f309536c = na4Var.f381197f.f378535f;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T1).getValue()).r()).intValue();
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && intValue != -1 && i17 != 1) {
            liveRoomInfo.f309536c = intValue;
        }
        r45.ka4 ka4Var = na4Var.f381197f;
        liveRoomInfo.f309538e = ka4Var.f378537h;
        liveRoomInfo.f309539f = ka4Var.f378538i;
        liveRoomInfo.f309547n = ka4Var.f378551v;
        r45.oa4 oa4Var = na4Var.f381195d;
        r45.ja4 ja4Var = na4Var.f381196e;
        vn0.c cVar = vn0.b.f438174a;
        if (oa4Var != null) {
            boolean z18 = (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_hevc_enc_enable_switch, 0) == 1) && oa4Var.f382087r > 0;
            zl2.q4 q4Var = zl2.q4.f473933a;
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) zl2.q4.f473935c).getValue()).booleanValue();
            boolean z19 = z18 && booleanValue;
            boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_force_hevc_mixing, 0) == 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveSdkParams] processLiveSdkParams enableHEVCEncFromSvr:");
            sb6.append(z18);
            sb6.append(", sdkenable:");
            sb6.append(oa4Var.f382087r);
            sb6.append(", enableHEVCEncFromLocal:");
            sb6.append(booleanValue);
            sb6.append(", isHEVCEncEnable:");
            boolean z28 = z19;
            sb6.append(z28);
            sb6.append(", isForceHEVCMixing:");
            sb6.append(z27);
            sb6.append(", videoSdkParam.clip_20_21:");
            sb6.append(oa4Var.H);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveAssistant", sb6.toString());
            cVar.d().f455444t = z28;
            cVar.d().f455445u = z27;
            if (oa4Var.f382076d > 0) {
                cVar.d().f455431d = oa4Var.f382076d;
            }
            if (oa4Var.f382078f > 0) {
                cVar.d().f455432e = oa4Var.f382078f;
            }
            if (oa4Var.f382079g > 0) {
                cVar.d().f455433f = oa4Var.f382079g;
            }
            if (oa4Var.f382086q > 0) {
                cVar.d().f455434g = oa4Var.f382086q;
            }
            if (oa4Var.f382088s > 0) {
                cVar.d().f455435h = oa4Var.f382088s;
            }
            if (oa4Var.f382089t > 0) {
                cVar.d().f455436i = oa4Var.f382089t;
            }
            if (oa4Var.f382090u > 0) {
                cVar.d().f455437m = oa4Var.f382090u;
            }
            if (oa4Var.f382091v > 0) {
                cVar.d().f455438n = oa4Var.f382091v;
            }
            if (oa4Var.f382081i > 0) {
                cVar.d().f455440p = oa4Var.f382081i;
            }
            int i27 = oa4Var.f382082m;
            if (i27 >= 0 && i27 < 2) {
                cVar.d().f455439o = oa4Var.f382082m;
            }
            if (oa4Var.H == 1) {
                cVar.d().A = true;
            }
            dk2.ef.f233372a.Y(oa4Var);
        }
        if (ja4Var != null) {
            if (ja4Var.f377678d > 0) {
                cVar.a().f455409g = ja4Var.f377678d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveAssistant", "processLiveSdkParams audioQuality:" + ja4Var.f377678d);
        }
        if (ka4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveAssistant", "userDefineRecordId:" + ka4Var.f378533d + ',' + ka4Var.f378534e);
            java.lang.String str4 = ka4Var.f378534e;
            java.lang.String str5 = ka4Var.f378533d;
            int i28 = ka4Var.f378546q;
            java.lang.String str6 = ka4Var.Q;
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            boolean Di = d11.s.Di(5);
            dk2.kc.f233696a.c(true, Di);
            if (Di) {
                z17 = false;
            } else {
                i28 = ka4Var.f378547r;
                z17 = true;
            }
            liveRoomInfo.f309543j = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Rj().z0(liveRoomInfo.f309535b);
            liveRoomInfo.f309542i = ka4Var.f378547r;
            if (i28 < 100) {
                liveRoomInfo.f309540g = kn0.a.f309493d;
                liveRoomInfo.f309541h = i28;
            } else {
                hn0.a[] aVarArr = hn0.a.f282382d;
                if (i28 == 101) {
                    liveRoomInfo.f309540g = kn0.a.f309494e;
                } else if (i28 == 102) {
                    liveRoomInfo.f309540g = kn0.a.f309495f;
                }
            }
            java.util.LinkedList cdn_trans_info = ka4Var.f378540m;
            if (cdn_trans_info == null || cdn_trans_info.isEmpty()) {
                i18 = intValue;
            } else {
                kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
                java.util.Iterator it = cdn_trans_info.iterator();
                while (it.hasNext()) {
                    r45.gv gvVar = (r45.gv) it.next();
                    java.util.HashMap hashMap2 = liveRoomInfo.f309544k;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f375538f);
                    java.util.Iterator it6 = it;
                    java.lang.String str7 = str2;
                    java.lang.String str8 = gvVar.f375537e;
                    int i29 = intValue;
                    if (str8 == null) {
                        str8 = str7;
                    }
                    int i37 = gvVar.f375542m;
                    java.lang.String str9 = gvVar.f375543n;
                    java.lang.String str10 = gvVar.f375545p;
                    if (str10 == null) {
                        str10 = str7;
                    }
                    hashMap2.put(valueOf, new kn0.r(str8, i37, str9, str10));
                    it = it6;
                    str2 = str7;
                    intValue = i29;
                }
                i18 = intValue;
                if (z17) {
                    kn0.r g17 = liveRoomInfo.g(i28);
                    java.lang.String str11 = g17 != null ? g17.f309598c : null;
                    if (str11 == null || str11.length() == 0) {
                        ae2.in inVar = ae2.in.f3688a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3928y4).getValue()).r()).intValue() == 0) {
                            int i38 = ka4Var.f378546q;
                            kn0.r rVar = (kn0.r) liveRoomInfo.f309544k.get(java.lang.Integer.valueOf(i28));
                            kn0.r rVar2 = (kn0.r) liveRoomInfo.f309544k.get(java.lang.Integer.valueOf(i38));
                            if (rVar != null && rVar2 != null) {
                                java.lang.String str12 = "before exchangeCdnUrl:" + liveRoomInfo.f309544k;
                                java.lang.String str13 = liveRoomInfo.f309553t;
                                com.tencent.mars.xlog.Log.i(str13, str12);
                                int i39 = rVar.f309597b;
                                java.lang.String str14 = rVar.f309598c;
                                rVar.f309597b = rVar2.f309597b;
                                rVar.f309598c = rVar2.f309598c;
                                rVar2.f309597b = i39;
                                rVar2.f309598c = str14;
                                com.tencent.mars.xlog.Log.i(str13, "after exchangeCdnUrl:" + liveRoomInfo.f309544k);
                            }
                        }
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && com.tencent.mm.sdk.platformtools.t8.K0(str5) && com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                tRTCParams = trtcParams;
            } else {
                cl0.g gVar = new cl0.g();
                java.lang.Boolean bool = ((mm2.c1) liveData.a(mm2.c1.class)).f328847n2;
                boolean booleanValue2 = bool != null ? bool.booleanValue() : false;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !booleanValue2) {
                    gVar.h("userdefine_streamid_main", str4);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    gVar.h("userdefine_record_id", str5);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                    gVar.h("userdefine_push_args", str6);
                }
                if (((om2.l) liveData.a(om2.l.class)).N6() == 1 && zl2.r4.f473950a.w1() && (i19 = na4Var.f381197f.E1) == 1) {
                    gVar.o("keepmix", i19);
                    gVar.o("keepmix_idle_time", na4Var.f381197f.F1);
                }
                cl0.g gVar2 = new cl0.g();
                gVar2.h("Str_uc_params", gVar);
                tRTCParams = trtcParams;
                tRTCParams.businessInfo = gVar2.toString();
            }
            liveRoomInfo.f309548o = ka4Var;
            str = "MicroMsg.FinderLiveAssistant";
            com.tencent.mars.xlog.Log.i(str, "processLiveSdkParams cdnQualitySvrcfg" + liveRoomInfo.f309541h + " cdnSwitchMode:" + liveRoomInfo.f309540g + " cdn_quality_h265backcfg:" + liveRoomInfo.f309542i);
        } else {
            i18 = intValue;
            tRTCParams = trtcParams;
            str = "MicroMsg.FinderLiveAssistant";
        }
        com.tencent.mars.xlog.Log.i(str, "processLiveCgiSDKResponse trtcParams.roomId" + tRTCParams.roomId + " trtcParams.userId:" + tRTCParams.userId + " debugAudienceMode:" + i18 + " liveRoomInfo:" + liveRoomInfo);
        return na4Var;
    }
}
