package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ok extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rk f119306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(com.tencent.mm.plugin.finder.live.widget.rk rkVar) {
        super(0);
        this.f119306d = rkVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = this.f119306d;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = rkVar.f119654b;
        if (magicRewardView != null) {
            magicRewardView.setVisibility(0);
        }
        rkVar.f119655c = true;
        return jz5.f0.f302826a;
    }
}
