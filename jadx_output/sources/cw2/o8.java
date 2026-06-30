package cw2;

/* loaded from: classes2.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223901d;

    public o8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223901d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View loading;
        android.view.View loading2;
        android.view.View loading3;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223901d;
        loading = finderVideoLayout.getLoading();
        android.view.ViewGroup.LayoutParams layoutParams = loading.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            loading2 = finderVideoLayout.getLoading();
            int dimension = (int) loading2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.setMarginEnd(0);
            if (17 != layoutParams2.gravity) {
                layoutParams2.gravity = 17;
                loading3 = finderVideoLayout.getLoading();
                loading3.requestLayout();
            }
        }
        finderVideoLayout.V(new cw2.y8(finderVideoLayout));
    }
}
