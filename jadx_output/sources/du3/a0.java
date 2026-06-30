package du3;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f243504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(du3.b0 b0Var) {
        super(0);
        this.f243504d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        du3.b0 b0Var = this.f243504d;
        android.content.Context context = b0Var.f243524f.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.ViewParent viewParent = b0Var.f243524f;
        kotlin.jvm.internal.o.e(viewParent, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(((androidx.appcompat.app.AppCompatActivity) context).getViewModel(), new hk0.a0((androidx.lifecycle.y) viewParent)).a(hk0.u0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
