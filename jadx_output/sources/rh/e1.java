package rh;

/* loaded from: classes12.dex */
public class e1 extends rh.o2 {
    public e1(rh.f1 f1Var, rh.f1 f1Var2, rh.f1 f1Var3) {
        super(f1Var2, f1Var3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        rh.f1 f1Var = new rh.f1();
        rh.f1 f1Var2 = (rh.f1) this.f395485b;
        f1Var.f395387f = f1Var2.f395387f;
        f1Var.f395388g = f1Var2.f395388g;
        rh.f1 f1Var3 = (rh.f1) this.f395484a;
        if (f1Var3.f395385d.size() != f1Var2.f395385d.size()) {
            f1Var.f395365c = false;
        } else {
            f1Var.f395385d = new java.util.ArrayList();
            for (int i17 = 0; i17 < f1Var2.f395385d.size(); i17++) {
                f1Var.f395385d.add(rh.q2.a((rh.y2) f1Var3.f395385d.get(i17), (rh.y2) f1Var2.f395385d.get(i17)));
            }
            f1Var.f395386e = new java.util.ArrayList();
            for (int i18 = 0; i18 < f1Var2.f395386e.size(); i18++) {
                f1Var.f395386e.add(rh.q2.a((rh.y2) f1Var3.f395386e.get(i18), (rh.y2) f1Var2.f395386e.get(i18)));
            }
        }
        return f1Var;
    }
}
