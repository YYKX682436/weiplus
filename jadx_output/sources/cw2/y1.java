package cw2;

/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f224114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f224114d = finderFullSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f224114d;
        java.lang.Object parent = finderFullSeekBarLayout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) ((android.view.View) parent).findViewById(com.tencent.mm.R.id.f484896qk3);
        if (finderFeedNewSeekBarLayout == null) {
            return null;
        }
        finderFeedNewSeekBarLayout.setFullSeekBarLayout(finderFullSeekBarLayout);
        return finderFeedNewSeekBarLayout;
    }
}
