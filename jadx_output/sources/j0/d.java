package j0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f296250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.g0 f296251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.z f296252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f17, e1.g0 g0Var, e1.z zVar) {
        super(1);
        this.f296250d = f17;
        this.f296251e = g0Var;
        this.f296252f = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(onDrawWithContent, "$this$onDrawWithContent");
        u1.o0 o0Var = (u1.o0) onDrawWithContent;
        o0Var.b();
        e1.g0 g0Var = this.f296251e;
        e1.z zVar = this.f296252f;
        g1.b bVar = (g1.b) o0Var.p();
        long b17 = bVar.b();
        bVar.a().c();
        g1.d dVar = (g1.d) bVar.f267504a;
        dVar.e(this.f296250d, 0.0f);
        dVar.c(45.0f, d1.e.f225623b);
        g1.h.d(onDrawWithContent, g0Var, 0L, 0.0f, null, zVar, 0, 46, null);
        bVar.a().b();
        bVar.c(b17);
        return jz5.f0.f302826a;
    }
}
