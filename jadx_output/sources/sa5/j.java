package sa5;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public sa5.k f405348a;

    /* renamed from: b, reason: collision with root package name */
    public sa5.p f405349b;

    /* renamed from: c, reason: collision with root package name */
    public sa5.w f405350c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f405351d;

    public abstract void a();

    public final void b(yz5.a aVar, long j17) {
        if (e()) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            c();
            android.view.View view = this.f405351d;
            if (view != null) {
                view.post(new sa5.i(this, j17, aVar));
            }
        }
    }

    public abstract void c();

    public void d() {
        sa5.p pVar;
        float measuredWidth = this.f405351d != null ? r0.getMeasuredWidth() : 0.0f;
        float measuredHeight = this.f405351d != null ? r2.getMeasuredHeight() : 0.0f;
        android.view.View view = this.f405351d;
        if (view == null || (pVar = this.f405349b) == null) {
            return;
        }
        sa5.r rVar = sa5.r.f405369a;
        sa5.v vVar = pVar.f405366d;
        if (kotlin.jvm.internal.o.b(vVar, rVar)) {
            float f17 = 2;
            view.setPivotX(measuredWidth / f17);
            view.setPivotY(measuredHeight / f17);
        } else if (kotlin.jvm.internal.o.b(vVar, sa5.q.f405368a)) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(measuredHeight);
        } else if (kotlin.jvm.internal.o.b(vVar, sa5.s.f405370a)) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(0.0f);
        }
    }

    public abstract boolean e();

    public android.view.animation.Interpolator f() {
        return ta5.h.f416879a.a();
    }

    public abstract void g(android.view.ViewPropertyAnimator viewPropertyAnimator);

    public void h(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
