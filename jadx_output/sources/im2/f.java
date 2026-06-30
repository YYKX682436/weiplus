package im2;

/* loaded from: classes3.dex */
public final class f implements wa2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292311a;

    public f(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC) {
        this.f292311a = finderLiveExitAnimateOpUIC;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f292311a;
        com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "onDragUp close=" + z17);
        finderLiveExitAnimateOpUIC.getActivity().getWindow().getDecorView().setBackgroundColor(-16777216);
        if (z17) {
            com.tencent.mm.autogen.events.FinderLiveBgVisibleChangeEvent finderLiveBgVisibleChangeEvent = new com.tencent.mm.autogen.events.FinderLiveBgVisibleChangeEvent();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            am.ob obVar = finderLiveBgVisibleChangeEvent.f54284g;
            obVar.f7519a = bool;
            finderLiveExitAnimateOpUIC.getActivity().hashCode();
            obVar.getClass();
            finderLiveBgVisibleChangeEvent.e();
            finderLiveExitAnimateOpUIC.f116991q = true;
        }
    }
}
