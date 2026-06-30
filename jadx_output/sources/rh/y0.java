package rh;

/* loaded from: classes12.dex */
public class y0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.z0 f395558a;

    public y0(rh.z0 z0Var) {
        this.f395558a = z0Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        java.util.Map map;
        double d17;
        double d18;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        java.util.ArrayList arrayList2;
        double d19;
        rh.f1 f1Var = (rh.f1) ((rh.o2) obj).f395486c;
        rh.z0 z0Var = this.f395558a;
        long a17 = z0Var.f395571b.a(null);
        wh.n1 n1Var = z0Var.f395572c;
        java.lang.Double valueOf = java.lang.Double.valueOf(uh.i.f(n1Var, a17) + uh.i.h(n1Var, f1Var, a17) + uh.i.k(n1Var, f1Var, a17));
        java.util.Map map3 = z0Var.f395573d;
        map3.put("power-cpu-devDiff", valueOf);
        rh.x0 x0Var = z0Var.f395570a.f395333o;
        if (x0Var == null || !x0Var.a(n1Var)) {
            return;
        }
        long a18 = z0Var.f395571b.a(null);
        double f17 = uh.i.f(n1Var, a18);
        long j17 = 0;
        if (a18 > 0) {
            long j18 = 0;
            int i17 = 0;
            while (true) {
                arrayList = (java.util.ArrayList) x0Var.f395547b;
                if (i17 >= arrayList.size()) {
                    break;
                }
                for (int i18 = 0; i18 < ((int[]) arrayList.get(i17)).length; i18++) {
                    j18 += ((int[]) arrayList.get(i17))[i18];
                }
                i17++;
                j17 = 0;
            }
            if (j18 > j17) {
                int i19 = 0;
                d18 = 0.0d;
                while (i19 < arrayList.size()) {
                    int f18 = n1Var.f(i19);
                    double d27 = d18;
                    int i27 = 0;
                    long j19 = 0;
                    while (true) {
                        map2 = map3;
                        if (i27 >= ((int[]) arrayList.get(i19)).length) {
                            break;
                        }
                        int i28 = ((int[]) arrayList.get(i19))[i27];
                        if (i28 > 0) {
                            arrayList2 = arrayList;
                            d19 = f17;
                            d27 += (n1Var.d(f18, i27) / 3600000.0d) * ((i28 * 1.0f) / ((float) j18)) * ((float) a18);
                        } else {
                            arrayList2 = arrayList;
                            d19 = f17;
                        }
                        j19 += i28;
                        i27++;
                        map3 = map2;
                        arrayList = arrayList2;
                        f17 = d19;
                    }
                    java.util.ArrayList arrayList3 = arrayList;
                    double d28 = f17;
                    if (j19 > 0) {
                        d27 += (n1Var.c(f18) / 3600000.0d) * ((((float) j19) * 1.0f) / ((float) j18)) * ((float) a18);
                    }
                    d18 = d27;
                    i19++;
                    map3 = map2;
                    arrayList = arrayList3;
                    f17 = d28;
                }
                map = map3;
                d17 = f17;
                map.put("power-cpu-cpuFreq", java.lang.Double.valueOf(d17 + d18));
            }
        }
        map = map3;
        d17 = f17;
        d18 = 0.0d;
        map.put("power-cpu-cpuFreq", java.lang.Double.valueOf(d17 + d18));
    }
}
