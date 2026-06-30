package ym5;

/* loaded from: classes15.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n0 f463567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ym5.n0 n0Var, android.view.View view) {
        super(0);
        this.f463567d = n0Var;
        this.f463568e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        jz5.f0 f0Var2 = null;
        android.view.View view = this.f463568e;
        ym5.n0 n0Var = this.f463567d;
        if (n0Var != null) {
            ym5.b1 b17 = ym5.a1.b(view);
            if (b17 != null) {
                b17.f463214e = n0Var;
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                ym5.b1 b1Var = new ym5.b1(view);
                b1Var.f463214e = n0Var;
                ym5.a1.a(view.hashCode(), b1Var);
            }
        } else {
            ym5.b1 b18 = ym5.a1.b(view);
            if (b18 != null) {
                b18.f463214e = null;
                if (b18.f463215f == null) {
                    b18.f463210a.removeOnAttachStateChangeListener(b18.f463213d);
                    ym5.a1.d(view.hashCode());
                }
            }
        }
        return f0Var;
    }
}
