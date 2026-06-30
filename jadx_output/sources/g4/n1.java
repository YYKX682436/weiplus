package g4;

/* loaded from: classes5.dex */
public final class n1 implements g4.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.y2 f268454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f268455b;

    public n1(g4.x1 x1Var, g4.y2 pageFetcherSnapshot, g4.e0 retryEventBus) {
        kotlin.jvm.internal.o.g(pageFetcherSnapshot, "pageFetcherSnapshot");
        kotlin.jvm.internal.o.g(retryEventBus, "retryEventBus");
        this.f268455b = x1Var;
        this.f268454a = pageFetcherSnapshot;
    }

    @Override // g4.y4
    public void a() {
        this.f268455b.f268606a.a(java.lang.Boolean.TRUE);
    }

    @Override // g4.y4
    public void b(g4.b5 viewportHint) {
        kotlin.jvm.internal.o.g(viewportHint, "viewportHint");
        g4.y2 y2Var = this.f268454a;
        y2Var.getClass();
        if (viewportHint instanceof g4.z4) {
            y2Var.f268631b = (g4.z4) viewportHint;
        }
        ((kotlinx.coroutines.flow.q2) y2Var.f268630a).e(viewportHint);
    }
}
