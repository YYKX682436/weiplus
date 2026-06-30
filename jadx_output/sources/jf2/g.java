package jf2;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore H;
    public com.tencent.mm.view.recyclerview.WxRecyclerView I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f299371J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(context, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(store, "store");
        this.H = store;
        this.f299371J = new java.util.LinkedList();
        this.K = jz5.h.b(new jf2.b(context));
        this.L = jz5.h.b(new jf2.f(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dr8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.rpw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.I = wxRecyclerView;
        android.content.Context context = this.f118183e;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 5, 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.I;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("rv");
            throw null;
        }
        wxRecyclerView2.setAdapter((jf2.e) ((jz5.n) this.L).getValue());
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        java.util.LinkedList linkedList;
        super.V(e0Var, z17, i17);
        java.util.LinkedList linkedList2 = this.f299371J;
        linkedList2.clear();
        jf2.k0 k0Var = (jf2.k0) this.H.controller(jf2.k0.class);
        if (k0Var != null && (linkedList = k0Var.f299382q) != null) {
            linkedList2.addAll(linkedList);
        }
        ((jf2.e) ((jz5.n) this.L).getValue()).notifyDataSetChanged();
        int i18 = 0;
        for (java.lang.Object obj : linkedList2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            jf2.o oVar = (jf2.o) obj;
            jf2.l lVar = oVar instanceof jf2.l ? (jf2.l) oVar : null;
            if (lVar != null) {
                lVar.F(i18);
            }
            i18 = i19;
        }
    }
}
