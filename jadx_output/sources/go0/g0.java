package go0;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.h0 f273780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(go0.h0 h0Var) {
        super(0);
        this.f273780d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture b17;
        go0.h0 h0Var = this.f273780d;
        ft0.d dVar = h0Var.f273764m;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ft0.d dVar2 = h0Var.f273764m;
        if (dVar2 != null) {
            dVar2.d(null);
        }
        return jz5.f0.f302826a;
    }
}
