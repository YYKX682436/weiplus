package m34;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar f323348d;

    public b(com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar adVideoPlayerLoadingBar) {
        this.f323348d = adVideoPlayerLoadingBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar adVideoPlayerLoadingBar = this.f323348d;
        int paddingLeft = (((android.widget.FrameLayout.LayoutParams) adVideoPlayerLoadingBar.f162474g.getLayoutParams()).leftMargin - adVideoPlayerLoadingBar.f162475h.getPaddingLeft()) - (((adVideoPlayerLoadingBar.getBarPointWidth() - adVideoPlayerLoadingBar.f162475h.getPaddingLeft()) - adVideoPlayerLoadingBar.f162475h.getPaddingRight()) / 2);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) adVideoPlayerLoadingBar.f162475h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        adVideoPlayerLoadingBar.f162475h.setLayoutParams(layoutParams);
    }
}
