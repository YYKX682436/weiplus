package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class il extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSubTabView f132313e;

    public il(com.tencent.mm.plugin.finder.view.FinderSubTabView finderSubTabView) {
        this.f132313e = finderSubTabView;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aet;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.view.kl item = (com.tencent.mm.plugin.finder.view.kl) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        throw null;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "care_top_tag");
        dy1.r ik6 = aVar.ik(holder.itemView, 40, 25496);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.view.FinderSubTabView finderSubTabView = this.f132313e;
        android.content.Context context = finderSubTabView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        android.content.Context context2 = finderSubTabView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        android.content.Context context3 = finderSubTabView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context3);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        android.content.Context context4 = finderSubTabView.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context4);
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        cy1.a aVar2 = (cy1.a) ik6;
        aVar2.gk(view, kz5.c1.k(lVarArr));
        aVar2.Ai(holder.itemView, new com.tencent.mm.plugin.finder.view.hl(holder));
    }
}
