package tc4;

/* loaded from: classes4.dex */
public abstract class k2 extends uc4.f1 implements tc4.v3, tc4.u3, tc4.w3, tc4.e, tc4.d, tc4.k3, tc4.s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void O(java.lang.String str) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        if (!r26.n0.B(str, n17.a1(), false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        com.tencent.mm.plugin.sns.model.s6.k(str, 2);
        int L = L(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "unTranslateComment, id:" + str + " position:" + L);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout commentView = getCommentView();
        if (commentView != null) {
            commentView.i(L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
    }

    private final void P(java.lang.String str) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        if (!kotlin.jvm.internal.o.b(n17.e1(), str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "unTranslatePostDesc, id:" + str + '-' + n17.a1());
        com.tencent.mm.plugin.sns.model.s6.k(str, 2);
        getContentText().j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
    }

    public final int L(java.lang.String str) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return -1;
        }
        java.lang.String str2 = (java.lang.String) r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).get(1);
        int i17 = 0;
        for (java.lang.Object obj : n17.getCommentList()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.e86 e86Var = (r45.e86) obj;
            int i19 = e86Var.f373132m;
            if (kotlin.jvm.internal.o.b((i19 != 0 ? java.lang.Integer.valueOf(i19) : java.lang.Long.valueOf(e86Var.f373137r)).toString(), str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                return i17;
            }
            i17 = i18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return -1;
    }

    public boolean M(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event) {
        zc4.b data;
        xc4.p n17;
        r45.e86 e86Var;
        xc4.p n18;
        xc4.p n19;
        xc4.p n27;
        xc4.p n28;
        xc4.p n29;
        xc4.p n37;
        xc4.p n38;
        com.tencent.mm.plugin.sns.storage.SnsInfo c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeTransCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTranslateListener >> ");
        am.z1 z1Var = event.f54035g;
        sb6.append(z1Var.f8502a);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", sb6.toString());
        java.lang.String str = z1Var.f8502a;
        if (!(str == null || str.length() == 0)) {
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = null;
            if (r26.i0.y(str, "sns_content_", false)) {
                java.lang.String t17 = r26.i0.t(str, "sns_content_", "", false);
                zc4.b data2 = getData();
                if (kotlin.jvm.internal.o.b((data2 == null || (n38 = data2.n()) == null || (c17 = n38.c1()) == null) ? null : c17.getSnsId(), t17)) {
                    P(t17);
                    zc4.b data3 = getData();
                    if (data3 != null && (n37 = data3.n()) != null) {
                        snsInfo = n37.c1();
                    }
                    com.tencent.mm.plugin.sns.model.s6.m(snsInfo);
                }
            } else if (r26.i0.y(str, "sns_comment_", false) && (data = getData()) != null && (n17 = data.n()) != null && r26.n0.B(str, n17.a1(), false)) {
                java.lang.String t18 = r26.i0.t(str, "sns_comment_", "", false);
                O(t18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                zc4.b data4 = getData();
                if (data4 == null || (n29 = data4.n()) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                } else {
                    java.lang.String str2 = (java.lang.String) r26.n0.f0(t18, new java.lang.String[]{";"}, false, 0, 6, null).get(1);
                    int i17 = 0;
                    for (java.lang.Object obj : n29.getCommentList()) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.e86 e86Var2 = (r45.e86) obj;
                        int i19 = e86Var2.f373132m;
                        if (kotlin.jvm.internal.o.b((i19 != 0 ? java.lang.Integer.valueOf(i19) : java.lang.Long.valueOf(e86Var2.f373137r)).toString(), str2)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            e86Var = e86Var2;
                            break;
                        }
                        i17 = i18;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                }
                e86Var = null;
                if (e86Var != null) {
                    zc4.b data5 = getData();
                    if (((data5 == null || (n28 = data5.n()) == null) ? null : n28.c1()) != null) {
                        zc4.b data6 = getData();
                        com.tencent.mm.plugin.sns.storage.SnsInfo c18 = (data6 == null || (n27 = data6.n()) == null) ? null : n27.c1();
                        kotlin.jvm.internal.o.d(c18);
                        java.lang.String t07 = ca4.z0.t0(c18.field_snsId);
                        java.lang.String str3 = e86Var.f373130h;
                        zc4.b data7 = getData();
                        com.tencent.mm.plugin.sns.storage.SnsInfo c19 = (data7 == null || (n19 = data7.n()) == null) ? null : n19.c1();
                        kotlin.jvm.internal.o.d(c19);
                        java.lang.String str4 = c19.field_userName;
                        zc4.b data8 = getData();
                        if (data8 != null && (n18 = data8.n()) != null) {
                            snsInfo = n18.c1();
                        }
                        kotlin.jvm.internal.o.d(snsInfo);
                        com.tencent.mm.plugin.sns.model.s6.l(new com.tencent.mm.plugin.sns.ui.u1(null, t07, e86Var, null, str3, null, 1, str4, snsInfo.getTimeLine().Id));
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeTransCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return false;
    }

    public boolean N(com.tencent.mm.autogen.events.SnsUnTranslateEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTansCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        kotlin.jvm.internal.o.g(event, "event");
        am.gx gxVar = event.f54850g;
        java.lang.String str = gxVar.f6797b;
        int i17 = gxVar.f6796a;
        if (i17 == 1) {
            kotlin.jvm.internal.o.d(str);
            P(str);
        } else if (i17 == 2) {
            O(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTansCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return false;
    }
}
