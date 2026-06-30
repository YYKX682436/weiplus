package xn5;

/* loaded from: classes13.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f455669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn5.g f455670e;

    public f(java.util.List list, xn5.g gVar) {
        this.f455669d = list;
        this.f455670e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long nanoTime = java.lang.System.nanoTime();
        xn5.c cVar = new xn5.c(this.f455670e, "ViewCreate", xn5.d.f455660e, nanoTime, 0, 8, null);
        java.util.List list = this.f455669d;
        list.add(cVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList<jz5.o> arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            xn5.c cVar2 = (xn5.c) obj;
            if (i17 > 0) {
                xn5.c cVar3 = (xn5.c) list.get(i17 - 1);
                arrayList.add(new jz5.o(java.lang.Integer.valueOf(cVar3.f455653b), java.lang.Integer.valueOf(cVar2.f455653b), java.lang.Float.valueOf(((float) (cVar2.f455652a - cVar3.f455652a)) / 1000000.0f)));
            }
            i17 = i18;
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new xn5.e());
        }
        for (jz5.o oVar : arrayList) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
            sb7.append(((java.lang.Number) oVar.f302841d).intValue());
            sb7.append('-');
            sb7.append(((java.lang.Number) oVar.f302842e).intValue());
            sb7.append(": ");
            java.lang.String format = java.lang.String.format("%.3fms", java.util.Arrays.copyOf(new java.lang.Object[]{oVar.f302843f}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            sb7.append(format);
            sb7.append("] ");
            sb6.append(sb7.toString());
        }
        xn5.c cVar4 = (xn5.c) kz5.n0.a0(list, 0);
        long j17 = nanoTime - (cVar4 != null ? cVar4.f455652a : 0L);
        xn5.g gVar = this.f455670e;
        gVar.j();
        int i19 = gVar.f455673a;
        int i27 = gVar.f455674b;
        kotlin.jvm.internal.o.f(java.lang.String.format("%.3fms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) j17) / 1000000.0f)}, 1)), "format(...)");
    }
}
