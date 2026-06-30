package mf3;

/* loaded from: classes12.dex */
public final class x implements mf3.n {

    /* renamed from: d, reason: collision with root package name */
    public final mf3.p f326131d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f326132e;

    public x(mf3.p apiCenter, java.util.List layers) {
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(layers, "layers");
        this.f326131d = apiCenter;
        this.f326132e = layers;
    }

    @Override // mf3.l
    public void F() {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).F();
        }
    }

    @Override // mf3.n
    public mf3.p G() {
        return this.f326131d;
    }

    @Override // mf3.l
    public void d(float f17) {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).d(f17);
        }
    }

    @Override // mf3.l
    public void i() {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        for (mf3.n nVar : this.f326132e) {
            if (nVar.l() != null) {
                return nVar.l();
            }
        }
        return null;
    }

    @Override // mf3.n
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            if (((mf3.n) it.next()).n(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // mf3.l
    public void onPause() {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).onPause();
        }
    }

    @Override // mf3.l
    public void onResume() {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).onResume();
        }
    }

    @Override // mf3.n
    public void p(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).p(value);
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).q(f17);
        }
    }

    @Override // mf3.l
    public void recycle() {
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).recycle();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).t(bindContext);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        java.util.Iterator it = this.f326132e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).u(parentView);
        }
    }
}
