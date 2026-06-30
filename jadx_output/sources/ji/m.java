package ji;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ji.o f299892d;

    public m(ji.o oVar) {
        this.f299892d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        ji.o oVar = this.f299892d;
        oVar.getClass();
        com.tencent.matrix.util.MemInfo b17 = com.tencent.matrix.util.MemInfo.f53095p.b();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = false;
        ji.p pVar = oVar.f299896c;
        ji.q qVar = pVar.f299897a;
        com.tencent.matrix.util.JavaMemInfo javaMemInfo = b17.f53099g;
        kotlin.jvm.internal.o.d(javaMemInfo);
        jz5.l lVar = new jz5.l("java", java.lang.Boolean.valueOf(qVar.a(javaMemInfo.f53091f, new ji.i(b17, c0Var))));
        com.tencent.matrix.util.NativeMemInfo nativeMemInfo = b17.f53100h;
        kotlin.jvm.internal.o.d(nativeMemInfo);
        jz5.l lVar2 = new jz5.l("native", java.lang.Boolean.valueOf(pVar.f299898b.a(nativeMemInfo.f53107f, new ji.j(b17, c0Var))));
        kotlin.jvm.internal.o.d(b17.f53103n);
        jz5.l lVar3 = new jz5.l("debugPss", java.lang.Boolean.valueOf(pVar.f299899c.a(r4.f53114d, new ji.k(b17, c0Var))));
        kotlin.jvm.internal.o.d(b17.f53102m);
        jz5.l[] lVarArr = {lVar, lVar2, lVar3, new jz5.l("amsPss", java.lang.Boolean.valueOf(pVar.f299900d.a(r4.f53114d, new ji.l(b17, c0Var))))};
        for (int i17 = 0; i17 < 4; i17++) {
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "is over threshold ? " + lVarArr[i17], new java.lang.Object[0]);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= 4) {
                z17 = false;
                break;
            } else {
                if (((java.lang.Boolean) lVarArr[i18].f302834e).booleanValue()) {
                    z17 = true;
                    break;
                }
                i18++;
            }
        }
        oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "check: overThreshold: " + z17 + ", shouldCallback: " + c0Var.f310112d + ' ' + b17, new java.lang.Object[0]);
        if (z17 && c0Var.f310112d) {
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "report over threshold", new java.lang.Object[0]);
            pVar.f299904h.invoke(b17);
        }
    }
}
