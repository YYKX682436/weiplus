package i81;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f289627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i81.a0 f289628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, i81.a0 a0Var) {
        super(1);
        this.f289627d = appBrandRuntime;
        this.f289628e = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        lifecycle.b(new i81.w(this.f289627d, this.f289628e));
        return jz5.f0.f302826a;
    }
}
