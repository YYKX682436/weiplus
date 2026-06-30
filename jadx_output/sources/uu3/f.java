package uu3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public float f431276a;

    /* renamed from: b, reason: collision with root package name */
    public vu3.c f431277b;

    /* renamed from: c, reason: collision with root package name */
    public vu3.c f431278c;

    /* renamed from: d, reason: collision with root package name */
    public vu3.c f431279d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f431280e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f431281f = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f431282g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final int f431283h = 2;

    public final uu3.f a(vu3.i callbackComponent) {
        kotlin.jvm.internal.o.g(callbackComponent, "callbackComponent");
        ((java.util.HashSet) this.f431280e).add(callbackComponent);
        return this;
    }

    public final uu3.u b(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (this.f431276a == 0.0f) {
            throw new java.lang.IllegalStateException("expandHeight should not be zero");
        }
        uu3.u uVar = new uu3.u(context, this);
        root.removeView(uVar);
        root.addView(uVar);
        return uVar;
    }
}
