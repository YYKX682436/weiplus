package ie2;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290985d;

    public e(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        this.f290985d = frameBubbleContentLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String tag;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290985d;
        tag = frameBubbleContentLayout.getTAG();
        com.tencent.mars.xlog.Log.i(tag, "target scene enter");
        frameBubbleContentLayout.f111510i = 2;
        ie2.h sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
        if (sceneStateListener != null) {
            sceneStateListener.s(frameBubbleContentLayout.f111508g);
        }
    }
}
