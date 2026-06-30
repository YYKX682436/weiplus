package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f131977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f131978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f131979f;

    public e4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView, float f17, float f18) {
        this.f131977d = finderCollapsibleTextView;
        this.f131978e = f17;
        this.f131979f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float realCollapseTextViewRight;
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f131977d;
        finderCollapsibleTextView.setCollapseTextViewRight(this.f131979f - ((finderCollapsibleTextView.getContentTextView().getLayout().f(finderCollapsibleTextView.getContentTextView().getLayout().g(finderCollapsibleTextView.getLimitLine() - 1, Float.MAX_VALUE)) + this.f131978e) + finderCollapsibleTextView.getCollapseTextView().getPaint().measureText("…")));
        float collapseTextViewRight = finderCollapsibleTextView.getCollapseTextViewRight();
        if (0.0f >= collapseTextViewRight) {
            collapseTextViewRight = 0.0f;
        }
        finderCollapsibleTextView.setCollapseTextViewRight(collapseTextViewRight);
        android.view.ViewGroup.LayoutParams layoutParams = finderCollapsibleTextView.getCollapseTextView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (finderCollapsibleTextView.f130889n) {
            realCollapseTextViewRight = finderCollapsibleTextView.getRealCollapseTextViewRight();
            layoutParams2.setMarginEnd((int) realCollapseTextViewRight);
        } else {
            layoutParams2.setMarginEnd((int) finderCollapsibleTextView.getCollapseTextViewRight());
        }
        finderCollapsibleTextView.getCollapseTextView().setLayoutParams(layoutParams2);
        finderCollapsibleTextView.e();
    }
}
