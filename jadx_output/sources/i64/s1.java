package i64;

/* loaded from: classes4.dex */
public abstract class s1 {
    public static void a(i64.o1 o1Var, i64.n1 n1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f369837e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f369837e == 18)) {
            if (snsInfo.isAd() && timeLine.ContentObj.f369837e == 15) {
                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = i17 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                if (atAdInfo != null) {
                    timeLine.streamvideo.f386385m = atAdInfo.uxInfo;
                }
                timeLine.streamvideo.f386386n = timeLine.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", timeLine.streamvideo.f386386n + ",");
            xVar.a("21uxinfo", timeLine.streamvideo.f386385m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            xVar.a("23video_statu", ",");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(timeLine.ContentObj.f369837e == 15 ? 1 : 2);
            sb7.append(",");
            xVar.a("24source_type", sb7.toString());
            xVar.a("25scene", o1Var.f289269d + ",");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            i64.n1 n1Var2 = i64.n1.PlayIcon;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            int i18 = n1Var.f289256d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            sb8.append(i18);
            sb8.append(",");
            xVar.a("26action_type", sb8.toString());
            xVar.a("27scene_chatname", ",");
            xVar.a("28scene_username", timeLine.UserName + ",");
            xVar.a("29curr_publishid", timeLine.Id + ",");
            xVar.a("30curr_msgid", "0,");
            xVar.a("31curr_favid", "0,");
            xVar.a("32elapsed_time", "0,");
            xVar.a("33load_time", "0,");
            xVar.a("34is_load_complete", "0,");
            xVar.a("35destination", "0,");
            xVar.a("36chatroom_membercount", "0,");
            com.tencent.mm.modelstat.k0.a(timeLine.statExtStr, xVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + xVar.c());
            ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void b(i64.n1 n1Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        xVar.a("24source_type", i17 + ",");
        xVar.a("25scene", i18 + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        i64.n1 n1Var2 = i64.n1.PlayIcon;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        int i28 = n1Var.f289256d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        sb7.append(i28);
        sb7.append(",");
        xVar.a("26action_type", sb7.toString());
        xVar.a("27scene_chatname", str4 + ",");
        xVar.a("28scene_username", str3 + ",");
        xVar.a("29curr_publishid", str5 + ",");
        xVar.a("30curr_msgid", j17 + ",");
        xVar.a("31curr_favid", i19 + ",");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        xVar.a("36chatroom_membercount", i27 + ",");
        i64.q0.c(str5, xVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + xVar.c());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12990, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f369837e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f369837e == 18)) {
            int i18 = 2;
            if (snsInfo.isAd() && timeLine.ContentObj.f369837e == 15) {
                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = i17 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                r45.tf6 tf6Var = timeLine.streamvideo;
                tf6Var.f386385m = atAdInfo.uxInfo;
                tf6Var.f386386n = timeLine.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", timeLine.streamvideo.f386386n + ",");
            xVar.a("21uxinfo", timeLine.streamvideo.f386385m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(timeLine.ContentObj.f369837e == 15 ? 1 : 2);
            sb7.append(",");
            xVar.a("23souce_type", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            if (z17) {
                i18 = 6;
            } else if (timeLine.ContentObj.f369837e == 15) {
                i18 = 1;
            }
            sb8.append(i18);
            sb8.append(",");
            xVar.a("24scene", sb8.toString());
            xVar.a("25scene_chatname", ",");
            xVar.a("26scene_username", timeLine.UserName + ",");
            xVar.a("27curr_publishid", timeLine.Id + ",");
            xVar.a("28curr_msgid", ",");
            xVar.a("29curr_favid", "0,");
            xVar.a("30isdownload", (z18 ? 1 : 0) + ",");
            xVar.a("31chatroom_membercount", "0,");
            com.tencent.mm.modelstat.k0.a(timeLine.statExtStr, xVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + xVar.c());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12989, xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void d(i64.q1 q1Var, i64.p1 p1Var, i64.r1 r1Var, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f369837e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f369837e == 18)) {
            if (snsInfo.isAd() && timeLine.ContentObj.f369837e == 15) {
                if ((i18 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo()) != null) {
                    timeLine.streamvideo.f386385m = snsInfo.getAdInfo().uxInfo;
                }
                timeLine.streamvideo.f386386n = timeLine.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", timeLine.streamvideo.f386386n + ",");
            xVar.a("21uxinfo", timeLine.streamvideo.f386385m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            i64.r1 r1Var2 = i64.r1.Samll;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            int i19 = r1Var.f289305d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            sb7.append(i19);
            sb7.append(",");
            xVar.a("23video_statu", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(timeLine.ContentObj.f369837e == 15 ? 1 : 2);
            sb8.append(",");
            xVar.a("24source_type", sb8.toString());
            xVar.a("25scene", q1Var.f289296d + ",");
            xVar.a("26action_type", p1Var.f289286d + ",");
            xVar.a("27scene_chatname", ",");
            xVar.a("28scene_username", timeLine.UserName + ",");
            xVar.a("29curr_publishid", timeLine.Id + ",");
            xVar.a("30curr_msgid", "0,");
            xVar.a("31curr_favid", "0,");
            xVar.a("32chatroom_membercount", "0,");
            xVar.a("33chatroom_toMemberCount", i17 + ",");
            com.tencent.mm.modelstat.k0.a(timeLine.statExtStr, xVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + xVar.c());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12991, xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void e(i64.p1 p1Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i19, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", "3,");
        xVar.a("24source_type", i17 + ",");
        xVar.a("25scene", i18 + ",");
        xVar.a("26action_type", p1Var.f289286d + ",");
        xVar.a("27scene_chatname", str4 + ",");
        xVar.a("28scene_username", str3 + ",");
        xVar.a("29curr_publishid", str5 + ",");
        xVar.a("30curr_msgid", j17 + ",");
        xVar.a("31curr_favid", i19 + ",");
        xVar.a("32chatroom_membercount", i27 + ",");
        xVar.a("33chatroom_toMemberCount", i28 + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report snsad_video_spread: ");
        sb7.append(xVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoStatistic", sb7.toString());
        i64.q0.c(str5, xVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12991, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }
}
