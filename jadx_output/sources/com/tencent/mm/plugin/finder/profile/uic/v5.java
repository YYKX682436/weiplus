package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class v5 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, in5.s sVar, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer) {
        super(sVar, dataBuffer, false);
        this.I = finderProfileFeedUIC;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = holder.getItemViewType() == com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.access$getFILTER_VIEW_TYPE$cp();
    }

    @Override // in5.n0, com.tencent.mm.ui.recyclerview.SynchronizedAdapter, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.onBindViewHolder(holder, i17, payloads);
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            if (zl2.q4.f473933a.C(baseFinderFeed)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "profile_live_room_card");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 26236);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                if (liveInfo != null) {
                    linkedHashMap.put("live_id", pm0.v.u(liveInfo.getLong(0)));
                }
                linkedHashMap.put("feed_id", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
                java.lang.String username = baseFinderFeed.getFeedObject().getFeedObject().getUsername();
                if (username == null) {
                    username = "";
                }
                linkedHashMap.put("finder_username", username);
                ml2.q1 q1Var = ml2.q1.f327812e;
                linkedHashMap.put("comment_scene", "temp_5");
                linkedHashMap.put("session_buffer", "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, linkedHashMap);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.profile.uic.u5(this.I, j5Var));
            }
        }
    }
}
