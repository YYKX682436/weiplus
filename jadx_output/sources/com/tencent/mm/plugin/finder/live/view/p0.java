package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class p0 extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ea2 f116572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116573b;

    public p0(r45.ea2 ea2Var, com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        this.f116572a = ea2Var;
        this.f116573b = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) this.f116572a.getCustom(2);
        if (finderObject != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116573b;
            if (z17) {
                ml2.x1 x1Var = ml2.x1.f328217x;
                int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.f115780x;
                finderLiveAfterPluginRecommendLiveView.c(finderObject, x1Var, null);
                finderLiveAfterPluginRecommendLiveView.c(finderObject, ml2.x1.f328202f, null);
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exp_time", j19);
            ml2.x1 x1Var2 = ml2.x1.f328218y;
            int i18 = com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.f115780x;
            finderLiveAfterPluginRecommendLiveView.c(finderObject, x1Var2, jSONObject);
        }
    }
}
