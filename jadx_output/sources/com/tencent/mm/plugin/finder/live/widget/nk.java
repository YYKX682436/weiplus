package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rk f119191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(com.tencent.mm.plugin.finder.live.widget.rk rkVar) {
        super(0);
        this.f119191d = rkVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView;
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = this.f119191d;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView2 = rkVar.f119654b;
        if (magicRewardView2 != null) {
            magicRewardView2.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView3 = rkVar.f119654b;
        if (magicRewardView3 != null) {
            magicRewardView3.h();
        }
        if (!zl2.r4.f473950a.w1() && (magicRewardView = rkVar.f119654b) != null) {
            magicRewardView.setClickable(true);
        }
        return jz5.f0.f302826a;
    }
}
