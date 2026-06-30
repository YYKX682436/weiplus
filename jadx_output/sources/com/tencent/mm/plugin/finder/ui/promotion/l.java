package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g61 f129670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f129671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.ui.promotion.t tVar, r45.g61 g61Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129669d = tVar;
        this.f129670e = g61Var;
        this.f129671f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.promotion.l(this.f129669d, this.f129670e, this.f129671f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.promotion.l lVar = (com.tencent.mm.plugin.finder.ui.promotion.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        final com.tencent.mm.plugin.finder.ui.promotion.t tVar = this.f129669d;
        final int i18 = 0;
        tVar.getRecyclerView().setVisibility(0);
        android.widget.FrameLayout frameLayout = tVar.f129685e;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        tVar.R6().setOnClickListener(null);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = tVar.f129690m;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
        boolean z17 = true;
        mMSwitchBtn.setEnabled(true);
        r45.g61 g61Var = this.f129670e;
        if (g61Var.getInteger(4) != 0) {
            android.widget.TextView textView = tVar.f129689i;
            if (textView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            textView.setText(tVar.getContext().getString(com.tencent.mm.R.string.f491306nk1, new java.lang.Integer(g61Var.getInteger(4))));
            android.widget.TextView textView2 = tVar.f129689i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = tVar.f129689i;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            textView3.setVisibility(8);
        }
        java.util.ArrayList arrayList = tVar.f129693p;
        arrayList.clear();
        arrayList.addAll(this.f129671f);
        if (arrayList.isEmpty()) {
            android.view.View view = tVar.f129687g;
            if (view == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout2 = tVar.f129685e;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout2.setVisibility(0);
            tVar.getRecyclerView().setVisibility(8);
            android.view.View view2 = tVar.f129686f;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.getRecyclerView().setVisibility(8);
            android.view.View R6 = tVar.R6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(R6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            int integer = g61Var.getInteger(4);
            int i19 = tVar.f129702y;
            if (integer < i19) {
                com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = tVar.getRecyclerView();
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i27 = a17.f197135a;
                if (!z17 && i27 > (i17 = a17.f197136b)) {
                    i27 = i17;
                }
                final int dimension = (int) ((i27 - tVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.akp)) / i19);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$getAdapter$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        if (type == com.tencent.mm.plugin.finder.ui.promotion.e.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.ui.promotion.g(dimension, tVar.f129695r);
                        }
                        hc2.l.a(pf5.o.TAG, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }, arrayList, false);
                tVar.f129692o = wxRecyclerAdapter;
                recyclerView.setAdapter(wxRecyclerAdapter);
                com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2 = tVar.getRecyclerView();
                final android.app.Activity context = tVar.getContext();
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$requestInit$1$1$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    /* renamed from: canScrollVertically */
                    public boolean getF123307r() {
                        return false;
                    }
                });
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView3 = tVar.getRecyclerView();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$getAdapter$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        if (type == com.tencent.mm.plugin.finder.ui.promotion.e.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.ui.promotion.g(i18, tVar.f129695r);
                        }
                        hc2.l.a(pf5.o.TAG, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }, arrayList, false);
                tVar.f129692o = wxRecyclerAdapter2;
                recyclerView3.setAdapter(wxRecyclerAdapter2);
                tVar.getRecyclerView().setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(tVar.getContext(), i19));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = tVar.f129692o;
            if (wxRecyclerAdapter3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter3.notifyDataSetChanged();
            com.tencent.mm.plugin.finder.ui.promotion.t.P6(tVar);
        }
        return jz5.f0.f302826a;
    }
}
