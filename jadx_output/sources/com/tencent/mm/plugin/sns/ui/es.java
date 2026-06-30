package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class es implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f168261d;

    public es(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f168261d = bsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a84.r0 r0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f168261d;
        com.tencent.mm.plugin.sns.ui.l1 l1Var = bsVar.f168036b;
        l1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        l1Var.f169705f = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        android.view.View view2 = bsVar.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (view2 == view) {
            bsVar.p();
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar.E = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        bsVar.D = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        int i17 = com.tencent.mm.plugin.sns.abtest.a.f162563a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
        com.tencent.mm.ui.MMActivity mMActivity = bsVar.f168042h;
        if (timeLineObject != null && timeLineObject.ContentObj.f369837e == 21) {
            r45.kj4 kj4Var = baseViewHolder.f169273h0;
            if (!c01.z1.r().equals(baseViewHolder.timeLineObject.UserName) && (kj4Var == null || kj4Var.D == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix showTipsDialog.");
                ja4.d.a(mMActivity, baseViewHolder.T.g(0));
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
                return;
            }
        }
        if (baseViewHolder.isAd) {
            java.lang.String str = baseViewHolder.f169268f;
            i64.b1 b1Var = bsVar.f168036b.f169702c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            try {
                r0Var = j74.b.c(com.tencent.mm.plugin.sns.model.l4.Fj().k1(str), true, view, b1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                r0Var = null;
            }
            a84.t0.a(r0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.r4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix addCommentView.");
            ((com.tencent.mm.plugin.sns.ui.r4) mMActivity).L5(view);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.tencent.mm.plugin.sns.ui.r4 r4Var = bsVar.f168059y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (r4Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                com.tencent.mm.plugin.sns.ui.r4 r4Var2 = bsVar.f168059y;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                r4Var2.L5(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
    }
}
