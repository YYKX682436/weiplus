package oa5;

/* loaded from: classes8.dex */
public class m extends oa5.j {
    @Override // oa5.b
    public oa5.b k(oa5.a aVar) {
        if (((android.view.ViewPropertyAnimator) this.f343882g.get()) != null) {
            this.f343859e = aVar;
        }
        return this;
    }

    @Override // oa5.j, oa5.b
    public void l() {
        java.lang.System.currentTimeMillis();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f343882g.get();
        java.lang.Runnable runnable = this.f343857c;
        if (runnable != null) {
            this.f343855a.put(ofFloat, runnable);
            this.f343857c = null;
        }
        java.lang.Runnable runnable2 = this.f343858d;
        if (runnable2 != null) {
            this.f343856b.put(ofFloat, runnable2);
            this.f343858d = null;
        }
        viewPropertyAnimator.setListener(new oa5.k(this, ofFloat));
        if (this.f343859e != null) {
            viewPropertyAnimator.setUpdateListener(new oa5.l(this));
        }
        viewPropertyAnimator.start();
    }
}
