package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class yk implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f130070d;

    public yk(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        this.f130070d = finderWxProfileJumpDetailUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI = this.f130070d;
        java.lang.Object obj = finderWxProfileJumpDetailUI.f128799t.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.f(finderWxProfileJumpDetailUI, ((so2.i) obj).f410411d, ((java.lang.Number) ((jz5.n) finderWxProfileJumpDetailUI.f128802w).getValue()).intValue());
    }
}
