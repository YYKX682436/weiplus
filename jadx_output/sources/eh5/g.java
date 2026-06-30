package eh5;

/* loaded from: classes5.dex */
public final class g implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252959a;

    public g(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        this.f252959a = immersiveBaseActivity;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(insets, "insets");
        if (this.f252959a.getF208938m()) {
            e3.d a17 = insets.a(7);
            kotlin.jvm.internal.o.f(a17, "getInsets(...)");
            view.setPadding(0, a17.f247045b, 0, a17.f247047d);
            return n3.g3.f334337b;
        }
        if (view.getPaddingTop() == 0 && view.getPaddingBottom() == 0 && view.getPaddingLeft() == 0 && view.getPaddingRight() == 0) {
            return insets;
        }
        view.setPadding(0, 0, 0, 0);
        return insets;
    }
}
