package sc1;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.plugin.appbrand.page.qd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc1.f f405694a;

    public m(sc1.z zVar, sc1.f fVar) {
        this.f405694a = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.qd
    public void a() {
        sc1.f fVar = this.f405694a;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onExitFullScreen");
        fVar.b(false);
    }
}
