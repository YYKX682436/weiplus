package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d8 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f118086d;

    public d8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f118086d = i8Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f118086d;
            i8Var.W = true;
            com.tencent.mm.plugin.finder.live.widget.r7 r7Var = i8Var.N;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = r7Var != null ? r7Var.f119584e : null;
            if (wxRecyclerView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                wxRecyclerView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = i8Var.L;
            if (mMProcessBar != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mMProcessBar, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMProcessBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.google.android.material.tabs.TabLayout tabLayout = i8Var.P;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(tabLayout, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tabLayout.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.viewpager.widget.ViewPager viewPager = i8Var.Q;
            if (viewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(viewPager, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewPager.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = i8Var.R;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("divider");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = i8Var.S;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvCancel");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(textView, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i17 = 0;
            for (java.lang.Object obj : i8Var.X) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((te2.u1) obj).getMusicRv().setNestedScrollingEnabled(false);
                i17 = i18;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 3);
            sf2.e0 e0Var = i8Var.H;
            if (!kotlin.jvm.internal.o.b(e0Var.f407115q, "")) {
                jSONObject.put("ai_msg_id", e0Var.f407115q);
            }
            if (dk2.ef.f233372a.x()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 48L, jSONObject.toString(), null, 4, null);
            }
        }
    }
}
