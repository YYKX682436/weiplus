package cw2;

/* loaded from: classes2.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223724d;

    public g2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223724d = finderFullSeekBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$refreshRotationBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.f130546x0;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223724d;
        boolean w17 = finderFullSeekBarLayout.w();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fullScreenBtn clicked isFullScreenMode");
        sb6.append(w17);
        sb6.append(" feed=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderFullSeekBarLayout.H;
        r45.gn2 gn2Var = null;
        sb6.append((baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null) ? null : feedObject2.getDebugDescription());
        com.tencent.mars.xlog.Log.i("Finder.FullSeekBarLayout", sb6.toString());
        android.content.Context context = finderFullSeekBarLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = finderFullSeekBarLayout.H;
        cw2.ba baVar = finderFullSeekBarLayout.N;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = baVar instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) baVar : null;
        in5.s0 s0Var = ptVar.f135615p;
        so2.j5 j5Var = s0Var != null ? (so2.j5) s0Var.f293125i : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        com.tencent.mm.plugin.finder.viewmodel.component.pt.b7(ptVar, baseFinderFeed3 != null ? java.lang.Long.valueOf(baseFinderFeed3.getItemId()) : null, null, new com.tencent.mm.plugin.finder.convert.s8(!w17), 2, null);
        if (w17) {
            if (finderVideoLayout != null) {
                finderVideoLayout.Y(null, true);
            }
        } else if (finderVideoLayout != null) {
            if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null && (mediaList = feedObject.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null) {
                gn2Var = (r45.gn2) mb4Var.getCustom(45);
            }
            finderVideoLayout.Y(new cw2.t4(gn2Var, com.tencent.mm.pluginsdk.ui.e1.CROP), true);
        }
        ptVar.Q = finderVideoLayout;
        if (finderFullSeekBarLayout.isSeekMode && !finderFullSeekBarLayout.isPendingExitMode) {
            finderFullSeekBarLayout.t("fullScreenBtn#clicked");
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.C(finderFullSeekBarLayout);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$refreshRotationBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
