package ix3;

/* loaded from: classes10.dex */
public final /* synthetic */ class r1 extends kotlin.jvm.internal.m implements yz5.l {
    public r1(java.lang.Object obj) {
        super(1, obj, ix3.t1.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ix3.a2 p07 = (ix3.a2) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ix3.t1 t1Var = (ix3.t1) this.receiver;
        t1Var.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof ix3.k1)) {
            jz5.g gVar = t1Var.f295560d;
            ((em.z2) ((jz5.n) gVar).getValue()).a().setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(t1Var.getActivity()));
            t1Var.f295561e = new xm3.t0(new com.tencent.mm.plugin.mvvmlist.MvvmList(new ix3.f1(p07.f295361f, p07.f295362g), new xm3.n0(), t1Var.getActivity(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.uic.RepairerFileListUIC$buildItemConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new ix3.n1();
                }
            }, false);
            ((em.z2) ((jz5.n) gVar).getValue()).a().setAdapter(t1Var.f295561e);
            xm3.t0 t0Var = t1Var.f295561e;
            if (t0Var != null) {
                t0Var.B = new ix3.p1(t1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
