package n3;

/* loaded from: classes15.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f334454a;

    public z1(android.view.View view) {
        this.f334454a = new java.lang.ref.WeakReference(view);
    }

    public n3.z1 a(float f17) {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            view.animate().alpha(f17);
        }
        return this;
    }

    public void b() {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public n3.z1 c(long j17) {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            view.animate().setDuration(j17);
        }
        return this;
    }

    public n3.z1 d(n3.c2 c2Var) {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            if (c2Var != null) {
                view.animate().setListener(new n3.a2(this, c2Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    public n3.z1 e(final n3.e2 e2Var) {
        final android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            n3.b2.a(view.animate(), e2Var != null ? new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: n3.z1$$a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    n3.e2.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void f() {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public n3.z1 g(float f17) {
        android.view.View view = (android.view.View) this.f334454a.get();
        if (view != null) {
            view.animate().translationY(f17);
        }
        return this;
    }
}
