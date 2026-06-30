package qe5;

/* loaded from: classes12.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.h2 f362117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(qe5.h2 h2Var) {
        super(1);
        this.f362117d = h2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.i iVar = (kd5.i) state.a(kd5.i.class);
        if (iVar != null) {
            this.f362117d.T6(iVar.f306897b);
        }
        return jz5.f0.f302826a;
    }
}
