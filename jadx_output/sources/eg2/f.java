package eg2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f252558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f252559e;

    public f(eg2.n nVar, int i17) {
        this.f252558d = nVar;
        this.f252559e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = this.f252558d.f252590h;
        if (finderLiveHDCheckboxView == null) {
            return;
        }
        android.view.ViewParent parent = finderLiveHDCheckboxView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int height = viewGroup.getHeight();
        if (height == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderCoverHDCheckboxPlugin", "container height is 0, skip position update");
            return;
        }
        int a17 = ym5.x.a(viewGroup.getContext(), 200.0f);
        int i17 = this.f252559e;
        int measuredHeight = (height - (a17 + i17)) - finderLiveHDCheckboxView.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveHDCheckboxView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = i17;
            layoutParams2.topMargin = measuredHeight;
        }
        finderLiveHDCheckboxView.setLayoutParams(layoutParams2);
    }
}
