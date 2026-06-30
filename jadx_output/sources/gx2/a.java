package gx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f277336b;

    /* renamed from: c, reason: collision with root package name */
    public float f277337c;

    /* renamed from: d, reason: collision with root package name */
    public hx2.i f277338d;

    /* renamed from: e, reason: collision with root package name */
    public hx2.i f277339e;

    /* renamed from: f, reason: collision with root package name */
    public hx2.i f277340f;

    /* renamed from: k, reason: collision with root package name */
    public int f277345k;

    /* renamed from: a, reason: collision with root package name */
    public float f277335a = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f277341g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f277342h = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f277343i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f277344j = 2;

    public final gx2.a a(hx2.h callbackComponent) {
        kotlin.jvm.internal.o.g(callbackComponent, "callbackComponent");
        ((java.util.HashSet) this.f277341g).add(callbackComponent);
        return this;
    }

    public final gx2.q b(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (this.f277337c == 0.0f) {
            throw new java.lang.IllegalStateException("expandHeight should not be zero");
        }
        gx2.q qVar = new gx2.q(context, this);
        root.removeView(qVar);
        root.addView(qVar);
        return qVar;
    }
}
