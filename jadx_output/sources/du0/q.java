package du0;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f243418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(du0.i0 i0Var) {
        super(1);
        this.f243418d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        du0.i0 i0Var = this.f243418d;
        yz5.l lVar = i0Var.f243364f;
        if (lVar != null) {
            lVar.invoke(ze2Var);
        }
        i0Var.f243362d = false;
        return jz5.f0.f302826a;
    }
}
