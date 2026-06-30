package px2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f358927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f358926d = finderVideoLandscapePreviewLayout;
        this.f358927e = finderThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358926d;
        finderVideoLandscapePreviewLayout.p(true, 1);
        cw2.ca fullSeekBar = finderVideoLandscapePreviewLayout.getFullSeekBar();
        if (fullSeekBar != null) {
            fullSeekBar.t("HorizontalPlaySpeedChange");
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f358927e;
        finderThumbPlayerProxy.setVideoViewFocused(true);
        finderThumbPlayerProxy.play();
        return jz5.f0.f302826a;
    }
}
