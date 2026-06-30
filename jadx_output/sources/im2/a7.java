package im2;

/* loaded from: classes3.dex */
public final class a7 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC f292251d;

    public a7(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC) {
        this.f292251d = finderLiveVisitorUIC;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC = this.f292251d;
        finderLiveVisitorUIC.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[keyboardChange], show:" + z18 + ", height:" + i17 + ", lastKeyBoardHeight:" + finderLiveVisitorUIC.f117000e);
        if (finderLiveVisitorUIC.f116999d == z18 && finderLiveVisitorUIC.f117000e == i17) {
            return;
        }
        finderLiveVisitorUIC.f117000e = i17;
        finderLiveVisitorUIC.f116999d = z18;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = finderLiveVisitorUIC.f117007o;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) == null) {
            return;
        }
        finderLiveVisitorPluginLayout.keyboardChange(z18, i17);
    }
}
