package eg2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f252642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.view.ViewGroup viewGroup) {
        super(0);
        this.f252642d = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f252642d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(((androidx.appcompat.app.AppCompatActivity) context).getViewModel(), new hk0.a0((androidx.lifecycle.y) viewGroup)).a(hk0.u0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
