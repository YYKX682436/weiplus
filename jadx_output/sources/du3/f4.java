package du3;

/* loaded from: classes3.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f243583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(du3.h4 h4Var) {
        super(0);
        this.f243583d = h4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        du3.h4 h4Var = this.f243583d;
        android.content.Context context = h4Var.f243609f.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.ViewParent viewParent = h4Var.f243609f;
        kotlin.jvm.internal.o.e(viewParent, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(((androidx.appcompat.app.AppCompatActivity) context).getViewModel(), new hk0.a0((androidx.lifecycle.y) viewParent)).a(hk0.u0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
