package ef1;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef1.e f252382d;

    public a(ef1.e eVar) {
        this.f252382d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = ((oe1.s) this.f252382d.f252393e).f344737a;
        java.util.Objects.toString(appBrandVideoView.C1);
        if (!appBrandVideoView.B || appBrandVideoView.f83534m.getVisibility() == 0) {
            return;
        }
        appBrandVideoView.f83532i.j();
        if (appBrandVideoView.V) {
            appBrandVideoView.i();
        }
    }
}
