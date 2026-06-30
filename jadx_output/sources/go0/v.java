package go0;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(go0.f0 f0Var) {
        super(0);
        this.f273873d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        is0.c c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("width:");
        go0.f0 f0Var = this.f273873d;
        sb6.append(f0Var.e());
        sb6.append(" height:");
        sb6.append(f0Var.d());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreRender", sb6.toString());
        ft0.d dVar = f0Var.f273764m;
        if (dVar != null) {
            dVar.e(null, f0Var.e(), f0Var.d());
        }
        ft0.d dVar2 = f0Var.f273764m;
        if (dVar2 != null && (c17 = dVar2.c()) != null) {
            int e17 = f0Var.e();
            int d17 = f0Var.d();
            c17.f294400m = e17;
            c17.f294401n = d17;
        }
        yz5.a aVar = f0Var.f273769r;
        if (aVar != null) {
        }
        return jz5.f0.f302826a;
    }
}
