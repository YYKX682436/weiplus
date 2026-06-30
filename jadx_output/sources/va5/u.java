package va5;

/* loaded from: classes11.dex */
public final class u implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va5.v f434454e;

    public u(android.view.View view, va5.v vVar) {
        this.f434453d = view;
        this.f434454e = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f434453d.getViewTreeObserver().removeOnPreDrawListener(this);
        va5.v vVar = this.f434454e;
        n3.t1 t1Var = new n3.t1(vVar);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (t1Var.hasNext()) {
                java.lang.Object next = t1Var.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (android.view.View) next;
                if (i18 < 0 || i18 > vVar.getChildCount() - 1 || i18 > ((java.util.ArrayList) vVar.f434456e.f434403b).size() - 1) {
                    break;
                }
                ((va5.c) ((java.util.ArrayList) vVar.f434456e.f434403b).get(i18)).f434410g = view.getWidth();
                i18 = i19;
            } else {
                java.util.Iterator it = vVar.f434456e.f434403b.iterator();
                while (it.hasNext()) {
                    i17 += ((va5.c) it.next()).f434410g;
                }
                vVar.setMTotalMenuWidth(i17);
            }
        }
    }
}
