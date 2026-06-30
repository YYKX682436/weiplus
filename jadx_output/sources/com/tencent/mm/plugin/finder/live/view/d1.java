package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f116239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f116240f;

    public d1(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, r45.fa2 fa2Var, float f17) {
        this.f116238d = finderLiveAfterPluginRecommendLiveView;
        this.f116239e = fa2Var;
        this.f116240f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116238d.f115785h;
        r45.ea2 ea2Var = (r45.ea2) this.f116239e.f374129h.get(3);
        simpleLivingCardView.c(ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 3, this.f116240f);
    }
}
