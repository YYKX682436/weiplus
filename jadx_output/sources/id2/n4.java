package id2;

/* loaded from: classes8.dex */
public final class n4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f290695a;

    public n4(id2.s4 s4Var) {
        this.f290695a = s4Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        cl0.g gVar = new cl0.g();
        gVar.h("switch_status", java.lang.String.valueOf(z17 ? 1 : 0));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        id2.s4 s4Var = this.f290695a;
        java.lang.String str = s4Var.f290797e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_more_recent_switch", gVar2);
        if (z17) {
            id2.s4.O6(s4Var, 1, new id2.m4(s4Var));
            return;
        }
        android.app.Activity context = s4Var.getContext();
        id2.l4 l4Var = new id2.l4(s4Var);
        s4Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
        k0Var.q(context.getResources().getString(com.tencent.mm.R.string.mah), 17);
        k0Var.f211872n = new id2.o4(context);
        k0Var.f211881s = new id2.q4(s4Var, context, l4Var);
        k0Var.f211854d = new id2.r4(s4Var, l4Var);
        k0Var.v();
        java.lang.String str2 = s4Var.f290797e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(str2, "", b52.b.b(), "person_page_more_recent_switch_pop", "");
    }
}
