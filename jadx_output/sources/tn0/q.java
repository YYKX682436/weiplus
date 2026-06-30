package tn0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tn0.w0 w0Var, int i17) {
        super(1);
        this.f420736d = w0Var;
        this.f420737e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        tn0.w0 w0Var = this.f420736d;
        w0Var.f420759f.post(new tn0.p(w0Var, (android.graphics.SurfaceTexture) obj, this.f420737e));
        return jz5.f0.f302826a;
    }
}
