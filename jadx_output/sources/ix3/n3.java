package ix3;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f295504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ix3.o3 o3Var) {
        super(1);
        this.f295504d = o3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        hx3.b state = (hx3.b) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        ix3.o3 o3Var = this.f295504d;
        if (dVar != null && (dVar instanceof hx3.a)) {
            hx3.a aVar = (hx3.a) dVar;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) o3Var.findViewById(com.tencent.mm.R.id.lqa);
            if (wxRecyclerView != null) {
                wxRecyclerView.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(o3Var.getActivity()));
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = new com.tencent.mm.plugin.mvvmlist.MvvmList(new xw3.b(aVar.f285657b, state.f285658e), new xm3.n0(), o3Var.getActivity(), null, null, 24, null);
            if (wxRecyclerView != null) {
                xm3.t0 t0Var = new xm3.t0(mvvmList2, new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.uic.RepairerListUIC$buildItemCoverts$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new ex3.d();
                    }
                }, false);
                t0Var.B = o3Var.f295521i;
                wxRecyclerView.setAdapter(t0Var);
            }
            o3Var.f295516d = mvvmList2;
            o3Var.f295517e = new rl5.r(o3Var.getActivity());
            if (ih.d.c()) {
                if (!(th.o.f419262l.f419267e != null) && new com.tencent.mm.repairer.config.matrix.RepairerConfigBatteryCanary().o().contains(java.lang.String.valueOf(0))) {
                    bm5.o1.f22719a.p("RepairerConfig_Matrix_Battery_Top_Thread_Int_Int", 0);
                }
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof hx3.e) && r26.n0.N(((hx3.e) dVar2).f285661b) && (mvvmList = o3Var.f295516d) != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof hx3.c)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i17 = 0;
            for (java.lang.Object obj2 : ((hx3.c) dVar3).f285660b) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dp5 dp5Var = (r45.dp5) obj2;
                xw3.a aVar2 = xw3.b.f457727g;
                r45.ep5 ep5Var = (r45.ep5) dp5Var.getCustom(12);
                linkedList.add(new ex3.e(i17, 1, dp5Var, aVar2.a(dp5Var, ep5Var != null && ep5Var.getInteger(0) == 1)));
                i17 = i18;
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = o3Var.f295516d;
            if (mvvmList3 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.w(mvvmList3, linkedList, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
