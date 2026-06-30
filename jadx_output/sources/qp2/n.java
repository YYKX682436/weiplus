package qp2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365793d;

    public n(qp2.y yVar) {
        this.f365793d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qp2.y yVar = this.f365793d;
        androidx.fragment.app.Fragment fragment = yVar.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        pf5.z zVar = pf5.z.f353948a;
        java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if (str2 == null) {
            str2 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str2);
        intent.putExtra("key_click_tab_context_id", ip2.a.f293614c);
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment P6 = yVar.P6();
        if (P6 == null || (str = P6.s0()) == null) {
            str = "";
        }
        intent.putExtra("key_click_sub_tab_context_id", str);
        new jp2.a(yVar.getActivity()).a(intent);
        androidx.fragment.app.Fragment fragment2 = yVar.getFragment();
        if (fragment2 != null) {
            cl0.g gVar = new cl0.g();
            com.google.android.material.tabs.TabLayout R6 = yVar.R6();
            int selectedTabPosition = R6 != null ? R6.getSelectedTabPosition() : 0;
            com.google.android.material.tabs.TabLayout R62 = yVar.R6();
            java.lang.Object obj = (R62 == null || (k17 = R62.k(selectedTabPosition)) == null) ? null : k17.f343778a;
            qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
            gVar.s("tab_id", java.lang.Integer.valueOf(iVar != null ? iVar.f365786c : 0));
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f1584l;
            if (str3 == null) {
                str3 = "";
            }
            finderBroadcastEidClickStruct.q(str3);
            finderBroadcastEidClickStruct.A("");
            finderBroadcastEidClickStruct.x("");
            finderBroadcastEidClickStruct.v("");
            finderBroadcastEidClickStruct.s("more_page_search");
            finderBroadcastEidClickStruct.t(gVar.toString());
            finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            finderBroadcastEidClickStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
