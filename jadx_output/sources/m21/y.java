package m21;

/* loaded from: classes4.dex */
public abstract class y {
    /* JADX WARN: Removed duplicated region for block: B:55:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0ed4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.jj4 a(java.util.Map r90, int r91, java.lang.String r92, boolean r93) {
        /*
            Method dump skipped, instructions count: 3813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m21.y.a(java.util.Map, int, java.lang.String, boolean):r45.jj4");
    }

    public static r45.mv2 b(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.mv2 mv2Var = new r45.mv2();
        int indexOf = str.indexOf("<finder>");
        int indexOf2 = str.indexOf("</finder>");
        if (indexOf < 0 || indexOf2 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        java.lang.String substring = str.substring(indexOf, indexOf2 + 9);
        int indexOf3 = substring.indexOf("<finderTopic>");
        int indexOf4 = substring.indexOf("</finderTopic>");
        if (indexOf3 < 0 || indexOf4 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(substring.substring(indexOf3, indexOf4 + 14), "finderTopic", null);
        if (d17 != null) {
            if (!java.lang.String.valueOf(i17).equals((java.lang.String) d17.get(".finderTopic.topicType"))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
                return null;
            }
            mv2Var = zy2.d5.o("", d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
        return mv2Var;
    }

    public static r45.h96 c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillSnsMediaEcsInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.h96 h96Var = new r45.h96();
        if (!map.isEmpty()) {
            h96Var = new r45.h96();
            try {
                java.lang.String str2 = str + ".EcsInfo";
                java.lang.String str3 = (java.lang.String) map.get(str2 + ".productId");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                h96Var.f375965d = str3;
                h96Var.f375966e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".bizType"), 0);
                java.lang.String str5 = (java.lang.String) map.get(str2 + ".ecsJumpInfoBase64");
                if (str5 == null) {
                    str5 = "";
                }
                h96Var.f375967f = str5;
                java.lang.String str6 = (java.lang.String) map.get(str2 + ".reportData");
                if (str6 != null) {
                    str4 = str6;
                }
                h96Var.f375968g = str4;
                h96Var.f375969h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".showDetailBtn"), 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsMediaEcsInfoObject", "parse error %s", e17.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSnsMediaEcsInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        return h96Var;
    }

    public static r45.fd6 d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillSpringFestivalNode", "com.tencent.mm.modelsns.TimeLineHelper");
        int indexOf = str.indexOf("<SpringFestival>");
        int indexOf2 = str.indexOf("</SpringFestival>");
        r45.g92 g92Var = null;
        if (indexOf < 0 || indexOf2 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSpringFestivalNode", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        r45.fd6 fd6Var = new r45.fd6();
        int indexOf3 = str.indexOf("<SpringFinderLive>", indexOf);
        int indexOf4 = str.indexOf("</SpringFinderLive>", indexOf);
        if (indexOf3 >= 0 && indexOf4 >= 0) {
            java.lang.String trim = str.substring(indexOf3, indexOf4 + 19).trim();
            if (!android.text.TextUtils.isEmpty(trim)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                r45.g92 g92Var2 = new r45.g92();
                int indexOf5 = trim.indexOf("<SpringFinderLive>");
                int indexOf6 = trim.indexOf("</SpringFinderLive>");
                if (indexOf5 < 0 || indexOf6 < 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                } else {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(trim.substring(indexOf5, indexOf6 + 19), "SpringFinderLive", null);
                    if (d17 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFestivalFinderLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        r45.g92 g92Var3 = new r45.g92();
                        try {
                            if (!d17.isEmpty()) {
                                java.lang.String str2 = (java.lang.String) d17.get(".SpringFinderLive.finderLiveID");
                                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                g92Var3.set(0, str2);
                                java.lang.String str3 = (java.lang.String) d17.get(".SpringFinderLive.finderUsername");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                g92Var3.set(1, str3);
                                java.lang.String str4 = (java.lang.String) d17.get(".SpringFinderLive.finderObjectID");
                                if (str4 == null) {
                                    str4 = "";
                                }
                                g92Var3.set(2, str4);
                                java.lang.String str5 = (java.lang.String) d17.get(".SpringFinderLive.nickname");
                                if (str5 == null) {
                                    str5 = "";
                                }
                                g92Var3.set(3, str5);
                                java.lang.String str6 = (java.lang.String) d17.get(".SpringFinderLive.desc");
                                if (str6 == null) {
                                    str6 = "";
                                }
                                g92Var3.set(4, str6);
                                java.lang.String str7 = (java.lang.String) d17.get(".SpringFinderLive.media.coverUrl");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                g92Var3.set(5, str7.replace("&amp;", "&"));
                                g92Var3.set(7, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) d17.get(".SpringFinderLive.media.height"))));
                                g92Var3.set(6, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) d17.get(".SpringFinderLive.media.width"))));
                                java.lang.String str8 = (java.lang.String) d17.get(".SpringFinderLive.headUrl");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                g92Var3.set(11, str8);
                                java.lang.String str9 = (java.lang.String) d17.get(".SpringFinderLive.finderNonceID");
                                if (str9 == null) {
                                    str9 = "";
                                }
                                g92Var3.set(12, str9);
                                g92Var3.set(13, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.liveStatus"), 0)));
                                g92Var3.set(15, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.sourceType"), 0)));
                                java.lang.String str10 = (java.lang.String) d17.get(".SpringFinderLive.liveSourceTypeStr");
                                if (g92Var3.getInteger(15) == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
                                    g92Var3.set(15, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(str10, 0)));
                                }
                                g92Var3.set(18, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.authIconType"), 0)));
                                java.lang.String str11 = (java.lang.String) d17.get(".SpringFinderLive.authIconUrl");
                                if (str11 == null) {
                                    str11 = "";
                                }
                                g92Var3.set(17, str11);
                                g92Var3.set(19, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.bindType"), 0)));
                                java.lang.String str12 = (java.lang.String) d17.get(".SpringFinderLive.bizUsername");
                                if (str12 == null) {
                                    str12 = "";
                                }
                                g92Var3.set(20, str12);
                                java.lang.String str13 = (java.lang.String) d17.get(".SpringFinderLive.bizNickname");
                                if (str13 == null) {
                                    str13 = "";
                                }
                                g92Var3.set(21, str13);
                                java.lang.String str14 = (java.lang.String) d17.get(".SpringFinderLive.bizHeadUrl");
                                if (str14 == null) {
                                    str14 = "";
                                }
                                g92Var3.set(45, str14);
                                g92Var3.set(22, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.chargeFlag"), 0)));
                                java.lang.String str15 = (java.lang.String) d17.get(".SpringFinderLive.liveNickname");
                                if (str15 == null) {
                                    str15 = "";
                                }
                                g92Var3.set(25, str15);
                                java.lang.String str16 = (java.lang.String) d17.get(".SpringFinderLive.liveUsername");
                                if (str16 == null) {
                                    str16 = "";
                                }
                                g92Var3.set(26, str16);
                                java.lang.String str17 = (java.lang.String) d17.get(".SpringFinderLive.byPassInfoString");
                                if (str17 == null) {
                                    str17 = "";
                                }
                                g92Var3.set(27, str17);
                                java.lang.String str18 = (java.lang.String) d17.get(".SpringFinderLive.relayIndex");
                                if (str18 == null) {
                                    str18 = "";
                                }
                                g92Var3.set(28, str18);
                                java.lang.String str19 = (java.lang.String) d17.get(".SpringFinderLive.eventNickname");
                                if (str19 == null) {
                                    str19 = "";
                                }
                                g92Var3.set(29, str19);
                                java.lang.String str20 = (java.lang.String) d17.get(".SpringFinderLive.eventHeadUrl");
                                if (str20 == null) {
                                    str20 = "";
                                }
                                g92Var3.set(30, str20);
                                java.lang.String str21 = (java.lang.String) d17.get(".SpringFinderLive.eventId");
                                if (str21 == null) {
                                    str21 = "";
                                }
                                g92Var3.set(31, str21);
                                java.lang.String str22 = (java.lang.String) d17.get(".SpringFinderLive.participantIdentity");
                                if (str22 == null) {
                                    str22 = "";
                                }
                                g92Var3.set(32, str22);
                                java.lang.String str23 = (java.lang.String) d17.get(".SpringFinderLive.eventStatus");
                                if (str23 == null) {
                                    str23 = "";
                                }
                                g92Var3.set(33, str23);
                                java.lang.String str24 = (java.lang.String) d17.get(".SpringFinderLive.streamStatus");
                                if (str24 == null) {
                                    str24 = "";
                                }
                                g92Var3.set(34, str24);
                                g92Var3.set(35, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.coverEffectType"), 0)));
                                java.lang.String str25 = (java.lang.String) d17.get(".SpringFinderLive.coverEffectText");
                                if (str25 == null) {
                                    str25 = "";
                                }
                                g92Var3.set(36, str25);
                                java.lang.String str26 = (java.lang.String) d17.get(".SpringFinderLive.chatroomId");
                                if (str26 == null) {
                                    str26 = "";
                                }
                                g92Var3.set(37, str26);
                                g92Var3.set(38, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.liveFlag"), 0)));
                                g92Var3.set(39, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.replayStatus"), 0)));
                                java.lang.String str27 = (java.lang.String) d17.get(".SpringFinderLive.tailTagURL");
                                if (str27 == null) {
                                    str27 = "";
                                }
                                g92Var3.set(40, str27);
                                g92Var3.set(44, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.shareScene"), 0)));
                                if (g92Var3.getInteger(13) != 1 && g92Var3.getInteger(13) != 2) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderShareParser", "[parseFinderLive] shareObject.liveStatus = " + g92Var3.getInteger(13));
                                    g92Var3.set(13, 1);
                                }
                                g92Var3.set(14, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".SpringFinderLive.extFlag"), 0)));
                                java.lang.String str28 = (java.lang.String) d17.get(".SpringFinderLive.ecSource");
                                if (str28 == null) {
                                    str28 = "";
                                }
                                g92Var3.set(16, str28);
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFestivalFinderLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        g92Var2 = g92Var3;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                    g92Var = g92Var2;
                }
                fd6Var.f374243d = g92Var;
            }
        }
        int indexOf7 = str.indexOf("<Source>", indexOf);
        int indexOf8 = str.indexOf("</Source>", indexOf);
        if (indexOf7 >= 0 && indexOf8 >= 0) {
            java.lang.String trim2 = str.substring(indexOf7 + 8, indexOf8).trim();
            if (!android.text.TextUtils.isEmpty(trim2)) {
                fd6Var.f374244e = com.tencent.mm.sdk.platformtools.t8.D1(trim2, 0);
            }
        }
        int indexOf9 = str.indexOf("<Year>", indexOf);
        int indexOf10 = str.indexOf("</Year>", indexOf);
        if (indexOf9 >= 0 && indexOf10 >= 0) {
            java.lang.String trim3 = str.substring(indexOf9 + 6, indexOf10).trim();
            if (!android.text.TextUtils.isEmpty(trim3)) {
                fd6Var.f374245f = com.tencent.mm.sdk.platformtools.t8.D1(trim3, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSpringFestivalNode", "com.tencent.mm.modelsns.TimeLineHelper");
        return fd6Var;
    }

    public static r45.y97 e(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillWebSearchInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.y97 y97Var = new r45.y97();
        y97Var.f390898d = t((java.lang.String) map.get(".TimelineObject.websearch.relevant_vid"));
        y97Var.f390899e = t((java.lang.String) map.get(".TimelineObject.websearch.relevant_expand"));
        y97Var.f390900f = t((java.lang.String) map.get(".TimelineObject.websearch.relevant_pre_searchid"));
        y97Var.f390901g = t((java.lang.String) map.get(".TimelineObject.websearch.relevant_shared_openid"));
        y97Var.f390902h = s((java.lang.String) map.get(".TimelineObject.websearch.rec_category"));
        y97Var.f390904m = t((java.lang.String) map.get(".TimelineObject.websearch.shareUrl"));
        y97Var.f390905n = t((java.lang.String) map.get(".TimelineObject.websearch.shareTitle"));
        y97Var.f390906o = t((java.lang.String) map.get(".TimelineObject.websearch.shareDesc"));
        y97Var.f390907p = t((java.lang.String) map.get(".TimelineObject.websearch.shareImgUrl"));
        y97Var.f390908q = t((java.lang.String) map.get(".TimelineObject.websearch.shareString"));
        y97Var.f390909r = t((java.lang.String) map.get(".TimelineObject.websearch.shareStringUrl"));
        y97Var.f390910s = t((java.lang.String) map.get(".TimelineObject.websearch.source"));
        y97Var.f390911t = t((java.lang.String) map.get(".TimelineObject.websearch.sourceUrl"));
        y97Var.f390903i = t((java.lang.String) map.get(".TimelineObject.websearch.strPlayCount"));
        y97Var.f390912u = t((java.lang.String) map.get(".TimelineObject.websearch.titleUrl"));
        y97Var.f390913v = t((java.lang.String) map.get(".TimelineObject.websearch.extReqParams"));
        y97Var.f390914w = t((java.lang.String) map.get(".TimelineObject.websearch.tagList"));
        y97Var.f390915x = s((java.lang.String) map.get(".TimelineObject.websearch.channelId"));
        y97Var.f390917z = t((java.lang.String) map.get(".TimelineObject.websearch.shareTag"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillWebSearchInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        return y97Var;
    }

    public static r45.jj4 f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f377857f = "";
        jj4Var.f377863n = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return jj4Var;
    }

    public static r45.jj4 g(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, int i19, int i27, java.lang.String str4, r45.lj4 lj4Var, com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo, r45.h96 h96Var, r45.mj4 mj4Var, r45.vb1 vb1Var, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f377855d = t(str);
        jj4Var.f377856e = i17;
        jj4Var.f377857f = t(str4);
        jj4Var.f377863n = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
        r45.fa6 fa6Var = null;
        if (scanCodeInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
        } else {
            scanCodeInfo.toString();
            java.lang.String str6 = scanCodeInfo.f71273d;
            if (str6.length() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
            } else {
                fa6Var = new r45.fa6();
                fa6Var.f374150d = str6;
                fa6Var.f374151e = scanCodeInfo.f71274e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertScanCodeInfo", "com.tencent.mm.plugin.sns.util.SnsScanCodeUtils");
            }
        }
        jj4Var.W = fa6Var;
        jj4Var.f377876x0 = h96Var;
        jj4Var.f377859h = i18;
        jj4Var.f377862m = i19;
        jj4Var.G1 = vb1Var;
        jj4Var.I1 = str5;
        if (mj4Var == null || mj4Var.F == null) {
            jj4Var.f377858g = t(str2);
            jj4Var.f377860i = t(str3);
            jj4Var.f377865p = lj4Var;
            jj4Var.F = kk.k.g(str2 == null ? "".getBytes() : str2.getBytes());
        } else {
            r45.cj4 cj4Var = mj4Var.f380566g;
            jj4Var.f377858g = cj4Var.f371595d;
            jj4Var.f377865p = cj4Var.f371598g;
            jj4Var.f377860i = ((r45.cj4) mj4Var.f380568i.getFirst()).f371595d;
            r45.cj4 cj4Var2 = mj4Var.F;
            jj4Var.f377879y0 = cj4Var2.f371595d;
            jj4Var.f377882z1 = cj4Var2.f371598g;
            jj4Var.f377880y1 = cj4Var2.f371597f;
            r45.cj4 cj4Var3 = mj4Var.G;
            if (cj4Var3 != null) {
                jj4Var.A1 = cj4Var3.f371595d;
                jj4Var.F1 = cj4Var3.f371598g;
                jj4Var.E1 = cj4Var3.f371597f;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return jj4Var;
    }

    public static r45.jj4 h(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, int i19, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f377855d = str;
        jj4Var.f377856e = i17;
        jj4Var.f377858g = str2;
        jj4Var.f377860i = str3;
        jj4Var.f377859h = i18;
        jj4Var.f377862m = i19;
        jj4Var.f377857f = str4;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379521e = 0.0f;
        lj4Var.f379520d = 0.0f;
        lj4Var.f379522f = 0.0f;
        jj4Var.f377865p = lj4Var;
        jj4Var.F = kk.k.g(str2 == null ? "".getBytes() : str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return jj4Var;
    }

    public static com.tencent.mm.protocal.protobuf.TimeLineObject i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNewTimeLine", "com.tencent.mm.modelsns.TimeLineHelper");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = new com.tencent.mm.protocal.protobuf.TimeLineObject();
        r45.a90 a90Var = new r45.a90();
        timeLineObject.AppInfo = new r45.y8();
        timeLineObject.ContentObj = a90Var;
        timeLineObject.Privated = 0;
        timeLineObject.CreateTime = 0;
        timeLineObject.Id = "";
        r45.ed4 ed4Var = new r45.ed4();
        ed4Var.f373312e = 0.0f;
        ed4Var.f373311d = 0.0f;
        timeLineObject.Location = ed4Var;
        timeLineObject.canvasInfo = "";
        timeLineObject.weappInfo = new r45.y87();
        timeLineObject.videoTemplate = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNewTimeLine", "com.tencent.mm.modelsns.TimeLineHelper");
        return timeLineObject;
    }

    public static android.util.Pair j(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineLiveSize", "com.tencent.mm.modelsns.TimeLineHelper");
        float d17 = com.tencent.mm.sdk.platformtools.j.d(context, 225.0f);
        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf((int) ((3.0f * d17) / 4.0f)), java.lang.Integer.valueOf((int) d17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineLiveSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    public static android.util.Pair k(int i17, int i18, android.content.Context context, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        if (i17 <= 0) {
            i17 = com.tencent.mapsdk.internal.km.f50100e;
        }
        if (i18 <= 0) {
            i18 = 240;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineHelper", "the context is null");
            android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
            return create;
        }
        int min = ((context.getResources().getDisplayMetrics() != null ? (int) java.lang.Math.min(r3.widthPixels * 0.63f, r3.heightPixels * 0.63f) : i17) >> 5) << 5;
        if (i17 < i18) {
            min = java.lang.Math.min(com.tencent.mm.sdk.platformtools.j.d(context, 160.0f), min);
        }
        int i19 = (int) (((min * 1.0d) * i18) / i17);
        if (!z17) {
            int b17 = i65.a.b(context, 225);
            int b18 = i65.a.b(context, be1.r.CTRL_INDEX);
            if (i19 > min || i19 == min) {
                min = b18;
                i19 = b17;
            } else {
                i19 = b18;
                min = b17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        android.util.Pair create2 = android.util.Pair.create(java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(i19));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create2;
    }

    public static android.util.Pair l(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, android.content.Context context, boolean z17) {
        int i17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.jj4 jj4Var;
        r45.lj4 lj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        int i18 = 0;
        if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && (linkedList = a90Var.f369840h) != null && linkedList.size() > 0 && (jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0)) != null && (lj4Var = jj4Var.f377865p) != null) {
            float f17 = lj4Var.f379520d;
            if (f17 > 0.0f) {
                float f18 = lj4Var.f379521e;
                if (f18 > 0.0f) {
                    i18 = (int) f17;
                    i17 = (int) f18;
                    android.util.Pair k17 = k(i18, i17, context, z17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
                    return k17;
                }
            }
        }
        i17 = 0;
        android.util.Pair k172 = k(i18, i17, context, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return k172;
    }

    public static android.util.Pair m(int i17, int i18, android.content.Context context) {
        double d17;
        double d18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineSinglePhotoSize", "com.tencent.mm.modelsns.TimeLineHelper");
        int d19 = com.tencent.mm.sdk.platformtools.j.d(context, 160.0f);
        int d27 = com.tencent.mm.sdk.platformtools.j.d(context, 200.0f);
        int d28 = com.tencent.mm.sdk.platformtools.j.d(context, 44.0f);
        double d29 = i17;
        double d37 = i18;
        if (d29 <= 0.0d || d37 <= 0.0d) {
            d17 = d19;
            d18 = d17;
        } else {
            d18 = d27;
            double min = java.lang.Math.min(d18 / d29, d18 / d37);
            d17 = d29 * min;
            double d38 = d37 * min;
            double d39 = d28;
            if (d17 < d39) {
                double d47 = (d39 * 1.0d) / d17;
                d17 *= d47;
                d38 *= d47;
            }
            if (d38 < d39) {
                double d48 = (d39 * 1.0d) / d38;
                d17 *= d48;
                d38 *= d48;
            }
            if (d17 > d18) {
                d17 = d18;
            }
            if (d38 <= d18) {
                d18 = d38;
            }
        }
        if (d17 < 1.0d) {
            d17 = 1.0d;
        }
        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf((int) d17), java.lang.Integer.valueOf((int) (d18 >= 1.0d ? d18 : 1.0d)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSinglePhotoSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    public static android.util.Pair n(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineVerticalSightAdSize", "com.tencent.mm.modelsns.TimeLineHelper");
        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i65.a.b(context, 127)), java.lang.Integer.valueOf(i65.a.b(context, 225)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineVerticalSightAdSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    public static r45.z8 o(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d("<root>" + u(str) + "</root>", "root", null);
        if (d17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        r45.z8 z8Var = new r45.z8();
        z8Var.f391785d = t((java.lang.String) d17.get(".root.en"));
        z8Var.f391786e = t((java.lang.String) d17.get(".root.zh-CN"));
        z8Var.f391787f = t((java.lang.String) d17.get(".root.zh-TW"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
        return z8Var;
    }

    public static float p(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
            return 0.0f;
        }
        float L = com.tencent.mm.sdk.platformtools.t8.L(str, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
        return L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0ca1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x08b3  */
    /* JADX WARN: Type inference failed for: r10v172 */
    /* JADX WARN: Type inference failed for: r10v175 */
    /* JADX WARN: Type inference failed for: r10v178 */
    /* JADX WARN: Type inference failed for: r10v181 */
    /* JADX WARN: Type inference failed for: r10v186 */
    /* JADX WARN: Type inference failed for: r10v191 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [r45.km6] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [r45.lv2] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [r45.lh0] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41, types: [r45.k86] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [r45.kv2] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [r45.xs4] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [r45.hd2] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [r45.ee] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20, types: [r45.g92] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [r45.ev2] */
    /* JADX WARN: Type inference failed for: r9v3, types: [r45.ek4] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [r45.mv2] */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v9, types: [r45.dv2] */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v94 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.protocal.protobuf.TimeLineObject q(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m21.y.q(java.lang.String):com.tencent.mm.protocal.protobuf.TimeLineObject");
    }

    public static int r(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserInt", "com.tencent.mm.modelsns.TimeLineHelper");
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserInt", "com.tencent.mm.modelsns.TimeLineHelper");
        return P;
    }

    public static long s(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserLong", "com.tencent.mm.modelsns.TimeLineHelper");
        long V = com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserLong", "com.tencent.mm.modelsns.TimeLineHelper");
        return V;
    }

    public static java.lang.String t(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
        return str;
    }

    public static java.lang.String u(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unescapeXML", "com.tencent.mm.modelsns.TimeLineHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            char charAt = str.charAt(i17);
            if (charAt != '&') {
                sb6.append(charAt);
                i17++;
            } else if (str.startsWith("&amp;", i17)) {
                sb6.append('&');
                i17 += 5;
            } else {
                if (str.startsWith("&apos;", i17)) {
                    sb6.append('\'');
                } else if (str.startsWith("&quot;", i17)) {
                    sb6.append('\"');
                } else {
                    if (str.startsWith("&lt;", i17)) {
                        sb6.append('<');
                    } else if (str.startsWith("&gt;", i17)) {
                        sb6.append('>');
                    }
                    i17 += 4;
                }
                i17 += 6;
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unescapeXML", "com.tencent.mm.modelsns.TimeLineHelper");
        return sb7;
    }

    public static java.lang.String v(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unescapeXMLSafe", "com.tencent.mm.modelsns.TimeLineHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            char charAt = str.charAt(i17);
            if (charAt != '&') {
                sb6.append(charAt);
            } else if (str.startsWith("&amp;", i17)) {
                sb6.append('&');
                i17 += 5;
            } else {
                if (str.startsWith("&apos;", i17)) {
                    sb6.append('\'');
                } else if (str.startsWith("&quot;", i17)) {
                    sb6.append('\"');
                } else {
                    if (str.startsWith("&lt;", i17)) {
                        sb6.append('<');
                    } else if (str.startsWith("&gt;", i17)) {
                        sb6.append('>');
                    } else {
                        sb6.append(charAt);
                    }
                    i17 += 4;
                }
                i17 += 6;
            }
            i17++;
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unescapeXMLSafe", "com.tencent.mm.modelsns.TimeLineHelper");
        return sb7;
    }
}
