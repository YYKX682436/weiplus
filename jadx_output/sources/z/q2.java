package z;

/* loaded from: classes14.dex */
public final class q2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f2 f468800b;

    public q2(z.l2 l2Var, z.f2 f2Var) {
        this.f468799a = l2Var;
        this.f468800b = f2Var;
    }

    @Override // n0.a2
    public void dispose() {
        z.l2 l2Var = this.f468799a;
        l2Var.getClass();
        z.f2 animation = this.f468800b;
        kotlin.jvm.internal.o.g(animation, "animation");
        l2Var.f468728h.remove(animation);
    }
}
