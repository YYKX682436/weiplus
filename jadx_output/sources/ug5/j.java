package ug5;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427616f;

    public j(android.view.View view, android.view.View view2, ug5.v vVar) {
        this.f427614d = view;
        this.f427615e = view2;
        this.f427616f = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f427614d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f427615e;
        android.view.ViewPropertyAnimator animate = view2.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.view.ViewPropertyAnimator animate2 = view2.animate();
        ug5.v vVar = this.f427616f;
        animate2.setInterpolator(vVar.f427658a.f427605s).setDuration(vVar.f427658a.f427602p).alpha(vVar.f427658a.f427587a == ug5.b.f427581d ? 1.0f : 0.0f).start();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
