package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f135194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f135196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qp f135197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135198i;

    public mp(int i17, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, com.tencent.mm.plugin.finder.viewmodel.component.qp qpVar, in5.s0 s0Var) {
        this.f135193d = i17;
        this.f135194e = mMRoundCornerImageView;
        this.f135195f = baseFinderFeed;
        this.f135196g = finderCommentInfo;
        this.f135197h = qpVar;
        this.f135198i = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC$bindData$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("image_comment_carousel imageView clicked, idx=");
        int i18 = this.f135193d;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", sb6.toString());
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f135194e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135195f;
        jz5.l lVar = new jz5.l("feedid", pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f135196g;
        jz5.l lVar2 = new jz5.l("comment_id", pm0.v.u(finderCommentInfo.getCommentId()));
        jz5.l lVar3 = new jz5.l("comment_cnt", java.lang.Integer.valueOf(baseFinderFeed.getFeedObject().getCommentCount()));
        boolean z18 = true;
        hc2.v0.d(mMRoundCornerImageView, "image_comment_carousel", "view_clk", false, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("card_idex", java.lang.Integer.valueOf(i18 + 1))), null, 20, null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f135195f;
        long commentId = finderCommentInfo.getCommentId();
        this.f135197h.getClass();
        in5.s0 s0Var = this.f135198i;
        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        in5.r w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", "jumpFinderComment commentId=" + pm0.v.u(commentId) + ",fullConvert=" + w07);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.convert.qe qeVar = w07 instanceof com.tencent.mm.plugin.finder.convert.qe ? (com.tencent.mm.plugin.finder.convert.qe) w07 : null;
            if (qeVar != null) {
                android.content.Context context = s0Var.f293121e;
                int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
                android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                int i19 = b17.x;
                int i27 = b17.y;
                java.lang.System.nanoTime();
                if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                    z18 = false;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z18) {
                    i17 = i27 - c17;
                } else {
                    if (i27 >= i19) {
                        i19 = i27;
                    }
                    i17 = i19 - c17;
                }
                com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, s0Var, baseFinderFeed2, false, commentId, null, 0, 5, false, 1500L, (int) (i17 * kx2.a.f313278a.a(context)), 1, 180, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC$bindData$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
