package sc1;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc1.f f405699d;

    public n(sc1.z zVar, sc1.f fVar) {
        this.f405699d = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        sc1.k1 c17 = ((sc1.o1) this.f405699d.f405660e).c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onForeground code:%d info:%s", java.lang.Integer.valueOf(c17.f405688a), c17.f405689b);
    }
}
