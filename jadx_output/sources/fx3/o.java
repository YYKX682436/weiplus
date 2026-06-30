package fx3;

/* loaded from: classes10.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.m implements yz5.l {
    public o(java.lang.Object obj) {
        super(1, obj, fx3.q.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fx3.r p07 = (fx3.r) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        fx3.q qVar = (fx3.q) this.receiver;
        qVar.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof fx3.g)) {
            fx3.g gVar = (fx3.g) dVar;
            jz5.g gVar2 = qVar.f267146d;
            ((em.g3) ((jz5.n) gVar2).getValue()).a().setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(qVar.getActivity()));
            qVar.f267147e = new xm3.t0(new com.tencent.mm.plugin.mvvmlist.MvvmList(new fx3.b(gVar.f267136b), new xm3.n0(), qVar.getActivity(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorListUIC$buildItemConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new fx3.j();
                }
            }, false);
            ((em.g3) ((jz5.n) gVar2).getValue()).a().setAdapter(qVar.f267147e);
            xm3.t0 t0Var = qVar.f267147e;
            if (t0Var != null) {
                t0Var.B = new fx3.l(qVar);
            }
            ((em.g3) ((jz5.n) gVar2).getValue()).a().post(new fx3.m(qVar, gVar));
        }
        return jz5.f0.f302826a;
    }
}
