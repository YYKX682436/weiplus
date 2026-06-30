package kz0;

/* loaded from: classes14.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f313821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.TextureView textureView) {
        super(2);
        this.f313821d = textureView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        android.view.TextureView textureView = this.f313821d;
        if (textureView != null) {
            r2.f0.a(new kz0.t0(textureView), null, kz0.u0.f313813d, oVar, 384, 2);
        }
        return jz5.f0.f302826a;
    }
}
