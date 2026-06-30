package n0;

/* loaded from: classes9.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.x1 f333737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f333738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n0.x1 x1Var, java.util.HashSet hashSet) {
        super(1);
        this.f333737d = x1Var;
        this.f333738e = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it == this.f333737d) {
            throw new java.lang.IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (it instanceof x0.z0) {
            this.f333738e.add(it);
        }
        return jz5.f0.f302826a;
    }
}
