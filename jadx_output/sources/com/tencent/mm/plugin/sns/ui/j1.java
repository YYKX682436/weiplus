package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.k1 f169476d;

    public j1(com.tencent.mm.plugin.sns.ui.k1 k1Var) {
        this.f169476d = k1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.k1 k1Var = this.f169476d;
        if (itemId == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            java.lang.CharSequence charSequence = k1Var.f169604f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            boolean f17 = com.tencent.mm.sdk.platformtools.b0.f(charSequence);
            com.tencent.mm.plugin.sns.ui.l1 l1Var = k1Var.f169606h;
            if (f17) {
                db5.e1.T(com.tencent.mm.plugin.sns.ui.l1.a(l1Var), com.tencent.mm.plugin.sns.ui.l1.a(l1Var).getString(com.tencent.mm.R.string.f490361st));
                if (com.tencent.mm.plugin.sns.ui.k1.a(k1Var) != null) {
                    java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(com.tencent.mm.plugin.sns.storage.w2.n(com.tencent.mm.plugin.sns.ui.k1.b(k1Var).f169264d));
                    w04.a aVar = w04.a.INSTANCE;
                    java.lang.String str2 = r07 + ":" + com.tencent.mm.plugin.sns.ui.k1.a(k1Var).f373132m;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    aVar.A9(4, str2, com.tencent.mm.sdk.platformtools.t8.o0(k1Var.f169604f.toString()));
                }
            } else {
                db5.e1.T(com.tencent.mm.plugin.sns.ui.l1.a(l1Var), com.tencent.mm.plugin.sns.ui.l1.a(l1Var).getString(com.tencent.mm.R.string.f490360ss));
            }
        } else if (itemId == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseTimeLine", "del snsId:" + com.tencent.mm.plugin.sns.ui.k1.b(k1Var).f169264d + " commentId:" + com.tencent.mm.plugin.sns.ui.k1.a(k1Var));
            com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(com.tencent.mm.plugin.sns.storage.w2.n(com.tencent.mm.plugin.sns.ui.k1.b(k1Var).f169264d), com.tencent.mm.plugin.sns.storage.w2.e(com.tencent.mm.plugin.sns.ui.k1.b(k1Var).f169264d) ? 6 : 4, com.tencent.mm.plugin.sns.ui.k1.a(k1Var));
            gm0.j1.i();
            gm0.j1.n().f273288b.g(q2Var);
            com.tencent.mm.plugin.sns.ui.l1 l1Var2 = k1Var.f169606h;
            l1Var2.f169723x = db5.e1.Q(com.tencent.mm.plugin.sns.ui.l1.a(l1Var2), com.tencent.mm.plugin.sns.ui.l1.a(l1Var2).getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.sns.ui.l1.a(l1Var2).getString(com.tencent.mm.R.string.j9z), true, true, new com.tencent.mm.plugin.sns.ui.i1(this, q2Var));
            if (com.tencent.mm.plugin.sns.ui.k1.a(k1Var) != null) {
                i18 = com.tencent.mm.plugin.sns.ui.k1.a(k1Var).f373132m;
                str = com.tencent.mm.plugin.sns.ui.k1.a(k1Var).f373126d;
            } else {
                i18 = 0;
                str = "";
            }
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = com.tencent.mm.plugin.sns.ui.k1.b(k1Var).snsobj;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (snsObject != null) {
                int i19 = com.tencent.mm.sdk.platformtools.t8.D0(snsObject.Username, c01.z1.r()) ? com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r()) ? 2 : 3 : 1;
                int i27 = snsObject.CommentCount;
                int i28 = snsObject.LikeCount;
                com.tencent.mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct snsFeedOwnerDeleteCommentReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct();
                snsFeedOwnerDeleteCommentReportStruct.f60566d = snsFeedOwnerDeleteCommentReportStruct.b("PublishId", ca4.z0.s0(snsObject.Id), true);
                snsFeedOwnerDeleteCommentReportStruct.f60568f = snsFeedOwnerDeleteCommentReportStruct.b("CommentId", java.lang.String.valueOf(i18), true);
                snsFeedOwnerDeleteCommentReportStruct.f60569g = i19;
                snsFeedOwnerDeleteCommentReportStruct.f60567e = snsFeedOwnerDeleteCommentReportStruct.b("FriendUsername", str, true);
                snsFeedOwnerDeleteCommentReportStruct.f60572j = 1;
                snsFeedOwnerDeleteCommentReportStruct.f60570h = i28;
                snsFeedOwnerDeleteCommentReportStruct.f60571i = i27;
                snsFeedOwnerDeleteCommentReportStruct.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
    }
}
