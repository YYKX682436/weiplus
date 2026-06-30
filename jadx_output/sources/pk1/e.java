package pk1;

/* loaded from: classes7.dex */
public final class e implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f355439a;

    public e(android.os.Handler handler) {
        this.f355439a = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        pk1.d dVar = new pk1.d(this.f355439a, dataSource);
        if (dataSource instanceof mk1.z) {
            return (ye1.r) dVar.invoke();
        }
        if (!(dataSource instanceof mk1.a0)) {
            throw new jz5.j();
        }
        if (((mk1.a0) dataSource).f327092e) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z17 = false;
            if (e0Var != null) {
                if (((h62.d) e0Var).Ni(e42.d0.clicfg_appbrand_wxeb_video_support_switch_thumbplayer_for_hls, 0) == 1) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "useThumbPlayerInXWebPlayHls, " + z17);
            if (z17) {
                return (ye1.a) dVar.invoke();
            }
        } else if (!kotlin.jvm.internal.o.b("chunked", dataSource.f327097b)) {
            return (ye1.a) dVar.invoke();
        }
        return null;
    }
}
