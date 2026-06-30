package uj3;

/* loaded from: classes14.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f428350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(uj3.v0 v0Var) {
        super(1);
        this.f428350d = v0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yj3.g it = (yj3.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.Surface surface = it.f462683i;
        uj3.v0 v0Var = this.f428350d;
        if (surface != null) {
            v0Var.setBitmapBackgroundRenderTarget(surface);
        }
        it.f462682h = new uj3.s0(v0Var, it);
        return jz5.f0.f302826a;
    }
}
