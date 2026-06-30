package n7;

/* loaded from: classes13.dex */
public abstract class k extends n7.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f335236d;

    /* renamed from: e, reason: collision with root package name */
    public final n7.j f335237e;

    public k(android.view.View view) {
        q7.n.b(view);
        this.f335236d = view;
        this.f335237e = new n7.j(view);
    }

    @Override // n7.h
    public m7.b a() {
        java.lang.Object tag = this.f335236d.getTag(com.tencent.mm.R.id.f485174u04);
        if (tag == null) {
            return null;
        }
        if (tag instanceof m7.b) {
            return (m7.b) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // n7.h
    public void d(m7.b bVar) {
        this.f335236d.setTag(com.tencent.mm.R.id.f485174u04, bVar);
    }

    @Override // n7.h
    public void e(n7.g gVar) {
        ((java.util.ArrayList) this.f335237e.f335234b).remove(gVar);
    }

    @Override // n7.h
    public void f(n7.g gVar) {
        n7.j jVar = this.f335237e;
        int c17 = jVar.c();
        int b17 = jVar.b();
        boolean z17 = false;
        if (c17 > 0 || c17 == Integer.MIN_VALUE) {
            if (b17 > 0 || b17 == Integer.MIN_VALUE) {
                z17 = true;
            }
        }
        if (z17) {
            ((m7.h) gVar).l(c17, b17);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f335234b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (jVar.f335235c == null) {
            android.view.ViewTreeObserver viewTreeObserver = jVar.f335233a.getViewTreeObserver();
            n7.i iVar = new n7.i(jVar);
            jVar.f335235c = iVar;
            viewTreeObserver.addOnPreDrawListener(iVar);
        }
    }

    public java.lang.String toString() {
        return "Target for: " + this.f335236d;
    }
}
