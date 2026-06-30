package j33;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f297460a;

    /* renamed from: b, reason: collision with root package name */
    public final k33.d f297461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f297462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f297463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f297464e;

    /* renamed from: f, reason: collision with root package name */
    public final int f297465f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f297466g;

    public w(androidx.recyclerview.widget.RecyclerView recyclerView, k33.d scrollerView, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(scrollerView, "scrollerView");
        this.f297460a = recyclerView;
        this.f297461b = scrollerView;
        this.f297462c = i17;
        this.f297463d = i18;
        this.f297464e = i19;
        this.f297465f = i27;
        this.f297466g = jz5.h.b(new j33.v(this));
    }

    public final float a(float f17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f297460a;
        float min = java.lang.Math.min(1.0f, recyclerView.computeVerticalScrollOffset() / (recyclerView.computeVerticalScrollRange() - recyclerView.getHeight()));
        recyclerView.getHeight();
        return f17 * min;
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.f297466g).getValue()).intValue();
    }
}
