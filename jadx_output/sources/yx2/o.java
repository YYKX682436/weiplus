package yx2;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f467869e;

    public o(com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f467868d = snsFinderImageBackView;
        this.f467869e = finderObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx2.f fVar;
        boolean enablePlay;
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView = this.f467868d;
        fVar = snsFinderImageBackView.finderDetailLoader;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f467869e;
        fVar.c(finderObject);
        snsFinderImageBackView.setupBannerInfo(finderObject);
        enablePlay = snsFinderImageBackView.enablePlay();
        if (enablePlay) {
            snsFinderImageBackView.play();
        }
    }
}
