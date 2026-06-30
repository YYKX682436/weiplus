package gk3;

/* loaded from: classes8.dex */
public final class l implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.e f272524b;

    public l(gk3.m mVar, jk3.e eVar) {
        this.f272523a = mVar;
        this.f272524b = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ek3.d dVar = this.f272523a.f272527c;
        if (dVar != null) {
            dVar.j(event);
        }
    }

    @Override // ak3.a
    public void c(int i17, int i18) {
    }

    @Override // ak3.a
    public boolean d(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        ek3.d dVar = this.f272523a.f272527c;
        if (dVar != null) {
            return dVar.p(ev6);
        }
        return false;
    }

    @Override // ak3.a
    public int e() {
        ek3.d dVar = this.f272523a.f272527c;
        if (dVar != null) {
            return dVar.f253586a;
        }
        return 0;
    }

    @Override // ak3.a
    public boolean enableSwipeBack() {
        gk3.m mVar = this.f272523a;
        if (mVar.f272531g == -1) {
            mVar.f272532h = ((jk3.b) this.f272524b).s();
            mVar.f272531g = 0L;
        }
        return mVar.f272532h;
    }

    @Override // ak3.a
    public void f(float f17) {
    }

    @Override // ak3.a
    public boolean g() {
        return this.f272524b.d();
    }

    @Override // ak3.a
    public int h(boolean z17) {
        return 0;
    }
}
