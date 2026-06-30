package ws2;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout f449049e;

    public h0(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
        this.f449048d = finderLiveThumbPlayerProxy;
        this.f449049e = finderLiveReplayPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449048d;
        finderLiveThumbPlayerProxy.getLocationOnScreen(iArr);
        int height = iArr[1] + finderLiveThumbPlayerProxy.getHeight();
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) this.f449049e.getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class);
        if (le0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.le0.w1(le0Var, height, 0, 2, null);
        }
    }
}
