package n91;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.e f335900d;

    public x(n91.e eVar) {
        this.f335900d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.o mo133getLifecycle;
        android.view.View rootView;
        n91.h hVar = (n91.h) this.f335900d;
        n91.n nVar = hVar.f335877a;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) nVar.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(nVar);
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = nVar.f335891d;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        if (eVar != null) {
            android.view.ViewGroup viewGroup2 = eVar.f281876f;
            if (viewGroup2 != null) {
                eVar.removeView(viewGroup2);
            }
            eVar.f281877g = null;
        }
        runtime.f74811t = null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = hVar.f335878b.f335872b;
        n91.g gVar = o6Var.K2;
        if (gVar != null) {
            com.tencent.mm.plugin.appbrand.wd wdVar = o6Var.E1;
            if (wdVar != null) {
                wdVar.a(gVar.f335875e);
                com.tencent.mm.plugin.appbrand.wd wdVar2 = o6Var.E1;
                com.tencent.mm.plugin.appbrand.td tdVar = wdVar2.f90960d;
                if (tdVar == null) {
                    if (tdVar != null && (mo133getLifecycle = tdVar.mo133getLifecycle()) != null) {
                        mo133getLifecycle.c((androidx.lifecycle.v) ((jz5.n) wdVar2.f90961e).getValue());
                    }
                    wdVar2.f90960d = null;
                    o6Var.E1 = null;
                }
            }
            gVar.b();
        }
    }
}
