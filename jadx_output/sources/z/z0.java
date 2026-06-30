package z;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.w0 f468882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.q0 f468883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(z.w0 w0Var, z.q0 q0Var) {
        super(1);
        this.f468882d = w0Var;
        this.f468883e = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        z.w0 w0Var = this.f468882d;
        w0Var.getClass();
        z.q0 animation = this.f468883e;
        kotlin.jvm.internal.o.g(animation, "animation");
        w0Var.f468863a.b(animation);
        ((n0.q4) w0Var.f468864b).setValue(java.lang.Boolean.TRUE);
        return new z.y0(w0Var, animation);
    }
}
