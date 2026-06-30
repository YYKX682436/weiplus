package rk4;

/* loaded from: classes10.dex */
public final class b5 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingFlutterActivity f396562a;

    public b5(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity) {
        this.f396562a = tingFlutterActivity;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = this.f396562a;
        rk4.k5.c("onAnimationCancel switchToSurfaceView", tingFlutterActivity.getB());
        tingFlutterActivity.Y6();
    }

    @Override // al4.b
    public void onAnimationEnd() {
        rk4.k5.c("onAnimationEnd switchToSurfaceView", this.f396562a.getB());
        ((ku5.t0) ku5.t0.f312615d).B(new rk4.a5(this.f396562a));
    }

    @Override // al4.b
    public void onAnimationStart() {
        this.f396562a.Z6();
    }
}
