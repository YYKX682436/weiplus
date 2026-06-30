package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.r2 f171259a = new com.tencent.mm.plugin.sns.ui.widget.r2();

    public final void a(java.util.HashMap hashMap, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEmoticonData", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        java.lang.String S0 = iEmojiInfo.S0();
        if (S0 == null) {
            S0 = "";
        }
        hashMap.put("emoticon_activityid", S0);
        java.lang.String md52 = iEmojiInfo.getMd5();
        if (md52 == null) {
            md52 = "";
        }
        hashMap.put("emoticon_md5", md52);
        java.lang.String X0 = iEmojiInfo.X0();
        if (X0 == null) {
            X0 = "";
        }
        hashMap.put("emoticon_desingerid", X0);
        java.lang.String groupId = iEmojiInfo.getGroupId();
        hashMap.put("emoticon_productid", groupId != null ? groupId : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEmoticonData", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final int b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        int i17 = context instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI ? true : context instanceof com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI ? true : context instanceof com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 ? 1 : context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI ? 3 : context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentUI ? 2 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        return i17;
    }

    public final void c(android.view.View view, java.lang.String id6, java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeCommentContentReport", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(params, "params");
        dy1.a.i(view, id6);
        dy1.a.k(view, params);
        dy1.a.l(view, 40, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeCommentContentReport", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void d(android.view.View view, java.lang.String id6, java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeCommentIconReport", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(params, "params");
        dy1.a.i(view, id6);
        dy1.a.k(view, params);
        dy1.a.l(view, 40, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeCommentIconReport", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void e(r45.l76 actionGroup, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentPostError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(actionGroup, "actionGroup");
        com.tencent.mm.autogen.mmdata.rpt.SnsCommentReportStruct snsCommentReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCommentReportStruct();
        snsCommentReportStruct.f60498d = snsCommentReportStruct.b("FeedId", ca4.z0.t0(actionGroup.f379203d), true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        int i19 = actionGroup.f379205f.f378477z;
        int i27 = i19 != 1 ? i19 != 2 ? 1 : 3 : 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        snsCommentReportStruct.f60500f = i27;
        snsCommentReportStruct.f60501g = 1;
        java.util.LinkedList SnsEmojiInfo = actionGroup.f379205f.f378474w;
        kotlin.jvm.internal.o.f(SnsEmojiInfo, "SnsEmojiInfo");
        if (!SnsEmojiInfo.isEmpty()) {
            r45.l86 l86Var = (r45.l86) actionGroup.f379205f.f378474w.getFirst();
            snsCommentReportStruct.f60503i = snsCommentReportStruct.b("EmojiMd5", l86Var.f379230d, true);
            snsCommentReportStruct.f60505k = l86Var.f379232f;
            snsCommentReportStruct.f60506l = l86Var.f379233g;
        } else {
            java.util.LinkedList SnsCommentImageInfo = actionGroup.f379205f.B;
            kotlin.jvm.internal.o.f(SnsCommentImageInfo, "SnsCommentImageInfo");
            if (!SnsCommentImageInfo.isEmpty()) {
                r45.d86 d86Var = (r45.d86) actionGroup.f379205f.B.getFirst();
                snsCommentReportStruct.f60504j = snsCommentReportStruct.b("MediaId", d86Var.f372239t, true);
                snsCommentReportStruct.f60505k = d86Var.f372228f;
                snsCommentReportStruct.f60506l = d86Var.f372229g;
            }
        }
        snsCommentReportStruct.f60502h = i17;
        snsCommentReportStruct.f60507m = i18;
        snsCommentReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentPostError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void f(java.lang.String snsId, r45.e86 comment, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentShowFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(comment, "comment");
        com.tencent.mm.autogen.mmdata.rpt.SnsCommentReportStruct snsCommentReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCommentReportStruct();
        snsCommentReportStruct.f60498d = snsCommentReportStruct.b("FeedId", snsId, true);
        snsCommentReportStruct.f60499e = snsCommentReportStruct.b("CommentId", java.lang.String.valueOf(comment.f373132m), true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        int i18 = comment.f373144y;
        int i19 = i18 != 1 ? i18 != 2 ? 1 : 3 : 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        snsCommentReportStruct.f60500f = i19;
        snsCommentReportStruct.f60501g = 2;
        java.util.LinkedList SnsEmojiInfo = comment.f373140u;
        kotlin.jvm.internal.o.f(SnsEmojiInfo, "SnsEmojiInfo");
        if (!SnsEmojiInfo.isEmpty()) {
            r45.l86 l86Var = (r45.l86) comment.f373140u.getFirst();
            snsCommentReportStruct.f60503i = snsCommentReportStruct.b("EmojiMd5", l86Var.f379230d, true);
            snsCommentReportStruct.f60505k = l86Var.f379232f;
            snsCommentReportStruct.f60506l = l86Var.f379233g;
        } else {
            java.util.LinkedList SnsCommentImageInfo = comment.A;
            kotlin.jvm.internal.o.f(SnsCommentImageInfo, "SnsCommentImageInfo");
            if (!SnsCommentImageInfo.isEmpty()) {
                r45.d86 d86Var = (r45.d86) comment.A.getFirst();
                snsCommentReportStruct.f60504j = snsCommentReportStruct.b("MediaId", d86Var.f372239t, true);
                snsCommentReportStruct.f60505k = d86Var.f372228f;
                snsCommentReportStruct.f60506l = d86Var.f372229g;
            }
        }
        snsCommentReportStruct.f60502h = i17;
        snsCommentReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentShowFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void g(java.lang.String viewId, java.lang.String eventId, java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCustomViewEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(params, "params");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, params, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCustomViewEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void h(com.tencent.mm.api.IEmojiInfo iEmojiInfo, int i17, java.lang.String feedId, java.lang.String commentId) {
        java.lang.String Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEmoticonAdd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(commentId, "commentId");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (iEmojiInfo != null) {
            f171259a.a(hashMap, iEmojiInfo);
        }
        hashMap.put("sns_scene", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        } else {
            java.lang.String snsAlbumSessionId = ca4.z0.f40071d;
            kotlin.jvm.internal.o.f(snsAlbumSessionId, "snsAlbumSessionId");
            Ni = snsAlbumSessionId.length() > 0 ? ca4.z0.f40071d : ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        }
        kotlin.jvm.internal.o.d(Ni);
        hashMap.put("sessionid_sns", Ni);
        hashMap.put("sns_cmt_id", commentId);
        hashMap.put("sns_feed_id", feedId);
        g("cmt_emo_add", "view_clk", hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEmoticonAdd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void i(java.lang.String eventId, r45.e86 snsCommentInfo, java.lang.String feedId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMsgThumbNail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(snsCommentInfo, "snsCommentInfo");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sns_cmt_type", java.lang.Integer.valueOf(snsCommentInfo.f373144y));
        hashMap.put("sns_feed_id", feedId);
        hashMap.put("sns_cmt_id", java.lang.String.valueOf(snsCommentInfo.f373132m));
        java.lang.String str = snsCommentInfo.f373130h;
        hashMap.put("sns_cmt_text_length", java.lang.Integer.valueOf(str != null ? str.length() : 0));
        g("sns_msg_thumbnail", eventId, hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMsgThumbNail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void j(java.lang.String eventId, java.lang.String snsFeedId, int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsMsg", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(snsFeedId, "snsFeedId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sns_cmt_id", java.lang.String.valueOf(i19));
        hashMap.put("sns_feed_id", snsFeedId);
        hashMap.put("msg_type", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            hashMap.put("sns_cmt_type", java.lang.Integer.valueOf(i18));
            hashMap.put("sns_cmt_text_length", java.lang.Integer.valueOf(str != null ? str.length() : 0));
        }
        g("sns_msg", eventId, hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsMsg", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void k(android.view.View contentView, android.view.View cancelView, zb4.a contentData, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(cancelView, "cancelView");
        kotlin.jvm.internal.o.g(contentData, "contentData");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_1st_select", java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (contentData.a() == 1) {
            com.tencent.mm.api.IEmojiInfo b17 = contentData.b();
            if (b17 != null) {
                hashMap.put("sns_cmt_bub_type", 1);
                f171259a.a(hashMap, b17);
            }
        } else if (contentData.a() == 2) {
            hashMap.put("sns_cmt_bub_type", 2);
            hashMap.put("emoticon_activityid", "");
            hashMap.put("emoticon_md5", "");
            hashMap.put("emoticon_desingerid", "");
            hashMap.put("emoticon_productid", "");
        }
        dy1.a.k(contentView, hashMap);
        dy1.a.k(cancelView, hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }

    public final void l(android.view.View view, java.lang.String key, java.lang.Object value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        dy1.a.j(view, key, value);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
    }
}
