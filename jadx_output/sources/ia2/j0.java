package ia2;

/* loaded from: classes2.dex */
public final class j0 implements com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f289934b;

    public j0(ia2.n0 n0Var) {
        this.f289934b = n0Var;
        this.f289933a = new java.lang.ref.WeakReference(n0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI;
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI2;
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.Object request = response.getRequest();
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = request instanceof com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) request : null;
        if (finderPoiFeedLoader == null) {
            return;
        }
        if (response.getErrCode() != 0) {
            com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "finderPOIFlutterInvalidWithErrorCode:" + response.getErrCode() + " tabIndex:" + finderPoiFeedLoader.f107539i);
            return;
        }
        boolean z17 = true;
        if (response.getPullType() != 1 && response.getPullType() != 0) {
            z17 = false;
        }
        java.lang.ref.WeakReference weakReference = this.f289933a;
        if (!z17 && !response.getHasMore()) {
            com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "poistream has no more data");
            ia2.n0 n0Var = (ia2.n0) weakReference.get();
            if (n0Var != null && (pOIFlutterAPI2 = n0Var.f289955f) != null) {
                pOIFlutterAPI2.noMorePoiStream(finderPoiFeedLoader.f107539i, finderPoiFeedLoader.f107540m, ia2.q0.a("noMorePoiStream"));
            }
        }
        com.tencent.pigeon.finder.POIStreamUpdateData b17 = this.f289934b.b(finderPoiFeedLoader.f107539i, finderPoiFeedLoader.f107540m, response, z17);
        ia2.n0 n0Var2 = (ia2.n0) weakReference.get();
        if (n0Var2 == null || (pOIFlutterAPI = n0Var2.f289955f) == null) {
            return;
        }
        pOIFlutterAPI.appendPoiStream(finderPoiFeedLoader.f107539i, finderPoiFeedLoader.f107540m, b17, ia2.q0.a("appendPoiStream"));
    }
}
