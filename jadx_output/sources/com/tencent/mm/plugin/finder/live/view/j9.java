package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class j9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116418d;

    public j9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f116418d = finderLiveProductRecordView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mm2.i7 i7Var;
        r45.nt2 nt2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordLaunchView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.j0 j0Var = (ml2.j0) c17;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
        ml2.j0.Qj(j0Var, 4, (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.getInteger(1), 0L, 0, 12, null);
        mm2.h5 h5Var = (mm2.h5) efVar.i(mm2.h5.class);
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116418d;
        if (h5Var == null || (i7Var = h5Var.f329112g) == null) {
            mm2.i7 i7Var2 = finderLiveProductRecordView.f116077h;
            if (i7Var2 != null) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.c(finderLiveProductRecordView, 105, i7Var2, new com.tencent.mm.plugin.finder.live.view.i9(i7Var2, finderLiveProductRecordView));
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderLiveProductRecordView.getContext());
            u1Var.g(finderLiveProductRecordView.getContext().getString(com.tencent.mm.R.string.e6y));
            u1Var.a(true);
            u1Var.b(new com.tencent.mm.plugin.finder.live.view.h9(i7Var, finderLiveProductRecordView));
            u1Var.q(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordLaunchView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
