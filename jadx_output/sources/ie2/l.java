package ie2;

/* loaded from: classes13.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer f290995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f290995d = linearBubbleAnimateContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlinx.coroutines.y0 scope;
        com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f290995d;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) linearBubbleAnimateContainer.f111515d.pop();
        if (frameBubbleContentLayout != null) {
            linearBubbleAnimateContainer.f111516e.add(frameBubbleContentLayout);
            scope = linearBubbleAnimateContainer.getScope();
            linearBubbleAnimateContainer.f111518g = kotlinx.coroutines.l.d(scope, null, null, new ie2.k(linearBubbleAnimateContainer, frameBubbleContentLayout, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
