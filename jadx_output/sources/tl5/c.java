package tl5;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f420333d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f420334e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f420335f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f420336g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Scroller f420337h;

    /* renamed from: i, reason: collision with root package name */
    public float f420338i;

    public c(android.view.View driveView, int i17, yz5.l onUpdate, yz5.a onComplete) {
        kotlin.jvm.internal.o.g(driveView, "driveView");
        kotlin.jvm.internal.o.g(onUpdate, "onUpdate");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        this.f420333d = i17;
        this.f420334e = onUpdate;
        this.f420335f = onComplete;
        this.f420336g = new java.lang.ref.WeakReference(driveView);
        this.f420337h = new android.widget.Scroller(driveView.getContext(), new tl5.b());
    }

    public final void a() {
        this.f420337h.forceFinished(true);
        android.view.View view = (android.view.View) this.f420336g.get();
        if (view != null) {
            view.removeCallbacks(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean computeScrollOffset = this.f420337h.computeScrollOffset();
        yz5.a aVar = this.f420335f;
        yz5.l lVar = this.f420334e;
        if (!computeScrollOffset) {
            lVar.invoke(java.lang.Float.valueOf(this.f420338i));
            aVar.invoke();
            return;
        }
        float a17 = h3.a.a(r0.getCurrX() / 1.0E8f, 0.0f, 1.0f);
        lVar.invoke(java.lang.Float.valueOf(a17));
        if (java.lang.Math.abs(a17 - this.f420338i) < 1.0E-4f) {
            aVar.invoke();
            return;
        }
        android.view.View view = (android.view.View) this.f420336g.get();
        if (view != null) {
            view.postOnAnimation(this);
        }
    }
}
