package ng3;

/* loaded from: classes10.dex */
public final class m implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng3.n f337016d;

    public m(ng3.n nVar) {
        this.f337016d = nVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        ng3.n nVar = this.f337016d;
        nVar.getClass();
        float f17 = 1;
        nVar.a(new ng3.o(ng3.t.f337037e, f17 + ((detector.getScaleFactor() - f17) * 3.0f), detector.getFocusX(), detector.getFocusY(), null, 16, null));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        this.f337016d.getClass();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        ng3.n nVar = this.f337016d;
        nVar.getClass();
        android.view.MotionEvent motionEvent = nVar.f337018d;
        if (motionEvent != null) {
            nVar.a(new ng3.o(ng3.t.f337038f, 0.0f, 0.0f, 0.0f, motionEvent, 14, null));
        }
    }
}
