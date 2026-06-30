package cw2;

/* loaded from: classes2.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz2.a f223690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f223691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout, kz2.a aVar, cw2.h8 h8Var) {
        super(1);
        this.f223689d = finderLiveCardMediaLayout;
        this.f223690e = aVar;
        this.f223691f = h8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da daVar = (cw2.da) obj;
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223689d;
        finderLiveCardMediaLayout.setVideoView(daVar);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) finderLiveCardMediaLayout.getVideoCore().F()).X6(daVar);
        if (daVar != null) {
            daVar.s(finderLiveCardMediaLayout.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String(), finderLiveCardMediaLayout.getPlayerItemScene());
            daVar.getVideoView().setTag(com.tencent.mm.R.id.ua9, "nearby-live-preview-view-tag");
            daVar.setFinderVideoPlayTrace(this.f223690e);
            cw2.h8 h8Var = this.f223691f;
            h8Var.f223751g = true;
            com.tencent.mm.plugin.finder.storage.FeedData feedData = h8Var.f223745a;
            finderLiveCardMediaLayout.getVideoCore().D(feedData.getExpectId());
            boolean isNeverStart = daVar.getIsNeverStart();
            mn2.g4 g4Var = h8Var.f223747c;
            if (isNeverStart || daVar.getIsPreloadedView()) {
                ym5.a1.f(new cw2.a3(finderLiveCardMediaLayout, "neverStart or preloadedView"));
                daVar.n(g4Var, h8Var.f223750f, feedData);
                daVar.setVideoPlayLifecycle(finderLiveCardMediaLayout.lifecycle);
                daVar.setPreloadedView(false);
            }
            finderLiveCardMediaLayout.c(daVar, g4Var, h8Var.f223749e);
        }
        return jz5.f0.f302826a;
    }
}
