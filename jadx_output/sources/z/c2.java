package z;

/* loaded from: classes14.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f468616a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f468617b;

    /* renamed from: c, reason: collision with root package name */
    public z.b2 f468618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468619d;

    public c2(z.l2 l2Var, z.w2 typeConverter, java.lang.String label) {
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.o.g(label, "label");
        this.f468619d = l2Var;
        this.f468616a = typeConverter;
        this.f468617b = label;
    }

    public final n0.e5 a(yz5.l transitionSpec, yz5.l targetValueByState) {
        kotlin.jvm.internal.o.g(transitionSpec, "transitionSpec");
        kotlin.jvm.internal.o.g(targetValueByState, "targetValueByState");
        z.b2 b2Var = this.f468618c;
        z.l2 l2Var = this.f468619d;
        if (b2Var == null) {
            b2Var = new z.b2(this, new z.f2(l2Var, targetValueByState.invoke(l2Var.b()), z.s.c(this.f468616a, targetValueByState.invoke(l2Var.b())), this.f468616a, this.f468617b), transitionSpec, targetValueByState);
            this.f468618c = b2Var;
            z.f2 animation = b2Var.f468595d;
            kotlin.jvm.internal.o.g(animation, "animation");
            l2Var.f468728h.add(animation);
        }
        b2Var.f468597f = targetValueByState;
        b2Var.f468596e = transitionSpec;
        b2Var.b(l2Var.c());
        return b2Var;
    }
}
