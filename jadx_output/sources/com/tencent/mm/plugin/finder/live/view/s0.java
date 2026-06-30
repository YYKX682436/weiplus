package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        super(1);
        this.f116665d = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "player onListCallback start");
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.f115780x;
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116665d;
        finderLiveAfterPluginRecommendLiveView.getClass();
        finderLiveAfterPluginRecommendLiveView.c(it, ml2.x1.f328215v, null);
        return jz5.f0.f302826a;
    }
}
