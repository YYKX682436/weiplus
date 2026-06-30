package vb4;

/* loaded from: classes4.dex */
public class i extends vb4.b {
    public i(android.app.Activity activity, android.view.View view, boolean z17) {
        super(activity, view, z17);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f434795b = ofFloat;
        ofFloat.addUpdateListener(new vb4.g(this, z17));
        this.f434795b.addListener(new vb4.h(this));
        if (z17) {
            this.f434795b.setDuration(300L);
        } else {
            this.f434795b.setDuration(400L);
        }
    }
}
