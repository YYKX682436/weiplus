package tn0;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(tn0.w0 w0Var, java.lang.String str) {
        super(1);
        this.f420681d = w0Var;
        this.f420682e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        tn0.w0 w0Var = this.f420681d;
        w0Var.f420759f.post(new tn0.h0(w0Var, (android.graphics.SurfaceTexture) obj, this.f420682e));
        return jz5.f0.f302826a;
    }
}
