package ie2;

/* loaded from: classes13.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290984d;

    public d(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        this.f290984d = frameBubbleContentLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String tag;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290984d;
        tag = frameBubbleContentLayout.getTAG();
        com.tencent.mars.xlog.Log.i(tag, "source scene exit");
        ie2.h sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
        frameBubbleContentLayout.f111508g = sceneStateListener != null ? sceneStateListener.o() : null;
    }
}
