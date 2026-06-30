package kz3;

/* loaded from: classes15.dex */
public final class z implements sy3.a {

    /* renamed from: a, reason: collision with root package name */
    public final db5.f0 f313945a;

    public z(db5.f0 currentImageView) {
        kotlin.jvm.internal.o.g(currentImageView, "currentImageView");
        this.f313945a = currentImageView;
    }

    @Override // sy3.a
    public void a(float f17, float f18, float f19) {
        this.f313945a.p(f17, f18, f19);
    }

    @Override // sy3.a
    public float b(float f17, float f18) {
        return this.f313945a.b(f17, f18);
    }

    @Override // sy3.a
    public float c() {
        return this.f313945a.getScaleRate();
    }

    @Override // sy3.a
    public float d() {
        return this.f313945a.getScale();
    }

    @Override // sy3.a
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // sy3.a
    public void e(sy3.b bVar) {
    }

    @Override // sy3.a
    public void f() {
        this.f313945a.i();
    }

    @Override // sy3.a
    public void reset() {
    }
}
