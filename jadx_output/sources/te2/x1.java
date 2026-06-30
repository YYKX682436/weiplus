package te2;

/* loaded from: classes3.dex */
public final class x1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC f418524d;

    public x1(com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC) {
        this.f418524d = finderLiveAnchorUIC;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC = this.f418524d;
        com.tencent.mars.xlog.Log.i(finderLiveAnchorUIC.f111552d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (finderLiveAnchorUIC.f111553e == z18) {
            return;
        }
        finderLiveAnchorUIC.f111553e = z18;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = finderLiveAnchorUIC.f111554f;
        if (k0Var != null) {
            k0Var.keyboardChange(z18, i17);
        }
    }
}
