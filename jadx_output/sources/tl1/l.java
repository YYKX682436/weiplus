package tl1;

/* loaded from: classes15.dex */
public class l implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl1.v f420212a;

    public l(tl1.v vVar) {
        this.f420212a = vVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        tl1.v vVar = this.f420212a;
        vVar.setBackgroundResource(com.tencent.mm.R.color.a0z);
        vVar.f420228q = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
