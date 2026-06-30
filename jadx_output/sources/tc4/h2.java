package tc4;

/* loaded from: classes4.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f417354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.i2 f417356f;

    public h2(android.view.View view, xc4.p pVar, tc4.i2 i2Var) {
        this.f417354d = view;
        this.f417355e = pVar;
        this.f417356f = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$updateBottomLine$$inlined$doOnPreDraw$1");
        xc4.p pVar = this.f417355e;
        if (!android.text.TextUtils.isEmpty(pVar.I0())) {
            tc4.i2 i2Var = this.f417356f;
            if (i2Var.getAddressStub() instanceof android.widget.TextView) {
                android.view.View addressStub = i2Var.getAddressStub();
                kotlin.jvm.internal.o.e(addressStub, "null cannot be cast to non-null type android.widget.TextView");
                android.widget.TextView textView = (android.widget.TextView) addressStub;
                int width = i2Var.getSubLayout().getWidth();
                if (width <= 0) {
                    i2Var.w("MicroMsg.Improve.TimelineItemMeasure", "updateBottomLine: failed");
                } else {
                    android.widget.TextView publishTimeText = i2Var.getPublishTimeText();
                    int width2 = width - (publishTimeText != null ? publishTimeText.getWidth() : 0);
                    android.view.ViewGroup.LayoutParams layoutParams = i2Var.getAddressStub().getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i17 = width2 - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    boolean z17 = pVar.d1().InTopList == 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    if (z17) {
                        int width3 = i17 - i2Var.getStarIconStub().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams2 = i2Var.getStarIconStub().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        i17 = width3 - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                    }
                    if (kotlin.jvm.internal.o.b(pVar.Z0(), java.lang.Boolean.TRUE)) {
                        int width4 = i17 - i2Var.getGroupImageStub().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams3 = i2Var.getGroupImageStub().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        i17 = width4 - (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
                    }
                    if (pVar.l1()) {
                        int width5 = i17 - i2Var.getDelIconStub().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams4 = i2Var.getDelIconStub().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        i17 = width5 - (marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0);
                    }
                    textView.setMaxWidth(i17);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$updateBottomLine$$inlined$doOnPreDraw$1");
    }
}
