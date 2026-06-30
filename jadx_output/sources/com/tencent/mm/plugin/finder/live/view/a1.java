package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f116169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f116170f;

    public a1(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, r45.fa2 fa2Var, float f17) {
        this.f116168d = finderLiveAfterPluginRecommendLiveView;
        this.f116169e = fa2Var;
        this.f116170f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116168d.f115782e;
        r45.ea2 ea2Var = (r45.ea2) this.f116169e.f374129h.get(0);
        simpleLivingCardView.c(ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 0, this.f116170f);
    }
}
