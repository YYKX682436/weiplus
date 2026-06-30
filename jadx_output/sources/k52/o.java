package k52;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public k52.f f304317a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f304319c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.Pair f304320d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f304322f;

    /* renamed from: h, reason: collision with root package name */
    public int f304324h;

    /* renamed from: i, reason: collision with root package name */
    public long f304325i;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f304318b = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final k52.n f304321e = new k52.n(this);

    /* renamed from: g, reason: collision with root package name */
    public final k52.m f304323g = new k52.m(this);

    public static final void a(k52.o oVar, android.view.View view, java.lang.String str, java.lang.Object obj, k52.g gVar) {
        k52.f fVar;
        oVar.getClass();
        int id6 = view.getId();
        k52.p pVar = k52.q.f304326a;
        java.lang.String c17 = id6 == -1 ? pVar.c(view) : pVar.b(view);
        java.lang.String r17 = view.getId() == -1 ? c17 : b52.b.r(view.getId());
        r45.a07 a07Var = new r45.a07();
        a07Var.f369602e = c17;
        a07Var.f369601d = r17;
        a07Var.f369609o = java.lang.System.currentTimeMillis();
        a07Var.f369607m = view.hashCode();
        a07Var.f369603f = b52.b.g(view.getClass().getName());
        if (obj != null) {
            str = obj.getClass().getName();
        }
        a07Var.f369605h = b52.b.g(str);
        a07Var.f369606i = gVar.f304306d;
        a07Var.f369615u = view instanceof android.view.ViewGroup ? 1 : 0;
        if (gVar != k52.g.f304294e && (fVar = oVar.f304317a) != null) {
            ((k52.j) fVar).a(view, a07Var);
        }
        int hashCode = view.hashCode();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (hashCode != oVar.f304324h || currentTimeMillis - oVar.f304325i >= 500) {
            oVar.f304324h = hashCode;
            oVar.f304325i = currentTimeMillis;
            java.util.Iterator it = ((java.util.ArrayList) oVar.f304318b).iterator();
            while (it.hasNext()) {
                e42.j0 j0Var = (e42.j0) it.next();
                if (gVar == k52.g.f304295f) {
                    j0Var.x(view);
                } else if (gVar == k52.g.f304294e) {
                    j0Var.C(view);
                } else if (gVar == k52.g.f304296g) {
                    j0Var.k(view);
                } else if (gVar == k52.g.f304297h) {
                    j0Var.K(view);
                } else if (gVar == k52.g.f304298i) {
                    j0Var.h(view);
                } else if (gVar == k52.g.f304299m) {
                    j0Var.b(view);
                } else if (gVar == k52.g.f304300n) {
                    j0Var.e(view);
                } else if (gVar == k52.g.f304302p) {
                    j0Var.l(view);
                } else {
                    j0Var.D(view);
                }
            }
        }
    }
}
