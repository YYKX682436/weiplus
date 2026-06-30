package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public final class l0 extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159953a;

    public l0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159953a = t0Var;
    }

    @Override // qt5.f
    public void a() {
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159953a;
        t0Var.i(new com.tencent.mm.plugin.scanner.view.h0(t0Var));
        if (((qt5.c) this.f159953a.f215302e).f366657b) {
            uo.n.f429522a.f(this.f159953a.getContext());
            return;
        }
        uo.n nVar = uo.n.f429522a;
        android.content.Context context = this.f159953a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        nVar.a(context, qt5.c.class);
        com.tencent.mm.plugin.scanner.view.t0 t0Var2 = this.f159953a;
        nVar.g(3, true, new com.tencent.mm.plugin.scanner.view.i0(t0Var2), new com.tencent.mm.plugin.scanner.view.k0(t0Var2));
    }
}
