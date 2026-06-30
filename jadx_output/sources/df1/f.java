package df1;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar f229644d;

    public f(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar) {
        this.f229644d = appBrandVideoViewControlBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar.f83645p1;
        return this.f229644d.y();
    }
}
