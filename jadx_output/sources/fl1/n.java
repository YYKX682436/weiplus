package fl1;

/* loaded from: classes7.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f263809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.o f263810e;

    public n(double d17, fl1.o oVar) {
        this.f263809d = d17;
        this.f263810e = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View childAt;
        double d17 = this.f263809d;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            fl1.o oVar = this.f263810e;
            if (d17 <= 0.0d) {
                oVar.f263827r.setMaxHeight(i17);
                oVar.f263827r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = oVar.f263827r.getLayoutManager();
            int dimensionPixelSize = (layoutManager == null || (childAt = layoutManager.getChildAt(i18)) == null) ? oVar.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480121om) : childAt.getMeasuredHeight();
            if (d17 < 1.0d) {
                dimensionPixelSize = (int) (dimensionPixelSize * d17);
            }
            i17 += dimensionPixelSize;
            d17 -= 1.0d;
            i18++;
        }
    }
}
