package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sh extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public float f135901d = 100.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f135902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.th f135903f;

    public sh(com.tencent.mm.plugin.finder.viewmodel.component.th thVar) {
        this.f135903f = thVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        android.view.View view;
        java.util.List data;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.viewmodel.component.th thVar = this.f135903f;
        if (i17 == 0) {
            int i18 = -1;
            if (thVar.f136026e == null && !thVar.f136028g && thVar.f136031m != null) {
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                    java.util.Iterator it = data.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        in5.c cVar = (in5.c) it.next();
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = thVar.f136031m;
                        if (baseFinderFeed != null && cVar.getItemId() == baseFinderFeed.getItemId()) {
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 >= 0) {
                    androidx.recyclerview.widget.k3 p07 = recyclerView.p0(i18);
                    thVar.f136026e = (p07 == null || (view = p07.itemView) == null) ? null : view.findViewById(com.tencent.mm.R.id.gvs);
                    android.view.View view2 = thVar.f136026e;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (thVar.f136030i) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = thVar.f136031m;
                if (baseFinderFeed2 != null && baseFinderFeed2.getIsShowGuideTips() == 1) {
                    android.view.View view3 = thVar.f136026e;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    thVar.getClass();
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t() == 1) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, java.lang.Boolean.TRUE);
                    }
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = thVar.f136031m;
                if (baseFinderFeed3 != null) {
                    baseFinderFeed3.U1(-1);
                }
            }
            this.f135902e = false;
        } else if (thVar.f136026e != null && i17 == 1) {
            thVar.f136030i = true;
            this.f135902e = true;
        }
        if (i17 == 1) {
            thVar.f136032n.removeCallbacksAndMessages(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        android.view.View view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (this.f135902e && (view = this.f135903f.f136026e) != null) {
            float f17 = this.f135901d - (i18 / 5.0f);
            this.f135901d = f17;
            float a17 = h3.a.a(f17, 0.0f, 100.0f);
            this.f135901d = a17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(a17 / 100.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
