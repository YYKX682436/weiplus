package du3;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.j0 f243617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(du3.j0 j0Var) {
        super(0);
        this.f243617d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        du3.j0 j0Var = this.f243617d;
        android.content.Context context = j0Var.f243631f.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.ViewParent viewParent = j0Var.f243631f;
        kotlin.jvm.internal.o.e(viewParent, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(((androidx.appcompat.app.AppCompatActivity) context).getViewModel(), new hk0.a0((androidx.lifecycle.y) viewParent)).a(hk0.u0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
