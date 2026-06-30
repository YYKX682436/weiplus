package qi2;

/* loaded from: classes10.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.q1 f363576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(qi2.q1 q1Var) {
        super(1);
        this.f363576d = q1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ce2.i iVar = (ce2.i) obj;
        qi2.q1 q1Var = this.f363576d;
        if (iVar != null) {
            q1Var.D(iVar);
            q1Var.B();
        }
        q1Var.F(q1Var.f363614t, false);
        return jz5.f0.f302826a;
    }
}
