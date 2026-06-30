package rh;

/* loaded from: classes12.dex */
public class z0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.a1 f395571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f395572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f395573d;

    public z0(rh.b1 b1Var, rh.c1 c1Var, rh.a1 a1Var, wh.n1 n1Var, java.util.Map map) {
        this.f395570a = c1Var;
        this.f395571b = a1Var;
        this.f395572c = n1Var;
        this.f395573d = map;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.a1 a1Var;
        wh.n1 n1Var;
        rh.o2 o2Var = (rh.o2) obj;
        rh.c1 c1Var = this.f395570a;
        qh.f0 f0Var = c1Var.f395329k;
        if (f0Var == null) {
            return;
        }
        java.util.Iterator it = ((rh.j1) o2Var.f395486c).f395425e.iterator();
        double d17 = 0.0d;
        double d18 = 0.0d;
        while (true) {
            boolean hasNext = it.hasNext();
            a1Var = this.f395571b;
            n1Var = this.f395572c;
            if (!hasNext) {
                break;
            }
            rh.f1 f1Var = (rh.f1) ((rh.o2) it.next()).f395486c;
            long a17 = a1Var.a(f1Var.f395388g);
            d18 += uh.i.f(n1Var, a17) + uh.i.i(n1Var, f1Var, a17, false) + uh.i.l(n1Var, f1Var, a17, false);
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(d18);
        java.util.Map map = this.f395573d;
        map.put("power-cpu-uidDiff", valueOf);
        if (f0Var.f363335d.D) {
            java.util.Iterator it6 = ((rh.j1) o2Var.f395486c).f395425e.iterator();
            while (it6.hasNext()) {
                rh.f1 f1Var2 = (rh.f1) ((rh.o2) it6.next()).f395486c;
                long a18 = a1Var.a(f1Var2.f395388g);
                d17 += uh.i.f(n1Var, a18) + uh.i.i(n1Var, f1Var2, a18, true) + uh.i.l(n1Var, f1Var2, a18, true);
            }
            map.put("power-cpu-uidDiffScale", java.lang.Double.valueOf(d17));
            c1Var.u(rh.f1.class, new rh.y0(this));
        }
    }
}
