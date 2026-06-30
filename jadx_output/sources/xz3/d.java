package xz3;

/* loaded from: classes15.dex */
public final class d implements tz3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f458212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f458213b;

    public d(xz3.f fVar, sz3.x0 x0Var) {
        this.f458212a = fVar;
        this.f458213b = x0Var;
    }

    @Override // tz3.c
    public void a() {
        xz3.f fVar = this.f458212a;
        fVar.f458216e.j(fVar);
    }

    @Override // tz3.c
    public void b(sz3.c1 c1Var) {
        java.util.ArrayList arrayList;
        sz3.a1 a1Var;
        java.util.ArrayList arrayList2;
        sz3.x0 x0Var = this.f458213b;
        if (c1Var == null || c1Var.f413981h.isEmpty()) {
            com.tencent.mm.plugin.scanner.model.d.a(24, x0Var.f414152f);
        }
        int i17 = 0;
        com.tencent.mm.plugin.scanner.model.d1.o(false);
        xz3.f fVar = this.f458212a;
        if (c1Var != null && (arrayList2 = c1Var.f413981h) != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                sz3.a1 a1Var2 = (sz3.a1) it.next();
                sz3.a1 a1Var3 = fVar.f458215d.f413945b;
                sz3.y0 y0Var = a1Var3.f413963e;
                y0Var.f414166g = a1Var2.f413963e.f414166g;
                sz3.b1 b1Var = a1Var3.f413962d;
                a1Var2.f413961c = b1Var;
                a1Var2.f413962d = b1Var;
                a1Var2.f413963e = y0Var;
                a1Var2.f413964f = x0Var.f414152f;
            }
        }
        java.util.Iterator it6 = x0Var.f414151e.iterator();
        while (true) {
            if (!it6.hasNext()) {
                if ((c1Var != null ? c1Var.f413982i : null) == null && c1Var != null) {
                    c1Var.f413982i = c1Var.a();
                }
                fVar.f458216e.f(c1Var, x0Var, new xz3.c(fVar, x0Var));
                return;
            }
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sz3.w0 w0Var = (sz3.w0) next;
            if (c1Var != null && (arrayList = c1Var.f413981h) != null && (a1Var = (sz3.a1) kz5.n0.a0(arrayList, i17)) != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(w0Var.f414138i);
                com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var.f413959a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask uploadFullImage success set origin trackId: %s, trackId: %s, hashCode: %s", valueOf, java.lang.Integer.valueOf(scanProductInfo.getId()), java.lang.Integer.valueOf(a1Var.hashCode()));
                w0Var.f414138i = scanProductInfo.getId();
            }
            i17 = i18;
        }
    }
}
