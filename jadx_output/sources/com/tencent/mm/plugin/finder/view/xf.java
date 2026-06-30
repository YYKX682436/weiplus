package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class xf {
    public xf(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String source, java.lang.String viewId, java.lang.String titleStr, java.lang.String subTitleStr, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, so2.j5 j5Var, com.tencent.mm.plugin.finder.view.ag reason) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        java.lang.String string;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        r45.xs2 xs2Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(titleStr, "titleStr");
        kotlin.jvm.internal.o.g(subTitleStr, "subTitleStr");
        kotlin.jvm.internal.o.g(reason, "reason");
        long j17 = (jbVar == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.getLong(3);
        java.lang.String str2 = null;
        java.lang.String str3 = jbVar != null ? jbVar.field_tipsId : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = jbVar != null ? jbVar.field_tips_uuid : null;
        if (str4 == null) {
            str4 = "";
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        java.lang.String sessionBuffer = (baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null || (feedObject4 = feedObject3.getFeedObject()) == null) ? null : feedObject4.getSessionBuffer();
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (contact = feedObject2.getContact()) != null) {
            str2 = contact.getUsername();
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[12];
        lVarArr[0] = new jz5.l("finder_tab_context_id", (qt2Var == null || (string = qt2Var.getString(2)) == null) ? "" : string);
        if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[4] = new jz5.l("session_buffer", sessionBuffer == null ? "" : sessionBuffer);
        lVarArr[5] = new jz5.l("finder_username", str2 == null ? "" : str2);
        lVarArr[6] = new jz5.l("notice_feedid", pm0.v.u(j17));
        lVarArr[7] = new jz5.l("notice_title", titleStr);
        lVarArr[8] = new jz5.l("notice_subtitle", subTitleStr);
        lVarArr[9] = new jz5.l("notice_unexp_reason", java.lang.Integer.valueOf(reason.f131647d));
        lVarArr[10] = new jz5.l("notice_tipsid", str3);
        lVarArr[11] = new jz5.l("notice_tipsuuid", str4);
        java.lang.String str5 = sessionBuffer;
        ((cy1.a) rVar).Bj(viewId, "view_unexp", kz5.c1.k(lVarArr), 1, false);
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("FinderPopupBubbleView", source + " reportUnexpose viewId=" + viewId + ", titleStr=" + titleStr + ", subTitleStr=" + subTitleStr + ", reason=" + reason + ",username=" + str2 + ",sessionBuffer=" + str5);
        }
    }
}
