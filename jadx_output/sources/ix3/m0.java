package ix3;

/* loaded from: classes10.dex */
public final /* synthetic */ class m0 extends kotlin.jvm.internal.m implements yz5.l {
    public m0(java.lang.Object obj) {
        super(1, obj, ix3.o0.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerBlockDetectState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ix3.p0 p07 = (ix3.p0) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ix3.o0 o0Var = (ix3.o0) this.receiver;
        o0Var.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof ix3.f0)) {
            jz5.g gVar = o0Var.f295512d;
            ((em.u2) ((jz5.n) gVar).getValue()).b().setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(o0Var.getActivity()));
            o0Var.f295513e = new xm3.t0(new com.tencent.mm.plugin.mvvmlist.MvvmList(new ix3.u(((ix3.f0) dVar).f295404b), new xm3.n0(), o0Var.getActivity(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.uic.RepairerBlockDetectListUIC$buildItemConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new ix3.i0();
                }
            }, false);
            ((em.u2) ((jz5.n) gVar).getValue()).b().setAdapter(o0Var.f295513e);
            xm3.t0 t0Var = o0Var.f295513e;
            if (t0Var != null) {
                t0Var.B = new ix3.k0(o0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
