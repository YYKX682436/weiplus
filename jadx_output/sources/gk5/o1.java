package gk5;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.r1 f272691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gk5.r1 r1Var) {
        super(1);
        this.f272691d = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        java.util.List list = state.f436775f;
        gk5.r1 r1Var = this.f272691d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            ((java.util.ArrayList) list).size();
            com.tencent.mm.ui.bk.s0(r1Var.T6().l().getPaint());
            r1Var.T6().l().setText(r1Var.getContext().getString(com.tencent.mm.R.string.ond));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList3.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(new q50.a((java.lang.String) next, !(i17 == arrayList3.size() - 1)));
                i17 = i18;
            }
            arrayList.addAll(arrayList2);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.ui.transmit.uic.VoIPMsgPreviewHeaderUIC$preViewPreViewDialogBuilderItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new q50.i();
                }
            }, arrayList, false);
            r1Var.T6().b().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(r1Var.getContext(), 1, false));
            r1Var.T6().b().setAdapter(wxRecyclerAdapter);
            r1Var.T6().d().setVisibility(8);
            r1Var.T6().a().setText(r1Var.getContext().getString(com.tencent.mm.R.string.nc_));
            r1Var.T6().a().setIcon(com.tencent.mm.R.raw.icon_filled_voice_call);
            r1Var.T6().c().getViewTreeObserver().addOnGlobalLayoutListener(new gk5.n1(r1Var));
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wg5.d)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
            r1Var.getActivity().setResult(-1, intent);
            r1Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
