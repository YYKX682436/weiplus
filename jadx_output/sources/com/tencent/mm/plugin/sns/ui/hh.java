package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class hh extends kotlin.jvm.internal.m implements yz5.p {
    public hh(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.class, "openCommentInputFooter", "openCommentInputFooter(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/SnsFeedComment;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        androidx.lifecycle.c1 a17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        android.view.View view = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.ei p17 = (com.tencent.mm.plugin.sns.ui.ei) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = (com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) this.receiver;
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (view != null) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            xc4.p Y6 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Y6(p17.b().field_snsId);
            if (Y6 != null) {
                androidx.appcompat.app.AppCompatActivity context = snsCommentImageFlowUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.sns.ui.improve.component.t tVar = (com.tencent.mm.plugin.sns.ui.improve.component.t) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.sns.ui.improve.component.t.class);
                r45.e86 comment = p17.a();
                tVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                kotlin.jvm.internal.o.g(comment, "comment");
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentInputUIC", "replayComment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.lang.Object value = ((jz5.n) tVar.f168994g).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.lang.String str = tVar.getContext().getString(com.tencent.mm.R.string.f493233je0) + ca4.z0.y(comment, (com.tencent.mm.storage.e8) value);
                java.lang.String str2 = Y6.a1() + str;
                tVar.f168996i = str2;
                tVar.P6().setTag(Y6.c1());
                tVar.P6().setVisibility(0);
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter P6 = tVar.P6();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.util.Iterator it = tVar.f168995h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = 0;
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(t1Var.f170493a, str2)) {
                        i17 = t1Var.f170495c;
                        break;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                P6.H(i17);
                tVar.P6().setCommentHint(str + tVar.getContext().getString(com.tencent.mm.R.string.j8z));
                tVar.P6().setSnsInfo(Y6.c1());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                if ((Y6.h1().ContentObj.f369841i & 128) != 0) {
                    tVar.P6().setFeedEmojiCommentEnable(false);
                } else {
                    tVar.P6().setFeedEmojiCommentEnable(true);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                tVar.P6().setCommentInfo(comment);
                tVar.P6().N(com.tencent.mm.plugin.sns.ui.l1.A, str2);
                tVar.P6().post(new com.tencent.mm.plugin.sns.ui.improve.component.q(tVar));
                tVar.P6().O(false);
                tVar.P6().setOutsideScrollView(view);
                tVar.P6().setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.improve.component.r(tVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        return f0Var;
    }
}
