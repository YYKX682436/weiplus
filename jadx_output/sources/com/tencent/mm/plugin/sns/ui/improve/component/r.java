package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class r implements com.tencent.mm.plugin.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.t f168983a;

    public r(com.tencent.mm.plugin.sns.ui.improve.component.t tVar) {
        this.f168983a = tVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.dg
    public final void a(zb4.a aVar) {
        r45.e86 r17;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$2");
        com.tencent.mm.plugin.sns.ui.improve.component.t tVar = this.f168983a;
        kotlin.jvm.internal.o.d(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        java.lang.Object tag = tVar.P6().getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) tag;
        if (aVar.f()) {
            java.lang.String d17 = aVar.d();
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.k(ca4.z0.t0(snsInfo.field_snsId));
            dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            kotlin.jvm.internal.o.f(t07, "longToString(...)");
            ((zy1.f) sVar).Di(12076, "CommentOrLikeFeedCount", t07);
            dy1.s sVar2 = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t08 = ca4.z0.t0(snsInfo.field_snsId);
            kotlin.jvm.internal.o.f(t08, "longToString(...)");
            ((zy1.f) sVar2).Di(12076, "comment_feed_count", t08);
            int commentFlag = tVar.P6().getCommentFlag();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentInputUIC", "onCommentSend click %s", java.lang.Integer.valueOf(commentFlag));
            if (com.tencent.mm.plugin.sns.ui.widget.t2.i(commentFlag, 8)) {
                kotlin.jvm.internal.o.d(d17);
                java.lang.String substring = d17.substring(tVar.P6().getCommentAtPrefix().length());
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                aVar.i(substring);
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentInputUIC", "send atFriend ad timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, 16, aVar, tVar.P6().getCommentInfo(), true, commentFlag, 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentInputUIC", "send timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, snsInfo.isAd() ? 8 : 2, aVar, tVar.P6().getCommentInfo(), true, commentFlag, 0);
            }
            r45.e86 e86Var = r17;
            tVar.R6();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).k7(snsInfo.field_snsId, e86Var);
            com.tencent.mm.plugin.sns.ui.improve.component.k kVar = tVar.f168991d;
            if (kVar != null) {
                java.lang.String snsId = snsInfo.getSnsId();
                kotlin.jvm.internal.o.f(snsId, "getSnsId(...)");
                kotlin.jvm.internal.o.d(e86Var);
                com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = (com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) kVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSendCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(snsCommentImageFlowUI);
                e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                e4Var.f211776c = snsCommentImageFlowUI.getString(com.tencent.mm.R.string.f493853pd1);
                e4Var.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                ta4.t tVar2 = new ta4.t();
                com.tencent.mm.plugin.sns.ui.nh nhVar = snsCommentImageFlowUI.X;
                if (nhVar == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = nhVar.f169994e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                tVar2.c(snsInfo2);
                tVar2.b(e86Var);
                tVar2.d(snsCommentImageFlowUI.F1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
                java.util.Map e17 = tVar2.e();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                if (rVar != null) {
                    tVar2.a();
                    ((cy1.a) rVar).Ej("cmt_big_pic_reply", e17, 36244);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                com.tencent.mm.plugin.sns.ui.nh nhVar2 = snsCommentImageFlowUI.X;
                if (nhVar2 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                if (kotlin.jvm.internal.o.b(snsId, nhVar2.P6())) {
                    if (e86Var.f373145z > 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                        android.content.Context context = nhVar2.f169997h;
                        if (context == null) {
                            kotlin.jvm.internal.o.o("context");
                            throw null;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = nhVar2.f169994e;
                        if (snsInfo3 == null) {
                            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("Required value was null.".toString());
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                            throw illegalArgumentException;
                        }
                        com.tencent.mm.plugin.sns.ui.n4 n4Var = nhVar2.f169999m;
                        if (n4Var == null) {
                            kotlin.jvm.internal.o.o("galleryTitleM");
                            throw null;
                        }
                        com.tencent.mm.plugin.sns.ui.ei eiVar = new com.tencent.mm.plugin.sns.ui.ei(context, snsInfo3, snsId, e86Var, n4Var, nhVar2.f170000n);
                        nhVar2.f170001o.add(eiVar);
                        ((kotlinx.coroutines.flow.q2) nhVar2.f170002p).e(new jz5.l(eiVar, java.lang.Integer.valueOf(r2.size() - 1)));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSendCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(tVar.f168996i)) {
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.l1.A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                    if (kotlin.jvm.internal.o.b(tVar.f168996i, t1Var.f170493a)) {
                        ((java.util.LinkedList) com.tencent.mm.plugin.sns.ui.l1.A).remove(t1Var);
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.CommentInputUIC", "onCommentSend contentData is Invalid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$2");
    }
}
