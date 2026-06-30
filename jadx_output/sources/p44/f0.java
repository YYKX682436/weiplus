package p44;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView f351789d;

    public f0(com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView randomPickCardView) {
        this.f351789d = randomPickCardView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        java.lang.Object tag = view.getTag();
        p44.c0 c0Var = tag instanceof p44.c0 ? (p44.c0) tag : null;
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView randomPickCardView = this.f351789d;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e(randomPickCardView.getTAG(), "onClick, vh=null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        if (!randomPickCardView.isEnabled()) {
            com.tencent.mars.xlog.Log.e(randomPickCardView.getTAG(), "onClick, !isEnabled");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        p44.s h17 = c0Var.h();
        if (h17 != null) {
            int i17 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView.f162713p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            p44.d0 d0Var = randomPickCardView.f162722o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            if (d0Var != null) {
                d0Var.a(view, h17, c0Var.i());
            }
        } else {
            com.tencent.mars.xlog.Log.e(randomPickCardView.getTAG(), "onClick, itemData=null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
    }
}
