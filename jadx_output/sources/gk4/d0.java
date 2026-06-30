package gk4;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f272541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gk4.h0 h0Var, yz5.a aVar) {
        super(0);
        this.f272540d = h0Var;
        this.f272541e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk4.h0 h0Var = this.f272540d;
        h0Var.getClass();
        h0Var.f272572q = new is0.c(true, 15L);
        h0Var.f272571p = new os0.e(0, 0, 0, 0, 1, 1, 12, null);
        this.f272540d.f272567l = new com.tencent.mm.xeffect.VLogDirector();
        this.f272540d.f272567l.c();
        java.lang.String str = this.f272540d.f272556a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finished init and set effectManager, effectManager.nPtr:");
        com.tencent.mm.xeffect.effect.EffectManager effectManager = this.f272540d.f272568m;
        sb6.append(effectManager != null ? java.lang.Long.valueOf(effectManager.f214805a) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f272540d.E = true;
        gk4.h0 h0Var2 = this.f272540d;
        android.graphics.SurfaceTexture surfaceTexture = h0Var2.f272559d;
        if (surfaceTexture != null) {
            h0Var2.c(surfaceTexture);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new gk4.c0(this.f272541e));
        return jz5.f0.f302826a;
    }
}
