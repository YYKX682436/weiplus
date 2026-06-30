package ct2;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct2.m f222283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gn1 f222286g;

    public k(ct2.m mVar, java.lang.String str, java.lang.String str2, r45.gn1 gn1Var) {
        this.f222283d = mVar;
        this.f222284e = str;
        this.f222285f = str2;
        this.f222286g = gn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String preloadUrl = this.f222285f;
        kotlin.jvm.internal.o.f(preloadUrl, "$preloadUrl");
        long integer = this.f222286g.getInteger(2);
        ct2.m mVar = this.f222283d;
        mVar.getClass();
        com.tencent.thumbplayer.api.proxy.ITPPreloadProxy createPreloadManager = com.tencent.thumbplayer.api.proxy.TPP2PProxyFactory.createPreloadManager(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(0);
        tPDownloadParamData.url = preloadUrl;
        java.lang.String id6 = this.f222284e;
        tPDownloadParamData.setDownloadFileID(id6);
        tPDownloadParamData.setPreloadSize(integer);
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        kotlin.jvm.internal.o.g(id6, "id");
        tPDownloadParamData.setSavePath(com.tencent.mm.plugin.finder.assist.e9.f102136e + id6);
        com.tencent.mm.vfs.w6.e(tPDownloadParamData.getSavePath());
        createPreloadManager.setPreloadListener(new ct2.l(mVar, id6));
        mVar.f222290e = createPreloadManager.startPreload(id6, tPDownloadParamData);
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer:" + preloadUrl + "  fileId(replayTransitionId):" + id6 + "  preloadSize bytes:" + integer + " savePath:" + tPDownloadParamData.getSavePath() + " videoType:-1,preloadId:" + mVar.f222290e);
    }
}
