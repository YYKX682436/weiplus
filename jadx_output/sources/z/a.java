package z;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f468566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.r f468567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f468568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f468569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z.e eVar, z.r rVar, yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f468566d = eVar;
        this.f468567e = rVar;
        this.f468568f = lVar;
        this.f468569g = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.o animate = (z.o) obj;
        kotlin.jvm.internal.o.g(animate, "$this$animate");
        z.e eVar = this.f468566d;
        z.z1.f(animate, eVar.f468632c);
        java.lang.Object a17 = z.e.a(eVar, animate.b());
        boolean b17 = kotlin.jvm.internal.o.b(a17, animate.b());
        yz5.l lVar = this.f468568f;
        if (!b17) {
            ((n0.q4) eVar.f468632c.f468811e).setValue(a17);
            ((n0.q4) this.f468567e.f468811e).setValue(a17);
            if (lVar != null) {
                lVar.invoke(eVar);
            }
            animate.a();
            this.f468569g.f310112d = true;
        } else if (lVar != null) {
            lVar.invoke(eVar);
        }
        return jz5.f0.f302826a;
    }
}
