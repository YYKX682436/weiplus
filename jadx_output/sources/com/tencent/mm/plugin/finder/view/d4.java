package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f131875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f131876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f131877f;

    public d4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView, float f17, float f18) {
        this.f131875d = finderCollapsibleTextView;
        this.f131876e = f17;
        this.f131877f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float realCollapseTextViewRight;
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f131875d;
        if (finderCollapsibleTextView.getContentTextView().getLayout().d() < finderCollapsibleTextView.getLimitLine()) {
            finderCollapsibleTextView.getContentTextView().setEnableFade(false);
            return;
        }
        float f17 = finderCollapsibleTextView.getContentTextView().getLayout().f(finderCollapsibleTextView.getContentTextView().getLayout().g(finderCollapsibleTextView.getLimitLine() - 1, Float.MAX_VALUE));
        float drawSize = finderCollapsibleTextView.getContentTextView().getDrawSize();
        if (f17 < drawSize) {
            f17 = drawSize;
        }
        float a17 = finderCollapsibleTextView.getContentTextView().getLayout().a(finderCollapsibleTextView.getLimitLine() - 1);
        float e17 = finderCollapsibleTextView.getContentTextView().getLayout().e(finderCollapsibleTextView.getLimitLine() - 1);
        if (e17 == -1.0f) {
            e17 = finderCollapsibleTextView.getCollapseTextView().getBottom();
            a17 = finderCollapsibleTextView.getCollapseTextView().getTop();
        }
        float f18 = this.f131876e;
        float f19 = this.f131877f;
        if (f18 > 0.0f) {
            float f27 = f18 - f19;
            if (f17 > f27) {
                f17 = f27;
            }
        }
        finderCollapsibleTextView.getContentTextView().setEnableFade(true);
        boolean z17 = finderCollapsibleTextView.f130889n;
        if (z17) {
            com.tencent.mm.plugin.finder.view.FadeNeatTextView contentTextView = finderCollapsibleTextView.getContentTextView();
            contentTextView.f130851y0.set(finderCollapsibleTextView.getCollapseTextViewAlwaysAlignRight() ? (f18 - f19) - finderCollapsibleTextView.getContentTextView().getDrawSize() : f17 - finderCollapsibleTextView.getContentTextView().getDrawSize(), a17, f18, e17);
            if (contentTextView.enableFade) {
                contentTextView.postInvalidate();
            }
        } else {
            com.tencent.mm.plugin.finder.view.FadeNeatTextView contentTextView2 = finderCollapsibleTextView.getContentTextView();
            contentTextView2.f130851y0.set(f17 - finderCollapsibleTextView.getContentTextView().getDrawSize(), a17, f18, e17);
            if (contentTextView2.enableFade) {
                contentTextView2.postInvalidate();
            }
        }
        finderCollapsibleTextView.setCollapseTextViewRight((f18 - f17) - f19);
        float collapseTextViewRight = finderCollapsibleTextView.getCollapseTextViewRight();
        finderCollapsibleTextView.setCollapseTextViewRight(0.0f < collapseTextViewRight ? collapseTextViewRight : 0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = finderCollapsibleTextView.getCollapseTextView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (z17) {
            realCollapseTextViewRight = finderCollapsibleTextView.getRealCollapseTextViewRight();
            layoutParams2.setMarginEnd((int) realCollapseTextViewRight);
        } else {
            layoutParams2.setMarginEnd((int) finderCollapsibleTextView.getCollapseTextViewRight());
        }
        finderCollapsibleTextView.getCollapseTextView().setLayoutParams(layoutParams2);
        finderCollapsibleTextView.getCollapseTextView().setPadding((int) finderCollapsibleTextView.getContentTextView().getDrawSize(), 0, 0, 0);
        finderCollapsibleTextView.e();
    }
}
