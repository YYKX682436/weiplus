package id2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(id2.v1 v1Var) {
        super(0);
        this.f290883d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.qa1 qa1Var = new r45.qa1();
        id2.v1 v1Var = this.f290883d;
        qa1Var.set(5, java.lang.Long.valueOf(v1Var.f290833J));
        qa1Var.set(4, v1Var.I);
        qa1Var.set(3, java.lang.Long.valueOf(v1Var.F));
        qa1Var.set(6, java.lang.Long.valueOf(v1Var.K));
        return new jz5.l(qa1Var, v1Var.E);
    }
}
