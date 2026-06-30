package ie2;

/* loaded from: classes3.dex */
public abstract class b extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290982p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.view.ViewParent parent = root.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout");
        this.f290982p = (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent;
    }

    public final android.view.View t1() {
        return this.f290982p.getChildAt(0);
    }
}
