package vc5;

/* loaded from: classes5.dex */
public final class t implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vc5.t f435345a = new vc5.t();

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(insets, "insets");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = insets.a(7).f247045b;
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
        return n3.g3.f334337b;
    }
}
