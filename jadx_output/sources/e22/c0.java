package e22;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e22.d1 d1Var, boolean z17, yz5.l lVar, yz5.a aVar) {
        super(1);
        this.f246625d = d1Var;
        this.f246626e = z17;
        this.f246627f = lVar;
        this.f246628g = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f0.t0 LazyVerticalGrid = (f0.t0) obj;
        kotlin.jvm.internal.o.g(LazyVerticalGrid, "$this$LazyVerticalGrid");
        e22.d1 d1Var = this.f246625d;
        x0.i0 i0Var = d1Var.f246637h;
        boolean z17 = this.f246626e;
        yz5.l lVar = this.f246627f;
        yz5.a aVar = this.f246628g;
        f0.z0 z0Var = (f0.z0) LazyVerticalGrid;
        z0Var.a(i0Var.size(), null, null, new e22.a0(e22.z.f246766d, i0Var), u0.j.c(699646206, true, new e22.b0(i0Var, d1Var, z17, lVar, aVar)));
        return jz5.f0.f302826a;
    }
}
