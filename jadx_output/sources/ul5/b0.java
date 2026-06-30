package ul5;

/* loaded from: classes15.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f428628a;

    public int a(ul5.m overScroll, android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(overScroll, "overScroll");
        kotlin.jvm.internal.o.g(child, "child");
        return (i17 == 2 || i17 == 8) ? child.getHeight() / 10 : (-child.getHeight()) / 10;
    }

    public int b(ul5.m overScroll, android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(overScroll, "overScroll");
        kotlin.jvm.internal.o.g(child, "child");
        if (this.f428628a <= 0) {
            this.f428628a = android.view.ViewConfiguration.get(child.getContext()).getScaledMinimumFlingVelocity() * 15;
        }
        return this.f428628a;
    }
}
