package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class hg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kg f168504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f168505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ei f168506f;

    public hg(com.tencent.mm.plugin.sns.ui.kg kgVar, in5.s0 s0Var, com.tencent.mm.plugin.sns.ui.ei eiVar) {
        this.f168504d = kgVar;
        this.f168505e = s0Var;
        this.f168506f = eiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert$bindCommentContentText$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowConvert$bindCommentContentText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View itemView = this.f168505e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleCommentContentTvClickEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.kg kgVar = this.f168504d;
        kgVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleCommentContentTvClickEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.ei eiVar = this.f168506f;
        if (com.tencent.mm.plugin.sns.ui.widget.t2.l(eiVar.a().f373126d)) {
            kgVar.f169632f.invoke(eiVar);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicTxtEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
            ta4.t tVar = new ta4.t();
            tVar.c(eiVar.b());
            tVar.b(eiVar.a());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            tVar.d(eiVar.f168246i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicTxtEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map t17 = kz5.c1.t(tVar.e());
            t17.put("view_id", "cmt_big_pic_txt");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                tVar.a();
                ((cy1.a) rVar).Ej("view_clk", t17, 36244);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicTxtEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicTxtEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
            kgVar.f169631e.invoke(itemView, eiVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCommentContentTvClickEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleCommentContentTvClickEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowConvert$bindCommentContentText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert$bindCommentContentText$3");
    }
}
