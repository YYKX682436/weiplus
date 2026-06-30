package fk3;

/* loaded from: classes8.dex */
public final class n implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.e f263584b;

    public n(fk3.o oVar, jk3.e eVar) {
        this.f263583a = oVar;
        this.f263584b = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ek3.d dVar = this.f263583a.f263587c;
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
        ek3.d dVar = this.f263583a.f263587c;
        if (dVar != null) {
            return dVar.p(ev6);
        }
        return false;
    }

    @Override // ak3.a
    public int e() {
        ek3.d dVar = this.f263583a.f263587c;
        if (dVar != null) {
            return dVar.f253586a;
        }
        return 0;
    }

    @Override // ak3.a
    public boolean enableSwipeBack() {
        fk3.o oVar = this.f263583a;
        if (oVar.f263590f == -1) {
            oVar.f263591g = ((jk3.b) this.f263584b).s();
            oVar.f263590f = 0L;
        }
        return oVar.f263591g && g();
    }

    @Override // ak3.a
    public void f(float f17) {
    }

    @Override // ak3.a
    public boolean g() {
        return this.f263584b.d();
    }

    @Override // ak3.a
    public int h(boolean z17) {
        return 0;
    }
}
