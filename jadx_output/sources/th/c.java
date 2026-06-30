package th;

/* loaded from: classes14.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th.d f419235e;

    public c(th.d dVar, android.view.View view) {
        this.f419235e = dVar;
        this.f419234d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        th.d dVar = this.f419235e;
        android.view.View view = dVar.f419243n.f419267e;
        if (view == null || view.hashCode() != dVar.f419242m) {
            return;
        }
        dVar.f419240h.x = ((java.lang.Integer) valueAnimator.getAnimatedValue("trans")).intValue();
        dVar.f419241i.updateViewLayout(this.f419234d, dVar.f419240h);
    }
}
