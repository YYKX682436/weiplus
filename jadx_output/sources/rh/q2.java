package rh;

/* loaded from: classes12.dex */
public abstract class q2 {
    public static rh.y2 a(rh.y2 y2Var, rh.y2 y2Var2) {
        boolean z17;
        rh.y2 b17 = rh.y2.b();
        for (int i17 = 0; i17 < y2Var2.f395560a.size(); i17++) {
            rh.z2 z2Var = (rh.z2) y2Var2.f395560a.get(i17);
            if (z2Var instanceof rh.x2) {
                if (y2Var.f395560a.size() > i17) {
                    rh.z2 z2Var2 = (rh.z2) y2Var.f395560a.get(i17);
                    if (z2Var2 instanceof rh.x2) {
                        b17.f395560a.add(rh.p2.a((rh.x2) z2Var2, (rh.x2) z2Var));
                    }
                }
                b17.f395560a.add(rh.x2.b(((rh.x2) z2Var).f395552a));
            } else if ((z2Var instanceof rh.s2) && !y2Var.f395560a.contains(z2Var)) {
                java.util.Iterator it = y2Var.f395560a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    rh.z2 z2Var3 = (rh.z2) it.next();
                    if (z2Var3 instanceof rh.s2) {
                        java.lang.Object obj = (rh.s2) z2Var3;
                        rh.s2 s2Var = (rh.s2) z2Var;
                        rh.s2 s2Var2 = rh.s2.f395505b;
                        if (s2Var == obj || s2Var.equals(obj)) {
                            s2Var = s2Var2;
                        }
                        if (s2Var == s2Var2) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (!z17) {
                    b17.f395560a.add(z2Var);
                }
            }
        }
        return b17;
    }
}
