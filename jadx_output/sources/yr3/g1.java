package yr3;

/* loaded from: classes11.dex */
public final class g1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.h1 f464831d;

    public g1(yr3.h1 h1Var) {
        this.f464831d = h1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        yr3.h1 h1Var = this.f464831d;
        h1Var.f464847p.f464801f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = h1Var.f464847p.f464801f.getHeight();
        int height2 = h1Var.f464848q.f464801f.getHeight();
        if (height != height2 && height > 0 && height2 > 0) {
            int max = java.lang.Math.max(height, height2);
            yr3.e1 e1Var = height < height2 ? h1Var.f464847p : h1Var.f464848q;
            android.view.ViewGroup.LayoutParams layoutParams = e1Var.f464800e.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f10895i = -1;
                e1Var.f464800e.setLayoutParams(layoutParams2);
                com.tencent.mars.xlog.Log.i(h1Var.f464841g, "adjustRecViewConstraints: removed topToBottom constraint for recView");
            }
            h1Var.f464847p.f464801f.getLayoutParams().height = max;
            h1Var.f464848q.f464801f.getLayoutParams().height = max;
            h1Var.f464847p.f464801f.requestLayout();
            h1Var.f464848q.f464801f.requestLayout();
            com.tencent.mars.xlog.Log.i(h1Var.f464841g, "syncDescAreaHeight: firstHeight=" + height + ", secondHeight=" + height2 + ", maxHeight=" + max);
        }
    }
}
