package d0;

/* loaded from: classes14.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.x1 f225231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(d0.x1 x1Var, s1.o1 o1Var, s1.x0 x0Var) {
        super(1);
        this.f225231d = x1Var;
        this.f225232e = o1Var;
        this.f225233f = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        d0.x1 x1Var = this.f225231d;
        boolean z17 = x1Var.f225240f;
        float f17 = x1Var.f225239e;
        float f18 = x1Var.f225238d;
        s1.x0 x0Var = this.f225233f;
        if (z17) {
            s1.n1.e(layout, this.f225232e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        } else {
            s1.n1.b(layout, this.f225232e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
