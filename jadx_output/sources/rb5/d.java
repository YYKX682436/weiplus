package rb5;

/* loaded from: classes11.dex */
public class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb5.f f393865a;

    public d(rb5.f fVar) {
        this.f393865a = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f393865a.f393868b.f393888o = false;
        com.tencent.mars.xlog.Log.i("ChattingCompat", "klem animationEnd");
        rb5.l lVar = this.f393865a.f393868b;
        lVar.getClass();
        ku5.u0 u0Var = ku5.t0.f312615d;
        rb5.g gVar = new rb5.g(lVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(gVar, 60L, false);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rb5.f fVar = this.f393865a;
        com.tencent.mars.xlog.Log.i("ChattingCompat", "klem onAnimationStart onDrawed->onAnimationStart:%sms", java.lang.Long.valueOf(currentTimeMillis - fVar.f393867a));
        rb5.l lVar = fVar.f393868b;
        lVar.f393888o = true;
        lVar.f393885i.setTranslationX(0.0f);
        lVar.f393885i.e();
        fVar.f393868b.k(false, 0);
    }
}
