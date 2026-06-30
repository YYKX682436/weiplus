package ie2;

/* loaded from: classes13.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290986d;

    public f(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        this.f290986d = frameBubbleContentLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String tag;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290986d;
        tag = frameBubbleContentLayout.getTAG();
        com.tencent.mars.xlog.Log.i(tag, "target scene exit");
        ie2.h sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
        frameBubbleContentLayout.f111509h = sceneStateListener != null ? sceneStateListener.a() : null;
    }
}
