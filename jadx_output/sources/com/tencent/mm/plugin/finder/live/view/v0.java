package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116725d;

    public v0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        this.f116725d = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.fa2 fa2Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        c50.m0 m0Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        c50.m0 m0Var2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        c50.m0 m0Var3;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject4;
        c50.m0 m0Var4;
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116725d;
        if (finderLiveAfterPluginRecommendLiveView.isShown() && (fa2Var = finderLiveAfterPluginRecommendLiveView.f115791q) != null) {
            java.util.LinkedList card_list = fa2Var.f374129h;
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var = (r45.ea2) kz5.n0.a0(card_list, 0);
            if (ea2Var != null && (finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2)) != null && (m0Var4 = finderLiveAfterPluginRecommendLiveView.f115795u) != null) {
                c50.m0.a(m0Var4, finderObject4, finderLiveAfterPluginRecommendLiveView.f115782e, null, null, null, false, 60, null);
            }
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var2 = (r45.ea2) kz5.n0.a0(card_list, 1);
            if (ea2Var2 != null && (finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var2.getCustom(2)) != null && (m0Var3 = finderLiveAfterPluginRecommendLiveView.f115795u) != null) {
                c50.m0.a(m0Var3, finderObject3, finderLiveAfterPluginRecommendLiveView.f115783f, null, null, null, false, 60, null);
            }
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var3 = (r45.ea2) kz5.n0.a0(card_list, 2);
            if (ea2Var3 != null && (finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var3.getCustom(2)) != null && (m0Var2 = finderLiveAfterPluginRecommendLiveView.f115795u) != null) {
                c50.m0.a(m0Var2, finderObject2, finderLiveAfterPluginRecommendLiveView.f115784g, null, null, null, false, 60, null);
            }
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var4 = (r45.ea2) kz5.n0.a0(card_list, 3);
            if (ea2Var4 == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var4.getCustom(2)) == null || (m0Var = finderLiveAfterPluginRecommendLiveView.f115795u) == null) {
                return;
            }
            c50.m0.a(m0Var, finderObject, finderLiveAfterPluginRecommendLiveView.f115785h, null, null, null, false, 60, null);
        }
    }
}
