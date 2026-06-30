package cw2;

/* loaded from: classes2.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz2.a f224028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f224029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, kz2.a aVar, cw2.h8 h8Var) {
        super(1);
        this.f224027d = finderVideoLayout;
        this.f224028e = aVar;
        this.f224029f = h8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da daVar = (cw2.da) obj;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224027d;
        finderVideoLayout.setVideoView(daVar);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) finderVideoLayout.getVideoCore().F()).X6(daVar);
        if (daVar != null) {
            daVar.setFinderVideoPlayTrace(this.f224028e);
            cw2.h8 h8Var = this.f224029f;
            h8Var.f223751g = true;
            com.tencent.mm.plugin.finder.storage.FeedData feedData = h8Var.f223745a;
            finderVideoLayout.getVideoCore().D(feedData.getExpectId());
            boolean isNeverStart = daVar.getIsNeverStart();
            mn2.g4 g4Var = h8Var.f223747c;
            if (isNeverStart || daVar.getIsPreloadedView() || (daVar instanceof com.tencent.mm.plugin.finder.video.FinderFluentVideoView)) {
                cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
                if (seekBarLayout != null) {
                    seekBarLayout.setVisibility(0);
                }
                if (daVar instanceof com.tencent.mm.plugin.finder.video.FinderFluentVideoView) {
                    daVar.setAlpha(1.0f);
                } else {
                    daVar.setAlpha(0.0f);
                }
                finderVideoLayout.Q(daVar, g4Var, h8Var.f223750f, feedData);
            } else if ((daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) && ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).getCurrentPlayState() == 6) {
                finderVideoLayout.y(com.tencent.tav.core.AssetExtension.SCENE_PLAY);
            }
            finderVideoLayout.u(daVar, g4Var, h8Var.f223749e);
        } else {
            finderVideoLayout.V(new cw2.y8(finderVideoLayout));
        }
        return jz5.f0.f302826a;
    }
}
