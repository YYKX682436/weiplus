package ie2;

/* loaded from: classes13.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290983d;

    public c(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        this.f290983d = frameBubbleContentLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String tag;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290983d;
        tag = frameBubbleContentLayout.getTAG();
        com.tencent.mars.xlog.Log.i(tag, "source scene enter");
        frameBubbleContentLayout.f111510i = 1;
        ie2.h sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
        if (sceneStateListener != null) {
            sceneStateListener.l(frameBubbleContentLayout.f111509h);
        }
    }
}
