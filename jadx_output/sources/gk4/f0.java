package gk4;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gk4.h0 h0Var) {
        super(0);
        this.f272551d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f272551d.f272556a, "release");
        gk4.h0 h0Var = this.f272551d;
        h0Var.f272573r = false;
        is0.c cVar = h0Var.f272569n;
        if (cVar != null) {
            cVar.close();
        }
        gk4.h0 h0Var2 = this.f272551d;
        h0Var2.f272569n = null;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = h0Var2.f272568m;
        if (effectManager != null) {
            effectManager.f();
        }
        this.f272551d.f272567l.b();
        is0.c cVar2 = this.f272551d.f272572q;
        if (cVar2 != null) {
            cVar2.close();
        }
        os0.e eVar = this.f272551d.f272571p;
        if (eVar != null) {
            eVar.n();
        }
        rs0.h hVar = this.f272551d.f272562g;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        gk4.h0 h0Var3 = this.f272551d;
        h0Var3.f272562g = null;
        android.os.HandlerThread handlerThread = h0Var3.f272561f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        gk4.h0 h0Var4 = this.f272551d;
        h0Var4.f272561f = null;
        h0Var4.f272560e = null;
        android.graphics.SurfaceTexture surfaceTexture = h0Var4.f272559d;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f272551d.E = false;
        this.f272551d.getClass();
        this.f272551d.getClass();
        com.tencent.mm.xeffect.effect.EffectManager effectManager2 = this.f272551d.f272568m;
        if (effectManager2 != null) {
            effectManager2.k();
        }
        this.f272551d.f272568m = null;
        return jz5.f0.f302826a;
    }
}
