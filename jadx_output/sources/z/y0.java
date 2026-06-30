package z;

/* loaded from: classes14.dex */
public final class y0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.w0 f468875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.q0 f468876b;

    public y0(z.w0 w0Var, z.q0 q0Var) {
        this.f468875a = w0Var;
        this.f468876b = q0Var;
    }

    @Override // n0.a2
    public void dispose() {
        z.w0 w0Var = this.f468875a;
        w0Var.getClass();
        z.q0 animation = this.f468876b;
        kotlin.jvm.internal.o.g(animation, "animation");
        w0Var.f468863a.k(animation);
    }
}
