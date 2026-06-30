package lp2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f320277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment f320278e;

    public a(com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment finderLiveFindPageFragment) {
        this.f320278e = finderLiveFindPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - this.f320277d < ((long) 500);
        this.f320277d = currentTimeMillis;
        if (z17) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareFragment", "fast click, too fast guys.");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment finderLiveFindPageFragment = this.f320278e;
        finderLiveFindPageFragment.A0();
        if (finderLiveFindPageFragment.getActivity() != null) {
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(finderLiveFindPageFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            cl0.g gVar = new cl0.g();
            android.view.View view2 = finderLiveFindPageFragment.f206301h;
            com.google.android.material.tabs.TabLayout tabLayout = view2 != null ? (com.google.android.material.tabs.TabLayout) view2.findViewById(com.tencent.mm.R.id.nv8) : null;
            java.lang.Object obj = (tabLayout == null || (k17 = tabLayout.k(tabLayout != null ? tabLayout.getSelectedTabPosition() : 0)) == null) ? null : k17.f343778a;
            qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
            gVar.s("tab_id", java.lang.Integer.valueOf(iVar != null ? iVar.f365786c : 0));
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
            finderBroadcastEidClickStruct.u("");
            finderBroadcastEidClickStruct.p("");
            finderBroadcastEidClickStruct.B("");
            finderBroadcastEidClickStruct.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderBroadcastEidClickStruct.w(Ri);
            java.lang.String string = V6.getString(1);
            if (string == null) {
                string = "";
            }
            finderBroadcastEidClickStruct.r(string);
            finderBroadcastEidClickStruct.q("94");
            finderBroadcastEidClickStruct.A("");
            finderBroadcastEidClickStruct.x("");
            finderBroadcastEidClickStruct.v("");
            finderBroadcastEidClickStruct.s("more_page_star_live");
            finderBroadcastEidClickStruct.t(gVar.toString());
            finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            finderBroadcastEidClickStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
