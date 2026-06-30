package z;

/* loaded from: classes14.dex */
public final class m2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468743b;

    public m2(z.l2 l2Var, z.l2 l2Var2) {
        this.f468742a = l2Var;
        this.f468743b = l2Var2;
    }

    @Override // n0.a2
    public void dispose() {
        z.l2 l2Var = this.f468742a;
        l2Var.getClass();
        z.l2 transition = this.f468743b;
        kotlin.jvm.internal.o.g(transition, "transition");
        l2Var.f468729i.remove(transition);
    }
}
