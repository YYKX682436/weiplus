package kp3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.f f310961d;

    public a(kp3.f fVar) {
        this.f310961d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.f fVar = this.f310961d;
        androidx.cardview.widget.CardView cardView = fVar.f310982s;
        int width = cardView != null ? cardView.getWidth() : 0;
        if (width > 0) {
            int i17 = (int) (width / 1.77f);
            androidx.cardview.widget.CardView cardView2 = fVar.f310982s;
            android.view.ViewGroup.LayoutParams layoutParams = cardView2 != null ? cardView2.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = i17;
            }
            androidx.cardview.widget.CardView cardView3 = fVar.f310982s;
            if (cardView3 != null) {
                cardView3.requestLayout();
            }
        }
    }
}
