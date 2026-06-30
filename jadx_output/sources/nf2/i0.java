package nf2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(nf2.d1 d1Var) {
        super(0);
        this.f336751d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf2.d1 d1Var = this.f336751d;
        d1Var.f336700u = true;
        android.view.View view = d1Var.f336696q;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f10908s = -1;
                layoutParams2.f10899k = -1;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = view.getLeft();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = view.getTop();
                layoutParams2.f10906q = 0;
                layoutParams2.f10893h = 0;
                view.setLayoutParams(layoutParams2);
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "releaseCollapsedButtonConstraints: btn position=(" + view.getLeft() + ", " + view.getTop() + ')');
            }
        }
        com.tencent.mm.view.MMPAGView mMPAGView = d1Var.f336697r;
        if (mMPAGView != null) {
            mMPAGView.setVisibility(0);
            mMPAGView.setScaleMode(3);
            mMPAGView.setRepeatCount(-1);
            mMPAGView.d();
            mMPAGView.g();
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "startCollapsedPagAnim: PAG animation started, duration=" + mMPAGView.c() + ", isPlaying=" + mMPAGView.f());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "collapse: animation completed");
        return jz5.f0.f302826a;
    }
}
