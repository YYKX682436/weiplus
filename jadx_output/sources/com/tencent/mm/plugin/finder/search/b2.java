package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125627d;

    public b2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125627d = finderFeedSearchUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.U1;
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125627d;
            if (!finderFeedSearchUI.h7()) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int w17 = linearLayoutManager.w();
                int y17 = linearLayoutManager.y();
                if (finderFeedSearchUI.P1) {
                    w17 = y17;
                }
                if (w17 != -1 && itemCount - w17 <= 3) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord currentPos:" + w17 + " itemCount:" + itemCount);
                    int i19 = finderFeedSearchUI.f125551x;
                    finderFeedSearchUI.getClass();
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord  continueFlag：" + i19);
                    if (i19 == 1) {
                        java.lang.String str = finderFeedSearchUI.f125549v;
                        if (str != null) {
                            finderFeedSearchUI.x7(str, true);
                        }
                    } else if (finderFeedSearchUI.w7(true)) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "start Preload SearchNextHot loading");
                    } else if (finderFeedSearchUI.f125554y == 1) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "start preload SearchList loading");
                        if (!finderFeedSearchUI.g7(null, true)) {
                            finderFeedSearchUI.q7();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord nothing");
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int i19;
        android.view.View view;
        int i27;
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i28 = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.U1;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125627d;
        if (!finderFeedSearchUI.h7()) {
            finderFeedSearchUI.getClass();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            finderFeedSearchUI.P1 = !((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).getF98486n() ? i18 < 0 : i17 < 0;
            finderFeedSearchUI.getClass();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2;
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.getItemCount();
            }
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (finderFeedSearchUI.P1) {
                i27 = y17 - 1;
                i19 = y17 + 1;
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(y17);
                view = p07 != null ? p07.itemView : null;
            } else {
                int i29 = w17 + 1;
                i19 = w17 - 1;
                androidx.recyclerview.widget.k3 p08 = recyclerView.p0(w17);
                view = p08 != null ? p08.itemView : null;
                i27 = i29;
                y17 = w17;
            }
            if (view != null) {
                java.util.Iterator it = finderFeedSearchUI.T1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
                    if (findViewById != null && findViewById.getVisibility() == 0) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    boolean z19 = finderFeedSearchUI.P1;
                    java.lang.String k76 = finderFeedSearchUI.k7(i19);
                    if (z19) {
                        if (k76 != null) {
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.me9);
                            if (weImageView != null) {
                                weImageView.setRotation(0.0f);
                            }
                            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.me_);
                            if (textView != null) {
                                textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.f2x, "\"" + k76 + '\"'));
                            }
                        }
                    } else if (k76 != null) {
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.me9);
                        if (weImageView2 != null) {
                            weImageView2.setRotation(180.0f);
                        }
                        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.me_);
                        if (textView2 != null) {
                            textView2.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.f2y, "\"" + k76 + '\"'));
                        }
                    }
                } else {
                    boolean z27 = finderFeedSearchUI.P1;
                    java.util.Iterator it6 = finderFeedSearchUI.Q1.entrySet().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z18 = false;
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                        int intValue = ((java.lang.Number) entry.getKey()).intValue();
                        if (i27 == intValue) {
                            z18 = true;
                            break;
                        }
                    }
                    if (z18) {
                        i27 = z27 ? i27 - 1 : i27 + 1;
                    }
                    java.lang.String k77 = finderFeedSearchUI.k7(i27);
                    java.lang.String k78 = finderFeedSearchUI.k7(y17);
                    if (!android.text.TextUtils.isEmpty(k77) && !android.text.TextUtils.isEmpty(k78) && !android.text.TextUtils.equals(k77, k78) && !android.text.TextUtils.equals(finderFeedSearchUI.S1, k78)) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        view.getGlobalVisibleRect(rect);
                        if (((double) rect.height()) > ((double) view.getHeight()) * 0.5d) {
                            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderFeedSearchUI.f125547t;
                            if (fTSSearchView == null) {
                                kotlin.jvm.internal.o.o("searchView");
                                throw null;
                            }
                            java.lang.String string = fTSSearchView.getContext().getResources().getString(com.tencent.mm.R.string.f2v, "\"" + k78 + '\"');
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            finderFeedSearchUI.s7(string);
                            view.performHapticFeedback(0, 3);
                            com.tencent.mm.plugin.finder.search.u4 u4Var = finderFeedSearchUI.W;
                            if (u4Var == null) {
                                kotlin.jvm.internal.o.o("searchSuggestionManager");
                                throw null;
                            }
                            u4Var.f125891l = k78 == null ? "" : k78;
                            com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = finderFeedSearchUI.f125547t;
                            if (fTSSearchView2 == null) {
                                kotlin.jvm.internal.o.o("searchView");
                                throw null;
                            }
                            fTSSearchView2.getFtsEditText().q(k78, null, true);
                            com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = finderFeedSearchUI.f125547t;
                            if (fTSSearchView3 == null) {
                                kotlin.jvm.internal.o.o("searchView");
                                throw null;
                            }
                            java.lang.String string2 = fTSSearchView3.getContext().getResources().getString(com.tencent.mm.R.string.f2v, "\"" + k78 + '\"');
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            finderFeedSearchUI.s7(string2);
                            if (k78 == null) {
                                k78 = "";
                            }
                            finderFeedSearchUI.S1 = k78;
                            finderFeedSearchUI.m7(k78);
                        }
                    }
                }
            }
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, recyclerView, ml2.x1.f328202f, "6", ml2.y.f328239d, 0, 0L, 0, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
