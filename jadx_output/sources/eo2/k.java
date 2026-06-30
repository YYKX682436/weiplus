package eo2;

/* loaded from: classes2.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerRelativeLayout f255581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerRelativeLayout f255582e;

    public k(com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout, com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2) {
        this.f255581d = roundCornerRelativeLayout;
        this.f255582e = roundCornerRelativeLayout2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f255581d;
        roundCornerRelativeLayout.setRadius(this.f255582e.getHeight() / 2.0f);
        android.view.ViewTreeObserver viewTreeObserver = roundCornerRelativeLayout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
