package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f116198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f116199f;

    public b1(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, r45.fa2 fa2Var, float f17) {
        this.f116197d = finderLiveAfterPluginRecommendLiveView;
        this.f116198e = fa2Var;
        this.f116199f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116197d.f115783f;
        r45.ea2 ea2Var = (r45.ea2) this.f116198e.f374129h.get(1);
        simpleLivingCardView.c(ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 1, this.f116199f);
    }
}
