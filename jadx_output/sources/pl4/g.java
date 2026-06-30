package pl4;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f356710d;

    public g(pl4.k kVar) {
        this.f356710d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pl4.k kVar = this.f356710d;
        synchronized (kVar.f356721e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "processPendingRequests fileCacheId:" + kVar.f356718b + ", mRequestQueue size " + kVar.f356732p.size());
            if (kVar.f356732p.isEmpty()) {
                return;
            }
            for (com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest : kVar.f356732p) {
                kotlin.jvm.internal.o.d(iTPAssetResourceLoadingRequest);
                if (pl4.k.a(kVar, iTPAssetResourceLoadingRequest)) {
                    iTPAssetResourceLoadingRequest.finishLoading();
                    linkedList.add(iTPAssetResourceLoadingRequest);
                }
            }
            pl4.k kVar2 = this.f356710d;
            kVar2.getClass();
            if (linkedList.isEmpty()) {
                return;
            }
            synchronized (kVar2.f356721e) {
                int size = kVar2.f356732p.size();
                kVar2.f356732p.removeAll(kz5.n0.X0(linkedList));
                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "removeRequestList fileCacheId:" + kVar2.f356718b + ", before:" + size + ", after:" + kVar2.f356732p.size());
                if (!kVar2.f356732p.isEmpty()) {
                    kVar2.g();
                }
            }
        }
    }
}
