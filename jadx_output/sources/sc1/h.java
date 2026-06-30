package sc1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f405675d;

    /* renamed from: e, reason: collision with root package name */
    public int f405676e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405677f;

    public h(com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView) {
        this.f405677f = appBrandLivePusherView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int rotationAngle;
        this.f405676e++;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "[CheckRotateTask] number=" + this.f405676e + "  senorAngle=" + this.f405675d);
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405677f;
        rotationAngle = appBrandLivePusherView.getRotationAngle();
        if (rotationAngle == this.f405675d) {
            appBrandLivePusherView.c(rotationAngle);
        } else if (this.f405676e < 8) {
            appBrandLivePusherView.f81566e.postDelayed(this, 250L);
        }
    }
}
