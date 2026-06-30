package cw2;

/* loaded from: classes2.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView f223764d;

    public i1(com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView finderFullSeeLaterView) {
        this.f223764d = finderFullSeeLaterView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView finderFullSeeLaterView = this.f223764d;
        android.content.Context context = finderFullSeeLaterView.getContext();
        jz5.f0 f0Var = null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = finderFullSeeLaterView.getFeed();
            if (feed != null) {
                vn2.u0 u0Var = vn2.u0.f438387a;
                int i17 = com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView.C;
                if (u0Var.a("Finder.FullSeeLaterView", "click", mMActivity, feed, false, finderFullSeeLaterView.getNeedClickAction(), finderFullSeeLaterView.getPlayPercent())) {
                    com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView.A(finderFullSeeLaterView);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                int i18 = com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView.C;
                com.tencent.mars.xlog.Log.e("Finder.FullSeeLaterView", "click but feed is null!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
