package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116776d;

    public w8(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f116776d = finderLiveProductRecordView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$manualRecordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116776d;
        mm2.i7 i7Var = finderLiveProductRecordView.f116077h;
        r45.hd5 hd5Var = i7Var != null ? i7Var.f329148e : null;
        if (i7Var != null && hd5Var != null) {
            if (hd5Var.getInteger(5) == 1000) {
                if (hd5Var.getInteger(2) > 0) {
                    long e17 = c01.id.e() - hd5Var.getInteger(2);
                    int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.f116072s;
                    if (e17 < 5) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ml2.j0.Qj((ml2.j0) c17, 7, 1, 0L, 0, 12, null);
                        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.e(finderLiveProductRecordView, com.tencent.mm.R.string.e6v);
                    }
                }
                com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.c(finderLiveProductRecordView, 106, i7Var, new com.tencent.mm.plugin.finder.live.view.v8(finderLiveProductRecordView, i7Var));
            } else {
                com.tencent.mars.xlog.Log.i(finderLiveProductRecordView.f116073d, "no recording");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$manualRecordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
