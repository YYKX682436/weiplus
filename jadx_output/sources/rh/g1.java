package rh;

/* loaded from: classes12.dex */
public class g1 extends rh.o2 {
    public g1(rh.j1 j1Var, rh.j1 j1Var2, rh.j1 j1Var3) {
        super(j1Var2, j1Var3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        rh.f1 f1Var;
        rh.j1 j1Var = new rh.j1();
        rh.j1 j1Var2 = (rh.j1) this.f395485b;
        if (j1Var2.f395424d.size() > 0) {
            j1Var.f395425e = new java.util.ArrayList();
            for (rh.f1 f1Var2 : j1Var2.f395424d) {
                java.util.Iterator it = ((rh.j1) this.f395484a).f395424d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f1Var = null;
                        break;
                    }
                    f1Var = (rh.f1) it.next();
                    if (f1Var.f395387f == f1Var2.f395387f) {
                        break;
                    }
                }
                if (f1Var == null) {
                    f1Var = new rh.f1();
                    f1Var.f395387f = f1Var2.f395387f;
                    f1Var.f395388g = f1Var2.f395388g;
                    f1Var.f395386e = new java.util.ArrayList(f1Var2.f395386e.size());
                    java.util.Iterator it6 = f1Var2.f395386e.iterator();
                    while (it6.hasNext()) {
                        f1Var.f395386e.add(rh.y2.a(new long[((rh.y2) it6.next()).f395560a.size()]));
                    }
                }
                f1Var2.getClass();
                j1Var.f395425e.add(new rh.e1(f1Var2, f1Var, f1Var2));
            }
        }
        return j1Var;
    }
}
