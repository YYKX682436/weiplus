package d6;

/* loaded from: classes14.dex */
public final class f implements d6.l {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f226639c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f226640d;

    public f(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f226639c = view;
        this.f226640d = z17;
    }

    @Override // d6.h
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        coil.size.PixelSize b17 = d6.i.b(this);
        if (b17 != null) {
            return b17;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        android.view.ViewTreeObserver viewTreeObserver = this.f226639c.getViewTreeObserver();
        d6.k kVar = new d6.k(this, viewTreeObserver, rVar);
        viewTreeObserver.addOnPreDrawListener(kVar);
        rVar.m(new d6.j(this, viewTreeObserver, kVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d6.f) {
            d6.f fVar = (d6.f) obj;
            if (kotlin.jvm.internal.o.b(this.f226639c, fVar.f226639c)) {
                if (this.f226640d == fVar.f226640d) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f226639c.hashCode() * 31) + java.lang.Boolean.hashCode(this.f226640d);
    }

    public java.lang.String toString() {
        return "RealViewSizeResolver(view=" + this.f226639c + ", subtractPadding=" + this.f226640d + ')';
    }
}
