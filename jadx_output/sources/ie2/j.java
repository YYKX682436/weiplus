package ie2;

/* loaded from: classes13.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer f290991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f290990d = frameBubbleContentLayout;
        this.f290991e = linearBubbleAnimateContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBubbleShow curContent: ");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290990d;
        sb6.append(frameBubbleContentLayout);
        com.tencent.mars.xlog.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f290991e;
        if (linearBubbleAnimateContainer.f111516e.contains(frameBubbleContentLayout)) {
            com.tencent.mars.xlog.Log.i("LinearBubbleAnimateContainer", "requestBubbleShow is doing job return, curContent: " + frameBubbleContentLayout);
        } else {
            if (frameBubbleContentLayout.f111510i == 2) {
                frameBubbleContentLayout.setVisibility(0);
            } else {
                java.util.LinkedList linkedList = linearBubbleAnimateContainer.f111515d;
                if (!linkedList.contains(frameBubbleContentLayout)) {
                    linkedList.offer(frameBubbleContentLayout);
                    kotlinx.coroutines.r2 r2Var = linearBubbleAnimateContainer.f111518g;
                    if (r2Var != null ? r2Var.A() : true) {
                        com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.c(linearBubbleAnimateContainer);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
