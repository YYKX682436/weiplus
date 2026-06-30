package rk4;

/* loaded from: classes10.dex */
public final class d5 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingFlutterActivity f396610a;

    public d5(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity) {
        this.f396610a = tingFlutterActivity;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.TingFlutterActivity.a7(this.f396610a, false);
    }

    @Override // al4.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.ting.TingFlutterActivity.a7(this.f396610a, true);
    }

    @Override // al4.b
    public void onAnimationStart() {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = this.f396610a;
        rk4.k5.c("onAnimationStart switchToTextureView", tingFlutterActivity.getB());
        tingFlutterActivity.Z6();
    }
}
