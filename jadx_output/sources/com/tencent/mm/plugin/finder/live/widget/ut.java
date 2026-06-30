package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ut {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView f119999a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.oo0 f120000b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f120001c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f120002d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f120003e;

    public ut(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView root, com.tencent.mm.plugin.finder.live.plugin.oo0 plugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f119999a = root;
        this.f120000b = plugin;
        this.f120001c = "FinderLiveRecommendVideoWidget";
        this.f120002d = kz5.p0.f313996d;
    }

    public static final void b(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.widget.ut utVar, mn2.h3 h3Var) {
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(h3Var, g1Var.h(mn2.f1.f329953d));
        com.tencent.mm.plugin.finder.live.widget.st stVar = new com.tencent.mm.plugin.finder.live.widget.st(utVar);
        b17.getClass();
        b17.f447873d = stVar;
        b17.c(imageView);
    }

    public final boolean a(java.util.List videoList, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(videoList, "videoList");
        boolean isEmpty = videoList.isEmpty();
        int i17 = 0;
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView finderLiveAfterRecommendPanelView = this.f119999a;
        int i18 = 1;
        if (isEmpty || finderLiveAfterRecommendPanelView.getVisibility() == 0) {
            return finderLiveAfterRecommendPanelView.getVisibility() == 0;
        }
        this.f120002d = videoList;
        this.f120003e = gVar;
        if (videoList.isEmpty() || finderLiveAfterRecommendPanelView.getVisibility() == 0) {
            return true;
        }
        finderLiveAfterRecommendPanelView.getTitleView().setText(finderLiveAfterRecommendPanelView.getContext().getString(com.tencent.mm.R.string.d3a));
        finderLiveAfterRecommendPanelView.getJumpBtnText().setText(finderLiveAfterRecommendPanelView.getContext().getString(com.tencent.mm.R.string.ehi));
        finderLiveAfterRecommendPanelView.getJumpBtn().setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.tt(this));
        c(0);
        java.util.List list = this.f120002d;
        com.tencent.mm.protobuf.g gVar2 = this.f120003e;
        android.content.Context context = finderLiveAfterRecommendPanelView.getContext();
        int i19 = 0;
        for (java.lang.Object obj : list) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
            if (i19 < 3 && !finderItem.getMediaList().isEmpty()) {
                android.view.ViewGroup cardThree = i19 != 0 ? i19 != i18 ? finderLiveAfterRecommendPanelView.getCardThree() : finderLiveAfterRecommendPanelView.getCardTwo() : finderLiveAfterRecommendPanelView.getCardOne();
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(finderItem.getMediaList());
                if (mb4Var == null) {
                    return true;
                }
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ala, (android.view.ViewGroup) null);
                inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu), (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479668c5)));
                cardThree.removeAllViews();
                cardThree.addView(inflate);
                cardThree.setVisibility(i17);
                cardThree.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.qt(this, list, i19, gVar2, cardThree, finderItem));
                android.view.View findViewById = cardThree.findViewById(com.tencent.mm.R.id.cl6);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
                android.view.View findViewById2 = cardThree.findViewById(com.tencent.mm.R.id.i1g);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                ((android.widget.TextView) findViewById2).setText(com.tencent.mm.plugin.finder.assist.w2.g(1, finderItem.getLikeCount()));
                if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
                    b(imageView, this, new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null));
                } else {
                    b(imageView, this, new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null));
                }
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                java.lang.String u17 = pm0.v.u(finderItem.getFeedObject().getId());
                r0Var.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("page_id", "1002");
                hashMap.put("feed_id", u17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.D1, hashMap, null, null, null, null, false, 124, null);
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", feed_id = " + ((java.lang.String) hashMap.get("feed_id")));
            }
            i19 = i27;
            i17 = 0;
            i18 = 1;
        }
        return true;
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView finderLiveAfterRecommendPanelView = this.f119999a;
        finderLiveAfterRecommendPanelView.setVisibility(i17);
        android.content.Context context = finderLiveAfterRecommendPanelView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            finderLiveAfterRecommendPanelView.setVisibility(8);
        }
    }
}
