package ng3;

/* loaded from: classes10.dex */
public final class b extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public android.view.VelocityTracker f336992c;

    /* renamed from: d, reason: collision with root package name */
    public float f336993d;

    /* renamed from: e, reason: collision with root package name */
    public float f336994e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336995f;

    public b() {
        super("drag");
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((java.util.ArrayList) this.f337005b).clear();
        if (this.f336992c == null) {
            this.f336992c = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f336992c;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(event);
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        int yVelocity = (int) velocityTracker.getYVelocity();
        int action = event.getAction() & 255;
        if (action == 0) {
            this.f336993d = event.getRawX();
            this.f336994e = event.getRawY();
            c("drag raw down, downX:" + this.f336993d + " downY:" + this.f336994e);
        } else if (action == 1) {
            this.f336995f = false;
            a(new ng3.c(ng3.t.f337051v, 0.0f, 0.0f));
            android.view.VelocityTracker velocityTracker2 = this.f336992c;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f336992c = null;
        } else if (action == 2) {
            float rawX = event.getRawX() - this.f336993d;
            float rawY = event.getRawY() - this.f336994e;
            c("drag exit check: tx:" + rawX + " ty:" + rawY + " velocityX:" + xVelocity + " velocityY:" + yVelocity);
            if (this.f336995f) {
                a(new ng3.c(ng3.t.f337050u, rawX, rawY));
                return true;
            }
            if (java.lang.Math.abs(rawX) <= 250.0d && rawY > 10.0f && yVelocity > 100 && java.lang.Math.abs(yVelocity) > java.lang.Math.abs(xVelocity) && !this.f336995f) {
                this.f336993d = event.getRawX();
                this.f336994e = event.getRawY();
                float rawX2 = event.getRawX() - this.f336993d;
                float rawY2 = event.getRawY() - this.f336994e;
                c("drag raw prepare, downX:" + this.f336993d + " downY:" + this.f336994e);
                c("drag raw prepare: tx:" + rawX2 + " ty:" + rawY2 + " velocityX:" + xVelocity + " velocityY:" + yVelocity);
                this.f336995f = true;
                a(new ng3.c(ng3.t.f337049t, rawX2, rawY2));
                a(new ng3.c(ng3.t.f337050u, rawX2, rawY2));
                return true;
            }
        }
        return false;
    }

    @Override // ng3.e
    public void e() {
        this.f336995f = false;
        this.f336992c = android.view.VelocityTracker.obtain();
    }
}
