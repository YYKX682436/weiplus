package cw2;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f224129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f224129d = finderFullSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f224129d;
        java.lang.Object parent = finderFullSeekBarLayout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout finderInterceptHorizontalLinearLayout = (com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout) ((android.view.View) parent).findViewById(com.tencent.mm.R.id.qma);
        if (finderInterceptHorizontalLinearLayout == null) {
            return null;
        }
        finderInterceptHorizontalLinearLayout.setOnTouchListener(finderFullSeekBarLayout.f130558p0);
        return finderInterceptHorizontalLinearLayout;
    }
}
