package yc4;

/* loaded from: classes4.dex */
public final class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        yc4.v vVar;
        java.util.Map map;
        l52.g gVar;
        r45.p86 p86Var;
        java.util.Map map2;
        java.lang.String str3 = "callback";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener");
        com.tencent.mm.autogen.events.GetSnsTimelineReportParamsEvent event = (com.tencent.mm.autogen.events.GetSnsTimelineReportParamsEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Integer num = 0;
        am.rg rgVar = event.f54416g;
        if (rgVar != null) {
            java.util.LinkedList linkedList = rgVar.f7813d;
            boolean z17 = true;
            if (!(linkedList == null || linkedList.isEmpty())) {
                java.lang.String str5 = rgVar.f7811b;
                if (str5 != null && str5.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str = "callback";
                    str2 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
                    com.tencent.mars.xlog.Log.e("MicroMsg.GetSnsReportParamsListener", "sessionIdList is null");
                } else {
                    if (rgVar.f7810a) {
                        yc4.b0 b0Var = yc4.b0.f460839a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsDetail16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                        vVar = yc4.b0.f460841c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsDetail16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    } else {
                        yc4.b0 b0Var2 = yc4.b0.f460839a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeline16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                        vVar = yc4.b0.f460840b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeline16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    }
                    if (vVar != null) {
                        java.lang.String str6 = "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNewFeedCount", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                        int i17 = vVar.f460876c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNewFeedCount", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                        java.lang.String str7 = rgVar.f7811b;
                        java.lang.String str8 = rgVar.f7812c;
                        if (kotlin.jvm.internal.o.b(vVar.a(), rgVar.f7811b)) {
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            java.util.Iterator it = rgVar.f7813d.iterator();
                            while (it.hasNext()) {
                                java.lang.String str9 = (java.lang.String) it.next();
                                kotlin.jvm.internal.o.d(str9);
                                java.util.Iterator it6 = it;
                                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                java.lang.Integer num2 = num;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedLikeMap", str6);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedLikeMap", str6);
                                java.lang.Integer num3 = (java.lang.Integer) vVar.f460877d.get(str9);
                                if (num3 == null) {
                                    num3 = num2;
                                }
                                kotlin.jvm.internal.o.d(num3);
                                int intValue = num3.intValue();
                                java.lang.String str10 = str3;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedCommentMap", str6);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedCommentMap", str6);
                                java.lang.Integer num4 = (java.lang.Integer) vVar.f460878e.get(str9);
                                if (num4 == null) {
                                    num4 = num2;
                                }
                                kotlin.jvm.internal.o.d(num4);
                                int intValue2 = num4.intValue();
                                java.lang.String str11 = str4;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedClickList", str6);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedClickList", str6);
                                java.lang.String str12 = (java.lang.String) vVar.f460879f.get(str9);
                                if (str12 == null) {
                                    str12 = "";
                                }
                                java.lang.String str13 = str8;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedBrowseTimeMsMap", str6);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedBrowseTimeMsMap", str6);
                                java.lang.Long l17 = (java.lang.Long) vVar.f460880g.get(str9);
                                if (l17 == null) {
                                    l17 = 0L;
                                }
                                kotlin.jvm.internal.o.d(l17);
                                java.lang.String str14 = str6;
                                long longValue = l17.longValue();
                                linkedHashMap2.put("sns_feed_like_cnt", java.lang.Integer.valueOf(intValue));
                                linkedHashMap2.put("sns_feed_comment_cnt", java.lang.Integer.valueOf(intValue2));
                                linkedHashMap2.put("sns_feed_click_list", str12);
                                linkedHashMap2.put("sns_feed_media_time", java.lang.Long.valueOf(longValue));
                                com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsReportParamsListener", "feedId: " + str9 + ", feedLikeCnt: " + intValue + " feedComment: " + intValue2 + ", feedClickList: " + str12 + ", snsFeedMediaTime: " + longValue);
                                linkedHashMap.put(str9, linkedHashMap2);
                                it = it6;
                                num = num2;
                                str3 = str10;
                                str4 = str11;
                                str8 = str13;
                                vVar = vVar;
                                str6 = str14;
                            }
                            str = str3;
                            str2 = str4;
                            java.lang.String str15 = str8;
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsReportParamsListener", "newFeedCount: " + i17 + ", feedInfoMapSize: " + linkedHashMap.size() + " sessionId: " + str7 + ", sessionPage = " + str15);
                            if (((v30.e) i95.n0.c(v30.e.class)) != null) {
                                kotlin.jvm.internal.o.d(str15);
                                e62.q a17 = e62.q.a();
                                a17.getClass();
                                java.lang.String str16 = str15.isEmpty() ? a17.f249806d : str15;
                                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "cur session page: %s", str16);
                                e62.j b17 = a17.b(str16);
                                if (b17 != null) {
                                    l52.f fVar = b17.f249768d;
                                    if (fVar != null && fVar.f316583c == 0 && (map = fVar.f316585e) != null) {
                                        r45.va6 va6Var = fVar.f316587g;
                                        if (va6Var != null) {
                                            va6Var.f388054r = i17;
                                            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "updateNewFeedCount: %d", java.lang.Integer.valueOf(i17));
                                        }
                                        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                                            java.lang.String str17 = (java.lang.String) entry.getKey();
                                            if (linkedHashMap.containsKey(str17) && (gVar = (l52.g) entry.getValue()) != null && (p86Var = gVar.f316607a) != null && (map2 = (java.util.Map) linkedHashMap.get(str17)) != null) {
                                                p86Var.E = map2.containsKey("sns_feed_like_cnt") ? ((java.lang.Integer) map2.get("sns_feed_like_cnt")).intValue() : 0;
                                                p86Var.F = map2.containsKey("sns_feed_comment_cnt") ? ((java.lang.Integer) map2.get("sns_feed_comment_cnt")).intValue() : 0;
                                                p86Var.G = map2.containsKey("sns_feed_click_list") ? (java.lang.String) map2.get("sns_feed_click_list") : "";
                                                p86Var.I = map2.containsKey("sns_feed_media_time") ? ((java.lang.Long) map2.get("sns_feed_media_time")).longValue() : 0L;
                                            }
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateFeedInfo: " + i17);
                                }
                            }
                        }
                    }
                }
                str3 = str;
                str4 = str2;
            }
            str = "callback";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
            str3 = str;
            str4 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        return false;
    }
}
