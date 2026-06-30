package i33;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity appCompatActivity, i33.t0 t0Var) {
        super(0);
        this.f288207d = appCompatActivity;
        this.f288208e = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f288207d;
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.k1 k1Var = (i33.k1) pf5.z.f353948a.a(activity).e(i33.k1.class);
        android.view.View childAt = this.f288208e.U6().getChildAt(k1Var != null ? k1Var.f288213m : 0);
        return java.lang.Integer.valueOf(childAt != null ? childAt.getHeight() : 0);
    }
}
