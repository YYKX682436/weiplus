package tn0;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(tn0.w0 w0Var, int i17) {
        super(1);
        this.f420790d = w0Var;
        this.f420791e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        tn0.w0 w0Var = this.f420790d;
        w0Var.f420759f.post(new tn0.y(w0Var, (android.graphics.SurfaceTexture) obj, this.f420791e));
        return jz5.f0.f302826a;
    }
}
