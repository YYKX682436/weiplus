package k50;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.y0 f304263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k50.y0 y0Var) {
        super(2);
        this.f304263d = y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        k50.h0 appItem = (k50.h0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(appItem, "appItem");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        yz5.a aVar = appItem.f304223f;
        if (aVar != null) {
            aVar.invoke();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            k50.g0 g0Var = k50.g0.f304214a;
            k50.o0 o0Var = appItem.f304220c;
            g0Var.b(o0Var);
            android.content.Intent putExtra = new android.content.Intent().putExtra("selected_app", o0Var.name()).putExtra("selected_app_index", intValue + 1);
            kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
            k50.y0 y0Var = this.f304263d;
            y0Var.getActivity().setResult(-1, putExtra);
            y0Var.getActivity().finish();
        }
        return f0Var2;
    }
}
