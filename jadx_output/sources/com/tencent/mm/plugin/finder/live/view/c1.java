package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f116222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f116223f;

    public c1(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, r45.fa2 fa2Var, float f17) {
        this.f116221d = finderLiveAfterPluginRecommendLiveView;
        this.f116222e = fa2Var;
        this.f116223f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116221d.f115784g;
        r45.ea2 ea2Var = (r45.ea2) this.f116222e.f374129h.get(2);
        simpleLivingCardView.c(ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 2, this.f116223f);
    }
}
