package i33;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f288240d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f288240d;
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.k1 k1Var = (i33.k1) pf5.z.f353948a.a(activity).e(i33.k1.class);
        return java.lang.Integer.valueOf(k1Var != null ? k1Var.X6() : 0);
    }
}
