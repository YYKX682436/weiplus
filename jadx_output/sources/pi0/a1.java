package pi0;

/* loaded from: classes11.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(pi0.l1 l1Var) {
        super(1);
        this.f354515d = l1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pi0.u0 it = (pi0.u0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = this.f354515d.f354644c;
        if (list != null) {
            it.f354731b.getPlugins().add(kz5.n0.X0(list));
        }
        return jz5.f0.f302826a;
    }
}
