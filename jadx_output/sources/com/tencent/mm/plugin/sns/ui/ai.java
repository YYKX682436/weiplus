package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ai {
    public ai(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = snsInfo.getTimeLine().ContentObj;
        if (((a90Var == null || (linkedList2 = a90Var.f369840h) == null) ? 0 : linkedList2.size()) <= i17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsEcsUploadHelper", "bindCommentDetailEcsMediaFeedReportInfo remove bind esc report " + view.hashCode());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var2 = snsInfo.getTimeLine().ContentObj;
        r45.jj4 jj4Var = (a90Var2 == null || (linkedList = a90Var2.f369840h) == null) ? null : (r45.jj4) linkedList.get(i17);
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.h96 h96Var = jj4Var.f377876x0;
        g(view, h96Var != null ? h96Var.f375968g : null, snsInfo.getUserName(), ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void b(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = snsInfo.getTimeLine().ContentObj;
        r45.lh0 lh0Var = a90Var != null ? a90Var.F : null;
        if (lh0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_feed_id", ca4.z0.t0(snsInfo.field_snsId)), new jz5.l("sns_scene", 3), new jz5.l("sns_goods_name", lh0Var.f379474e), new jz5.l("sns_goods_id", lh0Var.f379475f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_goods_video_btn");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void c(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.lh0 lh0Var = snsInfo.getTimeLine().ContentObj.F;
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_objecttype", java.lang.Integer.valueOf(snsInfo.getTimeLine().ContentObj.f369837e)), new jz5.l("username_sns", snsInfo.getUserName()), new jz5.l("publishid_sns", ca4.z0.t0(snsInfo.field_snsId)), new jz5.l("sns_feed_source", 4), new jz5.l("feed_tail_url", lh0Var.f379476g), new jz5.l("feed_tail_txt", lh0Var.f379474e), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("sns_goods_name", lh0Var.f379474e), new jz5.l("sns_goods_id", lh0Var.f379475f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()), new jz5.l("ecs_report_data", lh0Var.f379478i));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_feed_tail");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void d(android.view.View view, int i17, xc4.p pVar) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = pVar.h1().ContentObj;
        if (((a90Var == null || (linkedList2 = a90Var.f369840h) == null) ? 0 : linkedList2.size()) <= i17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsEcsUploadHelper", "bindTimelineEcsImageFeedReportInfo remove bind esc report " + view.hashCode());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var2 = pVar.h1().ContentObj;
        r45.jj4 jj4Var = (a90Var2 == null || (linkedList = a90Var2.f369840h) == null) ? null : (r45.jj4) linkedList.get(i17);
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.h96 h96Var = jj4Var.f377876x0;
        g(view, h96Var != null ? h96Var.f375968g : null, pVar.getUserName(), pVar.a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void e(android.view.View view, xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = pVar.h1().ContentObj;
        r45.lh0 lh0Var = a90Var != null ? a90Var.F : null;
        if (lh0Var == null) {
            view.hashCode();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
        } else {
            view.hashCode();
            java.util.Map k17 = kz5.c1.k(new jz5.l("sns_feed_id", pVar.a1()), new jz5.l("sns_scene", 1), new jz5.l("sns_goods_name", lh0Var.f379474e), new jz5.l("sns_goods_id", lh0Var.f379475f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "sns_goods_video_btn");
            aVar.gk(view, k17);
            aVar.ik(view, 40, 33050);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void f(android.view.View view, int i17, r45.lh0 lh0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        if (lh0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_objecttype", java.lang.Integer.valueOf(i17)), new jz5.l("username_sns", (java.lang.String) l17), new jz5.l("publishid_sns", ""), new jz5.l("sns_feed_source", 4), new jz5.l("feed_tail_url", lh0Var.f379476g), new jz5.l("feed_tail_txt", lh0Var.f379474e), new jz5.l("sns_scene", 4), new jz5.l("sns_goods_name", lh0Var.f379474e), new jz5.l("sns_goods_id", lh0Var.f379475f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_feed_tail");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void g(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        if (str3 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            view.hashCode();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
        } else {
            java.util.Map l17 = kz5.c1.l(new jz5.l("card_id", str3), new jz5.l("shareUsername", str2), new jz5.l("biz_report_data", str), new jz5.l("share_scene", "3"));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "ecs_card_action");
            aVar.gk(view, l17);
            aVar.Tj(view, 40, 12, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final r45.h96 h(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(intent, "intent");
        byte[] d17 = com.tencent.mm.sdk.platformtools.c2.d(intent, "sns_ecs_share_info");
        if (d17 != null) {
            if (!(d17.length == 0)) {
                try {
                    r45.lh0 lh0Var = new r45.lh0();
                    lh0Var.parseFrom(d17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(lh0Var.f379475f)) {
                        r45.h96 h96Var = new r45.h96();
                        h96Var.f375965d = lh0Var.f379475f;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
                        return h96Var;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsEcsUploadHelper", "initSnsMediaEcsInfoByIntent exp:%s", e17.getLocalizedMessage());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
                return null;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsEcsUploadHelper", "initSnsMediaEcsInfoByIntent invalid KEcsShareInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        return null;
    }

    public final java.util.HashMap i(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sns_ecs_share_media_info_json_array");
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            com.tencent.mars.xlog.Log.e("MultiPicModelPc", "initSnsMediaEcsInfoByIntent invalid KEcsShareMediaInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return null;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            cl0.e eVar = new cl0.e(l17);
            int length = eVar.length();
            for (int i17 = 0; i17 < length; i17++) {
                cl0.g jSONObject = eVar.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString("localPath");
                r45.h96 h96Var = new r45.h96();
                int i18 = 1;
                h96Var.f375966e = jSONObject.optInt("bizType", 1);
                h96Var.f375967f = jSONObject.optString("ecsJumpInfoBase64");
                h96Var.f375968g = jSONObject.optString("reportData");
                if (!jSONObject.optBoolean("showDetailBtn")) {
                    i18 = 0;
                }
                h96Var.f375969h = i18;
                hashMap.put(optString, h96Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return hashMap;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MultiPicModelPc", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return null;
        }
    }
}
