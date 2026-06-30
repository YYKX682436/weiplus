package vz0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.q1 f441600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b0.q1 q1Var) {
        super(0);
        this.f441600d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b0.q1 q1Var = this.f441600d;
        uz0.n nVar = q1Var instanceof uz0.n ? (uz0.n) q1Var : null;
        if (nVar != null) {
            return (java.lang.Integer) ((n0.q4) nVar.f432147e).getValue();
        }
        return null;
    }
}
