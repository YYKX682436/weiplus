package rc3;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f393948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(rc3.f1 f1Var) {
        super(0);
        this.f393948d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.q1 q1Var = this.f393948d.f393990h;
        if (q1Var != null) {
            return new oc3.c(q1Var.f406476e, null, 2, null);
        }
        kotlin.jvm.internal.o.o("server");
        throw null;
    }
}
