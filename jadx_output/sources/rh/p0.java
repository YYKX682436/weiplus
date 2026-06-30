package rh;

/* loaded from: classes12.dex */
public class p0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.k1 f395489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f395490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395491c;

    public p0(rh.c1 c1Var, rh.k1 k1Var, rh.d2 d2Var) {
        this.f395491c = c1Var;
        this.f395489a = k1Var;
        this.f395490b = d2Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.x0 x0Var;
        boolean z17;
        rh.c3 c3Var = (rh.c3) obj;
        int[] p17 = wh.m.p();
        rh.c1 c1Var = this.f395491c;
        rh.k1 k1Var = this.f395489a;
        if (k1Var != null && k1Var.y() && (x0Var = c1Var.f395333o) != null && x0Var.a(k1Var.f395435k)) {
            rh.x0 x0Var2 = c1Var.f395333o;
            x0Var2.getClass();
            for (int i17 = 0; i17 < p17.length; i17++) {
                int i18 = p17[i17];
                int[] iArr = (int[]) x0Var2.f395546a.get(i17);
                int i19 = iArr[0];
                java.util.List list = x0Var2.f395547b;
                if (i18 < i19) {
                    int[] iArr2 = (int[]) ((java.util.ArrayList) list).get(i17);
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= iArr.length) {
                            z17 = false;
                            break;
                        }
                        if (i18 <= iArr[i27]) {
                            int[] iArr3 = (int[]) ((java.util.ArrayList) list).get(i17);
                            iArr3[i27] = iArr3[i27] + 1;
                            z17 = true;
                            break;
                        }
                        i27++;
                    }
                    if (!z17 && i18 > iArr[iArr.length - 1]) {
                        int[] iArr4 = (int[]) ((java.util.ArrayList) list).get(i17);
                        int length = iArr.length - 1;
                        iArr4[length] = iArr4[length] + 1;
                    }
                }
            }
        }
        java.util.List list2 = this.f395490b.l(p17).f395538d.f395560a;
        oj.j.c("Matrix.battery.CompositeMonitors", c1Var.hashCode() + " #onSampling: " + c1Var.f395337s, new java.lang.Object[0]);
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + list2, new java.lang.Object[0]);
        if (list2.isEmpty()) {
            return rh.c3.f395339o;
        }
        java.util.Iterator it = list2.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((java.lang.Integer) ((rh.x2) it.next()).f395552a).intValue();
        }
        return java.lang.Long.valueOf(j17);
    }
}
