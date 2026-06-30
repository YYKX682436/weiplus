package xd;

/* loaded from: classes7.dex */
public abstract class h implements h8.c {
    public h(xd.d dVar) {
        java.lang.String simpleName = dVar.getClass().getSimpleName();
        wd.e eVar = (wd.e) dVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseImageStreamFetcherWxa", "hy: construct fetcher with config %s env %s", simpleName, eVar.f444683a.get() != null ? ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) eVar.f444683a.get()).f74803n : "");
    }
}
