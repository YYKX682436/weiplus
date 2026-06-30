package fn4;

/* loaded from: classes4.dex */
public class s0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bl5 f264606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.t0 f264607e;

    public s0(fn4.t0 t0Var, r45.bl5 bl5Var) {
        this.f264607e = t0Var;
        this.f264606d = bl5Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "requestVideoUrlResultParse";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f264606d.f370857d.f388732d.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.wz6 wz6Var = (r45.wz6) it.next();
            r45.xn6 xn6Var = new r45.xn6();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wz6Var.f389607d.f390853d)) {
                xn6Var.f390259h = wz6Var.f389607d.f390853d;
                r45.bz6 bz6Var = wz6Var.f389609f;
                if (bz6Var != null && bz6Var.f371182d == 1) {
                    r45.fv fvVar = bz6Var.f371184f;
                    if (fvVar != null && !com.tencent.mm.sdk.platformtools.t8.L0(fvVar.f374612d)) {
                        xn6Var.K.clear();
                        r45.bz6 bz6Var2 = wz6Var.f389609f;
                        xn6Var.Q = bz6Var2.f371185g;
                        java.util.Iterator it6 = bz6Var2.f371184f.f374612d.iterator();
                        while (it6.hasNext()) {
                            r45.ev6 ev6Var = (r45.ev6) it6.next();
                            r45.zn6 zn6Var = new r45.zn6();
                            zn6Var.f392244d = ev6Var.f373752d.i();
                            zn6Var.f392245e = 0;
                            xn6Var.K.add(zn6Var);
                            xn6Var.f390254J = ev6Var.f373754f;
                        }
                        r45.zn6 f17 = pm4.w.f(xn6Var.K);
                        if (f17 != null) {
                            xn6Var.f390256e = f17.f392244d;
                            xn6Var.U = f17.f392245e;
                        }
                    }
                } else if (bz6Var != null && bz6Var.f371182d == 2) {
                    r45.fv fvVar2 = bz6Var.f371183e;
                    if (fvVar2 != null && !com.tencent.mm.sdk.platformtools.t8.L0(fvVar2.f374612d)) {
                        xn6Var.K.clear();
                        r45.bz6 bz6Var3 = wz6Var.f389609f;
                        xn6Var.Q = bz6Var3.f371185g;
                        java.util.Iterator it7 = bz6Var3.f371183e.f374612d.iterator();
                        while (it7.hasNext()) {
                            r45.ev6 ev6Var2 = (r45.ev6) it7.next();
                            r45.zn6 zn6Var2 = new r45.zn6();
                            zn6Var2.f392244d = ev6Var2.f373752d.i();
                            zn6Var2.f392245e = 0;
                            xn6Var.K.add(zn6Var2);
                            xn6Var.f390254J = ev6Var2.f373754f;
                        }
                        r45.zn6 f18 = pm4.w.f(xn6Var.K);
                        if (f18 != null) {
                            xn6Var.f390256e = f18.f392244d;
                            xn6Var.U = f18.f392245e;
                        }
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(wz6Var.f389610g)) {
                    xn6Var.K.clear();
                    fn4.z0.s(xn6Var, wz6Var.f389610g, "");
                    r45.zn6 f19 = pm4.w.f(xn6Var.K);
                    if (f19 != null) {
                        xn6Var.f390256e = f19.f392244d;
                        xn6Var.U = f19.f392245e;
                        r45.bz6 bz6Var4 = wz6Var.f389609f;
                        if (bz6Var4 != null) {
                            xn6Var.Q = bz6Var4.f371185g;
                        }
                    }
                }
                arrayList.add(xn6Var);
            }
        }
        synchronized (this.f264607e.f264610e) {
            java.util.List b17 = this.f264607e.f264610e.b();
            if (com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
                return;
            }
            while (true) {
                java.util.LinkedList linkedList = (java.util.LinkedList) b17;
                if (i17 >= linkedList.size()) {
                    return;
                }
                r45.xn6 xn6Var2 = (r45.xn6) linkedList.get(i17);
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    r45.xn6 xn6Var3 = (r45.xn6) it8.next();
                    if (xn6Var2.f390259h.equals(xn6Var3.f390259h)) {
                        xn6Var2.K = xn6Var3.K;
                        xn6Var2.f390254J = xn6Var3.f390254J;
                        xn6Var2.f390256e = xn6Var3.f390256e;
                        xn6Var2.Q = xn6Var3.Q;
                    }
                }
                i17++;
            }
        }
    }
}
