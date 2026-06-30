package mj;

/* loaded from: classes14.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f326954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj.d f326955e;

    public c(mj.d dVar, android.view.View view) {
        this.f326955e = dVar;
        this.f326954d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        mj.d dVar = this.f326955e;
        mj.i iVar = dVar.f326961i;
        if (iVar.f326973c) {
            iVar.f326972b.x = ((java.lang.Integer) valueAnimator.getAnimatedValue("trans")).intValue();
            mj.i iVar2 = dVar.f326961i;
            iVar2.f326971a.updateViewLayout(this.f326954d, iVar2.f326972b);
        }
    }
}
