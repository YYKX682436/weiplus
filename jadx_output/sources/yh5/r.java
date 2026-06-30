package yh5;

/* loaded from: classes12.dex */
public final class r extends pf3.g {

    /* renamed from: v, reason: collision with root package name */
    public final yh5.p f462443v;

    /* renamed from: w, reason: collision with root package name */
    public final fg3.g f462444w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f462445x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mf3.p apiCenter) {
        super(apiCenter, "CleanGallery.VideoSourceLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f462443v = new yh5.p(apiCenter);
        this.f462444w = new fg3.g(apiCenter);
        this.f462445x = "";
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        this.f462444w.F();
        this.f462443v.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new android.widget.FrameLayout(context);
    }

    @Override // mf3.e
    public java.lang.String L() {
        return this.f462445x;
    }

    @Override // pf3.g
    public void a0() {
        this.f462444w.a0();
        this.f462443v.a0();
    }

    @Override // pf3.g, pf3.h
    public void c() {
        this.f462444w.c();
        this.f462443v.c();
    }

    @Override // pf3.g, mf3.l
    public void d(float f17) {
        this.f462444w.d(f17);
        this.f462443v.d(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void i() {
        this.f462444w.i();
        this.f462443v.i();
    }

    @Override // pf3.d, mf3.n
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return this.f462444w.n(event) || this.f462443v.n(event);
    }

    @Override // mf3.l
    public void onPause() {
        this.f462444w.getClass();
        this.f462443v.getClass();
    }

    @Override // mf3.l
    public void onResume() {
        this.f462444w.reset();
        this.f462443v.onResume();
        a0();
    }

    @Override // mf3.e, mf3.n
    public void p(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f462445x = value;
        yh5.p pVar = this.f462443v;
        pVar.getClass();
        pVar.f326106f = value;
        fg3.g gVar = this.f462444w;
        gVar.getClass();
        gVar.f326106f = value;
    }

    @Override // pf3.g, mf3.l
    public void q(float f17) {
        this.f462444w.q(f17);
        this.f462443v.q(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void recycle() {
        this.f462444w.recycle();
        this.f462443v.recycle();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        this.f462444w.t(bindContext);
        this.f462443v.t(bindContext);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        this.f462443v.u(parentView);
        this.f462444w.u(parentView);
    }
}
