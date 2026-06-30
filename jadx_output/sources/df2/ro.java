package df2;

/* loaded from: classes3.dex */
public final class ro implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f231260d;

    public ro(df2.to toVar) {
        this.f231260d = toVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.to toVar = this.f231260d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c76 = toVar.c7();
        boolean isShown = c76 != null ? c76.isShown() : false;
        android.view.View S6 = toVar.S6(com.tencent.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? toVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7) : -2;
            }
            S6.requestLayout();
        }
    }
}
