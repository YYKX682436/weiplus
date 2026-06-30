package df1;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar f229643d;

    public e(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar) {
        this.f229643d = appBrandVideoViewControlBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar = this.f229643d;
        appBrandVideoViewControlBar.setVisibility(8);
        appBrandVideoViewControlBar.P.d();
        return false;
    }
}
