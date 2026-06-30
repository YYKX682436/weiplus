package z;

/* loaded from: classes14.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.f2 f468826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(z.l2 l2Var, z.f2 f2Var) {
        super(1);
        this.f468825d = l2Var;
        this.f468826e = f2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        z.l2 l2Var = this.f468825d;
        l2Var.getClass();
        z.f2 animation = this.f468826e;
        kotlin.jvm.internal.o.g(animation, "animation");
        l2Var.f468728h.add(animation);
        return new z.q2(l2Var, animation);
    }
}
