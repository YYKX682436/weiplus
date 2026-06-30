package mx2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout f332518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f332519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f332520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout, mn2.g4 g4Var, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        super(1);
        this.f332518d = finderLivePhotoLayout;
        this.f332519e = g4Var;
        this.f332520f = feedData;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String f132330e;
        cw2.da daVar = (cw2.da) obj;
        com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout = this.f332518d;
        finderLivePhotoLayout.setVideoView(daVar);
        if (daVar != null && cq.k.f221221n.a()) {
            daVar.setTag(com.tencent.mm.R.id.twb, java.lang.Boolean.TRUE);
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) finderLivePhotoLayout.f132334i).X6(daVar);
        if (daVar != null) {
            ym5.a1.f(new mx2.u(finderLivePhotoLayout));
            com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout.O(finderLivePhotoLayout, daVar, this.f332519e, this.f332520f);
            boolean F = daVar.F();
            finderLivePhotoLayout.f132336n = F;
            f132330e = finderLivePhotoLayout.getF132330e();
            com.tencent.mars.xlog.Log.i(f132330e, "preload prepareToPlay done result:" + F + ' ' + finderLivePhotoLayout);
        }
        return jz5.f0.f302826a;
    }
}
