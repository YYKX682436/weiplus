package i81;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f289625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i81.a0 f289626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, i81.a0 a0Var) {
        super(0);
        this.f289625d = appBrandRuntime;
        this.f289626e = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i81.a0.f289517d.remove(this.f289625d, this.f289626e);
        i81.a0.f289518e.remove(this.f289625d.f74803n, this.f289625d);
        return jz5.f0.f302826a;
    }
}
