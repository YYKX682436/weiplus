package ie2;

/* loaded from: classes13.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer f290989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f290988d = frameBubbleContentLayout;
        this.f290989e = linearBubbleAnimateContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBubbleHide curContent: ");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290988d;
        sb6.append(frameBubbleContentLayout);
        com.tencent.mars.xlog.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f290989e;
        linearBubbleAnimateContainer.f111515d.remove(frameBubbleContentLayout);
        linearBubbleAnimateContainer.f111516e.remove(frameBubbleContentLayout);
        if (frameBubbleContentLayout.getVisibility() != 8) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(frameBubbleContentLayout) && linearBubbleAnimateContainer.f111519h) {
                linearBubbleAnimateContainer.f(frameBubbleContentLayout, 8);
            } else {
                frameBubbleContentLayout.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
