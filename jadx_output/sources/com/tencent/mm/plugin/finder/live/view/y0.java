package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.v2 f116813e;

    public y0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, so2.v2 v2Var) {
        this.f116812d = finderLiveAfterPluginRecommendLiveView;
        this.f116813e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protobuf.g byteString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.f115780x;
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116812d;
        finderLiveAfterPluginRecommendLiveView.getClass();
        android.content.Intent intent = new android.content.Intent();
        so2.v2 v2Var = this.f116813e;
        intent.putExtra("nearby_live_enter_from_live_end_liveid_key", pm0.v.u(v2Var.f410659n.getLong(0)));
        ws5.j[] jVarArr = ws5.j.f449218d;
        intent.putExtra("nearby_live_enter_source_params_key", 6);
        intent.putExtra("nearby_live_disable_clean_red_params_key", true);
        intent.putExtra("nearby_live_preload_cache_business_params_key", "liveEndPage");
        intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
        r45.la2 la2Var = v2Var.f410667v;
        if (la2Var != null && (byteString = la2Var.getByteString(2)) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", byteString.g());
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Context context = finderLiveAfterPluginRecommendLiveView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((v40.s) nVar).wi(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
