package xu;

/* loaded from: classes9.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.m implements yz5.l {
    public n(java.lang.Object obj) {
        super(1, obj, xu.p.class, "observeState", "observeState(Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hu.e p07 = (hu.e) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        xu.p pVar = (xu.p) this.receiver;
        pVar.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof hu.a)) {
            jz5.g gVar = pVar.f457183d;
            em.r2 r2Var = (em.r2) ((jz5.n) gVar).getValue();
            if (r2Var.f254758b == null) {
                r2Var.f254758b = (com.tencent.mm.view.recyclerview.WxRecyclerView) r2Var.f254757a.findViewById(com.tencent.mm.R.id.lqa);
            }
            r2Var.f254758b.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(pVar.getActivity()));
            s15.w wVar = p07.f285003f;
            if (wVar == null) {
                wVar = new s15.w();
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(new uu.d(wVar), new xm3.n0(), pVar.getActivity(), null, null, 24, null);
            pVar.f457184e = new xm3.t0(mvvmList, new com.tencent.mm.feature.appmsg.ui.uic.RecordDetailItemConvertFactory(p07.f285002e, mvvmList), false);
            em.r2 r2Var2 = (em.r2) ((jz5.n) gVar).getValue();
            if (r2Var2.f254758b == null) {
                r2Var2.f254758b = (com.tencent.mm.view.recyclerview.WxRecyclerView) r2Var2.f254757a.findViewById(com.tencent.mm.R.id.lqa);
            }
            r2Var2.f254758b.setAdapter(pVar.f457184e);
            xm3.t0 t0Var = pVar.f457184e;
            if (t0Var != null) {
                t0Var.B = new xu.l(pVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
