package e51;

/* loaded from: classes10.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e51.j f249579d;

    public h(e51.j jVar) {
        this.f249579d = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        e51.j jVar = this.f249579d;
        jVar.i(currentPlayTime);
        if (((java.util.ArrayList) jVar.f249586g).size() != 0 || currentPlayTime < jVar.f249590k) {
            jVar.f249583d.a(jVar.f249584e);
        } else {
            jVar.h();
        }
    }
}
