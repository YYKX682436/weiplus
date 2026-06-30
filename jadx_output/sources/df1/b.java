package df1;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar f229639d;

    public b(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar adVideoPlayerLoadingBar) {
        this.f229639d = adVideoPlayerLoadingBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar adVideoPlayerLoadingBar = this.f229639d;
        int paddingLeft = (((android.widget.FrameLayout.LayoutParams) adVideoPlayerLoadingBar.f83630g.getLayoutParams()).leftMargin - adVideoPlayerLoadingBar.f83631h.getPaddingLeft()) - (((adVideoPlayerLoadingBar.getBarPointWidth() - adVideoPlayerLoadingBar.f83631h.getPaddingLeft()) - adVideoPlayerLoadingBar.f83631h.getPaddingRight()) / 2);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) adVideoPlayerLoadingBar.f83631h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        adVideoPlayerLoadingBar.f83631h.setLayoutParams(layoutParams);
    }
}
