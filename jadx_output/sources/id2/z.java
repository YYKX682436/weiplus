package id2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(id2.v1 v1Var) {
        super(0);
        this.f290894d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        id2.v1 v1Var = this.f290894d;
        android.view.View findViewById = v1Var.findViewById(com.tencent.mm.R.id.f484796fk0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        dl2.f0 f0Var = new dl2.f0(findViewById);
        f0Var.f235205i = new id2.x(v1Var);
        f0Var.f235206j = new id2.y(v1Var);
        return f0Var;
    }
}
