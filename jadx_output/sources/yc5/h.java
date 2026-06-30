package yc5;

/* loaded from: classes5.dex */
public final class h implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f460907a;

    public h(int i17) {
        this.f460907a = i17;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(insets, "insets");
        e3.d a17 = insets.a(7);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f460907a + a17.f247047d);
        return n3.g3.f334337b;
    }
}
