package z;

/* loaded from: classes14.dex */
public final class o2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.c2 f468776b;

    public o2(z.l2 l2Var, z.c2 c2Var) {
        this.f468775a = l2Var;
        this.f468776b = c2Var;
    }

    @Override // n0.a2
    public void dispose() {
        z.f2 f2Var;
        z.l2 l2Var = this.f468775a;
        l2Var.getClass();
        z.c2 deferredAnimation = this.f468776b;
        kotlin.jvm.internal.o.g(deferredAnimation, "deferredAnimation");
        z.b2 b2Var = deferredAnimation.f468618c;
        if (b2Var == null || (f2Var = b2Var.f468595d) == null) {
            return;
        }
        l2Var.f468728h.remove(f2Var);
    }
}
