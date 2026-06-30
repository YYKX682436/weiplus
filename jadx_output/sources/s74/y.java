package s74;

/* loaded from: classes4.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404602e;

    public y(s74.o0 o0Var, android.view.View view) {
        this.f404601d = o0Var;
        this.f404602e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.google.android.flexbox.FlexboxLayout k17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f404601d;
        s74.f3 D = o0Var.D();
        if (D != null && (k17 = D.k()) != null) {
            if (k17.getChildCount() > 0) {
                com.tencent.mars.xlog.Log.i(o0Var.j(), "on gridElementClick");
                android.view.View childAt = k17.getChildAt(0);
                int i17 = w64.x.f443338a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                android.view.View view2 = this.f404602e;
                java.lang.Object tag = view2 != null ? view2.getTag(com.tencent.mm.R.id.ptl) : null;
                w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                if (childAt != null) {
                    childAt.setTag(com.tencent.mm.R.id.ptl, xVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                if (childAt != null) {
                    childAt.setTag(com.tencent.mm.R.id.mhg, java.lang.Boolean.TRUE);
                    childAt.performClick();
                }
            } else {
                com.tencent.mars.xlog.Log.e(o0Var.j(), "gridElementClick, empty gridElementContainer");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$10");
    }
}
