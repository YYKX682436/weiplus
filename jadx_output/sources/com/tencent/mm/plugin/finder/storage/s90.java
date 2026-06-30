package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class s90 extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f127534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127535b;

    public s90(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f127534a = context;
        this.f127535b = 2;
    }

    public static final void f(com.tencent.mm.plugin.finder.storage.s90 s90Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        s90Var.getClass();
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.eig);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.i1n);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.i1g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String recommendReason = baseFinderFeed.getFeedObject().getFeedObject().getRecommendReason();
        if (recommendReason == null) {
            recommendReason = "";
        }
        textView.setText(recommendReason);
        int recommendReasonType = baseFinderFeed.getFeedObject().getFeedObject().getRecommendReasonType();
        android.content.Context context = s0Var.f293121e;
        if (recommendReasonType != 1) {
            switch (recommendReasonType) {
                case 9:
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_me, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView.setVisibility(0);
                    break;
                case 10:
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_topic, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView.setVisibility(0);
                    break;
                case 11:
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_sight, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView.setVisibility(0);
                    break;
                case 12:
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_filled_fire, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView.setVisibility(0);
                    break;
                case 13:
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_food, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView.setVisibility(0);
                    break;
            }
        } else {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p17, arrayList7.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_location, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
            imageView.setVisibility(0);
        }
        if (baseFinderFeed.getFeedObject().isLiveFeed()) {
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            if (!(liveInfo != null && liveInfo.getInteger(2) == 1)) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p17, arrayList8.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
            int integer = liveInfo2 != null ? liveInfo2.getInteger(10) : 0;
            if (integer <= 0) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(p17, arrayList9.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(p17, arrayList10.toArray(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            textView.setText(context.getString(com.tencent.mm.R.string.dtv, com.tencent.mm.plugin.finder.assist.w2.g(2, integer)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.storage.r90();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(this.f127535b, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257457f;
    }
}
