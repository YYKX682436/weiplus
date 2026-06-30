package j0;

/* loaded from: classes14.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f296641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f296642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.v f296644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j0.c5 c5Var, c1.d0 d0Var, boolean z17, k0.y0 y0Var, g2.v vVar) {
        super(1);
        this.f296640d = c5Var;
        this.f296641e = d0Var;
        this.f296642f = z17;
        this.f296643g = y0Var;
        this.f296644h = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((d1.e) obj).f225627a;
        boolean z17 = !this.f296642f;
        j0.c5 c5Var = this.f296640d;
        j0.p1.e(c5Var, this.f296641e, z17);
        if (c5Var.b()) {
            if (c5Var.a() != j0.v1.Selection) {
                j0.d5 d5Var = c5Var.f296239g;
                if (d5Var != null) {
                    yz5.l onValueChange = c5Var.f296247o;
                    g2.e editProcessor = c5Var.f296235c;
                    kotlin.jvm.internal.o.g(editProcessor, "editProcessor");
                    g2.v offsetMapping = this.f296644h;
                    kotlin.jvm.internal.o.g(offsetMapping, "offsetMapping");
                    kotlin.jvm.internal.o.g(onValueChange, "onValueChange");
                    int b17 = d5Var.b(j17, true);
                    ((j0.a5) onValueChange).invoke(g2.e0.a(editProcessor.f267691a, null, a2.n1.a(b17, b17), null, 5, null));
                    if (c5Var.f296233a.f296403a.length() > 0) {
                        ((n0.q4) c5Var.f296240h).setValue(j0.v1.Cursor);
                    }
                }
            } else {
                this.f296643g.g(new d1.e(j17));
            }
        }
        return jz5.f0.f302826a;
    }
}
