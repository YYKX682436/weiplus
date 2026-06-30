package ut2;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ut2.s3 s3Var, cm2.m0 m0Var) {
        super(0);
        this.f431146d = s3Var;
        this.f431147e = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 f2Var = this.f431146d.L;
        tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
        if (e1Var != null) {
            e1Var.Y(this.f431147e.f43368v);
        }
        return jz5.f0.f302826a;
    }
}
