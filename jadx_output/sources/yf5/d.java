package yf5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f461859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f461860b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f461861c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public d(android.content.Context context, int i17) {
        this.f461859a = context;
        this.f461860b = new java.util.ArrayDeque(i17);
        ((ku5.t0) ku5.t0.f312615d).q(new yf5.b(this));
    }

    public final synchronized android.view.View a() {
        android.view.View view;
        view = (android.view.View) ((java.util.ArrayDeque) this.f461860b).poll();
        if (((java.util.ArrayDeque) this.f461860b).size() < 9 && !this.f461861c.getAndSet(true)) {
            int size = 18 - ((java.util.ArrayDeque) this.f461860b).size();
            ((ku5.t0) ku5.t0.f312615d).q(new yf5.c(size, this));
        }
        if (view == null) {
            view = b();
        }
        return view;
    }

    public final android.view.View b() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f461859a).inflate(com.tencent.mm.R.layout.f488689e40, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }
}
