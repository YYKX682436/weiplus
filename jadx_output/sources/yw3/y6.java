package yw3;

/* loaded from: classes11.dex */
public final /* synthetic */ class y6 extends kotlin.jvm.internal.m implements yz5.l {
    public y6(java.lang.Object obj) {
        super(1, obj, yw3.a7.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yw3.b7 p07 = (yw3.b7) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        yw3.a7 a7Var = (yw3.a7) this.receiver;
        a7Var.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof yw3.r6)) {
            yw3.r6 r6Var = (yw3.r6) dVar;
            jz5.g gVar = a7Var.f466693d;
            em.p3 p3Var = (em.p3) ((jz5.n) gVar).getValue();
            if (p3Var.f254706b == null) {
                p3Var.f254706b = (com.tencent.mm.view.recyclerview.WxRecyclerView) p3Var.f254705a.findViewById(com.tencent.mm.R.id.lqa);
            }
            p3Var.f254706b.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(a7Var.getActivity()));
            a7Var.f466694e = new xm3.t0(new com.tencent.mm.plugin.mvvmlist.MvvmList(new yw3.l6(r6Var.f466869b), new xm3.n0(), a7Var.getActivity(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoListUIC$buildItemConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new yw3.u6();
                }
            }, false);
            em.p3 p3Var2 = (em.p3) ((jz5.n) gVar).getValue();
            if (p3Var2.f254706b == null) {
                p3Var2.f254706b = (com.tencent.mm.view.recyclerview.WxRecyclerView) p3Var2.f254705a.findViewById(com.tencent.mm.R.id.lqa);
            }
            p3Var2.f254706b.setAdapter(a7Var.f466694e);
            xm3.t0 t0Var = a7Var.f466694e;
            if (t0Var != null) {
                t0Var.B = new yw3.w6(a7Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
