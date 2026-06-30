package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.v5 f124316e;

    public w5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, com.tencent.mm.plugin.finder.profile.uic.v5 v5Var) {
        this.f124315d = finderProfileFeedUIC;
        this.f124316e = v5Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        org.json.JSONObject jSONObject = null;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124315d;
        if (baseFinderFeed != null) {
            jSONObject = baseFinderFeed.e2();
            jSONObject.put("tab_seat", com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.f123413t.a(finderProfileFeedUIC.getContext(), baseFinderFeed.getFeedObject().getProfileTabScene()));
            androidx.appcompat.app.AppCompatActivity activity = finderProfileFeedUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int i18 = 1;
            if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) != 1 && activity.getIntent().getIntExtra("key_enter_profile_type", 0) != 11) {
                i18 = activity.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3;
            }
            jSONObject.put("enter_profile_method", i18);
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC2 = this.f124315d;
        feedLoader = finderProfileFeedUIC2.getFeedLoader();
        com.tencent.mm.plugin.finder.profile.uic.v5 v5Var = this.f124316e;
        int a07 = v5Var.a0();
        androidx.recyclerview.widget.RecyclerView b07 = v5Var.b0();
        feedLoader2 = finderProfileFeedUIC.getFeedLoader();
        finderProfileFeedUIC2.onClickFeed(feedLoader, j5Var, i17, holder, a07, b07, feedLoader2.getDataListJustForAdapter(), jSONObject, 2);
    }
}
