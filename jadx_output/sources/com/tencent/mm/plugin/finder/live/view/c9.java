package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class c9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116230d;

    public c9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f116230d = finderLiveProductRecordView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.nt2 nt2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordFinishView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.j0 j0Var = (ml2.j0) c17;
        mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
        ml2.j0.Qj(j0Var, 6, (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.getInteger(1), 0L, 0, 12, null);
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116230d;
        android.content.Context context = finderLiveProductRecordView.f116075f;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(finderLiveProductRecordView.getContext().getString(com.tencent.mm.R.string.e6q));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.e6p);
        u1Var.k(finderLiveProductRecordView.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
        u1Var.j(finderLiveProductRecordView.getContext().getString(com.tencent.mm.R.string.e6o));
        u1Var.b(new com.tencent.mm.plugin.finder.live.view.b9(finderLiveProductRecordView));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordFinishView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
