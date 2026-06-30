package wr3;

/* loaded from: classes11.dex */
public final class h0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment f448812d;

    public h0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment) {
        this.f448812d = bizProfileTabCommonFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.l5 l5Var;
        r45.y5 y5Var;
        r45.p5 p5Var;
        r45.l5 l5Var2;
        r45.y5 y5Var2;
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment = this.f448812d;
        r45.tj6 t07 = bizProfileTabCommonFragment.t0(wlVar);
        r45.ul ulVar = null;
        java.util.List list = (t07 == null || (glVar4 = t07.f386509e) == null) ? null : glVar4.f375323d;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.List list2 = list;
        java.util.LinkedList linkedList = (t07 == null || (glVar3 = t07.f386509e) == null) ? null : glVar3.f375327h;
        java.lang.Integer valueOf = (t07 == null || (glVar2 = t07.f386509e) == null) ? null : java.lang.Integer.valueOf(glVar2.f375328i);
        if (t07 != null && (glVar = t07.f386509e) != null) {
            ulVar = glVar.f375326g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.tencent.mm.plugin.profile.ui.tab.b.c(wlVar, bizProfileTabCommonFragment.getContext());
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String str = c17;
        bizProfileTabCommonFragment.F0(bizProfileTabCommonFragment.m0(), t07);
        r45.s5 s5Var = (r45.s5) kz5.n0.Z(list2);
        int i17 = (s5Var == null || (y5Var2 = s5Var.f385509d) == null) ? 0 : y5Var2.f390792f;
        java.util.Iterator it = bizProfileTabCommonFragment.f154429s.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            vr3.h hVar = (vr3.h) next;
            r45.s5 s5Var2 = hVar.f439631a;
            int i18 = (s5Var2 == null || (p5Var = s5Var2.f385514i) == null || (l5Var2 = p5Var.f382753d) == null) ? 0 : l5Var2.f379138d;
            int i19 = (s5Var2 == null || (y5Var = s5Var2.f385509d) == null) ? 0 : y5Var.f390792f;
            if (hVar.f439632b != wr3.n0.f448845i || i19 >= i17) {
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    r45.p5 p5Var2 = ((r45.s5) it6.next()).f385514i;
                    if ((p5Var2 == null || (l5Var = p5Var2.f382753d) == null || l5Var.f379138d != i18) ? false : true) {
                        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).wi(i18);
                        it.remove();
                    }
                }
            } else {
                ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).wi(i18);
                it.remove();
            }
        }
        this.f448812d.H0(list2, linkedList, ulVar2, str, valueOf);
        bizProfileTabCommonFragment.o0().a(bizProfileTabCommonFragment.q0(wlVar));
        com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "refresh topic");
    }
}
