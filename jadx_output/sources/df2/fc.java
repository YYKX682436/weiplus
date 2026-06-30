package df2;

/* loaded from: classes3.dex */
public final class fc extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jc f230133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(df2.jc jcVar) {
        super(2);
        this.f230133d = jcVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        df2.jc jcVar = this.f230133d;
        if (booleanValue) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = (com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView) jcVar.S6(com.tencent.mm.R.id.ubl);
            if (finderLiveInfiniteLoopView != null) {
                finderLiveInfiniteLoopView.h();
                finderLiveInfiniteLoopView.setCanScroll(false);
                android.view.ViewGroup.LayoutParams layoutParams = finderLiveInfiniteLoopView.getLayoutParams();
                layoutParams.height = intValue;
                finderLiveInfiniteLoopView.setLayoutParams(layoutParams);
            }
        } else {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView2 = (com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView) jcVar.S6(com.tencent.mm.R.id.ubl);
            if (finderLiveInfiniteLoopView2 != null && (finderLiveAnchorDataPanelView = jcVar.f230468o) != null) {
                finderLiveAnchorDataPanelView.post(new df2.ec(finderLiveInfiniteLoopView2, intValue));
            }
        }
        return jz5.f0.f302826a;
    }
}
