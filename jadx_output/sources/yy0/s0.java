package yy0;

/* loaded from: classes16.dex */
public final class s0 implements com.tencent.maas.MJMaasCore.AnalyticsListener {

    /* renamed from: a, reason: collision with root package name */
    public static final yy0.s0 f468313a = new yy0.s0();

    @Override // com.tencent.maas.MJMaasCore.AnalyticsListener
    public final void onEvent(com.tencent.maas.analytics.MJAnalyticsEvent mJAnalyticsEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z18;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        boolean z19;
        java.lang.String str10;
        boolean z27;
        java.nio.ByteBuffer pBData;
        if (mJAnalyticsEvent != null) {
            ig.a aVar = mJAnalyticsEvent.f47796a;
            int i17 = aVar == null ? -1 : yy0.r0.f468301a[aVar.ordinal()];
            ig.j0 j0Var = null;
            ig.w0 w0Var = null;
            ig.s0 s0Var = null;
            ig.n0 n0Var = null;
            ig.j0 j0Var2 = null;
            if (i17 == 1) {
                java.nio.ByteBuffer pBData2 = mJAnalyticsEvent.getPBData();
                if (pBData2 != null) {
                    try {
                        w0Var = ig.w0.parseFrom(pBData2);
                        str = "PostId";
                        str2 = "getValuesList(...)";
                        str3 = "toString(...)";
                        z17 = false;
                    } catch (com.google.protobuf.y6 e17) {
                        str = "PostId";
                        str2 = "getValuesList(...)";
                        str3 = "toString(...)";
                        z17 = false;
                        com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e17, "PublisherSessionMetrics pb error", new java.lang.Object[0]);
                    }
                    if (w0Var != null) {
                        com.tencent.mm.autogen.mmdata.rpt.MJPublisherSessionStruct mJPublisherSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherSessionStruct();
                        java.lang.String sessionId = w0Var.getSessionId();
                        kotlin.jvm.internal.o.f(sessionId, "getSessionId(...)");
                        mJPublisherSessionStruct.f58750d = mJPublisherSessionStruct.b("PublisherSessionID", r26.i0.t(sessionId, ",", ";", z17), true);
                        java.lang.String entryType = w0Var.getEntryType();
                        kotlin.jvm.internal.o.f(entryType, "getEntryType(...)");
                        mJPublisherSessionStruct.f58751e = mJPublisherSessionStruct.b("EntryType", r26.i0.t(entryType, ",", ";", z17), true);
                        java.lang.String maasVersion = w0Var.getMaasVersion();
                        kotlin.jvm.internal.o.f(maasVersion, "getMaasVersion(...)");
                        mJPublisherSessionStruct.f58752f = mJPublisherSessionStruct.b("MaasSDKVersion", r26.i0.t(maasVersion, ",", ";", z17), true);
                        mJPublisherSessionStruct.f58753g = w0Var.getBeginTimeStamp();
                        mJPublisherSessionStruct.f58754h = (int) w0Var.getTotalDurationMs();
                        java.lang.String endReason = w0Var.getEndReason();
                        kotlin.jvm.internal.o.f(endReason, "getEndReason(...)");
                        mJPublisherSessionStruct.f58755i = mJPublisherSessionStruct.b("EndReason", r26.i0.t(endReason, ",", ";", z17), true);
                        mJPublisherSessionStruct.f58756j = (int) w0Var.getValidationCode();
                        java.lang.String lastViewId = w0Var.getLastViewId();
                        kotlin.jvm.internal.o.f(lastViewId, "getLastViewId(...)");
                        mJPublisherSessionStruct.f58757k = mJPublisherSessionStruct.b("LastViewID", r26.i0.t(lastViewId, ",", ";", z17), true);
                        java.lang.String lastStateId = w0Var.getLastStateId();
                        kotlin.jvm.internal.o.f(lastStateId, "getLastStateId(...)");
                        mJPublisherSessionStruct.f58758l = mJPublisherSessionStruct.b("LastStateID", r26.i0.t(lastStateId, ",", ";", z17), true);
                        mJPublisherSessionStruct.f58759m = w0Var.getVisitedViews();
                        mJPublisherSessionStruct.f58760n = w0Var.getVisitedStates();
                        mJPublisherSessionStruct.f58761o = (int) w0Var.getMetricsVersion();
                        mJPublisherSessionStruct.f58762p = (int) w0Var.getFirstImpressionTimeCostMs();
                        mJPublisherSessionStruct.f58763q = (int) w0Var.getTotalDownloadBytes();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList = w0Var.getScMetrics().getKeysList();
                        kotlin.jvm.internal.o.f(keysList, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList = w0Var.getScMetrics().getValuesList();
                        java.lang.String str11 = str2;
                        kotlin.jvm.internal.o.f(valuesList, str11);
                        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(keysList, valuesList)).iterator();
                        while (it.hasNext()) {
                            jz5.l lVar = (jz5.l) it.next();
                            jSONObject.put((java.lang.String) lVar.f302833d, lVar.f302834e);
                        }
                        java.lang.String jSONObject2 = jSONObject.toString();
                        java.lang.String str12 = str3;
                        kotlin.jvm.internal.o.f(jSONObject2, str12);
                        mJPublisherSessionStruct.f58764r = mJPublisherSessionStruct.b("SCMetrics", r26.i0.t(jSONObject2, ",", ";", false), true);
                        java.lang.String resultOriginType = w0Var.getResultOriginType();
                        kotlin.jvm.internal.o.f(resultOriginType, "getResultOriginType(...)");
                        mJPublisherSessionStruct.f58765s = mJPublisherSessionStruct.b("ResultOriginType", r26.i0.t(resultOriginType, ",", ";", false), true);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList2 = w0Var.getResultInfoMedia().getKeysList();
                        kotlin.jvm.internal.o.f(keysList2, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList2 = w0Var.getResultInfoMedia().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList2, str11);
                        java.util.Iterator it6 = ((java.util.ArrayList) kz5.n0.a1(keysList2, valuesList2)).iterator();
                        while (it6.hasNext()) {
                            jz5.l lVar2 = (jz5.l) it6.next();
                            jSONObject3.put((java.lang.String) lVar2.f302833d, lVar2.f302834e);
                        }
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        kotlin.jvm.internal.o.f(jSONObject4, str12);
                        mJPublisherSessionStruct.f58766t = mJPublisherSessionStruct.b("ResultInfoMedia", r26.i0.t(jSONObject4, ",", ";", false), true);
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList3 = w0Var.getResultInfoSc().getKeysList();
                        kotlin.jvm.internal.o.f(keysList3, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList3 = w0Var.getResultInfoSc().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList3, str11);
                        java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.a1(keysList3, valuesList3)).iterator();
                        while (it7.hasNext()) {
                            jz5.l lVar3 = (jz5.l) it7.next();
                            jSONObject5.put((java.lang.String) lVar3.f302833d, lVar3.f302834e);
                        }
                        java.lang.String jSONObject6 = jSONObject5.toString();
                        kotlin.jvm.internal.o.f(jSONObject6, str12);
                        mJPublisherSessionStruct.f58767u = mJPublisherSessionStruct.b("ResultInfoSC", r26.i0.t(jSONObject6, ",", ";", false), true);
                        mJPublisherSessionStruct.f58768v = w0Var.getEnterScene();
                        mJPublisherSessionStruct.f58769w = w0Var.getParentEnterScene();
                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList4 = w0Var.getResultInfoMc().getKeysList();
                        kotlin.jvm.internal.o.f(keysList4, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList4 = w0Var.getResultInfoMc().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList4, str11);
                        java.util.Iterator it8 = ((java.util.ArrayList) kz5.n0.a1(keysList4, valuesList4)).iterator();
                        while (it8.hasNext()) {
                            jz5.l lVar4 = (jz5.l) it8.next();
                            jSONObject7.put((java.lang.String) lVar4.f302833d, lVar4.f302834e);
                        }
                        java.lang.String jSONObject8 = jSONObject7.toString();
                        kotlin.jvm.internal.o.f(jSONObject8, str12);
                        mJPublisherSessionStruct.f58770x = mJPublisherSessionStruct.b("ResultInfoMC", r26.i0.t(jSONObject8, ",", ";", false), true);
                        org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList5 = w0Var.getMcMetrics().getKeysList();
                        kotlin.jvm.internal.o.f(keysList5, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList5 = w0Var.getMcMetrics().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList5, str11);
                        java.util.Iterator it9 = ((java.util.ArrayList) kz5.n0.a1(keysList5, valuesList5)).iterator();
                        while (it9.hasNext()) {
                            jz5.l lVar5 = (jz5.l) it9.next();
                            jSONObject9.put((java.lang.String) lVar5.f302833d, lVar5.f302834e);
                        }
                        java.lang.String jSONObject10 = jSONObject9.toString();
                        kotlin.jvm.internal.o.f(jSONObject10, str12);
                        mJPublisherSessionStruct.f58771y = mJPublisherSessionStruct.b("MCMetrics", r26.i0.t(jSONObject10, ",", ";", false), true);
                        org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList6 = w0Var.getResultInfoMcMaterial().getKeysList();
                        kotlin.jvm.internal.o.f(keysList6, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList6 = w0Var.getResultInfoMcMaterial().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList6, str11);
                        java.util.Iterator it10 = ((java.util.ArrayList) kz5.n0.a1(keysList6, valuesList6)).iterator();
                        while (it10.hasNext()) {
                            jz5.l lVar6 = (jz5.l) it10.next();
                            jSONObject11.put((java.lang.String) lVar6.f302833d, lVar6.f302834e);
                        }
                        java.lang.String jSONObject12 = jSONObject11.toString();
                        kotlin.jvm.internal.o.f(jSONObject12, str12);
                        mJPublisherSessionStruct.f58772z = mJPublisherSessionStruct.b("ResultInfoMCMaterial", r26.i0.t(jSONObject12, ",", ";", false), true);
                        org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList7 = w0Var.getStartupOptions().getKeysList();
                        kotlin.jvm.internal.o.f(keysList7, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList7 = w0Var.getStartupOptions().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList7, str11);
                        java.util.Iterator it11 = ((java.util.ArrayList) kz5.n0.a1(keysList7, valuesList7)).iterator();
                        while (it11.hasNext()) {
                            jz5.l lVar7 = (jz5.l) it11.next();
                            jSONObject13.put((java.lang.String) lVar7.f302833d, lVar7.f302834e);
                        }
                        java.lang.String jSONObject14 = jSONObject13.toString();
                        kotlin.jvm.internal.o.f(jSONObject14, str12);
                        mJPublisherSessionStruct.A = mJPublisherSessionStruct.b("StartupOptions", r26.i0.t(jSONObject14, ",", ";", false), true);
                        mJPublisherSessionStruct.B = mJPublisherSessionStruct.b(str, w0Var.getPostId(), true);
                        com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29692 MJPublisherSessionStruct values:\npublisherSessionID = " + mJPublisherSessionStruct.f58750d + "\nentryType = " + mJPublisherSessionStruct.f58751e + "\nmaasSDKVersion = " + mJPublisherSessionStruct.f58752f + "\nbeginTime = " + mJPublisherSessionStruct.f58753g + "\ntotalDurationMillis = " + mJPublisherSessionStruct.f58754h + "\nendReason = " + mJPublisherSessionStruct.f58755i + "\nvalidationCode = " + mJPublisherSessionStruct.f58756j + "\nlastViewID = " + mJPublisherSessionStruct.f58757k + "\nlastStateID = " + mJPublisherSessionStruct.f58758l + "\nvisitedViews = " + mJPublisherSessionStruct.f58759m + "\nvisitedStates = " + mJPublisherSessionStruct.f58760n + "\nmetricsVersion = " + mJPublisherSessionStruct.f58761o + "\nfirstImpressionTimeCostMillis = " + mJPublisherSessionStruct.f58762p + "\ntotalDownloadBytes = " + mJPublisherSessionStruct.f58763q + "\nscMetrics = " + mJPublisherSessionStruct.f58764r + "\nresultOriginType = " + mJPublisherSessionStruct.f58765s + "\nresultInfoMedia = " + mJPublisherSessionStruct.f58766t + "\nresultInfoSC = " + mJPublisherSessionStruct.f58767u + "\nenterScene = " + mJPublisherSessionStruct.f58768v + "\nparentEnterScene = " + mJPublisherSessionStruct.f58769w + "\nresultInfoMC = " + mJPublisherSessionStruct.f58770x + "\nmcMetrics = " + mJPublisherSessionStruct.f58771y + "\nresultInfoMCMaterial = " + mJPublisherSessionStruct.f58772z + "\nstartupOptions = " + mJPublisherSessionStruct.A + "\npostId = " + mJPublisherSessionStruct.B);
                        mJPublisherSessionStruct.k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 2) {
                java.nio.ByteBuffer pBData3 = mJAnalyticsEvent.getPBData();
                if (pBData3 != null) {
                    try {
                        s0Var = ig.s0.parseFrom(pBData3);
                        str5 = "TaskName";
                        str4 = "EndReason";
                        str6 = "getEndReason(...)";
                        z18 = false;
                    } catch (com.google.protobuf.y6 e18) {
                        str4 = "EndReason";
                        str5 = "TaskName";
                        str6 = "getEndReason(...)";
                        z18 = false;
                        com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e18, "PublisherSCTaskMetrics pb error", new java.lang.Object[0]);
                    }
                    if (s0Var != null) {
                        com.tencent.mm.autogen.mmdata.rpt.MJPublisherSCTaskStruct mJPublisherSCTaskStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherSCTaskStruct();
                        java.lang.String sessionId2 = s0Var.getSessionId();
                        kotlin.jvm.internal.o.f(sessionId2, "getSessionId(...)");
                        mJPublisherSCTaskStruct.f58735d = mJPublisherSCTaskStruct.b("PublisherSessionID", r26.i0.t(sessionId2, ",", ";", z18), true);
                        java.lang.String entryType2 = s0Var.getEntryType();
                        kotlin.jvm.internal.o.f(entryType2, "getEntryType(...)");
                        mJPublisherSCTaskStruct.f58736e = mJPublisherSCTaskStruct.b("EntryType", r26.i0.t(entryType2, ",", ";", z18), true);
                        java.lang.String maasVersion2 = s0Var.getMaasVersion();
                        kotlin.jvm.internal.o.f(maasVersion2, "getMaasVersion(...)");
                        mJPublisherSCTaskStruct.f58737f = mJPublisherSCTaskStruct.b("MaasSDKVersion", r26.i0.t(maasVersion2, ",", ";", z18), true);
                        java.lang.String taskId = s0Var.getTaskId();
                        kotlin.jvm.internal.o.f(taskId, "getTaskId(...)");
                        mJPublisherSCTaskStruct.f58738g = mJPublisherSCTaskStruct.b("TaskID", r26.i0.t(taskId, ",", ";", z18), true);
                        java.lang.String taskName = s0Var.getTaskName();
                        kotlin.jvm.internal.o.f(taskName, "getTaskName(...)");
                        mJPublisherSCTaskStruct.f58739h = mJPublisherSCTaskStruct.b(str5, r26.i0.t(taskName, ",", ";", z18), true);
                        mJPublisherSCTaskStruct.f58740i = s0Var.getBeginTimeStamp();
                        mJPublisherSCTaskStruct.f58741j = (int) s0Var.getTotalDurationMs();
                        java.lang.String endReason2 = s0Var.getEndReason();
                        kotlin.jvm.internal.o.f(endReason2, str6);
                        mJPublisherSCTaskStruct.f58742k = mJPublisherSCTaskStruct.b(str4, r26.i0.t(endReason2, ",", ";", z18), true);
                        java.lang.String templateId = s0Var.getTemplateId();
                        kotlin.jvm.internal.o.f(templateId, "getTemplateId(...)");
                        mJPublisherSCTaskStruct.f58743l = mJPublisherSCTaskStruct.b("TemplateID", r26.i0.t(templateId, ",", ";", z18), true);
                        mJPublisherSCTaskStruct.f58744m = (int) s0Var.getTemplateIndex();
                        java.lang.String templateSelectReason = s0Var.getTemplateSelectReason();
                        kotlin.jvm.internal.o.f(templateSelectReason, "getTemplateSelectReason(...)");
                        mJPublisherSCTaskStruct.f58745n = mJPublisherSCTaskStruct.b("TemplateSelectionReason", r26.i0.t(templateSelectReason, ",", ";", z18), true);
                        java.lang.String camSource = s0Var.getCamSource();
                        kotlin.jvm.internal.o.f(camSource, "getCamSource(...)");
                        mJPublisherSCTaskStruct.f58746o = mJPublisherSCTaskStruct.b("CameraInUse", r26.i0.t(camSource, ",", ";", z18), true);
                        org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList8 = s0Var.getDetails().getKeysList();
                        kotlin.jvm.internal.o.f(keysList8, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList8 = s0Var.getDetails().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList8, "getValuesList(...)");
                        java.util.Iterator it12 = ((java.util.ArrayList) kz5.n0.a1(keysList8, valuesList8)).iterator();
                        while (it12.hasNext()) {
                            jz5.l lVar8 = (jz5.l) it12.next();
                            jSONObject15.put((java.lang.String) lVar8.f302833d, lVar8.f302834e);
                        }
                        java.lang.String jSONObject16 = jSONObject15.toString();
                        kotlin.jvm.internal.o.f(jSONObject16, "toString(...)");
                        mJPublisherSCTaskStruct.f58747p = mJPublisherSCTaskStruct.b("Details", r26.i0.t(jSONObject16, ",", ";", false), true);
                        mJPublisherSCTaskStruct.f58748q = s0Var.getEnterScene();
                        mJPublisherSCTaskStruct.f58749r = mJPublisherSCTaskStruct.b("PostId", s0Var.getPostId(), true);
                        com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29693 MJPublisherSCTaskStruct values:\npublisherSessionID = " + mJPublisherSCTaskStruct.f58735d + "\nentryType = " + mJPublisherSCTaskStruct.f58736e + "\nmaasSDKVersion = " + mJPublisherSCTaskStruct.f58737f + "\ntaskID = " + mJPublisherSCTaskStruct.f58738g + "\ntaskName = " + mJPublisherSCTaskStruct.f58739h + "\nbeginTime = " + mJPublisherSCTaskStruct.f58740i + "\ndurationMillis = " + mJPublisherSCTaskStruct.f58741j + "\nendReason = " + mJPublisherSCTaskStruct.f58742k + "\ntemplateID = " + mJPublisherSCTaskStruct.f58743l + "\ntemplateIndex = " + mJPublisherSCTaskStruct.f58744m + "\ntemplateSelectionReason = " + mJPublisherSCTaskStruct.f58745n + "\ncameraInUse = " + mJPublisherSCTaskStruct.f58746o + "\ndetails = " + mJPublisherSCTaskStruct.f58747p + "\nenterScene = " + mJPublisherSCTaskStruct.f58748q + "\npostId = " + mJPublisherSCTaskStruct.f58749r);
                        mJPublisherSCTaskStruct.k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5 && (pBData = mJAnalyticsEvent.getPBData()) != null) {
                        try {
                            j0Var = ig.j0.parseFrom(pBData);
                        } catch (com.google.protobuf.y6 e19) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e19, "PublisherEventMetrics pb error", new java.lang.Object[0]);
                        }
                        if (j0Var != null) {
                            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                            java.util.Map l17 = kz5.c1.l(new jz5.l("view_id", j0Var.getEventName()), new jz5.l("mj_publisher_session_id", j0Var.getSessionId()), new jz5.l("entry_type", j0Var.getEntryType()), new jz5.l("maas_version", j0Var.getMaasVersion()));
                            com.google.protobuf.j9 keysList9 = j0Var.getDetails().getKeysList();
                            kotlin.jvm.internal.o.f(keysList9, "getKeysList(...)");
                            com.google.protobuf.j9 valuesList9 = j0Var.getDetails().getValuesList();
                            kotlin.jvm.internal.o.f(valuesList9, "getValuesList(...)");
                            l17.putAll(kz5.c1.q(kz5.n0.a1(keysList9, valuesList9)));
                            ((cy1.a) rVar).yj(j0Var.getEventName(), null, kz5.c1.s(l17), 6, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                java.nio.ByteBuffer pBData4 = mJAnalyticsEvent.getPBData();
                if (pBData4 != null) {
                    try {
                        j0Var2 = ig.j0.parseFrom(pBData4);
                        str10 = "Details";
                        z27 = false;
                    } catch (com.google.protobuf.y6 e27) {
                        str10 = "Details";
                        z27 = false;
                        com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e27, "PublisherEventMetrics pb error", new java.lang.Object[0]);
                    }
                    if (j0Var2 != null) {
                        com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct mJPublisherEventStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct();
                        java.lang.String sessionId3 = j0Var2.getSessionId();
                        kotlin.jvm.internal.o.f(sessionId3, "getSessionId(...)");
                        mJPublisherEventStruct.f58715d = mJPublisherEventStruct.b("PublisherSessionID", r26.i0.t(sessionId3, ",", ";", z27), true);
                        java.lang.String entryType3 = j0Var2.getEntryType();
                        kotlin.jvm.internal.o.f(entryType3, "getEntryType(...)");
                        mJPublisherEventStruct.f58716e = mJPublisherEventStruct.b("EntryType", r26.i0.t(entryType3, ",", ";", z27), true);
                        java.lang.String maasVersion3 = j0Var2.getMaasVersion();
                        kotlin.jvm.internal.o.f(maasVersion3, "getMaasVersion(...)");
                        mJPublisherEventStruct.f58717f = mJPublisherEventStruct.b("MaasSDKVersion", r26.i0.t(maasVersion3, ",", ";", z27), true);
                        java.lang.String eventName = j0Var2.getEventName();
                        kotlin.jvm.internal.o.f(eventName, "getEventName(...)");
                        mJPublisherEventStruct.f58718g = mJPublisherEventStruct.b("EventName", r26.i0.t(eventName, ",", ";", z27), true);
                        org.json.JSONObject jSONObject17 = new org.json.JSONObject();
                        com.google.protobuf.j9 keysList10 = j0Var2.getDetails().getKeysList();
                        kotlin.jvm.internal.o.f(keysList10, "getKeysList(...)");
                        com.google.protobuf.j9 valuesList10 = j0Var2.getDetails().getValuesList();
                        kotlin.jvm.internal.o.f(valuesList10, "getValuesList(...)");
                        java.util.Iterator it13 = ((java.util.ArrayList) kz5.n0.a1(keysList10, valuesList10)).iterator();
                        while (it13.hasNext()) {
                            jz5.l lVar9 = (jz5.l) it13.next();
                            jSONObject17.put((java.lang.String) lVar9.f302833d, lVar9.f302834e);
                        }
                        java.lang.String jSONObject18 = jSONObject17.toString();
                        kotlin.jvm.internal.o.f(jSONObject18, "toString(...)");
                        mJPublisherEventStruct.f58719h = mJPublisherEventStruct.b(str10, r26.i0.t(jSONObject18, ",", ";", false), true);
                        mJPublisherEventStruct.f58720i = j0Var2.getEnterScene();
                        mJPublisherEventStruct.f58721j = mJPublisherEventStruct.b("PostId", j0Var2.getPostId(), true);
                        com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + mJPublisherEventStruct.f58715d + "\nentryType = " + mJPublisherEventStruct.f58716e + "\nmaasSDKVersion = " + mJPublisherEventStruct.f58717f + "\neventName = " + mJPublisherEventStruct.f58718g + "\ndetails = " + mJPublisherEventStruct.f58719h + "\nenterScene = " + mJPublisherEventStruct.f58720i + "\npostId = " + mJPublisherEventStruct.f58721j);
                        mJPublisherEventStruct.k();
                        return;
                    }
                    return;
                }
                return;
            }
            java.nio.ByteBuffer pBData5 = mJAnalyticsEvent.getPBData();
            if (pBData5 != null) {
                try {
                    n0Var = ig.n0.parseFrom(pBData5);
                    str7 = "\nentryType = ";
                    str8 = "Details";
                    str9 = "PostId";
                    z19 = false;
                } catch (com.google.protobuf.y6 e28) {
                    str7 = "\nentryType = ";
                    str8 = "Details";
                    str9 = "PostId";
                    z19 = false;
                    com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e28, "PublisherMCTaskMetrics pb error", new java.lang.Object[0]);
                }
                if (n0Var != null) {
                    com.tencent.mm.autogen.mmdata.rpt.MJPublisherMCTaskStruct mJPublisherMCTaskStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherMCTaskStruct();
                    java.lang.String sessionId4 = n0Var.getSessionId();
                    kotlin.jvm.internal.o.f(sessionId4, "getSessionId(...)");
                    mJPublisherMCTaskStruct.f58722d = mJPublisherMCTaskStruct.b("PublisherSessionID", r26.i0.t(sessionId4, ",", ";", z19), true);
                    java.lang.String entryType4 = n0Var.getEntryType();
                    kotlin.jvm.internal.o.f(entryType4, "getEntryType(...)");
                    mJPublisherMCTaskStruct.f58723e = mJPublisherMCTaskStruct.b("EntryType", r26.i0.t(entryType4, ",", ";", z19), true);
                    java.lang.String maasVersion4 = n0Var.getMaasVersion();
                    kotlin.jvm.internal.o.f(maasVersion4, "getMaasVersion(...)");
                    mJPublisherMCTaskStruct.f58724f = mJPublisherMCTaskStruct.b("MaasSDKVersion", r26.i0.t(maasVersion4, ",", ";", z19), true);
                    java.lang.String taskId2 = n0Var.getTaskId();
                    kotlin.jvm.internal.o.f(taskId2, "getTaskId(...)");
                    mJPublisherMCTaskStruct.f58725g = mJPublisherMCTaskStruct.b("TaskID", r26.i0.t(taskId2, ",", ";", z19), true);
                    java.lang.String taskName2 = n0Var.getTaskName();
                    kotlin.jvm.internal.o.f(taskName2, "getTaskName(...)");
                    mJPublisherMCTaskStruct.f58726h = mJPublisherMCTaskStruct.b("TaskName", r26.i0.t(taskName2, ",", ";", z19), true);
                    mJPublisherMCTaskStruct.f58727i = n0Var.getBeginTimeStamp();
                    mJPublisherMCTaskStruct.f58728j = (int) n0Var.getTotalDurationMs();
                    java.lang.String endReason3 = n0Var.getEndReason();
                    kotlin.jvm.internal.o.f(endReason3, "getEndReason(...)");
                    mJPublisherMCTaskStruct.f58729k = mJPublisherMCTaskStruct.b("EndReason", r26.i0.t(endReason3, ",", ";", z19), true);
                    java.lang.String assetOriginType = n0Var.getAssetOriginType();
                    kotlin.jvm.internal.o.f(assetOriginType, "getAssetOriginType(...)");
                    mJPublisherMCTaskStruct.f58730l = mJPublisherMCTaskStruct.b("AssetOriginType", r26.i0.t(assetOriginType, ",", ";", z19), true);
                    org.json.JSONObject jSONObject19 = new org.json.JSONObject();
                    com.google.protobuf.j9 keysList11 = n0Var.getDetails().getKeysList();
                    kotlin.jvm.internal.o.f(keysList11, "getKeysList(...)");
                    com.google.protobuf.j9 valuesList11 = n0Var.getDetails().getValuesList();
                    kotlin.jvm.internal.o.f(valuesList11, "getValuesList(...)");
                    java.util.Iterator it14 = ((java.util.ArrayList) kz5.n0.a1(keysList11, valuesList11)).iterator();
                    while (it14.hasNext()) {
                        jz5.l lVar10 = (jz5.l) it14.next();
                        jSONObject19.put((java.lang.String) lVar10.f302833d, lVar10.f302834e);
                    }
                    java.lang.String jSONObject20 = jSONObject19.toString();
                    kotlin.jvm.internal.o.f(jSONObject20, "toString(...)");
                    mJPublisherMCTaskStruct.f58731m = mJPublisherMCTaskStruct.b(str8, r26.i0.t(jSONObject20, ",", ";", false), true);
                    org.json.JSONObject jSONObject21 = new org.json.JSONObject();
                    com.google.protobuf.j9 keysList12 = n0Var.getExtDetails0().getKeysList();
                    kotlin.jvm.internal.o.f(keysList12, "getKeysList(...)");
                    com.google.protobuf.j9 valuesList12 = n0Var.getExtDetails0().getValuesList();
                    kotlin.jvm.internal.o.f(valuesList12, "getValuesList(...)");
                    java.util.Iterator it15 = ((java.util.ArrayList) kz5.n0.a1(keysList12, valuesList12)).iterator();
                    while (it15.hasNext()) {
                        jz5.l lVar11 = (jz5.l) it15.next();
                        jSONObject21.put((java.lang.String) lVar11.f302833d, lVar11.f302834e);
                    }
                    java.lang.String jSONObject22 = jSONObject21.toString();
                    kotlin.jvm.internal.o.f(jSONObject22, "toString(...)");
                    mJPublisherMCTaskStruct.f58732n = mJPublisherMCTaskStruct.b("ExtDetails0", r26.i0.t(jSONObject22, ",", ";", false), true);
                    mJPublisherMCTaskStruct.f58733o = n0Var.getEnterScene();
                    mJPublisherMCTaskStruct.f58734p = mJPublisherMCTaskStruct.b(str9, n0Var.getPostId(), true);
                    com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29913 MJPublisherMCTaskStruct values:\npublisherSessionID = " + mJPublisherMCTaskStruct.f58722d + str7 + mJPublisherMCTaskStruct.f58723e + "\nmaasSDKVersion = " + mJPublisherMCTaskStruct.f58724f + "\ntaskID = " + mJPublisherMCTaskStruct.f58725g + "\ntaskName = " + mJPublisherMCTaskStruct.f58726h + "\nbeginTime = " + mJPublisherMCTaskStruct.f58727i + "\ndurationMillis = " + mJPublisherMCTaskStruct.f58728j + "\nendReason = " + mJPublisherMCTaskStruct.f58729k + "\nassetOriginType = " + mJPublisherMCTaskStruct.f58730l + "\ndetails = " + mJPublisherMCTaskStruct.f58731m + "\nextDetails0 = " + mJPublisherMCTaskStruct.f58732n + "\nenterScene = " + mJPublisherMCTaskStruct.f58733o + "\npostId = " + mJPublisherMCTaskStruct.f58734p);
                    mJPublisherMCTaskStruct.k();
                }
            }
        }
    }
}
