package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ob extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI f129597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI finderMultiTaskRouterUI) {
        super(0);
        this.f129597d = finderMultiTaskRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI.f128642t;
        com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI finderMultiTaskRouterUI = this.f129597d;
        finderMultiTaskRouterUI.finish();
        finderMultiTaskRouterUI.overridePendingTransition(0, 0);
        return jz5.f0.f302826a;
    }
}
