package r50;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.g f392572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r50.g gVar) {
        super(1);
        this.f392572d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            java.util.List list = state.f436775f;
            boolean z17 = ((java.util.ArrayList) list).size() > 1;
            r50.g gVar = this.f392572d;
            com.tencent.mm.ui.bk.s0(gVar.T6().l().getPaint());
            gVar.T6().l().setText(!z17 ? gVar.getContext().getString(com.tencent.mm.R.string.o3l) : gVar.getContext().getString(com.tencent.mm.R.string.o3o));
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
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.feature.forward.uic.ForwardMsgPreviewHeaderUIC$preViewPreViewDialogBuilderItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new q50.i();
                }
            }, arrayList, false);
            gVar.T6().b().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(gVar.getContext(), 1, false));
            gVar.T6().b().setAdapter(wxRecyclerAdapter);
            gVar.T6().c().getViewTreeObserver().addOnGlobalLayoutListener(new r50.c(gVar));
        }
        return jz5.f0.f302826a;
    }
}
