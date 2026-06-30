package z;

/* loaded from: classes14.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(z.l2 l2Var, z.l2 l2Var2) {
        super(1);
        this.f468753d = l2Var;
        this.f468754e = l2Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        z.l2 l2Var = this.f468753d;
        l2Var.getClass();
        z.l2 transition = this.f468754e;
        kotlin.jvm.internal.o.g(transition, "transition");
        l2Var.f468729i.add(transition);
        return new z.m2(l2Var, transition);
    }
}
