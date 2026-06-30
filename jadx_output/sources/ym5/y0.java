package ym5;

/* loaded from: classes15.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.o0 f463575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f463576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ym5.o0 o0Var, android.view.ViewGroup viewGroup) {
        super(0);
        this.f463575d = o0Var;
        this.f463576e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        jz5.f0 f0Var2 = null;
        android.view.ViewGroup viewGroup = this.f463576e;
        ym5.o0 o0Var = this.f463575d;
        if (o0Var != null) {
            ym5.b1 b17 = ym5.a1.b(viewGroup);
            if (b17 != null) {
                b17.f463215f = o0Var;
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                ym5.b1 b1Var = new ym5.b1(viewGroup);
                b1Var.f463215f = o0Var;
                ym5.a1.a(viewGroup.hashCode(), b1Var);
            }
        } else {
            ym5.b1 b18 = ym5.a1.b(viewGroup);
            if (b18 != null) {
                b18.f463215f = null;
                if (b18.f463214e == null) {
                    b18.f463210a.removeOnAttachStateChangeListener(b18.f463213d);
                    ym5.a1.d(viewGroup.hashCode());
                }
            }
        }
        return f0Var;
    }
}
