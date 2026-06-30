package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class al extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f128868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f128869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f128870c;

    public al(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f128868a = finderWxProfileJumpDetailUI;
        this.f128869b = h0Var;
        this.f128870c = refreshLoadMoreLayout;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI = this.f128868a;
        int intValue = ((java.lang.Number) ((jz5.n) finderWxProfileJumpDetailUI.f128802w).getValue()).intValue();
        int intValue2 = ((java.lang.Number) ((jz5.n) finderWxProfileJumpDetailUI.f128800u).getValue()).intValue();
        androidx.appcompat.app.AppCompatActivity context = finderWxProfileJumpDetailUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String str = (java.lang.String) ((jz5.n) finderWxProfileJumpDetailUI.f128803x).getValue();
        kotlin.jvm.internal.o.f(str, "<get-reqUsername>(...)");
        kotlin.jvm.internal.h0 h0Var = this.f128869b;
        new bq.a(intValue, intValue2, e17, str, (com.tencent.mm.protobuf.g) h0Var.f310123d).l().K(new com.tencent.mm.plugin.finder.ui.zk(h0Var, finderWxProfileJumpDetailUI, this.f128870c));
    }
}
